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
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat;
import java.io.File;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.audioinfo.AudioInfo;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$FileLocation;
import org.telegram.tgnet.TLRPC$Peer;
import org.telegram.tgnet.TLRPC$TL_peerChannel;
import org.telegram.tgnet.TLRPC$TL_peerChat;
import org.telegram.tgnet.TLRPC$TL_peerUser;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.LaunchActivity;

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
        supportBigNotifications = true;
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
                    }
                    if (z) {
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
                    }
                    if (z) {
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

    @SuppressLint({"NewApi"})
    private void createNotification(MessageObject messageObject, boolean z) {
        long j;
        Bitmap avatarBitmap;
        Bitmap avatarBitmap2;
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        String str;
        Bitmap bitmap4;
        String str2;
        int i;
        MediaSession.Token sessionToken;
        Notification.MediaStyle mediaSession;
        PendingIntent pendingIntent;
        Notification.Builder category;
        int i2;
        String str3;
        String str4;
        PlaybackState.Builder state;
        Notification.Action build;
        Notification.Action build2;
        Notification.Action build3;
        PlaybackState build4;
        MediaMetadata.Builder putBitmap;
        MediaMetadata.Builder putString;
        MediaMetadata.Builder putString2;
        MediaMetadata.Builder putLong;
        MediaMetadata.Builder putString3;
        MediaMetadata.Builder putString4;
        MediaMetadata build5;
        PlaybackState.Builder state2;
        Notification.Action build6;
        Notification.Action build7;
        Notification.Action build8;
        String musicTitle = messageObject.getMusicTitle();
        String musicAuthor = messageObject.getMusicAuthor();
        AudioInfo audioInfo = MediaController.getInstance().getAudioInfo();
        Intent intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
        if (messageObject.isMusic()) {
            intent.setAction("com.tmessages.openplayer");
            intent.addCategory("android.intent.category.LAUNCHER");
        } else if (messageObject.isVoice() || messageObject.isRoundVideo()) {
            intent.setAction("android.intent.action.VIEW");
            TLRPC$Peer tLRPC$Peer = messageObject.messageOwner.peer_id;
            boolean z2 = tLRPC$Peer instanceof TLRPC$TL_peerUser;
            if (z2) {
                j = tLRPC$Peer.user_id;
            } else if (tLRPC$Peer instanceof TLRPC$TL_peerChat) {
                j = tLRPC$Peer.chat_id;
            } else {
                j = tLRPC$Peer instanceof TLRPC$TL_peerChannel ? tLRPC$Peer.channel_id : 0L;
            }
            if (j != 0) {
                if (z2) {
                    intent.setData(Uri.parse("tg://openmessage?user_id=" + j + "&message_id=" + messageObject.getId()));
                } else {
                    intent.setData(Uri.parse("tg://openmessage?chat_id=" + j + "&message_id=" + messageObject.getId()));
                }
            }
        }
        PendingIntent activity = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent, fixIntentFlags(33554432));
        long duration = (long) (messageObject.getDuration() * 1000.0d);
        if (messageObject.isMusic()) {
            String artworkUrl = messageObject.getArtworkUrl(true);
            String artworkUrl2 = messageObject.getArtworkUrl(false);
            bitmap = audioInfo != null ? audioInfo.getSmallCover() : null;
            bitmap2 = audioInfo != null ? audioInfo.getCover() : null;
            this.loadingFilePath = null;
            this.imageReceiver.setImageBitmap((Drawable) null);
            if (bitmap == null && !TextUtils.isEmpty(artworkUrl)) {
                boolean z3 = !z;
                bitmap2 = loadArtworkFromUrl(artworkUrl2, true, z3);
                if (bitmap2 == null) {
                    bitmap = loadArtworkFromUrl(artworkUrl, false, z3);
                    bitmap3 = bitmap;
                } else {
                    bitmap = loadArtworkFromUrl(artworkUrl2, false, z3);
                }
            } else {
                this.loadingFilePath = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(messageObject.getDocument()).getAbsolutePath();
            }
            bitmap3 = bitmap2;
        } else if (messageObject.isVoice() || messageObject.isRoundVideo()) {
            long senderId = messageObject.getSenderId();
            if (messageObject.isFromUser()) {
                TLRPC$User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(senderId));
                if (user != null) {
                    musicTitle = UserObject.getUserName(user);
                    boolean z4 = !z;
                    avatarBitmap = getAvatarBitmap(user, true, z4);
                    avatarBitmap2 = getAvatarBitmap(user, false, z4);
                    bitmap = avatarBitmap2;
                }
                avatarBitmap = null;
                bitmap = null;
            } else {
                TLRPC$Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-senderId));
                if (chat != null) {
                    musicTitle = chat.title;
                    boolean z5 = !z;
                    avatarBitmap = getAvatarBitmap(chat, true, z5);
                    avatarBitmap2 = getAvatarBitmap(chat, false, z5);
                    bitmap = avatarBitmap2;
                }
                avatarBitmap = null;
                bitmap = null;
            }
            bitmap2 = (avatarBitmap != null || bitmap == null) ? avatarBitmap : bitmap;
            musicAuthor = messageObject.isVoice() ? LocaleController.getString(R.string.AttachAudio) : LocaleController.getString(R.string.AttachRound);
            bitmap3 = bitmap2;
        } else {
            bitmap3 = null;
            bitmap = null;
        }
        int i3 = Build.VERSION.SDK_INT;
        Bitmap bitmap5 = bitmap;
        if (i3 >= 21) {
            boolean z6 = !MediaController.getInstance().isMessagePaused();
            PendingIntent broadcast = PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent("org.telegram.android.musicplayer.previous").setComponent(new ComponentName(this, (Class<?>) MusicPlayerReceiver.class)), fixIntentFlags(301989888));
            PendingIntent service = PendingIntent.getService(getApplicationContext(), 0, new Intent(this, getClass()).setAction(getPackageName() + ".STOP_PLAYER"), fixIntentFlags(301989888));
            PendingIntent broadcast2 = PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent(z6 ? "org.telegram.android.musicplayer.pause" : "org.telegram.android.musicplayer.play").setComponent(new ComponentName(this, (Class<?>) MusicPlayerReceiver.class)), fixIntentFlags(301989888));
            Bitmap bitmap6 = bitmap3;
            PendingIntent broadcast3 = PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent("org.telegram.android.musicplayer.next").setComponent(new ComponentName(this, (Class<?>) MusicPlayerReceiver.class)), fixIntentFlags(301989888));
            PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent("org.telegram.android.musicplayer.seek").setComponent(new ComponentName(this, (Class<?>) MusicPlayerReceiver.class)), fixIntentFlags(301989888));
            Notification.MediaStyle mediaStyle = new Notification.MediaStyle();
            sessionToken = this.mediaSession.getSessionToken();
            mediaSession = mediaStyle.setMediaSession(sessionToken);
            if (messageObject.isMusic()) {
                pendingIntent = broadcast2;
                mediaSession.setShowActionsInCompactView(0, 1, 2);
            } else {
                pendingIntent = broadcast2;
                if (messageObject.isVoice() || messageObject.isRoundVideo()) {
                    mediaSession.setShowActionsInCompactView(0);
                }
            }
            Notification.Builder builder = new Notification.Builder(this);
            category = builder.setSmallIcon(R.drawable.player).setOngoing(z6).setContentTitle(musicTitle).setContentText(musicAuthor).setSubText((audioInfo == null || !messageObject.isMusic()) ? null : audioInfo.getAlbum()).setContentIntent(activity).setDeleteIntent(service).setShowWhen(false).setCategory("transport");
            category.setPriority(2).setStyle(mediaSession);
            if (i3 >= 26) {
                NotificationsController.checkOtherNotificationsChannel();
                builder.setChannelId(NotificationsController.OTHER_NOTIFICATIONS_CHANNEL);
            }
            if (bitmap5 != null) {
                builder.setLargeIcon(bitmap5);
            } else {
                builder.setLargeIcon(this.albumArtPlaceholder);
            }
            String string = LocaleController.getString(R.string.Next);
            String string2 = LocaleController.getString(R.string.AccDescrPrevious);
            if (MediaController.getInstance().isDownloadingCurrentMessage()) {
                i2 = i3;
                state2 = this.playbackState.setState(6, 0L, 1.0f);
                state2.setActions(0L);
                if (messageObject.isMusic()) {
                    build8 = new Notification.Action.Builder(R.drawable.ic_action_previous, string2, broadcast).build();
                    builder.addAction(build8);
                }
                build6 = new Notification.Action.Builder(R.drawable.loading_animation2, LocaleController.getString(R.string.Loading), (PendingIntent) null).build();
                builder.addAction(build6);
                if (messageObject.isMusic()) {
                    build7 = new Notification.Action.Builder(R.drawable.ic_action_next, string, broadcast3).build();
                    builder.addAction(build7);
                }
                str3 = musicTitle;
                str4 = musicAuthor;
            } else {
                i2 = i3;
                long j2 = messageObject.isMusic() ? 822L : 774L;
                str3 = musicTitle;
                str4 = musicAuthor;
                state = this.playbackState.setState(z6 ? 3 : 2, MediaController.getInstance().getPlayingMessageObject().audioProgressSec * 1000, getPlaybackSpeed(z6, messageObject));
                state.setActions(j2);
                String string3 = LocaleController.getString(z6 ? R.string.AccActionPause : R.string.AccActionPlay);
                if (messageObject.isMusic()) {
                    build3 = new Notification.Action.Builder(R.drawable.ic_action_previous, string2, broadcast).build();
                    builder.addAction(build3);
                }
                build = new Notification.Action.Builder(z6 ? R.drawable.ic_action_pause : R.drawable.ic_action_play, string3, pendingIntent).build();
                builder.addAction(build);
                if (messageObject.isMusic()) {
                    build2 = new Notification.Action.Builder(R.drawable.ic_action_next, string, broadcast3).build();
                    builder.addAction(build2);
                }
            }
            MediaSession mediaSession2 = this.mediaSession;
            build4 = this.playbackState.build();
            mediaSession2.setPlaybackState(build4);
            bitmap4 = bitmap6;
            putBitmap = new MediaMetadata.Builder().putBitmap("android.media.metadata.ALBUM_ART", bitmap4);
            str2 = str4;
            putString = putBitmap.putString("android.media.metadata.ALBUM_ARTIST", str2);
            putString2 = putString.putString("android.media.metadata.ARTIST", str2);
            putLong = putString2.putLong("android.media.metadata.DURATION", duration);
            str = str3;
            putString3 = putLong.putString("android.media.metadata.TITLE", str);
            putString4 = putString3.putString("android.media.metadata.ALBUM", (audioInfo == null || !messageObject.isMusic()) ? null : audioInfo.getAlbum());
            MediaSession mediaSession3 = this.mediaSession;
            build5 = putString4.build();
            mediaSession3.setMetadata(build5);
            builder.setVisibility(1);
            Notification build9 = builder.build();
            if (i2 >= 31) {
                if (!this.foregroundServiceIsStarted) {
                    this.foregroundServiceIsStarted = true;
                    startForeground(5, build9);
                } else {
                    ((NotificationManager) getSystemService("notification")).notify(5, build9);
                }
            } else if (z6) {
                startForeground(5, build9);
            } else {
                stopForeground(false);
                ((NotificationManager) getSystemService("notification")).notify(5, build9);
            }
        } else {
            str = musicTitle;
            bitmap4 = bitmap3;
            str2 = musicAuthor;
            RemoteViews remoteViews = new RemoteViews(getApplicationContext().getPackageName(), R.layout.player_small_notification);
            RemoteViews remoteViews2 = supportBigNotifications ? new RemoteViews(getApplicationContext().getPackageName(), R.layout.player_big_notification) : null;
            Notification build10 = new NotificationCompat.Builder(getApplicationContext()).setSmallIcon(R.drawable.player).setContentIntent(activity).setChannelId(NotificationsController.OTHER_NOTIFICATIONS_CHANNEL).setContentTitle(str).build();
            build10.contentView = remoteViews;
            if (supportBigNotifications) {
                build10.bigContentView = remoteViews2;
            }
            setListeners(remoteViews);
            if (supportBigNotifications) {
                setListeners(remoteViews2);
            }
            if (bitmap5 != null) {
                RemoteViews remoteViews3 = build10.contentView;
                int i4 = R.id.player_album_art;
                remoteViews3.setImageViewBitmap(i4, bitmap5);
                if (supportBigNotifications) {
                    build10.bigContentView.setImageViewBitmap(i4, bitmap5);
                }
            } else {
                RemoteViews remoteViews4 = build10.contentView;
                int i5 = R.id.player_album_art;
                remoteViews4.setImageViewResource(i5, R.drawable.nocover_small);
                if (supportBigNotifications) {
                    build10.bigContentView.setImageViewResource(i5, R.drawable.nocover_big);
                }
            }
            if (MediaController.getInstance().isDownloadingCurrentMessage()) {
                RemoteViews remoteViews5 = build10.contentView;
                int i6 = R.id.player_pause;
                remoteViews5.setViewVisibility(i6, 8);
                RemoteViews remoteViews6 = build10.contentView;
                int i7 = R.id.player_play;
                remoteViews6.setViewVisibility(i7, 8);
                RemoteViews remoteViews7 = build10.contentView;
                int i8 = R.id.player_next;
                remoteViews7.setViewVisibility(i8, 8);
                RemoteViews remoteViews8 = build10.contentView;
                int i9 = R.id.player_previous;
                remoteViews8.setViewVisibility(i9, 8);
                RemoteViews remoteViews9 = build10.contentView;
                int i10 = R.id.player_progress_bar;
                remoteViews9.setViewVisibility(i10, 0);
                if (supportBigNotifications) {
                    build10.bigContentView.setViewVisibility(i6, 8);
                    build10.bigContentView.setViewVisibility(i7, 8);
                    build10.bigContentView.setViewVisibility(i8, 8);
                    build10.bigContentView.setViewVisibility(i9, 8);
                    build10.bigContentView.setViewVisibility(i10, 0);
                }
            } else {
                RemoteViews remoteViews10 = build10.contentView;
                int i11 = R.id.player_progress_bar;
                remoteViews10.setViewVisibility(i11, 8);
                if (messageObject.isMusic()) {
                    build10.contentView.setViewVisibility(R.id.player_next, 0);
                    build10.contentView.setViewVisibility(R.id.player_previous, 0);
                } else {
                    build10.bigContentView.setViewVisibility(R.id.player_next, 8);
                    build10.bigContentView.setViewVisibility(R.id.player_previous, 8);
                }
                if (supportBigNotifications) {
                    if (messageObject.isMusic()) {
                        build10.bigContentView.setViewVisibility(R.id.player_next, 0);
                        build10.bigContentView.setViewVisibility(R.id.player_previous, 0);
                        i = 8;
                    } else {
                        i = 8;
                        build10.bigContentView.setViewVisibility(R.id.player_next, 8);
                        build10.bigContentView.setViewVisibility(R.id.player_previous, 8);
                    }
                    build10.bigContentView.setViewVisibility(i11, i);
                } else {
                    i = 8;
                }
                if (MediaController.getInstance().isMessagePaused()) {
                    RemoteViews remoteViews11 = build10.contentView;
                    int i12 = R.id.player_pause;
                    remoteViews11.setViewVisibility(i12, i);
                    RemoteViews remoteViews12 = build10.contentView;
                    int i13 = R.id.player_play;
                    remoteViews12.setViewVisibility(i13, 0);
                    if (supportBigNotifications) {
                        build10.bigContentView.setViewVisibility(i12, i);
                        build10.bigContentView.setViewVisibility(i13, 0);
                    }
                } else {
                    RemoteViews remoteViews13 = build10.contentView;
                    int i14 = R.id.player_pause;
                    remoteViews13.setViewVisibility(i14, 0);
                    RemoteViews remoteViews14 = build10.contentView;
                    int i15 = R.id.player_play;
                    remoteViews14.setViewVisibility(i15, i);
                    if (supportBigNotifications) {
                        build10.bigContentView.setViewVisibility(i14, 0);
                        build10.bigContentView.setViewVisibility(i15, i);
                    }
                }
            }
            RemoteViews remoteViews15 = build10.contentView;
            int i16 = R.id.player_song_name;
            remoteViews15.setTextViewText(i16, str);
            RemoteViews remoteViews16 = build10.contentView;
            int i17 = R.id.player_author_name;
            remoteViews16.setTextViewText(i17, str2);
            if (supportBigNotifications) {
                build10.bigContentView.setTextViewText(i16, str);
                build10.bigContentView.setTextViewText(i17, str2);
                build10.bigContentView.setTextViewText(R.id.player_album_title, (audioInfo == null || TextUtils.isEmpty(audioInfo.getAlbum())) ? "" : audioInfo.getAlbum());
            }
            build10.flags |= 2;
            startForeground(5, build10);
        }
        if (this.remoteControlClient != null) {
            int id = MediaController.getInstance().getPlayingMessageObject().getId();
            if (this.notificationMessageID != id) {
                this.notificationMessageID = id;
                RemoteControlClient.MetadataEditor editMetadata = this.remoteControlClient.editMetadata(true);
                editMetadata.putString(2, str2);
                editMetadata.putString(7, str);
                if (audioInfo != null && !TextUtils.isEmpty(audioInfo.getAlbum())) {
                    editMetadata.putString(1, audioInfo.getAlbum());
                }
                editMetadata.putLong(9, MediaController.getInstance().getPlayingMessageObject().audioPlayerDuration * 1000);
                if (bitmap4 != null) {
                    try {
                        editMetadata.putBitmap(100, bitmap4);
                    } catch (Throwable th) {
                        FileLog.e(th);
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
                            MusicPlayerService.this.remoteControlClient.setPlaybackState(MediaController.getInstance().isMessagePaused() ? 2 : 3, Math.max(MediaController.getInstance().getPlayingMessageObject().audioProgressSec * 1000, 100L), MediaController.getInstance().isMessagePaused() ? 0.0f : 1.0f);
                            return;
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
            this.remoteControlClient.setPlaybackState(MediaController.getInstance().isMessagePaused() ? 2 : 3, Math.max(MediaController.getInstance().getPlayingMessageObject().audioProgressSec * 1000, 100L), MediaController.getInstance().isMessagePaused() ? 0.0f : 1.0f);
        }
    }

    public void updatePlaybackState(long j) {
        PlaybackState.Builder state;
        PlaybackState build;
        PlaybackState.Builder state2;
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        boolean z = !MediaController.getInstance().isMessagePaused();
        if (MediaController.getInstance().isDownloadingCurrentMessage()) {
            state2 = this.playbackState.setState(6, 0L, 1.0f);
            state2.setActions(0L);
        } else {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            long j2 = (playingMessageObject == null || !playingMessageObject.isMusic()) ? 774L : 822L;
            state = this.playbackState.setState(z ? 3 : 2, j, getPlaybackSpeed(z, playingMessageObject));
            state.setActions(j2);
        }
        MediaSession mediaSession = this.mediaSession;
        build = this.playbackState.build();
        mediaSession.setPlaybackState(build);
    }

    private float getPlaybackSpeed(boolean z, MessageObject messageObject) {
        if (!z) {
            return 0.0f;
        }
        if (messageObject == null) {
            return 1.0f;
        }
        if (messageObject.isVoice() || messageObject.isRoundVideo()) {
            return MediaController.getInstance().getPlaybackSpeed(false);
        }
        return 1.0f;
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
                return;
            } else {
                stopSelf();
                return;
            }
        }
        if (i == NotificationCenter.messagePlayingDidSeek) {
            if (MediaController.getInstance().getPlayingMessageObject() == null) {
                return;
            }
            long round = Math.round(r3.audioPlayerDuration * ((Float) objArr[1]).floatValue()) * 1000;
            updatePlaybackState(round);
            RemoteControlClient remoteControlClient = this.remoteControlClient;
            if (remoteControlClient != null) {
                remoteControlClient.setPlaybackState(MediaController.getInstance().isMessagePaused() ? 2 : 3, round, MediaController.getInstance().isMessagePaused() ? 0.0f : 1.0f);
                return;
            }
            return;
        }
        if (i == NotificationCenter.httpFileDidLoad) {
            String str3 = (String) objArr[0];
            MessageObject playingMessageObject2 = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject2 == null || (str2 = this.loadingFilePath) == null || !str2.equals(str3)) {
                return;
            }
            createNotification(playingMessageObject2, false);
            return;
        }
        if (i == NotificationCenter.fileLoaded) {
            String str4 = (String) objArr[0];
            MessageObject playingMessageObject3 = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject3 == null || (str = this.loadingFilePath) == null || !str.equals(str4)) {
                return;
            }
            createNotification(playingMessageObject3, false);
        }
    }
}
