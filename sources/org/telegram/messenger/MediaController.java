package org.telegram.messenger;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.DownloadManager;
import android.bluetooth.BluetoothAdapter;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.database.ContentObserver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.BitmapDrawable;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.MediaStore;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.view.TextureView;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.FrameLayout;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.f91;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.ie0;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.lf0;
import org.telegram.ui.Components.ru;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.xn;
import org.xmlpull.v1.XmlPullParserException;
public class MediaController implements AudioManager.OnAudioFocusChangeListener, NotificationCenter.NotificationCenterDelegate, SensorEventListener {
    private static final int AUDIO_FOCUSED = 2;
    public static final String AUDIO_MIME_TYPE = "audio/mp4a-latm";
    private static final int AUDIO_NO_FOCUS_CAN_DUCK = 1;
    private static final int AUDIO_NO_FOCUS_NO_DUCK = 0;
    private static volatile MediaController Instance = null;
    public static final int VIDEO_BITRATE_1080 = 6800000;
    public static final int VIDEO_BITRATE_360 = 750000;
    public static final int VIDEO_BITRATE_480 = 1000000;
    public static final int VIDEO_BITRATE_720 = 2621440;
    public static final String VIDEO_MIME_TYPE = "video/avc";
    private static final float VOLUME_DUCK = 0.2f;
    private static final float VOLUME_NORMAL = 1.0f;
    public static AlbumEntry allMediaAlbumEntry;
    public static ArrayList<AlbumEntry> allMediaAlbums;
    public static ArrayList<AlbumEntry> allPhotoAlbums;
    public static AlbumEntry allPhotosAlbumEntry;
    public static AlbumEntry allVideosAlbumEntry;
    private static Runnable broadcastPhotosRunnable;
    private static final ConcurrentHashMap<String, Integer> cachedEncoderBitrates;
    public static boolean forceBroadcastNewPhotos;
    private static final String[] projectionPhotos;
    private static final String[] projectionVideo;
    private static Runnable refreshGalleryRunnable;
    private static long volumeBarLastTimeShown;
    private Sensor accelerometerSensor;
    private boolean accelerometerVertical;
    private boolean allowStartRecord;
    private we.a audioInfo;
    private AudioRecord audioRecorder;
    private boolean audioRecorderPaused;
    private float audioVolume;
    private ValueAnimator audioVolumeAnimator;
    private Activity baseActivity;
    private boolean callInProgress;
    private int countLess;
    private org.telegram.ui.o4 currentAspectRatioFrameLayout;
    private float currentAspectRatioFrameLayoutRatio;
    private boolean currentAspectRatioFrameLayoutReady;
    private int currentAspectRatioFrameLayoutRotation;
    private VideoConvertMessage currentForegroundConvertingVideo;
    private int currentPlaylistNum;
    public MessagesController.SavedMusicList currentSavedMusicList;
    private TextureView currentTextureView;
    private FrameLayout currentTextureViewContainer;
    private boolean downloadingCurrentMessage;
    private ExternalObserver externalObserver;
    private View feedbackView;
    private ByteBuffer fileBuffer;
    private DispatchQueue fileEncodingQueue;
    private org.telegram.ui.ActionBar.p2 flagSecureFragment;
    private boolean forceLoopCurrentPlaylist;
    private MessageObject goingToShowMessageObject;
    private Sensor gravitySensor;
    private int hasAudioFocus;
    private boolean hasRecordAudioFocus;
    private boolean ignoreOnPause;
    private boolean ignorePlayerUpdate;
    private boolean ignoreProximity;
    private boolean inputFieldHasText;
    private InternalObserver internalObserver;
    private boolean isDrawingWasReady;
    private boolean isStreamingCurrentAudio;
    private long lastAccelerometerDetected;
    private int lastChatAccount;
    private long lastChatEnterTime;
    private long lastChatLeaveTime;
    private ArrayList<Long> lastChatVisibleMessages;
    private long lastMediaCheckTime;
    private int lastMessageId;
    private long lastSaveTime;
    private TLRPC.EncryptedChat lastSecretChat;
    private TLRPC.User lastUser;
    private Sensor linearSensor;
    private boolean loadingPlaylist;
    private boolean manualRecording;
    private String[] mediaProjections;
    private PipRoundVideoView pipRoundVideoView;
    private int pipSwitchingState;
    private boolean playMusicAgain;
    private int playerNum;
    private boolean playerWasReady;
    private MessageObject playingMessageObject;
    private int playlistClassGuid;
    private PlaylistGlobalSearchParams playlistGlobalSearchParams;
    private long playlistMergeDialogId;
    private float previousAccValue;
    private boolean proximityHasDifferentValues;
    private Sensor proximitySensor;
    private boolean proximityTouched;
    private PowerManager.WakeLock proximityWakeLock;
    private xn raiseChat;
    private boolean raiseToEarRecord;
    private int raisedToBack;
    private int raisedToTop;
    private int raisedToTopSign;
    private long recordDialogId;
    private long recordMonoForumPeerId;
    private MessageSuggestionParams recordMonoForumSuggestionParams;
    private DispatchQueue recordQueue;
    private MessageObject recordReplyingMsg;
    private TL_stories.StoryItem recordReplyingStory;
    private MessageObject recordReplyingTopMsg;
    private SendMessageChatArguments recordSendMessageChatArguments;
    private Runnable recordStartRunnable;
    private long recordStartTime;
    public long recordTimeCount;
    private long recordTopicId;
    public TLRPC.TL_document recordingAudio;
    private File recordingAudioFile;
    private int recordingCurrentAccount;
    private File recordingPrevAudioFile;
    private MusicListenReporter reporter;
    private boolean resumeAudioOnFocusGain;
    public long samplesCount;
    private SavedMusicPlaylistState savedMusicPlaylistState;
    private float seekToProgressPending;
    private int sendAfterDone;
    private boolean sendAfterDoneNotify;
    private boolean sendAfterDoneOnce;
    private long sendAfterDonePayStars;
    private int sendAfterDoneScheduleDate;
    private SensorManager sensorManager;
    private boolean sensorsStarted;
    private String shouldSavePositionForCurrentAudio;
    private int startObserverToken;
    private StopMediaObserverRunnable stopMediaObserverRunnable;
    private long timeSinceRaise;
    private boolean useFrontSpeaker;
    private k71 videoPlayer;
    private ArrayList<MessageObject> voiceMessagesPlaylist;
    private SparseArray<MessageObject> voiceMessagesPlaylistMap;
    private boolean voiceMessagesPlaylistUnread;
    public int writtenFrame;
    AudioManager.OnAudioFocusChangeListener audioRecordFocusChangedListener = new AudioManager.OnAudioFocusChangeListener() {
        @Override
        public final void onAudioFocusChange(int i10) {
            MediaController.this.lambda$new$0(i10);
        }
    };
    private final Object videoConvertSync = new Object();
    private long lastTimestamp = 0;
    private float lastProximityValue = -100.0f;
    private float[] gravity = new float[3];
    private float[] gravityFast = new float[3];
    private float[] linearAcceleration = new float[3];
    private int audioFocus = 0;
    private ArrayList<VideoConvertMessage> foregroundConvertingMessages = new ArrayList<>();
    private ArrayList<VideoConvertMessage> videoConvertQueue = new ArrayList<>();
    private final Object videoQueueSync = new Object();
    private HashMap<String, MessageObject> generatingWaveform = new HashMap<>();
    public boolean isSilent = false;
    private boolean isPaused = false;
    private boolean wasPlayingAudioBeforePause = false;
    private k71 audioPlayer = null;
    private k71 emojiSoundPlayer = null;
    private int emojiSoundPlayerNum = 0;
    private float currentPlaybackSpeed = 1.0f;
    private float currentMusicPlaybackSpeed = 1.0f;
    private float fastPlaybackSpeed = 1.0f;
    private float fastMusicPlaybackSpeed = 1.0f;
    private long lastProgress = 0;
    private java.util.Timer progressTimer = null;
    private final Object progressTimerSync = new Object();
    private ArrayList<MessageObject> playlist = new ArrayList<>();
    private HashMap<Integer, MessageObject> playlistMap = new HashMap<>();
    private ArrayList<MessageObject> shuffledPlaylist = new ArrayList<>();
    private boolean[] playlistEndReached = {false, false};
    private int[] playlistMaxId = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    private Runnable setLoadingRunnable = new Runnable() {
        {
            MediaController.this = this;
        }

        @Override
        public void run() {
            if (MediaController.this.playingMessageObject == null) {
                return;
            }
            FileLoader.getInstance(MediaController.this.playingMessageObject.currentAccount).setLoadingVideo(MediaController.this.playingMessageObject.getDocument(), true, false);
        }
    };
    private int recordingGuid = -1;
    public short[] recordSamples = new short[1024];
    private final Object sync = new Object();
    private ArrayList<ByteBuffer> recordBuffers = new ArrayList<>();
    public int recordBufferSize = 1280;
    public int sampleRate = 48000;
    private Runnable recordRunnable = new AnonymousClass2();
    private final ValueAnimator.AnimatorUpdateListener audioVolumeUpdateListener = new ValueAnimator.AnimatorUpdateListener() {
        {
            MediaController.this = this;
        }

        @Override
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            MediaController.this.audioVolume = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            MediaController.this.setPlayerVolume();
        }
    };

    public class AnonymousClass2 implements Runnable {
        public AnonymousClass2() {
            MediaController.this = r1;
        }

        public void lambda$run$0(ByteBuffer byteBuffer) {
            MediaController.this.recordBuffers.add(byteBuffer);
        }

        public void lambda$run$1(ByteBuffer byteBuffer, boolean z4) {
            int i10;
            int position;
            while (byteBuffer.hasRemaining()) {
                if (byteBuffer.remaining() > MediaController.this.fileBuffer.remaining()) {
                    i10 = byteBuffer.limit();
                    byteBuffer.limit(byteBuffer.position() + MediaController.this.fileBuffer.remaining());
                } else {
                    i10 = -1;
                }
                MediaController.this.fileBuffer.put(byteBuffer);
                if (MediaController.this.fileBuffer.position() == MediaController.this.fileBuffer.limit() || z4) {
                    MediaController mediaController = MediaController.this;
                    ByteBuffer byteBuffer2 = mediaController.fileBuffer;
                    if (!z4) {
                        position = MediaController.this.fileBuffer.limit();
                    } else {
                        position = byteBuffer.position();
                    }
                    if (mediaController.writeFrame(byteBuffer2, position) != 0) {
                        MediaController.this.fileBuffer.rewind();
                        MediaController mediaController2 = MediaController.this;
                        long j10 = mediaController2.recordTimeCount;
                        MediaController mediaController3 = MediaController.this;
                        mediaController2.recordTimeCount = j10 + ((mediaController2.fileBuffer.limit() / 2) / (mediaController3.sampleRate / 1000));
                        mediaController3.writtenFrame++;
                    } else {
                        FileLog.e("writing frame failed");
                    }
                }
                if (i10 != -1) {
                    byteBuffer.limit(i10);
                }
            }
            MediaController.this.recordQueue.postRunnable(new e3(5, this, byteBuffer));
        }

        public void lambda$run$2(double d) {
            NotificationCenter.getInstance(MediaController.this.recordingCurrentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordProgressChanged, Integer.valueOf(MediaController.this.recordingGuid), Double.valueOf(d));
        }

        @Override
        public void run() {
            ByteBuffer allocateDirect;
            if (MediaController.this.audioRecorder != null) {
                boolean z4 = false;
                if (!MediaController.this.recordBuffers.isEmpty()) {
                    allocateDirect = (ByteBuffer) MediaController.this.recordBuffers.get(0);
                    MediaController.this.recordBuffers.remove(0);
                } else {
                    allocateDirect = ByteBuffer.allocateDirect(MediaController.this.recordBufferSize);
                    allocateDirect.order(ByteOrder.nativeOrder());
                }
                ByteBuffer byteBuffer = allocateDirect;
                byteBuffer.rewind();
                int read = MediaController.this.audioRecorder.read(byteBuffer, byteBuffer.capacity());
                if (read > 0) {
                    byteBuffer.limit(read);
                    double d = 0.0d;
                    try {
                        MediaController mediaController = MediaController.this;
                        long j10 = mediaController.samplesCount;
                        long j11 = (read / 2) + j10;
                        short[] sArr = mediaController.recordSamples;
                        int length = (int) ((j10 / j11) * sArr.length);
                        int length2 = sArr.length - length;
                        float f10 = 0.0f;
                        if (length != 0) {
                            float length3 = sArr.length / length;
                            float f11 = 0.0f;
                            for (int i10 = 0; i10 < length; i10++) {
                                short[] sArr2 = MediaController.this.recordSamples;
                                sArr2[i10] = sArr2[(int) f11];
                                f11 += length3;
                            }
                        }
                        float f12 = (read / 2.0f) / length2;
                        for (int i11 = 0; i11 < read / 2; i11++) {
                            short s6 = byteBuffer.getShort();
                            d += s6 * s6;
                            if (i11 == ((int) f10)) {
                                short[] sArr3 = MediaController.this.recordSamples;
                                if (length < sArr3.length) {
                                    sArr3[length] = s6;
                                    f10 += f12;
                                    length++;
                                }
                            }
                        }
                        MediaController.this.samplesCount = j11;
                    } catch (Exception e6) {
                        FileLog.e(e6);
                    }
                    byteBuffer.position(0);
                    final double sqrt = Math.sqrt((d / read) / 2.0d);
                    if (read != byteBuffer.capacity()) {
                        z4 = true;
                    }
                    MediaController.this.fileEncodingQueue.postRunnable(new q6(this, byteBuffer, z4, 0));
                    MediaController.this.recordQueue.postRunnable(MediaController.this.recordRunnable);
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            MediaController.AnonymousClass2.this.lambda$run$2(sqrt);
                        }
                    });
                    return;
                }
                MediaController.this.recordBuffers.add(byteBuffer);
                if (MediaController.this.sendAfterDone != 3 && MediaController.this.sendAfterDone != 4) {
                    MediaController mediaController2 = MediaController.this;
                    mediaController2.stopRecordingInternal(mediaController2.sendAfterDone, MediaController.this.sendAfterDoneNotify, MediaController.this.sendAfterDoneScheduleDate, MediaController.this.sendAfterDoneOnce, MediaController.this.sendAfterDonePayStars);
                }
            }
        }
    }

    public class AnonymousClass4 extends PhoneStateListener {
        public AnonymousClass4() {
            MediaController.this = r1;
        }

        public void lambda$onCallStateChanged$0(int i10) {
            f91 f91Var;
            f91 f91Var2;
            if (i10 == 1) {
                MediaController mediaController = MediaController.this;
                if (mediaController.isPlayingMessage(mediaController.playingMessageObject) && !MediaController.this.isMessagePaused()) {
                    MediaController mediaController2 = MediaController.this;
                    mediaController2.lambda$startAudioAgain$7(mediaController2.playingMessageObject);
                } else if (MediaController.this.recordStartRunnable != null || MediaController.this.recordingAudio != null) {
                    MediaController.this.stopRecording(2, false, 0, false, 0L);
                }
                ru ruVar = ru.P;
                if (ruVar != null && (f91Var2 = ruVar.f30856c) != null && f91Var2.f26828w) {
                    f91Var2.f26812a.B();
                    f91Var2.n();
                    f91Var2.f26817c0.d(true, true);
                }
                MediaController.this.callInProgress = true;
            } else if (i10 == 0) {
                MediaController.this.callInProgress = false;
            } else if (i10 == 2) {
                ru ruVar2 = ru.P;
                if (ruVar2 != null && (f91Var = ruVar2.f30856c) != null && f91Var.f26828w) {
                    f91Var.f26812a.B();
                    f91Var.n();
                    f91Var.f26817c0.d(true, true);
                }
                MediaController.this.callInProgress = true;
            }
        }

        @Override
        public void onCallStateChanged(int i10, String str) {
            AndroidUtilities.runOnUIThread(new s6(this, i10, 0));
        }
    }

    public class AnonymousClass5 extends TimerTask {
        final MessageObject val$currentPlayingMessageObject;

        public AnonymousClass5(MessageObject messageObject) {
            MediaController.this = r1;
            this.val$currentPlayingMessageObject = messageObject;
        }

        public static void lambda$run$0(String str, float f10) {
            ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putFloat(str, f10).commit();
        }

        public void lambda$run$1(MessageObject messageObject) {
            long p10;
            long n10;
            float f10;
            final float f11;
            float f12;
            if ((MediaController.this.audioPlayer != null || MediaController.this.videoPlayer != null) && !MediaController.this.isPaused) {
                try {
                    if (MediaController.this.videoPlayer != null) {
                        p10 = MediaController.this.videoPlayer.p();
                        n10 = MediaController.this.videoPlayer.n();
                        if (n10 >= 0 && p10 > 0) {
                            float f13 = (float) p10;
                            f12 = ((float) MediaController.this.videoPlayer.j()) / f13;
                            f11 = ((float) n10) / f13;
                            if (f11 >= 1.0f) {
                                return;
                            }
                        }
                        return;
                    }
                    p10 = MediaController.this.audioPlayer.p();
                    n10 = MediaController.this.audioPlayer.n();
                    if (p10 >= 0) {
                        f10 = ((float) n10) / ((float) p10);
                    } else {
                        f10 = 0.0f;
                    }
                    float j10 = ((float) MediaController.this.audioPlayer.j()) / ((float) p10);
                    if (p10 != -9223372036854775807L && n10 >= 0 && MediaController.this.seekToProgressPending == 0.0f) {
                        f11 = f10;
                        f12 = j10;
                    }
                    return;
                    MediaController.this.lastProgress = n10;
                    messageObject.audioPlayerDuration = (int) (p10 / 1000);
                    messageObject.audioProgress = f11;
                    messageObject.audioProgressSec = (int) (MediaController.this.lastProgress / 1000);
                    messageObject.bufferedProgress = f12;
                    if (f11 >= 0.0f && MediaController.this.shouldSavePositionForCurrentAudio != null && SystemClock.elapsedRealtime() - MediaController.this.lastSaveTime >= 1000) {
                        final String str = MediaController.this.shouldSavePositionForCurrentAudio;
                        MediaController.this.lastSaveTime = SystemClock.elapsedRealtime();
                        Utilities.globalQueue.postRunnable(new Runnable() {
                            @Override
                            public final void run() {
                                MediaController.AnonymousClass5.lambda$run$0(str, f11);
                            }
                        });
                    }
                    NotificationCenter.getInstance(messageObject.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagePlayingProgressDidChanged, Integer.valueOf(messageObject.getId()), Float.valueOf(f11));
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
            }
        }

        @Override
        public void run() {
            synchronized (MediaController.this.sync) {
                AndroidUtilities.runOnUIThread(new e3(6, this, this.val$currentPlayingMessageObject));
            }
        }
    }

    public class AnonymousClass7 implements h71 {
        final boolean val$destroyAtEnd;
        final MessageObject val$messageObject;
        final int[] val$playCount;
        final int val$tag;

        public AnonymousClass7(int i10, MessageObject messageObject, int[] iArr, boolean z4) {
            MediaController.this = r1;
            this.val$tag = i10;
            this.val$messageObject = messageObject;
            this.val$playCount = iArr;
            this.val$destroyAtEnd = z4;
        }

        public void lambda$onSurfaceDestroyed$0() {
            MediaController.this.cleanupPlayer(true, true);
        }

        @Override
        public void onError(k71 k71Var, Exception exc) {
            FileLog.e(exc);
        }

        @Override
        public void onRenderedFirstFrame(k3.a aVar) {
        }

        @Override
        public void onStateChanged(boolean z4, int i10) {
            if (this.val$tag == MediaController.this.playerNum) {
                MediaController.this.updateVideoState(this.val$messageObject, this.val$playCount, this.val$destroyAtEnd, z4, i10);
            }
        }

        @Override
        public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
            if (MediaController.this.videoPlayer != null) {
                if (MediaController.this.pipSwitchingState == 2) {
                    if (MediaController.this.currentAspectRatioFrameLayout != null) {
                        if (MediaController.this.isDrawingWasReady) {
                            MediaController.this.currentAspectRatioFrameLayout.setDrawingReady(true);
                        }
                        if (MediaController.this.currentAspectRatioFrameLayout.getParent() == null) {
                            MediaController.this.currentTextureViewContainer.addView(MediaController.this.currentAspectRatioFrameLayout);
                        }
                        if (MediaController.this.currentTextureView.getSurfaceTexture() != surfaceTexture) {
                            MediaController.this.currentTextureView.setSurfaceTexture(surfaceTexture);
                        }
                        MediaController.this.videoPlayer.V(MediaController.this.currentTextureView);
                    }
                    MediaController.this.pipSwitchingState = 0;
                    return true;
                } else if (MediaController.this.pipSwitchingState == 1) {
                    if (MediaController.this.baseActivity != null) {
                        if (MediaController.this.pipRoundVideoView == null) {
                            try {
                                MediaController.this.pipRoundVideoView = new PipRoundVideoView();
                                MediaController.this.pipRoundVideoView.d(MediaController.this.baseActivity, new e1(this, 5));
                            } catch (Exception unused) {
                                MediaController.this.pipRoundVideoView = null;
                            }
                        }
                        if (MediaController.this.pipRoundVideoView != null) {
                            if (MediaController.this.pipRoundVideoView.f24923c.getSurfaceTexture() != surfaceTexture) {
                                MediaController.this.pipRoundVideoView.f24923c.setSurfaceTexture(surfaceTexture);
                            }
                            MediaController.this.videoPlayer.V(MediaController.this.pipRoundVideoView.f24923c);
                        }
                    }
                    MediaController.this.pipSwitchingState = 0;
                    return true;
                } else if (PhotoViewer.C1() && PhotoViewer.t1().P2 != null) {
                    PhotoViewer.t1().Q2 = surfaceTexture;
                    return true;
                }
            }
            return false;
        }

        @Override
        public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
            float f11;
            MediaController.this.currentAspectRatioFrameLayoutRotation = i12;
            if (i12 != 90 && i12 != 270) {
                i11 = i10;
                i10 = i11;
            }
            MediaController mediaController = MediaController.this;
            if (i10 == 0) {
                f11 = 1.0f;
            } else {
                f11 = (i11 * f10) / i10;
            }
            mediaController.currentAspectRatioFrameLayoutRatio = f11;
            if (MediaController.this.currentAspectRatioFrameLayout != null) {
                MediaController.this.currentAspectRatioFrameLayout.a(MediaController.this.currentAspectRatioFrameLayoutRatio, MediaController.this.currentAspectRatioFrameLayoutRotation);
            }
        }

        @Override
        public void onRenderedFirstFrame() {
            if (MediaController.this.currentAspectRatioFrameLayout == null || MediaController.this.currentAspectRatioFrameLayout.d) {
                return;
            }
            MediaController.this.isDrawingWasReady = true;
            MediaController.this.currentAspectRatioFrameLayout.setDrawingReady(true);
            MediaController.this.currentTextureViewContainer.setTag(1);
        }

        @Override
        public void onSeekFinished(k3.a aVar) {
        }

        @Override
        public void onSeekStarted(k3.a aVar) {
        }

        @Override
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public class AnonymousClass8 implements h71 {
        final int val$tag;

        public AnonymousClass8(int i10) {
            MediaController.this = r1;
            this.val$tag = i10;
        }

        public void lambda$onStateChanged$0(int i10, int i11) {
            if (i10 == MediaController.this.emojiSoundPlayerNum && i11 == 4 && MediaController.this.emojiSoundPlayer != null) {
                try {
                    MediaController.this.emojiSoundPlayer.H();
                    MediaController.this.emojiSoundPlayer = null;
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
            }
        }

        @Override
        public void onRenderedFirstFrame() {
        }

        @Override
        public void onStateChanged(boolean z4, int i10) {
            AndroidUtilities.runOnUIThread(new u6(this, this.val$tag, i10, 0));
        }

        @Override
        public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
            return false;
        }

        @Override
        public void onRenderedFirstFrame(k3.a aVar) {
        }

        @Override
        public void onSeekFinished(k3.a aVar) {
        }

        @Override
        public void onSeekStarted(k3.a aVar) {
        }

        @Override
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override
        public void onError(k71 k71Var, Exception exc) {
        }

        @Override
        public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
        }
    }

    public class AnonymousClass9 implements h71 {
        final boolean val$destroyAtEnd;
        final MessageObject val$messageObject;
        final int[] val$playCount;
        final int val$tag;

        public AnonymousClass9(int i10, MessageObject messageObject, int[] iArr, boolean z4) {
            MediaController.this = r1;
            this.val$tag = i10;
            this.val$messageObject = messageObject;
            this.val$playCount = iArr;
            this.val$destroyAtEnd = z4;
        }

        public void lambda$onSurfaceDestroyed$0() {
            MediaController.this.cleanupPlayer(true, true);
        }

        @Override
        public void onError(k71 k71Var, Exception exc) {
            FileLog.e(exc);
        }

        @Override
        public void onRenderedFirstFrame(k3.a aVar) {
        }

        @Override
        public void onStateChanged(boolean z4, int i10) {
            if (this.val$tag == MediaController.this.playerNum) {
                MediaController.this.updateVideoState(this.val$messageObject, this.val$playCount, this.val$destroyAtEnd, z4, i10);
            }
        }

        @Override
        public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
            if (MediaController.this.videoPlayer != null) {
                if (MediaController.this.pipSwitchingState == 2) {
                    if (MediaController.this.currentAspectRatioFrameLayout != null) {
                        if (MediaController.this.isDrawingWasReady) {
                            MediaController.this.currentAspectRatioFrameLayout.setDrawingReady(true);
                        }
                        if (MediaController.this.currentAspectRatioFrameLayout.getParent() == null) {
                            MediaController.this.currentTextureViewContainer.addView(MediaController.this.currentAspectRatioFrameLayout);
                        }
                        if (MediaController.this.currentTextureView.getSurfaceTexture() != surfaceTexture) {
                            MediaController.this.currentTextureView.setSurfaceTexture(surfaceTexture);
                        }
                        MediaController.this.videoPlayer.V(MediaController.this.currentTextureView);
                    }
                    MediaController.this.pipSwitchingState = 0;
                    return true;
                } else if (MediaController.this.pipSwitchingState == 1) {
                    if (MediaController.this.baseActivity != null) {
                        if (MediaController.this.pipRoundVideoView == null) {
                            try {
                                MediaController.this.pipRoundVideoView = new PipRoundVideoView();
                                MediaController.this.pipRoundVideoView.d(MediaController.this.baseActivity, new e1(this, 6));
                            } catch (Exception unused) {
                                MediaController.this.pipRoundVideoView = null;
                            }
                        }
                        if (MediaController.this.pipRoundVideoView != null) {
                            if (MediaController.this.pipRoundVideoView.f24923c.getSurfaceTexture() != surfaceTexture) {
                                MediaController.this.pipRoundVideoView.f24923c.setSurfaceTexture(surfaceTexture);
                            }
                            MediaController.this.videoPlayer.V(MediaController.this.pipRoundVideoView.f24923c);
                        }
                    }
                    MediaController.this.pipSwitchingState = 0;
                    return true;
                } else if (PhotoViewer.C1() && PhotoViewer.t1().P2 != null) {
                    PhotoViewer.t1().Q2 = surfaceTexture;
                    return true;
                }
            }
            return false;
        }

        @Override
        public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
            float f11;
            MediaController.this.currentAspectRatioFrameLayoutRotation = i12;
            if (i12 != 90 && i12 != 270) {
                i11 = i10;
                i10 = i11;
            }
            MediaController mediaController = MediaController.this;
            if (i10 == 0) {
                f11 = 1.0f;
            } else {
                f11 = (i11 * f10) / i10;
            }
            mediaController.currentAspectRatioFrameLayoutRatio = f11;
            if (MediaController.this.currentAspectRatioFrameLayout != null) {
                MediaController.this.currentAspectRatioFrameLayout.a(MediaController.this.currentAspectRatioFrameLayoutRatio, MediaController.this.currentAspectRatioFrameLayoutRotation);
            }
        }

        @Override
        public void onRenderedFirstFrame() {
            if (MediaController.this.currentAspectRatioFrameLayout != null && !MediaController.this.currentAspectRatioFrameLayout.d) {
                MediaController.this.isDrawingWasReady = true;
                MediaController.this.currentAspectRatioFrameLayout.setDrawingReady(true);
                MediaController.this.currentTextureViewContainer.setTag(1);
            }
            if (MediaController.this.videoPlayer == null || !d1.f.u()) {
                return;
            }
            MediaController.this.videoPlayer.O(true);
        }

        @Override
        public void onSeekFinished(k3.a aVar) {
        }

        @Override
        public void onSeekStarted(k3.a aVar) {
        }

        @Override
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public static class AlbumEntry {
        public int bucketId;
        public String bucketName;
        public PhotoEntry coverPhoto;
        public ArrayList<PhotoEntry> photos = new ArrayList<>();
        public SparseArray<PhotoEntry> photosByIds = new SparseArray<>();
        public boolean videoOnly;

        public AlbumEntry(int i10, String str, PhotoEntry photoEntry) {
            this.bucketId = i10;
            this.bucketName = str;
            this.coverPhoto = photoEntry;
        }

        public void addPhoto(PhotoEntry photoEntry) {
            this.photos.add(photoEntry);
            this.photosByIds.put(photoEntry.imageId, photoEntry);
        }
    }

    public static class AudioBuffer {
        ByteBuffer buffer;
        byte[] bufferBytes;
        int finished;
        long pcmOffset;
        int size;

        public AudioBuffer(int i10) {
            this.buffer = ByteBuffer.allocateDirect(i10);
            this.bufferBytes = new byte[i10];
        }
    }

    public static class AudioEntry {
        public String author;
        public int duration;
        public String genre;
        public long f18048id;
        public MessageObject messageObject;
        public String path;
        public String title;
    }

    public static class CropState extends TLObject {
        public static final int constructor = 1151577037;
        public float cropPx;
        public float cropPy;
        public float cropRotate;
        public boolean freeform;
        public int height;
        public boolean initied;
        public float lockedAspectRatio;
        public Matrix matrix;
        public boolean mirrored;
        public int orientation;
        public float scale;
        public float stateScale;
        public int transformHeight;
        public int transformRotation;
        public int transformWidth;
        public Matrix useMatrix;
        public int width;
        public float cropScale = 1.0f;
        public float cropPw = 1.0f;
        public float cropPh = 1.0f;

        public boolean isEmpty() {
            Matrix matrix = this.matrix;
            if (matrix == null || matrix.isIdentity()) {
                Matrix matrix2 = this.useMatrix;
                if ((matrix2 == null || matrix2.isIdentity()) && this.cropPw == 1.0f && this.cropPh == 1.0f && this.cropScale == 1.0f && this.cropRotate == 0.0f && this.transformWidth == 0 && this.transformHeight == 0 && this.transformRotation == 0 && !this.mirrored && this.stateScale == 0.0f && this.scale == 0.0f && this.width == 0 && this.height == 0 && !this.freeform && this.lockedAspectRatio == 0.0f) {
                    return true;
                }
                return false;
            }
            return false;
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.cropPx = inputSerializedData.readFloat(z4);
            this.cropPy = inputSerializedData.readFloat(z4);
            this.cropScale = inputSerializedData.readFloat(z4);
            this.cropRotate = inputSerializedData.readFloat(z4);
            this.cropPw = inputSerializedData.readFloat(z4);
            this.cropPh = inputSerializedData.readFloat(z4);
            this.transformWidth = inputSerializedData.readInt32(z4);
            this.transformHeight = inputSerializedData.readInt32(z4);
            this.transformRotation = inputSerializedData.readInt32(z4);
            this.mirrored = inputSerializedData.readBool(z4);
            this.stateScale = inputSerializedData.readFloat(z4);
            this.scale = inputSerializedData.readFloat(z4);
            float[] fArr = new float[9];
            for (int i10 = 0; i10 < 9; i10++) {
                fArr[i10] = inputSerializedData.readFloat(z4);
            }
            Matrix matrix = new Matrix();
            this.matrix = matrix;
            matrix.setValues(fArr);
            this.width = inputSerializedData.readInt32(z4);
            this.height = inputSerializedData.readInt32(z4);
            this.freeform = inputSerializedData.readBool(z4);
            this.lockedAspectRatio = inputSerializedData.readFloat(z4);
            if (inputSerializedData.readInt32(z4) == 178403937) {
                for (int i11 = 0; i11 < 9; i11++) {
                    fArr[i11] = inputSerializedData.readFloat(z4);
                }
                Matrix matrix2 = new Matrix();
                this.useMatrix = matrix2;
                matrix2.setValues(fArr);
            }
            this.initied = inputSerializedData.readBool(z4);
            this.orientation = inputSerializedData.readInt32(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1151577037);
            outputSerializedData.writeFloat(this.cropPx);
            outputSerializedData.writeFloat(this.cropPy);
            outputSerializedData.writeFloat(this.cropScale);
            outputSerializedData.writeFloat(this.cropRotate);
            outputSerializedData.writeFloat(this.cropPw);
            outputSerializedData.writeFloat(this.cropPh);
            outputSerializedData.writeInt32(this.transformWidth);
            outputSerializedData.writeInt32(this.transformHeight);
            outputSerializedData.writeInt32(this.transformRotation);
            outputSerializedData.writeBool(this.mirrored);
            outputSerializedData.writeFloat(this.stateScale);
            outputSerializedData.writeFloat(this.scale);
            float[] fArr = new float[9];
            Matrix matrix = this.matrix;
            if (matrix != null) {
                matrix.getValues(fArr);
            } else {
                for (int i10 = 0; i10 < 9; i10++) {
                    fArr[i10] = 0.0f;
                }
            }
            for (int i11 = 0; i11 < 9; i11++) {
                outputSerializedData.writeFloat(fArr[i11]);
            }
            outputSerializedData.writeInt32(this.width);
            outputSerializedData.writeInt32(this.height);
            outputSerializedData.writeBool(this.freeform);
            outputSerializedData.writeFloat(this.lockedAspectRatio);
            if (this.useMatrix == null) {
                outputSerializedData.writeInt32(1450380236);
            } else {
                outputSerializedData.writeInt32(178403937);
                this.useMatrix.getValues(fArr);
                for (int i12 = 0; i12 < 9; i12++) {
                    outputSerializedData.writeFloat(fArr[i12]);
                }
            }
            outputSerializedData.writeBool(this.initied);
            outputSerializedData.writeInt32(this.orientation);
        }

        public CropState clone() {
            CropState cropState = new CropState();
            cropState.cropPx = this.cropPx;
            cropState.cropPy = this.cropPy;
            cropState.cropScale = this.cropScale;
            cropState.cropRotate = this.cropRotate;
            cropState.cropPw = this.cropPw;
            cropState.cropPh = this.cropPh;
            cropState.transformWidth = this.transformWidth;
            cropState.transformHeight = this.transformHeight;
            cropState.transformRotation = this.transformRotation;
            cropState.mirrored = this.mirrored;
            cropState.stateScale = this.stateScale;
            cropState.scale = this.scale;
            cropState.matrix = this.matrix;
            cropState.width = this.width;
            cropState.height = this.height;
            cropState.freeform = this.freeform;
            cropState.lockedAspectRatio = this.lockedAspectRatio;
            cropState.orientation = this.orientation;
            cropState.initied = this.initied;
            cropState.useMatrix = this.useMatrix;
            return cropState;
        }
    }

    public class ExternalObserver extends ContentObserver {
        public ExternalObserver() {
            super(null);
            MediaController.this = r1;
        }

        @Override
        public void onChange(boolean z4) {
            super.onChange(z4);
            MediaController.this.processMediaObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        }
    }

    public static class GalleryObserverExternal extends ContentObserver {
        public GalleryObserverExternal() {
            super(null);
        }

        public static void lambda$onChange$0() {
            Runnable unused = MediaController.refreshGalleryRunnable = null;
            MediaController.loadGalleryPhotosAlbums(0);
        }

        @Override
        public void onChange(boolean z4) {
            super.onChange(z4);
            if (MediaController.refreshGalleryRunnable != null) {
                AndroidUtilities.cancelRunOnUIThread(MediaController.refreshGalleryRunnable);
            }
            AndroidUtilities.runOnUIThread(MediaController.refreshGalleryRunnable = new x1(1), 2000L);
        }
    }

    public static class GalleryObserverInternal extends ContentObserver {
        public GalleryObserverInternal() {
            super(null);
        }

        public void lambda$scheduleReloadRunnable$0() {
            if (!PhotoViewer.t1().Q1()) {
                Runnable unused = MediaController.refreshGalleryRunnable = null;
                MediaController.loadGalleryPhotosAlbums(0);
                return;
            }
            scheduleReloadRunnable();
        }

        private void scheduleReloadRunnable() {
            AndroidUtilities.runOnUIThread(MediaController.refreshGalleryRunnable = new e1(this, 7), 2000L);
        }

        @Override
        public void onChange(boolean z4) {
            super.onChange(z4);
            if (MediaController.refreshGalleryRunnable != null) {
                AndroidUtilities.cancelRunOnUIThread(MediaController.refreshGalleryRunnable);
            }
            scheduleReloadRunnable();
        }
    }

    public class InternalObserver extends ContentObserver {
        public InternalObserver() {
            super(null);
            MediaController.this = r1;
        }

        @Override
        public void onChange(boolean z4) {
            super.onChange(z4);
            MediaController.this.processMediaObserver(MediaStore.Images.Media.INTERNAL_CONTENT_URI);
        }
    }

    public static class MediaEditState {
        public long averageDuration;
        public CharSequence caption;
        public String coverPath;
        public TLRPC.Photo coverPhoto;
        public Object coverPhotoParentObject;
        public long coverSavedPosition;
        public CropState cropState;
        public ArrayList<VideoEditedInfo.MediaEntity> croppedMediaEntities;
        public String croppedPaintPath;
        public VideoEditedInfo editedInfo;
        public long effectId;
        public ArrayList<TLRPC.MessageEntity> entities;
        public String filterPath;
        public String fullPaintPath;
        public Boolean highQuality;
        public String imagePath;
        public boolean isCropped;
        public boolean isFiltered;
        public boolean isPainted;
        public boolean isVideo;
        public long livePhotoVideoOffset;
        public ArrayList<VideoEditedInfo.MediaEntity> mediaEntities;
        public String paintPath;
        public SavedFilterState savedFilterState;
        public ArrayList<TLRPC.InputDocument> stickers;
        public String thumbPath;
        public int ttl;

        public void copyFrom(MediaEditState mediaEditState) {
            this.caption = mediaEditState.caption;
            this.thumbPath = mediaEditState.thumbPath;
            this.imagePath = mediaEditState.imagePath;
            this.filterPath = mediaEditState.filterPath;
            this.paintPath = mediaEditState.paintPath;
            this.croppedPaintPath = mediaEditState.croppedPaintPath;
            this.fullPaintPath = mediaEditState.fullPaintPath;
            this.entities = mediaEditState.entities;
            this.savedFilterState = mediaEditState.savedFilterState;
            this.mediaEntities = mediaEditState.mediaEntities;
            this.croppedMediaEntities = mediaEditState.croppedMediaEntities;
            this.stickers = mediaEditState.stickers;
            this.editedInfo = mediaEditState.editedInfo;
            this.averageDuration = mediaEditState.averageDuration;
            this.isFiltered = mediaEditState.isFiltered;
            this.isPainted = mediaEditState.isPainted;
            this.isCropped = mediaEditState.isCropped;
            this.livePhotoVideoOffset = mediaEditState.livePhotoVideoOffset;
            this.ttl = mediaEditState.ttl;
            this.cropState = mediaEditState.cropState;
            this.coverPath = mediaEditState.coverPath;
            this.highQuality = mediaEditState.highQuality;
        }

        public String getPath() {
            return null;
        }

        public boolean isHighQuality() {
            Boolean bool = this.highQuality;
            if (bool == null) {
                return SharedConfig.photoHighQualityDefault;
            }
            return bool.booleanValue();
        }

        public boolean isLivePhoto() {
            if ((this instanceof PhotoEntry) && ((PhotoEntry) this).isLivePhoto()) {
                return true;
            }
            return false;
        }

        public void reset() {
            this.caption = null;
            this.coverPath = null;
            this.coverPhoto = null;
            this.coverPhotoParentObject = null;
            this.thumbPath = null;
            this.filterPath = null;
            this.imagePath = null;
            this.paintPath = null;
            this.fullPaintPath = null;
            this.croppedPaintPath = null;
            this.isFiltered = false;
            this.isPainted = false;
            this.isCropped = false;
            this.ttl = 0;
            this.mediaEntities = null;
            this.editedInfo = null;
            this.entities = null;
            this.savedFilterState = null;
            this.stickers = null;
            this.cropState = null;
            this.highQuality = null;
        }
    }

    public static class MediaLoader implements NotificationCenter.NotificationCenterDelegate {
        private boolean cancelled;
        private int copiedFiles;
        private AccountInstance currentAccount;
        private boolean finished;
        private float finishedProgress;
        private boolean isMusic;
        private HashMap<String, MessageObject> loadingMessageObjects = new HashMap<>();
        private ArrayList<MessageObject> messageObjects;
        private MessagesStorage.IntCallback onFinishRunnable;
        private org.telegram.ui.ActionBar.d2 progressDialog;
        private CountDownLatch waitingForFile;

        public MediaLoader(Context context, AccountInstance accountInstance, ArrayList<MessageObject> arrayList, MessagesStorage.IntCallback intCallback) {
            oh.b bVar;
            this.currentAccount = accountInstance;
            this.messageObjects = arrayList;
            this.onFinishRunnable = intCallback;
            this.isMusic = arrayList.get(0).isMusic();
            this.currentAccount.getNotificationCenter().addObserver(this, NotificationCenter.fileLoaded);
            this.currentAccount.getNotificationCenter().addObserver(this, NotificationCenter.fileLoadProgressChanged);
            this.currentAccount.getNotificationCenter().addObserver(this, NotificationCenter.fileLoadFailed);
            if (PhotoViewer.t1().Q1()) {
                bVar = new oh.b();
            } else {
                bVar = null;
            }
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(context, 2, bVar);
            this.progressDialog = d2Var;
            d2Var.m(LocaleController.getString(R.string.Loading));
            this.progressDialog.setCancelable(true);
            org.telegram.ui.ActionBar.d2 d2Var2 = this.progressDialog;
            d2Var2.E = true;
            d2Var2.setOnCancelListener(new y5(this, 3));
        }

        private void addMessageToLoad(MessageObject messageObject) {
            AndroidUtilities.runOnUIThread(new e3(7, this, messageObject));
        }

        private void checkIfFinished() {
            if (!this.loadingMessageObjects.isEmpty()) {
                return;
            }
            AndroidUtilities.runOnUIThread(new w6(this, 4));
        }

        private boolean copyFile(java.io.File r27, java.io.File r28, java.lang.String r29) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.MediaLoader.copyFile(java.io.File, java.io.File, java.lang.String):boolean");
        }

        public void lambda$addMessageToLoad$7(MessageObject messageObject) {
            int i10;
            TLRPC.Document document = messageObject.getDocument();
            TLRPC.Document document2 = messageObject.qualityToSave;
            if (document2 != null) {
                document = document2;
            }
            if (document == null) {
                return;
            }
            this.loadingMessageObjects.put(FileLoader.getAttachFileName(document), messageObject);
            FileLoader fileLoader = this.currentAccount.getFileLoader();
            if (messageObject.shouldEncryptPhotoOrVideo()) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            fileLoader.loadFile(document, messageObject, 3, i10);
        }

        public void lambda$checkIfFinished$3() {
            this.onFinishRunnable.run(this.copiedFiles);
        }

        public void lambda$checkIfFinished$4() {
            try {
                if (this.progressDialog.isShowing()) {
                    this.progressDialog.dismiss();
                } else {
                    this.finished = true;
                }
                if (this.onFinishRunnable != null) {
                    AndroidUtilities.runOnUIThread(new w6(this, 3));
                }
            } catch (Exception e6) {
                FileLog.e(e6);
            }
            this.currentAccount.getNotificationCenter().removeObserver(this, NotificationCenter.fileLoaded);
            this.currentAccount.getNotificationCenter().removeObserver(this, NotificationCenter.fileLoadProgressChanged);
            this.currentAccount.getNotificationCenter().removeObserver(this, NotificationCenter.fileLoadFailed);
        }

        public void lambda$copyFile$10(int i10) {
            try {
                this.progressDialog.n(i10);
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }

        public void lambda$copyFile$8() {
            try {
                this.progressDialog.dismiss();
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }

        public void lambda$copyFile$9(int i10) {
            try {
                this.progressDialog.n(i10);
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }

        public void lambda$didReceivedNotification$11(int i10) {
            try {
                this.progressDialog.n(i10);
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }

        public void lambda$new$0(DialogInterface dialogInterface) {
            this.cancelled = true;
        }

        public void lambda$processLivePhotoMessage$5(boolean z4, TLRPC.PhotoSize photoSize, MessageObject messageObject, TLRPC.Photo photo, boolean z10, TLRPC.Document document) {
            MessageObject messageObject2;
            if (z4) {
                this.loadingMessageObjects.put(FileLoader.getAttachFileName(photoSize), messageObject);
                messageObject2 = messageObject;
                this.currentAccount.getFileLoader().loadFile(ImageLocation.getForPhoto(photoSize, photo), messageObject2, "jpg", 3, 0);
            } else {
                messageObject2 = messageObject;
            }
            if (z10) {
                this.loadingMessageObjects.put(FileLoader.getAttachFileName(document), messageObject2);
                this.currentAccount.getFileLoader().loadFile(document, messageObject2, 3, 0);
            }
        }

        public void lambda$processLivePhotoMessage$6(int i10) {
            try {
                this.progressDialog.n(i10);
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }

        public void lambda$start$1() {
            if (!this.finished) {
                this.progressDialog.show();
            }
        }

        public void lambda$start$2() {
            File externalStoragePublicDirectory;
            File file;
            String str;
            int i10;
            String absolutePath;
            File file2;
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    int size = this.messageObjects.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        MessageObject messageObject = this.messageObjects.get(i11);
                        if (!processLivePhotoMessage(messageObject)) {
                            String str2 = messageObject.messageOwner.attachPath;
                            TLRPC.Document document = messageObject.getDocument();
                            TLRPC.Document document2 = messageObject.qualityToSave;
                            if (document2 != null) {
                                str2 = null;
                                document = document2;
                            }
                            String documentFileName = FileLoader.getDocumentFileName(document);
                            if (str2 != null && str2.length() > 0 && !new File(str2).exists()) {
                                str2 = null;
                            }
                            if (TextUtils.isEmpty(str2)) {
                                FileLoader fileLoader = FileLoader.getInstance(this.currentAccount.getCurrentAccount());
                                TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
                                TLRPC.Document document3 = messageObject.qualityToSave;
                                if (document3 != null) {
                                    file2 = fileLoader.getPathToAttach(document3, null, false, true);
                                } else {
                                    File pathToMessage = fileLoader.getPathToMessage(messageObject.messageOwner, true);
                                    if (media instanceof TLRPC.TL_messageMediaDocument) {
                                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) media;
                                        if (!tL_messageMediaDocument.alt_documents.isEmpty()) {
                                            file2 = fileLoader.getPathToAttach(tL_messageMediaDocument.alt_documents.get(0), null, false, true);
                                        }
                                    }
                                    file2 = pathToMessage;
                                }
                                str2 = file2.toString();
                            }
                            File file3 = new File(str2);
                            if (!file3.exists()) {
                                this.waitingForFile = new CountDownLatch(1);
                                addMessageToLoad(messageObject);
                                this.waitingForFile.await();
                            }
                            if (this.cancelled) {
                                break;
                            }
                            if (!file3.exists()) {
                                file3 = FileLoader.getInstance(this.currentAccount.getCurrentAccount()).getPathToAttach(messageObject.messageOwner, true);
                                StringBuilder sb = new StringBuilder();
                                sb.append("saving file: correcting path from ");
                                sb.append(str2);
                                sb.append(" to ");
                                if (file3 == null) {
                                    absolutePath = null;
                                } else {
                                    absolutePath = file3.getAbsolutePath();
                                }
                                sb.append(absolutePath);
                                FileLog.d(sb.toString());
                            }
                            if (file3 != null && file3.exists()) {
                                if (this.isMusic) {
                                    i10 = 3;
                                } else {
                                    i10 = 2;
                                }
                                MediaController.saveFileInternal(i10, file3, documentFileName);
                                this.copiedFiles++;
                            }
                        }
                    }
                } else {
                    if (this.isMusic) {
                        externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC);
                    } else {
                        externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                    }
                    externalStoragePublicDirectory.mkdir();
                    int size2 = this.messageObjects.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        MessageObject messageObject2 = this.messageObjects.get(i12);
                        if (!processLivePhotoMessage(messageObject2)) {
                            TLRPC.Document document4 = messageObject2.getDocument();
                            TLRPC.Document document5 = messageObject2.qualityToSave;
                            if (document5 != null) {
                                document4 = document5;
                            }
                            String documentFileName2 = FileLoader.getDocumentFileName(document4);
                            File file4 = new File(externalStoragePublicDirectory, documentFileName2);
                            if (file4.exists()) {
                                int lastIndexOf = documentFileName2.lastIndexOf(46);
                                int i13 = 0;
                                while (true) {
                                    if (i13 >= 10) {
                                        break;
                                    }
                                    if (lastIndexOf != -1) {
                                        str = documentFileName2.substring(0, lastIndexOf) + "(" + (i13 + 1) + ")" + documentFileName2.substring(lastIndexOf);
                                    } else {
                                        str = documentFileName2 + "(" + (i13 + 1) + ")";
                                    }
                                    File file5 = new File(externalStoragePublicDirectory, str);
                                    if (!file5.exists()) {
                                        file4 = file5;
                                        break;
                                    } else {
                                        i13++;
                                        file4 = file5;
                                    }
                                }
                            }
                            if (!file4.exists()) {
                                file4.createNewFile();
                            }
                            String str3 = messageObject2.messageOwner.attachPath;
                            if (messageObject2.qualityToSave != null) {
                                str3 = null;
                            }
                            if (str3 != null && str3.length() > 0 && !new File(str3).exists()) {
                                str3 = null;
                            }
                            if (messageObject2.qualityToSave != null) {
                                file = FileLoader.getInstance(this.currentAccount.getCurrentAccount()).getPathToAttach(messageObject2.qualityToSave, null, false, true);
                            } else {
                                if (str3 == null || str3.length() == 0) {
                                    str3 = FileLoader.getInstance(this.currentAccount.getCurrentAccount()).getPathToMessage(messageObject2.messageOwner).toString();
                                }
                                file = new File(str3);
                            }
                            if (!file.exists()) {
                                this.waitingForFile = new CountDownLatch(1);
                                addMessageToLoad(messageObject2);
                                this.waitingForFile.await();
                            }
                            if (file.exists()) {
                                copyFile(file, file4, messageObject2.getMimeType());
                                this.copiedFiles++;
                            }
                        }
                    }
                }
                checkIfFinished();
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }

        private boolean processLivePhotoMessage(MessageObject messageObject) {
            TLRPC.MessageMedia media;
            TLRPC.Photo photo;
            TLRPC.PhotoSize closestPhotoSizeWithSize;
            ?? r22;
            ?? r62;
            boolean z4 = false;
            if (!messageObject.isLivePhoto() || (media = MessageObject.getMedia(messageObject.messageOwner)) == null || (photo = media.photo) == null || media.document == null || (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize(true), false, null, true)) == null) {
                return false;
            }
            FileLoader fileLoader = FileLoader.getInstance(this.currentAccount.getCurrentAccount());
            File pathToAttach = fileLoader.getPathToAttach(closestPhotoSizeWithSize, null, false, true);
            File pathToAttach2 = fileLoader.getPathToAttach(media.document, null, false, true);
            if (pathToAttach != null && pathToAttach.exists()) {
                r22 = 0;
            } else {
                r22 = 1;
            }
            if (pathToAttach2 != null && pathToAttach2.exists()) {
                r62 = 0;
            } else {
                r62 = 1;
            }
            int i10 = r22 + r62;
            if (i10 > 0) {
                this.waitingForFile = new CountDownLatch(i10);
                AndroidUtilities.runOnUIThread(new x6(this, (boolean) r22, closestPhotoSizeWithSize, messageObject, media.photo, (boolean) r62, media.document));
                this.waitingForFile.await();
            }
            if (!this.cancelled) {
                if (pathToAttach == null || !pathToAttach.exists()) {
                    pathToAttach = fileLoader.getPathToAttach(closestPhotoSizeWithSize, null, true, true);
                }
                if (pathToAttach2 == null || !pathToAttach2.exists()) {
                    pathToAttach2 = fileLoader.getPathToAttach(media.document, null, true, true);
                }
                if (pathToAttach != null && pathToAttach.exists() && pathToAttach2 != null && pathToAttach2.exists()) {
                    String fileExtension = FileLoader.getFileExtension(pathToAttach);
                    if (TextUtils.isEmpty(fileExtension)) {
                        fileExtension = "jpg";
                    }
                    String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtension.toLowerCase());
                    if (TextUtils.isEmpty(mimeTypeFromExtension)) {
                        mimeTypeFromExtension = "image/jpeg";
                    }
                    String generateFileName = AndroidUtilities.generateFileName(0, fileExtension);
                    if (Build.VERSION.SDK_INT >= 29) {
                        ContentValues contentValues = new ContentValues();
                        Uri contentUri = MediaStore.Downloads.getContentUri("external_primary");
                        contentValues.put("relative_path", new File(Environment.DIRECTORY_DOWNLOADS, "Telegram") + File.separator);
                        contentValues.put("_display_name", generateFileName);
                        contentValues.put("mime_type", mimeTypeFromExtension);
                        Uri insert = ApplicationLoader.applicationContext.getContentResolver().insert(contentUri, contentValues);
                        if (insert != null) {
                            OutputStream openOutputStream = ApplicationLoader.applicationContext.getContentResolver().openOutputStream(insert);
                            if (openOutputStream != null) {
                                try {
                                    MediaController.writeMotionPhoto(pathToAttach, pathToAttach2, openOutputStream, null);
                                    z4 = !this.cancelled;
                                } catch (Throwable th2) {
                                    try {
                                        openOutputStream.close();
                                    } catch (Throwable th3) {
                                        th2.addSuppressed(th3);
                                    }
                                    throw th2;
                                }
                            }
                            if (openOutputStream != null) {
                                openOutputStream.close();
                            }
                            if (z4) {
                                this.copiedFiles++;
                            } else {
                                try {
                                    ApplicationLoader.applicationContext.getContentResolver().delete(insert, null, null);
                                } catch (Exception unused) {
                                }
                            }
                        }
                    } else {
                        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "Telegram");
                        file.mkdirs();
                        File file2 = new File(file, generateFileName);
                        if (!file2.exists()) {
                            file2.createNewFile();
                        }
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        try {
                            MediaController.writeMotionPhoto(pathToAttach, pathToAttach2, fileOutputStream, null);
                            fileOutputStream.close();
                            if (this.cancelled) {
                                file2.delete();
                            } else {
                                ((DownloadManager) ApplicationLoader.applicationContext.getSystemService("download")).addCompletedDownload(file2.getName(), file2.getName(), false, mimeTypeFromExtension, file2.getAbsolutePath(), file2.length(), true);
                                this.copiedFiles++;
                            }
                        } catch (Throwable th4) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                            }
                            throw th4;
                        }
                    }
                    float size = (100.0f / this.messageObjects.size()) + this.finishedProgress;
                    this.finishedProgress = size;
                    AndroidUtilities.runOnUIThread(new v6(this, (int) size, 3));
                    return true;
                }
            }
            return true;
        }

        @Override
        public void didReceivedNotification(int i10, int i11, Object... objArr) {
            if (i10 != NotificationCenter.fileLoaded && i10 != NotificationCenter.fileLoadFailed) {
                if (i10 == NotificationCenter.fileLoadProgressChanged) {
                    if (this.loadingMessageObjects.containsKey((String) objArr[0])) {
                        AndroidUtilities.runOnUIThread(new v6(this, (int) w.c.c(((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue()), this.messageObjects.size(), 100.0f, this.finishedProgress), 0));
                        return;
                    }
                    return;
                }
                return;
            }
            if (this.loadingMessageObjects.remove((String) objArr[0]) != null) {
                this.waitingForFile.countDown();
            }
        }

        public void start() {
            AndroidUtilities.runOnUIThread(new w6(this, 0), 250L);
            new Thread(new w6(this, 1)).start();
        }
    }

    public static class MusicListenReporter {
        private TLRPC.InputDocument audio;
        public final int currentAccount;
        private long rangeStart = -9223372036854775807L;
        private final ArrayList<Pair<Long, Long>> ranges = new ArrayList<>();
        private final Runnable reportRunnable = new e1(this, 8);

        public MusicListenReporter(int i10) {
            this.currentAccount = i10;
        }

        private long getTotalListened() {
            ArrayList<Pair<Long, Long>> arrayList = this.ranges;
            int size = arrayList.size();
            long j10 = 0;
            int i10 = 0;
            while (i10 < size) {
                Pair<Long, Long> pair = arrayList.get(i10);
                i10++;
                Pair<Long, Long> pair2 = pair;
                j10 += ((Long) pair2.second).longValue() - ((Long) pair2.first).longValue();
            }
            return j10;
        }

        public void listenedRange(long j10, long j11) {
            int i10 = 0;
            while (i10 < this.ranges.size() && ((Long) this.ranges.get(i10).first).longValue() <= j10) {
                i10++;
            }
            this.ranges.add(i10, new Pair<>(Long.valueOf(j10), Long.valueOf(j11)));
            int max = Math.max(0, i10 - 1);
            while (max < this.ranges.size() - 1) {
                Pair<Long, Long> pair = this.ranges.get(max);
                int i11 = max + 1;
                Pair<Long, Long> pair2 = this.ranges.get(i11);
                if (((Long) pair.second).longValue() >= ((Long) pair2.first).longValue()) {
                    this.ranges.set(max, new Pair<>((Long) pair.first, Long.valueOf(Math.max(((Long) pair.second).longValue(), ((Long) pair2.second).longValue()))));
                    this.ranges.remove(i11);
                } else {
                    max = i11;
                }
            }
        }

        public void report() {
            AndroidUtilities.cancelRunOnUIThread(this.reportRunnable);
            if (this.audio == null || getTotalListened() < 3000) {
                return;
            }
            TLRPC.TL_messages_reportMusicListen tL_messages_reportMusicListen = new TLRPC.TL_messages_reportMusicListen();
            tL_messages_reportMusicListen.f20948id = this.audio;
            tL_messages_reportMusicListen.listened_duration = (int) Math.round(getTotalListened() / 1000.0d);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_reportMusicListen, null);
            this.rangeStart = -9223372036854775807L;
            this.ranges.clear();
        }

        public void destroy() {
            if (this.audio == null) {
                return;
            }
            report();
            this.audio = null;
        }

        public j3.y1 getPlayerListener(final j3.q qVar) {
            return new j3.y1() {
                {
                    MusicListenReporter.this = this;
                }

                private void closeRange() {
                    long C = qVar.C();
                    if (MusicListenReporter.this.rangeStart != -9223372036854775807L && C > MusicListenReporter.this.rangeStart) {
                        MusicListenReporter musicListenReporter = MusicListenReporter.this;
                        musicListenReporter.listenedRange(musicListenReporter.rangeStart, C);
                    }
                    MusicListenReporter.this.rangeStart = -9223372036854775807L;
                }

                @Override
                @Deprecated
                public void onCues(List list) {
                }

                @Override
                public void onIsPlayingChanged(boolean z4) {
                    if (z4) {
                        MusicListenReporter.this.rangeStart = qVar.C();
                    } else {
                        closeRange();
                    }
                    AndroidUtilities.cancelRunOnUIThread(MusicListenReporter.this.reportRunnable);
                    if (!z4) {
                        AndroidUtilities.runOnUIThread(MusicListenReporter.this.reportRunnable, 60000L);
                    }
                }

                @Override
                @Deprecated
                public void onPositionDiscontinuity(int i10) {
                }

                @Override
                public void onCues(v4.c cVar) {
                }

                @Override
                public void onPositionDiscontinuity(j3.z1 z1Var, j3.z1 z1Var2, int i10) {
                    if (i10 == 1) {
                        if (MusicListenReporter.this.rangeStart != -9223372036854775807L) {
                            MusicListenReporter musicListenReporter = MusicListenReporter.this;
                            musicListenReporter.listenedRange(musicListenReporter.rangeStart, z1Var.f9504f);
                        }
                        MusicListenReporter.this.rangeStart = ((cb.e) qVar).G() ? z1Var2.f9504f : -9223372036854775807L;
                        AndroidUtilities.cancelRunOnUIThread(MusicListenReporter.this.reportRunnable);
                    }
                }

                @Override
                public void onRenderedFirstFrame() {
                }

                @Override
                public void onAudioAttributesChanged(l3.d dVar) {
                }

                public void onAudioSessionIdChanged(int i10) {
                }

                @Override
                public void onAvailableCommandsChanged(j3.w1 w1Var) {
                }

                public void onDeviceInfoChanged(j3.m mVar) {
                }

                @Override
                public void onIsLoadingChanged(boolean z4) {
                }

                @Override
                @Deprecated
                public void onLoadingChanged(boolean z4) {
                }

                public void onMaxSeekToPreviousPositionChanged(long j10) {
                }

                @Override
                public void onMediaMetadataChanged(j3.e1 e1Var) {
                }

                @Override
                public void onMetadata(e4.c cVar) {
                }

                @Override
                public void onPlaybackParametersChanged(j3.v1 v1Var) {
                }

                @Override
                public void onPlaybackStateChanged(int i10) {
                }

                @Override
                public void onPlaybackSuppressionReasonChanged(int i10) {
                }

                @Override
                public void onPlayerError(j3.t1 t1Var) {
                }

                @Override
                public void onPlayerErrorChanged(j3.t1 t1Var) {
                }

                public void onPlaylistMetadataChanged(j3.e1 e1Var) {
                }

                @Override
                public void onRepeatModeChanged(int i10) {
                }

                public void onSeekBackIncrementChanged(long j10) {
                }

                public void onSeekForwardIncrementChanged(long j10) {
                }

                @Override
                public void onShuffleModeEnabledChanged(boolean z4) {
                }

                @Override
                public void onSkipSilenceEnabledChanged(boolean z4) {
                }

                public void onTrackSelectionParametersChanged(f5.x xVar) {
                }

                @Override
                public void onTracksChanged(j3.q2 q2Var) {
                }

                @Override
                public void onVideoSizeChanged(i5.y yVar) {
                }

                @Override
                public void onVolumeChanged(float f10) {
                }

                public void onDeviceVolumeChanged(int i10, boolean z4) {
                }

                @Override
                public void onEvents(j3.a2 a2Var, j3.x1 x1Var) {
                }

                @Override
                public void onMediaItemTransition(j3.c1 c1Var, int i10) {
                }

                @Override
                public void onPlayWhenReadyChanged(boolean z4, int i10) {
                }

                @Override
                @Deprecated
                public void onPlayerStateChanged(boolean z4, int i10) {
                }

                @Override
                public void onSurfaceSizeChanged(int i10, int i11) {
                }

                @Override
                public void onTimelineChanged(j3.o2 o2Var, int i10) {
                }
            };
        }

        public void setup(TLRPC.InputDocument inputDocument) {
            AndroidUtilities.cancelRunOnUIThread(this.reportRunnable);
            if (inputDocument != null && inputDocument.f20855id == 0) {
                inputDocument = null;
            }
            this.audio = inputDocument;
            this.rangeStart = -9223372036854775807L;
            this.ranges.clear();
        }
    }

    public static class PhotoEntry extends MediaEditState {
        public int bucketId;
        public boolean canDeleteAfter;
        public long dateTaken;
        public Boolean discardLivePhoto;
        public int duration;
        public String emoji;
        public TLRPC.VideoSize emojiMarkup;
        public int gradientBottomColor;
        public int gradientTopColor;
        public boolean hasSpoiler;
        public int height;
        public int imageId;
        public int invert;
        public boolean isAttachSpoilerRevealed;
        public boolean isChatPreviewSpoilerRevealed;
        public boolean isLivePhoto;
        public boolean isMuted;
        public long livePhotoTimestampUs;
        public int orientation;
        private boolean parsedXmp;
        public String path;
        public long size;
        public long starsAmount;
        public BitmapDrawable thumb;
        public int videoOrientation = -1;
        public int width;

        public PhotoEntry(int i10, int i11, long j10, String str, int i12, boolean z4, int i13, int i14, long j11) {
            this.bucketId = i10;
            this.imageId = i11;
            this.dateTaken = j10;
            this.path = str;
            this.width = i13;
            this.height = i14;
            this.size = j11;
            if (z4) {
                this.duration = i12;
            } else {
                this.orientation = i12;
            }
            this.isVideo = z4;
        }

        public Bitmap lambda$rebuildPhoto$0(BitmapFactory.Options options) {
            String str = this.filterPath;
            if (str == null) {
                str = this.path;
            }
            return BitmapFactory.decodeFile(str, options);
        }

        @Override
        public void copyFrom(MediaEditState mediaEditState) {
            boolean z4;
            long j10;
            boolean z10;
            long j11;
            super.copyFrom(mediaEditState);
            boolean z11 = mediaEditState instanceof PhotoEntry;
            boolean z12 = false;
            if (z11 && ((PhotoEntry) mediaEditState).hasSpoiler) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.hasSpoiler = z4;
            long j12 = 0;
            if (z11) {
                j10 = ((PhotoEntry) mediaEditState).starsAmount;
            } else {
                j10 = 0;
            }
            this.starsAmount = j10;
            if (z11 && ((PhotoEntry) mediaEditState).parsedXmp) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.parsedXmp = z10;
            if (z11 && ((PhotoEntry) mediaEditState).isLivePhoto) {
                z12 = true;
            }
            this.isLivePhoto = z12;
            if (z11) {
                j11 = ((PhotoEntry) mediaEditState).livePhotoVideoOffset;
            } else {
                j11 = 0;
            }
            this.livePhotoVideoOffset = j11;
            if (z11) {
                j12 = ((PhotoEntry) mediaEditState).livePhotoTimestampUs;
            }
            this.livePhotoTimestampUs = j12;
        }

        public void deleteAll() {
            if (this.path != null) {
                try {
                    new File(this.path).delete();
                } catch (Exception unused) {
                }
            }
            if (this.fullPaintPath != null) {
                try {
                    new File(this.fullPaintPath).delete();
                } catch (Exception unused2) {
                }
            }
            if (this.paintPath != null) {
                try {
                    new File(this.paintPath).delete();
                } catch (Exception unused3) {
                }
            }
            if (this.imagePath != null) {
                try {
                    new File(this.imagePath).delete();
                } catch (Exception unused4) {
                }
            }
            if (this.filterPath != null) {
                try {
                    new File(this.filterPath).delete();
                } catch (Exception unused5) {
                }
            }
            if (this.croppedPaintPath != null) {
                try {
                    new File(this.croppedPaintPath).delete();
                } catch (Exception unused6) {
                }
            }
        }

        @Override
        public String getPath() {
            return this.path;
        }

        @Override
        public boolean isLivePhoto() {
            f2.c cVar;
            if (!this.isVideo && !this.parsedXmp) {
                this.parsedXmp = true;
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    String b10 = new r1.g(new File(this.path)).b("Xmp");
                    if (b10 != null) {
                        w3.b bVar = null;
                        try {
                            cVar = w3.d.a(b10);
                        } catch (j3.r1 | NumberFormatException | XmlPullParserException e6) {
                            h5.a.L("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata", e6);
                            cVar = null;
                        }
                        if (cVar != null) {
                            s8.i0 i0Var = (s8.i0) cVar.f5740c;
                            w3.b bVar2 = null;
                            for (int i10 = 0; i10 < i0Var.d; i10++) {
                                w3.b bVar3 = (w3.b) i0Var.get(i10);
                                String str = bVar3.f49343b;
                                if ("Primary".equalsIgnoreCase(str)) {
                                    bVar = bVar3;
                                } else if ("MotionPhoto".equalsIgnoreCase(str)) {
                                    bVar2 = bVar3;
                                }
                            }
                            if (bVar != null && bVar2 != null) {
                                long j10 = bVar2.f49344c;
                                if (j10 > 0) {
                                    try {
                                        this.isVideo = true;
                                        this.isLivePhoto = true;
                                        this.livePhotoVideoOffset = new File(this.path).length() - j10;
                                        this.livePhotoTimestampUs = cVar.f5739b;
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                }
                            }
                        }
                    }
                } catch (Exception e11) {
                    FileLog.e(e11);
                    this.isLivePhoto = false;
                }
                StringBuilder sb = new StringBuilder("parsed isLivePhoto()=");
                sb.append(this.isLivePhoto);
                sb.append(" in ");
                sb.append(System.currentTimeMillis() - currentTimeMillis);
                org.telegram.ui.yh.v("ms", sb);
                return this.isLivePhoto;
            }
            return this.isLivePhoto;
        }

        public boolean isUnalivePhoto() {
            Boolean bool = this.discardLivePhoto;
            if (bool == null) {
                return !SharedConfig.photoLiveDefault;
            }
            return bool.booleanValue();
        }

        public void rebuildPhoto(boolean r19) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.PhotoEntry.rebuildPhoto(boolean):void");
        }

        @Override
        public void reset() {
            if (this.isVideo && this.filterPath != null) {
                new File(this.filterPath).delete();
                this.filterPath = null;
            }
            this.hasSpoiler = false;
            this.starsAmount = 0L;
            super.reset();
        }

        public PhotoEntry setOrientation(Pair<Integer, Integer> pair) {
            this.orientation = ((Integer) pair.first).intValue();
            this.invert = ((Integer) pair.second).intValue();
            return this;
        }

        public PhotoEntry clone() {
            PhotoEntry photoEntry = new PhotoEntry(this.bucketId, this.imageId, this.dateTaken, this.path, this.orientation, this.duration, this.isVideo, this.width, this.height, this.size);
            photoEntry.invert = this.invert;
            photoEntry.isMuted = this.isMuted;
            photoEntry.canDeleteAfter = this.canDeleteAfter;
            photoEntry.hasSpoiler = this.hasSpoiler;
            photoEntry.starsAmount = this.starsAmount;
            photoEntry.isChatPreviewSpoilerRevealed = this.isChatPreviewSpoilerRevealed;
            photoEntry.isAttachSpoilerRevealed = this.isAttachSpoilerRevealed;
            photoEntry.emojiMarkup = this.emojiMarkup;
            photoEntry.gradientTopColor = this.gradientTopColor;
            photoEntry.gradientBottomColor = this.gradientBottomColor;
            photoEntry.discardLivePhoto = this.discardLivePhoto;
            photoEntry.copyFrom(this);
            return photoEntry;
        }

        public PhotoEntry setOrientation(int i10, int i11) {
            this.orientation = i10;
            this.invert = i11;
            return this;
        }

        public PhotoEntry(int i10, int i11, long j10, String str, int i12, int i13, boolean z4, int i14, int i15, long j11) {
            this.bucketId = i10;
            this.imageId = i11;
            this.dateTaken = j10;
            this.path = str;
            this.width = i14;
            this.height = i15;
            this.size = j11;
            this.duration = i13;
            this.orientation = i12;
            this.isVideo = z4;
        }
    }

    public static class PlaylistGlobalSearchParams {
        final long dialogId;
        public boolean endReached;
        final uf.e0 filter;
        public int folderId;
        final long maxDate;
        final long minDate;
        public int nextSearchRate;
        final String query;
        public ng.q0 reaction;
        public long topicId;
        public int totalCount;

        public PlaylistGlobalSearchParams(String str, long j10, long j11, long j12, uf.e0 e0Var) {
            this.filter = e0Var;
            this.query = str;
            this.dialogId = j10;
            this.minDate = j11;
            this.maxDate = j12;
        }
    }

    public static class SavedFilterState {
        public float blurAngle;
        public float blurExcludeBlurSize;
        public PointF blurExcludePoint;
        public float blurExcludeSize;
        public int blurType;
        public float contrastValue;
        public lf0 curvesToolValue = new lf0();
        public float enhanceValue;
        public float exposureValue;
        public float fadeValue;
        public float grainValue;
        public float highlightsValue;
        public float saturationValue;
        public float shadowsValue;
        public float sharpenValue;
        public float softenSkinValue;
        public int tintHighlightsColor;
        public int tintShadowsColor;
        public float vignetteValue;
        public float warmthValue;

        public boolean isEmpty() {
            if (Math.abs(this.enhanceValue) < 0.1f && Math.abs(this.softenSkinValue) < 0.1f && Math.abs(this.exposureValue) < 0.1f && Math.abs(this.contrastValue) < 0.1f && Math.abs(this.warmthValue) < 0.1f && Math.abs(this.saturationValue) < 0.1f && Math.abs(this.fadeValue) < 0.1f && this.tintShadowsColor == 0 && this.tintHighlightsColor == 0 && Math.abs(this.highlightsValue) < 0.1f && Math.abs(this.shadowsValue) < 0.1f && Math.abs(this.vignetteValue) < 0.1f && Math.abs(this.grainValue) < 0.1f && this.blurType == 0 && Math.abs(this.sharpenValue) < 0.1f) {
                return true;
            }
            return false;
        }

        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.enhanceValue = inputSerializedData.readFloat(z4);
            this.softenSkinValue = inputSerializedData.readFloat(z4);
            this.exposureValue = inputSerializedData.readFloat(z4);
            this.contrastValue = inputSerializedData.readFloat(z4);
            this.warmthValue = inputSerializedData.readFloat(z4);
            this.saturationValue = inputSerializedData.readFloat(z4);
            this.fadeValue = inputSerializedData.readFloat(z4);
            this.tintShadowsColor = inputSerializedData.readInt32(z4);
            this.tintHighlightsColor = inputSerializedData.readInt32(z4);
            this.highlightsValue = inputSerializedData.readFloat(z4);
            this.shadowsValue = inputSerializedData.readFloat(z4);
            this.vignetteValue = inputSerializedData.readFloat(z4);
            this.grainValue = inputSerializedData.readFloat(z4);
            this.blurType = inputSerializedData.readInt32(z4);
            this.sharpenValue = inputSerializedData.readFloat(z4);
            lf0 lf0Var = this.curvesToolValue;
            lf0Var.f28706a.c(inputSerializedData, z4);
            lf0Var.f28707b.c(inputSerializedData, z4);
            lf0Var.f28708c.c(inputSerializedData, z4);
            lf0Var.d.c(inputSerializedData, z4);
            this.blurExcludeSize = inputSerializedData.readFloat(z4);
            if (inputSerializedData.readInt32(z4) == 1450380236) {
                this.blurExcludePoint = null;
            } else {
                if (this.blurExcludePoint == null) {
                    this.blurExcludePoint = new PointF();
                }
                this.blurExcludePoint.x = inputSerializedData.readFloat(z4);
                this.blurExcludePoint.y = inputSerializedData.readFloat(z4);
            }
            this.blurExcludeBlurSize = inputSerializedData.readFloat(z4);
            this.blurAngle = inputSerializedData.readFloat(z4);
        }

        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeFloat(this.enhanceValue);
            outputSerializedData.writeFloat(this.softenSkinValue);
            outputSerializedData.writeFloat(this.exposureValue);
            outputSerializedData.writeFloat(this.contrastValue);
            outputSerializedData.writeFloat(this.warmthValue);
            outputSerializedData.writeFloat(this.saturationValue);
            outputSerializedData.writeFloat(this.fadeValue);
            outputSerializedData.writeInt32(this.tintShadowsColor);
            outputSerializedData.writeInt32(this.tintHighlightsColor);
            outputSerializedData.writeFloat(this.highlightsValue);
            outputSerializedData.writeFloat(this.shadowsValue);
            outputSerializedData.writeFloat(this.vignetteValue);
            outputSerializedData.writeFloat(this.grainValue);
            outputSerializedData.writeInt32(this.blurType);
            outputSerializedData.writeFloat(this.sharpenValue);
            lf0 lf0Var = this.curvesToolValue;
            lf0Var.f28706a.d(outputSerializedData);
            lf0Var.f28707b.d(outputSerializedData);
            lf0Var.f28708c.d(outputSerializedData);
            lf0Var.d.d(outputSerializedData);
            outputSerializedData.writeFloat(this.blurExcludeSize);
            if (this.blurExcludePoint == null) {
                outputSerializedData.writeInt32(1450380236);
            } else {
                outputSerializedData.writeInt32(-559038737);
                outputSerializedData.writeFloat(this.blurExcludePoint.x);
                outputSerializedData.writeFloat(this.blurExcludePoint.y);
            }
            outputSerializedData.writeFloat(this.blurExcludeBlurSize);
            outputSerializedData.writeFloat(this.blurAngle);
        }
    }

    public static class SavedMusicPlaylistState {
        public final MessageObject playingMessage;
        public final float progress;
        public final int progressMs;
        public final int progressSec;

        public SavedMusicPlaylistState(MessageObject messageObject) {
            this.playingMessage = messageObject;
            this.progress = messageObject.audioProgress;
            this.progressMs = messageObject.audioProgressMs;
            this.progressSec = messageObject.audioProgressSec;
        }
    }

    public static class SearchImage extends MediaEditState {
        public CharSequence caption;
        public int date;
        public TLRPC.Document document;
        public int height;
        public String f18049id;
        public String imageUrl;
        public TLRPC.BotInlineResult inlineResult;
        public HashMap<String, String> params;
        public TLRPC.Photo photo;
        public TLRPC.PhotoSize photoSize;
        public int size;
        public TLRPC.PhotoSize thumbPhotoSize;
        public String thumbUrl;
        public int type;
        public int width;

        public String getAttachName() {
            TLRPC.PhotoSize photoSize = this.photoSize;
            if (photoSize != null) {
                return FileLoader.getAttachFileName(photoSize);
            }
            TLRPC.Document document = this.document;
            if (document != null) {
                return FileLoader.getAttachFileName(document);
            }
            return Utilities.MD5(this.imageUrl) + "." + ImageLoader.getHttpUrlExtension(this.imageUrl, "jpg");
        }

        @Override
        public String getPath() {
            if (this.photoSize != null) {
                return FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(this.photoSize, true).getAbsolutePath();
            }
            if (this.document != null) {
                return FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(this.document, true).getAbsolutePath();
            }
            return ImageLoader.getHttpFilePath(this.imageUrl, "jpg").getAbsolutePath();
        }

        public String getPathToAttach() {
            if (this.photoSize != null) {
                return FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(this.photoSize, true).getAbsolutePath();
            }
            if (this.document != null) {
                return FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(this.document, true).getAbsolutePath();
            }
            return this.imageUrl;
        }

        @Override
        public void reset() {
            super.reset();
        }

        public SearchImage clone() {
            SearchImage searchImage = new SearchImage();
            searchImage.f18049id = this.f18049id;
            searchImage.imageUrl = this.imageUrl;
            searchImage.thumbUrl = this.thumbUrl;
            searchImage.width = this.width;
            searchImage.height = this.height;
            searchImage.size = this.size;
            searchImage.type = this.type;
            searchImage.date = this.date;
            searchImage.caption = this.caption;
            searchImage.document = this.document;
            searchImage.photo = this.photo;
            searchImage.photoSize = this.photoSize;
            searchImage.thumbPhotoSize = this.thumbPhotoSize;
            searchImage.inlineResult = this.inlineResult;
            searchImage.params = this.params;
            return searchImage;
        }
    }

    public final class StopMediaObserverRunnable implements Runnable {
        public int currentObserverToken;

        private StopMediaObserverRunnable() {
            MediaController.this = r1;
            this.currentObserverToken = 0;
        }

        @Override
        public void run() {
            if (this.currentObserverToken == MediaController.this.startObserverToken) {
                try {
                    if (MediaController.this.internalObserver != null) {
                        ApplicationLoader.applicationContext.getContentResolver().unregisterContentObserver(MediaController.this.internalObserver);
                        MediaController.this.internalObserver = null;
                    }
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                try {
                    if (MediaController.this.externalObserver != null) {
                        ApplicationLoader.applicationContext.getContentResolver().unregisterContentObserver(MediaController.this.externalObserver);
                        MediaController.this.externalObserver = null;
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        }
    }

    public static class VideoConvertMessage {
        public int currentAccount;
        public boolean foreground;
        public boolean foregroundConversion;
        public MessageObject messageObject;
        public VideoEditedInfo videoEditedInfo;

        public VideoConvertMessage(MessageObject messageObject, VideoEditedInfo videoEditedInfo, boolean z4, boolean z10) {
            this.messageObject = messageObject;
            this.currentAccount = messageObject.currentAccount;
            this.videoEditedInfo = videoEditedInfo;
            this.foreground = z4;
            this.foregroundConversion = z10;
        }
    }

    public static class VideoConvertRunnable implements Runnable {
        private VideoConvertMessage convertMessage;

        private VideoConvertRunnable(VideoConvertMessage videoConvertMessage) {
            this.convertMessage = videoConvertMessage;
        }

        public static void lambda$runConversion$0(VideoConvertMessage videoConvertMessage) {
            try {
                Thread thread = new Thread(new VideoConvertRunnable(videoConvertMessage), "VideoConvertRunnable");
                thread.start();
                thread.join();
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }

        public static void runConversion(VideoConvertMessage videoConvertMessage) {
            new Thread(new e1(videoConvertMessage, 9)).start();
        }

        @Override
        public void run() {
            MediaController.getInstance().convertVideo(this.convertMessage);
        }
    }

    public interface VideoConvertorListener {
        boolean checkConversionCanceled();

        void didWriteData(long j10, float f10);
    }

    static {
        String str;
        String str2;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 <= 28) {
            str = "datetaken";
        } else {
            str = "date_modified";
        }
        projectionPhotos = new String[]{"_id", "bucket_id", "bucket_display_name", "_data", str, "orientation", "width", "height", "_size"};
        if (i10 <= 28) {
            str2 = "datetaken";
        } else {
            str2 = "date_modified";
        }
        projectionVideo = new String[]{"_id", "bucket_id", "bucket_display_name", "_data", str2, "duration", "width", "height", "_size"};
        cachedEncoderBitrates = new ConcurrentHashMap<>();
        allMediaAlbums = new ArrayList<>();
        allPhotoAlbums = new ArrayList<>();
    }

    public MediaController() {
        String str;
        DispatchQueue dispatchQueue = new DispatchQueue("recordQueue");
        this.recordQueue = dispatchQueue;
        dispatchQueue.setPriority(10);
        DispatchQueue dispatchQueue2 = new DispatchQueue("fileEncodingQueue");
        this.fileEncodingQueue = dispatchQueue2;
        dispatchQueue2.setPriority(10);
        this.recordQueue.postRunnable(new x5(this, 6));
        Utilities.globalQueue.postRunnable(new x5(this, 7));
        this.fileBuffer = ByteBuffer.allocateDirect(1920);
        AndroidUtilities.runOnUIThread(new x5(this, 8));
        if (Build.VERSION.SDK_INT > 28) {
            str = "date_modified";
        } else {
            str = "datetaken";
        }
        this.mediaProjections = new String[]{"_data", "_display_name", "bucket_display_name", str, "title", "width", "height"};
        ContentResolver contentResolver = ApplicationLoader.applicationContext.getContentResolver();
        try {
            contentResolver.registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, new GalleryObserverExternal());
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        try {
            contentResolver.registerContentObserver(MediaStore.Images.Media.INTERNAL_CONTENT_URI, true, new GalleryObserverInternal());
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        try {
            contentResolver.registerContentObserver(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, true, new GalleryObserverExternal());
        } catch (Exception e11) {
            FileLog.e(e11);
        }
        try {
            contentResolver.registerContentObserver(MediaStore.Video.Media.INTERNAL_CONTENT_URI, true, new GalleryObserverInternal());
        } catch (Exception e12) {
            FileLog.e(e12);
        }
    }

    private static void broadcastNewPhotos(int i10, ArrayList<AlbumEntry> arrayList, ArrayList<AlbumEntry> arrayList2, Integer num, AlbumEntry albumEntry, AlbumEntry albumEntry2, AlbumEntry albumEntry3, int i11) {
        Runnable runnable = broadcastPhotosRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        lh.l2 l2Var = new lh.l2(i10, arrayList, arrayList2, num, albumEntry, albumEntry2, albumEntry3);
        broadcastPhotosRunnable = l2Var;
        AndroidUtilities.runOnUIThread(l2Var, i11);
    }

    private static String buildMotionPhotoXmp(long j10) {
        return e2.c.i(j10, "<?xpacket begin=\"\ufeff\" id=\"W5M0MpCehiHzreSzNTczkc9d\"?><x:xmpmeta xmlns:x=\"adobe:ns:meta/\"><rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"><rdf:Description rdf:about=\"\" xmlns:GCamera=\"http://ns.google.com/photos/1.0/camera/\" xmlns:Container=\"http://ns.google.com/photos/1.0/container/\" xmlns:Item=\"http://ns.google.com/photos/1.0/container/item/\" GCamera:MotionPhoto=\"1\" GCamera:MotionPhotoVersion=\"1\" GCamera:MotionPhotoPresentationTimestampUs=\"0\"><Container:Directory><rdf:Seq><rdf:li rdf:parseType=\"Resource\"><Container:Item Item:Mime=\"image/jpeg\" Item:Semantic=\"Primary\" Item:Length=\"0\" Item:Padding=\"0\"/></rdf:li><rdf:li rdf:parseType=\"Resource\"><Container:Item Item:Mime=\"video/mp4\" Item:Semantic=\"MotionPhoto\" Item:Length=\"", "\" Item:Padding=\"0\"/></rdf:li></rdf:Seq></Container:Directory></rdf:Description></rdf:RDF></x:xmpmeta><?xpacket end=\"w\"?>");
    }

    private void buildShuffledPlayList() {
        MessageObject messageObject;
        if (!this.playlist.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.playlist);
            this.shuffledPlaylist.clear();
            int i10 = this.currentPlaylistNum;
            if (i10 >= 0 && i10 < this.playlist.size()) {
                messageObject = this.playlist.get(this.currentPlaylistNum);
                arrayList.remove(this.currentPlaylistNum);
            } else {
                messageObject = null;
            }
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                int nextInt = Utilities.random.nextInt(arrayList.size());
                this.shuffledPlaylist.add((MessageObject) arrayList.get(nextInt));
                arrayList.remove(nextInt);
            }
            if (messageObject != null) {
                this.shuffledPlaylist.add(messageObject);
                this.currentPlaylistNum = this.shuffledPlaylist.size() - 1;
            }
        }
    }

    private boolean canStartMusicPlayerService() {
        MessageObject messageObject = this.playingMessageObject;
        if (messageObject != null) {
            if ((messageObject.isMusic() || this.playingMessageObject.isVoice() || this.playingMessageObject.isRoundVideo()) && !this.playingMessageObject.isVoiceOnce() && !this.playingMessageObject.isRoundOnce()) {
                return true;
            }
            return false;
        }
        return false;
    }

    private void checkAudioFocus(MessageObject messageObject) {
        int i10;
        int i11;
        int requestAudioFocus;
        if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
            i10 = 1;
        } else if (this.useFrontSpeaker) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        if (this.hasAudioFocus != i10) {
            this.hasAudioFocus = i10;
            if (i10 == 3) {
                requestAudioFocus = NotificationsController.audioManager.requestAudioFocus(this, 0, 1);
            } else {
                AudioManager audioManager = NotificationsController.audioManager;
                if (i10 == 2 && !SharedConfig.pauseMusicOnMedia) {
                    i11 = 3;
                } else {
                    i11 = 1;
                }
                requestAudioFocus = audioManager.requestAudioFocus(this, 3, i11);
            }
            if (requestAudioFocus == 1) {
                this.audioFocus = 2;
            }
        }
    }

    private void checkForegroundConvertMessage(boolean z4) {
        if (!this.foregroundConvertingMessages.isEmpty()) {
            this.currentForegroundConvertingVideo = this.foregroundConvertingMessages.get(0);
        } else {
            this.currentForegroundConvertingVideo = null;
        }
        if (this.currentForegroundConvertingVideo == null && !z4) {
            return;
        }
        VideoEncodingService.start(z4);
    }

    public static void checkGallery() {
        AlbumEntry albumEntry;
        if (Build.VERSION.SDK_INT >= 24 && (albumEntry = allPhotosAlbumEntry) != null) {
            Utilities.globalQueue.postRunnable(new e6(albumEntry.photos.size(), 1), 2000L);
        }
    }

    private void checkIsNextMusicFileDownloaded(int i10) {
        ArrayList<MessageObject> arrayList;
        int i11;
        File pathToMessage;
        if (DownloadController.getInstance(i10).canDownloadNextTrack()) {
            if (SharedConfig.shuffleMusic) {
                arrayList = this.shuffledPlaylist;
            } else {
                arrayList = this.playlist;
            }
            if (arrayList != null) {
                int i12 = 2;
                if (arrayList.size() >= 2) {
                    if (SharedConfig.playOrderReversed) {
                        i11 = this.currentPlaylistNum + 1;
                        if (i11 >= arrayList.size()) {
                            i11 = 0;
                        }
                    } else {
                        i11 = this.currentPlaylistNum - 1;
                        if (i11 < 0) {
                            i11 = arrayList.size() - 1;
                        }
                    }
                    if (i11 >= 0 && i11 < arrayList.size()) {
                        MessageObject messageObject = arrayList.get(i11);
                        File file = null;
                        if (!TextUtils.isEmpty(messageObject.messageOwner.attachPath)) {
                            File file2 = new File(messageObject.messageOwner.attachPath);
                            if (file2.exists()) {
                                file = file2;
                            }
                        }
                        if (file != null) {
                            pathToMessage = file;
                        } else {
                            pathToMessage = FileLoader.getInstance(i10).getPathToMessage(messageObject.messageOwner);
                        }
                        pathToMessage.exists();
                        if (pathToMessage != file && !pathToMessage.exists() && messageObject.isMusic()) {
                            FileLoader fileLoader = FileLoader.getInstance(i10);
                            TLRPC.Document document = messageObject.getDocument();
                            if (!messageObject.shouldEncryptPhotoOrVideo()) {
                                i12 = 0;
                            }
                            fileLoader.loadFile(document, messageObject, 0, i12);
                        }
                    }
                }
            }
        }
    }

    private void checkIsNextVoiceFileDownloaded(int i10) {
        File pathToMessage;
        ArrayList<MessageObject> arrayList = this.voiceMessagesPlaylist;
        if (arrayList != null) {
            int i11 = 2;
            if (arrayList.size() >= 2) {
                MessageObject messageObject = this.voiceMessagesPlaylist.get(1);
                String str = messageObject.messageOwner.attachPath;
                File file = null;
                if (str != null && str.length() > 0) {
                    File file2 = new File(messageObject.messageOwner.attachPath);
                    if (file2.exists()) {
                        file = file2;
                    }
                }
                if (file != null) {
                    pathToMessage = file;
                } else {
                    pathToMessage = FileLoader.getInstance(i10).getPathToMessage(messageObject.messageOwner);
                }
                pathToMessage.exists();
                if (pathToMessage != file && !pathToMessage.exists()) {
                    FileLoader fileLoader = FileLoader.getInstance(i10);
                    TLRPC.Document document = messageObject.getDocument();
                    if (!messageObject.shouldEncryptPhotoOrVideo()) {
                        i11 = 0;
                    }
                    fileLoader.loadFile(document, messageObject, 0, i11);
                }
            }
        }
    }

    private void checkScreenshots(ArrayList<Long> arrayList) {
        if (arrayList != null && !arrayList.isEmpty() && this.lastChatEnterTime != 0) {
            if (this.lastUser != null || (this.lastSecretChat instanceof TLRPC.TL_encryptedChat)) {
                boolean z4 = false;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    Long l10 = arrayList.get(i10);
                    if ((this.lastMediaCheckTime == 0 || l10.longValue() > this.lastMediaCheckTime) && l10.longValue() >= this.lastChatEnterTime && (this.lastChatLeaveTime == 0 || l10.longValue() <= this.lastChatLeaveTime + 2000)) {
                        this.lastMediaCheckTime = Math.max(this.lastMediaCheckTime, l10.longValue());
                        z4 = true;
                    }
                }
                if (z4) {
                    if (this.lastSecretChat != null) {
                        SecretChatHelper.getInstance(this.lastChatAccount).sendScreenshotMessage(this.lastSecretChat, this.lastChatVisibleMessages, null);
                    } else {
                        SendMessagesHelper.getInstance(this.lastChatAccount).sendScreenshotMessage(this.lastUser, this.lastMessageId, null);
                    }
                }
            }
        }
    }

    private void clearMusicPlaylistState() {
        this.savedMusicPlaylistState = null;
    }

    private void clearPlaylist() {
        this.currentSavedMusicList = null;
        this.playlist.clear();
        this.playlistMap.clear();
        this.shuffledPlaylist.clear();
        this.playlistClassGuid = 0;
        boolean[] zArr = this.playlistEndReached;
        zArr[1] = false;
        zArr[0] = false;
        this.playlistMergeDialogId = 0L;
        int[] iArr = this.playlistMaxId;
        iArr[1] = Integer.MAX_VALUE;
        iArr[0] = Integer.MAX_VALUE;
        this.loadingPlaylist = false;
        this.playlistGlobalSearchParams = null;
        this.savedMusicPlaylistState = null;
    }

    public boolean convertVideo(final VideoConvertMessage videoConvertMessage) {
        boolean z4;
        File file;
        int i10;
        long j10;
        long j11;
        long j12;
        boolean z10;
        long j13;
        int i11;
        File file2;
        boolean z11;
        boolean z12;
        MessageObject messageObject = videoConvertMessage.messageObject;
        final VideoEditedInfo videoEditedInfo = videoConvertMessage.videoEditedInfo;
        if (messageObject == null || videoEditedInfo == null) {
            return false;
        }
        String str = videoEditedInfo.originalPath;
        long j14 = videoEditedInfo.videoOffset;
        long j15 = videoEditedInfo.startTime;
        long j16 = videoEditedInfo.avatarStartTime;
        long j17 = videoEditedInfo.endTime;
        int i12 = videoEditedInfo.resultWidth;
        int i13 = videoEditedInfo.resultHeight;
        int i14 = videoEditedInfo.rotationValue;
        int i15 = videoEditedInfo.originalWidth;
        int i16 = videoEditedInfo.originalHeight;
        int i17 = videoEditedInfo.framerate;
        int i18 = videoEditedInfo.bitrate;
        int i19 = videoEditedInfo.originalBitrate;
        if (!DialogObject.isEncryptedDialog(messageObject.getDialogId()) && !videoEditedInfo.forceFragmenting) {
            z4 = false;
        } else {
            z4 = true;
        }
        File file3 = new File(messageObject.messageOwner.attachPath);
        if (file3.exists()) {
            file3.delete();
        }
        if (BuildVars.LOGS_ENABLED) {
            file = file3;
            StringBuilder sb = new StringBuilder("begin convert ");
            sb.append(str);
            sb.append(" startTime = ");
            sb.append(j15);
            sb.append(" avatarStartTime = ");
            sb.append(j16);
            sb.append(" endTime ");
            sb.append(j17);
            sb.append(" rWidth = ");
            sb.append(i12);
            sb.append(" rHeight = ");
            sb.append(i13);
            sb.append(" rotation = ");
            sb.append(i14);
            sb.append(" oWidth = ");
            sb.append(i15);
            sb.append(" oHeight = ");
            sb.append(i16);
            sb.append(" framerate = ");
            sb.append(i17);
            sb.append(" bitrate = ");
            sb.append(i18);
            sb.append(" originalBitrate = ");
            i10 = i19;
            sb.append(i10);
            FileLog.d(sb.toString());
        } else {
            file = file3;
            i10 = i19;
        }
        if (str == null) {
            str = "";
        }
        int i20 = (j15 > 0L ? 1 : (j15 == 0L ? 0 : -1));
        if (i20 > 0 && j17 > 0) {
            j10 = j15;
            j11 = j17 - j15;
        } else if (j17 > 0) {
            j10 = j15;
            j11 = j17;
        } else if (i20 > 0) {
            j10 = j15;
            j11 = videoEditedInfo.originalDuration - j10;
        } else {
            j10 = j15;
            j11 = videoEditedInfo.originalDuration;
        }
        if (i17 == 0) {
            i17 = 25;
        } else if (i17 > 59) {
            i17 = 59;
        }
        if (i14 != 90 && i14 != 270) {
            j12 = j11;
            z10 = z4;
            j13 = j16;
            i11 = i12;
            i12 = i13;
        } else {
            j12 = j11;
            z10 = z4;
            j13 = j16;
            i11 = i13;
        }
        long j18 = j10;
        long j19 = j12;
        if (!videoEditedInfo.shouldLimitFps && i17 > 40 && Math.min(i12, i11) <= 480) {
            i17 = 30;
        }
        if (j13 == -1 && videoEditedInfo.cropState == null && videoEditedInfo.mediaEntities == null && videoEditedInfo.paintPath == null && videoEditedInfo.filterState == null && i11 == i15 && i12 == i16 && i14 == 0 && !videoEditedInfo.roundVideo && j18 == -1 && videoEditedInfo.mixedSoundInfos.isEmpty()) {
            file2 = file;
            z11 = false;
        } else {
            file2 = file;
            z11 = true;
        }
        final File file4 = file2;
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("videoconvert", 0);
        long currentTimeMillis = System.currentTimeMillis();
        VideoConvertorListener videoConvertorListener = new VideoConvertorListener() {
            private long lastAvailableSize = 0;

            {
                MediaController.this = this;
            }

            @Override
            public boolean checkConversionCanceled() {
                return videoEditedInfo.canceled;
            }

            @Override
            public void didWriteData(long j20, float f10) {
                if (!videoEditedInfo.canceled) {
                    if (j20 < 0) {
                        j20 = file4.length();
                    }
                    long j21 = j20;
                    if (!videoEditedInfo.needUpdateProgress && this.lastAvailableSize == j21) {
                        return;
                    }
                    this.lastAvailableSize = j21;
                    MediaController.this.didWriteData(videoConvertMessage, file4, false, 0L, j21, false, f10);
                }
            }
        };
        videoEditedInfo.videoConvertFirstWrite = true;
        MediaCodecVideoConvertor mediaCodecVideoConvertor = new MediaCodecVideoConvertor();
        MediaCodecVideoConvertor.ConvertVideoParams of2 = MediaCodecVideoConvertor.ConvertVideoParams.of(str, file4, j14, i14, z10, i15, i16, i11, i12, i17, i18, i10, j18, j17, j13, z11, j19, videoConvertorListener, videoEditedInfo);
        of2.soundInfos.addAll(videoEditedInfo.mixedSoundInfos);
        boolean convertVideo = mediaCodecVideoConvertor.convertVideo(of2);
        boolean z13 = videoEditedInfo.canceled;
        if (!z13) {
            synchronized (this.videoConvertSync) {
                z13 = videoEditedInfo.canceled;
            }
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("time=" + (System.currentTimeMillis() - currentTimeMillis) + " canceled=" + z13);
        }
        sharedPreferences.edit().putBoolean("isPreviousOk", true).apply();
        long lastFrameTimestamp = mediaCodecVideoConvertor.getLastFrameTimestamp();
        boolean z14 = z13;
        long length = file4.length();
        if (!convertVideo && !z14) {
            z12 = false;
        } else {
            z12 = true;
        }
        didWriteData(videoConvertMessage, file4, true, lastFrameTimestamp, length, z12, 1.0f);
        return true;
    }

    public static String copyFileToCache(Uri uri, String str) {
        return copyFileToCache(uri, str, -1L);
    }

    public static File createFileInCache(String str, String str2) {
        File file;
        try {
            File sharingDirectory = AndroidUtilities.getSharingDirectory();
            sharingDirectory.mkdirs();
            if (AndroidUtilities.isInternalUri(Uri.fromFile(sharingDirectory))) {
                return null;
            }
            int i10 = 0;
            do {
                File sharingDirectory2 = AndroidUtilities.getSharingDirectory();
                if (i10 == 0) {
                    file = new File(sharingDirectory2, str);
                } else {
                    int lastIndexOf = str.lastIndexOf(".");
                    if (lastIndexOf > 0) {
                        file = new File(sharingDirectory2, str.substring(0, lastIndexOf) + " (" + i10 + ")" + str.substring(lastIndexOf));
                    } else {
                        file = new File(sharingDirectory2, str + " (" + i10 + ")");
                    }
                }
                i10++;
            } while (file.exists());
            return file;
        } catch (Exception e6) {
            FileLog.e(e6);
            return null;
        }
    }

    public static native boolean cropOpusFile(String str, String str2, long j10, long j11);

    public void didWriteData(final VideoConvertMessage videoConvertMessage, final File file, final boolean z4, final long j10, final long j11, final boolean z10, final float f10) {
        VideoEditedInfo videoEditedInfo = videoConvertMessage.videoEditedInfo;
        final boolean z11 = videoEditedInfo.videoConvertFirstWrite;
        if (z11) {
            videoEditedInfo.videoConvertFirstWrite = false;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaController.this.lambda$didWriteData$59(z10, z4, videoConvertMessage, file, f10, j10, z11, j11);
            }
        });
    }

    public static int extractRealEncoderBitrate(int r4, int r5, int r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.extractRealEncoderBitrate(int, int, int, boolean):int");
    }

    public static int findTrack(MediaExtractor mediaExtractor, boolean z4) {
        int trackCount = mediaExtractor.getTrackCount();
        for (int i10 = 0; i10 < trackCount; i10++) {
            String string = mediaExtractor.getTrackFormat(i10).getString("mime");
            if (z4) {
                if (string.startsWith("audio/")) {
                    return i10;
                }
            } else if (string.startsWith("video/")) {
                return i10;
            }
        }
        return -5;
    }

    private boolean forbidRaiseToListen() {
        AudioDeviceInfo[] devices;
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                for (AudioDeviceInfo audioDeviceInfo : NotificationsController.audioManager.getDevices(2)) {
                    int type = audioDeviceInfo.getType();
                    if ((type == 8 || type == 7 || type == 26 || type == 27 || type == 4 || type == 3) && audioDeviceInfo.isSink()) {
                        return true;
                    }
                }
                return false;
            } else if (!NotificationsController.audioManager.isWiredHeadsetOn() && !NotificationsController.audioManager.isBluetoothA2dpOn() && !NotificationsController.audioManager.isBluetoothScoOn()) {
                return false;
            } else {
                return true;
            }
        } catch (Exception e6) {
            FileLog.e(e6);
            return false;
        }
    }

    public static java.lang.String getFileName(android.net.Uri r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.getFileName(android.net.Uri):java.lang.String");
    }

    public static MediaController getInstance() {
        MediaController mediaController;
        MediaController mediaController2 = Instance;
        if (mediaController2 == null) {
            synchronized (MediaController.class) {
                try {
                    mediaController = Instance;
                    if (mediaController == null) {
                        mediaController = new MediaController();
                        Instance = mediaController;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return mediaController;
        }
        return mediaController2;
    }

    public static java.lang.String getStickerExt(android.net.Uri r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.getStickerExt(android.net.Uri):java.lang.String");
    }

    public static int getVideoBitrate(String str) {
        int i10;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(str);
            i10 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(20));
        } catch (Exception e6) {
            FileLog.e(e6);
            i10 = 0;
        }
        try {
            mediaMetadataRetriever.release();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
        return i10;
    }

    private static int getVideoBitrateWithFactor(float f10) {
        return (int) e2.c.z(f10, 2000.0f, 1000.0f, 1.13f);
    }

    public static native byte[] getWaveform(String str);

    public static boolean isGif(android.net.Uri r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.isGif(android.net.Uri):boolean");
    }

    public static boolean isH264Video(String str) {
        MediaExtractor mediaExtractor = new MediaExtractor();
        boolean z4 = false;
        try {
            mediaExtractor.setDataSource(str);
            int findTrack = findTrack(mediaExtractor, false);
            if (findTrack >= 0) {
                if (mediaExtractor.getTrackFormat(findTrack).getString("mime").equals("video/avc")) {
                    z4 = true;
                }
            }
            return z4;
        } catch (Exception e6) {
            FileLog.e(e6);
            return false;
        } finally {
            mediaExtractor.release();
        }
    }

    private boolean isNearToSensor(float f10) {
        if (f10 < 5.0f && f10 != this.proximitySensor.getMaximumRange()) {
            return true;
        }
        return false;
    }

    public static native int isOpusFile(String str);

    private static boolean isRecognizedFormat(int i10) {
        if (i10 == 39 || i10 == 2130706688) {
            return true;
        }
        switch (i10) {
            case 19:
            case 20:
            case 21:
                return true;
            default:
                return false;
        }
    }

    private boolean isSamePlayingMessage(MessageObject messageObject) {
        boolean z4;
        boolean z10;
        MessageObject messageObject2 = this.playingMessageObject;
        if (messageObject2 != null && messageObject2.getDialogId() == messageObject.getDialogId() && this.playingMessageObject.getId() == messageObject.getId()) {
            if (this.playingMessageObject.eventId == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (messageObject.eventId == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z4 == z10) {
                return true;
            }
        }
        return false;
    }

    public static boolean isWebp(android.net.Uri r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.isWebp(android.net.Uri):boolean");
    }

    public static native boolean joinOpusFiles(String str, String str2, String str3);

    private File joinRecord() {
        return joinRecord(this.recordingPrevAudioFile, this.recordingAudioFile, this.recordingAudio);
    }

    public static void lambda$broadcastNewPhotos$58(int i10, ArrayList arrayList, ArrayList arrayList2, Integer num, AlbumEntry albumEntry, AlbumEntry albumEntry2, AlbumEntry albumEntry3) {
        if (PhotoViewer.t1().Q1() && !forceBroadcastNewPhotos) {
            broadcastNewPhotos(i10, arrayList, arrayList2, num, albumEntry, albumEntry2, albumEntry3, 1000);
            return;
        }
        allMediaAlbums = arrayList;
        allPhotoAlbums = arrayList2;
        broadcastPhotosRunnable = null;
        allPhotosAlbumEntry = albumEntry2;
        allMediaAlbumEntry = albumEntry;
        allVideosAlbumEntry = albumEntry3;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.albumsDidLoad, Integer.valueOf(i10), arrayList, arrayList2, num);
    }

    public static void lambda$checkGallery$1(int r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.lambda$checkGallery$1(int):void");
    }

    public void lambda$cleanupPlayer$10(k71 k71Var, ValueAnimator valueAnimator) {
        float f10;
        if (this.audioFocus != 1) {
            f10 = 1.0f;
        } else {
            f10 = 0.2f;
        }
        k71Var.W(((Float) valueAnimator.getAnimatedValue()).floatValue() * f10);
    }

    public void lambda$didWriteData$59(boolean z4, boolean z10, VideoConvertMessage videoConvertMessage, File file, float f10, long j10, boolean z11, long j11) {
        boolean z12;
        long j12;
        if (z4 || z10) {
            boolean z13 = videoConvertMessage.videoEditedInfo.canceled;
            synchronized (this.videoConvertSync) {
                videoConvertMessage.videoEditedInfo.canceled = false;
            }
            this.videoConvertQueue.remove(videoConvertMessage);
            this.foregroundConvertingMessages.remove(videoConvertMessage);
            if (!z13 && !z4) {
                z12 = false;
            } else {
                z12 = true;
            }
            checkForegroundConvertMessage(z12);
            startVideoConvertFromQueue();
        }
        if (z4) {
            NotificationCenter.getInstance(videoConvertMessage.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.filePreparingFailed, videoConvertMessage.messageObject, file.toString(), Float.valueOf(f10), Long.valueOf(j10));
            return;
        }
        if (z11) {
            NotificationCenter.getInstance(videoConvertMessage.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.filePreparingStarted, videoConvertMessage.messageObject, file.toString(), Float.valueOf(f10), Long.valueOf(j10));
        }
        NotificationCenter notificationCenter = NotificationCenter.getInstance(videoConvertMessage.currentAccount);
        int i10 = NotificationCenter.fileNewChunkAvailable;
        MessageObject messageObject = videoConvertMessage.messageObject;
        String file2 = file.toString();
        Long valueOf = Long.valueOf(j11);
        if (z10) {
            j12 = file.length();
        } else {
            j12 = 0;
        }
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, messageObject, file2, valueOf, Long.valueOf(j12), Float.valueOf(f10), Long.valueOf(j10));
    }

    public void lambda$generateWaveform$38(String str, byte[] bArr, MessageObject messageObject) {
        MessageObject remove = this.generatingWaveform.remove(str);
        if (remove != null && bArr != null && remove.getDocument() != null) {
            int i10 = 0;
            while (true) {
                if (i10 >= remove.getDocument().attributes.size()) {
                    break;
                }
                TLRPC.DocumentAttribute documentAttribute = remove.getDocument().attributes.get(i10);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                    documentAttribute.waveform = bArr;
                    documentAttribute.flags |= 4;
                    break;
                }
                i10++;
            }
            TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
            tL_messages_messages.messages.add(remove.messageOwner);
            MessagesStorage.getInstance(remove.currentAccount).putMessages((TLRPC.messages_Messages) tL_messages_messages, remove.getDialogId(), -1, 0, false, messageObject.scheduled ? 1 : 0, 0L);
            NotificationCenter.getInstance(remove.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.replaceMessagesObjects, Long.valueOf(remove.getDialogId()), y3.m(remove));
        }
    }

    public void lambda$generateWaveform$39(String str, String str2, MessageObject messageObject) {
        try {
            AndroidUtilities.runOnUIThread(new sk(this, str2, getWaveform(str), messageObject, 13));
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    public static int lambda$loadGalleryPhotosAlbums$56(PhotoEntry photoEntry, PhotoEntry photoEntry2) {
        long j10 = photoEntry.dateTaken;
        long j11 = photoEntry2.dateTaken;
        if (j10 < j11) {
            return 1;
        }
        if (j10 > j11) {
            return -1;
        }
        return 0;
    }

    public static void lambda$loadGalleryPhotosAlbums$57(int r51) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.lambda$loadGalleryPhotosAlbums$57(int):void");
    }

    public void lambda$loadMoreMusic$11(int i10, TLRPC.TL_error tL_error, TLObject tLObject, int i11) {
        PlaylistGlobalSearchParams playlistGlobalSearchParams;
        boolean z4;
        if (this.playlistClassGuid == i10 && (playlistGlobalSearchParams = this.playlistGlobalSearchParams) != null && this.playingMessageObject != null && tL_error == null) {
            this.loadingPlaylist = false;
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            playlistGlobalSearchParams.nextSearchRate = messages_messages.next_rate;
            MessagesStorage.getInstance(i11).putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
            MessagesController.getInstance(i11).putUsers(messages_messages.users, false);
            MessagesController.getInstance(i11).putChats(messages_messages.chats, false);
            int size = messages_messages.messages.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                MessageObject messageObject = new MessageObject(i11, messages_messages.messages.get(i13), false, true);
                if (!messageObject.isVoiceOnce() && !this.playlistMap.containsKey(Integer.valueOf(messageObject.getId()))) {
                    this.playlist.add(0, messageObject);
                    this.playlistMap.put(Integer.valueOf(messageObject.getId()), messageObject);
                    i12++;
                }
            }
            sortPlaylist();
            this.loadingPlaylist = false;
            PlaylistGlobalSearchParams playlistGlobalSearchParams2 = this.playlistGlobalSearchParams;
            if (this.playlist.size() == this.playlistGlobalSearchParams.totalCount) {
                z4 = true;
            } else {
                z4 = false;
            }
            playlistGlobalSearchParams2.endReached = z4;
            if (SharedConfig.shuffleMusic) {
                buildShuffledPlayList();
            }
            if (i12 != 0) {
                NotificationCenter.getInstance(this.playingMessageObject.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.moreMusicDidLoad, Integer.valueOf(i12));
            }
        }
    }

    public void lambda$loadMoreMusic$12(int i10, int i11, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new p6(i10, i11, this, tLObject, tL_error));
    }

    public void lambda$new$0(int i10) {
        if (i10 != 1) {
            this.hasRecordAudioFocus = false;
        }
    }

    public void lambda$new$2() {
        try {
            this.sampleRate = 48000;
            int minBufferSize = AudioRecord.getMinBufferSize(48000, 16, 2);
            if (minBufferSize <= 0) {
                minBufferSize = 1280;
            }
            this.recordBufferSize = minBufferSize;
            for (int i10 = 0; i10 < 5; i10++) {
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.recordBufferSize);
                allocateDirect.order(ByteOrder.nativeOrder());
                this.recordBuffers.add(allocateDirect);
            }
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    public void lambda$new$3() {
        try {
            this.currentPlaybackSpeed = MessagesController.getGlobalMainSettings().getFloat("playbackSpeed", 1.0f);
            this.currentMusicPlaybackSpeed = MessagesController.getGlobalMainSettings().getFloat("musicPlaybackSpeed", 1.0f);
            this.fastPlaybackSpeed = MessagesController.getGlobalMainSettings().getFloat("fastPlaybackSpeed", 1.8f);
            this.fastMusicPlaybackSpeed = MessagesController.getGlobalMainSettings().getFloat("fastMusicPlaybackSpeed", 1.8f);
            SensorManager sensorManager = (SensorManager) ApplicationLoader.applicationContext.getSystemService("sensor");
            this.sensorManager = sensorManager;
            this.linearSensor = sensorManager.getDefaultSensor(10);
            Sensor defaultSensor = this.sensorManager.getDefaultSensor(9);
            this.gravitySensor = defaultSensor;
            if (this.linearSensor == null || defaultSensor == null) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("gravity or linear sensor not found");
                }
                this.accelerometerSensor = this.sensorManager.getDefaultSensor(1);
                this.linearSensor = null;
                this.gravitySensor = null;
            }
            this.proximitySensor = this.sensorManager.getDefaultSensor(8);
            this.proximityWakeLock = ((PowerManager) ApplicationLoader.applicationContext.getSystemService("power")).newWakeLock(32, "telegram:proximity_lock");
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        try {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4();
            TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
            if (telephonyManager != null) {
                telephonyManager.listen(anonymousClass4, 32);
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public void lambda$new$4() {
        for (int i10 = 0; i10 < 4; i10++) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoaded);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.httpFileDidLoad);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.didReceiveNewMessages);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagesDeleted);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.removeAllMessagesFromDialog);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.musicDidLoad);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.mediaDidLoad);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.musicListLoaded);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.playerDidStartPlaying);
        }
    }

    public void lambda$onAudioFocusChange$5(int i10) {
        if (i10 == -1) {
            if (isPlayingMessage(getPlayingMessageObject()) && !isMessagePaused()) {
                lambda$startAudioAgain$7(this.playingMessageObject);
            }
            this.hasAudioFocus = 0;
            this.audioFocus = 0;
        } else if (i10 == 1) {
            this.audioFocus = 2;
            if (this.resumeAudioOnFocusGain) {
                this.resumeAudioOnFocusGain = false;
                if (isPlayingMessage(getPlayingMessageObject()) && isMessagePaused()) {
                    playMessage(getPlayingMessageObject());
                }
            }
        } else if (i10 == -3) {
            this.audioFocus = 1;
        } else if (i10 == -2) {
            this.audioFocus = 0;
            if (isPlayingMessage(getPlayingMessageObject()) && !isMessagePaused()) {
                lambda$startAudioAgain$7(this.playingMessageObject);
                this.resumeAudioOnFocusGain = true;
            }
        }
        setPlayerVolume();
    }

    public void lambda$playEmojiSound$17(File file) {
        try {
            int i10 = this.emojiSoundPlayerNum + 1;
            this.emojiSoundPlayerNum = i10;
            k71 k71Var = this.emojiSoundPlayer;
            if (k71Var != null) {
                k71Var.H();
            }
            k71 k71Var2 = new k71(false, false);
            this.emojiSoundPlayer = k71Var2;
            k71Var2.G = new AnonymousClass8(i10);
            this.emojiSoundPlayer.D(Uri.fromFile(file), "other");
            this.emojiSoundPlayer.S(3);
            this.emojiSoundPlayer.C();
        } catch (Exception e6) {
            FileLog.e(e6);
            k71 k71Var3 = this.emojiSoundPlayer;
            if (k71Var3 != null) {
                k71Var3.H();
                this.emojiSoundPlayer = null;
            }
        }
    }

    public static void lambda$playEmojiSound$18(AccountInstance accountInstance, TLRPC.Document document) {
        accountInstance.getFileLoader().loadFile(document, null, 1, 1);
    }

    public void lambda$playEmojiSound$19(MessagesController.EmojiSound emojiSound, AccountInstance accountInstance, boolean z4) {
        TLRPC.TL_document tL_document = new TLRPC.TL_document();
        tL_document.access_hash = emojiSound.accessHash;
        tL_document.f20849id = emojiSound.f18056id;
        tL_document.mime_type = "sound/ogg";
        tL_document.file_reference = emojiSound.fileReference;
        tL_document.dc_id = accountInstance.getConnectionsManager().getCurrentDatacenterId();
        File pathToAttach = FileLoader.getInstance(accountInstance.getCurrentAccount()).getPathToAttach(tL_document, true);
        if (pathToAttach.exists()) {
            if (z4) {
                return;
            }
            AndroidUtilities.runOnUIThread(new d2(14, this, pathToAttach));
            return;
        }
        AndroidUtilities.runOnUIThread(new d2(15, accountInstance, tL_document));
    }

    public void lambda$playMessage$20() {
        cleanupPlayer(true, true);
    }

    public static void lambda$playMessage$21(MessageObject messageObject, File file) {
        NotificationCenter.getInstance(messageObject.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileLoaded, FileLoader.getAttachFileName(messageObject.getDocument()), file);
    }

    public static void lambda$playMessage$22(MessageObject messageObject, File file) {
        NotificationCenter.getInstance(messageObject.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileLoaded, FileLoader.getAttachFileName(messageObject.getDocument()), file);
    }

    public void lambda$prepareResumedRecording$23(int i10, long j10) {
        MediaDataController.getInstance(i10).pushDraftVoiceMessage(j10, this.recordTopicId, null);
        this.recordStartRunnable = null;
    }

    public void lambda$prepareResumedRecording$24(File file, TLRPC.TL_document tL_document, MediaDataController.DraftVoice draftVoice) {
        if (!file.exists() && BuildVars.DEBUG_VERSION) {
            FileLog.e(new RuntimeException("file not found :( recordTimeCount " + this.recordTimeCount + " writedFrames" + this.writtenFrame));
        }
        tL_document.date = ConnectionsManager.getInstance(this.recordingCurrentAccount).getCurrentTime();
        tL_document.size = (int) file.length();
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
        tL_documentAttributeAudio.voice = true;
        short[] sArr = this.recordSamples;
        byte[] waveform2 = getWaveform2(sArr, sArr.length);
        tL_documentAttributeAudio.waveform = waveform2;
        if (waveform2 != null) {
            tL_documentAttributeAudio.flags |= 4;
        }
        tL_documentAttributeAudio.duration = this.recordTimeCount / 1000.0d;
        tL_document.attributes.clear();
        tL_document.attributes.add(tL_documentAttributeAudio);
        NotificationCenter.getInstance(this.recordingCurrentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordPaused, new Object[0]);
        NotificationCenter.getInstance(this.recordingCurrentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(this.recordingGuid), tL_document, file.getAbsolutePath(), Boolean.TRUE, Float.valueOf(draftVoice.left), Float.valueOf(draftVoice.right));
    }

    public void lambda$prepareResumedRecording$25(int i10, MediaDataController.DraftVoice draftVoice, int i11, long j10, long j11, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem) {
        long topicId;
        setBluetoothScoOn(true);
        this.sendAfterDone = 0;
        TLRPC.TL_document tL_document = new TLRPC.TL_document();
        this.recordingAudio = tL_document;
        this.recordingGuid = i10;
        tL_document.dc_id = Integer.MIN_VALUE;
        tL_document.f20849id = draftVoice.f18050id;
        tL_document.user_id = UserConfig.getInstance(i11).getClientUserId();
        TLRPC.TL_document tL_document2 = this.recordingAudio;
        tL_document2.mime_type = "audio/ogg";
        tL_document2.file_reference = new byte[0];
        SharedConfig.saveConfig();
        this.recordingAudioFile = new File(draftVoice.path) {
            {
                MediaController.this = this;
            }

            @Override
            public boolean delete() {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("delete voice file");
                }
                return super.delete();
            }
        };
        FileLoader.getDirectory(4).mkdirs();
        AutoDeleteMediaTask.lockFile(this.recordingAudioFile);
        try {
            this.audioRecorderPaused = true;
            this.recordTimeCount = draftVoice.recordTimeCount;
            this.writtenFrame = draftVoice.writedFrame;
            this.samplesCount = draftVoice.samplesCount;
            this.recordSamples = draftVoice.recordSamples;
            this.recordDialogId = j10;
            this.recordMonoForumPeerId = j11;
            this.recordMonoForumSuggestionParams = messageSuggestionParams;
            if (messageObject == null) {
                topicId = 0;
            } else {
                topicId = MessageObject.getTopicId(this.recordingCurrentAccount, messageObject.messageOwner, false);
            }
            this.recordTopicId = topicId;
            this.recordingCurrentAccount = i11;
            this.recordReplyingMsg = messageObject2;
            this.recordReplyingTopMsg = messageObject;
            this.recordReplyingStory = storyItem;
            this.recordSendMessageChatArguments = this.recordSendMessageChatArguments;
            AndroidUtilities.runOnUIThread(new sk(this, this.recordingAudioFile, this.recordingAudio, draftVoice, 12));
        } catch (Exception e6) {
            FileLog.e(e6);
            this.recordingAudio = null;
            AutoDeleteMediaTask.unlockFile(this.recordingAudioFile);
            this.recordingAudioFile.delete();
            this.recordingAudioFile = null;
            try {
                this.audioRecorder.release();
                this.audioRecorder = null;
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            setBluetoothScoOn(false);
            AndroidUtilities.runOnUIThread(new mh.a9(this, i11, j10, 3));
        }
    }

    public void lambda$processMediaObserver$6(ArrayList arrayList) {
        NotificationCenter.getInstance(this.lastChatAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.screenshotTook, new Object[0]);
        checkScreenshots(arrayList);
    }

    public static void lambda$saveFile$44(boolean[] zArr, DialogInterface dialogInterface) {
        zArr[0] = true;
    }

    public static void lambda$saveFile$45(boolean[] zArr, org.telegram.ui.ActionBar.d2 d2Var) {
        if (!zArr[0]) {
            d2Var.show();
        }
    }

    public static void lambda$saveFile$46(org.telegram.ui.ActionBar.d2 d2Var) {
        try {
            d2Var.dismiss();
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    public static void lambda$saveFile$47(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        try {
            d2Var.n(i10);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    public static void lambda$saveFile$49(org.telegram.ui.ActionBar.d2 d2Var, boolean[] zArr) {
        try {
            if (d2Var.isShowing()) {
                d2Var.dismiss();
            } else {
                zArr[0] = true;
            }
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    public static void lambda$saveFile$50(int r23, java.io.File r24, java.lang.String r25, org.telegram.ui.ActionBar.d2 r26, boolean[] r27, java.lang.String r28, org.telegram.messenger.Utilities.Callback r29, boolean[] r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.lambda$saveFile$50(int, java.io.File, java.lang.String, org.telegram.ui.ActionBar.d2, boolean[], java.lang.String, org.telegram.messenger.Utilities$Callback, boolean[]):void");
    }

    public static void lambda$saveFile$51(boolean[] zArr, DialogInterface dialogInterface) {
        zArr[0] = true;
    }

    public static void lambda$saveFile$52(boolean[] zArr, org.telegram.ui.ActionBar.d2 d2Var) {
        if (!zArr[0]) {
            d2Var.show();
        }
    }

    public static void lambda$saveFile$54(org.telegram.ui.ActionBar.d2 d2Var, boolean[] zArr) {
        try {
            if (d2Var.isShowing()) {
                d2Var.dismiss();
            } else {
                zArr[0] = true;
            }
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    public static void lambda$saveFile$55(File file, File file2, boolean[] zArr, Utilities.Callback callback, org.telegram.ui.ActionBar.d2 d2Var, boolean[] zArr2) {
        Uri uri = null;
        boolean z4 = false;
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                String generateFileName = AndroidUtilities.generateFileName(0, "jpg");
                ContentValues contentValues = new ContentValues();
                Uri contentUri = MediaStore.Images.Media.getContentUri("external_primary");
                contentValues.put("relative_path", new File(Environment.DIRECTORY_PICTURES, "Telegram") + File.separator);
                contentValues.put("_display_name", generateFileName);
                contentValues.put("mime_type", "image/jpeg");
                contentValues.put("mime_type", "image/jpeg");
                Uri insert = ApplicationLoader.applicationContext.getContentResolver().insert(contentUri, contentValues);
                if (insert != null) {
                    OutputStream openOutputStream = ApplicationLoader.applicationContext.getContentResolver().openOutputStream(insert);
                    if (openOutputStream != null) {
                        writeMotionPhoto(file, file2, openOutputStream, zArr);
                        z4 = !zArr[0];
                    }
                    if (openOutputStream != null) {
                        openOutputStream.close();
                    }
                    if (z4) {
                        uri = insert;
                    } else {
                        try {
                            ApplicationLoader.applicationContext.getContentResolver().delete(insert, null, null);
                        } catch (Exception unused) {
                        }
                    }
                }
            } else {
                File file3 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Telegram");
                file3.mkdirs();
                File file4 = new File(file3, AndroidUtilities.generateFileName(0, "jpg"));
                if (!file4.exists()) {
                    file4.createNewFile();
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file4);
                writeMotionPhoto(file, file2, fileOutputStream, zArr);
                fileOutputStream.close();
                if (zArr[0]) {
                    file4.delete();
                } else {
                    AndroidUtilities.addMediaToGallery(file4.getAbsoluteFile());
                    uri = Uri.fromFile(file4);
                    z4 = true;
                }
            }
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        if (z4 && callback != null) {
            AndroidUtilities.runOnUIThread(new i6(callback, uri, 1));
        }
        if (d2Var != null) {
            AndroidUtilities.runOnUIThread(new z5(d2Var, zArr2, 3));
        }
    }

    public void lambda$setCurrentVideoVisible$14() {
        cleanupPlayer(true, true);
    }

    public void lambda$setPlaybackSpeed$16(MessageObject messageObject, float f10) {
        if (this.audioPlayer != null && this.playingMessageObject != null && !this.isPaused) {
            if (isSamePlayingMessage(messageObject)) {
                seekToProgress(this.playingMessageObject, f10);
            }
            this.audioPlayer.C();
        }
    }

    public void lambda$setTextureView$15() {
        cleanupPlayer(true, true);
    }

    public static int lambda$sortPlaylist$13(MessageObject messageObject, MessageObject messageObject2) {
        int compare;
        int id2 = messageObject.getId();
        int id3 = messageObject2.getId();
        long j10 = messageObject.messageOwner.grouped_id;
        long j11 = messageObject2.messageOwner.grouped_id;
        if (id2 < 0 && id3 < 0) {
            if (j10 != 0 && j10 == j11) {
                compare = Integer.compare(id2, id3);
            } else {
                return Integer.compare(id3, id2);
            }
        } else if (j10 != 0 && j10 == j11) {
            compare = Integer.compare(id3, id2);
        } else {
            return Integer.compare(id2, id3);
        }
        return -compare;
    }

    public void lambda$startRaiseToEarSensors$8() {
        Sensor sensor = this.gravitySensor;
        if (sensor != null) {
            this.sensorManager.registerListener(this, sensor, 30000);
        }
        Sensor sensor2 = this.linearSensor;
        if (sensor2 != null) {
            this.sensorManager.registerListener(this, sensor2, 30000);
        }
        Sensor sensor3 = this.accelerometerSensor;
        if (sensor3 != null) {
            this.sensorManager.registerListener(this, sensor3, 30000);
        }
        this.sensorManager.registerListener(this, this.proximitySensor, 3);
    }

    public void lambda$startRecording$33(int i10, int i11) {
        this.recordStartRunnable = null;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStartError, Integer.valueOf(i11));
    }

    public void lambda$startRecording$34(int i10, int i11) {
        this.recordStartRunnable = null;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStartError, Integer.valueOf(i11));
    }

    public void lambda$startRecording$35(int i10, int i11) {
        this.recordStartRunnable = null;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStartError, Integer.valueOf(i11));
    }

    public void lambda$startRecording$36(int i10, int i11) {
        this.recordStartRunnable = null;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(i11), Boolean.TRUE);
    }

    public void lambda$startRecording$37(final int i10, final int i11, long j10, long j11, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, SendMessageChatArguments sendMessageChatArguments) {
        if (this.audioRecorder != null) {
            AndroidUtilities.runOnUIThread(new Runnable(this) {
                public final MediaController f19340b;

                {
                    this.f19340b = this;
                }

                @Override
                public final void run() {
                    switch (r4) {
                        case 0:
                            this.f19340b.lambda$startRecording$33(i10, i11);
                            return;
                        case 1:
                            this.f19340b.lambda$startRecording$34(i10, i11);
                            return;
                        case 2:
                            this.f19340b.lambda$startRecording$35(i10, i11);
                            return;
                        default:
                            this.f19340b.lambda$startRecording$36(i10, i11);
                            return;
                    }
                }
            });
            return;
        }
        setBluetoothScoOn(true);
        this.sendAfterDone = 0;
        TLRPC.TL_document tL_document = new TLRPC.TL_document();
        this.recordingAudio = tL_document;
        this.recordingGuid = i11;
        tL_document.file_reference = new byte[0];
        tL_document.dc_id = Integer.MIN_VALUE;
        tL_document.f20849id = SharedConfig.getLastLocalId();
        this.recordingAudio.user_id = UserConfig.getInstance(i10).getClientUserId();
        TLRPC.TL_document tL_document2 = this.recordingAudio;
        tL_document2.mime_type = "audio/ogg";
        tL_document2.file_reference = new byte[0];
        SharedConfig.saveConfig();
        File directory = FileLoader.getDirectory(1);
        this.recordingAudioFile = new File(directory, System.currentTimeMillis() + "_" + FileLoader.getAttachFileName(this.recordingAudio)) {
            {
                MediaController.this = this;
            }

            @Override
            public boolean delete() {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("delete voice file");
                }
                return super.delete();
            }
        };
        FileLoader.getDirectory(4).mkdirs();
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("start recording internal " + this.recordingAudioFile.getPath() + " " + this.recordingAudioFile.exists());
        }
        AutoDeleteMediaTask.lockFile(this.recordingAudioFile);
        try {
            if (startRecord(this.recordingAudioFile.getPath(), this.sampleRate) == 0) {
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final MediaController f19340b;

                    {
                        this.f19340b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                this.f19340b.lambda$startRecording$33(i10, i11);
                                return;
                            case 1:
                                this.f19340b.lambda$startRecording$34(i10, i11);
                                return;
                            case 2:
                                this.f19340b.lambda$startRecording$35(i10, i11);
                                return;
                            default:
                                this.f19340b.lambda$startRecording$36(i10, i11);
                                return;
                        }
                    }
                });
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("cant init encoder");
                    return;
                }
                return;
            }
            this.audioRecorderPaused = false;
            this.audioRecorder = new AudioRecord(0, this.sampleRate, 16, 2, this.recordBufferSize);
            this.recordStartTime = System.currentTimeMillis();
            long j12 = 0;
            this.recordTimeCount = 0L;
            this.writtenFrame = 0;
            this.samplesCount = 0L;
            this.recordDialogId = j10;
            this.recordMonoForumPeerId = j11;
            this.recordMonoForumSuggestionParams = messageSuggestionParams;
            if (messageObject != null) {
                j12 = MessageObject.getTopicId(this.recordingCurrentAccount, messageObject.messageOwner, false);
            }
            this.recordTopicId = j12;
            this.recordingCurrentAccount = i10;
            this.recordReplyingMsg = messageObject2;
            this.recordReplyingTopMsg = messageObject;
            this.recordReplyingStory = storyItem;
            this.recordSendMessageChatArguments = sendMessageChatArguments;
            this.fileBuffer.rewind();
            this.audioRecorder.startRecording();
            this.recordQueue.postRunnable(this.recordRunnable);
            AndroidUtilities.runOnUIThread(new Runnable(this) {
                public final MediaController f19340b;

                {
                    this.f19340b = this;
                }

                @Override
                public final void run() {
                    switch (r4) {
                        case 0:
                            this.f19340b.lambda$startRecording$33(i10, i11);
                            return;
                        case 1:
                            this.f19340b.lambda$startRecording$34(i10, i11);
                            return;
                        case 2:
                            this.f19340b.lambda$startRecording$35(i10, i11);
                            return;
                        default:
                            this.f19340b.lambda$startRecording$36(i10, i11);
                            return;
                    }
                }
            });
        } catch (Exception e6) {
            FileLog.e(e6);
            this.recordingAudio = null;
            stopRecord();
            AutoDeleteMediaTask.unlockFile(this.recordingAudioFile);
            this.recordingAudioFile.delete();
            this.recordingAudioFile = null;
            File file = this.recordingPrevAudioFile;
            if (file != null) {
                file.delete();
                this.recordingPrevAudioFile = null;
            }
            try {
                this.audioRecorder.release();
                this.audioRecorder = null;
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            setBluetoothScoOn(false);
            AndroidUtilities.runOnUIThread(new Runnable(this) {
                public final MediaController f19340b;

                {
                    this.f19340b = this;
                }

                @Override
                public final void run() {
                    switch (r4) {
                        case 0:
                            this.f19340b.lambda$startRecording$33(i10, i11);
                            return;
                        case 1:
                            this.f19340b.lambda$startRecording$34(i10, i11);
                            return;
                        case 2:
                            this.f19340b.lambda$startRecording$35(i10, i11);
                            return;
                        default:
                            this.f19340b.lambda$startRecording$36(i10, i11);
                            return;
                    }
                }
            });
        }
    }

    public void lambda$stopRaiseToEarSensors$9() {
        Sensor sensor = this.linearSensor;
        if (sensor != null) {
            this.sensorManager.unregisterListener(this, sensor);
        }
        Sensor sensor2 = this.gravitySensor;
        if (sensor2 != null) {
            this.sensorManager.unregisterListener(this, sensor2);
        }
        Sensor sensor3 = this.accelerometerSensor;
        if (sensor3 != null) {
            this.sensorManager.unregisterListener(this, sensor3);
        }
        this.sensorManager.unregisterListener(this, this.proximitySensor);
    }

    public void lambda$stopRecording$42(int i10) {
        int i11;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.recordingCurrentAccount);
        int i12 = NotificationCenter.recordStopped;
        Integer valueOf = Integer.valueOf(this.recordingGuid);
        if (i10 == 2) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i12, valueOf, Integer.valueOf(i11));
    }

    public void lambda$stopRecording$43(int i10, boolean z4, int i11, boolean z10, long j10) {
        if (this.sendAfterDone == 3) {
            this.sendAfterDone = 0;
            stopRecordingInternal(i10, z4, i11, z10, j10);
            return;
        }
        AudioRecord audioRecord = this.audioRecorder;
        if (audioRecord == null) {
            this.recordingAudio = null;
            this.manualRecording = false;
            this.raiseToEarRecord = false;
            this.ignoreOnPause = false;
            return;
        }
        try {
            this.sendAfterDone = i10;
            this.sendAfterDoneNotify = z4;
            this.sendAfterDoneScheduleDate = i11;
            this.sendAfterDoneOnce = z10;
            this.sendAfterDonePayStars = j10;
            audioRecord.stop();
            setBluetoothScoOn(false);
        } catch (Exception e6) {
            FileLog.e(e6);
            if (this.recordingAudioFile != null) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("delete voice file");
                }
                this.recordingAudioFile.delete();
            }
        }
        if (i10 == 0) {
            stopRecordingInternal(0, false, 0, false, 0L);
        }
        try {
            this.feedbackView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        AndroidUtilities.runOnUIThread(new b6(this, i10, 1));
    }

    public void lambda$stopRecordingInternal$40(File file, TLRPC.TL_document tL_document, int i10, boolean z4, int i11, boolean z10, long j10) {
        long length;
        boolean z11;
        char c3;
        TLRPC.TL_document tL_document2;
        int i12;
        String str;
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb = new StringBuilder("stop recording internal ");
            if (file == null) {
                str = "null";
            } else {
                str = file.exists() + " " + file.length() + "  recordTimeCount " + this.recordTimeCount + " writedFrames" + this.writtenFrame;
            }
            org.telegram.ui.yh.v(str, sb);
        }
        if ((file == null || !file.exists()) && BuildVars.DEBUG_VERSION) {
            FileLog.e(new RuntimeException("file not found :( recordTimeCount " + this.recordTimeCount + " writedFrames" + this.writtenFrame));
        }
        MediaDataController.getInstance(this.recordingCurrentAccount).pushDraftVoiceMessage(this.recordDialogId, this.recordTopicId, null);
        tL_document.date = ConnectionsManager.getInstance(this.recordingCurrentAccount).getCurrentTime();
        if (file == null) {
            length = 0;
        } else {
            length = (int) file.length();
        }
        tL_document.size = length;
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
        tL_documentAttributeAudio.voice = true;
        byte[] waveform = getWaveform(file.getAbsolutePath());
        tL_documentAttributeAudio.waveform = waveform;
        if (waveform != null) {
            tL_documentAttributeAudio.flags |= 4;
        }
        long j11 = this.recordTimeCount;
        tL_documentAttributeAudio.duration = j11 / 1000.0d;
        tL_document.attributes.clear();
        tL_document.attributes.add(tL_documentAttributeAudio);
        if (j11 > 700) {
            if (i10 == 1) {
                String absolutePath = file.getAbsolutePath();
                long j12 = this.recordDialogId;
                MessageObject messageObject = this.recordReplyingMsg;
                MessageObject messageObject2 = this.recordReplyingTopMsg;
                if (z10) {
                    i12 = Integer.MAX_VALUE;
                } else {
                    i12 = 0;
                }
                c3 = 1;
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(tL_document, null, absolutePath, j12, messageObject, messageObject2, null, null, null, null, z4, i11, 0, i12, null, null, false);
                of2.monoForumPeer = this.recordMonoForumPeerId;
                of2.suggestionParams = this.recordMonoForumSuggestionParams;
                of2.replyToStoryItem = this.recordReplyingStory;
                of2.sendMessageChatArguments = this.recordSendMessageChatArguments;
                of2.payStars = j10;
                SendMessagesHelper.getInstance(this.recordingCurrentAccount).sendMessage(of2);
            } else {
                c3 = 1;
            }
            NotificationCenter notificationCenter = NotificationCenter.getInstance(this.recordingCurrentAccount);
            int i13 = NotificationCenter.audioDidSent;
            Integer valueOf = Integer.valueOf(this.recordingGuid);
            String str2 = null;
            if (i10 == 2) {
                tL_document2 = tL_document;
            } else {
                tL_document2 = null;
            }
            if (i10 == 2) {
                str2 = file.getAbsolutePath();
            }
            Object[] objArr = new Object[3];
            z11 = false;
            objArr[0] = valueOf;
            objArr[c3] = tL_document2;
            objArr[2] = str2;
            notificationCenter.lambda$postNotificationNameOnUIThread$1(i13, objArr);
        } else {
            z11 = false;
            NotificationCenter.getInstance(this.recordingCurrentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioRecordTooShort, Integer.valueOf(this.recordingGuid), Boolean.FALSE, Integer.valueOf((int) j11));
            AutoDeleteMediaTask.unlockFile(file);
            file.delete();
        }
        requestRecordAudioFocus(z11);
    }

    public void lambda$stopRecordingInternal$41(File file, File file2, TLRPC.TL_document tL_document, int i10, boolean z4, int i11, boolean z10, long j10) {
        stopRecord();
        File joinRecord = joinRecord(file, file2, tL_document);
        if (joinRecord == null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("stop recording recordingAudioFileToSend == null in queue");
                return;
            }
            return;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("stop recording internal in queue " + joinRecord.exists() + " " + joinRecord.length());
        }
        AndroidUtilities.runOnUIThread(new n6(this, joinRecord, tL_document, i10, z4, i11, z10, j10));
    }

    public void lambda$toggleRecordingPause$27(File file, boolean z4, TLRPC.TL_document tL_document) {
        boolean exists = file.exists();
        if (!exists && BuildVars.DEBUG_VERSION) {
            FileLog.e(new RuntimeException("file not found :( recordTimeCount " + this.recordTimeCount + " writedFrames" + this.writtenFrame));
        }
        if (exists) {
            MediaDataController.getInstance(this.recordingCurrentAccount).pushDraftVoiceMessage(this.recordDialogId, this.recordTopicId, MediaDataController.DraftVoice.of(this, file.getAbsolutePath(), z4, 0.0f, 1.0f));
        }
        tL_document.date = ConnectionsManager.getInstance(this.recordingCurrentAccount).getCurrentTime();
        tL_document.size = (int) file.length();
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
        tL_documentAttributeAudio.voice = true;
        byte[] waveform = getWaveform(file.getAbsolutePath());
        tL_documentAttributeAudio.waveform = waveform;
        if (waveform != null) {
            tL_documentAttributeAudio.flags |= 4;
        }
        tL_documentAttributeAudio.duration = this.recordTimeCount / 1000.0d;
        tL_document.attributes.clear();
        tL_document.attributes.add(tL_documentAttributeAudio);
        NotificationCenter.getInstance(this.recordingCurrentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordPaused, new Object[0]);
        NotificationCenter.getInstance(this.recordingCurrentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(this.recordingGuid), tL_document, file.getAbsolutePath());
        requestRecordAudioFocus(false);
    }

    public void lambda$toggleRecordingPause$28(boolean z4) {
        stopRecord();
        TLRPC.TL_document tL_document = this.recordingAudio;
        File joinRecord = joinRecord(this.recordingPrevAudioFile, this.recordingAudioFile, tL_document);
        if (tL_document != null && joinRecord != null) {
            AndroidUtilities.runOnUIThread(new xj(this, joinRecord, z4, tL_document, 5));
        }
    }

    public void lambda$toggleRecordingPause$29() {
        this.recordStartRunnable = null;
        NotificationCenter.getInstance(this.recordingCurrentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStartError, Integer.valueOf(this.recordingGuid));
    }

    public void lambda$toggleRecordingPause$30() {
        requestRecordAudioFocus(true);
        this.audioRecorder = new AudioRecord(0, this.sampleRate, 16, 2, this.recordBufferSize);
        this.recordStartTime = System.currentTimeMillis();
        this.writtenFrame = 0;
        this.samplesCount = 0L;
        this.fileBuffer.rewind();
        this.audioRecorder.startRecording();
        this.recordQueue.postRunnable(this.recordRunnable);
        NotificationCenter.getInstance(this.recordingCurrentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordResumed, new Object[0]);
    }

    public void lambda$toggleRecordingPause$31() {
        this.recordingPrevAudioFile = this.recordingAudioFile;
        File directory = FileLoader.getDirectory(1);
        File file = new File(directory, System.currentTimeMillis() + "_" + FileLoader.getAttachFileName(this.recordingAudio)) {
            {
                MediaController.this = this;
            }

            @Override
            public boolean delete() {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("delete voice file (from resume)");
                }
                return super.delete();
            }
        };
        this.recordingAudioFile = file;
        if (startRecord(file.getPath(), this.sampleRate) == 0) {
            AndroidUtilities.runOnUIThread(new x5(this, 3));
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("cant resume audio encoder");
                return;
            }
            return;
        }
        AndroidUtilities.runOnUIThread(new x5(this, 4));
    }

    public void lambda$toggleRecordingPause$32(boolean z4) {
        if (this.recordingAudio != null && this.recordingAudioFile != null) {
            boolean z10 = this.audioRecorderPaused;
            this.audioRecorderPaused = !z10;
            if (!z10) {
                AudioRecord audioRecord = this.audioRecorder;
                if (audioRecord != null) {
                    this.sendAfterDone = 4;
                    audioRecord.stop();
                    this.audioRecorder.release();
                    this.audioRecorder = null;
                    this.recordQueue.postRunnable(new o6(this, z4, 0));
                    return;
                }
                return;
            }
            this.recordQueue.cancelRunnable(this.recordRunnable);
            this.recordQueue.postRunnable(new x5(this, 9));
        }
    }

    public void lambda$trimCurrentRecording$26(File file, long j10, long j11, Runnable runnable) {
        if (cropOpusFile(this.recordingAudioFile.getAbsolutePath(), file.getAbsolutePath(), j10, j11)) {
            File file2 = this.recordingAudioFile;
            if (file2 != null) {
                file2.delete();
            }
            this.recordingAudioFile = file;
            this.recordTimeCount = j11 - j10;
            if (runnable != null) {
                AndroidUtilities.runOnUIThread(runnable);
            }
        }
    }

    public static void loadGalleryPhotosAlbums(int i10) {
        Thread thread = new Thread(new e6(i10, 0));
        thread.setPriority(1);
        thread.start();
    }

    public static int makeVideoBitrate(int r5, int r6, int r7, int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.makeVideoBitrate(int, int, int, int, int):int");
    }

    public void playNextMessageWithoutOrder(boolean z4) {
        ArrayList<MessageObject> arrayList;
        int i10;
        int i11;
        if (SharedConfig.shuffleMusic) {
            arrayList = this.shuffledPlaylist;
        } else {
            arrayList = this.playlist;
        }
        if (z4 && (((i11 = SharedConfig.repeatMode) == 2 || (i11 == 1 && arrayList.size() == 1)) && !this.forceLoopCurrentPlaylist)) {
            cleanupPlayer(false, false);
            int i12 = this.currentPlaylistNum;
            if (i12 >= 0 && i12 < arrayList.size()) {
                MessageObject messageObject = arrayList.get(this.currentPlaylistNum);
                messageObject.audioProgress = 0.0f;
                messageObject.audioProgressSec = 0;
                playMessage(messageObject);
                return;
            }
            return;
        }
        if (SharedConfig.playOrderReversed) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        if (traversePlaylist(arrayList, i10) && z4 && SharedConfig.repeatMode == 0 && !this.forceLoopCurrentPlaylist) {
            k71 k71Var = this.audioPlayer;
            if (k71Var != null || this.videoPlayer != null) {
                if (k71Var != null) {
                    MusicListenReporter musicListenReporter = this.reporter;
                    if (musicListenReporter != null) {
                        musicListenReporter.destroy();
                        this.reporter = null;
                    }
                    try {
                        this.audioPlayer.H();
                    } catch (Exception e6) {
                        FileLog.e(e6);
                    }
                    this.audioPlayer = null;
                    org.telegram.ui.ActionBar.k6.G1(this.playingMessageObject);
                } else {
                    this.currentAspectRatioFrameLayout = null;
                    this.currentTextureViewContainer = null;
                    this.currentAspectRatioFrameLayoutReady = false;
                    this.currentTextureView = null;
                    this.videoPlayer.H();
                    this.videoPlayer = null;
                    try {
                        this.baseActivity.getWindow().clearFlags(128);
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    AndroidUtilities.cancelRunOnUIThread(this.setLoadingRunnable);
                    FileLoader.getInstance(this.playingMessageObject.currentAccount).removeLoadingVideo(this.playingMessageObject.getDocument(), true, false);
                }
                stopProgressTimer();
                this.lastProgress = 0L;
                this.isPaused = true;
                MessageObject messageObject2 = this.playingMessageObject;
                messageObject2.audioProgress = 0.0f;
                messageObject2.audioProgressSec = 0;
                NotificationCenter.getInstance(messageObject2.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagePlayingProgressDidChanged, Integer.valueOf(this.playingMessageObject.getId()), 0);
                NotificationCenter.getInstance(this.playingMessageObject.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagePlayingPlayStateChanged, Integer.valueOf(this.playingMessageObject.getId()));
                return;
            }
            return;
        }
        int i13 = this.currentPlaylistNum;
        if (i13 >= 0 && i13 < arrayList.size()) {
            MessageObject messageObject3 = this.playingMessageObject;
            if (messageObject3 != null) {
                messageObject3.resetPlayingProgress();
            }
            this.playMusicAgain = true;
            playMessage(arrayList.get(this.currentPlaylistNum));
        }
    }

    public void processMediaObserver(android.net.Uri r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.processMediaObserver(android.net.Uri):void");
    }

    private void raiseToSpeakUpdated(boolean z4) {
        SendMessageChatArguments sendMessageChatArguments;
        long j10;
        if (this.recordingAudio != null) {
            toggleRecordingPause(false);
        } else if (z4) {
            int currentAccount = this.raiseChat.getCurrentAccount();
            long a2 = this.raiseChat.a();
            xn xnVar = this.raiseChat;
            MessageObject messageObject = xnVar.U3;
            int classGuid = xnVar.getClassGuid();
            xn xnVar2 = this.raiseChat;
            MessageSuggestionParams messageSuggestionParams = null;
            if (xnVar2 != null) {
                sendMessageChatArguments = xnVar2.C8();
            } else {
                sendMessageChatArguments = null;
            }
            xn xnVar3 = this.raiseChat;
            if (xnVar3 != null) {
                j10 = xnVar3.N8();
            } else {
                j10 = 0;
            }
            xn xnVar4 = this.raiseChat;
            if (xnVar4 != null) {
                messageSuggestionParams = xnVar4.f43157d5;
            }
            startRecording(currentAccount, a2, null, messageObject, null, classGuid, false, sendMessageChatArguments, j10, messageSuggestionParams);
        } else {
            stopRecording(2, false, 0, false, 0L);
        }
    }

    public boolean restoreMusicPlaylistState() {
        ArrayList<MessageObject> arrayList;
        int i10;
        MessageObject messageObject;
        SavedMusicPlaylistState savedMusicPlaylistState = this.savedMusicPlaylistState;
        if (savedMusicPlaylistState == null) {
            return false;
        }
        this.savedMusicPlaylistState = null;
        if (SharedConfig.shuffleMusic) {
            arrayList = this.shuffledPlaylist;
        } else {
            arrayList = this.playlist;
        }
        if (arrayList == null || (i10 = this.currentPlaylistNum) < 0 || i10 >= arrayList.size() || (messageObject = arrayList.get(this.currentPlaylistNum)) == null || messageObject.getDialogId() != savedMusicPlaylistState.playingMessage.getDialogId() || messageObject.getId() != savedMusicPlaylistState.playingMessage.getId()) {
            return false;
        }
        this.playMusicAgain = false;
        float f10 = savedMusicPlaylistState.progress;
        messageObject.forceSeekTo = f10;
        messageObject.audioProgress = f10;
        messageObject.audioProgressMs = savedMusicPlaylistState.progressMs;
        messageObject.audioProgressSec = savedMusicPlaylistState.progressSec;
        playMessage(messageObject);
        pauseMessage(messageObject, false);
        return true;
    }

    private boolean resumeAudio(MessageObject messageObject) {
        if ((this.audioPlayer != null || this.videoPlayer != null) && messageObject != null && this.playingMessageObject != null && isSamePlayingMessage(messageObject)) {
            try {
                startProgressTimer(this.playingMessageObject);
                ValueAnimator valueAnimator = this.audioVolumeAnimator;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.audioVolumeAnimator.cancel();
                }
                if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.audioVolume, 1.0f);
                    this.audioVolumeAnimator = ofFloat;
                    ofFloat.addUpdateListener(this.audioVolumeUpdateListener);
                    this.audioVolumeAnimator.setDuration(300L);
                    this.audioVolumeAnimator.start();
                } else {
                    this.audioVolume = 1.0f;
                    setPlayerVolume();
                }
                k71 k71Var = this.audioPlayer;
                if (k71Var != null) {
                    k71Var.C();
                } else {
                    k71 k71Var2 = this.videoPlayer;
                    if (k71Var2 != null) {
                        k71Var2.C();
                    }
                }
                checkAudioFocus(messageObject);
                this.isPaused = false;
                NotificationCenter.getInstance(this.playingMessageObject.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagePlayingPlayStateChanged, Integer.valueOf(this.playingMessageObject.getId()));
                try {
                    d1.f.b(1);
                    if (!this.ignorePlayerUpdate) {
                        d1.f.x(true);
                    }
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                return true;
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        return false;
    }

    public static void saveFile(String str, Context context, int i10, String str2, String str3) {
        saveFile(str, context, i10, str2, str3, null);
    }

    public static Uri saveFileInternal(int i10, File file, String str) {
        String str2;
        Uri contentUri;
        try {
            ContentValues contentValues = new ContentValues();
            String fileExtension = FileLoader.getFileExtension(file);
            if (fileExtension != null) {
                str2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtension);
            } else {
                str2 = null;
            }
            if ((i10 == 0 || i10 == 1) && str2 != null) {
                if (str2.startsWith("image")) {
                    i10 = 0;
                }
                if (str2.startsWith("video")) {
                    i10 = 1;
                }
            }
            if (i10 == 0) {
                if (str == null) {
                    str = AndroidUtilities.generateFileName(0, fileExtension);
                }
                contentUri = MediaStore.Images.Media.getContentUri("external_primary");
                contentValues.put("relative_path", new File(Environment.DIRECTORY_PICTURES, "Telegram") + File.separator);
                contentValues.put("_display_name", str);
                contentValues.put("mime_type", str2);
            } else if (i10 == 1) {
                if (str == null) {
                    str = AndroidUtilities.generateFileName(1, fileExtension);
                }
                contentValues.put("relative_path", new File(Environment.DIRECTORY_MOVIES, "Telegram") + File.separator);
                contentUri = MediaStore.Video.Media.getContentUri("external_primary");
                contentValues.put("_display_name", str);
            } else if (i10 == 2) {
                if (str == null) {
                    str = file.getName();
                }
                contentValues.put("relative_path", new File(Environment.DIRECTORY_DOWNLOADS, "Telegram") + File.separator);
                contentUri = MediaStore.Downloads.getContentUri("external_primary");
                contentValues.put("_display_name", str);
            } else {
                if (str == null) {
                    str = file.getName();
                }
                contentValues.put("relative_path", new File(Environment.DIRECTORY_MUSIC, "Telegram") + File.separator);
                contentUri = MediaStore.Audio.Media.getContentUri("external_primary");
                contentValues.put("_display_name", str);
            }
            contentValues.put("mime_type", str2);
            Uri insert = ApplicationLoader.applicationContext.getContentResolver().insert(contentUri, contentValues);
            if (insert != null) {
                FileInputStream fileInputStream = new FileInputStream(file);
                AndroidUtilities.copyFile(fileInputStream, ApplicationLoader.applicationContext.getContentResolver().openOutputStream(insert));
                fileInputStream.close();
            }
            return insert;
        } catch (Exception e6) {
            FileLog.e(e6);
            return null;
        }
    }

    public static void saveFilesFromMessages(Context context, AccountInstance accountInstance, ArrayList<MessageObject> arrayList, MessagesStorage.IntCallback intCallback) {
        if (arrayList != null && !arrayList.isEmpty()) {
            new MediaLoader(context, accountInstance, arrayList, intCallback).start();
        }
    }

    private boolean saveMusicPlaylistStateIfNeeded() {
        MessageObject messageObject = this.playingMessageObject;
        if (messageObject != null && messageObject.isMusic() && !this.playlist.isEmpty()) {
            this.savedMusicPlaylistState = new SavedMusicPlaylistState(this.playingMessageObject);
            return true;
        } else if (this.savedMusicPlaylistState != null) {
            return true;
        } else {
            return false;
        }
    }

    public static MediaCodecInfo selectCodec(String str) {
        int codecCount = MediaCodecList.getCodecCount();
        MediaCodecInfo mediaCodecInfo = null;
        for (int i10 = 0; i10 < codecCount; i10++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i10);
            if (codecInfoAt.isEncoder()) {
                for (String str2 : codecInfoAt.getSupportedTypes()) {
                    if (str2.equalsIgnoreCase(str)) {
                        String name = codecInfoAt.getName();
                        if (name != null && (!name.equals("OMX.SEC.avc.enc") || name.equals("OMX.SEC.AVC.Encoder"))) {
                            return codecInfoAt;
                        }
                        mediaCodecInfo = codecInfoAt;
                    }
                }
                continue;
            }
        }
        return mediaCodecInfo;
    }

    public static int selectColorFormat(MediaCodecInfo mediaCodecInfo, String str) {
        int i10;
        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int[] iArr = capabilitiesForType.colorFormats;
            if (i11 < iArr.length) {
                i10 = iArr[i11];
                if (isRecognizedFormat(i10)) {
                    if (!mediaCodecInfo.getName().equals("OMX.SEC.AVC.Encoder") || i10 != 19) {
                        break;
                    }
                    i12 = i10;
                }
                i11++;
            } else {
                return i12;
            }
        }
        return i10;
    }

    private void setBluetoothScoOn(boolean z4) {
        AudioManager audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService("audio");
        if (SharedConfig.recordViaSco && !ie0.f("android.permission.BLUETOOTH_CONNECT")) {
            SharedConfig.recordViaSco = false;
            SharedConfig.saveConfig();
        }
        if ((audioManager.isBluetoothScoAvailableOffCall() && SharedConfig.recordViaSco) || !z4) {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter != null) {
                try {
                    if (defaultAdapter.getProfileConnectionState(1) != 2) {
                    }
                    if (!z4 && !audioManager.isBluetoothScoOn()) {
                        audioManager.startBluetoothSco();
                        return;
                    } else if (z4 && audioManager.isBluetoothScoOn()) {
                        audioManager.stopBluetoothSco();
                        return;
                    }
                } catch (SecurityException unused) {
                    return;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    return;
                }
            }
            if (z4) {
                return;
            }
            if (!z4) {
            }
            if (z4) {
            }
        }
    }

    public void setPlayerVolume() {
        float f10;
        try {
            float f11 = 0.0f;
            if (this.isSilent) {
                f10 = 0.0f;
            } else if (this.audioFocus != 1) {
                f10 = 1.0f;
            } else {
                f10 = 0.2f;
            }
            k71 k71Var = this.audioPlayer;
            if (k71Var != null) {
                if (!d1.f.u()) {
                    f11 = this.audioVolume * f10;
                }
                k71Var.W(f11);
                return;
            }
            k71 k71Var2 = this.videoPlayer;
            if (k71Var2 != null) {
                if (!d1.f.u()) {
                    f11 = f10;
                }
                k71Var2.W(f11);
            }
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    private void setUseFrontSpeaker(boolean z4) {
        this.useFrontSpeaker = z4;
        AudioManager audioManager = NotificationsController.audioManager;
        if (z4) {
            audioManager.setBluetoothScoOn(false);
            audioManager.setSpeakerphoneOn(false);
            return;
        }
        audioManager.setSpeakerphoneOn(true);
    }

    private void sortPlaylist() {
        Collections.sort(this.playlist, new d(7));
    }

    private void startAudioAgain(boolean z4) {
        boolean z10;
        MessageObject messageObject = this.playingMessageObject;
        if (messageObject != null) {
            int i10 = 0;
            NotificationCenter.getInstance(messageObject.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioRouteChanged, Boolean.valueOf(this.useFrontSpeaker));
            k71 k71Var = this.videoPlayer;
            if (k71Var != null) {
                if (!this.useFrontSpeaker) {
                    i10 = 3;
                }
                k71Var.S(i10);
                if (!z4) {
                    if (this.videoPlayer.n() < 1000) {
                        this.videoPlayer.K(0L);
                    }
                    this.videoPlayer.C();
                    return;
                }
                lambda$startAudioAgain$7(this.playingMessageObject);
                return;
            }
            k71 k71Var2 = this.audioPlayer;
            if (k71Var2 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            MessageObject messageObject2 = this.playingMessageObject;
            float f10 = messageObject2.audioProgress;
            int i11 = messageObject2.audioPlayerDuration;
            if (!z4 && k71Var2 != null && k71Var2.y() && i11 * f10 <= 1.0f) {
                messageObject2.audioProgress = 0.0f;
            } else {
                messageObject2.audioProgress = f10;
            }
            cleanupPlayer(false, true);
            playMessage(messageObject2);
            if (z4) {
                if (z10) {
                    AndroidUtilities.runOnUIThread(new d2(17, this, messageObject2), 100L);
                } else {
                    lambda$startAudioAgain$7(messageObject2);
                }
            }
        }
    }

    private void startProgressTimer(MessageObject messageObject) {
        synchronized (this.progressTimerSync) {
            java.util.Timer timer = this.progressTimer;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.progressTimer = null;
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
            }
            messageObject.getFileName();
            java.util.Timer timer2 = new java.util.Timer();
            this.progressTimer = timer2;
            timer2.schedule(new AnonymousClass5(messageObject), 0L, 17L);
        }
    }

    private native int startRecord(String str, int i10);

    private boolean startVideoConvertFromQueue() {
        if (this.videoConvertQueue.isEmpty()) {
            return false;
        }
        VideoConvertMessage videoConvertMessage = this.videoConvertQueue.get(0);
        VideoEditedInfo videoEditedInfo = videoConvertMessage.videoEditedInfo;
        synchronized (this.videoConvertSync) {
            if (videoEditedInfo != null) {
                try {
                    videoEditedInfo.canceled = false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        VideoConvertRunnable.runConversion(videoConvertMessage);
        return true;
    }

    private void stopProgressTimer() {
        synchronized (this.progressTimerSync) {
            java.util.Timer timer = this.progressTimer;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.progressTimer = null;
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
            }
        }
    }

    private native void stopRecord();

    public void stopRecordingInternal(final int i10, final boolean z4, final int i11, final boolean z10, final long j10) {
        final File file;
        if (i10 != 0 && (file = this.recordingAudioFile) != null) {
            final TLRPC.TL_document tL_document = this.recordingAudio;
            final File file2 = this.recordingPrevAudioFile;
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("stop recording internal filename " + this.recordingAudioFile.getPath());
            }
            this.fileEncodingQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MediaController.this.lambda$stopRecordingInternal$41(file2, file, tL_document, i10, z4, i11, z10, j10);
                }
            });
        } else {
            AutoDeleteMediaTask.unlockFile(this.recordingAudioFile);
            File file3 = this.recordingAudioFile;
            if (file3 != null) {
                file3.delete();
            }
            requestRecordAudioFocus(false);
        }
        try {
            AudioRecord audioRecord = this.audioRecorder;
            if (audioRecord != null) {
                audioRecord.release();
                this.audioRecorder = null;
            }
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        this.recordingAudio = null;
        this.recordingPrevAudioFile = null;
        this.recordingAudioFile = null;
        this.manualRecording = false;
        this.raiseToEarRecord = false;
        this.ignoreOnPause = false;
    }

    private boolean traversePlaylist(ArrayList<MessageObject> arrayList, int i10) {
        boolean z4;
        int size;
        MessageObject messageObject;
        int i11;
        MessageObject messageObject2;
        int i12 = this.currentPlaylistNum;
        int i13 = 0;
        if (ConnectionsManager.getInstance(UserConfig.selectedAccount).getConnectionState() == 2) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.currentPlaylistNum += i10;
        if (z4) {
            while (this.currentPlaylistNum < arrayList.size() && (i11 = this.currentPlaylistNum) >= 0 && ((messageObject2 = arrayList.get(i11)) == null || !messageObject2.mediaExists)) {
                this.currentPlaylistNum += i10;
            }
        }
        if (this.currentPlaylistNum < arrayList.size() && this.currentPlaylistNum >= 0) {
            return false;
        }
        if (this.currentPlaylistNum >= arrayList.size()) {
            size = 0;
        } else {
            size = arrayList.size() - 1;
        }
        this.currentPlaylistNum = size;
        if (z4) {
            while (true) {
                int i14 = this.currentPlaylistNum;
                if (i14 < 0 || i14 >= arrayList.size()) {
                    break;
                }
                int i15 = this.currentPlaylistNum;
                if (i10 > 0) {
                    if (i15 > i12) {
                        break;
                    }
                    messageObject = arrayList.get(this.currentPlaylistNum);
                    if (messageObject == null && messageObject.mediaExists) {
                        break;
                    }
                    this.currentPlaylistNum += i10;
                } else {
                    if (i15 < i12) {
                        break;
                    }
                    messageObject = arrayList.get(this.currentPlaylistNum);
                    if (messageObject == null) {
                    }
                    this.currentPlaylistNum += i10;
                }
            }
            if (this.currentPlaylistNum >= arrayList.size() || this.currentPlaylistNum < 0) {
                if (this.currentPlaylistNum < arrayList.size()) {
                    i13 = arrayList.size() - 1;
                }
                this.currentPlaylistNum = i13;
            }
        }
        return true;
    }

    public void updateVideoState(MessageObject messageObject, int[] iArr, boolean z4, boolean z10, int i10) {
        MessageObject messageObject2;
        if (this.videoPlayer != null) {
            if (i10 != 4 && i10 != 1) {
                try {
                    this.baseActivity.getWindow().addFlags(128);
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
            } else {
                try {
                    this.baseActivity.getWindow().clearFlags(128);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            if (i10 == 3) {
                this.playerWasReady = true;
                MessageObject messageObject3 = this.playingMessageObject;
                if (messageObject3 != null && (messageObject3.isVideo() || this.playingMessageObject.isRoundVideo())) {
                    AndroidUtilities.cancelRunOnUIThread(this.setLoadingRunnable);
                    FileLoader.getInstance(messageObject.currentAccount).removeLoadingVideo(this.playingMessageObject.getDocument(), true, false);
                }
                this.currentAspectRatioFrameLayoutReady = true;
            } else if (i10 == 2) {
                if (z10 && (messageObject2 = this.playingMessageObject) != null) {
                    if (messageObject2.isVideo() || this.playingMessageObject.isRoundVideo()) {
                        if (this.playerWasReady) {
                            this.setLoadingRunnable.run();
                        } else {
                            AndroidUtilities.runOnUIThread(this.setLoadingRunnable, 1000L);
                        }
                    }
                }
            } else if (this.videoPlayer.y() && i10 == 4) {
                MessageObject messageObject4 = this.playingMessageObject;
                if (messageObject4 != null && messageObject4.isVideo() && !z4 && (iArr == null || iArr[0] < 4)) {
                    this.videoPlayer.K(0L);
                    if (iArr != null) {
                        iArr[0] = iArr[0] + 1;
                    }
                } else if (!restoreMusicPlaylistState()) {
                    cleanupPlayer(true, hasNoNextVoiceOrRoundVideoMessage(), true, false);
                }
            }
        }
    }

    public native int writeFrame(ByteBuffer byteBuffer, int i10);

    public static void writeMotionPhoto(File file, File file2, OutputStream outputStream, boolean[] zArr) {
        String buildMotionPhotoXmp = buildMotionPhotoXmp(file2.length());
        byte[] bytes = "http://ns.adobe.com/xap/1.0/\u0000".getBytes("UTF-8");
        byte[] bytes2 = buildMotionPhotoXmp.getBytes("UTF-8");
        int length = bytes.length + bytes2.length + 2;
        if (length <= 65535) {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                int read = fileInputStream.read();
                int read2 = fileInputStream.read();
                if (read == 255 && read2 == 216) {
                    outputStream.write(255);
                    outputStream.write(216);
                    outputStream.write(255);
                    outputStream.write(225);
                    outputStream.write((length >> 8) & 255);
                    outputStream.write(length & 255);
                    outputStream.write(bytes);
                    outputStream.write(bytes2);
                    byte[] bArr = new byte[65536];
                    while (true) {
                        int read3 = fileInputStream.read(bArr);
                        if (read3 > 0) {
                            if (zArr != null && zArr[0]) {
                                fileInputStream.close();
                                return;
                            }
                            outputStream.write(bArr, 0, read3);
                        } else {
                            fileInputStream.close();
                            FileInputStream fileInputStream2 = new FileInputStream(file2);
                            try {
                                byte[] bArr2 = new byte[65536];
                                while (true) {
                                    int read4 = fileInputStream2.read(bArr2);
                                    if (read4 > 0) {
                                        if (zArr != null && zArr[0]) {
                                            fileInputStream2.close();
                                            return;
                                        }
                                        outputStream.write(bArr2, 0, read4);
                                    } else {
                                        fileInputStream2.close();
                                        return;
                                    }
                                }
                            } catch (Throwable th2) {
                                try {
                                    fileInputStream2.close();
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                                throw th2;
                            }
                        }
                    }
                } else {
                    throw new IOException("Not a JPEG: " + file);
                }
            } catch (Throwable th4) {
                try {
                    fileInputStream.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } else {
            throw new IOException(l.d.j(length, "XMP segment too large: "));
        }
    }

    public void cancelVideoConvert(MessageObject messageObject) {
        if (messageObject != null && !this.videoConvertQueue.isEmpty()) {
            for (int i10 = 0; i10 < this.videoConvertQueue.size(); i10++) {
                VideoConvertMessage videoConvertMessage = this.videoConvertQueue.get(i10);
                MessageObject messageObject2 = videoConvertMessage.messageObject;
                if (messageObject2.equals(messageObject) && messageObject2.currentAccount == messageObject.currentAccount) {
                    if (i10 == 0) {
                        synchronized (this.videoConvertSync) {
                            videoConvertMessage.videoEditedInfo.canceled = true;
                        }
                        return;
                    }
                    this.foregroundConvertingMessages.remove(this.videoConvertQueue.remove(i10));
                    checkForegroundConvertMessage(true);
                    return;
                }
            }
        }
    }

    public void checkIsNextMediaFileDownloaded() {
        MessageObject messageObject = this.playingMessageObject;
        if (messageObject != null && messageObject.isMusic()) {
            checkIsNextMusicFileDownloaded(this.playingMessageObject.currentAccount);
        }
    }

    public void checkVolumeBarUI() {
        int i10;
        if (!this.isSilent) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                if (Math.abs(currentTimeMillis - volumeBarLastTimeShown) >= 5000) {
                    AudioManager audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService("audio");
                    if (this.useFrontSpeaker) {
                        i10 = 0;
                    } else {
                        i10 = 3;
                    }
                    int streamVolume = audioManager.getStreamVolume(i10);
                    if (streamVolume == 0) {
                        audioManager.adjustStreamVolume(i10, streamVolume, 1);
                        volumeBarLastTimeShown = currentTimeMillis;
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public void cleanRecording(boolean z4) {
        File file;
        File file2;
        this.recordingAudio = null;
        AutoDeleteMediaTask.unlockFile(this.recordingAudioFile);
        if (z4 && (file2 = this.recordingAudioFile) != null) {
            try {
                file2.delete();
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
        this.recordingAudioFile = null;
        if (z4 && (file = this.recordingPrevAudioFile) != null) {
            file.delete();
        }
        this.recordingPrevAudioFile = null;
        this.manualRecording = false;
        this.raiseToEarRecord = false;
        this.ignoreOnPause = false;
    }

    public void cleanup() {
        cleanupPlayer(true, true);
        this.audioInfo = null;
        this.playMusicAgain = false;
        for (int i10 = 0; i10 < 4; i10++) {
            DownloadController.getInstance(i10).cleanup();
        }
        this.videoConvertQueue.clear();
        this.generatingWaveform.clear();
        this.savedMusicPlaylistState = null;
        this.voiceMessagesPlaylist = null;
        this.voiceMessagesPlaylistMap = null;
        clearPlaylist();
        cancelVideoConvert(null);
    }

    public void cleanupPlayer(boolean z4, boolean z10) {
        cleanupPlayer(z4, z10, false, false);
    }

    public boolean currentPlaylistIsGlobalSearch() {
        if (this.playlistGlobalSearchParams != null) {
            return true;
        }
        return false;
    }

    @Override
    public void didReceivedNotification(int i10, int i11, Object... objArr) {
        MessagesController.SavedMusicList savedMusicList;
        MessageObject messageObject;
        ArrayList<MessageObject> arrayList;
        char c3;
        int indexOf;
        int i12 = 0;
        if (i10 != NotificationCenter.fileLoaded && i10 != NotificationCenter.httpFileDidLoad) {
            if (i10 == NotificationCenter.messagesDeleted) {
                if (!((Boolean) objArr[2]).booleanValue()) {
                    long longValue = ((Long) objArr[1]).longValue();
                    ArrayList arrayList2 = (ArrayList) objArr[0];
                    MessageObject messageObject2 = this.playingMessageObject;
                    if (messageObject2 != null && longValue == messageObject2.messageOwner.peer_id.channel_id && arrayList2.contains(Integer.valueOf(messageObject2.getId()))) {
                        cleanupPlayer(true, true);
                    }
                    ArrayList<MessageObject> arrayList3 = this.voiceMessagesPlaylist;
                    if (arrayList3 != null && !arrayList3.isEmpty() && longValue == this.voiceMessagesPlaylist.get(0).messageOwner.peer_id.channel_id) {
                        while (i12 < arrayList2.size()) {
                            Integer num = (Integer) arrayList2.get(i12);
                            MessageObject messageObject3 = this.voiceMessagesPlaylistMap.get(num.intValue());
                            this.voiceMessagesPlaylistMap.remove(num.intValue());
                            if (messageObject3 != null) {
                                this.voiceMessagesPlaylist.remove(messageObject3);
                            }
                            i12++;
                        }
                        return;
                    }
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.removeAllMessagesFromDialog) {
                long longValue2 = ((Long) objArr[0]).longValue();
                MessageObject messageObject4 = this.playingMessageObject;
                if (messageObject4 != null && messageObject4.getDialogId() == longValue2) {
                    cleanupPlayer(false, true);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.musicDidLoad) {
                long longValue3 = ((Long) objArr[0]).longValue();
                MessageObject messageObject5 = this.playingMessageObject;
                if (messageObject5 != null && messageObject5.isMusic() && this.playingMessageObject.getDialogId() == longValue3 && !this.playingMessageObject.scheduled) {
                    this.playlist.addAll(0, (ArrayList) objArr[1]);
                    this.playlist.addAll((ArrayList) objArr[2]);
                    int size = this.playlist.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        MessageObject messageObject6 = this.playlist.get(i13);
                        this.playlistMap.put(Integer.valueOf(messageObject6.getId()), messageObject6);
                        int[] iArr = this.playlistMaxId;
                        iArr[0] = Math.min(iArr[0], messageObject6.getId());
                    }
                    sortPlaylist();
                    if (SharedConfig.shuffleMusic) {
                        buildShuffledPlayList();
                    } else {
                        MessageObject messageObject7 = this.playingMessageObject;
                        if (messageObject7 != null && (indexOf = this.playlist.indexOf(messageObject7)) >= 0) {
                            this.currentPlaylistNum = indexOf;
                        }
                    }
                    this.playlistClassGuid = ConnectionsManager.generateClassGuid();
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.mediaDidLoad) {
                if (((Integer) objArr[3]).intValue() == this.playlistClassGuid && this.playingMessageObject != null) {
                    long longValue4 = ((Long) objArr[0]).longValue();
                    ((Integer) objArr[4]).getClass();
                    ArrayList arrayList4 = (ArrayList) objArr[2];
                    DialogObject.isEncryptedDialog(longValue4);
                    if (longValue4 == this.playlistMergeDialogId) {
                        c3 = 1;
                    } else {
                        c3 = 0;
                    }
                    if (!arrayList4.isEmpty()) {
                        this.playlistEndReached[c3] = ((Boolean) objArr[5]).booleanValue();
                    }
                    int i14 = 0;
                    for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                        MessageObject messageObject8 = (MessageObject) arrayList4.get(i15);
                        if (!messageObject8.isVoiceOnce() && !this.playlistMap.containsKey(Integer.valueOf(messageObject8.getId()))) {
                            i14++;
                            this.playlist.add(0, messageObject8);
                            this.playlistMap.put(Integer.valueOf(messageObject8.getId()), messageObject8);
                            int[] iArr2 = this.playlistMaxId;
                            iArr2[c3] = Math.min(iArr2[c3], messageObject8.getId());
                        }
                    }
                    sortPlaylist();
                    int indexOf2 = this.playlist.indexOf(this.playingMessageObject);
                    if (indexOf2 >= 0) {
                        this.currentPlaylistNum = indexOf2;
                    }
                    this.loadingPlaylist = false;
                    if (SharedConfig.shuffleMusic) {
                        buildShuffledPlayList();
                    }
                    if (i14 != 0) {
                        NotificationCenter.getInstance(this.playingMessageObject.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.moreMusicDidLoad, Integer.valueOf(i14));
                        return;
                    }
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.didReceiveNewMessages) {
                if (!((Boolean) objArr[2]).booleanValue() && (arrayList = this.voiceMessagesPlaylist) != null && !arrayList.isEmpty() && ((Long) objArr[0]).longValue() == this.voiceMessagesPlaylist.get(0).getDialogId()) {
                    ArrayList arrayList5 = (ArrayList) objArr[1];
                    while (i12 < arrayList5.size()) {
                        MessageObject messageObject9 = (MessageObject) arrayList5.get(i12);
                        if ((messageObject9.isVoice() || messageObject9.isRoundVideo()) && !messageObject9.isVoiceOnce() && !messageObject9.isRoundOnce() && (!this.voiceMessagesPlaylistUnread || (messageObject9.isContentUnread() && !messageObject9.isOut()))) {
                            this.voiceMessagesPlaylist.add(messageObject9);
                            this.voiceMessagesPlaylistMap.put(messageObject9.getId(), messageObject9);
                        }
                        i12++;
                    }
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.playerDidStartPlaying) {
                if (!isCurrentPlayer((k71) objArr[0])) {
                    MessageObject playingMessageObject = getPlayingMessageObject();
                    if (playingMessageObject != null && isPlayingMessage(playingMessageObject) && !isMessagePaused() && (playingMessageObject.isMusic() || playingMessageObject.isVoice())) {
                        this.wasPlayingAudioBeforePause = true;
                    }
                    lambda$startAudioAgain$7(playingMessageObject);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.musicListLoaded && (savedMusicList = this.currentSavedMusicList) != null && objArr[0] == savedMusicList) {
                int size2 = savedMusicList.list.size() - this.playlist.size();
                this.playlist.clear();
                this.playlist.addAll(this.currentSavedMusicList.list);
                sortPlaylist();
                if (SharedConfig.shuffleMusic) {
                    buildShuffledPlayList();
                } else {
                    MessageObject messageObject10 = this.playingMessageObject;
                    if (messageObject10 != null) {
                        int indexOf3 = this.playlist.indexOf(messageObject10);
                        if (indexOf3 >= 0) {
                            this.currentPlaylistNum = indexOf3;
                        } else {
                            int i16 = this.currentPlaylistNum;
                            if (i16 < 0 || i16 >= this.playlist.size()) {
                                this.currentPlaylistNum = 0;
                            }
                            if (this.playlist.size() == 0) {
                                cleanup();
                            } else {
                                playMessage(this.playlist.get(0));
                            }
                        }
                    }
                }
                if (size2 != 0 && (messageObject = this.playingMessageObject) != null) {
                    NotificationCenter.getInstance(messageObject.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.moreMusicDidLoad, Integer.valueOf(size2));
                    return;
                }
                return;
            } else {
                return;
            }
        }
        String str = (String) objArr[0];
        MessageObject messageObject11 = this.playingMessageObject;
        if (messageObject11 != null && messageObject11.currentAccount == i11 && FileLoader.getAttachFileName(messageObject11.getDocument()).equals(str)) {
            if (this.downloadingCurrentMessage) {
                this.playMusicAgain = true;
                playMessage(this.playingMessageObject);
            } else if (this.audioInfo == null) {
                try {
                    this.audioInfo = we.a.a(FileLoader.getInstance(UserConfig.selectedAccount).getPathToMessage(this.playingMessageObject.messageOwner));
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
            }
        }
    }

    public boolean findMessageInPlaylistAndPlay(MessageObject messageObject) {
        int indexOf = this.playlist.indexOf(messageObject);
        if (indexOf == -1) {
            return playMessage(messageObject);
        }
        playMessageAtIndex(indexOf);
        return true;
    }

    public void generateWaveform(MessageObject messageObject) {
        String str = messageObject.getId() + "_" + messageObject.getDialogId();
        String absolutePath = FileLoader.getInstance(messageObject.currentAccount).getPathToMessage(messageObject.messageOwner).getAbsolutePath();
        if (this.generatingWaveform.containsKey(str)) {
            return;
        }
        this.generatingWaveform.put(str, messageObject);
        Utilities.globalQueue.postRunnable(new sk(this, absolutePath, str, messageObject, 11));
    }

    public we.a getAudioInfo() {
        return this.audioInfo;
    }

    public bf.h getCurrentChromecastMedia() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.getCurrentChromecastMedia():bf.h");
    }

    public VideoConvertMessage getCurrentForegroundConverMessage() {
        return this.currentForegroundConvertingVideo;
    }

    public long getCurrentPosition() {
        MessageObject messageObject = this.playingMessageObject;
        if (messageObject == null) {
            return -1L;
        }
        return getProgressMs(messageObject);
    }

    public long getDuration() {
        k71 k71Var = this.audioPlayer;
        if (k71Var == null) {
            return 0L;
        }
        return k71Var.p();
    }

    public float getFastPlaybackSpeed(boolean z4) {
        if (z4) {
            return this.fastMusicPlaybackSpeed;
        }
        return this.fastPlaybackSpeed;
    }

    public MessagesController.SavedMusicList getMusicList() {
        return this.currentSavedMusicList;
    }

    public float getPlaybackSpeed(boolean z4) {
        if (z4) {
            return this.currentMusicPlaybackSpeed;
        }
        return this.currentPlaybackSpeed;
    }

    public MessageObject getPlayingMessageObject() {
        return this.playingMessageObject;
    }

    public int getPlayingMessageObjectNum() {
        return this.currentPlaylistNum;
    }

    public ArrayList<MessageObject> getPlaylist() {
        return this.playlist;
    }

    public long getProgressMs(MessageObject messageObject) {
        MessageObject messageObject2 = this.playingMessageObject;
        if ((this.audioPlayer != null || this.videoPlayer != null) && messageObject != null && messageObject2 != null && isSamePlayingMessage(messageObject)) {
            try {
                k71 k71Var = this.audioPlayer;
                if (k71Var != null) {
                    return k71Var.n();
                }
                k71 k71Var2 = this.videoPlayer;
                if (k71Var2 != null) {
                    return k71Var2.n();
                }
            } catch (Exception unused) {
            }
        }
        return -1L;
    }

    public k71 getVideoPlayer() {
        return this.videoPlayer;
    }

    public native byte[] getWaveform2(short[] sArr, int i10);

    public boolean hasNoNextVoiceOrRoundVideoMessage() {
        ArrayList<MessageObject> arrayList;
        MessageObject messageObject = this.playingMessageObject;
        if (messageObject == null || ((!messageObject.isVoice() && !this.playingMessageObject.isRoundVideo()) || (arrayList = this.voiceMessagesPlaylist) == null || arrayList.size() <= 1 || !this.voiceMessagesPlaylist.contains(this.playingMessageObject) || this.voiceMessagesPlaylist.indexOf(this.playingMessageObject) >= this.voiceMessagesPlaylist.size() - 1)) {
            return true;
        }
        return false;
    }

    public void injectVideoPlayer(k71 k71Var, MessageObject messageObject) {
        if (k71Var != null && messageObject != null) {
            FileLoader.getInstance(messageObject.currentAccount).setLoadingVideoForPlayer(messageObject.getDocument(), true);
            this.playerWasReady = false;
            clearPlaylist();
            this.videoPlayer = k71Var;
            this.playingMessageObject = messageObject;
            int i10 = this.playerNum + 1;
            this.playerNum = i10;
            k71Var.G = new AnonymousClass7(i10, messageObject, null, true);
            this.currentAspectRatioFrameLayoutReady = false;
            TextureView textureView = this.currentTextureView;
            if (textureView != null) {
                this.videoPlayer.V(textureView);
            }
            checkAudioFocus(messageObject);
            setPlayerVolume();
            this.isPaused = false;
            this.lastProgress = 0L;
            MessageObject messageObject2 = this.playingMessageObject;
            this.playingMessageObject = messageObject;
            if (!SharedConfig.enabledRaiseTo(true)) {
                startRaiseToEarSensors(this.raiseChat);
            }
            startProgressTimer(this.playingMessageObject);
            NotificationCenter.getInstance(messageObject.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagePlayingDidStart, messageObject, messageObject2);
        }
    }

    public boolean isBuffering() {
        k71 k71Var = this.audioPlayer;
        if (k71Var == null || k71Var.d == null || k71Var.I != 2) {
            return false;
        }
        return true;
    }

    public boolean isCurrentPlayer(k71 k71Var) {
        if (this.videoPlayer != k71Var && this.audioPlayer != k71Var) {
            return false;
        }
        return true;
    }

    public boolean isDownloadingCurrentMessage() {
        return this.downloadingCurrentMessage;
    }

    public boolean isGoingToShowMessageObject(MessageObject messageObject) {
        if (this.goingToShowMessageObject == messageObject) {
            return true;
        }
        return false;
    }

    public boolean isMessagePaused() {
        if (!this.isPaused && !this.downloadingCurrentMessage) {
            return false;
        }
        return true;
    }

    public boolean isPiPShown() {
        if (this.pipRoundVideoView != null) {
            return true;
        }
        return false;
    }

    public boolean isPlayingMessage(MessageObject messageObject) {
        MessageObject messageObject2;
        boolean z4;
        if (messageObject != null && messageObject.isRepostPreview) {
            return false;
        }
        if ((this.audioPlayer != null || this.videoPlayer != null) && messageObject != null && (messageObject2 = this.playingMessageObject) != null) {
            long j10 = messageObject2.eventId;
            if (j10 != 0 && j10 == messageObject.eventId) {
                z4 = this.downloadingCurrentMessage;
            } else if (isSamePlayingMessage(messageObject)) {
                z4 = this.downloadingCurrentMessage;
            }
            return !z4;
        }
        return false;
    }

    public boolean isPlayingMessageAndReadyToDraw(MessageObject messageObject) {
        if (this.isDrawingWasReady && isPlayingMessage(messageObject)) {
            return true;
        }
        return false;
    }

    public boolean isRecordingAudio() {
        if (this.recordStartRunnable == null && this.recordingAudio == null) {
            return false;
        }
        return true;
    }

    public boolean isRecordingOrListeningByProximity() {
        if (this.proximityTouched) {
            if (!isRecordingAudio()) {
                MessageObject messageObject = this.playingMessageObject;
                if (messageObject != null) {
                    if (messageObject.isVoice() || this.playingMessageObject.isRoundVideo()) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean isRecordingPaused() {
        return this.audioRecorderPaused;
    }

    public boolean isStreamingCurrentAudio() {
        return this.isStreamingCurrentAudio;
    }

    public boolean isVideoDrawingReady() {
        org.telegram.ui.o4 o4Var = this.currentAspectRatioFrameLayout;
        if (o4Var != null && o4Var.d) {
            return true;
        }
        return false;
    }

    public void loadMoreMusic() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.loadMoreMusic():void");
    }

    @Override
    public void onAudioFocusChange(int i10) {
        AndroidUtilities.runOnUIThread(new b6(this, i10, 0));
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        long j10;
        char c3;
        ?? r18;
        long j11;
        double d;
        boolean z4;
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        MessageObject messageObject;
        if (this.sensorsStarted && VoIPService.getSharedInstance() == null) {
            if (sensorEvent.sensor.getType() == 8) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("proximity changed to " + sensorEvent.values[0] + " max value = " + sensorEvent.sensor.getMaximumRange());
                }
                float f10 = this.lastProximityValue;
                float f11 = sensorEvent.values[0];
                if (f10 != f11) {
                    this.proximityHasDifferentValues = true;
                }
                this.lastProximityValue = f11;
                if (this.proximityHasDifferentValues) {
                    this.proximityTouched = isNearToSensor(f11);
                }
                j10 = 0;
                c3 = 2;
                r18 = 1;
            } else {
                Sensor sensor = sensorEvent.sensor;
                if (sensor == this.accelerometerSensor) {
                    if (this.lastTimestamp == 0) {
                        d = 0.9800000190734863d;
                    } else {
                        d = 1.0d / (((sensorEvent.timestamp - j11) / 1.0E9d) + 1.0d);
                    }
                    this.lastTimestamp = sensorEvent.timestamp;
                    float[] fArr = this.gravity;
                    double d10 = 1.0d - d;
                    float[] fArr2 = sensorEvent.values;
                    j10 = 0;
                    float f12 = (float) ((fArr2[0] * d10) + (fArr[0] * d));
                    fArr[0] = f12;
                    c3 = 2;
                    r18 = 1;
                    float f13 = (float) ((fArr2[1] * d10) + (fArr[1] * d));
                    fArr[1] = f13;
                    float f14 = (float) ((d10 * fArr2[2]) + (d * fArr[2]));
                    fArr[2] = f14;
                    float[] fArr3 = this.gravityFast;
                    fArr3[0] = (fArr2[0] * 0.19999999f) + (f12 * 0.8f);
                    fArr3[1] = (fArr2[1] * 0.19999999f) + (f13 * 0.8f);
                    fArr3[2] = (fArr2[2] * 0.19999999f) + (f14 * 0.8f);
                    float[] fArr4 = this.linearAcceleration;
                    fArr4[0] = fArr2[0] - fArr[0];
                    fArr4[1] = fArr2[1] - fArr[1];
                    fArr4[2] = fArr2[2] - fArr[2];
                } else {
                    j10 = 0;
                    c3 = 2;
                    r18 = 1;
                    r18 = 1;
                    r18 = 1;
                    if (sensor == this.linearSensor) {
                        float[] fArr5 = this.linearAcceleration;
                        float[] fArr6 = sensorEvent.values;
                        fArr5[0] = fArr6[0];
                        fArr5[1] = fArr6[1];
                        fArr5[2] = fArr6[2];
                    } else if (sensor == this.gravitySensor) {
                        float[] fArr7 = this.gravityFast;
                        float[] fArr8 = this.gravity;
                        float[] fArr9 = sensorEvent.values;
                        float f15 = fArr9[0];
                        fArr8[0] = f15;
                        fArr7[0] = f15;
                        float f16 = fArr9[1];
                        fArr8[1] = f16;
                        fArr7[1] = f16;
                        float f17 = fArr9[2];
                        fArr8[2] = f17;
                        fArr7[2] = f17;
                    }
                }
            }
            Sensor sensor2 = sensorEvent.sensor;
            if (sensor2 == this.linearSensor || sensor2 == this.gravitySensor || sensor2 == this.accelerometerSensor) {
                float[] fArr10 = this.gravity;
                float f18 = fArr10[0];
                float[] fArr11 = this.linearAcceleration;
                float f19 = (fArr10[c3] * fArr11[c3]) + (fArr10[r18] * fArr11[r18]) + (f18 * fArr11[0]);
                int i12 = this.raisedToBack;
                if (i12 != 6 && ((f19 > 0.0f && this.previousAccValue > 0.0f) || (f19 < 0.0f && this.previousAccValue < 0.0f))) {
                    if (i10 > 0) {
                        if (f19 > 15.0f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        i11 = 1;
                    } else {
                        if (f19 < -15.0f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        i11 = 2;
                    }
                    int i13 = this.raisedToTopSign;
                    if (i13 != 0 && i13 != i11) {
                        int i14 = this.raisedToTop;
                        if (i14 == 6 && z10) {
                            if (i12 < 6) {
                                int i15 = i12 + 1;
                                this.raisedToBack = i15;
                                if (i15 == 6) {
                                    this.raisedToTop = 0;
                                    this.raisedToTopSign = 0;
                                    this.countLess = 0;
                                    this.timeSinceRaise = System.currentTimeMillis();
                                    if (BuildVars.LOGS_ENABLED && BuildVars.DEBUG_PRIVATE_VERSION) {
                                        FileLog.d("motion detected");
                                    }
                                }
                            }
                        } else {
                            if (!z10) {
                                this.countLess++;
                            }
                            if (this.countLess == 10 || i14 != 6 || i12 != 0) {
                                this.raisedToTop = 0;
                                this.raisedToTopSign = 0;
                                this.raisedToBack = 0;
                                this.countLess = 0;
                            }
                        }
                    } else if (z10 && i12 == 0 && (i13 == 0 || i13 == i11)) {
                        int i16 = this.raisedToTop;
                        if (i16 < 6 && !this.proximityTouched) {
                            this.raisedToTopSign = i11;
                            int i17 = i16 + 1;
                            this.raisedToTop = i17;
                            if (i17 == 6) {
                                this.countLess = 0;
                            }
                        }
                    } else {
                        if (!z10) {
                            this.countLess++;
                        }
                        if (i13 != i11 || this.countLess == 10 || this.raisedToTop != 6 || i12 != 0) {
                            this.raisedToBack = 0;
                            this.raisedToTop = 0;
                            this.raisedToTopSign = 0;
                            this.countLess = 0;
                        }
                    }
                }
                this.previousAccValue = f19;
                float[] fArr12 = this.gravityFast;
                if (fArr12[r18] > 2.5f && Math.abs(fArr12[c3]) < 4.0f && Math.abs(this.gravityFast[0]) > 1.5f) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.accelerometerVertical = z4;
            }
            if (this.raisedToBack == 6 || this.accelerometerVertical) {
                this.lastAccelerometerDetected = System.currentTimeMillis();
            }
            if (!this.manualRecording && this.playingMessageObject == null && SharedConfig.enabledRaiseTo(r18) && ApplicationLoader.isScreenOn && !this.inputFieldHasText && this.allowStartRecord && this.raiseChat != null && !this.callInProgress) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (SharedConfig.enabledRaiseTo(false) && (messageObject = this.playingMessageObject) != null && (messageObject.isVoice() || this.playingMessageObject.isRoundVideo())) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z16 = this.proximityTouched;
            if (this.raisedToBack != 6 && !this.accelerometerVertical && System.currentTimeMillis() - this.lastAccelerometerDetected >= 60) {
                z13 = false;
            } else {
                z13 = true;
            }
            if (!this.useFrontSpeaker && !this.raiseToEarRecord) {
                z14 = false;
            } else {
                z14 = true;
            }
            if ((z13 || z14) && !forbidRaiseToListen() && !VoIPService.isAnyKindOfCallActive() && ((z11 || z12) && !PhotoViewer.t1().Q1())) {
                z15 = true;
            } else {
                z15 = false;
            }
            PowerManager.WakeLock wakeLock = this.proximityWakeLock;
            if (wakeLock != null) {
                boolean isHeld = wakeLock.isHeld();
                if (isHeld && !z15) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("wake lock releasing (proximityDetected=" + z16 + ", accelerometerDetected=" + z13 + ", alreadyPlaying=" + z14 + ")");
                    }
                    this.proximityWakeLock.release();
                } else if (!isHeld && z15) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("wake lock acquiring (proximityDetected=" + z16 + ", accelerometerDetected=" + z13 + ", alreadyPlaying=" + z14 + ")");
                    }
                    this.proximityWakeLock.acquire();
                }
            }
            boolean z17 = this.proximityTouched;
            if (z17 && z15) {
                if (z11 && this.recordStartRunnable == null) {
                    if (!this.raiseToEarRecord) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("start record");
                        }
                        this.useFrontSpeaker = true;
                        if (this.recordingAudio != null || !this.raiseChat.sa()) {
                            this.raiseToEarRecord = true;
                            this.useFrontSpeaker = false;
                            raiseToSpeakUpdated(true);
                        }
                        if (this.useFrontSpeaker) {
                            setUseFrontSpeaker(true);
                        }
                    }
                } else if (z12 && !this.useFrontSpeaker) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("start listen");
                    }
                    setUseFrontSpeaker(true);
                    startAudioAgain(false);
                }
                this.raisedToBack = 0;
                this.raisedToTop = 0;
                this.raisedToTopSign = 0;
                this.countLess = 0;
            } else if (z17 && ((this.accelerometerSensor == null || this.linearSensor == null) && this.gravitySensor == null && !VoIPService.isAnyKindOfCallActive())) {
                if (this.playingMessageObject != null && !ApplicationLoader.mainInterfacePaused && z12 && !this.useFrontSpeaker && !this.manualRecording && !forbidRaiseToListen()) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("start listen by proximity only");
                    }
                    setUseFrontSpeaker(true);
                    startAudioAgain(false);
                }
            } else if (!this.proximityTouched && !this.manualRecording) {
                if (this.raiseToEarRecord) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("stop record");
                    }
                    raiseToSpeakUpdated(false);
                    this.raiseToEarRecord = false;
                    this.ignoreOnPause = false;
                } else if (this.useFrontSpeaker) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("stop listen");
                    }
                    this.useFrontSpeaker = false;
                    startAudioAgain(true);
                    this.ignoreOnPause = false;
                }
            }
            if (this.timeSinceRaise != j10 && this.raisedToBack == 6 && Math.abs(System.currentTimeMillis() - this.timeSinceRaise) > 1000) {
                this.raisedToBack = 0;
                this.raisedToTop = 0;
                this.raisedToTopSign = 0;
                this.countLess = 0;
                this.timeSinceRaise = j10;
            }
        }
    }

    public void pauseByRewind() {
        k71 k71Var = this.audioPlayer;
        if (k71Var != null) {
            k71Var.B();
        }
    }

    public boolean lambda$startAudioAgain$7(MessageObject messageObject) {
        return pauseMessage(messageObject, true);
    }

    public void playEmojiSound(AccountInstance accountInstance, String str, MessagesController.EmojiSound emojiSound, boolean z4) {
        if (emojiSound == null) {
            return;
        }
        Utilities.stageQueue.postRunnable(new xj(this, emojiSound, accountInstance, z4));
    }

    public boolean playMessage(MessageObject messageObject) {
        return playMessage(messageObject, false);
    }

    public void playMessageAtIndex(int i10) {
        int i11 = this.currentPlaylistNum;
        if (i11 >= 0 && i11 < this.playlist.size()) {
            this.currentPlaylistNum = i10;
            this.playMusicAgain = true;
            MessageObject messageObject = this.playlist.get(i10);
            if (this.playingMessageObject != null && !isSamePlayingMessage(messageObject)) {
                this.playingMessageObject.resetPlayingProgress();
            }
            playMessage(messageObject);
        }
    }

    public void playNextMessage() {
        playNextMessageWithoutOrder(false);
    }

    public void playPreviousMessage() {
        ArrayList<MessageObject> arrayList;
        int i10;
        int i11;
        if (SharedConfig.shuffleMusic) {
            arrayList = this.shuffledPlaylist;
        } else {
            arrayList = this.playlist;
        }
        if (!arrayList.isEmpty() && (i10 = this.currentPlaylistNum) >= 0 && i10 < arrayList.size()) {
            MessageObject messageObject = arrayList.get(this.currentPlaylistNum);
            if (messageObject.audioProgressSec > 10) {
                seekToProgress(messageObject, 0.0f);
                return;
            }
            if (SharedConfig.playOrderReversed) {
                i11 = -1;
            } else {
                i11 = 1;
            }
            traversePlaylist(arrayList, i11);
            if (this.currentPlaylistNum < arrayList.size()) {
                this.playMusicAgain = true;
                playMessage(arrayList.get(this.currentPlaylistNum));
            }
        }
    }

    public void prepareResumedRecording(int i10, MediaDataController.DraftVoice draftVoice, long j10, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, int i11, SendMessageChatArguments sendMessageChatArguments, long j11, MessageSuggestionParams messageSuggestionParams) {
        this.manualRecording = false;
        requestRecordAudioFocus(true);
        this.recordQueue.cancelRunnable(this.recordStartRunnable);
        this.recordQueue.postRunnable(new l6(this, i11, draftVoice, i10, j10, j11, messageSuggestionParams, messageObject2, messageObject, storyItem));
    }

    public void requestRecordAudioFocus(boolean z4) {
        if (z4) {
            if (!this.hasRecordAudioFocus && SharedConfig.pauseMusicOnRecord && NotificationsController.audioManager.requestAudioFocus(this.audioRecordFocusChangedListener, 3, 2) == 1) {
                this.hasRecordAudioFocus = true;
            }
        } else if (this.hasRecordAudioFocus) {
            NotificationsController.audioManager.abandonAudioFocus(this.audioRecordFocusChangedListener);
            this.hasRecordAudioFocus = false;
        }
    }

    public void resetGoingToShowMessageObject() {
        this.goingToShowMessageObject = null;
    }

    public void resumeByRewind() {
        MessageObject messageObject;
        k71 k71Var = this.audioPlayer;
        if (k71Var != null && (messageObject = this.playingMessageObject) != null && !this.isPaused) {
            if (k71Var.d != null && k71Var.I == 2) {
                cleanupPlayer(false, false);
                playMessage(messageObject);
                return;
            }
            k71Var.C();
        }
    }

    public void scheduleVideoConvert(MessageObject messageObject) {
        scheduleVideoConvert(messageObject, false, true, false);
    }

    public boolean seekToProgress(MessageObject messageObject, float f10) {
        MessageObject messageObject2 = this.playingMessageObject;
        if ((this.audioPlayer != null || this.videoPlayer != null) && messageObject != null && messageObject2 != null && isSamePlayingMessage(messageObject)) {
            try {
                k71 k71Var = this.audioPlayer;
                if (k71Var != null) {
                    long p10 = k71Var.p();
                    if (p10 == -9223372036854775807L) {
                        this.seekToProgressPending = f10;
                    } else {
                        messageObject2.audioProgress = f10;
                        long j10 = (int) (((float) p10) * f10);
                        this.audioPlayer.K(j10);
                        this.lastProgress = j10;
                        if (!this.ignorePlayerUpdate) {
                            d1.f.v(j10);
                        }
                    }
                } else {
                    k71 k71Var2 = this.videoPlayer;
                    if (k71Var2 != null) {
                        k71Var2.K(((float) k71Var2.p()) * f10);
                        if (!this.ignorePlayerUpdate) {
                            d1.f.v(((float) this.videoPlayer.p()) * f10);
                        }
                    }
                }
                NotificationCenter.getInstance(messageObject.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagePlayingDidSeek, Integer.valueOf(messageObject2.getId()), Float.valueOf(f10));
                return true;
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
        return false;
    }

    public boolean seekToProgressMs(MessageObject messageObject, long j10) {
        long j11;
        MessageObject messageObject2 = this.playingMessageObject;
        if ((this.audioPlayer != null || this.videoPlayer != null) && messageObject != null && messageObject2 != null && isSamePlayingMessage(messageObject)) {
            try {
                k71 k71Var = this.audioPlayer;
                if (k71Var != null) {
                    j11 = k71Var.p();
                    if (j11 != -9223372036854775807L) {
                        messageObject2.audioProgress = Utilities.clamp01(((float) j10) / ((float) j11));
                    }
                    this.audioPlayer.K(j10);
                    this.lastProgress = j10;
                    if (!this.ignorePlayerUpdate) {
                        d1.f.v(j10);
                    }
                } else {
                    k71 k71Var2 = this.videoPlayer;
                    if (k71Var2 != null) {
                        j11 = k71Var2.p();
                        this.videoPlayer.K(j10);
                        if (!this.ignorePlayerUpdate) {
                            d1.f.v(j10);
                        }
                    } else {
                        j11 = 1;
                    }
                }
                if (j11 != 0) {
                    NotificationCenter.getInstance(messageObject.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagePlayingDidSeek, Integer.valueOf(messageObject2.getId()), Float.valueOf(Utilities.clamp01(((float) j10) / ((float) j11))));
                }
                return true;
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
        return false;
    }

    public void setAllowStartRecord(boolean z4) {
        this.allowStartRecord = z4;
    }

    public void setBaseActivity(Activity activity, boolean z4) {
        if (z4) {
            this.baseActivity = activity;
        } else if (this.baseActivity == activity) {
            this.baseActivity = null;
        }
    }

    public void setCurrentVideoVisible(boolean z4) {
        org.telegram.ui.o4 o4Var = this.currentAspectRatioFrameLayout;
        if (o4Var != null) {
            if (z4) {
                PipRoundVideoView pipRoundVideoView = this.pipRoundVideoView;
                if (pipRoundVideoView != null) {
                    this.pipSwitchingState = 2;
                    pipRoundVideoView.a(true);
                    this.pipRoundVideoView = null;
                    return;
                }
                if (o4Var.getParent() == null) {
                    this.currentTextureViewContainer.addView(this.currentAspectRatioFrameLayout);
                }
                this.videoPlayer.V(this.currentTextureView);
            } else if (o4Var.getParent() != null) {
                this.pipSwitchingState = 1;
                this.currentTextureViewContainer.removeView(this.currentAspectRatioFrameLayout);
            } else {
                if (this.pipRoundVideoView == null) {
                    try {
                        PipRoundVideoView pipRoundVideoView2 = new PipRoundVideoView();
                        this.pipRoundVideoView = pipRoundVideoView2;
                        pipRoundVideoView2.d(this.baseActivity, new x5(this, 10));
                    } catch (Exception unused) {
                        this.pipRoundVideoView = null;
                    }
                }
                PipRoundVideoView pipRoundVideoView3 = this.pipRoundVideoView;
                if (pipRoundVideoView3 != null) {
                    this.videoPlayer.V(pipRoundVideoView3.f24923c);
                }
            }
        }
    }

    public void setFeedbackView(View view, boolean z4) {
        if (z4) {
            this.feedbackView = view;
        } else if (this.feedbackView == view) {
            this.feedbackView = null;
        }
    }

    public void setInputFieldHasText(boolean z4) {
        this.inputFieldHasText = z4;
    }

    public void setLastVisibleMessageIds(int i10, long j10, long j11, TLRPC.User user, TLRPC.EncryptedChat encryptedChat, ArrayList<Long> arrayList, int i11) {
        this.lastChatEnterTime = j10;
        this.lastChatLeaveTime = j11;
        this.lastChatAccount = i10;
        this.lastSecretChat = encryptedChat;
        this.lastUser = user;
        this.lastMessageId = i11;
        this.lastChatVisibleMessages = arrayList;
    }

    public void setPlaybackOrderType(int i10) {
        boolean z4 = SharedConfig.shuffleMusic;
        SharedConfig.setPlaybackOrderType(i10);
        boolean z10 = SharedConfig.shuffleMusic;
        if (z4 != z10) {
            if (z10) {
                buildShuffledPlayList();
                return;
            }
            MessageObject messageObject = this.playingMessageObject;
            if (messageObject != null) {
                int indexOf = this.playlist.indexOf(messageObject);
                this.currentPlaylistNum = indexOf;
                if (indexOf == -1) {
                    clearPlaylist();
                    cleanupPlayer(true, true);
                }
            }
        }
    }

    public void setPlaybackSpeed(boolean z4, float f10) {
        String str;
        String str2;
        float f11;
        if (z4) {
            if (this.currentMusicPlaybackSpeed >= 6.0f && f10 == 1.0f && this.playingMessageObject != null) {
                this.audioPlayer.B();
                MessageObject messageObject = this.playingMessageObject;
                AndroidUtilities.runOnUIThread(new c6(this, messageObject, messageObject.audioProgress, 0), 50L);
            }
            this.currentMusicPlaybackSpeed = f10;
            if (Math.abs(f10 - 1.0f) > 0.001f) {
                this.fastMusicPlaybackSpeed = f10;
            }
        } else {
            this.currentPlaybackSpeed = f10;
            if (Math.abs(f10 - 1.0f) > 0.001f) {
                this.fastPlaybackSpeed = f10;
            }
        }
        k71 k71Var = this.audioPlayer;
        if (k71Var != null) {
            k71Var.Q(Math.round(f10 * 10.0f) / 10.0f);
        } else {
            k71 k71Var2 = this.videoPlayer;
            if (k71Var2 != null) {
                k71Var2.Q(Math.round(f10 * 10.0f) / 10.0f);
            }
        }
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        if (z4) {
            str = "musicPlaybackSpeed";
        } else {
            str = "playbackSpeed";
        }
        SharedPreferences.Editor putFloat = edit.putFloat(str, f10);
        if (z4) {
            str2 = "fastMusicPlaybackSpeed";
        } else {
            str2 = "fastPlaybackSpeed";
        }
        if (z4) {
            f11 = this.fastMusicPlaybackSpeed;
        } else {
            f11 = this.fastPlaybackSpeed;
        }
        putFloat.putFloat(str2, f11).commit();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagePlayingSpeedChanged, new Object[0]);
        if (!this.ignorePlayerUpdate) {
            d1.f.z(f10);
        }
    }

    public boolean setPlaylist(ArrayList<MessageObject> arrayList, MessageObject messageObject, long j10, PlaylistGlobalSearchParams playlistGlobalSearchParams) {
        return setPlaylist(arrayList, messageObject, j10, true, playlistGlobalSearchParams);
    }

    public void setReplyingMessage(MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem) {
        this.recordReplyingMsg = messageObject;
        this.recordReplyingTopMsg = messageObject2;
        this.recordReplyingStory = storyItem;
    }

    public void setTextureView(TextureView textureView, org.telegram.ui.o4 o4Var, FrameLayout frameLayout, boolean z4) {
        setTextureView(textureView, o4Var, frameLayout, z4, null);
    }

    public void setVoiceMessagesPlaylist(ArrayList<MessageObject> arrayList, boolean z4) {
        ArrayList<MessageObject> arrayList2;
        if (arrayList != null) {
            arrayList2 = new ArrayList<>(arrayList);
        } else {
            arrayList2 = null;
        }
        this.voiceMessagesPlaylist = arrayList2;
        if (arrayList2 != null) {
            this.voiceMessagesPlaylistUnread = z4;
            this.voiceMessagesPlaylistMap = new SparseArray<>();
            for (int i10 = 0; i10 < this.voiceMessagesPlaylist.size(); i10++) {
                MessageObject messageObject = this.voiceMessagesPlaylist.get(i10);
                this.voiceMessagesPlaylistMap.put(messageObject.getId(), messageObject);
            }
        }
    }

    public void startMediaObserver() {
        ApplicationLoader.applicationHandler.removeCallbacks(this.stopMediaObserverRunnable);
        this.startObserverToken++;
        try {
            if (this.internalObserver == null) {
                ContentResolver contentResolver = ApplicationLoader.applicationContext.getContentResolver();
                Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                ExternalObserver externalObserver = new ExternalObserver();
                this.externalObserver = externalObserver;
                contentResolver.registerContentObserver(uri, false, externalObserver);
            }
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        try {
            if (this.externalObserver == null) {
                ContentResolver contentResolver2 = ApplicationLoader.applicationContext.getContentResolver();
                Uri uri2 = MediaStore.Images.Media.INTERNAL_CONTENT_URI;
                InternalObserver internalObserver = new InternalObserver();
                this.internalObserver = internalObserver;
                contentResolver2.registerContentObserver(uri2, false, internalObserver);
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public void startRaiseToEarSensors(xn xnVar) {
        if (xnVar != null) {
            if ((this.accelerometerSensor != null || (this.gravitySensor != null && this.linearAcceleration != null)) && this.proximitySensor != null) {
                if (!SharedConfig.enabledRaiseTo(false)) {
                    MessageObject messageObject = this.playingMessageObject;
                    if (messageObject != null) {
                        if (!messageObject.isVoice() && !this.playingMessageObject.isRoundVideo()) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                this.raiseChat = xnVar;
                if (!this.sensorsStarted) {
                    float[] fArr = this.gravity;
                    fArr[2] = 0.0f;
                    fArr[1] = 0.0f;
                    fArr[0] = 0.0f;
                    float[] fArr2 = this.linearAcceleration;
                    fArr2[2] = 0.0f;
                    fArr2[1] = 0.0f;
                    fArr2[0] = 0.0f;
                    float[] fArr3 = this.gravityFast;
                    fArr3[2] = 0.0f;
                    fArr3[1] = 0.0f;
                    fArr3[0] = 0.0f;
                    this.lastTimestamp = 0L;
                    this.previousAccValue = 0.0f;
                    this.raisedToTop = 0;
                    this.raisedToTopSign = 0;
                    this.countLess = 0;
                    this.raisedToBack = 0;
                    Utilities.globalQueue.postRunnable(new x5(this, 0));
                    this.sensorsStarted = true;
                }
            }
        }
    }

    public void startRecording(int i10, long j10, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, int i11, boolean z4, SendMessageChatArguments sendMessageChatArguments, long j11, MessageSuggestionParams messageSuggestionParams) {
        boolean z10;
        long j12;
        MessageObject messageObject3 = this.playingMessageObject;
        if (messageObject3 != null && isPlayingMessage(messageObject3) && !isMessagePaused()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.manualRecording = z4;
        requestRecordAudioFocus(true);
        try {
            this.feedbackView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        DispatchQueue dispatchQueue = this.recordQueue;
        l6 l6Var = new l6(this, i10, i11, j10, j11, messageSuggestionParams, messageObject2, messageObject, storyItem, sendMessageChatArguments);
        this.recordStartRunnable = l6Var;
        if (z10) {
            j12 = 500;
        } else {
            j12 = 50;
        }
        dispatchQueue.postRunnable(l6Var, j12);
    }

    public void startRecordingIfFromSpeaker() {
        SendMessageChatArguments sendMessageChatArguments;
        long j10;
        if (this.useFrontSpeaker && this.raiseChat != null && this.allowStartRecord && SharedConfig.enabledRaiseTo(true)) {
            this.raiseToEarRecord = true;
            int currentAccount = this.raiseChat.getCurrentAccount();
            long a2 = this.raiseChat.a();
            xn xnVar = this.raiseChat;
            MessageObject messageObject = xnVar.U3;
            int classGuid = xnVar.getClassGuid();
            xn xnVar2 = this.raiseChat;
            MessageSuggestionParams messageSuggestionParams = null;
            if (xnVar2 != null) {
                sendMessageChatArguments = xnVar2.C8();
            } else {
                sendMessageChatArguments = null;
            }
            xn xnVar3 = this.raiseChat;
            if (xnVar3 != null) {
                j10 = xnVar3.N8();
            } else {
                j10 = 0;
            }
            xn xnVar4 = this.raiseChat;
            if (xnVar4 != null) {
                messageSuggestionParams = xnVar4.f43157d5;
            }
            startRecording(currentAccount, a2, null, messageObject, null, classGuid, false, sendMessageChatArguments, j10, messageSuggestionParams);
            this.ignoreOnPause = true;
        }
    }

    public void stopMediaObserver() {
        if (this.stopMediaObserverRunnable == null) {
            this.stopMediaObserverRunnable = new StopMediaObserverRunnable();
        }
        this.stopMediaObserverRunnable.currentObserverToken = this.startObserverToken;
        ApplicationLoader.applicationHandler.postDelayed(this.stopMediaObserverRunnable, 5000L);
    }

    public void stopRaiseToEarSensors(xn xnVar, boolean z4, boolean z10) {
        MediaController mediaController;
        int i10;
        if (this.ignoreOnPause) {
            this.ignoreOnPause = false;
            return;
        }
        if (z10) {
            if (this.recordingAudio != null && !isRecordingPaused()) {
                toggleRecordingPause(false);
            } else {
                if (z4) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                mediaController = this;
                mediaController.stopRecording(i10, false, 0, false, 0L);
                if (!mediaController.sensorsStarted && !mediaController.ignoreOnPause) {
                    if ((mediaController.accelerometerSensor != null || (mediaController.gravitySensor != null && mediaController.linearAcceleration != null)) && mediaController.proximitySensor != null && mediaController.raiseChat == xnVar) {
                        mediaController.raiseChat = null;
                        mediaController.sensorsStarted = false;
                        mediaController.accelerometerVertical = false;
                        mediaController.proximityTouched = false;
                        mediaController.raiseToEarRecord = false;
                        mediaController.useFrontSpeaker = false;
                        Utilities.globalQueue.postRunnable(new x5(this, 5));
                        PowerManager.WakeLock wakeLock = mediaController.proximityWakeLock;
                        if (wakeLock != null && wakeLock.isHeld()) {
                            mediaController.proximityWakeLock.release();
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
        mediaController = this;
        if (!mediaController.sensorsStarted) {
        }
    }

    public void stopRecording(final int i10, final boolean z4, final int i11, final boolean z10, final long j10) {
        Runnable runnable = this.recordStartRunnable;
        if (runnable != null) {
            this.recordQueue.cancelRunnable(runnable);
            this.recordStartRunnable = null;
        }
        this.recordQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaController.this.lambda$stopRecording$43(i10, z4, i11, z10, j10);
            }
        });
    }

    public void syncCastedPlayer() {
        AtomicInteger atomicInteger;
        long a2;
        boolean m9;
        q5.q e6;
        if (this.playingMessageObject == null) {
            return;
        }
        this.ignorePlayerUpdate = true;
        if (d1.f.u() && ((atomicInteger = d1.f.f4159b) == null || atomicInteger.get() <= 0)) {
            s5.h e10 = d1.f.e();
            if (e10 == null) {
                a2 = -1;
            } else {
                a2 = e10.a();
            }
            long progressMs = getProgressMs(this.playingMessageObject);
            if (progressMs >= 0 && a2 >= 0 && Math.abs(progressMs - a2) > 1000) {
                seekToProgressMs(this.playingMessageObject, a2);
            }
            s5.h e11 = d1.f.e();
            if (e11 == null) {
                m9 = false;
            } else if (d1.f.f4158a == 0) {
                m9 = !e11.l();
            } else {
                m9 = e11.m();
            }
            if (m9) {
                playMessage(this.playingMessageObject);
            } else {
                lambda$startAudioAgain$7(this.playingMessageObject);
            }
            s5.h e12 = d1.f.e();
            float f10 = 1.0f;
            if (e12 != null && (e6 = e12.e()) != null) {
                f10 = (float) e6.d;
            }
            setPlaybackSpeed(true, f10);
        }
        setPlayerVolume();
        this.ignorePlayerUpdate = false;
    }

    public void toggleRecordingPause(boolean z4) {
        this.recordQueue.postRunnable(new o6(this, z4, 1));
    }

    public void trimCurrentRecording(long j10, long j11, Runnable runnable) {
        if (this.recordingAudioFile == null) {
            if (runnable != null) {
                AndroidUtilities.runOnUIThread(runnable);
                return;
            }
            return;
        }
        File directory = FileLoader.getDirectory(1);
        this.recordQueue.postRunnable(new hg.s0(this, new File(directory, System.currentTimeMillis() + "_" + FileLoader.getAttachFileName(this.recordingAudio)) {
            {
                MediaController.this = this;
            }

            @Override
            public boolean delete() {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("delete voice file (trimmed)");
                }
                return super.delete();
            }
        }, j10, j11, runnable, 3));
    }

    public void tryResumePausedAudio() {
        MessageObject playingMessageObject = getPlayingMessageObject();
        if (playingMessageObject != null && isMessagePaused() && this.wasPlayingAudioBeforePause && (playingMessageObject.isVoice() || playingMessageObject.isMusic())) {
            playMessage(playingMessageObject);
        }
        this.wasPlayingAudioBeforePause = false;
    }

    public void updateSilent(boolean z4) {
        int i10;
        this.isSilent = z4;
        k71 k71Var = this.videoPlayer;
        if (k71Var != null) {
            k71Var.N(z4);
        }
        setPlayerVolume();
        checkVolumeBarUI();
        MessageObject messageObject = this.playingMessageObject;
        if (messageObject != null) {
            NotificationCenter notificationCenter = NotificationCenter.getInstance(messageObject.currentAccount);
            int i11 = NotificationCenter.messagePlayingPlayStateChanged;
            MessageObject messageObject2 = this.playingMessageObject;
            if (messageObject2 != null) {
                i10 = messageObject2.getId();
            } else {
                i10 = 0;
            }
            notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, Integer.valueOf(i10));
        }
    }

    public static java.lang.String copyFileToCache(android.net.Uri r13, java.lang.String r14, long r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.copyFileToCache(android.net.Uri, java.lang.String, long):java.lang.String");
    }

    private File joinRecord(File file, File file2, TLRPC.TL_document tL_document) {
        if (file != null && file2 != null) {
            File directory = FileLoader.getDirectory(1);
            File file3 = new File(directory, System.currentTimeMillis() + "_" + FileLoader.getAttachFileName(tL_document)) {
                {
                    MediaController.this = this;
                }

                @Override
                public boolean delete() {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.e("delete voice file (joined)");
                    }
                    return super.delete();
                }
            };
            if (joinOpusFiles(file.getAbsolutePath(), file2.getAbsolutePath(), file3.getAbsolutePath())) {
                file2.delete();
                if (file2 == this.recordingAudioFile) {
                    this.recordingAudioFile = file3;
                }
                file2 = file3;
            }
            file.delete();
            if (file == this.recordingPrevAudioFile) {
                this.recordingPrevAudioFile = null;
            }
        }
        return file2;
    }

    public static void saveFile(String str, Context context, int i10, String str2, String str3, Utilities.Callback<Uri> callback) {
        saveFile(str, context, i10, str2, str3, callback, true);
    }

    public void cleanupPlayer(boolean r11, boolean r12, boolean r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.cleanupPlayer(boolean, boolean, boolean, boolean):void");
    }

    public boolean pauseMessage(MessageObject messageObject, boolean z4) {
        if ((this.audioPlayer != null || this.videoPlayer != null) && messageObject != null && this.playingMessageObject != null && isSamePlayingMessage(messageObject)) {
            stopProgressTimer();
            try {
                if (this.audioPlayer != null) {
                    if (z4 && !d1.f.u() && !this.playingMessageObject.isVoice() && this.playingMessageObject.getDuration() * (1.0f - this.playingMessageObject.audioProgress) > 1.0d && LaunchActivity.B1) {
                        ValueAnimator valueAnimator = this.audioVolumeAnimator;
                        if (valueAnimator != null) {
                            valueAnimator.removeAllUpdateListeners();
                            this.audioVolumeAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                        this.audioVolumeAnimator = ofFloat;
                        ofFloat.addUpdateListener(this.audioVolumeUpdateListener);
                        this.audioVolumeAnimator.setDuration(300L);
                        this.audioVolumeAnimator.addListener(new AnimatorListenerAdapter() {
                            {
                                MediaController.this = this;
                            }

                            @Override
                            public void onAnimationEnd(Animator animator) {
                                if (MediaController.this.audioPlayer != null) {
                                    MediaController.this.audioPlayer.B();
                                }
                            }
                        });
                        this.audioVolumeAnimator.start();
                    } else {
                        this.audioPlayer.B();
                    }
                } else {
                    k71 k71Var = this.videoPlayer;
                    if (k71Var != null) {
                        k71Var.B();
                    }
                }
                this.isPaused = true;
                NotificationCenter.getInstance(this.playingMessageObject.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagePlayingPlayStateChanged, Integer.valueOf(this.playingMessageObject.getId()));
                try {
                    d1.f.b(1);
                    if (!this.ignorePlayerUpdate) {
                        if (bf.b.O().U()) {
                            bf.b.O().c0(getCurrentChromecastMedia());
                        }
                        d1.f.x(false);
                    }
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                return true;
            } catch (Exception e10) {
                FileLog.e(e10);
                this.isPaused = false;
            }
        }
        return false;
    }

    public boolean playMessage(final org.telegram.messenger.MessageObject r41, boolean r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.playMessage(org.telegram.messenger.MessageObject, boolean):boolean");
    }

    public void scheduleVideoConvert(MessageObject messageObject, VideoEditedInfo videoEditedInfo) {
        scheduleVideoConvert(messageObject, videoEditedInfo, false, true, false);
    }

    public boolean setPlaylist(ArrayList<MessageObject> arrayList, MessageObject messageObject, long j10) {
        return setPlaylist(arrayList, messageObject, j10, true, null);
    }

    public void setTextureView(TextureView textureView, org.telegram.ui.o4 o4Var, FrameLayout frameLayout, boolean z4, Runnable runnable) {
        if (textureView == null) {
            return;
        }
        boolean z10 = true;
        if (!z4 && this.currentTextureView == textureView) {
            this.pipSwitchingState = 1;
            this.currentTextureView = null;
            this.currentAspectRatioFrameLayout = null;
            this.currentTextureViewContainer = null;
        } else if (this.videoPlayer == null || textureView == this.currentTextureView) {
        } else {
            this.isDrawingWasReady = (o4Var == null || !o4Var.d) ? false : false;
            this.currentTextureView = textureView;
            if (runnable != null && this.pipRoundVideoView == null) {
                try {
                    PipRoundVideoView pipRoundVideoView = new PipRoundVideoView();
                    this.pipRoundVideoView = pipRoundVideoView;
                    pipRoundVideoView.d(this.baseActivity, new x5(this, 2));
                } catch (Exception unused) {
                    this.pipRoundVideoView = null;
                }
            }
            PipRoundVideoView pipRoundVideoView2 = this.pipRoundVideoView;
            if (pipRoundVideoView2 != null) {
                this.videoPlayer.V(pipRoundVideoView2.f24923c);
            } else {
                this.videoPlayer.V(this.currentTextureView);
            }
            this.currentAspectRatioFrameLayout = o4Var;
            this.currentTextureViewContainer = frameLayout;
            if (!this.currentAspectRatioFrameLayoutReady || o4Var == null) {
                return;
            }
            o4Var.a(this.currentAspectRatioFrameLayoutRatio, this.currentAspectRatioFrameLayoutRotation);
        }
    }

    public static void saveFile(java.lang.String r11, android.content.Context r12, int r13, java.lang.String r14, java.lang.String r15, org.telegram.messenger.Utilities.Callback<android.net.Uri> r16, boolean r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.saveFile(java.lang.String, android.content.Context, int, java.lang.String, java.lang.String, org.telegram.messenger.Utilities$Callback, boolean):void");
    }

    public boolean scheduleVideoConvert(MessageObject messageObject, boolean z4, boolean z10, boolean z11) {
        return scheduleVideoConvert(messageObject, messageObject != null ? messageObject.videoEditedInfo : null, z4, z10, z11);
    }

    public boolean setPlaylist(ArrayList<MessageObject> arrayList, MessageObject messageObject, long j10, boolean z4, PlaylistGlobalSearchParams playlistGlobalSearchParams) {
        if (this.playingMessageObject == messageObject) {
            int indexOf = this.playlist.indexOf(messageObject);
            if (indexOf >= 0) {
                this.currentPlaylistNum = indexOf;
            }
            return playMessage(messageObject);
        }
        this.forceLoopCurrentPlaylist = !z4;
        this.playlistMergeDialogId = j10;
        this.playMusicAgain = !this.playlist.isEmpty();
        clearPlaylist();
        this.playlistGlobalSearchParams = playlistGlobalSearchParams;
        boolean z10 = false;
        if (!arrayList.isEmpty() && DialogObject.isEncryptedDialog(arrayList.get(0).getDialogId())) {
            z10 = true;
        }
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            MessageObject messageObject2 = arrayList.get(size);
            if (messageObject2.isMusic()) {
                int id2 = messageObject2.getId();
                if (id2 > 0 || z10) {
                    i10 = Math.min(i10, id2);
                    i11 = Math.max(i11, id2);
                }
                this.playlist.add(messageObject2);
                this.playlistMap.put(Integer.valueOf(id2), messageObject2);
            }
        }
        sortPlaylist();
        int indexOf2 = this.playlist.indexOf(messageObject);
        this.currentPlaylistNum = indexOf2;
        if (indexOf2 == -1) {
            clearPlaylist();
            this.currentPlaylistNum = this.playlist.size();
            this.playlist.add(messageObject);
            this.playlistMap.put(Integer.valueOf(messageObject.getId()), messageObject);
        }
        if (messageObject.isMusic() && !messageObject.scheduled) {
            if (SharedConfig.shuffleMusic) {
                buildShuffledPlayList();
            }
            if (z4) {
                if (this.playlistGlobalSearchParams == null) {
                    MediaDataController.getInstance(messageObject.currentAccount).loadMusic(messageObject.getDialogId(), i10, i11);
                } else {
                    this.playlistClassGuid = ConnectionsManager.generateClassGuid();
                }
            }
        }
        return playMessage(messageObject);
    }

    public boolean scheduleVideoConvert(MessageObject messageObject, VideoEditedInfo videoEditedInfo, boolean z4, boolean z10, boolean z11) {
        if (messageObject == null || videoEditedInfo == null) {
            return false;
        }
        if (!z4 || this.videoConvertQueue.isEmpty()) {
            if (z4) {
                new File(messageObject.messageOwner.attachPath).delete();
            }
            VideoConvertMessage videoConvertMessage = new VideoConvertMessage(messageObject, videoEditedInfo, z10, z11);
            this.videoConvertQueue.add(videoConvertMessage);
            if (videoConvertMessage.foreground) {
                this.foregroundConvertingMessages.add(videoConvertMessage);
                checkForegroundConvertMessage(false);
            }
            if (this.videoConvertQueue.size() == 1) {
                startVideoConvertFromQueue();
            }
            return true;
        }
        return false;
    }

    public static void saveFile(String str, String str2, Context context, Utilities.Callback<Uri> callback) {
        org.telegram.ui.ActionBar.d2 d2Var;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || context == null) {
            return;
        }
        File file = new File(str);
        File file2 = new File(str2);
        if (file.exists() && file2.exists()) {
            if (AndroidUtilities.isInternalUri(Uri.fromFile(file)) || AndroidUtilities.isInternalUri(Uri.fromFile(file2))) {
                return;
            }
            boolean[] zArr = {false};
            boolean[] zArr2 = new boolean[1];
            try {
                org.telegram.ui.ActionBar.d2 d2Var2 = new org.telegram.ui.ActionBar.d2(context, 2, null);
                d2Var2.m(LocaleController.getString(R.string.Loading));
                d2Var2.setCanceledOnTouchOutside(false);
                d2Var2.setCancelable(true);
                d2Var2.setOnCancelListener(new y5(zArr, 1));
                AndroidUtilities.runOnUIThread(new z5(zArr2, d2Var2, 2), 250L);
                d2Var = d2Var2;
            } catch (Exception e6) {
                FileLog.e(e6);
                d2Var = null;
            }
            new Thread(new b0(file, file2, zArr, callback, d2Var, zArr2, 2)).start();
            return;
        }
        saveFile(str, context, 0, null, null, callback);
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
