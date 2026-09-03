package org.telegram.messenger;

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
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.widget.RemoteViews;
import java.io.File;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public class MusicPlayerService extends Service implements NotificationCenter.NotificationCenterDelegate {
    private static final int ID_NOTIFICATION = 5;
    public static final String NOTIFY_CLOSE = "org.telegram.android.musicplayer.close";
    public static final String NOTIFY_NEXT = "org.telegram.android.musicplayer.next";
    public static final String NOTIFY_PAUSE = "org.telegram.android.musicplayer.pause";
    public static final String NOTIFY_PLAY = "org.telegram.android.musicplayer.play";
    public static final String NOTIFY_PREVIOUS = "org.telegram.android.musicplayer.previous";
    public static final String NOTIFY_REPEAT = "org.telegram.android.musicplayer.repeat";
    public static final String NOTIFY_SEEK = "org.telegram.android.musicplayer.seek";
    public static final String NOTIFY_SHUFFLE = "org.telegram.android.musicplayer.shuffle";
    private static boolean supportBigNotifications = true;
    private static boolean supportLockScreenControls = true ^ TextUtils.isEmpty(AndroidUtilities.getSystemProperty("ro.miui.ui.version.code"));
    private Bitmap albumArtPlaceholder;
    private AudioManager audioManager;
    private boolean foregroundServiceIsStarted;
    private BroadcastReceiver headsetPlugReceiver = new BroadcastReceiver() {
        {
            MusicPlayerService.this = this;
        }

        @Override
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                MediaController.getInstance().lambda$startAudioAgain$7(MediaController.getInstance().getPlayingMessageObject());
            }
        }
    };
    private ImageReceiver imageReceiver;
    private String loadingFilePath;
    private android.support.v4.media.session.c0 mediaSession;
    private int notificationMessageID;
    private android.support.v4.media.session.f0 playbackState;
    private RemoteControlClient remoteControlClient;

    public void createNotification(org.telegram.messenger.MessageObject r33, boolean r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MusicPlayerService.createNotification(org.telegram.messenger.MessageObject, boolean):void");
    }

    private int fixIntentFlags(int i10) {
        if (Build.VERSION.SDK_INT < 31 && XiaomiUtilities.isMIUI()) {
            return i10 & (-100663297);
        }
        return i10;
    }

    private Bitmap getAvatarBitmap(TLObject tLObject, boolean z4, boolean z10) {
        int i10;
        org.telegram.ui.Components.z8 z8Var;
        TLRPC.FileLocation fileLocation;
        TLRPC.FileLocation fileLocation2;
        if (z4) {
            i10 = 600;
        } else {
            i10 = 100;
        }
        try {
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (z4) {
                    fileLocation2 = user.photo.photo_big;
                } else {
                    fileLocation2 = user.photo.photo_small;
                }
                if (fileLocation2 != null) {
                    File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(fileLocation2, true);
                    if (pathToAttach.exists()) {
                        float f10 = i10;
                        return ImageLoader.loadBitmap(pathToAttach.getAbsolutePath(), null, f10, f10, false);
                    } else if (z4) {
                        if (z10) {
                            this.loadingFilePath = FileLoader.getAttachFileName(fileLocation2);
                            this.imageReceiver.setImage(ImageLocation.getForUser(UserConfig.selectedAccount, user, 0), "", null, null, null, 0);
                        } else {
                            this.loadingFilePath = null;
                        }
                    }
                }
            } else {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                if (z4) {
                    fileLocation = chat.photo.photo_big;
                } else {
                    fileLocation = chat.photo.photo_small;
                }
                if (fileLocation != null) {
                    File pathToAttach2 = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(fileLocation, true);
                    if (pathToAttach2.exists()) {
                        float f11 = i10;
                        return ImageLoader.loadBitmap(pathToAttach2.getAbsolutePath(), null, f11, f11, false);
                    } else if (z4) {
                        if (z10) {
                            this.loadingFilePath = FileLoader.getAttachFileName(fileLocation);
                            this.imageReceiver.setImage(ImageLocation.getForChat(chat, 0), "", null, null, null, 0);
                        } else {
                            this.loadingFilePath = null;
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
        if (z4) {
            return null;
        }
        org.telegram.ui.ActionBar.j6.R(this);
        if (tLObject instanceof TLRPC.User) {
            z8Var = new org.telegram.ui.Components.z8(0, (TLRPC.User) tLObject);
        } else {
            z8Var = new org.telegram.ui.Components.z8((TLRPC.Chat) tLObject);
        }
        z8Var.f31295r = 1;
        float f12 = i10;
        Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.dp(f12), AndroidUtilities.dp(f12), Bitmap.Config.ARGB_8888);
        z8Var.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
        z8Var.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    private float getPlaybackSpeed(boolean z4, MessageObject messageObject) {
        if (z4) {
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

    public void lambda$onCreate$0(ImageReceiver imageReceiver, boolean z4, boolean z10, boolean z11) {
        if (z4 && !TextUtils.isEmpty(this.loadingFilePath)) {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject != null) {
                createNotification(playingMessageObject, true);
            }
            this.loadingFilePath = null;
        }
    }

    private Bitmap loadArtworkFromUrl(String str, boolean z4, boolean z10) {
        float f10;
        File httpFilePath = ImageLoader.getHttpFilePath(str, "jpg");
        if (httpFilePath.exists()) {
            String absolutePath = httpFilePath.getAbsolutePath();
            float f11 = 100.0f;
            if (z4) {
                f10 = 600.0f;
            } else {
                f10 = 100.0f;
            }
            if (z4) {
                f11 = 600.0f;
            }
            return ImageLoader.loadBitmap(absolutePath, null, f10, f11, false);
        }
        if (z10) {
            this.loadingFilePath = httpFilePath.getAbsolutePath();
            if (!z4) {
                this.imageReceiver.setImage(str, "48_48", null, null, 0L);
            }
        } else {
            this.loadingFilePath = null;
        }
        return null;
    }

    public void updatePlaybackState(long j10) {
        long j11;
        int i10;
        int i11;
        int i12;
        this.playbackState = new android.support.v4.media.session.f0();
        boolean isMessagePaused = MediaController.getInstance().isMessagePaused();
        boolean z4 = !isMessagePaused;
        if (MediaController.getInstance().isDownloadingCurrentMessage()) {
            android.support.v4.media.session.f0 f0Var = this.playbackState;
            f0Var.c(6, 0L, 1.0f);
            f0Var.e = 0L;
        } else {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject != null && playingMessageObject.isMusic()) {
                if (SharedConfig.shuffleMusic) {
                    i12 = R.drawable.player_new_shuffle;
                } else {
                    i12 = R.drawable.player_new_shuffle_off;
                }
                android.support.v4.media.session.f0 f0Var2 = this.playbackState;
                String string = LocaleController.getString(R.string.ShuffleList);
                if (!TextUtils.isEmpty("org.telegram.android.musicplayer.shuffle")) {
                    if (!TextUtils.isEmpty(string)) {
                        if (i12 != 0) {
                            f0Var2.a(new PlaybackStateCompat.CustomAction("org.telegram.android.musicplayer.shuffle", string, i12, null));
                            j11 = 2360118;
                        } else {
                            throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                        }
                    } else {
                        throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                    }
                } else {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                }
            } else {
                j11 = 2360070;
            }
            android.support.v4.media.session.f0 f0Var3 = this.playbackState;
            if (!isMessagePaused) {
                i10 = 3;
            } else {
                i10 = 2;
            }
            f0Var3.c(i10, j10, getPlaybackSpeed(z4, playingMessageObject));
            f0Var3.e = j11;
            if (playingMessageObject != null && playingMessageObject.isMusic()) {
                int i13 = SharedConfig.repeatMode;
                if (i13 != 1) {
                    if (i13 != 2) {
                        i11 = R.drawable.player_new_repeat_off;
                    } else {
                        i11 = R.drawable.player_new_repeatone;
                    }
                } else {
                    i11 = R.drawable.player_new_repeatall;
                }
                android.support.v4.media.session.f0 f0Var4 = this.playbackState;
                String string2 = LocaleController.getString(R.string.RepeatSong);
                if (!TextUtils.isEmpty("org.telegram.android.musicplayer.repeat")) {
                    if (!TextUtils.isEmpty(string2)) {
                        if (i11 != 0) {
                            f0Var4.a(new PlaybackStateCompat.CustomAction("org.telegram.android.musicplayer.repeat", string2, i11, null));
                        } else {
                            throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                        }
                    } else {
                        throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                    }
                } else {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                }
            }
        }
        this.mediaSession.f(this.playbackState.b());
    }

    public void updateRepeatMode() {
        android.support.v4.media.session.c0 c0Var = this.mediaSession;
        if (c0Var != null) {
            int i10 = SharedConfig.repeatMode;
            int i11 = 2;
            if (i10 != 1) {
                if (i10 != 2) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
            }
            c0Var.h(i11);
        }
    }

    public void updateShuffleMode() {
        android.support.v4.media.session.c0 c0Var = this.mediaSession;
        if (c0Var != null) {
            c0Var.i(SharedConfig.shuffleMusic ? 1 : 0);
        }
    }

    @Override
    public void didReceivedNotification(int i10, int i11, Object... objArr) {
        String str;
        String str2;
        int i12;
        float f10;
        if (i10 == NotificationCenter.messagePlayingPlayStateChanged) {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject != null) {
                createNotification(playingMessageObject, false);
            } else {
                stopSelf();
            }
        } else if (i10 == NotificationCenter.messagePlayingDidSeek) {
            MessageObject playingMessageObject2 = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject2 != null) {
                long round = Math.round(((Float) objArr[1]).floatValue() * playingMessageObject2.audioPlayerDuration) * 1000;
                updatePlaybackState(round);
                RemoteControlClient remoteControlClient = this.remoteControlClient;
                if (remoteControlClient != null) {
                    if (MediaController.getInstance().isMessagePaused()) {
                        i12 = 2;
                    } else {
                        i12 = 3;
                    }
                    if (MediaController.getInstance().isMessagePaused()) {
                        f10 = 0.0f;
                    } else {
                        f10 = 1.0f;
                    }
                    remoteControlClient.setPlaybackState(i12, round, f10);
                }
            }
        } else if (i10 == NotificationCenter.httpFileDidLoad) {
            String str3 = (String) objArr[0];
            MessageObject playingMessageObject3 = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject3 != null && (str2 = this.loadingFilePath) != null && str2.equals(str3)) {
                createNotification(playingMessageObject3, false);
            }
        } else if (i10 == NotificationCenter.fileLoaded) {
            String str4 = (String) objArr[0];
            MessageObject playingMessageObject4 = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject4 != null && (str = this.loadingFilePath) != null && str.equals(str4)) {
                createNotification(playingMessageObject4, false);
            }
        }
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        this.audioManager = (AudioManager) getSystemService("audio");
        for (int i10 = 0; i10 < 4; i10++) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingDidSeek);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.httpFileDidLoad);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoaded);
        }
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.imageReceiver = imageReceiver;
        imageReceiver.setDelegate(new d0(this, 9));
        this.mediaSession = new android.support.v4.media.session.c0(this, "telegramAudioPlayer", null, null);
        this.playbackState = new android.support.v4.media.session.f0();
        this.albumArtPlaceholder = Bitmap.createBitmap(AndroidUtilities.dp(102.0f), AndroidUtilities.dp(102.0f), Bitmap.Config.ARGB_8888);
        Drawable drawable = getResources().getDrawable(R.drawable.nocover_big);
        drawable.setBounds(0, 0, this.albumArtPlaceholder.getWidth(), this.albumArtPlaceholder.getHeight());
        drawable.draw(new Canvas(this.albumArtPlaceholder));
        this.mediaSession.d(new android.support.v4.media.session.s() {
            {
                MusicPlayerService.this = this;
            }

            @Override
            public void onCustomAction(String str, Bundle bundle) {
                if ("org.telegram.android.musicplayer.repeat".equals(str)) {
                    SharedConfig.setRepeatMode((SharedConfig.repeatMode + 1) % 3);
                    MusicPlayerService.this.updateRepeatMode();
                    org.telegram.ui.Components.c8 c8Var = org.telegram.ui.Components.c8.Q0;
                    if (c8Var != null) {
                        c8Var.H0();
                    }
                } else if ("org.telegram.android.musicplayer.shuffle".equals(str)) {
                    if (SharedConfig.shuffleMusic) {
                        MediaController.getInstance().setPlaybackOrderType(0);
                    } else {
                        MediaController.getInstance().setPlaybackOrderType(2);
                    }
                    MusicPlayerService.this.updateShuffleMode();
                    org.telegram.ui.Components.c8 c8Var2 = org.telegram.ui.Components.c8.Q0;
                    if (c8Var2 != null) {
                        c8Var2.H0();
                    }
                }
                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                if (playingMessageObject != null) {
                    MusicPlayerService.this.createNotification(playingMessageObject, false);
                }
            }

            @Override
            public void onPause() {
                MediaController.getInstance().lambda$startAudioAgain$7(MediaController.getInstance().getPlayingMessageObject());
            }

            @Override
            public void onPlay() {
                MediaController.getInstance().playMessage(MediaController.getInstance().getPlayingMessageObject());
            }

            @Override
            public void onSeekTo(long j10) {
                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                if (playingMessageObject != null) {
                    MediaController.getInstance().seekToProgress(playingMessageObject, ((float) (j10 / 1000)) / ((float) playingMessageObject.getDuration()));
                    MusicPlayerService.this.updatePlaybackState(j10);
                }
            }

            @Override
            public void onSetRepeatMode(int i11) {
                int i12 = 2;
                if (i11 != 1) {
                    if (i11 != 2 && i11 != 3) {
                        i12 = 0;
                    } else {
                        i12 = 1;
                    }
                }
                SharedConfig.setRepeatMode(i12);
                MusicPlayerService.this.updateRepeatMode();
                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                if (playingMessageObject != null) {
                    MusicPlayerService.this.createNotification(playingMessageObject, false);
                }
            }

            @Override
            public void onSetShuffleMode(int i11) {
                if (i11 != 1 && i11 != 2) {
                    if (SharedConfig.shuffleMusic) {
                        MediaController.getInstance().setPlaybackOrderType(0);
                    }
                } else if (!SharedConfig.shuffleMusic) {
                    MediaController.getInstance().setPlaybackOrderType(2);
                }
                MusicPlayerService.this.updateShuffleMode();
                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                if (playingMessageObject != null) {
                    MusicPlayerService.this.createNotification(playingMessageObject, false);
                }
            }

            @Override
            public void onSkipToNext() {
                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                if (playingMessageObject != null && playingMessageObject.isMusic()) {
                    MediaController.getInstance().playNextMessage();
                }
            }

            @Override
            public void onSkipToPrevious() {
                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                if (playingMessageObject != null && playingMessageObject.isMusic()) {
                    MediaController.getInstance().playPreviousMessage();
                }
            }

            @Override
            public void onStop() {
            }
        }, null);
        this.mediaSession.c(true);
        updateRepeatMode();
        updateShuffleMode();
        registerReceiver(this.headsetPlugReceiver, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
        super.onCreate();
    }

    @Override
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
        android.support.v4.media.session.c0 c0Var = this.mediaSession;
        if (c0Var != null) {
            c0Var.b();
        }
        for (int i10 = 0; i10 < 4; i10++) {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingDidSeek);
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.httpFileDidLoad);
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileLoaded);
        }
    }

    @Override
    public int onStartCommand(Intent intent, int i10, int i11) {
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
            AndroidUtilities.runOnUIThread(new xg(this, 0));
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
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
        createNotification(playingMessageObject, false);
        return 1;
    }

    public void setListeners(RemoteViews remoteViews) {
        remoteViews.setOnClickPendingIntent(R.id.player_previous, PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent("org.telegram.android.musicplayer.previous"), fixIntentFlags(167772160)));
        remoteViews.setOnClickPendingIntent(R.id.player_close, PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent("org.telegram.android.musicplayer.close"), fixIntentFlags(167772160)));
        remoteViews.setOnClickPendingIntent(R.id.player_pause, PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent("org.telegram.android.musicplayer.pause"), fixIntentFlags(167772160)));
        remoteViews.setOnClickPendingIntent(R.id.player_next, PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent("org.telegram.android.musicplayer.next"), fixIntentFlags(167772160)));
        remoteViews.setOnClickPendingIntent(R.id.player_play, PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent("org.telegram.android.musicplayer.play"), fixIntentFlags(167772160)));
    }
}
