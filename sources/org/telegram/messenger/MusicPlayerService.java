package org.telegram.messenger;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.media.RemoteControlClient;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import android.widget.RemoteViews;
import java.io.File;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$FileLocation;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AvatarDrawable;
public class MusicPlayerService extends Service implements NotificationCenter.NotificationCenterDelegate {
    private static final int ID_NOTIFICATION = 5;
    public static final String NOTIFY_CLOSE = "org.telegram.android.musicplayer.close";
    public static final String NOTIFY_NEXT = "org.telegram.android.musicplayer.next";
    public static final String NOTIFY_PAUSE = "org.telegram.android.musicplayer.pause";
    public static final String NOTIFY_PLAY = "org.telegram.android.musicplayer.play";
    public static final String NOTIFY_PREVIOUS = "org.telegram.android.musicplayer.previous";
    public static final String NOTIFY_SEEK = "org.telegram.android.musicplayer.seek";
    private static boolean supportBigNotifications;
    private static boolean supportLockScreenControls;
    private Bitmap albumArtPlaceholder;
    private AudioManager audioManager;
    private boolean foregroundServiceIsStarted;
    private BroadcastReceiver headsetPlugReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                MediaController.getInstance().lambda$startAudioAgain$7(MediaController.getInstance().getPlayingMessageObject());
            }
        }
    };
    private ImageReceiver imageReceiver;
    private String loadingFilePath;
    private MediaSession mediaSession;
    private int notificationMessageID;
    private PlaybackState.Builder playbackState;
    private RemoteControlClient remoteControlClient;

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = true;
        supportBigNotifications = i >= 16;
        if (i >= 21 && TextUtils.isEmpty(AndroidUtilities.getSystemProperty("ro.miui.ui.version.code"))) {
            z = false;
        }
        supportLockScreenControls = z;
    }

    @Override
    public void onCreate() {
        this.audioManager = (AudioManager) getSystemService("audio");
        for (int i = 0; i < 4; i++) {
            NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.messagePlayingDidSeek);
            NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
            NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.httpFileDidLoad);
            NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.fileLoaded);
        }
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.imageReceiver = imageReceiver;
        imageReceiver.setDelegate(new ImageReceiver.ImageReceiverDelegate() {
            @Override
            public final void didSetImage(ImageReceiver imageReceiver2, boolean z, boolean z2, boolean z3) {
                MusicPlayerService.this.lambda$onCreate$0(imageReceiver2, z, z2, z3);
            }

            @Override
            public void didSetImageBitmap(int i2, String str, Drawable drawable) {
                ImageReceiver.ImageReceiverDelegate.CC.$default$didSetImageBitmap(this, i2, str, drawable);
            }

            @Override
            public void onAnimationReady(ImageReceiver imageReceiver2) {
                ImageReceiver.ImageReceiverDelegate.CC.$default$onAnimationReady(this, imageReceiver2);
            }
        });
        if (Build.VERSION.SDK_INT >= 21) {
            this.mediaSession = new MediaSession(this, "telegramAudioPlayer");
            this.playbackState = new PlaybackState.Builder();
            this.albumArtPlaceholder = Bitmap.createBitmap(AndroidUtilities.dp(102.0f), AndroidUtilities.dp(102.0f), Bitmap.Config.ARGB_8888);
            Drawable drawable = getResources().getDrawable(R.drawable.nocover_big);
            drawable.setBounds(0, 0, this.albumArtPlaceholder.getWidth(), this.albumArtPlaceholder.getHeight());
            drawable.draw(new Canvas(this.albumArtPlaceholder));
            this.mediaSession.setCallback(new MediaSession.Callback() {
                @Override
                public void onStop() {
                }

                @Override
                public void onPlay() {
                    MediaController.getInstance().playMessage(MediaController.getInstance().getPlayingMessageObject());
                }

                @Override
                public void onPause() {
                    MediaController.getInstance().lambda$startAudioAgain$7(MediaController.getInstance().getPlayingMessageObject());
                }

                @Override
                public void onSkipToNext() {
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (playingMessageObject == null || !playingMessageObject.isMusic()) {
                        return;
                    }
                    MediaController.getInstance().playNextMessage();
                }

                @Override
                public void onSkipToPrevious() {
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (playingMessageObject == null || !playingMessageObject.isMusic()) {
                        return;
                    }
                    MediaController.getInstance().playPreviousMessage();
                }

                @Override
                public void onSeekTo(long j) {
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (playingMessageObject != null) {
                        MediaController.getInstance().seekToProgress(playingMessageObject, ((float) (j / 1000)) / ((float) playingMessageObject.getDuration()));
                        MusicPlayerService.this.updatePlaybackState(j);
                    }
                }
            });
            this.mediaSession.setActive(true);
        }
        registerReceiver(this.headsetPlugReceiver, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
        super.onCreate();
    }

    public void lambda$onCreate$0(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        if (!z || TextUtils.isEmpty(this.loadingFilePath)) {
            return;
        }
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null) {
            createNotification(playingMessageObject, true);
        }
        this.loadingFilePath = null;
    }

    @Override
    @SuppressLint({"NewApi"})
    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null) {
            try {
                if ((getPackageName() + ".STOP_PLAYER").equals(intent.getAction())) {
                    MediaController.getInstance().cleanupPlayer(true, true);
                    return 2;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MusicPlayerService.this.stopSelf();
                }
            });
            return 1;
        }
        if (supportLockScreenControls) {
            ComponentName componentName = new ComponentName(getApplicationContext(), MusicPlayerReceiver.class.getName());
            try {
                if (this.remoteControlClient == null) {
                    this.audioManager.registerMediaButtonEventReceiver(componentName);
                    Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
                    intent2.setComponent(componentName);
                    RemoteControlClient remoteControlClient = new RemoteControlClient(PendingIntent.getBroadcast(this, 0, intent2, fixIntentFlags(33554432)));
                    this.remoteControlClient = remoteControlClient;
                    this.audioManager.registerRemoteControlClient(remoteControlClient);
                }
                this.remoteControlClient.setTransportControlFlags(189);
            } catch (Exception e2) {
                FileLog.e(e2);
            }
        }
        createNotification(playingMessageObject, false);
        return 1;
    }

    private Bitmap loadArtworkFromUrl(String str, boolean z, boolean z2) {
        ImageLoader.getHttpFileName(str);
        File httpFilePath = ImageLoader.getHttpFilePath(str, "jpg");
        if (httpFilePath.exists()) {
            return ImageLoader.loadBitmap(httpFilePath.getAbsolutePath(), null, z ? 600.0f : 100.0f, z ? 600.0f : 100.0f, false);
        }
        if (z2) {
            this.loadingFilePath = httpFilePath.getAbsolutePath();
            if (!z) {
                this.imageReceiver.setImage(str, "48_48", null, null, 0L);
            }
        } else {
            this.loadingFilePath = null;
        }
        return null;
    }

    private Bitmap getAvatarBitmap(TLObject tLObject, boolean z, boolean z2) {
        AvatarDrawable avatarDrawable;
        int i = z ? 600 : 100;
        try {
            if (tLObject instanceof TLRPC$User) {
                TLRPC$User tLRPC$User = (TLRPC$User) tLObject;
                TLRPC$FileLocation tLRPC$FileLocation = z ? tLRPC$User.photo.photo_big : tLRPC$User.photo.photo_small;
                if (tLRPC$FileLocation != null) {
                    File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(tLRPC$FileLocation, true);
                    if (pathToAttach.exists()) {
                        float f = i;
                        return ImageLoader.loadBitmap(pathToAttach.getAbsolutePath(), null, f, f, false);
                    } else if (z) {
                        if (z2) {
                            this.loadingFilePath = FileLoader.getAttachFileName(tLRPC$FileLocation);
                            this.imageReceiver.setImage(ImageLocation.getForUser(tLRPC$User, 0), "", null, null, null, 0);
                        } else {
                            this.loadingFilePath = null;
                        }
                    }
                }
            } else {
                TLRPC$Chat tLRPC$Chat = (TLRPC$Chat) tLObject;
                TLRPC$FileLocation tLRPC$FileLocation2 = z ? tLRPC$Chat.photo.photo_big : tLRPC$Chat.photo.photo_small;
                if (tLRPC$FileLocation2 != null) {
                    File pathToAttach2 = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(tLRPC$FileLocation2, true);
                    if (pathToAttach2.exists()) {
                        float f2 = i;
                        return ImageLoader.loadBitmap(pathToAttach2.getAbsolutePath(), null, f2, f2, false);
                    } else if (z) {
                        if (z2) {
                            this.loadingFilePath = FileLoader.getAttachFileName(tLRPC$FileLocation2);
                            this.imageReceiver.setImage(ImageLocation.getForChat(tLRPC$Chat, 0), "", null, null, null, 0);
                        } else {
                            this.loadingFilePath = null;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            FileLog.e(th);
        }
        if (z) {
            return null;
        }
        Theme.createDialogsResources(this);
        if (tLObject instanceof TLRPC$User) {
            avatarDrawable = new AvatarDrawable((TLRPC$User) tLObject);
        } else {
            avatarDrawable = new AvatarDrawable((TLRPC$Chat) tLObject);
        }
        avatarDrawable.setRoundRadius(1);
        float f3 = i;
        Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.dp(f3), AndroidUtilities.dp(f3), Bitmap.Config.ARGB_8888);
        avatarDrawable.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
        avatarDrawable.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    @android.annotation.SuppressLint({"NewApi"})
    private void createNotification(org.telegram.messenger.MessageObject r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MusicPlayerService.createNotification(org.telegram.messenger.MessageObject, boolean):void");
    }

    public void updatePlaybackState(long j) {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        boolean z = !MediaController.getInstance().isMessagePaused();
        if (MediaController.getInstance().isDownloadingCurrentMessage()) {
            this.playbackState.setState(6, 0L, 1.0f).setActions(0L);
        } else {
            long j2 = 774;
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject != null && playingMessageObject.isMusic()) {
                j2 = 822;
            }
            this.playbackState.setState(z ? 3 : 2, j, getPlaybackSpeed(z, playingMessageObject)).setActions(j2);
        }
        this.mediaSession.setPlaybackState(this.playbackState.build());
    }

    private float getPlaybackSpeed(boolean z, MessageObject messageObject) {
        if (z) {
            if (messageObject != null) {
                if (messageObject.isVoice() || messageObject.isRoundVideo()) {
                    return MediaController.getInstance().getPlaybackSpeed(false);
                }
                return 1.0f;
            }
            return 1.0f;
        }
        return 0.0f;
    }

    public void setListeners(RemoteViews remoteViews) {
        remoteViews.setOnClickPendingIntent(R.id.player_previous, PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent("org.telegram.android.musicplayer.previous"), fixIntentFlags(167772160)));
        remoteViews.setOnClickPendingIntent(R.id.player_close, PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent("org.telegram.android.musicplayer.close"), fixIntentFlags(167772160)));
        remoteViews.setOnClickPendingIntent(R.id.player_pause, PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent("org.telegram.android.musicplayer.pause"), fixIntentFlags(167772160)));
        remoteViews.setOnClickPendingIntent(R.id.player_next, PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent("org.telegram.android.musicplayer.next"), fixIntentFlags(167772160)));
        remoteViews.setOnClickPendingIntent(R.id.player_play, PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent("org.telegram.android.musicplayer.play"), fixIntentFlags(167772160)));
    }

    private int fixIntentFlags(int i) {
        return (Build.VERSION.SDK_INT >= 31 || !XiaomiUtilities.isMIUI()) ? i : i & (-100663297);
    }

    @Override
    @SuppressLint({"NewApi"})
    public void onDestroy() {
        unregisterReceiver(this.headsetPlugReceiver);
        super.onDestroy();
        stopForeground(true);
        RemoteControlClient remoteControlClient = this.remoteControlClient;
        if (remoteControlClient != null) {
            RemoteControlClient.MetadataEditor editMetadata = remoteControlClient.editMetadata(true);
            editMetadata.clear();
            editMetadata.apply();
            this.audioManager.unregisterRemoteControlClient(this.remoteControlClient);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.mediaSession.release();
        }
        for (int i = 0; i < 4; i++) {
            NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.messagePlayingDidSeek);
            NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
            NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.httpFileDidLoad);
            NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.fileLoaded);
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        String str;
        String str2;
        if (i == NotificationCenter.messagePlayingPlayStateChanged) {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject != null) {
                createNotification(playingMessageObject, false);
            } else {
                stopSelf();
            }
        } else if (i == NotificationCenter.messagePlayingDidSeek) {
            MessageObject playingMessageObject2 = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject2 == null) {
                return;
            }
            long round = Math.round(playingMessageObject2.audioPlayerDuration * ((Float) objArr[1]).floatValue()) * 1000;
            updatePlaybackState(round);
            RemoteControlClient remoteControlClient = this.remoteControlClient;
            if (remoteControlClient == null || Build.VERSION.SDK_INT < 18) {
                return;
            }
            remoteControlClient.setPlaybackState(MediaController.getInstance().isMessagePaused() ? 2 : 3, round, MediaController.getInstance().isMessagePaused() ? 0.0f : 1.0f);
        } else if (i == NotificationCenter.httpFileDidLoad) {
            String str3 = (String) objArr[0];
            MessageObject playingMessageObject3 = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject3 == null || (str2 = this.loadingFilePath) == null || !str2.equals(str3)) {
                return;
            }
            createNotification(playingMessageObject3, false);
        } else if (i == NotificationCenter.fileLoaded) {
            String str4 = (String) objArr[0];
            MessageObject playingMessageObject4 = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject4 == null || (str = this.loadingFilePath) == null || !str.equals(str4)) {
                return;
            }
            createNotification(playingMessageObject4, false);
        }
    }
}
