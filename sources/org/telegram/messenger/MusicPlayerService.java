package org.telegram.messenger;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationManager;
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
import android.media.MediaMetadata;
import android.media.RemoteControlClient;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat;
import java.io.File;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.audioinfo.AudioInfo;
import org.telegram.p009ui.LaunchActivity;
import org.telegram.tgnet.ConnectionsManager;
import org.webrtc.MediaStreamTrack;

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
        this.audioManager = (AudioManager) getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
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
            public void onAnimationReady(ImageReceiver imageReceiver2) {
                ImageReceiver.ImageReceiverDelegate.CC.$default$onAnimationReady(this, imageReceiver2);
            }
        });
        if (Build.VERSION.SDK_INT >= 21) {
            this.mediaSession = new MediaSession(this, "telegramAudioPlayer");
            this.playbackState = new PlaybackState.Builder();
            this.albumArtPlaceholder = Bitmap.createBitmap(AndroidUtilities.m35dp(102.0f), AndroidUtilities.m35dp(102.0f), Bitmap.Config.ARGB_8888);
            Drawable drawable = getResources().getDrawable(C1010R.C1011drawable.nocover_big);
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
                    MediaController.getInstance().playNextMessage();
                }

                @Override
                public void onSkipToPrevious() {
                    MediaController.getInstance().playPreviousMessage();
                }

                @Override
                public void onSeekTo(long j) {
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (playingMessageObject != null) {
                        MediaController.getInstance().seekToProgress(playingMessageObject, ((float) (j / 1000)) / playingMessageObject.getDuration());
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
                    RemoteControlClient remoteControlClient = new RemoteControlClient(PendingIntent.getBroadcast(this, 0, intent2, ConnectionsManager.FileTypeVideo));
                    this.remoteControlClient = remoteControlClient;
                    this.audioManager.registerRemoteControlClient(remoteControlClient);
                }
                this.remoteControlClient.setTransportControlFlags(189);
            } catch (Exception e2) {
                FileLog.m31e(e2);
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

    @SuppressLint({"NewApi"})
    private void createNotification(MessageObject messageObject, boolean z) {
        String str;
        float f;
        int i;
        String str2;
        String str3;
        int i2;
        String str4;
        String musicTitle = messageObject.getMusicTitle();
        String musicAuthor = messageObject.getMusicAuthor();
        AudioInfo audioInfo = MediaController.getInstance().getAudioInfo();
        Intent intent = new Intent(ApplicationLoader.applicationContext, LaunchActivity.class);
        intent.setAction("com.tmessages.openplayer");
        intent.addCategory("android.intent.category.LAUNCHER");
        PendingIntent activity = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent, ConnectionsManager.FileTypeVideo);
        String artworkUrl = messageObject.getArtworkUrl(true);
        String artworkUrl2 = messageObject.getArtworkUrl(false);
        long duration = messageObject.getDuration() * 1000;
        Bitmap smallCover = audioInfo != null ? audioInfo.getSmallCover() : null;
        Bitmap cover = audioInfo != null ? audioInfo.getCover() : null;
        this.loadingFilePath = null;
        this.imageReceiver.setImageBitmap((Drawable) null);
        if (smallCover == null && !TextUtils.isEmpty(artworkUrl)) {
            cover = loadArtworkFromUrl(artworkUrl2, true, !z);
            if (cover == null) {
                smallCover = loadArtworkFromUrl(artworkUrl, false, !z);
                cover = smallCover;
            } else {
                smallCover = loadArtworkFromUrl(artworkUrl2, false, !z);
            }
        } else {
            this.loadingFilePath = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(messageObject.getDocument()).getAbsolutePath();
        }
        int i3 = Build.VERSION.SDK_INT;
        Bitmap bitmap = smallCover;
        if (i3 >= 21) {
            boolean z2 = !MediaController.getInstance().isMessagePaused();
            PendingIntent broadcast = PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent(NOTIFY_PREVIOUS).setComponent(new ComponentName(this, MusicPlayerReceiver.class)), 301989888);
            PendingIntent service = PendingIntent.getService(getApplicationContext(), 0, new Intent(this, getClass()).setAction(getPackageName() + ".STOP_PLAYER"), 301989888);
            PendingIntent broadcast2 = PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent(z2 ? NOTIFY_PAUSE : NOTIFY_PLAY).setComponent(new ComponentName(this, MusicPlayerReceiver.class)), 301989888);
            PendingIntent broadcast3 = PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent(NOTIFY_NEXT).setComponent(new ComponentName(this, MusicPlayerReceiver.class)), 301989888);
            PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent(NOTIFY_SEEK).setComponent(new ComponentName(this, MusicPlayerReceiver.class)), 301989888);
            Notification.Builder builder = new Notification.Builder(this);
            builder.setSmallIcon(C1010R.C1011drawable.player).setOngoing(z2).setContentTitle(musicTitle).setContentText(musicAuthor).setSubText(audioInfo != null ? audioInfo.getAlbum() : null).setContentIntent(activity).setDeleteIntent(service).setShowWhen(false).setCategory("transport").setPriority(2).setStyle(new Notification.MediaStyle().setMediaSession(this.mediaSession.getSessionToken()).setShowActionsInCompactView(0, 1, 2));
            if (i3 >= 26) {
                NotificationsController.checkOtherNotificationsChannel();
                builder.setChannelId(NotificationsController.OTHER_NOTIFICATIONS_CHANNEL);
            }
            if (bitmap != null) {
                builder.setLargeIcon(bitmap);
            } else {
                builder.setLargeIcon(this.albumArtPlaceholder);
            }
            String string = LocaleController.getString("Next", C1010R.string.Next);
            String string2 = LocaleController.getString("AccDescrPrevious", C1010R.string.AccDescrPrevious);
            if (MediaController.getInstance().isDownloadingCurrentMessage()) {
                f = 1.0f;
                this.playbackState.setState(6, 0L, 1.0f).setActions(0L);
                builder.addAction(new Notification.Action.Builder(C1010R.C1011drawable.ic_action_previous, string2, broadcast).build()).addAction(new Notification.Action.Builder(C1010R.C1011drawable.loading_animation2, LocaleController.getString("Loading", C1010R.string.Loading), (PendingIntent) null).build()).addAction(new Notification.Action.Builder(C1010R.C1011drawable.ic_action_next, string, broadcast3).build());
                str2 = musicTitle;
                str3 = musicAuthor;
            } else {
                f = 1.0f;
                str2 = musicTitle;
                str3 = musicAuthor;
                this.playbackState.setState(z2 ? 3 : 2, MediaController.getInstance().getPlayingMessageObject().audioProgressSec * 1000, z2 ? 1.0f : 0.0f).setActions(822L);
                if (z2) {
                    i2 = C1010R.string.AccActionPause;
                    str4 = "AccActionPause";
                } else {
                    i2 = C1010R.string.AccActionPlay;
                    str4 = "AccActionPlay";
                }
                builder.addAction(new Notification.Action.Builder(C1010R.C1011drawable.ic_action_previous, string2, broadcast).build()).addAction(new Notification.Action.Builder(z2 ? C1010R.C1011drawable.ic_action_pause : C1010R.C1011drawable.ic_action_play, LocaleController.getString(str4, i2), broadcast2).build()).addAction(new Notification.Action.Builder(C1010R.C1011drawable.ic_action_next, string, broadcast3).build());
            }
            this.mediaSession.setPlaybackState(this.playbackState.build());
            musicAuthor = str3;
            str = str2;
            this.mediaSession.setMetadata(new MediaMetadata.Builder().putBitmap("android.media.metadata.ALBUM_ART", cover).putString("android.media.metadata.ALBUM_ARTIST", musicAuthor).putString("android.media.metadata.ARTIST", musicAuthor).putLong("android.media.metadata.DURATION", duration).putString("android.media.metadata.TITLE", str).putString("android.media.metadata.ALBUM", audioInfo != null ? audioInfo.getAlbum() : null).build());
            builder.setVisibility(1);
            Notification build = builder.build();
            if (z2) {
                startForeground(5, build);
            } else {
                stopForeground(false);
                ((NotificationManager) getSystemService("notification")).notify(5, build);
            }
        } else {
            str = musicTitle;
            f = 1.0f;
            RemoteViews remoteViews = new RemoteViews(getApplicationContext().getPackageName(), C1010R.layout.player_small_notification);
            RemoteViews remoteViews2 = supportBigNotifications ? new RemoteViews(getApplicationContext().getPackageName(), C1010R.layout.player_big_notification) : null;
            Notification build2 = new NotificationCompat.Builder(getApplicationContext()).setSmallIcon(C1010R.C1011drawable.player).setContentIntent(activity).setChannelId(NotificationsController.OTHER_NOTIFICATIONS_CHANNEL).setContentTitle(str).build();
            build2.contentView = remoteViews;
            if (supportBigNotifications) {
                build2.bigContentView = remoteViews2;
            }
            setListeners(remoteViews);
            if (supportBigNotifications) {
                setListeners(remoteViews2);
            }
            if (bitmap != null) {
                RemoteViews remoteViews3 = build2.contentView;
                int i4 = C1010R.C1012id.player_album_art;
                remoteViews3.setImageViewBitmap(i4, bitmap);
                if (supportBigNotifications) {
                    build2.bigContentView.setImageViewBitmap(i4, bitmap);
                }
            } else {
                RemoteViews remoteViews4 = build2.contentView;
                int i5 = C1010R.C1012id.player_album_art;
                remoteViews4.setImageViewResource(i5, C1010R.C1011drawable.nocover_small);
                if (supportBigNotifications) {
                    build2.bigContentView.setImageViewResource(i5, C1010R.C1011drawable.nocover_big);
                }
            }
            if (MediaController.getInstance().isDownloadingCurrentMessage()) {
                RemoteViews remoteViews5 = build2.contentView;
                int i6 = C1010R.C1012id.player_pause;
                remoteViews5.setViewVisibility(i6, 8);
                RemoteViews remoteViews6 = build2.contentView;
                int i7 = C1010R.C1012id.player_play;
                remoteViews6.setViewVisibility(i7, 8);
                RemoteViews remoteViews7 = build2.contentView;
                int i8 = C1010R.C1012id.player_next;
                remoteViews7.setViewVisibility(i8, 8);
                RemoteViews remoteViews8 = build2.contentView;
                int i9 = C1010R.C1012id.player_previous;
                remoteViews8.setViewVisibility(i9, 8);
                RemoteViews remoteViews9 = build2.contentView;
                int i10 = C1010R.C1012id.player_progress_bar;
                remoteViews9.setViewVisibility(i10, 0);
                if (supportBigNotifications) {
                    build2.bigContentView.setViewVisibility(i6, 8);
                    build2.bigContentView.setViewVisibility(i7, 8);
                    build2.bigContentView.setViewVisibility(i8, 8);
                    build2.bigContentView.setViewVisibility(i9, 8);
                    build2.bigContentView.setViewVisibility(i10, 0);
                }
            } else {
                RemoteViews remoteViews10 = build2.contentView;
                int i11 = C1010R.C1012id.player_progress_bar;
                remoteViews10.setViewVisibility(i11, 8);
                RemoteViews remoteViews11 = build2.contentView;
                int i12 = C1010R.C1012id.player_next;
                remoteViews11.setViewVisibility(i12, 0);
                RemoteViews remoteViews12 = build2.contentView;
                int i13 = C1010R.C1012id.player_previous;
                remoteViews12.setViewVisibility(i13, 0);
                if (supportBigNotifications) {
                    build2.bigContentView.setViewVisibility(i12, 0);
                    build2.bigContentView.setViewVisibility(i13, 0);
                    i = 8;
                    build2.bigContentView.setViewVisibility(i11, 8);
                } else {
                    i = 8;
                }
                if (MediaController.getInstance().isMessagePaused()) {
                    RemoteViews remoteViews13 = build2.contentView;
                    int i14 = C1010R.C1012id.player_pause;
                    remoteViews13.setViewVisibility(i14, i);
                    RemoteViews remoteViews14 = build2.contentView;
                    int i15 = C1010R.C1012id.player_play;
                    remoteViews14.setViewVisibility(i15, 0);
                    if (supportBigNotifications) {
                        build2.bigContentView.setViewVisibility(i14, i);
                        build2.bigContentView.setViewVisibility(i15, 0);
                    }
                } else {
                    RemoteViews remoteViews15 = build2.contentView;
                    int i16 = C1010R.C1012id.player_pause;
                    remoteViews15.setViewVisibility(i16, 0);
                    RemoteViews remoteViews16 = build2.contentView;
                    int i17 = C1010R.C1012id.player_play;
                    remoteViews16.setViewVisibility(i17, i);
                    if (supportBigNotifications) {
                        build2.bigContentView.setViewVisibility(i16, 0);
                        build2.bigContentView.setViewVisibility(i17, i);
                    }
                }
            }
            RemoteViews remoteViews17 = build2.contentView;
            int i18 = C1010R.C1012id.player_song_name;
            remoteViews17.setTextViewText(i18, str);
            RemoteViews remoteViews18 = build2.contentView;
            int i19 = C1010R.C1012id.player_author_name;
            remoteViews18.setTextViewText(i19, musicAuthor);
            if (supportBigNotifications) {
                build2.bigContentView.setTextViewText(i18, str);
                build2.bigContentView.setTextViewText(i19, musicAuthor);
                build2.bigContentView.setTextViewText(C1010R.C1012id.player_album_title, (audioInfo == null || TextUtils.isEmpty(audioInfo.getAlbum())) ? BuildConfig.APP_CENTER_HASH : audioInfo.getAlbum());
            }
            build2.flags |= 2;
            startForeground(5, build2);
        }
        if (this.remoteControlClient != null) {
            int id = MediaController.getInstance().getPlayingMessageObject().getId();
            if (this.notificationMessageID != id) {
                this.notificationMessageID = id;
                RemoteControlClient.MetadataEditor editMetadata = this.remoteControlClient.editMetadata(true);
                editMetadata.putString(2, musicAuthor);
                editMetadata.putString(7, str);
                if (audioInfo != null && !TextUtils.isEmpty(audioInfo.getAlbum())) {
                    editMetadata.putString(1, audioInfo.getAlbum());
                }
                editMetadata.putLong(9, MediaController.getInstance().getPlayingMessageObject().audioPlayerDuration * 1000);
                if (cover != null) {
                    try {
                        editMetadata.putBitmap(100, cover);
                    } catch (Throwable th) {
                        FileLog.m31e(th);
                    }
                }
                editMetadata.apply();
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public void run() {
                        if (MusicPlayerService.this.remoteControlClient == null || MediaController.getInstance().getPlayingMessageObject() == null) {
                            return;
                        }
                        if (MediaController.getInstance().getPlayingMessageObject().audioPlayerDuration != -9223372036854775807L) {
                            RemoteControlClient.MetadataEditor editMetadata2 = MusicPlayerService.this.remoteControlClient.editMetadata(false);
                            editMetadata2.putLong(9, MediaController.getInstance().getPlayingMessageObject().audioPlayerDuration * 1000);
                            editMetadata2.apply();
                            if (Build.VERSION.SDK_INT < 18) {
                                MusicPlayerService.this.remoteControlClient.setPlaybackState(MediaController.getInstance().isMessagePaused() ? 2 : 3);
                                return;
                            } else {
                                MusicPlayerService.this.remoteControlClient.setPlaybackState(MediaController.getInstance().isMessagePaused() ? 2 : 3, Math.max(MediaController.getInstance().getPlayingMessageObject().audioProgressSec * 1000, 100L), MediaController.getInstance().isMessagePaused() ? 0.0f : 1.0f);
                                return;
                            }
                        }
                        AndroidUtilities.runOnUIThread(this, 500L);
                    }
                }, 1000L);
            }
            if (MediaController.getInstance().isDownloadingCurrentMessage()) {
                this.remoteControlClient.setPlaybackState(8);
                return;
            }
            RemoteControlClient.MetadataEditor editMetadata2 = this.remoteControlClient.editMetadata(false);
            editMetadata2.putLong(9, MediaController.getInstance().getPlayingMessageObject().audioPlayerDuration * 1000);
            editMetadata2.apply();
            if (Build.VERSION.SDK_INT >= 18) {
                RemoteControlClient remoteControlClient = this.remoteControlClient;
                int i20 = MediaController.getInstance().isMessagePaused() ? 2 : 3;
                long max = Math.max(MediaController.getInstance().getPlayingMessageObject().audioProgressSec * 1000, 100L);
                if (MediaController.getInstance().isMessagePaused()) {
                    f = 0.0f;
                }
                remoteControlClient.setPlaybackState(i20, max, f);
                return;
            }
            this.remoteControlClient.setPlaybackState(MediaController.getInstance().isMessagePaused() ? 2 : 3);
        }
    }

    public void updatePlaybackState(long j) {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        boolean z = !MediaController.getInstance().isMessagePaused();
        if (MediaController.getInstance().isDownloadingCurrentMessage()) {
            this.playbackState.setState(6, 0L, 1.0f).setActions(0L);
        } else {
            this.playbackState.setState(z ? 3 : 2, j, z ? 1.0f : 0.0f).setActions(822L);
        }
        this.mediaSession.setPlaybackState(this.playbackState.build());
    }

    public void setListeners(RemoteViews remoteViews) {
        remoteViews.setOnClickPendingIntent(C1010R.C1012id.player_previous, PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent(NOTIFY_PREVIOUS), 167772160));
        remoteViews.setOnClickPendingIntent(C1010R.C1012id.player_close, PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent(NOTIFY_CLOSE), 167772160));
        remoteViews.setOnClickPendingIntent(C1010R.C1012id.player_pause, PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent(NOTIFY_PAUSE), 167772160));
        remoteViews.setOnClickPendingIntent(C1010R.C1012id.player_next, PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent(NOTIFY_NEXT), 167772160));
        remoteViews.setOnClickPendingIntent(C1010R.C1012id.player_play, PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent(NOTIFY_PLAY), 167772160));
    }

    @Override
    @SuppressLint({"NewApi"})
    public void onDestroy() {
        unregisterReceiver(this.headsetPlugReceiver);
        super.onDestroy();
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
            if (this.remoteControlClient == null || Build.VERSION.SDK_INT < 18) {
                return;
            }
            this.remoteControlClient.setPlaybackState(MediaController.getInstance().isMessagePaused() ? 2 : 3, Math.round(playingMessageObject2.audioPlayerDuration * ((Float) objArr[1]).floatValue()) * 1000, MediaController.getInstance().isMessagePaused() ? 0.0f : 1.0f);
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
