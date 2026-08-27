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
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.ContentObserver;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
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
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.MediaStore;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.FrameLayout;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import m5.r;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.pd0;
import org.telegram.ui.Components.re0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.rn;
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
    private se.a audioInfo;
    private AudioRecord audioRecorder;
    private boolean audioRecorderPaused;
    private float audioVolume;
    private ValueAnimator audioVolumeAnimator;
    private Activity baseActivity;
    private boolean callInProgress;
    private int countLess;
    private c5.c currentAspectRatioFrameLayout;
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
    private org.telegram.ui.ActionBar.n2 flagSecureFragment;
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
    private rn raiseChat;
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
    private m61 videoPlayer;
    private ArrayList<MessageObject> voiceMessagesPlaylist;
    private SparseArray<MessageObject> voiceMessagesPlaylistMap;
    private boolean voiceMessagesPlaylistUnread;
    public int writtenFrame;
    AudioManager.OnAudioFocusChangeListener audioRecordFocusChangedListener = new AudioManager.OnAudioFocusChangeListener() {
        @Override
        public final void onAudioFocusChange(int i10) {
            this.f20551a.lambda$new$0(i10);
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
    private m61 audioPlayer = null;
    private m61 emojiSoundPlayer = null;
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
        @Override
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            MediaController.this.audioVolume = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            MediaController.this.setPlayerVolume();
        }
    };

    public class AnonymousClass2 implements Runnable {
        public AnonymousClass2() {
        }

        public void lambda$run$0(ByteBuffer byteBuffer) {
            MediaController.this.recordBuffers.add(byteBuffer);
        }

        public void lambda$run$1(ByteBuffer byteBuffer, boolean z10) {
            int iLimit;
            while (byteBuffer.hasRemaining()) {
                if (byteBuffer.remaining() > MediaController.this.fileBuffer.remaining()) {
                    iLimit = byteBuffer.limit();
                    byteBuffer.limit(byteBuffer.position() + MediaController.this.fileBuffer.remaining());
                } else {
                    iLimit = -1;
                }
                MediaController.this.fileBuffer.put(byteBuffer);
                if (MediaController.this.fileBuffer.position() == MediaController.this.fileBuffer.limit() || z10) {
                    MediaController mediaController = MediaController.this;
                    if (mediaController.writeFrame(mediaController.fileBuffer, !z10 ? MediaController.this.fileBuffer.limit() : byteBuffer.position()) != 0) {
                        MediaController.this.fileBuffer.rewind();
                        MediaController mediaController2 = MediaController.this;
                        long j10 = mediaController2.recordTimeCount;
                        int iLimit2 = mediaController2.fileBuffer.limit() / 2;
                        MediaController mediaController3 = MediaController.this;
                        mediaController2.recordTimeCount = j10 + ((long) (iLimit2 / (mediaController3.sampleRate / 1000)));
                        mediaController3.writtenFrame++;
                    } else {
                        FileLog.e("writing frame failed");
                    }
                }
                if (iLimit != -1) {
                    byteBuffer.limit(iLimit);
                }
            }
            MediaController.this.recordQueue.postRunnable(new e3(5, this, byteBuffer));
        }

        public void lambda$run$2(double d) {
            NotificationCenter.getInstance(MediaController.this.recordingCurrentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordProgressChanged, Integer.valueOf(MediaController.this.recordingGuid), Double.valueOf(d));
        }

        @Override
        public void run() {
            ByteBuffer byteBufferAllocateDirect;
            if (MediaController.this.audioRecorder != null) {
                if (MediaController.this.recordBuffers.isEmpty()) {
                    byteBufferAllocateDirect = ByteBuffer.allocateDirect(MediaController.this.recordBufferSize);
                    byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
                } else {
                    byteBufferAllocateDirect = (ByteBuffer) MediaController.this.recordBuffers.get(0);
                    MediaController.this.recordBuffers.remove(0);
                }
                ByteBuffer byteBuffer = byteBufferAllocateDirect;
                byteBuffer.rewind();
                int i10 = MediaController.this.audioRecorder.read(byteBuffer, byteBuffer.capacity());
                if (i10 <= 0) {
                    MediaController.this.recordBuffers.add(byteBuffer);
                    if (MediaController.this.sendAfterDone == 3 || MediaController.this.sendAfterDone == 4) {
                        return;
                    }
                    MediaController mediaController = MediaController.this;
                    mediaController.stopRecordingInternal(mediaController.sendAfterDone, MediaController.this.sendAfterDoneNotify, MediaController.this.sendAfterDoneScheduleDate, MediaController.this.sendAfterDoneOnce, MediaController.this.sendAfterDonePayStars);
                    return;
                }
                byteBuffer.limit(i10);
                double d = 0.0d;
                try {
                    MediaController mediaController2 = MediaController.this;
                    long j10 = mediaController2.samplesCount;
                    long j11 = ((long) (i10 / 2)) + j10;
                    short[] sArr = mediaController2.recordSamples;
                    int length = (int) ((j10 / j11) * ((double) sArr.length));
                    int length2 = sArr.length - length;
                    float f10 = 0.0f;
                    if (length != 0) {
                        float length3 = sArr.length / length;
                        float f11 = 0.0f;
                        for (int i11 = 0; i11 < length; i11++) {
                            short[] sArr2 = MediaController.this.recordSamples;
                            sArr2[i11] = sArr2[(int) f11];
                            f11 += length3;
                        }
                    }
                    float f12 = (i10 / 2.0f) / length2;
                    for (int i12 = 0; i12 < i10 / 2; i12++) {
                        short s10 = byteBuffer.getShort();
                        d += (double) (s10 * s10);
                        if (i12 == ((int) f10)) {
                            short[] sArr3 = MediaController.this.recordSamples;
                            if (length < sArr3.length) {
                                sArr3[length] = s10;
                                f10 += f12;
                                length++;
                            }
                        }
                    }
                    MediaController.this.samplesCount = j11;
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                byteBuffer.position(0);
                final double dSqrt = Math.sqrt((d / ((double) i10)) / 2.0d);
                MediaController.this.fileEncodingQueue.postRunnable(new n6(this, byteBuffer, i10 != byteBuffer.capacity(), 0));
                MediaController.this.recordQueue.postRunnable(MediaController.this.recordRunnable);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f21128a.lambda$run$2(dSqrt);
                    }
                });
            }
        }
    }

    public class AnonymousClass4 extends PhoneStateListener {
        public AnonymousClass4() {
        }

        public void lambda$onCallStateChanged$0(int i10) {
            i81 i81Var;
            i81 i81Var2;
            if (i10 != 1) {
                if (i10 == 0) {
                    MediaController.this.callInProgress = false;
                    return;
                }
                if (i10 == 2) {
                    fu fuVar = fu.O;
                    if (fuVar != null && (i81Var = fuVar.f28451c) != null && i81Var.f29310w) {
                        i81Var.f29295a.C();
                        i81Var.n();
                        i81Var.f29298b0.d(true, true);
                    }
                    MediaController.this.callInProgress = true;
                    return;
                }
                return;
            }
            MediaController mediaController = MediaController.this;
            if (mediaController.isPlayingMessage(mediaController.playingMessageObject) && !MediaController.this.isMessagePaused()) {
                MediaController mediaController2 = MediaController.this;
                mediaController2.lambda$startAudioAgain$7(mediaController2.playingMessageObject);
            } else if (MediaController.this.recordStartRunnable != null || MediaController.this.recordingAudio != null) {
                MediaController.this.stopRecording(2, false, 0, false, 0L);
            }
            fu fuVar2 = fu.O;
            if (fuVar2 != null && (i81Var2 = fuVar2.f28451c) != null && i81Var2.f29310w) {
                i81Var2.f29295a.C();
                i81Var2.n();
                i81Var2.f29298b0.d(true, true);
            }
            MediaController.this.callInProgress = true;
        }

        @Override
        public void onCallStateChanged(int i10, String str) {
            AndroidUtilities.runOnUIThread(new p6(this, i10, 0));
        }
    }

    public class AnonymousClass5 extends TimerTask {
        final MessageObject val$currentPlayingMessageObject;

        public AnonymousClass5(MessageObject messageObject) {
            this.val$currentPlayingMessageObject = messageObject;
        }

        public static void lambda$run$0(String str, float f10) {
            ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putFloat(str, f10).commit();
        }

        public void lambda$run$1(MessageObject messageObject) {
            long jQ;
            long jO;
            final float f10;
            float fK;
            if ((MediaController.this.audioPlayer == null && MediaController.this.videoPlayer == null) || MediaController.this.isPaused) {
                return;
            }
            try {
                if (MediaController.this.videoPlayer != null) {
                    jQ = MediaController.this.videoPlayer.q();
                    jO = MediaController.this.videoPlayer.o();
                    if (jO >= 0 && jQ > 0) {
                        float f11 = jQ;
                        fK = MediaController.this.videoPlayer.k() / f11;
                        f10 = jO / f11;
                        if (f10 >= 1.0f) {
                            return;
                        }
                    }
                    return;
                }
                jQ = MediaController.this.audioPlayer.q();
                jO = MediaController.this.audioPlayer.o();
                float f12 = jQ >= 0 ? jO / jQ : 0.0f;
                float fK2 = MediaController.this.audioPlayer.k() / jQ;
                if (jQ != -9223372036854775807L && jO >= 0 && MediaController.this.seekToProgressPending == 0.0f) {
                    f10 = f12;
                    fK = fK2;
                }
                return;
                MediaController.this.lastProgress = jO;
                messageObject.audioPlayerDuration = (int) (jQ / 1000);
                messageObject.audioProgress = f10;
                messageObject.audioProgressSec = (int) (MediaController.this.lastProgress / 1000);
                messageObject.bufferedProgress = fK;
                if (f10 >= 0.0f && MediaController.this.shouldSavePositionForCurrentAudio != null && SystemClock.elapsedRealtime() - MediaController.this.lastSaveTime >= 1000) {
                    final String str = MediaController.this.shouldSavePositionForCurrentAudio;
                    MediaController.this.lastSaveTime = SystemClock.elapsedRealtime();
                    Utilities.globalQueue.postRunnable(new Runnable() {
                        @Override
                        public final void run() {
                            MediaController.AnonymousClass5.lambda$run$0(str, f10);
                        }
                    });
                }
                NotificationCenter.getInstance(messageObject.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagePlayingProgressDidChanged, Integer.valueOf(messageObject.getId()), Float.valueOf(f10));
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }

        @Override
        public void run() {
            synchronized (MediaController.this.sync) {
                AndroidUtilities.runOnUIThread(new e3(6, this, this.val$currentPlayingMessageObject));
            }
        }
    }

    public class AnonymousClass7 implements j61 {
        final boolean val$destroyAtEnd;
        final MessageObject val$messageObject;
        final int[] val$playCount;
        final int val$tag;

        public AnonymousClass7(int i10, MessageObject messageObject, int[] iArr, boolean z10) {
            this.val$tag = i10;
            this.val$messageObject = messageObject;
            this.val$playCount = iArr;
            this.val$destroyAtEnd = z10;
        }

        public void lambda$onSurfaceDestroyed$0() {
            MediaController.this.cleanupPlayer(true, true);
        }

        @Override
        public void onError(m61 m61Var, Exception exc) {
            FileLog.e(exc);
        }

        @Override
        public void onRenderedFirstFrame(i3.a aVar) {
        }

        @Override
        public void onStateChanged(boolean z10, int i10) {
            if (this.val$tag != MediaController.this.playerNum) {
                return;
            }
            MediaController.this.updateVideoState(this.val$messageObject, this.val$playCount, this.val$destroyAtEnd, z10, i10);
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
                        MediaController.this.videoPlayer.W(MediaController.this.currentTextureView);
                    }
                    MediaController.this.pipSwitchingState = 0;
                    return true;
                }
                if (MediaController.this.pipSwitchingState == 1) {
                    if (MediaController.this.baseActivity != null) {
                        if (MediaController.this.pipRoundVideoView == null) {
                            try {
                                MediaController.this.pipRoundVideoView = new PipRoundVideoView();
                                MediaController.this.pipRoundVideoView.d(MediaController.this.baseActivity, new d1(this, 5));
                            } catch (Exception unused) {
                                MediaController.this.pipRoundVideoView = null;
                            }
                        }
                        if (MediaController.this.pipRoundVideoView != null) {
                            if (MediaController.this.pipRoundVideoView.f26422c.getSurfaceTexture() != surfaceTexture) {
                                MediaController.this.pipRoundVideoView.f26422c.setSurfaceTexture(surfaceTexture);
                            }
                            MediaController.this.videoPlayer.W(MediaController.this.pipRoundVideoView.f26422c);
                        }
                    }
                    MediaController.this.pipSwitchingState = 0;
                    return true;
                }
                if (PhotoViewer.C1() && PhotoViewer.t1().O2 != null) {
                    PhotoViewer.t1().P2 = surfaceTexture;
                    return true;
                }
            }
            return false;
        }

        @Override
        public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
            MediaController.this.currentAspectRatioFrameLayoutRotation = i12;
            if (i12 != 90 && i12 != 270) {
                i11 = i10;
                i10 = i11;
            }
            MediaController.this.currentAspectRatioFrameLayoutRatio = i10 == 0 ? 1.0f : (i11 * f10) / i10;
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
        public void onSeekFinished(i3.a aVar) {
        }

        @Override
        public void onSeekStarted(i3.a aVar) {
        }

        @Override
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public class AnonymousClass8 implements j61 {
        final int val$tag;

        public AnonymousClass8(int i10) {
            this.val$tag = i10;
        }

        public void lambda$onStateChanged$0(int i10, int i11) {
            if (i10 == MediaController.this.emojiSoundPlayerNum && i11 == 4 && MediaController.this.emojiSoundPlayer != null) {
                try {
                    MediaController.this.emojiSoundPlayer.I();
                    MediaController.this.emojiSoundPlayer = null;
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
            }
        }

        @Override
        public void onRenderedFirstFrame() {
        }

        @Override
        public void onStateChanged(boolean z10, int i10) {
            AndroidUtilities.runOnUIThread(new r6(this, this.val$tag, i10, 0));
        }

        @Override
        public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
            return false;
        }

        @Override
        public void onRenderedFirstFrame(i3.a aVar) {
        }

        @Override
        public void onSeekFinished(i3.a aVar) {
        }

        @Override
        public void onSeekStarted(i3.a aVar) {
        }

        @Override
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override
        public void onError(m61 m61Var, Exception exc) {
        }

        @Override
        public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
        }
    }

    public class AnonymousClass9 implements j61 {
        final boolean val$destroyAtEnd;
        final MessageObject val$messageObject;
        final int[] val$playCount;
        final int val$tag;

        public AnonymousClass9(int i10, MessageObject messageObject, int[] iArr, boolean z10) {
            this.val$tag = i10;
            this.val$messageObject = messageObject;
            this.val$playCount = iArr;
            this.val$destroyAtEnd = z10;
        }

        public void lambda$onSurfaceDestroyed$0() {
            MediaController.this.cleanupPlayer(true, true);
        }

        @Override
        public void onError(m61 m61Var, Exception exc) {
            FileLog.e(exc);
        }

        @Override
        public void onRenderedFirstFrame(i3.a aVar) {
        }

        @Override
        public void onStateChanged(boolean z10, int i10) {
            if (this.val$tag != MediaController.this.playerNum) {
                return;
            }
            MediaController.this.updateVideoState(this.val$messageObject, this.val$playCount, this.val$destroyAtEnd, z10, i10);
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
                        MediaController.this.videoPlayer.W(MediaController.this.currentTextureView);
                    }
                    MediaController.this.pipSwitchingState = 0;
                    return true;
                }
                if (MediaController.this.pipSwitchingState == 1) {
                    if (MediaController.this.baseActivity != null) {
                        if (MediaController.this.pipRoundVideoView == null) {
                            try {
                                MediaController.this.pipRoundVideoView = new PipRoundVideoView();
                                MediaController.this.pipRoundVideoView.d(MediaController.this.baseActivity, new d1(this, 6));
                            } catch (Exception unused) {
                                MediaController.this.pipRoundVideoView = null;
                            }
                        }
                        if (MediaController.this.pipRoundVideoView != null) {
                            if (MediaController.this.pipRoundVideoView.f26422c.getSurfaceTexture() != surfaceTexture) {
                                MediaController.this.pipRoundVideoView.f26422c.setSurfaceTexture(surfaceTexture);
                            }
                            MediaController.this.videoPlayer.W(MediaController.this.pipRoundVideoView.f26422c);
                        }
                    }
                    MediaController.this.pipSwitchingState = 0;
                    return true;
                }
                if (PhotoViewer.C1() && PhotoViewer.t1().O2 != null) {
                    PhotoViewer.t1().P2 = surfaceTexture;
                    return true;
                }
            }
            return false;
        }

        @Override
        public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
            MediaController.this.currentAspectRatioFrameLayoutRotation = i12;
            if (i12 != 90 && i12 != 270) {
                i11 = i10;
                i10 = i11;
            }
            MediaController.this.currentAspectRatioFrameLayoutRatio = i10 == 0 ? 1.0f : (i11 * f10) / i10;
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
            if (MediaController.this.videoPlayer == null || !d1.f.t()) {
                return;
            }
            MediaController.this.videoPlayer.P(true);
        }

        @Override
        public void onSeekFinished(i3.a aVar) {
        }

        @Override
        public void onSeekStarted(i3.a aVar) {
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

        public long f19615id;
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
            if (matrix != null && !matrix.isIdentity()) {
                return false;
            }
            Matrix matrix2 = this.useMatrix;
            return (matrix2 == null || matrix2.isIdentity()) && this.cropPw == 1.0f && this.cropPh == 1.0f && this.cropScale == 1.0f && this.cropRotate == 0.0f && this.transformWidth == 0 && this.transformHeight == 0 && this.transformRotation == 0 && !this.mirrored && this.stateScale == 0.0f && this.scale == 0.0f && this.width == 0 && this.height == 0 && !this.freeform && this.lockedAspectRatio == 0.0f;
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.cropPx = inputSerializedData.readFloat(z10);
            this.cropPy = inputSerializedData.readFloat(z10);
            this.cropScale = inputSerializedData.readFloat(z10);
            this.cropRotate = inputSerializedData.readFloat(z10);
            this.cropPw = inputSerializedData.readFloat(z10);
            this.cropPh = inputSerializedData.readFloat(z10);
            this.transformWidth = inputSerializedData.readInt32(z10);
            this.transformHeight = inputSerializedData.readInt32(z10);
            this.transformRotation = inputSerializedData.readInt32(z10);
            this.mirrored = inputSerializedData.readBool(z10);
            this.stateScale = inputSerializedData.readFloat(z10);
            this.scale = inputSerializedData.readFloat(z10);
            float[] fArr = new float[9];
            for (int i10 = 0; i10 < 9; i10++) {
                fArr[i10] = inputSerializedData.readFloat(z10);
            }
            Matrix matrix = new Matrix();
            this.matrix = matrix;
            matrix.setValues(fArr);
            this.width = inputSerializedData.readInt32(z10);
            this.height = inputSerializedData.readInt32(z10);
            this.freeform = inputSerializedData.readBool(z10);
            this.lockedAspectRatio = inputSerializedData.readFloat(z10);
            if (inputSerializedData.readInt32(z10) == 178403937) {
                for (int i11 = 0; i11 < 9; i11++) {
                    fArr[i11] = inputSerializedData.readFloat(z10);
                }
                Matrix matrix2 = new Matrix();
                this.useMatrix = matrix2;
                matrix2.setValues(fArr);
            }
            this.initied = inputSerializedData.readBool(z10);
            this.orientation = inputSerializedData.readInt32(z10);
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
        }

        @Override
        public void onChange(boolean z10) {
            super.onChange(z10);
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
        public void onChange(boolean z10) {
            super.onChange(z10);
            if (MediaController.refreshGalleryRunnable != null) {
                AndroidUtilities.cancelRunOnUIThread(MediaController.refreshGalleryRunnable);
            }
            AndroidUtilities.runOnUIThread(MediaController.refreshGalleryRunnable = new w1(1), 2000L);
        }
    }

    public static class GalleryObserverInternal extends ContentObserver {
        public GalleryObserverInternal() {
            super(null);
        }

        public void lambda$scheduleReloadRunnable$0() {
            if (PhotoViewer.t1().Q1()) {
                scheduleReloadRunnable();
            } else {
                Runnable unused = MediaController.refreshGalleryRunnable = null;
                MediaController.loadGalleryPhotosAlbums(0);
            }
        }

        private void scheduleReloadRunnable() {
            AndroidUtilities.runOnUIThread(MediaController.refreshGalleryRunnable = new d1(this, 7), 2000L);
        }

        @Override
        public void onChange(boolean z10) {
            super.onChange(z10);
            if (MediaController.refreshGalleryRunnable != null) {
                AndroidUtilities.cancelRunOnUIThread(MediaController.refreshGalleryRunnable);
            }
            scheduleReloadRunnable();
        }
    }

    public class InternalObserver extends ContentObserver {
        public InternalObserver() {
            super(null);
        }

        @Override
        public void onChange(boolean z10) {
            super.onChange(z10);
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
            return bool == null ? SharedConfig.photoHighQualityDefault : bool.booleanValue();
        }

        public boolean isLivePhoto() {
            return (this instanceof PhotoEntry) && ((PhotoEntry) this).isLivePhoto();
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
        private org.telegram.ui.ActionBar.b2 progressDialog;
        private CountDownLatch waitingForFile;

        public MediaLoader(Context context, AccountInstance accountInstance, ArrayList<MessageObject> arrayList, MessagesStorage.IntCallback intCallback) {
            this.currentAccount = accountInstance;
            this.messageObjects = arrayList;
            this.onFinishRunnable = intCallback;
            this.isMusic = arrayList.get(0).isMusic();
            this.currentAccount.getNotificationCenter().addObserver(this, NotificationCenter.fileLoaded);
            this.currentAccount.getNotificationCenter().addObserver(this, NotificationCenter.fileLoadProgressChanged);
            this.currentAccount.getNotificationCenter().addObserver(this, NotificationCenter.fileLoadFailed);
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(context, 2, PhotoViewer.t1().Q1() ? new jh.b() : null);
            this.progressDialog = b2Var;
            b2Var.m(LocaleController.getString(R.string.Loading));
            this.progressDialog.setCancelable(true);
            org.telegram.ui.ActionBar.b2 b2Var2 = this.progressDialog;
            b2Var2.D = true;
            b2Var2.setOnCancelListener(new x5(this, 3));
        }

        private void addMessageToLoad(MessageObject messageObject) {
            AndroidUtilities.runOnUIThread(new e3(7, this, messageObject));
        }

        private void checkIfFinished() {
            if (this.loadingMessageObjects.isEmpty()) {
                AndroidUtilities.runOnUIThread(new t6(this, 4));
            }
        }

        private boolean copyFile(File file, File file2, String str) throws Throwable {
            File file3;
            boolean z10;
            FileInputStream fileInputStream;
            Throwable th;
            Throwable th2;
            String str2;
            if (AndroidUtilities.isInternalUri(Uri.fromFile(file))) {
                return false;
            }
            try {
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(file);
                    try {
                        try {
                            FileChannel channel = fileInputStream2.getChannel();
                            try {
                                file3 = file2;
                                try {
                                    try {
                                        FileChannel channel2 = new FileOutputStream(file3).getChannel();
                                        try {
                                            long size = channel.size();
                                            try {
                                                if (AndroidUtilities.isInternalUri(((Integer) FileDescriptor.class.getDeclaredMethod("getInt$", null).invoke(fileInputStream2.getFD(), null)).intValue())) {
                                                    if (this.progressDialog != null) {
                                                        AndroidUtilities.runOnUIThread(new t6(this, 2));
                                                    }
                                                    if (channel2 != null) {
                                                        try {
                                                            channel2.close();
                                                        } catch (Throwable th3) {
                                                            th2 = th3;
                                                            fileInputStream = fileInputStream2;
                                                            z10 = false;
                                                            if (channel != null) {
                                                                throw th2;
                                                            }
                                                            try {
                                                                channel.close();
                                                                throw th2;
                                                            } catch (Throwable th4) {
                                                                th2.addSuppressed(th4);
                                                                throw th2;
                                                            }
                                                            try {
                                                                fileInputStream.close();
                                                                throw th;
                                                            } catch (Throwable th5) {
                                                                th.addSuppressed(th5);
                                                                throw th;
                                                            }
                                                        }
                                                    }
                                                    try {
                                                        channel.close();
                                                        try {
                                                            fileInputStream2.close();
                                                            return false;
                                                        } catch (Exception e9) {
                                                            e = e9;
                                                            z10 = false;
                                                            FileLog.e(e);
                                                            file3.delete();
                                                            return z10;
                                                        }
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                        fileInputStream = fileInputStream2;
                                                        z10 = false;
                                                        fileInputStream.close();
                                                        throw th;
                                                    }
                                                }
                                            } catch (Throwable th7) {
                                                FileLog.e(th7);
                                            }
                                            long j10 = 0;
                                            long j11 = 0;
                                            while (j10 < size && !this.cancelled) {
                                                fileInputStream = fileInputStream2;
                                                z10 = false;
                                                try {
                                                    channel2.transferFrom(channel, j10, Math.min(4096L, size - j10));
                                                    long j12 = 4096 + j10;
                                                    if (j12 >= size || j11 <= SystemClock.elapsedRealtime() - 500) {
                                                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                                                        AndroidUtilities.runOnUIThread(new s6(this, (int) ((((100.0f / this.messageObjects.size()) * j10) / size) + this.finishedProgress), 1));
                                                        j11 = jElapsedRealtime;
                                                    }
                                                    j10 = j12;
                                                    fileInputStream2 = fileInputStream;
                                                } catch (Throwable th8) {
                                                    th = th8;
                                                    Throwable th9 = th;
                                                    if (channel2 == null) {
                                                        throw th9;
                                                    }
                                                    try {
                                                        channel2.close();
                                                        throw th9;
                                                    } catch (Throwable th10) {
                                                        th9.addSuppressed(th10);
                                                        throw th9;
                                                    }
                                                    if (channel != null) {
                                                        throw th2;
                                                    }
                                                    channel.close();
                                                    throw th2;
                                                    fileInputStream.close();
                                                    throw th;
                                                }
                                            }
                                            fileInputStream = fileInputStream2;
                                            z10 = false;
                                            if (this.cancelled) {
                                                if (channel2 != null) {
                                                    channel2.close();
                                                }
                                                channel.close();
                                                fileInputStream.close();
                                                file3.delete();
                                                return z10;
                                            }
                                            if (this.isMusic) {
                                                AndroidUtilities.addMediaToGallery(file3);
                                            } else {
                                                DownloadManager downloadManager = (DownloadManager) ApplicationLoader.applicationContext.getSystemService("download");
                                                if (TextUtils.isEmpty(str)) {
                                                    MimeTypeMap singleton = MimeTypeMap.getSingleton();
                                                    String name = file3.getName();
                                                    int iLastIndexOf = name.lastIndexOf(46);
                                                    if (iLastIndexOf != -1) {
                                                        String mimeTypeFromExtension = singleton.getMimeTypeFromExtension(name.substring(iLastIndexOf + 1).toLowerCase());
                                                        if (TextUtils.isEmpty(mimeTypeFromExtension)) {
                                                            mimeTypeFromExtension = "text/plain";
                                                        }
                                                        str2 = mimeTypeFromExtension;
                                                    } else {
                                                        str2 = "text/plain";
                                                    }
                                                } else {
                                                    str2 = str;
                                                }
                                                downloadManager.addCompletedDownload(file3.getName(), file3.getName(), false, str2, file3.getAbsolutePath(), file3.length(), true);
                                            }
                                            float size2 = (100.0f / this.messageObjects.size()) + this.finishedProgress;
                                            this.finishedProgress = size2;
                                            AndroidUtilities.runOnUIThread(new s6(this, (int) size2, 2));
                                            if (channel2 != null) {
                                                channel2.close();
                                            }
                                            channel.close();
                                            fileInputStream.close();
                                            return true;
                                        } catch (Throwable th11) {
                                            th = th11;
                                            fileInputStream = fileInputStream2;
                                            z10 = false;
                                        }
                                    } catch (Throwable th12) {
                                        th = th12;
                                        th2 = th;
                                        if (channel != null) {
                                            throw th2;
                                        }
                                        channel.close();
                                        throw th2;
                                        fileInputStream.close();
                                        throw th;
                                    }
                                } catch (Throwable th13) {
                                    th = th13;
                                    fileInputStream = fileInputStream2;
                                    z10 = false;
                                    th2 = th;
                                    if (channel != null) {
                                        throw th2;
                                    }
                                    channel.close();
                                    throw th2;
                                    fileInputStream.close();
                                    throw th;
                                }
                            } catch (Throwable th14) {
                                th = th14;
                                file3 = file2;
                            }
                        } catch (Throwable th15) {
                            th = th15;
                            th = th;
                            fileInputStream.close();
                            throw th;
                        }
                    } catch (Throwable th16) {
                        th = th16;
                        file3 = file2;
                        fileInputStream = fileInputStream2;
                        z10 = false;
                        th = th;
                        fileInputStream.close();
                        throw th;
                    }
                } catch (Exception e10) {
                    e = e10;
                    FileLog.e(e);
                    file3.delete();
                    return z10;
                }
            } catch (Exception e11) {
                e = e11;
                file3 = file2;
            }
        }

        public void lambda$addMessageToLoad$7(MessageObject messageObject) {
            TLRPC.Document document = messageObject.getDocument();
            TLRPC.Document document2 = messageObject.qualityToSave;
            if (document2 != null) {
                document = document2;
            }
            if (document == null) {
                return;
            }
            this.loadingMessageObjects.put(FileLoader.getAttachFileName(document), messageObject);
            this.currentAccount.getFileLoader().loadFile(document, messageObject, 3, messageObject.shouldEncryptPhotoOrVideo() ? 2 : 0);
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
                    AndroidUtilities.runOnUIThread(new t6(this, 3));
                }
            } catch (Exception e9) {
                FileLog.e(e9);
            }
            this.currentAccount.getNotificationCenter().removeObserver(this, NotificationCenter.fileLoaded);
            this.currentAccount.getNotificationCenter().removeObserver(this, NotificationCenter.fileLoadProgressChanged);
            this.currentAccount.getNotificationCenter().removeObserver(this, NotificationCenter.fileLoadFailed);
        }

        public void lambda$copyFile$10(int i10) {
            try {
                this.progressDialog.n(i10);
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }

        public void lambda$copyFile$8() {
            try {
                this.progressDialog.dismiss();
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }

        public void lambda$copyFile$9(int i10) {
            try {
                this.progressDialog.n(i10);
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }

        public void lambda$didReceivedNotification$11(int i10) {
            try {
                this.progressDialog.n(i10);
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }

        public void lambda$new$0(DialogInterface dialogInterface) {
            this.cancelled = true;
        }

        public void lambda$processLivePhotoMessage$5(boolean z10, TLRPC.PhotoSize photoSize, MessageObject messageObject, TLRPC.Photo photo, boolean z11, TLRPC.Document document) {
            MessageObject messageObject2;
            if (z10) {
                this.loadingMessageObjects.put(FileLoader.getAttachFileName(photoSize), messageObject);
                messageObject2 = messageObject;
                this.currentAccount.getFileLoader().loadFile(ImageLocation.getForPhoto(photoSize, photo), messageObject2, "jpg", 3, 0);
            } else {
                messageObject2 = messageObject;
            }
            if (z11) {
                this.loadingMessageObjects.put(FileLoader.getAttachFileName(document), messageObject2);
                this.currentAccount.getFileLoader().loadFile(document, messageObject2, 3, 0);
            }
        }

        public void lambda$processLivePhotoMessage$6(int i10) {
            try {
                this.progressDialog.n(i10);
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }

        public void lambda$start$1() {
            if (this.finished) {
                return;
            }
            this.progressDialog.show();
        }

        public void lambda$start$2() throws Throwable {
            File file;
            File pathToAttach;
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    int size = this.messageObjects.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        MessageObject messageObject = this.messageObjects.get(i10);
                        if (!processLivePhotoMessage(messageObject)) {
                            String string = messageObject.messageOwner.attachPath;
                            TLRPC.Document document = messageObject.getDocument();
                            TLRPC.Document document2 = messageObject.qualityToSave;
                            if (document2 != null) {
                                string = null;
                                document = document2;
                            }
                            String documentFileName = FileLoader.getDocumentFileName(document);
                            if (string != null && string.length() > 0 && !new File(string).exists()) {
                                string = null;
                            }
                            if (TextUtils.isEmpty(string)) {
                                FileLoader fileLoader = FileLoader.getInstance(this.currentAccount.getCurrentAccount());
                                TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
                                TLRPC.Document document3 = messageObject.qualityToSave;
                                if (document3 != null) {
                                    pathToAttach = fileLoader.getPathToAttach(document3, null, false, true);
                                } else {
                                    File pathToMessage = fileLoader.getPathToMessage(messageObject.messageOwner, true);
                                    if (media instanceof TLRPC.TL_messageMediaDocument) {
                                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) media;
                                        if (tL_messageMediaDocument.alt_documents.isEmpty()) {
                                            pathToAttach = pathToMessage;
                                        } else {
                                            pathToAttach = fileLoader.getPathToAttach(tL_messageMediaDocument.alt_documents.get(0), null, false, true);
                                        }
                                    } else {
                                        pathToAttach = pathToMessage;
                                    }
                                }
                                string = pathToAttach.toString();
                            }
                            File file2 = new File(string);
                            if (!file2.exists()) {
                                this.waitingForFile = new CountDownLatch(1);
                                addMessageToLoad(messageObject);
                                this.waitingForFile.await();
                            }
                            if (this.cancelled) {
                                break;
                            }
                            if (!file2.exists()) {
                                file2 = FileLoader.getInstance(this.currentAccount.getCurrentAccount()).getPathToAttach(messageObject.messageOwner, true);
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("saving file: correcting path from ");
                                sb2.append(string);
                                sb2.append(" to ");
                                sb2.append(file2 == null ? null : file2.getAbsolutePath());
                                FileLog.d(sb2.toString());
                            }
                            if (file2 != null && file2.exists()) {
                                MediaController.saveFileInternal(this.isMusic ? 3 : 2, file2, documentFileName);
                                this.copiedFiles++;
                            }
                        }
                    }
                } else {
                    File externalStoragePublicDirectory = this.isMusic ? Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC) : Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                    externalStoragePublicDirectory.mkdir();
                    int size2 = this.messageObjects.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        MessageObject messageObject2 = this.messageObjects.get(i11);
                        if (!processLivePhotoMessage(messageObject2)) {
                            TLRPC.Document document4 = messageObject2.getDocument();
                            TLRPC.Document document5 = messageObject2.qualityToSave;
                            if (document5 != null) {
                                document4 = document5;
                            }
                            String documentFileName2 = FileLoader.getDocumentFileName(document4);
                            File file3 = new File(externalStoragePublicDirectory, documentFileName2);
                            if (file3.exists()) {
                                int iLastIndexOf = documentFileName2.lastIndexOf(46);
                                int i12 = 0;
                                while (i12 < 10) {
                                    File file4 = new File(externalStoragePublicDirectory, iLastIndexOf != -1 ? documentFileName2.substring(0, iLastIndexOf) + "(" + (i12 + 1) + ")" + documentFileName2.substring(iLastIndexOf) : documentFileName2 + "(" + (i12 + 1) + ")");
                                    if (!file4.exists()) {
                                        file3 = file4;
                                        break;
                                    } else {
                                        i12++;
                                        file3 = file4;
                                    }
                                }
                            }
                            if (!file3.exists()) {
                                file3.createNewFile();
                            }
                            String string2 = messageObject2.messageOwner.attachPath;
                            if (messageObject2.qualityToSave != null) {
                                string2 = null;
                            }
                            if (string2 != null && string2.length() > 0 && !new File(string2).exists()) {
                                string2 = null;
                            }
                            if (messageObject2.qualityToSave != null) {
                                file = FileLoader.getInstance(this.currentAccount.getCurrentAccount()).getPathToAttach(messageObject2.qualityToSave, null, false, true);
                            } else {
                                if (string2 == null || string2.length() == 0) {
                                    string2 = FileLoader.getInstance(this.currentAccount.getCurrentAccount()).getPathToMessage(messageObject2.messageOwner).toString();
                                }
                                file = new File(string2);
                            }
                            if (!file.exists()) {
                                this.waitingForFile = new CountDownLatch(1);
                                addMessageToLoad(messageObject2);
                                this.waitingForFile.await();
                            }
                            if (file.exists()) {
                                copyFile(file, file3, messageObject2.getMimeType());
                                this.copiedFiles++;
                            }
                        }
                    }
                }
                checkIfFinished();
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }

        private boolean processLivePhotoMessage(MessageObject messageObject) throws InterruptedException, IOException {
            TLRPC.MessageMedia media;
            TLRPC.Photo photo;
            TLRPC.PhotoSize closestPhotoSizeWithSize;
            boolean z10 = false;
            if (!messageObject.isLivePhoto() || (media = MessageObject.getMedia(messageObject.messageOwner)) == null || (photo = media.photo) == null || media.document == null || (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize(true), false, null, true)) == null) {
                return false;
            }
            FileLoader fileLoader = FileLoader.getInstance(this.currentAccount.getCurrentAccount());
            File pathToAttach = fileLoader.getPathToAttach(closestPhotoSizeWithSize, null, false, true);
            File pathToAttach2 = fileLoader.getPathToAttach(media.document, null, false, true);
            ?? r10 = (pathToAttach == null || !pathToAttach.exists()) ? 1 : 0;
            ?? r11 = (pathToAttach2 == null || !pathToAttach2.exists()) ? 1 : 0;
            int i10 = r10 + r11;
            if (i10 > 0) {
                this.waitingForFile = new CountDownLatch(i10);
                AndroidUtilities.runOnUIThread(new u6(this, (boolean) r10, closestPhotoSizeWithSize, messageObject, media.photo, (boolean) r11, media.document));
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
                    String strGenerateFileName = AndroidUtilities.generateFileName(0, fileExtension);
                    if (Build.VERSION.SDK_INT >= 29) {
                        ContentValues contentValues = new ContentValues();
                        Uri contentUri = MediaStore.Downloads.getContentUri("external_primary");
                        contentValues.put("relative_path", new File(Environment.DIRECTORY_DOWNLOADS, "Telegram") + File.separator);
                        contentValues.put("_display_name", strGenerateFileName);
                        contentValues.put("mime_type", mimeTypeFromExtension);
                        Uri uriInsert = ApplicationLoader.applicationContext.getContentResolver().insert(contentUri, contentValues);
                        if (uriInsert != null) {
                            OutputStream outputStreamOpenOutputStream = ApplicationLoader.applicationContext.getContentResolver().openOutputStream(uriInsert);
                            if (outputStreamOpenOutputStream != null) {
                                try {
                                    MediaController.writeMotionPhoto(pathToAttach, pathToAttach2, outputStreamOpenOutputStream, null);
                                    z10 = !this.cancelled;
                                } catch (Throwable th) {
                                    try {
                                        outputStreamOpenOutputStream.close();
                                        throw th;
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                        throw th;
                                    }
                                }
                            }
                            if (outputStreamOpenOutputStream != null) {
                                outputStreamOpenOutputStream.close();
                            }
                            if (z10) {
                                this.copiedFiles++;
                            } else {
                                try {
                                    ApplicationLoader.applicationContext.getContentResolver().delete(uriInsert, null, null);
                                } catch (Exception unused) {
                                }
                            }
                        }
                    } else {
                        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "Telegram");
                        file.mkdirs();
                        File file2 = new File(file, strGenerateFileName);
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
                        } catch (Throwable th3) {
                            try {
                                fileOutputStream.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    }
                    float size = (100.0f / this.messageObjects.size()) + this.finishedProgress;
                    this.finishedProgress = size;
                    AndroidUtilities.runOnUIThread(new s6(this, (int) size, 3));
                    return true;
                }
            }
            return true;
        }

        @Override
        public void didReceivedNotification(int i10, int i11, Object... objArr) {
            if (i10 == NotificationCenter.fileLoaded || i10 == NotificationCenter.fileLoadFailed) {
                if (this.loadingMessageObjects.remove((String) objArr[0]) != null) {
                    this.waitingForFile.countDown();
                    return;
                }
                return;
            }
            if (i10 == NotificationCenter.fileLoadProgressChanged) {
                if (this.loadingMessageObjects.containsKey((String) objArr[0])) {
                    AndroidUtilities.runOnUIThread(new s6(this, (int) s3.c.c(((Long) objArr[1]).longValue() / ((Long) objArr[2]).longValue(), this.messageObjects.size(), 100.0f, this.finishedProgress), 0));
                }
            }
        }

        public void start() {
            AndroidUtilities.runOnUIThread(new t6(this, 0), 250L);
            new Thread(new t6(this, 1)).start();
        }
    }

    public static class MusicListenReporter {
        private TLRPC.InputDocument audio;
        public final int currentAccount;
        private long rangeStart = -9223372036854775807L;
        private final ArrayList<Pair<Long, Long>> ranges = new ArrayList<>();
        private final Runnable reportRunnable = new d1(this, 8);

        public MusicListenReporter(int i10) {
            this.currentAccount = i10;
        }

        private long getTotalListened() {
            ArrayList<Pair<Long, Long>> arrayList = this.ranges;
            int size = arrayList.size();
            long jLongValue = 0;
            int i10 = 0;
            while (i10 < size) {
                Pair<Long, Long> pair = arrayList.get(i10);
                i10++;
                Pair<Long, Long> pair2 = pair;
                jLongValue += ((Long) pair2.second).longValue() - ((Long) pair2.first).longValue();
            }
            return jLongValue;
        }

        public void listenedRange(long j10, long j11) {
            int i10 = 0;
            while (i10 < this.ranges.size() && ((Long) this.ranges.get(i10).first).longValue() <= j10) {
                i10++;
            }
            this.ranges.add(i10, new Pair<>(Long.valueOf(j10), Long.valueOf(j11)));
            int iMax = Math.max(0, i10 - 1);
            while (iMax < this.ranges.size() - 1) {
                Pair<Long, Long> pair = this.ranges.get(iMax);
                int i11 = iMax + 1;
                Pair<Long, Long> pair2 = this.ranges.get(i11);
                if (((Long) pair.second).longValue() >= ((Long) pair2.first).longValue()) {
                    this.ranges.set(iMax, new Pair<>((Long) pair.first, Long.valueOf(Math.max(((Long) pair.second).longValue(), ((Long) pair2.second).longValue()))));
                    this.ranges.remove(i11);
                } else {
                    iMax = i11;
                }
            }
        }

        public void report() {
            AndroidUtilities.cancelRunOnUIThread(this.reportRunnable);
            if (this.audio != null && getTotalListened() >= 3000) {
                TLRPC.TL_messages_reportMusicListen tL_messages_reportMusicListen = new TLRPC.TL_messages_reportMusicListen();
                tL_messages_reportMusicListen.f22485id = this.audio;
                tL_messages_reportMusicListen.listened_duration = (int) Math.round(getTotalListened() / 1000.0d);
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_reportMusicListen, null);
                this.rangeStart = -9223372036854775807L;
                this.ranges.clear();
            }
        }

        public void destroy() {
            if (this.audio == null) {
                return;
            }
            report();
            this.audio = null;
        }

        public h3.a2 getPlayerListener(final h3.s sVar) {
            return new h3.a2() {
                private void closeRange() {
                    long jD = sVar.D();
                    if (MusicListenReporter.this.rangeStart != -9223372036854775807L && jD > MusicListenReporter.this.rangeStart) {
                        MusicListenReporter musicListenReporter = MusicListenReporter.this;
                        musicListenReporter.listenedRange(musicListenReporter.rangeStart, jD);
                    }
                    MusicListenReporter.this.rangeStart = -9223372036854775807L;
                }

                @Override
                @Deprecated
                public void onCues(List list) {
                }

                @Override
                public void onIsPlayingChanged(boolean z10) {
                    if (z10) {
                        MusicListenReporter.this.rangeStart = sVar.D();
                    } else {
                        closeRange();
                    }
                    AndroidUtilities.cancelRunOnUIThread(MusicListenReporter.this.reportRunnable);
                    if (z10) {
                        return;
                    }
                    AndroidUtilities.runOnUIThread(MusicListenReporter.this.reportRunnable, 60000L);
                }

                @Override
                @Deprecated
                public void onPositionDiscontinuity(int i10) {
                }

                @Override
                public void onCues(r4.d dVar) {
                }

                @Override
                public void onPositionDiscontinuity(h3.b2 b2Var, h3.b2 b2Var2, int i10) {
                    if (i10 == 1) {
                        if (MusicListenReporter.this.rangeStart != -9223372036854775807L) {
                            MusicListenReporter musicListenReporter = MusicListenReporter.this;
                            musicListenReporter.listenedRange(musicListenReporter.rangeStart, b2Var.f7790f);
                        }
                        MusicListenReporter.this.rangeStart = ((b8.a) sVar).K() ? b2Var2.f7790f : -9223372036854775807L;
                        AndroidUtilities.cancelRunOnUIThread(MusicListenReporter.this.reportRunnable);
                    }
                }

                @Override
                public void onRenderedFirstFrame() {
                }

                @Override
                @Deprecated
                public void onSeekProcessed() {
                }

                @Override
                public void onAudioAttributesChanged(j3.e eVar) {
                }

                public void onAudioSessionIdChanged(int i10) {
                }

                @Override
                public void onAvailableCommandsChanged(h3.y1 y1Var) {
                }

                @Override
                public void onDeviceInfoChanged(h3.m mVar) {
                }

                @Override
                public void onIsLoadingChanged(boolean z10) {
                }

                @Override
                @Deprecated
                public void onLoadingChanged(boolean z10) {
                }

                public void onMaxSeekToPreviousPositionChanged(long j10) {
                }

                @Override
                public void onMediaMetadataChanged(h3.h1 h1Var) {
                }

                @Override
                public void onMetadata(z3.c cVar) {
                }

                @Override
                public void onPlaybackParametersChanged(h3.x1 x1Var) {
                }

                @Override
                public void onPlaybackStateChanged(int i10) {
                }

                @Override
                public void onPlaybackSuppressionReasonChanged(int i10) {
                }

                @Override
                public void onPlayerError(h3.v1 v1Var) {
                }

                @Override
                public void onPlayerErrorChanged(h3.v1 v1Var) {
                }

                public void onPlaylistMetadataChanged(h3.h1 h1Var) {
                }

                @Override
                public void onRepeatModeChanged(int i10) {
                }

                public void onSeekBackIncrementChanged(long j10) {
                }

                public void onSeekForwardIncrementChanged(long j10) {
                }

                @Override
                public void onShuffleModeEnabledChanged(boolean z10) {
                }

                @Override
                public void onSkipSilenceEnabledChanged(boolean z10) {
                }

                public void onTrackSelectionParametersChanged(b5.y yVar) {
                }

                @Override
                public void onTracksChanged(h3.u2 u2Var) {
                }

                @Override
                public void onVideoSizeChanged(e5.x xVar) {
                }

                @Override
                public void onVolumeChanged(float f10) {
                }

                @Override
                public void onDeviceVolumeChanged(int i10, boolean z10) {
                }

                @Override
                public void onEvents(h3.c2 c2Var, h3.z1 z1Var) {
                }

                @Override
                public void onMediaItemTransition(h3.f1 f1Var, int i10) {
                }

                @Override
                public void onPlayWhenReadyChanged(boolean z10, int i10) {
                }

                @Override
                @Deprecated
                public void onPlayerStateChanged(boolean z10, int i10) {
                }

                @Override
                public void onSurfaceSizeChanged(int i10, int i11) {
                }

                @Override
                public void onTimelineChanged(h3.s2 s2Var, int i10) {
                }
            };
        }

        public void setup(TLRPC.InputDocument inputDocument) {
            AndroidUtilities.cancelRunOnUIThread(this.reportRunnable);
            if (inputDocument != null && inputDocument.f22392id == 0) {
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

        public PhotoEntry(int i10, int i11, long j10, String str, int i12, boolean z10, int i13, int i14, long j11) {
            this.bucketId = i10;
            this.imageId = i11;
            this.dateTaken = j10;
            this.path = str;
            this.width = i13;
            this.height = i14;
            this.size = j11;
            if (z10) {
                this.duration = i12;
            } else {
                this.orientation = i12;
            }
            this.isVideo = z10;
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
            super.copyFrom(mediaEditState);
            boolean z10 = mediaEditState instanceof PhotoEntry;
            boolean z11 = false;
            this.hasSpoiler = z10 && ((PhotoEntry) mediaEditState).hasSpoiler;
            this.starsAmount = z10 ? ((PhotoEntry) mediaEditState).starsAmount : 0L;
            this.parsedXmp = z10 && ((PhotoEntry) mediaEditState).parsedXmp;
            if (z10 && ((PhotoEntry) mediaEditState).isLivePhoto) {
                z11 = true;
            }
            this.isLivePhoto = z11;
            this.livePhotoVideoOffset = z10 ? ((PhotoEntry) mediaEditState).livePhotoVideoOffset : 0L;
            this.livePhotoTimestampUs = z10 ? ((PhotoEntry) mediaEditState).livePhotoTimestampUs : 0L;
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
            f2.c cVarA;
            if (this.isVideo || this.parsedXmp) {
                return this.isLivePhoto;
            }
            this.parsedXmp = true;
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                String strB = new r1.g(new File(this.path)).b("Xmp");
                if (strB != null) {
                    r3.b bVar = null;
                    try {
                        cVarA = r3.d.a(strB);
                    } catch (h3.t1 | NumberFormatException | XmlPullParserException e9) {
                        d5.a.L("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata", e9);
                        cVarA = null;
                    }
                    if (cVarA != null) {
                        p8.l0 l0Var = (p8.l0) cVarA.f5631c;
                        r3.b bVar2 = null;
                        for (int i10 = 0; i10 < l0Var.d; i10++) {
                            r3.b bVar3 = (r3.b) l0Var.get(i10);
                            String str = bVar3.f46713b;
                            if ("Primary".equalsIgnoreCase(str)) {
                                bVar = bVar3;
                            } else if ("MotionPhoto".equalsIgnoreCase(str)) {
                                bVar2 = bVar3;
                            }
                        }
                        if (bVar != null && bVar2 != null) {
                            long j10 = bVar2.f46714c;
                            if (j10 > 0) {
                                try {
                                    long length = new File(this.path).length() - j10;
                                    this.isVideo = true;
                                    this.isLivePhoto = true;
                                    this.livePhotoVideoOffset = length;
                                    this.livePhotoTimestampUs = cVarA.f5630b;
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
            StringBuilder sb2 = new StringBuilder("parsed isLivePhoto()=");
            sb2.append(this.isLivePhoto);
            sb2.append(" in ");
            sb2.append(System.currentTimeMillis() - jCurrentTimeMillis);
            org.telegram.ui.Cells.pa.v("ms", sb2);
            return this.isLivePhoto;
        }

        public boolean isUnalivePhoto() {
            Boolean bool = this.discardLivePhoto;
            return bool == null ? !SharedConfig.photoLiveDefault : bool.booleanValue();
        }

        public void rebuildPhoto(boolean z10) {
            Bitmap bitmap;
            Bitmap bitmapCreateBitmap;
            String str;
            Bitmap bitmapDecodeFile;
            int i10;
            String str2 = this.filterPath;
            if (str2 == null) {
                str2 = this.path;
            }
            Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(str2);
            Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
            Bitmap bitmapQ = lh.z7.q(new d(this, 8), AndroidUtilities.getPhotoSize(z10), AndroidUtilities.getPhotoSize(z10), 0, true);
            if (this.imagePath != null) {
                new File(this.imagePath).delete();
                this.imagePath = null;
            }
            CropState cropState = this.cropState;
            if (cropState == null) {
                if (((Integer) imageOrientation.first).intValue() != 0) {
                    Matrix matrix = new Matrix();
                    matrix.postRotate(((Integer) imageOrientation.first).intValue());
                    if (((Integer) imageOrientation.second).intValue() == 1) {
                        matrix.postScale(-1.0f, 1.0f);
                    } else if (((Integer) imageOrientation.second).intValue() == 2) {
                        matrix.postScale(1.0f, -1.0f);
                    }
                    bitmapCreateBitmap = Bitmaps.createBitmap(bitmapQ, 0, 0, bitmapQ.getWidth(), bitmapQ.getHeight(), matrix, true);
                    bitmapQ.recycle();
                } else {
                    bitmap = bitmapQ;
                }
                str = this.fullPaintPath;
                if (str == null) {
                    float photoSize = AndroidUtilities.getPhotoSize(z10);
                    float photoSize2 = AndroidUtilities.getPhotoSize(z10);
                    if (z10) {
                        i10 = 99;
                    } else {
                        i10 = 87;
                    }
                    this.imagePath = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(ImageLoader.scaleAndSaveImage(bitmap, compressFormat, photoSize, photoSize2, i10, false, 101, 101), true).toString();
                } else {
                    if (this.cropState != null) {
                        Bitmap bitmapDecodeFile2 = BitmapFactory.decodeFile(str);
                        bitmapDecodeFile = PhotoViewer.I0(bitmapDecodeFile2, this.cropState, null, false);
                        bitmapDecodeFile2.recycle();
                    } else {
                        bitmapDecodeFile = BitmapFactory.decodeFile(str);
                    }
                    try {
                        Paint paint = new Paint(3);
                        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmapCreateBitmap2);
                        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                        canvas.scale(bitmap.getWidth() / bitmapDecodeFile.getWidth(), bitmap.getHeight() / bitmapDecodeFile.getHeight());
                        canvas.drawBitmap(bitmapDecodeFile, 0.0f, 0.0f, paint);
                        this.imagePath = PhotoViewer.y1();
                        bitmapCreateBitmap2.compress(compressFormat, z10 ? 99 : 87, new FileOutputStream(this.imagePath));
                    } catch (Exception e9) {
                        FileLog.e(e9);
                    }
                    if (bitmapDecodeFile != null) {
                        bitmapDecodeFile.recycle();
                    }
                }
                if (bitmap != null) {
                    bitmap.recycle();
                }
            }
            bitmapCreateBitmap = PhotoViewer.I0(bitmapQ, cropState, new int[]{((Integer) imageOrientation.first).intValue(), ((Integer) imageOrientation.second).intValue()}, true);
            bitmapQ.recycle();
            bitmap = bitmapCreateBitmap;
            str = this.fullPaintPath;
            if (str == null) {
                float photoSize3 = AndroidUtilities.getPhotoSize(z10);
                float photoSize4 = AndroidUtilities.getPhotoSize(z10);
                if (z10) {
                    i10 = 99;
                } else {
                    i10 = 87;
                }
                this.imagePath = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(ImageLoader.scaleAndSaveImage(bitmap, compressFormat, photoSize3, photoSize4, i10, false, 101, 101), true).toString();
            } else {
                if (this.cropState != null) {
                    Bitmap bitmapDecodeFile3 = BitmapFactory.decodeFile(str);
                    bitmapDecodeFile = PhotoViewer.I0(bitmapDecodeFile3, this.cropState, null, false);
                    bitmapDecodeFile3.recycle();
                } else {
                    bitmapDecodeFile = BitmapFactory.decodeFile(str);
                }
                Paint paint2 = new Paint(3);
                Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap3);
                canvas2.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
                canvas2.scale(bitmap.getWidth() / bitmapDecodeFile.getWidth(), bitmap.getHeight() / bitmapDecodeFile.getHeight());
                canvas2.drawBitmap(bitmapDecodeFile, 0.0f, 0.0f, paint2);
                this.imagePath = PhotoViewer.y1();
                bitmapCreateBitmap3.compress(compressFormat, z10 ? 99 : 87, new FileOutputStream(this.imagePath));
                if (bitmapDecodeFile != null) {
                    bitmapDecodeFile.recycle();
                }
            }
            if (bitmap != null) {
                bitmap.recycle();
            }
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

        public PhotoEntry(int i10, int i11, long j10, String str, int i12, int i13, boolean z10, int i14, int i15, long j11) {
            this.bucketId = i10;
            this.imageId = i11;
            this.dateTaken = j10;
            this.path = str;
            this.width = i14;
            this.height = i15;
            this.size = j11;
            this.duration = i13;
            this.orientation = i12;
            this.isVideo = z10;
        }
    }

    public static class PlaylistGlobalSearchParams {
        final long dialogId;
        public boolean endReached;
        final pf.e0 filter;
        public int folderId;
        final long maxDate;
        final long minDate;
        public int nextSearchRate;
        final String query;
        public ig.q0 reaction;
        public long topicId;
        public int totalCount;

        public PlaylistGlobalSearchParams(String str, long j10, long j11, long j12, pf.e0 e0Var) {
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
        public re0 curvesToolValue = new re0();
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
            return Math.abs(this.enhanceValue) < 0.1f && Math.abs(this.softenSkinValue) < 0.1f && Math.abs(this.exposureValue) < 0.1f && Math.abs(this.contrastValue) < 0.1f && Math.abs(this.warmthValue) < 0.1f && Math.abs(this.saturationValue) < 0.1f && Math.abs(this.fadeValue) < 0.1f && this.tintShadowsColor == 0 && this.tintHighlightsColor == 0 && Math.abs(this.highlightsValue) < 0.1f && Math.abs(this.shadowsValue) < 0.1f && Math.abs(this.vignetteValue) < 0.1f && Math.abs(this.grainValue) < 0.1f && this.blurType == 0 && Math.abs(this.sharpenValue) < 0.1f;
        }

        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.enhanceValue = inputSerializedData.readFloat(z10);
            this.softenSkinValue = inputSerializedData.readFloat(z10);
            this.exposureValue = inputSerializedData.readFloat(z10);
            this.contrastValue = inputSerializedData.readFloat(z10);
            this.warmthValue = inputSerializedData.readFloat(z10);
            this.saturationValue = inputSerializedData.readFloat(z10);
            this.fadeValue = inputSerializedData.readFloat(z10);
            this.tintShadowsColor = inputSerializedData.readInt32(z10);
            this.tintHighlightsColor = inputSerializedData.readInt32(z10);
            this.highlightsValue = inputSerializedData.readFloat(z10);
            this.shadowsValue = inputSerializedData.readFloat(z10);
            this.vignetteValue = inputSerializedData.readFloat(z10);
            this.grainValue = inputSerializedData.readFloat(z10);
            this.blurType = inputSerializedData.readInt32(z10);
            this.sharpenValue = inputSerializedData.readFloat(z10);
            re0 re0Var = this.curvesToolValue;
            re0Var.f32143a.c(inputSerializedData, z10);
            re0Var.f32144b.c(inputSerializedData, z10);
            re0Var.f32145c.c(inputSerializedData, z10);
            re0Var.d.c(inputSerializedData, z10);
            this.blurExcludeSize = inputSerializedData.readFloat(z10);
            if (inputSerializedData.readInt32(z10) == 1450380236) {
                this.blurExcludePoint = null;
            } else {
                if (this.blurExcludePoint == null) {
                    this.blurExcludePoint = new PointF();
                }
                this.blurExcludePoint.x = inputSerializedData.readFloat(z10);
                this.blurExcludePoint.y = inputSerializedData.readFloat(z10);
            }
            this.blurExcludeBlurSize = inputSerializedData.readFloat(z10);
            this.blurAngle = inputSerializedData.readFloat(z10);
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
            re0 re0Var = this.curvesToolValue;
            re0Var.f32143a.d(outputSerializedData);
            re0Var.f32144b.d(outputSerializedData);
            re0Var.f32145c.d(outputSerializedData);
            re0Var.d.d(outputSerializedData);
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

        public String f19616id;
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
            return this.document != null ? FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(this.document, true).getAbsolutePath() : ImageLoader.getHttpFilePath(this.imageUrl, "jpg").getAbsolutePath();
        }

        public String getPathToAttach() {
            if (this.photoSize != null) {
                return FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(this.photoSize, true).getAbsolutePath();
            }
            return this.document != null ? FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(this.document, true).getAbsolutePath() : this.imageUrl;
        }

        @Override
        public void reset() {
            super.reset();
        }

        public SearchImage clone() {
            SearchImage searchImage = new SearchImage();
            searchImage.f19616id = this.f19616id;
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
                } catch (Exception e9) {
                    FileLog.e(e9);
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

        public VideoConvertMessage(MessageObject messageObject, VideoEditedInfo videoEditedInfo, boolean z10, boolean z11) {
            this.messageObject = messageObject;
            this.currentAccount = messageObject.currentAccount;
            this.videoEditedInfo = videoEditedInfo;
            this.foreground = z10;
            this.foregroundConversion = z11;
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
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }

        public static void runConversion(VideoConvertMessage videoConvertMessage) {
            new Thread(new d1(videoConvertMessage, 9)).start();
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
        int i10 = Build.VERSION.SDK_INT;
        projectionPhotos = new String[]{"_id", "bucket_id", "bucket_display_name", "_data", i10 > 28 ? "date_modified" : "datetaken", "orientation", "width", "height", "_size"};
        projectionVideo = new String[]{"_id", "bucket_id", "bucket_display_name", "_data", i10 > 28 ? "date_modified" : "datetaken", "duration", "width", "height", "_size"};
        cachedEncoderBitrates = new ConcurrentHashMap<>();
        allMediaAlbums = new ArrayList<>();
        allPhotoAlbums = new ArrayList<>();
    }

    public MediaController() {
        DispatchQueue dispatchQueue = new DispatchQueue("recordQueue");
        this.recordQueue = dispatchQueue;
        dispatchQueue.setPriority(10);
        DispatchQueue dispatchQueue2 = new DispatchQueue("fileEncodingQueue");
        this.fileEncodingQueue = dispatchQueue2;
        dispatchQueue2.setPriority(10);
        this.recordQueue.postRunnable(new w5(this, 5));
        Utilities.globalQueue.postRunnable(new w5(this, 6));
        this.fileBuffer = ByteBuffer.allocateDirect(1920);
        AndroidUtilities.runOnUIThread(new w5(this, 7));
        this.mediaProjections = new String[]{"_data", "_display_name", "bucket_display_name", Build.VERSION.SDK_INT > 28 ? "date_modified" : "datetaken", "title", "width", "height"};
        ContentResolver contentResolver = ApplicationLoader.applicationContext.getContentResolver();
        try {
            contentResolver.registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, new GalleryObserverExternal());
        } catch (Exception e9) {
            FileLog.e(e9);
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
        gh.p2 p2Var = new gh.p2(i10, arrayList, arrayList2, num, albumEntry, albumEntry2, albumEntry3);
        broadcastPhotosRunnable = p2Var;
        AndroidUtilities.runOnUIThread(p2Var, i11);
    }

    private static String buildMotionPhotoXmp(long j10) {
        return com.google.android.recaptcha.internal.a.m(j10, "<?xpacket begin=\"\ufeff\" id=\"W5M0MpCehiHzreSzNTczkc9d\"?><x:xmpmeta xmlns:x=\"adobe:ns:meta/\"><rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"><rdf:Description rdf:about=\"\" xmlns:GCamera=\"http://ns.google.com/photos/1.0/camera/\" xmlns:Container=\"http://ns.google.com/photos/1.0/container/\" xmlns:Item=\"http://ns.google.com/photos/1.0/container/item/\" GCamera:MotionPhoto=\"1\" GCamera:MotionPhotoVersion=\"1\" GCamera:MotionPhotoPresentationTimestampUs=\"0\"><Container:Directory><rdf:Seq><rdf:li rdf:parseType=\"Resource\"><Container:Item Item:Mime=\"image/jpeg\" Item:Semantic=\"Primary\" Item:Length=\"0\" Item:Padding=\"0\"/></rdf:li><rdf:li rdf:parseType=\"Resource\"><Container:Item Item:Mime=\"video/mp4\" Item:Semantic=\"MotionPhoto\" Item:Length=\"", "\" Item:Padding=\"0\"/></rdf:li></rdf:Seq></Container:Directory></rdf:Description></rdf:RDF></x:xmpmeta><?xpacket end=\"w\"?>");
    }

    private void buildShuffledPlayList() {
        MessageObject messageObject;
        if (this.playlist.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.playlist);
        this.shuffledPlaylist.clear();
        int i10 = this.currentPlaylistNum;
        if (i10 < 0 || i10 >= this.playlist.size()) {
            messageObject = null;
        } else {
            messageObject = this.playlist.get(this.currentPlaylistNum);
            arrayList.remove(this.currentPlaylistNum);
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            int iNextInt = Utilities.random.nextInt(arrayList.size());
            this.shuffledPlaylist.add((MessageObject) arrayList.get(iNextInt));
            arrayList.remove(iNextInt);
        }
        if (messageObject != null) {
            this.shuffledPlaylist.add(messageObject);
            this.currentPlaylistNum = this.shuffledPlaylist.size() - 1;
        }
    }

    private boolean canStartMusicPlayerService() {
        MessageObject messageObject = this.playingMessageObject;
        if (messageObject != null) {
            return ((!messageObject.isMusic() && !this.playingMessageObject.isVoice() && !this.playingMessageObject.isRoundVideo()) || this.playingMessageObject.isVoiceOnce() || this.playingMessageObject.isRoundOnce()) ? false : true;
        }
        return false;
    }

    private void checkAudioFocus(MessageObject messageObject) {
        int i10;
        int iRequestAudioFocus;
        if (messageObject.isVoice() || messageObject.isRoundVideo()) {
            i10 = this.useFrontSpeaker ? 3 : 2;
        } else {
            i10 = 1;
        }
        if (this.hasAudioFocus != i10) {
            this.hasAudioFocus = i10;
            if (i10 == 3) {
                iRequestAudioFocus = NotificationsController.audioManager.requestAudioFocus(this, 0, 1);
            } else {
                iRequestAudioFocus = NotificationsController.audioManager.requestAudioFocus(this, 3, (i10 != 2 || SharedConfig.pauseMusicOnMedia) ? 1 : 3);
            }
            if (iRequestAudioFocus == 1) {
                this.audioFocus = 2;
            }
        }
    }

    private void checkForegroundConvertMessage(boolean z10) {
        if (this.foregroundConvertingMessages.isEmpty()) {
            this.currentForegroundConvertingVideo = null;
        } else {
            this.currentForegroundConvertingVideo = this.foregroundConvertingMessages.get(0);
        }
        if (this.currentForegroundConvertingVideo != null || z10) {
            VideoEncodingService.start(z10);
        }
    }

    public static void checkGallery() {
        AlbumEntry albumEntry;
        if (Build.VERSION.SDK_INT < 24 || (albumEntry = allPhotosAlbumEntry) == null) {
            return;
        }
        Utilities.globalQueue.postRunnable(new nh.k2(albumEntry.photos.size(), 2), 2000L);
    }

    private void checkIsNextMusicFileDownloaded(int i10) {
        int size;
        if (DownloadController.getInstance(i10).canDownloadNextTrack()) {
            ArrayList<MessageObject> arrayList = SharedConfig.shuffleMusic ? this.shuffledPlaylist : this.playlist;
            if (arrayList != null) {
                if (arrayList.size() < 2) {
                    return;
                }
                if (SharedConfig.playOrderReversed) {
                    size = this.currentPlaylistNum + 1;
                    if (size >= arrayList.size()) {
                        size = 0;
                    }
                } else {
                    size = this.currentPlaylistNum - 1;
                    if (size < 0) {
                        size = arrayList.size() - 1;
                    }
                }
                if (size < 0 || size >= arrayList.size()) {
                    return;
                }
                MessageObject messageObject = arrayList.get(size);
                File file = null;
                if (!TextUtils.isEmpty(messageObject.messageOwner.attachPath)) {
                    File file2 = new File(messageObject.messageOwner.attachPath);
                    if (file2.exists()) {
                        file = file2;
                    }
                }
                File pathToMessage = file != null ? file : FileLoader.getInstance(i10).getPathToMessage(messageObject.messageOwner);
                pathToMessage.exists();
                if (pathToMessage == file || pathToMessage.exists() || !messageObject.isMusic()) {
                    return;
                }
                FileLoader.getInstance(i10).loadFile(messageObject.getDocument(), messageObject, 0, messageObject.shouldEncryptPhotoOrVideo() ? 2 : 0);
            }
        }
    }

    private void checkIsNextVoiceFileDownloaded(int i10) {
        ArrayList<MessageObject> arrayList = this.voiceMessagesPlaylist;
        if (arrayList != null) {
            if (arrayList.size() < 2) {
                return;
            }
            MessageObject messageObject = this.voiceMessagesPlaylist.get(1);
            String str = messageObject.messageOwner.attachPath;
            File file = null;
            if (str != null && str.length() > 0) {
                File file2 = new File(messageObject.messageOwner.attachPath);
                if (file2.exists()) {
                    file = file2;
                }
            }
            File pathToMessage = file != null ? file : FileLoader.getInstance(i10).getPathToMessage(messageObject.messageOwner);
            pathToMessage.exists();
            if (pathToMessage == file || pathToMessage.exists()) {
                return;
            }
            FileLoader.getInstance(i10).loadFile(messageObject.getDocument(), messageObject, 0, messageObject.shouldEncryptPhotoOrVideo() ? 2 : 0);
        }
    }

    private void checkScreenshots(ArrayList<Long> arrayList) {
        if (arrayList == null || arrayList.isEmpty() || this.lastChatEnterTime == 0) {
            return;
        }
        if (this.lastUser != null || (this.lastSecretChat instanceof TLRPC.TL_encryptedChat)) {
            boolean z10 = false;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Long l10 = arrayList.get(i10);
                if ((this.lastMediaCheckTime == 0 || l10.longValue() > this.lastMediaCheckTime) && l10.longValue() >= this.lastChatEnterTime && (this.lastChatLeaveTime == 0 || l10.longValue() <= this.lastChatLeaveTime + 2000)) {
                    this.lastMediaCheckTime = Math.max(this.lastMediaCheckTime, l10.longValue());
                    z10 = true;
                }
            }
            if (z10) {
                if (this.lastSecretChat != null) {
                    SecretChatHelper.getInstance(this.lastChatAccount).sendScreenshotMessage(this.lastSecretChat, this.lastChatVisibleMessages, null);
                } else {
                    SendMessagesHelper.getInstance(this.lastChatAccount).sendScreenshotMessage(this.lastUser, this.lastMessageId, null);
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
        int i10;
        long j10;
        long j11;
        int i11;
        MessageObject messageObject = videoConvertMessage.messageObject;
        final VideoEditedInfo videoEditedInfo = videoConvertMessage.videoEditedInfo;
        if (messageObject == null || videoEditedInfo == null) {
            return false;
        }
        String str = videoEditedInfo.originalPath;
        long j12 = videoEditedInfo.videoOffset;
        long j13 = videoEditedInfo.startTime;
        long j14 = videoEditedInfo.avatarStartTime;
        long j15 = videoEditedInfo.endTime;
        int i12 = videoEditedInfo.resultWidth;
        int i13 = videoEditedInfo.resultHeight;
        int i14 = videoEditedInfo.rotationValue;
        int i15 = videoEditedInfo.originalWidth;
        int i16 = videoEditedInfo.originalHeight;
        int i17 = videoEditedInfo.framerate;
        int i18 = videoEditedInfo.bitrate;
        int i19 = videoEditedInfo.originalBitrate;
        boolean z10 = DialogObject.isEncryptedDialog(messageObject.getDialogId()) || videoEditedInfo.forceFragmenting;
        final File file = new File(messageObject.messageOwner.attachPath);
        if (file.exists()) {
            file.delete();
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("begin convert " + str + " startTime = " + j13 + " avatarStartTime = " + j14 + " endTime " + j15 + " rWidth = " + i12 + " rHeight = " + i13 + " rotation = " + i14 + " oWidth = " + i15 + " oHeight = " + i16 + " framerate = " + i17 + " bitrate = " + i18 + " originalBitrate = " + i10);
        }
        if (str == null) {
            i10 = i19;
            i10 = i19;
            str = "";
        }
        i10 = i19;
        i10 = i19;
        if (j13 > 0 && j15 > 0) {
            j10 = j13;
            j11 = j15 - j13;
        } else if (j15 > 0) {
            j10 = j13;
            j11 = j15;
        } else if (j13 > 0) {
            j10 = j13;
            j11 = videoEditedInfo.originalDuration - j10;
        } else {
            j10 = j13;
            j11 = videoEditedInfo.originalDuration;
        }
        if (i17 == 0) {
            i17 = 25;
        } else if (i17 > 59) {
            i17 = 59;
        }
        if (i14 == 90 || i14 == 270) {
            i11 = i13;
        } else {
            i11 = i12;
            i12 = i13;
        }
        long j16 = j10;
        long j17 = j11;
        if (!videoEditedInfo.shouldLimitFps && i17 > 40 && Math.min(i12, i11) <= 480) {
            i17 = 30;
        }
        boolean z11 = (j14 == -1 && videoEditedInfo.cropState == null && videoEditedInfo.mediaEntities == null && videoEditedInfo.paintPath == null && videoEditedInfo.filterState == null && i11 == i15 && i12 == i16 && i14 == 0 && !videoEditedInfo.roundVideo && j16 == -1 && videoEditedInfo.mixedSoundInfos.isEmpty()) ? false : true;
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("videoconvert", 0);
        long jCurrentTimeMillis = System.currentTimeMillis();
        VideoConvertorListener videoConvertorListener = new VideoConvertorListener() {
            private long lastAvailableSize = 0;

            @Override
            public boolean checkConversionCanceled() {
                return videoEditedInfo.canceled;
            }

            @Override
            public void didWriteData(long j18, float f10) {
                if (videoEditedInfo.canceled) {
                    return;
                }
                if (j18 < 0) {
                    j18 = file.length();
                }
                long j19 = j18;
                if (videoEditedInfo.needUpdateProgress || this.lastAvailableSize != j19) {
                    this.lastAvailableSize = j19;
                    MediaController.this.didWriteData(videoConvertMessage, file, false, 0L, j19, false, f10);
                }
            }
        };
        videoEditedInfo.videoConvertFirstWrite = true;
        MediaCodecVideoConvertor mediaCodecVideoConvertor = new MediaCodecVideoConvertor();
        MediaCodecVideoConvertor.ConvertVideoParams convertVideoParamsOf = MediaCodecVideoConvertor.ConvertVideoParams.of(str, file, j12, i14, z10, i15, i16, i11, i12, i17, i18, i10, j16, j15, j14, z11, j17, videoConvertorListener, videoEditedInfo);
        convertVideoParamsOf.soundInfos.addAll(videoEditedInfo.mixedSoundInfos);
        boolean zConvertVideo = mediaCodecVideoConvertor.convertVideo(convertVideoParamsOf);
        boolean z12 = videoEditedInfo.canceled;
        if (!z12) {
            synchronized (this.videoConvertSync) {
                z12 = videoEditedInfo.canceled;
            }
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("time=" + (System.currentTimeMillis() - jCurrentTimeMillis) + " canceled=" + z12);
        }
        sharedPreferences.edit().putBoolean("isPreviousOk", true).apply();
        didWriteData(videoConvertMessage, file, true, mediaCodecVideoConvertor.getLastFrameTimestamp(), file.length(), zConvertVideo || z12, 1.0f);
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
                    int iLastIndexOf = str.lastIndexOf(".");
                    if (iLastIndexOf > 0) {
                        file = new File(sharingDirectory2, str.substring(0, iLastIndexOf) + " (" + i10 + ")" + str.substring(iLastIndexOf));
                    } else {
                        file = new File(sharingDirectory2, str + " (" + i10 + ")");
                    }
                }
                i10++;
            } while (file.exists());
            return file;
        } catch (Exception e9) {
            FileLog.e(e9);
            return null;
        }
    }

    public static native boolean cropOpusFile(String str, String str2, long j10, long j11);

    public void didWriteData(final VideoConvertMessage videoConvertMessage, final File file, final boolean z10, final long j10, final long j11, final boolean z11, final float f10) {
        VideoEditedInfo videoEditedInfo = videoConvertMessage.videoEditedInfo;
        final boolean z12 = videoEditedInfo.videoConvertFirstWrite;
        if (z12) {
            videoEditedInfo.videoConvertFirstWrite = false;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f20449a.lambda$didWriteData$59(z11, z10, videoConvertMessage, file, f10, j10, z12, j11);
            }
        });
    }

    public static int extractRealEncoderBitrate(int i10, int i11, int i12, boolean z10) {
        MediaCodec mediaCodecCreateEncoderByType;
        String str = i10 + "" + i11 + "" + i12;
        Integer num = cachedEncoderBitrates.get(str);
        if (num != null) {
            return num.intValue();
        }
        if (z10) {
            try {
                mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType("video/hevc");
            } catch (Exception unused) {
                mediaCodecCreateEncoderByType = null;
            }
        } else {
            mediaCodecCreateEncoderByType = null;
        }
        if (mediaCodecCreateEncoderByType == null) {
            try {
                mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType("video/avc");
            } catch (Exception unused2) {
                return i12;
            }
        }
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat("video/avc", i10, i11);
        mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
        mediaFormatCreateVideoFormat.setInteger("max-bitrate", i12);
        mediaFormatCreateVideoFormat.setInteger("bitrate", i12);
        mediaFormatCreateVideoFormat.setInteger("frame-rate", 30);
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 1);
        mediaCodecCreateEncoderByType.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, 1);
        int integer = mediaCodecCreateEncoderByType.getOutputFormat().getInteger("bitrate");
        cachedEncoderBitrates.put(str, Integer.valueOf(integer));
        mediaCodecCreateEncoderByType.release();
        return integer;
    }

    public static int findTrack(MediaExtractor mediaExtractor, boolean z10) {
        int trackCount = mediaExtractor.getTrackCount();
        for (int i10 = 0; i10 < trackCount; i10++) {
            String string = mediaExtractor.getTrackFormat(i10).getString("mime");
            if (z10) {
                if (string.startsWith("audio/")) {
                    return i10;
                }
            } else {
                if (string.startsWith("video/")) {
                    return i10;
                }
            }
        }
        return -5;
    }

    private boolean forbidRaiseToListen() {
        try {
            if (Build.VERSION.SDK_INT < 23) {
                return NotificationsController.audioManager.isWiredHeadsetOn() || NotificationsController.audioManager.isBluetoothA2dpOn() || NotificationsController.audioManager.isBluetoothScoOn();
            }
            for (AudioDeviceInfo audioDeviceInfo : NotificationsController.audioManager.getDevices(2)) {
                int type = audioDeviceInfo.getType();
                if ((type == 8 || type == 7 || type == 26 || type == 27 || type == 4 || type == 3) && audioDeviceInfo.isSink()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e9) {
            FileLog.e(e9);
            return false;
        }
    }

    public static String getFileName(Uri uri) {
        Uri uri2;
        String path;
        int iLastIndexOf;
        if (uri == null) {
            return "";
        }
        try {
            String string = null;
            if (uri.getScheme().equals("content")) {
                try {
                    uri2 = uri;
                    try {
                        Cursor cursorQuery = ApplicationLoader.applicationContext.getContentResolver().query(uri2, new String[]{"_display_name"}, null, null, null);
                        try {
                            if (cursorQuery.moveToFirst()) {
                                string = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
                            }
                            cursorQuery.close();
                        } catch (Throwable th) {
                            if (cursorQuery == null) {
                                throw th;
                            }
                            try {
                                cursorQuery.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                            if (string == null) {
                                return string;
                            }
                            path = uri2.getPath();
                            iLastIndexOf = path.lastIndexOf(47);
                            if (iLastIndexOf != -1) {
                                return path.substring(iLastIndexOf + 1);
                            }
                            return path;
                        }
                    } catch (Exception e9) {
                        e = e9;
                        FileLog.e(e);
                    }
                } catch (Exception e10) {
                    e = e10;
                    uri2 = uri;
                }
            } else {
                uri2 = uri;
            }
            if (string == null) {
                return string;
            }
            path = uri2.getPath();
            iLastIndexOf = path.lastIndexOf(47);
            if (iLastIndexOf != -1) {
                return path.substring(iLastIndexOf + 1);
            }
            return path;
        } catch (Exception e11) {
            FileLog.e(e11);
            return "";
        }
    }

    public static MediaController getInstance() {
        MediaController mediaController;
        MediaController mediaController2 = Instance;
        if (mediaController2 != null) {
            return mediaController2;
        }
        synchronized (MediaController.class) {
            try {
                mediaController = Instance;
                if (mediaController == null) {
                    mediaController = new MediaController();
                    Instance = mediaController;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaController;
    }

    public static String getStickerExt(Uri uri) throws Throwable {
        InputStream fileInputStream;
        InputStream inputStream = null;
        try {
            fileInputStream = ApplicationLoader.applicationContext.getContentResolver().openInputStream(uri);
        } catch (Exception unused) {
            fileInputStream = null;
        } catch (Throwable th) {
            th = th;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
            }
            throw th;
        }
        if (fileInputStream == null) {
            try {
                try {
                    File file = new File(uri.getPath());
                    if (file.exists()) {
                        fileInputStream = new FileInputStream(file);
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream = fileInputStream;
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        }
        byte[] bArr = new byte[12];
        if (fileInputStream.read(bArr, 0, 12) == 12) {
            byte b10 = bArr[0];
            if (b10 == -119 && bArr[1] == 80 && bArr[2] == 78 && bArr[3] == 71 && bArr[4] == 13 && bArr[5] == 10 && bArr[6] == 26 && bArr[7] == 10) {
                try {
                    fileInputStream.close();
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                return "png";
            }
            if (b10 == 31 && bArr[1] == -117) {
                try {
                    fileInputStream.close();
                } catch (Exception e12) {
                    FileLog.e(e12);
                }
                return "tgs";
            }
            String lowerCase = new String(bArr).toLowerCase();
            if (lowerCase.startsWith("riff") && lowerCase.endsWith("webp")) {
                try {
                    fileInputStream.close();
                } catch (Exception e13) {
                    FileLog.e(e13);
                }
                return "webp";
            }
        }
        try {
            fileInputStream.close();
        } catch (Exception e14) {
            FileLog.e(e14);
        }
        return null;
    }

    public static int getVideoBitrate(String str) {
        int i10;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(str);
            i10 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(20));
        } catch (Exception e9) {
            FileLog.e(e9);
            i10 = 0;
        }
        try {
            mediaMetadataRetriever.release();
        } catch (Throwable th) {
            FileLog.e(th);
        }
        return i10;
    }

    private static int getVideoBitrateWithFactor(float f10) {
        return (int) com.google.android.recaptcha.internal.a.C(f10, 2000.0f, 1000.0f, 1.13f);
    }

    public static native byte[] getWaveform(String str);

    public static boolean isGif(Uri uri) {
        InputStream inputStreamOpenInputStream = null;
        try {
            try {
                inputStreamOpenInputStream = ApplicationLoader.applicationContext.getContentResolver().openInputStream(uri);
                byte[] bArr = new byte[3];
                if (inputStreamOpenInputStream.read(bArr, 0, 3) == 3 && new String(bArr).equalsIgnoreCase("gif")) {
                    try {
                        inputStreamOpenInputStream.close();
                        return true;
                    } catch (Exception e9) {
                        FileLog.e(e9);
                        return true;
                    }
                }
            } catch (Exception e10) {
                FileLog.e(e10);
                if (inputStreamOpenInputStream != null) {
                }
                return false;
            }
            try {
                inputStreamOpenInputStream.close();
            } catch (Exception e11) {
                FileLog.e(e11);
            }
            return false;
        } catch (Throwable th) {
            if (inputStreamOpenInputStream != null) {
                try {
                    inputStreamOpenInputStream.close();
                } catch (Exception e12) {
                    FileLog.e(e12);
                }
            }
            throw th;
        }
    }

    public static boolean isH264Video(String str) {
        MediaExtractor mediaExtractor = new MediaExtractor();
        boolean z10 = false;
        try {
            try {
                mediaExtractor.setDataSource(str);
                int iFindTrack = findTrack(mediaExtractor, false);
                if (iFindTrack >= 0 && mediaExtractor.getTrackFormat(iFindTrack).getString("mime").equals("video/avc")) {
                    z10 = true;
                }
                return z10;
            } catch (Exception e9) {
                FileLog.e(e9);
                return false;
            }
        } finally {
            mediaExtractor.release();
        }
    }

    private boolean isNearToSensor(float f10) {
        return f10 < 5.0f && f10 != this.proximitySensor.getMaximumRange();
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
        MessageObject messageObject2 = this.playingMessageObject;
        if (messageObject2 != null && messageObject2.getDialogId() == messageObject.getDialogId() && this.playingMessageObject.getId() == messageObject.getId()) {
            if ((this.playingMessageObject.eventId == 0) == (messageObject.eventId == 0)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isWebp(Uri uri) {
        InputStream inputStreamOpenInputStream = null;
        try {
            try {
                inputStreamOpenInputStream = ApplicationLoader.applicationContext.getContentResolver().openInputStream(uri);
                byte[] bArr = new byte[12];
                if (inputStreamOpenInputStream.read(bArr, 0, 12) == 12) {
                    String lowerCase = new String(bArr).toLowerCase();
                    if (lowerCase.startsWith("riff") && lowerCase.endsWith("webp")) {
                        try {
                            inputStreamOpenInputStream.close();
                            return true;
                        } catch (Exception e9) {
                            FileLog.e(e9);
                            return true;
                        }
                    }
                }
            } catch (Exception e10) {
                FileLog.e(e10);
                if (inputStreamOpenInputStream != null) {
                }
                return false;
            }
            try {
                inputStreamOpenInputStream.close();
            } catch (Exception e11) {
                FileLog.e(e11);
            }
            return false;
        } catch (Throwable th) {
            if (inputStreamOpenInputStream != null) {
                try {
                    inputStreamOpenInputStream.close();
                } catch (Exception e12) {
                    FileLog.e(e12);
                }
            }
            throw th;
        }
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

    public static void lambda$checkGallery$1(int i10) {
        Cursor cursorQuery;
        Cursor cursorQuery2;
        int i11;
        int i12;
        try {
            Context context = ApplicationLoader.applicationContext;
            if (Build.VERSION.SDK_INT < 33 || !(context.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0 || context.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0 || context.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") == 0)) {
                if (context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
                    cursorQuery = MediaStore.Images.Media.query(context.getContentResolver(), MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{"COUNT(_id)"}, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            i12 = cursorQuery.moveToNext() ? cursorQuery.getInt(0) : 0;
                        } catch (Throwable th) {
                            th = th;
                            try {
                                FileLog.e(th);
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                cursorQuery2 = cursorQuery;
                                i11 = 0;
                            } catch (Throwable th2) {
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                throw th2;
                            }
                        }
                    }
                } else {
                    cursorQuery = null;
                }
            } else {
                cursorQuery = MediaStore.Images.Media.query(context.getContentResolver(), MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{"COUNT(_id)"}, null, null, null);
                if (cursorQuery != null) {
                    if (cursorQuery.moveToNext()) {
                    }
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            cursorQuery2 = cursorQuery;
            i11 = i12;
        } catch (Throwable th3) {
            th = th3;
            cursorQuery = null;
        }
        try {
            Context context2 = ApplicationLoader.applicationContext;
            if (Build.VERSION.SDK_INT >= 33 && (context2.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0 || context2.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0 || context2.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") == 0)) {
                cursorQuery2 = MediaStore.Images.Media.query(context2.getContentResolver(), MediaStore.Video.Media.EXTERNAL_CONTENT_URI, new String[]{"COUNT(_id)"}, null, null, null);
                if (cursorQuery2 != null) {
                    i11 += cursorQuery2.getInt(0);
                }
            } else if (context2.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
                cursorQuery2 = MediaStore.Images.Media.query(context2.getContentResolver(), MediaStore.Video.Media.EXTERNAL_CONTENT_URI, new String[]{"COUNT(_id)"}, null, null, null);
                if (cursorQuery2 != null && cursorQuery2.moveToNext()) {
                    i11 += cursorQuery2.getInt(0);
                }
            }
            if (cursorQuery2 != null) {
                cursorQuery2.close();
            }
        } catch (Throwable th4) {
            try {
                FileLog.e(th4);
                if (cursorQuery2 != null) {
                }
            } catch (Throwable th5) {
                if (cursorQuery2 != null) {
                    cursorQuery2.close();
                }
                throw th5;
            }
        }
        if (i10 != i11) {
            Runnable runnable = refreshGalleryRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                refreshGalleryRunnable = null;
            }
            loadGalleryPhotosAlbums(0);
        }
    }

    public void lambda$cleanupPlayer$10(m61 m61Var, ValueAnimator valueAnimator) {
        m61Var.X(((Float) valueAnimator.getAnimatedValue()).floatValue() * (this.audioFocus != 1 ? 1.0f : 0.2f));
    }

    public void lambda$didWriteData$59(boolean z10, boolean z11, VideoConvertMessage videoConvertMessage, File file, float f10, long j10, boolean z12, long j11) {
        if (z10 || z11) {
            boolean z13 = videoConvertMessage.videoEditedInfo.canceled;
            synchronized (this.videoConvertSync) {
                videoConvertMessage.videoEditedInfo.canceled = false;
            }
            this.videoConvertQueue.remove(videoConvertMessage);
            this.foregroundConvertingMessages.remove(videoConvertMessage);
            checkForegroundConvertMessage(z13 || z10);
            startVideoConvertFromQueue();
        }
        if (z10) {
            NotificationCenter.getInstance(videoConvertMessage.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.filePreparingFailed, videoConvertMessage.messageObject, file.toString(), Float.valueOf(f10), Long.valueOf(j10));
            return;
        }
        if (z12) {
            NotificationCenter.getInstance(videoConvertMessage.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.filePreparingStarted, videoConvertMessage.messageObject, file.toString(), Float.valueOf(f10), Long.valueOf(j10));
        }
        NotificationCenter.getInstance(videoConvertMessage.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileNewChunkAvailable, videoConvertMessage.messageObject, file.toString(), Long.valueOf(j11), Long.valueOf(z11 ? file.length() : 0L), Float.valueOf(f10), Long.valueOf(j10));
    }

    public void lambda$generateWaveform$38(String str, byte[] bArr, MessageObject messageObject) {
        MessageObject messageObjectRemove = this.generatingWaveform.remove(str);
        if (messageObjectRemove == null || bArr == null || messageObjectRemove.getDocument() == null) {
            return;
        }
        for (int i10 = 0; i10 < messageObjectRemove.getDocument().attributes.size(); i10++) {
            TLRPC.DocumentAttribute documentAttribute = messageObjectRemove.getDocument().attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                documentAttribute.waveform = bArr;
                documentAttribute.flags |= 4;
                break;
            }
        }
        TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
        tL_messages_messages.messages.add(messageObjectRemove.messageOwner);
        MessagesStorage.getInstance(messageObjectRemove.currentAccount).putMessages((TLRPC.messages_Messages) tL_messages_messages, messageObjectRemove.getDialogId(), -1, 0, false, messageObject.scheduled ? 1 : 0, 0L);
        NotificationCenter.getInstance(messageObjectRemove.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.replaceMessagesObjects, Long.valueOf(messageObjectRemove.getDialogId()), y1.m(messageObjectRemove));
    }

    public void lambda$generateWaveform$39(String str, String str2, MessageObject messageObject) {
        try {
            AndroidUtilities.runOnUIThread(new lk(this, str2, getWaveform(str), messageObject, 12));
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public static int lambda$loadGalleryPhotosAlbums$56(PhotoEntry photoEntry, PhotoEntry photoEntry2) {
        long j10 = photoEntry.dateTaken;
        long j11 = photoEntry2.dateTaken;
        if (j10 < j11) {
            return 1;
        }
        return j10 > j11 ? -1 : 0;
    }

    public static void lambda$loadGalleryPhotosAlbums$57(int i10) {
        SparseArray sparseArray;
        String string;
        ArrayList arrayList;
        Cursor cursorQuery;
        AlbumEntry albumEntry;
        AlbumEntry albumEntry2;
        Object objValueOf;
        AlbumEntry albumEntry3;
        ArrayList arrayList2;
        int i11;
        int i12;
        String str;
        int columnIndex;
        int columnIndex2;
        int columnIndex3;
        int columnIndex4;
        String str2;
        int columnIndex5;
        int columnIndex6;
        int columnIndex7;
        int columnIndex8;
        int columnIndex9;
        String string2;
        int i13;
        String string3;
        PhotoEntry photoEntry;
        AlbumEntry albumEntry4;
        AlbumEntry albumEntry5;
        AlbumEntry albumEntry6;
        int i14;
        String str3;
        int columnIndex10;
        int columnIndex11;
        int columnIndex12;
        int columnIndex13;
        String str4;
        int columnIndex14;
        int columnIndex15;
        int columnIndex16;
        int columnIndex17;
        int columnIndex18;
        Integer numValueOf;
        String string4;
        int i15;
        String string5;
        PhotoEntry photoEntry2;
        AlbumEntry albumEntry7;
        AlbumEntry albumEntry8;
        AlbumEntry albumEntry9;
        AlbumEntry albumEntry10;
        Cursor cursor;
        AlbumEntry albumEntry11;
        SparseArray sparseArray2;
        AlbumEntry albumEntry12;
        String str5 = "height";
        String str6 = "width";
        String str7 = "orientation";
        String str8 = "_data";
        String str9 = "bucket_display_name";
        String str10 = "bucket_id";
        String str11 = "_id";
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = arrayList3;
        SparseArray sparseArray3 = new SparseArray();
        SparseArray sparseArray4 = new SparseArray();
        AlbumEntry albumEntry13 = null;
        try {
            StringBuilder sb2 = new StringBuilder();
            sparseArray = sparseArray4;
            try {
                sb2.append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getAbsolutePath());
                sb2.append("/Camera/");
                string = sb2.toString();
            } catch (Exception e9) {
                e = e9;
                FileLog.e(e);
                string = null;
            }
        } catch (Exception e10) {
            e = e10;
            sparseArray = sparseArray4;
        }
        try {
            Context context = ApplicationLoader.applicationContext;
            int i16 = Build.VERSION.SDK_INT;
            ArrayList arrayList6 = arrayList4;
            if (i16 < 23) {
                try {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    String[] strArr = projectionPhotos;
                    StringBuilder sb3 = new StringBuilder();
                    if (i16 > 28) {
                        str3 = "date_modified";
                    } else {
                        str3 = "datetaken";
                    }
                    sb3.append(str3);
                    sb3.append(" DESC");
                    cursorQuery = MediaStore.Images.Media.query(contentResolver, uri, strArr, null, null, sb3.toString());
                    if (cursorQuery != null) {
                        try {
                            columnIndex10 = cursorQuery.getColumnIndex("_id");
                            str11 = "_id";
                            try {
                                columnIndex11 = cursorQuery.getColumnIndex("bucket_id");
                                str10 = "bucket_id";
                                try {
                                    columnIndex12 = cursorQuery.getColumnIndex("bucket_display_name");
                                    str9 = "bucket_display_name";
                                    try {
                                        columnIndex13 = cursorQuery.getColumnIndex("_data");
                                        str8 = "_data";
                                        if (i16 > 28) {
                                            str4 = "date_modified";
                                        } else {
                                            str4 = "datetaken";
                                        }
                                        try {
                                            columnIndex14 = cursorQuery.getColumnIndex(str4);
                                            columnIndex15 = cursorQuery.getColumnIndex("orientation");
                                            str7 = "orientation";
                                            try {
                                                columnIndex16 = cursorQuery.getColumnIndex("width");
                                                str6 = "width";
                                                try {
                                                    columnIndex17 = cursorQuery.getColumnIndex("height");
                                                    str5 = "height";
                                                    try {
                                                        columnIndex18 = cursorQuery.getColumnIndex("_size");
                                                        albumEntry = null;
                                                        albumEntry2 = null;
                                                        objValueOf = null;
                                                        numValueOf = null;
                                                        while (cursorQuery.moveToNext()) {
                                                            try {
                                                                string4 = cursorQuery.getString(columnIndex13);
                                                                if (TextUtils.isEmpty(string4)) {
                                                                    int i17 = cursorQuery.getInt(columnIndex10);
                                                                    i15 = cursorQuery.getInt(columnIndex11);
                                                                    int i18 = columnIndex10;
                                                                    string5 = cursorQuery.getString(columnIndex12);
                                                                    photoEntry2 = new PhotoEntry(i15, i17, cursorQuery.getLong(columnIndex14), string4, cursorQuery.getInt(columnIndex15), 0, false, cursorQuery.getInt(columnIndex16), cursorQuery.getInt(columnIndex17), cursorQuery.getLong(columnIndex18));
                                                                    int i19 = columnIndex17;
                                                                    int i20 = columnIndex16;
                                                                    int i21 = columnIndex18;
                                                                    if (albumEntry == null) {
                                                                        try {
                                                                            albumEntry7 = new AlbumEntry(0, LocaleController.getString(R.string.AllPhotos), photoEntry2);
                                                                            arrayList = arrayList6;
                                                                            try {
                                                                                arrayList.add(0, albumEntry7);
                                                                            } catch (Throwable th) {
                                                                                th = th;
                                                                                albumEntry = albumEntry7;
                                                                                arrayList5 = arrayList5;
                                                                                sparseArray3 = sparseArray3;
                                                                                string = string;
                                                                                try {
                                                                                    FileLog.e(th);
                                                                                    if (cursorQuery != null) {
                                                                                        try {
                                                                                            cursorQuery.close();
                                                                                        } catch (Exception e11) {
                                                                                            FileLog.e(e11);
                                                                                        }
                                                                                    }
                                                                                    albumEntry3 = albumEntry;
                                                                                    Context context2 = ApplicationLoader.applicationContext;
                                                                                    i12 = Build.VERSION.SDK_INT;
                                                                                    if (i12 >= 23) {
                                                                                        ContentResolver contentResolver2 = ApplicationLoader.applicationContext.getContentResolver();
                                                                                        Uri uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                                                                                        String[] strArr2 = projectionVideo;
                                                                                        StringBuilder sb4 = new StringBuilder();
                                                                                        if (i12 > 28) {
                                                                                            str = "date_modified";
                                                                                        } else {
                                                                                            str = "datetaken";
                                                                                        }
                                                                                        sb4.append(str);
                                                                                        sb4.append(" DESC");
                                                                                        cursorQuery = MediaStore.Images.Media.query(contentResolver2, uri2, strArr2, null, null, sb4.toString());
                                                                                        if (cursorQuery != null) {
                                                                                            columnIndex = cursorQuery.getColumnIndex(str11);
                                                                                            columnIndex2 = cursorQuery.getColumnIndex(str10);
                                                                                            columnIndex3 = cursorQuery.getColumnIndex(str9);
                                                                                            columnIndex4 = cursorQuery.getColumnIndex(str8);
                                                                                            if (i12 > 28) {
                                                                                                str2 = "date_modified";
                                                                                            } else {
                                                                                                str2 = "datetaken";
                                                                                            }
                                                                                            columnIndex5 = cursorQuery.getColumnIndex(str2);
                                                                                            columnIndex6 = cursorQuery.getColumnIndex("duration");
                                                                                            columnIndex7 = cursorQuery.getColumnIndex(str6);
                                                                                            columnIndex8 = cursorQuery.getColumnIndex(str5);
                                                                                            columnIndex9 = cursorQuery.getColumnIndex("_size");
                                                                                            cursorQuery.getColumnIndex(str7);
                                                                                            while (cursorQuery.moveToNext()) {
                                                                                                string2 = cursorQuery.getString(columnIndex4);
                                                                                                if (TextUtils.isEmpty(string2)) {
                                                                                                    int i22 = cursorQuery.getInt(columnIndex);
                                                                                                    i13 = cursorQuery.getInt(columnIndex2);
                                                                                                    string3 = cursorQuery.getString(columnIndex3);
                                                                                                    int i23 = columnIndex;
                                                                                                    int i24 = columnIndex9;
                                                                                                    photoEntry = new PhotoEntry(i13, i22, cursorQuery.getLong(columnIndex5), string2, 0, (int) (cursorQuery.getLong(columnIndex6) / 1000), true, cursorQuery.getInt(columnIndex7), cursorQuery.getInt(columnIndex8), cursorQuery.getLong(columnIndex9));
                                                                                                    int i25 = columnIndex5;
                                                                                                    if (albumEntry13 == null) {
                                                                                                        arrayList2 = arrayList;
                                                                                                        try {
                                                                                                            albumEntry4 = new AlbumEntry(0, LocaleController.getString(R.string.AllVideos), photoEntry);
                                                                                                            i14 = 1;
                                                                                                            try {
                                                                                                                albumEntry4.videoOnly = true;
                                                                                                                if (albumEntry2 != null) {
                                                                                                                    i14 = 0;
                                                                                                                }
                                                                                                                if (albumEntry3 != null) {
                                                                                                                    i14++;
                                                                                                                }
                                                                                                                arrayList5.add(i14, albumEntry4);
                                                                                                            } catch (Throwable th2) {
                                                                                                                th = th2;
                                                                                                                albumEntry13 = albumEntry4;
                                                                                                                try {
                                                                                                                    FileLog.e(th);
                                                                                                                    if (cursorQuery != null) {
                                                                                                                        try {
                                                                                                                            cursorQuery.close();
                                                                                                                        } catch (Exception e12) {
                                                                                                                            FileLog.e(e12);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    AlbumEntry albumEntry14 = albumEntry13;
                                                                                                                    AlbumEntry albumEntry15 = albumEntry2;
                                                                                                                    Integer num = objValueOf;
                                                                                                                    for (i11 = 0; i11 < arrayList5.size(); i11++) {
                                                                                                                        Collections.sort(((AlbumEntry) arrayList5.get(i11)).photos, new q(6));
                                                                                                                    }
                                                                                                                    broadcastNewPhotos(i10, arrayList5, arrayList2, num, albumEntry15, albumEntry3, albumEntry14, 0);
                                                                                                                } catch (Throwable th3) {
                                                                                                                    if (cursorQuery == null) {
                                                                                                                        throw th3;
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        cursorQuery.close();
                                                                                                                        throw th3;
                                                                                                                    } catch (Exception e13) {
                                                                                                                        FileLog.e(e13);
                                                                                                                        throw th3;
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        } catch (Throwable th4) {
                                                                                                            th = th4;
                                                                                                        }
                                                                                                    } else {
                                                                                                        arrayList2 = arrayList;
                                                                                                        albumEntry4 = albumEntry13;
                                                                                                    }
                                                                                                    if (albumEntry2 == null) {
                                                                                                        albumEntry5 = new AlbumEntry(0, LocaleController.getString(R.string.AllMedia), photoEntry);
                                                                                                        try {
                                                                                                            arrayList5.add(0, albumEntry5);
                                                                                                        } catch (Throwable th5) {
                                                                                                            th = th5;
                                                                                                            albumEntry13 = albumEntry4;
                                                                                                            albumEntry2 = albumEntry5;
                                                                                                            FileLog.e(th);
                                                                                                            if (cursorQuery != null) {
                                                                                                                cursorQuery.close();
                                                                                                            }
                                                                                                            AlbumEntry albumEntry16 = albumEntry13;
                                                                                                            AlbumEntry albumEntry17 = albumEntry2;
                                                                                                            Integer num2 = objValueOf;
                                                                                                            while (i11 < arrayList5.size()) {
                                                                                                                Collections.sort(((AlbumEntry) arrayList5.get(i11)).photos, new q(6));
                                                                                                            }
                                                                                                            broadcastNewPhotos(i10, arrayList5, arrayList2, num2, albumEntry17, albumEntry3, albumEntry16, 0);
                                                                                                        }
                                                                                                    } else {
                                                                                                        albumEntry5 = albumEntry2;
                                                                                                    }
                                                                                                    try {
                                                                                                        albumEntry4.addPhoto(photoEntry);
                                                                                                        albumEntry5.addPhoto(photoEntry);
                                                                                                        albumEntry6 = (AlbumEntry) sparseArray3.get(i13);
                                                                                                        if (albumEntry6 == null) {
                                                                                                            albumEntry6 = new AlbumEntry(i13, string3, photoEntry);
                                                                                                            sparseArray3.put(i13, albumEntry6);
                                                                                                            if (objValueOf == null) {
                                                                                                                arrayList5.add(albumEntry6);
                                                                                                            } else {
                                                                                                                arrayList5.add(albumEntry6);
                                                                                                            }
                                                                                                        }
                                                                                                        albumEntry6.addPhoto(photoEntry);
                                                                                                        albumEntry13 = albumEntry4;
                                                                                                        albumEntry2 = albumEntry5;
                                                                                                        columnIndex = i23;
                                                                                                        columnIndex5 = i25;
                                                                                                        columnIndex2 = columnIndex2;
                                                                                                        columnIndex4 = columnIndex4;
                                                                                                        columnIndex3 = columnIndex3;
                                                                                                        columnIndex9 = i24;
                                                                                                        arrayList = arrayList2;
                                                                                                    } catch (Throwable th6) {
                                                                                                        th = th6;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        arrayList2 = arrayList;
                                                                                        if (cursorQuery != null) {
                                                                                            cursorQuery.close();
                                                                                        }
                                                                                    } else {
                                                                                        ContentResolver contentResolver3 = ApplicationLoader.applicationContext.getContentResolver();
                                                                                        Uri uri3 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                                                                                        String[] strArr3 = projectionVideo;
                                                                                        StringBuilder sb5 = new StringBuilder();
                                                                                        if (i12 > 28) {
                                                                                            str = "date_modified";
                                                                                        } else {
                                                                                            str = "datetaken";
                                                                                        }
                                                                                        sb5.append(str);
                                                                                        sb5.append(" DESC");
                                                                                        cursorQuery = MediaStore.Images.Media.query(contentResolver3, uri3, strArr3, null, null, sb5.toString());
                                                                                        if (cursorQuery != null) {
                                                                                            columnIndex = cursorQuery.getColumnIndex(str11);
                                                                                            columnIndex2 = cursorQuery.getColumnIndex(str10);
                                                                                            columnIndex3 = cursorQuery.getColumnIndex(str9);
                                                                                            columnIndex4 = cursorQuery.getColumnIndex(str8);
                                                                                            if (i12 > 28) {
                                                                                                str2 = "date_modified";
                                                                                            } else {
                                                                                                str2 = "datetaken";
                                                                                            }
                                                                                            columnIndex5 = cursorQuery.getColumnIndex(str2);
                                                                                            columnIndex6 = cursorQuery.getColumnIndex("duration");
                                                                                            columnIndex7 = cursorQuery.getColumnIndex(str6);
                                                                                            columnIndex8 = cursorQuery.getColumnIndex(str5);
                                                                                            columnIndex9 = cursorQuery.getColumnIndex("_size");
                                                                                            cursorQuery.getColumnIndex(str7);
                                                                                            while (cursorQuery.moveToNext()) {
                                                                                                string2 = cursorQuery.getString(columnIndex4);
                                                                                                if (TextUtils.isEmpty(string2)) {
                                                                                                    int i26 = cursorQuery.getInt(columnIndex);
                                                                                                    i13 = cursorQuery.getInt(columnIndex2);
                                                                                                    string3 = cursorQuery.getString(columnIndex3);
                                                                                                    int i27 = columnIndex;
                                                                                                    int i28 = columnIndex9;
                                                                                                    photoEntry = new PhotoEntry(i13, i26, cursorQuery.getLong(columnIndex5), string2, 0, (int) (cursorQuery.getLong(columnIndex6) / 1000), true, cursorQuery.getInt(columnIndex7), cursorQuery.getInt(columnIndex8), cursorQuery.getLong(columnIndex9));
                                                                                                    int i29 = columnIndex5;
                                                                                                    if (albumEntry13 == null) {
                                                                                                        arrayList2 = arrayList;
                                                                                                        albumEntry4 = new AlbumEntry(0, LocaleController.getString(R.string.AllVideos), photoEntry);
                                                                                                        i14 = 1;
                                                                                                        albumEntry4.videoOnly = true;
                                                                                                        if (albumEntry2 != null) {
                                                                                                            i14 = 0;
                                                                                                        }
                                                                                                        if (albumEntry3 != null) {
                                                                                                            i14++;
                                                                                                        }
                                                                                                        arrayList5.add(i14, albumEntry4);
                                                                                                    } else {
                                                                                                        arrayList2 = arrayList;
                                                                                                        albumEntry4 = albumEntry13;
                                                                                                    }
                                                                                                    if (albumEntry2 == null) {
                                                                                                        albumEntry5 = new AlbumEntry(0, LocaleController.getString(R.string.AllMedia), photoEntry);
                                                                                                        arrayList5.add(0, albumEntry5);
                                                                                                    } else {
                                                                                                        albumEntry5 = albumEntry2;
                                                                                                    }
                                                                                                    albumEntry4.addPhoto(photoEntry);
                                                                                                    albumEntry5.addPhoto(photoEntry);
                                                                                                    albumEntry6 = (AlbumEntry) sparseArray3.get(i13);
                                                                                                    if (albumEntry6 == null) {
                                                                                                        albumEntry6 = new AlbumEntry(i13, string3, photoEntry);
                                                                                                        sparseArray3.put(i13, albumEntry6);
                                                                                                        if (objValueOf == null) {
                                                                                                            arrayList5.add(albumEntry6);
                                                                                                        } else {
                                                                                                            arrayList5.add(albumEntry6);
                                                                                                        }
                                                                                                    }
                                                                                                    albumEntry6.addPhoto(photoEntry);
                                                                                                    albumEntry13 = albumEntry4;
                                                                                                    albumEntry2 = albumEntry5;
                                                                                                    columnIndex = i27;
                                                                                                    columnIndex5 = i29;
                                                                                                    columnIndex2 = columnIndex2;
                                                                                                    columnIndex4 = columnIndex4;
                                                                                                    columnIndex3 = columnIndex3;
                                                                                                    columnIndex9 = i28;
                                                                                                    arrayList = arrayList2;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        arrayList2 = arrayList;
                                                                                        if (cursorQuery != null) {
                                                                                            cursorQuery.close();
                                                                                        }
                                                                                    }
                                                                                    AlbumEntry albumEntry18 = albumEntry13;
                                                                                    AlbumEntry albumEntry19 = albumEntry2;
                                                                                    Integer num3 = objValueOf;
                                                                                    while (i11 < arrayList5.size()) {
                                                                                        Collections.sort(((AlbumEntry) arrayList5.get(i11)).photos, new q(6));
                                                                                    }
                                                                                    broadcastNewPhotos(i10, arrayList5, arrayList2, num3, albumEntry19, albumEntry3, albumEntry18, 0);
                                                                                } catch (Throwable th7) {
                                                                                    if (cursorQuery == null) {
                                                                                        throw th7;
                                                                                    }
                                                                                    try {
                                                                                        cursorQuery.close();
                                                                                        throw th7;
                                                                                    } catch (Exception e14) {
                                                                                        FileLog.e(e14);
                                                                                        throw th7;
                                                                                    }
                                                                                }
                                                                            }
                                                                        } catch (Throwable th8) {
                                                                            th = th8;
                                                                            arrayList = arrayList6;
                                                                        }
                                                                    } else {
                                                                        arrayList = arrayList6;
                                                                        albumEntry7 = albumEntry;
                                                                    }
                                                                    if (albumEntry2 == null) {
                                                                        try {
                                                                            albumEntry8 = new AlbumEntry(0, LocaleController.getString(R.string.AllMedia), photoEntry2);
                                                                            arrayList5 = arrayList5;
                                                                            try {
                                                                                arrayList5.add(0, albumEntry8);
                                                                            } catch (Throwable th9) {
                                                                                th = th9;
                                                                                albumEntry = albumEntry7;
                                                                                albumEntry2 = albumEntry8;
                                                                                sparseArray3 = sparseArray3;
                                                                                string = string;
                                                                                FileLog.e(th);
                                                                                if (cursorQuery != null) {
                                                                                    cursorQuery.close();
                                                                                }
                                                                                albumEntry3 = albumEntry;
                                                                                Context context3 = ApplicationLoader.applicationContext;
                                                                                i12 = Build.VERSION.SDK_INT;
                                                                                if (i12 >= 23) {
                                                                                    ContentResolver contentResolver4 = ApplicationLoader.applicationContext.getContentResolver();
                                                                                    Uri uri4 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                                                                                    String[] strArr4 = projectionVideo;
                                                                                    StringBuilder sb6 = new StringBuilder();
                                                                                    if (i12 > 28) {
                                                                                        str = "date_modified";
                                                                                    } else {
                                                                                        str = "datetaken";
                                                                                    }
                                                                                    sb6.append(str);
                                                                                    sb6.append(" DESC");
                                                                                    cursorQuery = MediaStore.Images.Media.query(contentResolver4, uri4, strArr4, null, null, sb6.toString());
                                                                                    if (cursorQuery != null) {
                                                                                        columnIndex = cursorQuery.getColumnIndex(str11);
                                                                                        columnIndex2 = cursorQuery.getColumnIndex(str10);
                                                                                        columnIndex3 = cursorQuery.getColumnIndex(str9);
                                                                                        columnIndex4 = cursorQuery.getColumnIndex(str8);
                                                                                        if (i12 > 28) {
                                                                                            str2 = "date_modified";
                                                                                        } else {
                                                                                            str2 = "datetaken";
                                                                                        }
                                                                                        columnIndex5 = cursorQuery.getColumnIndex(str2);
                                                                                        columnIndex6 = cursorQuery.getColumnIndex("duration");
                                                                                        columnIndex7 = cursorQuery.getColumnIndex(str6);
                                                                                        columnIndex8 = cursorQuery.getColumnIndex(str5);
                                                                                        columnIndex9 = cursorQuery.getColumnIndex("_size");
                                                                                        cursorQuery.getColumnIndex(str7);
                                                                                        while (cursorQuery.moveToNext()) {
                                                                                            string2 = cursorQuery.getString(columnIndex4);
                                                                                            if (TextUtils.isEmpty(string2)) {
                                                                                                int i210 = cursorQuery.getInt(columnIndex);
                                                                                                i13 = cursorQuery.getInt(columnIndex2);
                                                                                                string3 = cursorQuery.getString(columnIndex3);
                                                                                                int i211 = columnIndex;
                                                                                                int i212 = columnIndex9;
                                                                                                photoEntry = new PhotoEntry(i13, i210, cursorQuery.getLong(columnIndex5), string2, 0, (int) (cursorQuery.getLong(columnIndex6) / 1000), true, cursorQuery.getInt(columnIndex7), cursorQuery.getInt(columnIndex8), cursorQuery.getLong(columnIndex9));
                                                                                                int i213 = columnIndex5;
                                                                                                if (albumEntry13 == null) {
                                                                                                    arrayList2 = arrayList;
                                                                                                    albumEntry4 = new AlbumEntry(0, LocaleController.getString(R.string.AllVideos), photoEntry);
                                                                                                    i14 = 1;
                                                                                                    albumEntry4.videoOnly = true;
                                                                                                    if (albumEntry2 != null) {
                                                                                                        i14 = 0;
                                                                                                    }
                                                                                                    if (albumEntry3 != null) {
                                                                                                        i14++;
                                                                                                    }
                                                                                                    arrayList5.add(i14, albumEntry4);
                                                                                                } else {
                                                                                                    arrayList2 = arrayList;
                                                                                                    albumEntry4 = albumEntry13;
                                                                                                }
                                                                                                if (albumEntry2 == null) {
                                                                                                    albumEntry5 = new AlbumEntry(0, LocaleController.getString(R.string.AllMedia), photoEntry);
                                                                                                    arrayList5.add(0, albumEntry5);
                                                                                                } else {
                                                                                                    albumEntry5 = albumEntry2;
                                                                                                }
                                                                                                albumEntry4.addPhoto(photoEntry);
                                                                                                albumEntry5.addPhoto(photoEntry);
                                                                                                albumEntry6 = (AlbumEntry) sparseArray3.get(i13);
                                                                                                if (albumEntry6 == null) {
                                                                                                    albumEntry6 = new AlbumEntry(i13, string3, photoEntry);
                                                                                                    sparseArray3.put(i13, albumEntry6);
                                                                                                    if (objValueOf == null) {
                                                                                                        arrayList5.add(albumEntry6);
                                                                                                    } else {
                                                                                                        arrayList5.add(albumEntry6);
                                                                                                    }
                                                                                                }
                                                                                                albumEntry6.addPhoto(photoEntry);
                                                                                                albumEntry13 = albumEntry4;
                                                                                                albumEntry2 = albumEntry5;
                                                                                                columnIndex = i211;
                                                                                                columnIndex5 = i213;
                                                                                                columnIndex2 = columnIndex2;
                                                                                                columnIndex4 = columnIndex4;
                                                                                                columnIndex3 = columnIndex3;
                                                                                                columnIndex9 = i212;
                                                                                                arrayList = arrayList2;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    arrayList2 = arrayList;
                                                                                    if (cursorQuery != null) {
                                                                                        cursorQuery.close();
                                                                                    }
                                                                                } else {
                                                                                    ContentResolver contentResolver5 = ApplicationLoader.applicationContext.getContentResolver();
                                                                                    Uri uri5 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                                                                                    String[] strArr5 = projectionVideo;
                                                                                    StringBuilder sb7 = new StringBuilder();
                                                                                    if (i12 > 28) {
                                                                                        str = "date_modified";
                                                                                    } else {
                                                                                        str = "datetaken";
                                                                                    }
                                                                                    sb7.append(str);
                                                                                    sb7.append(" DESC");
                                                                                    cursorQuery = MediaStore.Images.Media.query(contentResolver5, uri5, strArr5, null, null, sb7.toString());
                                                                                    if (cursorQuery != null) {
                                                                                        columnIndex = cursorQuery.getColumnIndex(str11);
                                                                                        columnIndex2 = cursorQuery.getColumnIndex(str10);
                                                                                        columnIndex3 = cursorQuery.getColumnIndex(str9);
                                                                                        columnIndex4 = cursorQuery.getColumnIndex(str8);
                                                                                        if (i12 > 28) {
                                                                                            str2 = "date_modified";
                                                                                        } else {
                                                                                            str2 = "datetaken";
                                                                                        }
                                                                                        columnIndex5 = cursorQuery.getColumnIndex(str2);
                                                                                        columnIndex6 = cursorQuery.getColumnIndex("duration");
                                                                                        columnIndex7 = cursorQuery.getColumnIndex(str6);
                                                                                        columnIndex8 = cursorQuery.getColumnIndex(str5);
                                                                                        columnIndex9 = cursorQuery.getColumnIndex("_size");
                                                                                        cursorQuery.getColumnIndex(str7);
                                                                                        while (cursorQuery.moveToNext()) {
                                                                                            string2 = cursorQuery.getString(columnIndex4);
                                                                                            if (TextUtils.isEmpty(string2)) {
                                                                                                int i214 = cursorQuery.getInt(columnIndex);
                                                                                                i13 = cursorQuery.getInt(columnIndex2);
                                                                                                string3 = cursorQuery.getString(columnIndex3);
                                                                                                int i215 = columnIndex;
                                                                                                int i216 = columnIndex9;
                                                                                                photoEntry = new PhotoEntry(i13, i214, cursorQuery.getLong(columnIndex5), string2, 0, (int) (cursorQuery.getLong(columnIndex6) / 1000), true, cursorQuery.getInt(columnIndex7), cursorQuery.getInt(columnIndex8), cursorQuery.getLong(columnIndex9));
                                                                                                int i217 = columnIndex5;
                                                                                                if (albumEntry13 == null) {
                                                                                                    arrayList2 = arrayList;
                                                                                                    albumEntry4 = new AlbumEntry(0, LocaleController.getString(R.string.AllVideos), photoEntry);
                                                                                                    i14 = 1;
                                                                                                    albumEntry4.videoOnly = true;
                                                                                                    if (albumEntry2 != null) {
                                                                                                        i14 = 0;
                                                                                                    }
                                                                                                    if (albumEntry3 != null) {
                                                                                                        i14++;
                                                                                                    }
                                                                                                    arrayList5.add(i14, albumEntry4);
                                                                                                } else {
                                                                                                    arrayList2 = arrayList;
                                                                                                    albumEntry4 = albumEntry13;
                                                                                                }
                                                                                                if (albumEntry2 == null) {
                                                                                                    albumEntry5 = new AlbumEntry(0, LocaleController.getString(R.string.AllMedia), photoEntry);
                                                                                                    arrayList5.add(0, albumEntry5);
                                                                                                } else {
                                                                                                    albumEntry5 = albumEntry2;
                                                                                                }
                                                                                                albumEntry4.addPhoto(photoEntry);
                                                                                                albumEntry5.addPhoto(photoEntry);
                                                                                                albumEntry6 = (AlbumEntry) sparseArray3.get(i13);
                                                                                                if (albumEntry6 == null) {
                                                                                                    albumEntry6 = new AlbumEntry(i13, string3, photoEntry);
                                                                                                    sparseArray3.put(i13, albumEntry6);
                                                                                                    if (objValueOf == null) {
                                                                                                        arrayList5.add(albumEntry6);
                                                                                                    } else {
                                                                                                        arrayList5.add(albumEntry6);
                                                                                                    }
                                                                                                }
                                                                                                albumEntry6.addPhoto(photoEntry);
                                                                                                albumEntry13 = albumEntry4;
                                                                                                albumEntry2 = albumEntry5;
                                                                                                columnIndex = i215;
                                                                                                columnIndex5 = i217;
                                                                                                columnIndex2 = columnIndex2;
                                                                                                columnIndex4 = columnIndex4;
                                                                                                columnIndex3 = columnIndex3;
                                                                                                columnIndex9 = i216;
                                                                                                arrayList = arrayList2;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    arrayList2 = arrayList;
                                                                                    if (cursorQuery != null) {
                                                                                        cursorQuery.close();
                                                                                    }
                                                                                }
                                                                                AlbumEntry albumEntry110 = albumEntry13;
                                                                                AlbumEntry albumEntry111 = albumEntry2;
                                                                                Integer num4 = objValueOf;
                                                                                while (i11 < arrayList5.size()) {
                                                                                    Collections.sort(((AlbumEntry) arrayList5.get(i11)).photos, new q(6));
                                                                                }
                                                                                broadcastNewPhotos(i10, arrayList5, arrayList2, num4, albumEntry111, albumEntry3, albumEntry110, 0);
                                                                            }
                                                                        } catch (Throwable th10) {
                                                                            th = th10;
                                                                            arrayList5 = arrayList5;
                                                                            albumEntry = albumEntry7;
                                                                        }
                                                                    } else {
                                                                        arrayList5 = arrayList5;
                                                                        albumEntry8 = albumEntry2;
                                                                    }
                                                                    try {
                                                                        cursor = cursorQuery;
                                                                        if (albumEntry7.photos.size() < 15) {
                                                                            try {
                                                                                photoEntry2.isLivePhoto();
                                                                            } catch (Throwable th11) {
                                                                                th = th11;
                                                                                albumEntry = albumEntry7;
                                                                                albumEntry2 = albumEntry8;
                                                                                cursorQuery = cursor;
                                                                                sparseArray3 = sparseArray3;
                                                                                string = string;
                                                                                FileLog.e(th);
                                                                                if (cursorQuery != null) {
                                                                                    cursorQuery.close();
                                                                                }
                                                                                albumEntry3 = albumEntry;
                                                                                Context context4 = ApplicationLoader.applicationContext;
                                                                                i12 = Build.VERSION.SDK_INT;
                                                                                if (i12 >= 23) {
                                                                                    ContentResolver contentResolver6 = ApplicationLoader.applicationContext.getContentResolver();
                                                                                    Uri uri6 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                                                                                    String[] strArr6 = projectionVideo;
                                                                                    StringBuilder sb8 = new StringBuilder();
                                                                                    if (i12 > 28) {
                                                                                        str = "date_modified";
                                                                                    } else {
                                                                                        str = "datetaken";
                                                                                    }
                                                                                    sb8.append(str);
                                                                                    sb8.append(" DESC");
                                                                                    cursorQuery = MediaStore.Images.Media.query(contentResolver6, uri6, strArr6, null, null, sb8.toString());
                                                                                    if (cursorQuery != null) {
                                                                                        columnIndex = cursorQuery.getColumnIndex(str11);
                                                                                        columnIndex2 = cursorQuery.getColumnIndex(str10);
                                                                                        columnIndex3 = cursorQuery.getColumnIndex(str9);
                                                                                        columnIndex4 = cursorQuery.getColumnIndex(str8);
                                                                                        if (i12 > 28) {
                                                                                            str2 = "date_modified";
                                                                                        } else {
                                                                                            str2 = "datetaken";
                                                                                        }
                                                                                        columnIndex5 = cursorQuery.getColumnIndex(str2);
                                                                                        columnIndex6 = cursorQuery.getColumnIndex("duration");
                                                                                        columnIndex7 = cursorQuery.getColumnIndex(str6);
                                                                                        columnIndex8 = cursorQuery.getColumnIndex(str5);
                                                                                        columnIndex9 = cursorQuery.getColumnIndex("_size");
                                                                                        cursorQuery.getColumnIndex(str7);
                                                                                        while (cursorQuery.moveToNext()) {
                                                                                            string2 = cursorQuery.getString(columnIndex4);
                                                                                            if (TextUtils.isEmpty(string2)) {
                                                                                                int i218 = cursorQuery.getInt(columnIndex);
                                                                                                i13 = cursorQuery.getInt(columnIndex2);
                                                                                                string3 = cursorQuery.getString(columnIndex3);
                                                                                                int i219 = columnIndex;
                                                                                                int i2110 = columnIndex9;
                                                                                                photoEntry = new PhotoEntry(i13, i218, cursorQuery.getLong(columnIndex5), string2, 0, (int) (cursorQuery.getLong(columnIndex6) / 1000), true, cursorQuery.getInt(columnIndex7), cursorQuery.getInt(columnIndex8), cursorQuery.getLong(columnIndex9));
                                                                                                int i2111 = columnIndex5;
                                                                                                if (albumEntry13 == null) {
                                                                                                    arrayList2 = arrayList;
                                                                                                    albumEntry4 = new AlbumEntry(0, LocaleController.getString(R.string.AllVideos), photoEntry);
                                                                                                    i14 = 1;
                                                                                                    albumEntry4.videoOnly = true;
                                                                                                    if (albumEntry2 != null) {
                                                                                                        i14 = 0;
                                                                                                    }
                                                                                                    if (albumEntry3 != null) {
                                                                                                        i14++;
                                                                                                    }
                                                                                                    arrayList5.add(i14, albumEntry4);
                                                                                                } else {
                                                                                                    arrayList2 = arrayList;
                                                                                                    albumEntry4 = albumEntry13;
                                                                                                }
                                                                                                if (albumEntry2 == null) {
                                                                                                    albumEntry5 = new AlbumEntry(0, LocaleController.getString(R.string.AllMedia), photoEntry);
                                                                                                    arrayList5.add(0, albumEntry5);
                                                                                                } else {
                                                                                                    albumEntry5 = albumEntry2;
                                                                                                }
                                                                                                albumEntry4.addPhoto(photoEntry);
                                                                                                albumEntry5.addPhoto(photoEntry);
                                                                                                albumEntry6 = (AlbumEntry) sparseArray3.get(i13);
                                                                                                if (albumEntry6 == null) {
                                                                                                    albumEntry6 = new AlbumEntry(i13, string3, photoEntry);
                                                                                                    sparseArray3.put(i13, albumEntry6);
                                                                                                    if (objValueOf == null) {
                                                                                                        arrayList5.add(albumEntry6);
                                                                                                    } else {
                                                                                                        arrayList5.add(albumEntry6);
                                                                                                    }
                                                                                                }
                                                                                                albumEntry6.addPhoto(photoEntry);
                                                                                                albumEntry13 = albumEntry4;
                                                                                                albumEntry2 = albumEntry5;
                                                                                                columnIndex = i219;
                                                                                                columnIndex5 = i2111;
                                                                                                columnIndex2 = columnIndex2;
                                                                                                columnIndex4 = columnIndex4;
                                                                                                columnIndex3 = columnIndex3;
                                                                                                columnIndex9 = i2110;
                                                                                                arrayList = arrayList2;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    arrayList2 = arrayList;
                                                                                    if (cursorQuery != null) {
                                                                                        cursorQuery.close();
                                                                                    }
                                                                                } else {
                                                                                    ContentResolver contentResolver7 = ApplicationLoader.applicationContext.getContentResolver();
                                                                                    Uri uri7 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                                                                                    String[] strArr7 = projectionVideo;
                                                                                    StringBuilder sb9 = new StringBuilder();
                                                                                    if (i12 > 28) {
                                                                                        str = "date_modified";
                                                                                    } else {
                                                                                        str = "datetaken";
                                                                                    }
                                                                                    sb9.append(str);
                                                                                    sb9.append(" DESC");
                                                                                    cursorQuery = MediaStore.Images.Media.query(contentResolver7, uri7, strArr7, null, null, sb9.toString());
                                                                                    if (cursorQuery != null) {
                                                                                        columnIndex = cursorQuery.getColumnIndex(str11);
                                                                                        columnIndex2 = cursorQuery.getColumnIndex(str10);
                                                                                        columnIndex3 = cursorQuery.getColumnIndex(str9);
                                                                                        columnIndex4 = cursorQuery.getColumnIndex(str8);
                                                                                        if (i12 > 28) {
                                                                                            str2 = "date_modified";
                                                                                        } else {
                                                                                            str2 = "datetaken";
                                                                                        }
                                                                                        columnIndex5 = cursorQuery.getColumnIndex(str2);
                                                                                        columnIndex6 = cursorQuery.getColumnIndex("duration");
                                                                                        columnIndex7 = cursorQuery.getColumnIndex(str6);
                                                                                        columnIndex8 = cursorQuery.getColumnIndex(str5);
                                                                                        columnIndex9 = cursorQuery.getColumnIndex("_size");
                                                                                        cursorQuery.getColumnIndex(str7);
                                                                                        while (cursorQuery.moveToNext()) {
                                                                                            string2 = cursorQuery.getString(columnIndex4);
                                                                                            if (TextUtils.isEmpty(string2)) {
                                                                                                int i2112 = cursorQuery.getInt(columnIndex);
                                                                                                i13 = cursorQuery.getInt(columnIndex2);
                                                                                                string3 = cursorQuery.getString(columnIndex3);
                                                                                                int i2113 = columnIndex;
                                                                                                int i2114 = columnIndex9;
                                                                                                photoEntry = new PhotoEntry(i13, i2112, cursorQuery.getLong(columnIndex5), string2, 0, (int) (cursorQuery.getLong(columnIndex6) / 1000), true, cursorQuery.getInt(columnIndex7), cursorQuery.getInt(columnIndex8), cursorQuery.getLong(columnIndex9));
                                                                                                int i2115 = columnIndex5;
                                                                                                if (albumEntry13 == null) {
                                                                                                    arrayList2 = arrayList;
                                                                                                    albumEntry4 = new AlbumEntry(0, LocaleController.getString(R.string.AllVideos), photoEntry);
                                                                                                    i14 = 1;
                                                                                                    albumEntry4.videoOnly = true;
                                                                                                    if (albumEntry2 != null) {
                                                                                                        i14 = 0;
                                                                                                    }
                                                                                                    if (albumEntry3 != null) {
                                                                                                        i14++;
                                                                                                    }
                                                                                                    arrayList5.add(i14, albumEntry4);
                                                                                                } else {
                                                                                                    arrayList2 = arrayList;
                                                                                                    albumEntry4 = albumEntry13;
                                                                                                }
                                                                                                if (albumEntry2 == null) {
                                                                                                    albumEntry5 = new AlbumEntry(0, LocaleController.getString(R.string.AllMedia), photoEntry);
                                                                                                    arrayList5.add(0, albumEntry5);
                                                                                                } else {
                                                                                                    albumEntry5 = albumEntry2;
                                                                                                }
                                                                                                albumEntry4.addPhoto(photoEntry);
                                                                                                albumEntry5.addPhoto(photoEntry);
                                                                                                albumEntry6 = (AlbumEntry) sparseArray3.get(i13);
                                                                                                if (albumEntry6 == null) {
                                                                                                    albumEntry6 = new AlbumEntry(i13, string3, photoEntry);
                                                                                                    sparseArray3.put(i13, albumEntry6);
                                                                                                    if (objValueOf == null) {
                                                                                                        arrayList5.add(albumEntry6);
                                                                                                    } else {
                                                                                                        arrayList5.add(albumEntry6);
                                                                                                    }
                                                                                                }
                                                                                                albumEntry6.addPhoto(photoEntry);
                                                                                                albumEntry13 = albumEntry4;
                                                                                                albumEntry2 = albumEntry5;
                                                                                                columnIndex = i2113;
                                                                                                columnIndex5 = i2115;
                                                                                                columnIndex2 = columnIndex2;
                                                                                                columnIndex4 = columnIndex4;
                                                                                                columnIndex3 = columnIndex3;
                                                                                                columnIndex9 = i2114;
                                                                                                arrayList = arrayList2;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    arrayList2 = arrayList;
                                                                                    if (cursorQuery != null) {
                                                                                        cursorQuery.close();
                                                                                    }
                                                                                }
                                                                                AlbumEntry albumEntry112 = albumEntry13;
                                                                                AlbumEntry albumEntry113 = albumEntry2;
                                                                                Integer num5 = objValueOf;
                                                                                while (i11 < arrayList5.size()) {
                                                                                    Collections.sort(((AlbumEntry) arrayList5.get(i11)).photos, new q(6));
                                                                                }
                                                                                broadcastNewPhotos(i10, arrayList5, arrayList2, num5, albumEntry113, albumEntry3, albumEntry112, 0);
                                                                            }
                                                                        }
                                                                        try {
                                                                            albumEntry7.addPhoto(photoEntry2);
                                                                            albumEntry8.addPhoto(photoEntry2);
                                                                            sparseArray3 = sparseArray3;
                                                                            try {
                                                                                albumEntry11 = (AlbumEntry) sparseArray3.get(i15);
                                                                                if (albumEntry11 == null) {
                                                                                    albumEntry11 = new AlbumEntry(i15, string5, photoEntry2);
                                                                                    sparseArray3.put(i15, albumEntry11);
                                                                                    if (objValueOf == null || string == null || string4 == null) {
                                                                                        albumEntry9 = albumEntry7;
                                                                                        string = string;
                                                                                    } else {
                                                                                        albumEntry9 = albumEntry7;
                                                                                        string = string;
                                                                                        try {
                                                                                            if (string4.startsWith(string)) {
                                                                                                albumEntry10 = albumEntry8;
                                                                                                try {
                                                                                                    arrayList5.add(0, albumEntry11);
                                                                                                    objValueOf = Integer.valueOf(i15);
                                                                                                } catch (Throwable th12) {
                                                                                                    th = th12;
                                                                                                    cursorQuery = cursor;
                                                                                                    albumEntry = albumEntry9;
                                                                                                    albumEntry2 = albumEntry10;
                                                                                                    FileLog.e(th);
                                                                                                    if (cursorQuery != null) {
                                                                                                        cursorQuery.close();
                                                                                                    }
                                                                                                    albumEntry3 = albumEntry;
                                                                                                    Context context5 = ApplicationLoader.applicationContext;
                                                                                                    i12 = Build.VERSION.SDK_INT;
                                                                                                    if (i12 >= 23) {
                                                                                                        ContentResolver contentResolver8 = ApplicationLoader.applicationContext.getContentResolver();
                                                                                                        Uri uri8 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                                                                                                        String[] strArr8 = projectionVideo;
                                                                                                        StringBuilder sb10 = new StringBuilder();
                                                                                                        if (i12 > 28) {
                                                                                                            str = "date_modified";
                                                                                                        } else {
                                                                                                            str = "datetaken";
                                                                                                        }
                                                                                                        sb10.append(str);
                                                                                                        sb10.append(" DESC");
                                                                                                        cursorQuery = MediaStore.Images.Media.query(contentResolver8, uri8, strArr8, null, null, sb10.toString());
                                                                                                        if (cursorQuery != null) {
                                                                                                            columnIndex = cursorQuery.getColumnIndex(str11);
                                                                                                            columnIndex2 = cursorQuery.getColumnIndex(str10);
                                                                                                            columnIndex3 = cursorQuery.getColumnIndex(str9);
                                                                                                            columnIndex4 = cursorQuery.getColumnIndex(str8);
                                                                                                            if (i12 > 28) {
                                                                                                                str2 = "date_modified";
                                                                                                            } else {
                                                                                                                str2 = "datetaken";
                                                                                                            }
                                                                                                            columnIndex5 = cursorQuery.getColumnIndex(str2);
                                                                                                            columnIndex6 = cursorQuery.getColumnIndex("duration");
                                                                                                            columnIndex7 = cursorQuery.getColumnIndex(str6);
                                                                                                            columnIndex8 = cursorQuery.getColumnIndex(str5);
                                                                                                            columnIndex9 = cursorQuery.getColumnIndex("_size");
                                                                                                            cursorQuery.getColumnIndex(str7);
                                                                                                            while (cursorQuery.moveToNext()) {
                                                                                                                string2 = cursorQuery.getString(columnIndex4);
                                                                                                                if (TextUtils.isEmpty(string2)) {
                                                                                                                    int i2116 = cursorQuery.getInt(columnIndex);
                                                                                                                    i13 = cursorQuery.getInt(columnIndex2);
                                                                                                                    string3 = cursorQuery.getString(columnIndex3);
                                                                                                                    int i2117 = columnIndex;
                                                                                                                    int i2118 = columnIndex9;
                                                                                                                    photoEntry = new PhotoEntry(i13, i2116, cursorQuery.getLong(columnIndex5), string2, 0, (int) (cursorQuery.getLong(columnIndex6) / 1000), true, cursorQuery.getInt(columnIndex7), cursorQuery.getInt(columnIndex8), cursorQuery.getLong(columnIndex9));
                                                                                                                    int i2119 = columnIndex5;
                                                                                                                    if (albumEntry13 == null) {
                                                                                                                        arrayList2 = arrayList;
                                                                                                                        albumEntry4 = new AlbumEntry(0, LocaleController.getString(R.string.AllVideos), photoEntry);
                                                                                                                        i14 = 1;
                                                                                                                        albumEntry4.videoOnly = true;
                                                                                                                        if (albumEntry2 != null) {
                                                                                                                            i14 = 0;
                                                                                                                        }
                                                                                                                        if (albumEntry3 != null) {
                                                                                                                            i14++;
                                                                                                                        }
                                                                                                                        arrayList5.add(i14, albumEntry4);
                                                                                                                    } else {
                                                                                                                        arrayList2 = arrayList;
                                                                                                                        albumEntry4 = albumEntry13;
                                                                                                                    }
                                                                                                                    if (albumEntry2 == null) {
                                                                                                                        albumEntry5 = new AlbumEntry(0, LocaleController.getString(R.string.AllMedia), photoEntry);
                                                                                                                        arrayList5.add(0, albumEntry5);
                                                                                                                    } else {
                                                                                                                        albumEntry5 = albumEntry2;
                                                                                                                    }
                                                                                                                    albumEntry4.addPhoto(photoEntry);
                                                                                                                    albumEntry5.addPhoto(photoEntry);
                                                                                                                    albumEntry6 = (AlbumEntry) sparseArray3.get(i13);
                                                                                                                    if (albumEntry6 == null) {
                                                                                                                        albumEntry6 = new AlbumEntry(i13, string3, photoEntry);
                                                                                                                        sparseArray3.put(i13, albumEntry6);
                                                                                                                        if (objValueOf == null) {
                                                                                                                            arrayList5.add(albumEntry6);
                                                                                                                        } else {
                                                                                                                            arrayList5.add(albumEntry6);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    albumEntry6.addPhoto(photoEntry);
                                                                                                                    albumEntry13 = albumEntry4;
                                                                                                                    albumEntry2 = albumEntry5;
                                                                                                                    columnIndex = i2117;
                                                                                                                    columnIndex5 = i2119;
                                                                                                                    columnIndex2 = columnIndex2;
                                                                                                                    columnIndex4 = columnIndex4;
                                                                                                                    columnIndex3 = columnIndex3;
                                                                                                                    columnIndex9 = i2118;
                                                                                                                    arrayList = arrayList2;
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        arrayList2 = arrayList;
                                                                                                        if (cursorQuery != null) {
                                                                                                            cursorQuery.close();
                                                                                                        }
                                                                                                    } else {
                                                                                                        ContentResolver contentResolver9 = ApplicationLoader.applicationContext.getContentResolver();
                                                                                                        Uri uri9 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                                                                                                        String[] strArr9 = projectionVideo;
                                                                                                        StringBuilder sb11 = new StringBuilder();
                                                                                                        if (i12 > 28) {
                                                                                                            str = "date_modified";
                                                                                                        } else {
                                                                                                            str = "datetaken";
                                                                                                        }
                                                                                                        sb11.append(str);
                                                                                                        sb11.append(" DESC");
                                                                                                        cursorQuery = MediaStore.Images.Media.query(contentResolver9, uri9, strArr9, null, null, sb11.toString());
                                                                                                        if (cursorQuery != null) {
                                                                                                            columnIndex = cursorQuery.getColumnIndex(str11);
                                                                                                            columnIndex2 = cursorQuery.getColumnIndex(str10);
                                                                                                            columnIndex3 = cursorQuery.getColumnIndex(str9);
                                                                                                            columnIndex4 = cursorQuery.getColumnIndex(str8);
                                                                                                            if (i12 > 28) {
                                                                                                                str2 = "date_modified";
                                                                                                            } else {
                                                                                                                str2 = "datetaken";
                                                                                                            }
                                                                                                            columnIndex5 = cursorQuery.getColumnIndex(str2);
                                                                                                            columnIndex6 = cursorQuery.getColumnIndex("duration");
                                                                                                            columnIndex7 = cursorQuery.getColumnIndex(str6);
                                                                                                            columnIndex8 = cursorQuery.getColumnIndex(str5);
                                                                                                            columnIndex9 = cursorQuery.getColumnIndex("_size");
                                                                                                            cursorQuery.getColumnIndex(str7);
                                                                                                            while (cursorQuery.moveToNext()) {
                                                                                                                string2 = cursorQuery.getString(columnIndex4);
                                                                                                                if (TextUtils.isEmpty(string2)) {
                                                                                                                    int i21110 = cursorQuery.getInt(columnIndex);
                                                                                                                    i13 = cursorQuery.getInt(columnIndex2);
                                                                                                                    string3 = cursorQuery.getString(columnIndex3);
                                                                                                                    int i21111 = columnIndex;
                                                                                                                    int i21112 = columnIndex9;
                                                                                                                    photoEntry = new PhotoEntry(i13, i21110, cursorQuery.getLong(columnIndex5), string2, 0, (int) (cursorQuery.getLong(columnIndex6) / 1000), true, cursorQuery.getInt(columnIndex7), cursorQuery.getInt(columnIndex8), cursorQuery.getLong(columnIndex9));
                                                                                                                    int i21113 = columnIndex5;
                                                                                                                    if (albumEntry13 == null) {
                                                                                                                        arrayList2 = arrayList;
                                                                                                                        albumEntry4 = new AlbumEntry(0, LocaleController.getString(R.string.AllVideos), photoEntry);
                                                                                                                        i14 = 1;
                                                                                                                        albumEntry4.videoOnly = true;
                                                                                                                        if (albumEntry2 != null) {
                                                                                                                            i14 = 0;
                                                                                                                        }
                                                                                                                        if (albumEntry3 != null) {
                                                                                                                            i14++;
                                                                                                                        }
                                                                                                                        arrayList5.add(i14, albumEntry4);
                                                                                                                    } else {
                                                                                                                        arrayList2 = arrayList;
                                                                                                                        albumEntry4 = albumEntry13;
                                                                                                                    }
                                                                                                                    if (albumEntry2 == null) {
                                                                                                                        albumEntry5 = new AlbumEntry(0, LocaleController.getString(R.string.AllMedia), photoEntry);
                                                                                                                        arrayList5.add(0, albumEntry5);
                                                                                                                    } else {
                                                                                                                        albumEntry5 = albumEntry2;
                                                                                                                    }
                                                                                                                    albumEntry4.addPhoto(photoEntry);
                                                                                                                    albumEntry5.addPhoto(photoEntry);
                                                                                                                    albumEntry6 = (AlbumEntry) sparseArray3.get(i13);
                                                                                                                    if (albumEntry6 == null) {
                                                                                                                        albumEntry6 = new AlbumEntry(i13, string3, photoEntry);
                                                                                                                        sparseArray3.put(i13, albumEntry6);
                                                                                                                        if (objValueOf == null) {
                                                                                                                            arrayList5.add(albumEntry6);
                                                                                                                        } else {
                                                                                                                            arrayList5.add(albumEntry6);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    albumEntry6.addPhoto(photoEntry);
                                                                                                                    albumEntry13 = albumEntry4;
                                                                                                                    albumEntry2 = albumEntry5;
                                                                                                                    columnIndex = i21111;
                                                                                                                    columnIndex5 = i21113;
                                                                                                                    columnIndex2 = columnIndex2;
                                                                                                                    columnIndex4 = columnIndex4;
                                                                                                                    columnIndex3 = columnIndex3;
                                                                                                                    columnIndex9 = i21112;
                                                                                                                    arrayList = arrayList2;
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        arrayList2 = arrayList;
                                                                                                        if (cursorQuery != null) {
                                                                                                            cursorQuery.close();
                                                                                                        }
                                                                                                    }
                                                                                                    AlbumEntry albumEntry114 = albumEntry13;
                                                                                                    AlbumEntry albumEntry115 = albumEntry2;
                                                                                                    Integer num6 = objValueOf;
                                                                                                    while (i11 < arrayList5.size()) {
                                                                                                        Collections.sort(((AlbumEntry) arrayList5.get(i11)).photos, new q(6));
                                                                                                    }
                                                                                                    broadcastNewPhotos(i10, arrayList5, arrayList2, num6, albumEntry115, albumEntry3, albumEntry114, 0);
                                                                                                }
                                                                                            }
                                                                                        } catch (Throwable th13) {
                                                                                            th = th13;
                                                                                            albumEntry10 = albumEntry8;
                                                                                            cursorQuery = cursor;
                                                                                            albumEntry = albumEntry9;
                                                                                            albumEntry2 = albumEntry10;
                                                                                            FileLog.e(th);
                                                                                            if (cursorQuery != null) {
                                                                                                cursorQuery.close();
                                                                                            }
                                                                                            albumEntry3 = albumEntry;
                                                                                            Context context6 = ApplicationLoader.applicationContext;
                                                                                            i12 = Build.VERSION.SDK_INT;
                                                                                            if (i12 >= 23) {
                                                                                                ContentResolver contentResolver10 = ApplicationLoader.applicationContext.getContentResolver();
                                                                                                Uri uri10 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                                                                                                String[] strArr10 = projectionVideo;
                                                                                                StringBuilder sb12 = new StringBuilder();
                                                                                                if (i12 > 28) {
                                                                                                    str = "date_modified";
                                                                                                } else {
                                                                                                    str = "datetaken";
                                                                                                }
                                                                                                sb12.append(str);
                                                                                                sb12.append(" DESC");
                                                                                                cursorQuery = MediaStore.Images.Media.query(contentResolver10, uri10, strArr10, null, null, sb12.toString());
                                                                                                if (cursorQuery != null) {
                                                                                                    columnIndex = cursorQuery.getColumnIndex(str11);
                                                                                                    columnIndex2 = cursorQuery.getColumnIndex(str10);
                                                                                                    columnIndex3 = cursorQuery.getColumnIndex(str9);
                                                                                                    columnIndex4 = cursorQuery.getColumnIndex(str8);
                                                                                                    if (i12 > 28) {
                                                                                                        str2 = "date_modified";
                                                                                                    } else {
                                                                                                        str2 = "datetaken";
                                                                                                    }
                                                                                                    columnIndex5 = cursorQuery.getColumnIndex(str2);
                                                                                                    columnIndex6 = cursorQuery.getColumnIndex("duration");
                                                                                                    columnIndex7 = cursorQuery.getColumnIndex(str6);
                                                                                                    columnIndex8 = cursorQuery.getColumnIndex(str5);
                                                                                                    columnIndex9 = cursorQuery.getColumnIndex("_size");
                                                                                                    cursorQuery.getColumnIndex(str7);
                                                                                                    while (cursorQuery.moveToNext()) {
                                                                                                        string2 = cursorQuery.getString(columnIndex4);
                                                                                                        if (TextUtils.isEmpty(string2)) {
                                                                                                            int i21114 = cursorQuery.getInt(columnIndex);
                                                                                                            i13 = cursorQuery.getInt(columnIndex2);
                                                                                                            string3 = cursorQuery.getString(columnIndex3);
                                                                                                            int i21115 = columnIndex;
                                                                                                            int i21116 = columnIndex9;
                                                                                                            photoEntry = new PhotoEntry(i13, i21114, cursorQuery.getLong(columnIndex5), string2, 0, (int) (cursorQuery.getLong(columnIndex6) / 1000), true, cursorQuery.getInt(columnIndex7), cursorQuery.getInt(columnIndex8), cursorQuery.getLong(columnIndex9));
                                                                                                            int i21117 = columnIndex5;
                                                                                                            if (albumEntry13 == null) {
                                                                                                                arrayList2 = arrayList;
                                                                                                                albumEntry4 = new AlbumEntry(0, LocaleController.getString(R.string.AllVideos), photoEntry);
                                                                                                                i14 = 1;
                                                                                                                albumEntry4.videoOnly = true;
                                                                                                                if (albumEntry2 != null) {
                                                                                                                    i14 = 0;
                                                                                                                }
                                                                                                                if (albumEntry3 != null) {
                                                                                                                    i14++;
                                                                                                                }
                                                                                                                arrayList5.add(i14, albumEntry4);
                                                                                                            } else {
                                                                                                                arrayList2 = arrayList;
                                                                                                                albumEntry4 = albumEntry13;
                                                                                                            }
                                                                                                            if (albumEntry2 == null) {
                                                                                                                albumEntry5 = new AlbumEntry(0, LocaleController.getString(R.string.AllMedia), photoEntry);
                                                                                                                arrayList5.add(0, albumEntry5);
                                                                                                            } else {
                                                                                                                albumEntry5 = albumEntry2;
                                                                                                            }
                                                                                                            albumEntry4.addPhoto(photoEntry);
                                                                                                            albumEntry5.addPhoto(photoEntry);
                                                                                                            albumEntry6 = (AlbumEntry) sparseArray3.get(i13);
                                                                                                            if (albumEntry6 == null) {
                                                                                                                albumEntry6 = new AlbumEntry(i13, string3, photoEntry);
                                                                                                                sparseArray3.put(i13, albumEntry6);
                                                                                                                if (objValueOf == null) {
                                                                                                                    arrayList5.add(albumEntry6);
                                                                                                                } else {
                                                                                                                    arrayList5.add(albumEntry6);
                                                                                                                }
                                                                                                            }
                                                                                                            albumEntry6.addPhoto(photoEntry);
                                                                                                            albumEntry13 = albumEntry4;
                                                                                                            albumEntry2 = albumEntry5;
                                                                                                            columnIndex = i21115;
                                                                                                            columnIndex5 = i21117;
                                                                                                            columnIndex2 = columnIndex2;
                                                                                                            columnIndex4 = columnIndex4;
                                                                                                            columnIndex3 = columnIndex3;
                                                                                                            columnIndex9 = i21116;
                                                                                                            arrayList = arrayList2;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                arrayList2 = arrayList;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                            } else {
                                                                                                ContentResolver contentResolver11 = ApplicationLoader.applicationContext.getContentResolver();
                                                                                                Uri uri11 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                                                                                                String[] strArr11 = projectionVideo;
                                                                                                StringBuilder sb13 = new StringBuilder();
                                                                                                if (i12 > 28) {
                                                                                                    str = "date_modified";
                                                                                                } else {
                                                                                                    str = "datetaken";
                                                                                                }
                                                                                                sb13.append(str);
                                                                                                sb13.append(" DESC");
                                                                                                cursorQuery = MediaStore.Images.Media.query(contentResolver11, uri11, strArr11, null, null, sb13.toString());
                                                                                                if (cursorQuery != null) {
                                                                                                    columnIndex = cursorQuery.getColumnIndex(str11);
                                                                                                    columnIndex2 = cursorQuery.getColumnIndex(str10);
                                                                                                    columnIndex3 = cursorQuery.getColumnIndex(str9);
                                                                                                    columnIndex4 = cursorQuery.getColumnIndex(str8);
                                                                                                    if (i12 > 28) {
                                                                                                        str2 = "date_modified";
                                                                                                    } else {
                                                                                                        str2 = "datetaken";
                                                                                                    }
                                                                                                    columnIndex5 = cursorQuery.getColumnIndex(str2);
                                                                                                    columnIndex6 = cursorQuery.getColumnIndex("duration");
                                                                                                    columnIndex7 = cursorQuery.getColumnIndex(str6);
                                                                                                    columnIndex8 = cursorQuery.getColumnIndex(str5);
                                                                                                    columnIndex9 = cursorQuery.getColumnIndex("_size");
                                                                                                    cursorQuery.getColumnIndex(str7);
                                                                                                    while (cursorQuery.moveToNext()) {
                                                                                                        string2 = cursorQuery.getString(columnIndex4);
                                                                                                        if (TextUtils.isEmpty(string2)) {
                                                                                                            int i21118 = cursorQuery.getInt(columnIndex);
                                                                                                            i13 = cursorQuery.getInt(columnIndex2);
                                                                                                            string3 = cursorQuery.getString(columnIndex3);
                                                                                                            int i21119 = columnIndex;
                                                                                                            int i211110 = columnIndex9;
                                                                                                            photoEntry = new PhotoEntry(i13, i21118, cursorQuery.getLong(columnIndex5), string2, 0, (int) (cursorQuery.getLong(columnIndex6) / 1000), true, cursorQuery.getInt(columnIndex7), cursorQuery.getInt(columnIndex8), cursorQuery.getLong(columnIndex9));
                                                                                                            int i211111 = columnIndex5;
                                                                                                            if (albumEntry13 == null) {
                                                                                                                arrayList2 = arrayList;
                                                                                                                albumEntry4 = new AlbumEntry(0, LocaleController.getString(R.string.AllVideos), photoEntry);
                                                                                                                i14 = 1;
                                                                                                                albumEntry4.videoOnly = true;
                                                                                                                if (albumEntry2 != null) {
                                                                                                                    i14 = 0;
                                                                                                                }
                                                                                                                if (albumEntry3 != null) {
                                                                                                                    i14++;
                                                                                                                }
                                                                                                                arrayList5.add(i14, albumEntry4);
                                                                                                            } else {
                                                                                                                arrayList2 = arrayList;
                                                                                                                albumEntry4 = albumEntry13;
                                                                                                            }
                                                                                                            if (albumEntry2 == null) {
                                                                                                                albumEntry5 = new AlbumEntry(0, LocaleController.getString(R.string.AllMedia), photoEntry);
                                                                                                                arrayList5.add(0, albumEntry5);
                                                                                                            } else {
                                                                                                                albumEntry5 = albumEntry2;
                                                                                                            }
                                                                                                            albumEntry4.addPhoto(photoEntry);
                                                                                                            albumEntry5.addPhoto(photoEntry);
                                                                                                            albumEntry6 = (AlbumEntry) sparseArray3.get(i13);
                                                                                                            if (albumEntry6 == null) {
                                                                                                                albumEntry6 = new AlbumEntry(i13, string3, photoEntry);
                                                                                                                sparseArray3.put(i13, albumEntry6);
                                                                                                                if (objValueOf == null) {
                                                                                                                    arrayList5.add(albumEntry6);
                                                                                                                } else {
                                                                                                                    arrayList5.add(albumEntry6);
                                                                                                                }
                                                                                                            }
                                                                                                            albumEntry6.addPhoto(photoEntry);
                                                                                                            albumEntry13 = albumEntry4;
                                                                                                            albumEntry2 = albumEntry5;
                                                                                                            columnIndex = i21119;
                                                                                                            columnIndex5 = i211111;
                                                                                                            columnIndex2 = columnIndex2;
                                                                                                            columnIndex4 = columnIndex4;
                                                                                                            columnIndex3 = columnIndex3;
                                                                                                            columnIndex9 = i211110;
                                                                                                            arrayList = arrayList2;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                arrayList2 = arrayList;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                            }
                                                                                            AlbumEntry albumEntry116 = albumEntry13;
                                                                                            AlbumEntry albumEntry117 = albumEntry2;
                                                                                            Integer num7 = objValueOf;
                                                                                            while (i11 < arrayList5.size()) {
                                                                                                Collections.sort(((AlbumEntry) arrayList5.get(i11)).photos, new q(6));
                                                                                            }
                                                                                            broadcastNewPhotos(i10, arrayList5, arrayList2, num7, albumEntry117, albumEntry3, albumEntry116, 0);
                                                                                        }
                                                                                    }
                                                                                    albumEntry10 = albumEntry8;
                                                                                    arrayList5.add(albumEntry11);
                                                                                } else {
                                                                                    albumEntry9 = albumEntry7;
                                                                                    string = string;
                                                                                    albumEntry10 = albumEntry8;
                                                                                }
                                                                                albumEntry11.addPhoto(photoEntry2);
                                                                                sparseArray2 = sparseArray;
                                                                                albumEntry12 = (AlbumEntry) sparseArray2.get(i15);
                                                                                if (albumEntry12 == null) {
                                                                                    albumEntry12 = new AlbumEntry(i15, string5, photoEntry2);
                                                                                    sparseArray2.put(i15, albumEntry12);
                                                                                    if (numValueOf == null || string == null || string4 == null || !string4.startsWith(string)) {
                                                                                        arrayList.add(albumEntry12);
                                                                                    } else {
                                                                                        arrayList.add(0, albumEntry12);
                                                                                        numValueOf = Integer.valueOf(i15);
                                                                                    }
                                                                                }
                                                                                albumEntry12.addPhoto(photoEntry2);
                                                                                sparseArray = sparseArray2;
                                                                                cursorQuery = cursor;
                                                                                albumEntry = albumEntry9;
                                                                                albumEntry2 = albumEntry10;
                                                                                columnIndex10 = i18;
                                                                                columnIndex17 = i19;
                                                                                columnIndex16 = i20;
                                                                                columnIndex18 = i21;
                                                                                columnIndex12 = columnIndex12;
                                                                                string = string;
                                                                                arrayList5 = arrayList5;
                                                                                sparseArray3 = sparseArray3;
                                                                                columnIndex15 = columnIndex15;
                                                                                columnIndex14 = columnIndex14;
                                                                                columnIndex11 = columnIndex11;
                                                                                arrayList6 = arrayList;
                                                                                columnIndex13 = columnIndex13;
                                                                            } catch (Throwable th14) {
                                                                                th = th14;
                                                                                albumEntry9 = albumEntry7;
                                                                                string = string;
                                                                                albumEntry10 = albumEntry8;
                                                                                cursorQuery = cursor;
                                                                                albumEntry = albumEntry9;
                                                                                albumEntry2 = albumEntry10;
                                                                                FileLog.e(th);
                                                                                if (cursorQuery != null) {
                                                                                    cursorQuery.close();
                                                                                }
                                                                                albumEntry3 = albumEntry;
                                                                                Context context7 = ApplicationLoader.applicationContext;
                                                                                i12 = Build.VERSION.SDK_INT;
                                                                                if (i12 >= 23) {
                                                                                    ContentResolver contentResolver12 = ApplicationLoader.applicationContext.getContentResolver();
                                                                                    Uri uri12 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                                                                                    String[] strArr12 = projectionVideo;
                                                                                    StringBuilder sb14 = new StringBuilder();
                                                                                    if (i12 > 28) {
                                                                                        str = "date_modified";
                                                                                    } else {
                                                                                        str = "datetaken";
                                                                                    }
                                                                                    sb14.append(str);
                                                                                    sb14.append(" DESC");
                                                                                    cursorQuery = MediaStore.Images.Media.query(contentResolver12, uri12, strArr12, null, null, sb14.toString());
                                                                                    if (cursorQuery != null) {
                                                                                        columnIndex = cursorQuery.getColumnIndex(str11);
                                                                                        columnIndex2 = cursorQuery.getColumnIndex(str10);
                                                                                        columnIndex3 = cursorQuery.getColumnIndex(str9);
                                                                                        columnIndex4 = cursorQuery.getColumnIndex(str8);
                                                                                        if (i12 > 28) {
                                                                                            str2 = "date_modified";
                                                                                        } else {
                                                                                            str2 = "datetaken";
                                                                                        }
                                                                                        columnIndex5 = cursorQuery.getColumnIndex(str2);
                                                                                        columnIndex6 = cursorQuery.getColumnIndex("duration");
                                                                                        columnIndex7 = cursorQuery.getColumnIndex(str6);
                                                                                        columnIndex8 = cursorQuery.getColumnIndex(str5);
                                                                                        columnIndex9 = cursorQuery.getColumnIndex("_size");
                                                                                        cursorQuery.getColumnIndex(str7);
                                                                                        while (cursorQuery.moveToNext()) {
                                                                                            string2 = cursorQuery.getString(columnIndex4);
                                                                                            if (TextUtils.isEmpty(string2)) {
                                                                                                int i211112 = cursorQuery.getInt(columnIndex);
                                                                                                i13 = cursorQuery.getInt(columnIndex2);
                                                                                                string3 = cursorQuery.getString(columnIndex3);
                                                                                                int i211113 = columnIndex;
                                                                                                int i211114 = columnIndex9;
                                                                                                photoEntry = new PhotoEntry(i13, i211112, cursorQuery.getLong(columnIndex5), string2, 0, (int) (cursorQuery.getLong(columnIndex6) / 1000), true, cursorQuery.getInt(columnIndex7), cursorQuery.getInt(columnIndex8), cursorQuery.getLong(columnIndex9));
                                                                                                int i211115 = columnIndex5;
                                                                                                if (albumEntry13 == null) {
                                                                                                    arrayList2 = arrayList;
                                                                                                    albumEntry4 = new AlbumEntry(0, LocaleController.getString(R.string.AllVideos), photoEntry);
                                                                                                    i14 = 1;
                                                                                                    albumEntry4.videoOnly = true;
                                                                                                    if (albumEntry2 != null) {
                                                                                                        i14 = 0;
                                                                                                    }
                                                                                                    if (albumEntry3 != null) {
                                                                                                        i14++;
                                                                                                    }
                                                                                                    arrayList5.add(i14, albumEntry4);
                                                                                                } else {
                                                                                                    arrayList2 = arrayList;
                                                                                                    albumEntry4 = albumEntry13;
                                                                                                }
                                                                                                if (albumEntry2 == null) {
                                                                                                    albumEntry5 = new AlbumEntry(0, LocaleController.getString(R.string.AllMedia), photoEntry);
                                                                                                    arrayList5.add(0, albumEntry5);
                                                                                                } else {
                                                                                                    albumEntry5 = albumEntry2;
                                                                                                }
                                                                                                albumEntry4.addPhoto(photoEntry);
                                                                                                albumEntry5.addPhoto(photoEntry);
                                                                                                albumEntry6 = (AlbumEntry) sparseArray3.get(i13);
                                                                                                if (albumEntry6 == null) {
                                                                                                    albumEntry6 = new AlbumEntry(i13, string3, photoEntry);
                                                                                                    sparseArray3.put(i13, albumEntry6);
                                                                                                    if (objValueOf == null) {
                                                                                                        arrayList5.add(albumEntry6);
                                                                                                    } else {
                                                                                                        arrayList5.add(albumEntry6);
                                                                                                    }
                                                                                                }
                                                                                                albumEntry6.addPhoto(photoEntry);
                                                                                                albumEntry13 = albumEntry4;
                                                                                                albumEntry2 = albumEntry5;
                                                                                                columnIndex = i211113;
                                                                                                columnIndex5 = i211115;
                                                                                                columnIndex2 = columnIndex2;
                                                                                                columnIndex4 = columnIndex4;
                                                                                                columnIndex3 = columnIndex3;
                                                                                                columnIndex9 = i211114;
                                                                                                arrayList = arrayList2;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    arrayList2 = arrayList;
                                                                                    if (cursorQuery != null) {
                                                                                        cursorQuery.close();
                                                                                    }
                                                                                } else {
                                                                                    ContentResolver contentResolver13 = ApplicationLoader.applicationContext.getContentResolver();
                                                                                    Uri uri13 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                                                                                    String[] strArr13 = projectionVideo;
                                                                                    StringBuilder sb15 = new StringBuilder();
                                                                                    if (i12 > 28) {
                                                                                        str = "date_modified";
                                                                                    } else {
                                                                                        str = "datetaken";
                                                                                    }
                                                                                    sb15.append(str);
                                                                                    sb15.append(" DESC");
                                                                                    cursorQuery = MediaStore.Images.Media.query(contentResolver13, uri13, strArr13, null, null, sb15.toString());
                                                                                    if (cursorQuery != null) {
                                                                                        columnIndex = cursorQuery.getColumnIndex(str11);
                                                                                        columnIndex2 = cursorQuery.getColumnIndex(str10);
                                                                                        columnIndex3 = cursorQuery.getColumnIndex(str9);
                                                                                        columnIndex4 = cursorQuery.getColumnIndex(str8);
                                                                                        if (i12 > 28) {
                                                                                            str2 = "date_modified";
                                                                                        } else {
                                                                                            str2 = "datetaken";
                                                                                        }
                                                                                        columnIndex5 = cursorQuery.getColumnIndex(str2);
                                                                                        columnIndex6 = cursorQuery.getColumnIndex("duration");
                                                                                        columnIndex7 = cursorQuery.getColumnIndex(str6);
                                                                                        columnIndex8 = cursorQuery.getColumnIndex(str5);
                                                                                        columnIndex9 = cursorQuery.getColumnIndex("_size");
                                                                                        cursorQuery.getColumnIndex(str7);
                                                                                        while (cursorQuery.moveToNext()) {
                                                                                            string2 = cursorQuery.getString(columnIndex4);
                                                                                            if (TextUtils.isEmpty(string2)) {
                                                                                                int i211116 = cursorQuery.getInt(columnIndex);
                                                                                                i13 = cursorQuery.getInt(columnIndex2);
                                                                                                string3 = cursorQuery.getString(columnIndex3);
                                                                                                int i211117 = columnIndex;
                                                                                                int i211118 = columnIndex9;
                                                                                                photoEntry = new PhotoEntry(i13, i211116, cursorQuery.getLong(columnIndex5), string2, 0, (int) (cursorQuery.getLong(columnIndex6) / 1000), true, cursorQuery.getInt(columnIndex7), cursorQuery.getInt(columnIndex8), cursorQuery.getLong(columnIndex9));
                                                                                                int i211119 = columnIndex5;
                                                                                                if (albumEntry13 == null) {
                                                                                                    arrayList2 = arrayList;
                                                                                                    albumEntry4 = new AlbumEntry(0, LocaleController.getString(R.string.AllVideos), photoEntry);
                                                                                                    i14 = 1;
                                                                                                    albumEntry4.videoOnly = true;
                                                                                                    if (albumEntry2 != null) {
                                                                                                        i14 = 0;
                                                                                                    }
                                                                                                    if (albumEntry3 != null) {
                                                                                                        i14++;
                                                                                                    }
                                                                                                    arrayList5.add(i14, albumEntry4);
                                                                                                } else {
                                                                                                    arrayList2 = arrayList;
                                                                                                    albumEntry4 = albumEntry13;
                                                                                                }
                                                                                                if (albumEntry2 == null) {
                                                                                                    albumEntry5 = new AlbumEntry(0, LocaleController.getString(R.string.AllMedia), photoEntry);
                                                                                                    arrayList5.add(0, albumEntry5);
                                                                                                } else {
                                                                                                    albumEntry5 = albumEntry2;
                                                                                                }
                                                                                                albumEntry4.addPhoto(photoEntry);
                                                                                                albumEntry5.addPhoto(photoEntry);
                                                                                                albumEntry6 = (AlbumEntry) sparseArray3.get(i13);
                                                                                                if (albumEntry6 == null) {
                                                                                                    albumEntry6 = new AlbumEntry(i13, string3, photoEntry);
                                                                                                    sparseArray3.put(i13, albumEntry6);
                                                                                                    if (objValueOf == null) {
                                                                                                        arrayList5.add(albumEntry6);
                                                                                                    } else {
                                                                                                        arrayList5.add(albumEntry6);
                                                                                                    }
                                                                                                }
                                                                                                albumEntry6.addPhoto(photoEntry);
                                                                                                albumEntry13 = albumEntry4;
                                                                                                albumEntry2 = albumEntry5;
                                                                                                columnIndex = i211117;
                                                                                                columnIndex5 = i211119;
                                                                                                columnIndex2 = columnIndex2;
                                                                                                columnIndex4 = columnIndex4;
                                                                                                columnIndex3 = columnIndex3;
                                                                                                columnIndex9 = i211118;
                                                                                                arrayList = arrayList2;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    arrayList2 = arrayList;
                                                                                    if (cursorQuery != null) {
                                                                                        cursorQuery.close();
                                                                                    }
                                                                                }
                                                                                AlbumEntry albumEntry118 = albumEntry13;
                                                                                AlbumEntry albumEntry119 = albumEntry2;
                                                                                Integer num8 = objValueOf;
                                                                                while (i11 < arrayList5.size()) {
                                                                                    Collections.sort(((AlbumEntry) arrayList5.get(i11)).photos, new q(6));
                                                                                }
                                                                                broadcastNewPhotos(i10, arrayList5, arrayList2, num8, albumEntry119, albumEntry3, albumEntry118, 0);
                                                                            }
                                                                        } catch (Throwable th15) {
                                                                            th = th15;
                                                                            sparseArray3 = sparseArray3;
                                                                        }
                                                                    } catch (Throwable th16) {
                                                                        th = th16;
                                                                        sparseArray3 = sparseArray3;
                                                                        albumEntry9 = albumEntry7;
                                                                        string = string;
                                                                        albumEntry10 = albumEntry8;
                                                                    }
                                                                }
                                                            } catch (Throwable th17) {
                                                                th = th17;
                                                                arrayList5 = arrayList5;
                                                                sparseArray3 = sparseArray3;
                                                                string = string;
                                                                arrayList = arrayList6;
                                                            }
                                                        }
                                                        arrayList5 = arrayList5;
                                                        sparseArray3 = sparseArray3;
                                                        string = string;
                                                        arrayList = arrayList6;
                                                    } catch (Throwable th18) {
                                                        th = th18;
                                                        arrayList5 = arrayList5;
                                                        sparseArray3 = sparseArray3;
                                                        string = string;
                                                        arrayList = arrayList6;
                                                        albumEntry = null;
                                                        albumEntry2 = albumEntry;
                                                        objValueOf = albumEntry2;
                                                        FileLog.e(th);
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        albumEntry3 = albumEntry;
                                                        Context context8 = ApplicationLoader.applicationContext;
                                                        i12 = Build.VERSION.SDK_INT;
                                                        if (i12 >= 23) {
                                                            ContentResolver contentResolver14 = ApplicationLoader.applicationContext.getContentResolver();
                                                            Uri uri14 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                                                            String[] strArr14 = projectionVideo;
                                                            StringBuilder sb16 = new StringBuilder();
                                                            if (i12 > 28) {
                                                                str = "date_modified";
                                                            } else {
                                                                str = "datetaken";
                                                            }
                                                            sb16.append(str);
                                                            sb16.append(" DESC");
                                                            cursorQuery = MediaStore.Images.Media.query(contentResolver14, uri14, strArr14, null, null, sb16.toString());
                                                            if (cursorQuery != null) {
                                                                columnIndex = cursorQuery.getColumnIndex(str11);
                                                                columnIndex2 = cursorQuery.getColumnIndex(str10);
                                                                columnIndex3 = cursorQuery.getColumnIndex(str9);
                                                                columnIndex4 = cursorQuery.getColumnIndex(str8);
                                                                if (i12 > 28) {
                                                                    str2 = "date_modified";
                                                                } else {
                                                                    str2 = "datetaken";
                                                                }
                                                                columnIndex5 = cursorQuery.getColumnIndex(str2);
                                                                columnIndex6 = cursorQuery.getColumnIndex("duration");
                                                                columnIndex7 = cursorQuery.getColumnIndex(str6);
                                                                columnIndex8 = cursorQuery.getColumnIndex(str5);
                                                                columnIndex9 = cursorQuery.getColumnIndex("_size");
                                                                cursorQuery.getColumnIndex(str7);
                                                                while (cursorQuery.moveToNext()) {
                                                                    string2 = cursorQuery.getString(columnIndex4);
                                                                    if (TextUtils.isEmpty(string2)) {
                                                                        int i2111110 = cursorQuery.getInt(columnIndex);
                                                                        i13 = cursorQuery.getInt(columnIndex2);
                                                                        string3 = cursorQuery.getString(columnIndex3);
                                                                        int i2111111 = columnIndex;
                                                                        int i2111112 = columnIndex9;
                                                                        photoEntry = new PhotoEntry(i13, i2111110, cursorQuery.getLong(columnIndex5), string2, 0, (int) (cursorQuery.getLong(columnIndex6) / 1000), true, cursorQuery.getInt(columnIndex7), cursorQuery.getInt(columnIndex8), cursorQuery.getLong(columnIndex9));
                                                                        int i2111113 = columnIndex5;
                                                                        if (albumEntry13 == null) {
                                                                            arrayList2 = arrayList;
                                                                            albumEntry4 = new AlbumEntry(0, LocaleController.getString(R.string.AllVideos), photoEntry);
                                                                            i14 = 1;
                                                                            albumEntry4.videoOnly = true;
                                                                            if (albumEntry2 != null) {
                                                                                i14 = 0;
                                                                            }
                                                                            if (albumEntry3 != null) {
                                                                                i14++;
                                                                            }
                                                                            arrayList5.add(i14, albumEntry4);
                                                                        } else {
                                                                            arrayList2 = arrayList;
                                                                            albumEntry4 = albumEntry13;
                                                                        }
                                                                        if (albumEntry2 == null) {
                                                                            albumEntry5 = new AlbumEntry(0, LocaleController.getString(R.string.AllMedia), photoEntry);
                                                                            arrayList5.add(0, albumEntry5);
                                                                        } else {
                                                                            albumEntry5 = albumEntry2;
                                                                        }
                                                                        albumEntry4.addPhoto(photoEntry);
                                                                        albumEntry5.addPhoto(photoEntry);
                                                                        albumEntry6 = (AlbumEntry) sparseArray3.get(i13);
                                                                        if (albumEntry6 == null) {
                                                                            albumEntry6 = new AlbumEntry(i13, string3, photoEntry);
                                                                            sparseArray3.put(i13, albumEntry6);
                                                                            if (objValueOf == null) {
                                                                                arrayList5.add(albumEntry6);
                                                                            } else {
                                                                                arrayList5.add(albumEntry6);
                                                                            }
                                                                        }
                                                                        albumEntry6.addPhoto(photoEntry);
                                                                        albumEntry13 = albumEntry4;
                                                                        albumEntry2 = albumEntry5;
                                                                        columnIndex = i2111111;
                                                                        columnIndex5 = i2111113;
                                                                        columnIndex2 = columnIndex2;
                                                                        columnIndex4 = columnIndex4;
                                                                        columnIndex3 = columnIndex3;
                                                                        columnIndex9 = i2111112;
                                                                        arrayList = arrayList2;
                                                                    }
                                                                }
                                                            }
                                                            arrayList2 = arrayList;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                        } else {
                                                            ContentResolver contentResolver15 = ApplicationLoader.applicationContext.getContentResolver();
                                                            Uri uri15 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                                                            String[] strArr15 = projectionVideo;
                                                            StringBuilder sb17 = new StringBuilder();
                                                            if (i12 > 28) {
                                                                str = "date_modified";
                                                            } else {
                                                                str = "datetaken";
                                                            }
                                                            sb17.append(str);
                                                            sb17.append(" DESC");
                                                            cursorQuery = MediaStore.Images.Media.query(contentResolver15, uri15, strArr15, null, null, sb17.toString());
                                                            if (cursorQuery != null) {
                                                                columnIndex = cursorQuery.getColumnIndex(str11);
                                                                columnIndex2 = cursorQuery.getColumnIndex(str10);
                                                                columnIndex3 = cursorQuery.getColumnIndex(str9);
                                                                columnIndex4 = cursorQuery.getColumnIndex(str8);
                                                                if (i12 > 28) {
                                                                    str2 = "date_modified";
                                                                } else {
                                                                    str2 = "datetaken";
                                                                }
                                                                columnIndex5 = cursorQuery.getColumnIndex(str2);
                                                                columnIndex6 = cursorQuery.getColumnIndex("duration");
                                                                columnIndex7 = cursorQuery.getColumnIndex(str6);
                                                                columnIndex8 = cursorQuery.getColumnIndex(str5);
                                                                columnIndex9 = cursorQuery.getColumnIndex("_size");
                                                                cursorQuery.getColumnIndex(str7);
                                                                while (cursorQuery.moveToNext()) {
                                                                    string2 = cursorQuery.getString(columnIndex4);
                                                                    if (TextUtils.isEmpty(string2)) {
                                                                        int i2111114 = cursorQuery.getInt(columnIndex);
                                                                        i13 = cursorQuery.getInt(columnIndex2);
                                                                        string3 = cursorQuery.getString(columnIndex3);
                                                                        int i2111115 = columnIndex;
                                                                        int i2111116 = columnIndex9;
                                                                        photoEntry = new PhotoEntry(i13, i2111114, cursorQuery.getLong(columnIndex5), string2, 0, (int) (cursorQuery.getLong(columnIndex6) / 1000), true, cursorQuery.getInt(columnIndex7), cursorQuery.getInt(columnIndex8), cursorQuery.getLong(columnIndex9));
                                                                        int i2111117 = columnIndex5;
                                                                        if (albumEntry13 == null) {
                                                                            arrayList2 = arrayList;
                                                                            albumEntry4 = new AlbumEntry(0, LocaleController.getString(R.string.AllVideos), photoEntry);
                                                                            i14 = 1;
                                                                            albumEntry4.videoOnly = true;
                                                                            if (albumEntry2 != null) {
                                                                                i14 = 0;
                                                                            }
                                                                            if (albumEntry3 != null) {
                                                                                i14++;
                                                                            }
                                                                            arrayList5.add(i14, albumEntry4);
                                                                        } else {
                                                                            arrayList2 = arrayList;
                                                                            albumEntry4 = albumEntry13;
                                                                        }
                                                                        if (albumEntry2 == null) {
                                                                            albumEntry5 = new AlbumEntry(0, LocaleController.getString(R.string.AllMedia), photoEntry);
                                                                            arrayList5.add(0, albumEntry5);
                                                                        } else {
                                                                            albumEntry5 = albumEntry2;
                                                                        }
                                                                        albumEntry4.addPhoto(photoEntry);
                                                                        albumEntry5.addPhoto(photoEntry);
                                                                        albumEntry6 = (AlbumEntry) sparseArray3.get(i13);
                                                                        if (albumEntry6 == null) {
                                                                            albumEntry6 = new AlbumEntry(i13, string3, photoEntry);
                                                                            sparseArray3.put(i13, albumEntry6);
                                                                            if (objValueOf == null) {
                                                                                arrayList5.add(albumEntry6);
                                                                            } else {
                                                                                arrayList5.add(albumEntry6);
                                                                            }
                                                                        }
                                                                        albumEntry6.addPhoto(photoEntry);
                                                                        albumEntry13 = albumEntry4;
                                                                        albumEntry2 = albumEntry5;
                                                                        columnIndex = i2111115;
                                                                        columnIndex5 = i2111117;
                                                                        columnIndex2 = columnIndex2;
                                                                        columnIndex4 = columnIndex4;
                                                                        columnIndex3 = columnIndex3;
                                                                        columnIndex9 = i2111116;
                                                                        arrayList = arrayList2;
                                                                    }
                                                                }
                                                            }
                                                            arrayList2 = arrayList;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                        }
                                                        AlbumEntry albumEntry1110 = albumEntry13;
                                                        AlbumEntry albumEntry1111 = albumEntry2;
                                                        Integer num9 = objValueOf;
                                                        while (i11 < arrayList5.size()) {
                                                            Collections.sort(((AlbumEntry) arrayList5.get(i11)).photos, new q(6));
                                                        }
                                                        broadcastNewPhotos(i10, arrayList5, arrayList2, num9, albumEntry1111, albumEntry3, albumEntry1110, 0);
                                                    }
                                                } catch (Throwable th19) {
                                                    th = th19;
                                                    str5 = "height";
                                                }
                                            } catch (Throwable th20) {
                                                th = th20;
                                                str5 = "height";
                                                str6 = "width";
                                            }
                                        } catch (Throwable th21) {
                                            th = th21;
                                            str5 = "height";
                                            str6 = "width";
                                            str7 = "orientation";
                                        }
                                    } catch (Throwable th22) {
                                        th = th22;
                                        str5 = "height";
                                        str6 = "width";
                                        str7 = "orientation";
                                        str8 = "_data";
                                    }
                                } catch (Throwable th23) {
                                    th = th23;
                                    str5 = "height";
                                    str6 = "width";
                                    str7 = "orientation";
                                    str8 = "_data";
                                    str9 = "bucket_display_name";
                                }
                            } catch (Throwable th24) {
                                th = th24;
                                str5 = "height";
                                str6 = "width";
                                str7 = "orientation";
                                str8 = "_data";
                                str9 = "bucket_display_name";
                                str10 = "bucket_id";
                            }
                        } catch (Throwable th25) {
                            th = th25;
                            str5 = "height";
                            str6 = "width";
                            str7 = "orientation";
                            str8 = "_data";
                            str9 = "bucket_display_name";
                            str10 = "bucket_id";
                            str11 = "_id";
                        }
                    } else {
                        str5 = "height";
                        str6 = "width";
                        str7 = "orientation";
                        str8 = "_data";
                        str9 = "bucket_display_name";
                        str10 = "bucket_id";
                        str11 = "_id";
                        arrayList5 = arrayList5;
                        sparseArray3 = sparseArray3;
                        string = string;
                        arrayList = arrayList6;
                        albumEntry = null;
                        albumEntry2 = null;
                        objValueOf = null;
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } catch (Throwable th26) {
                    th = th26;
                    arrayList = arrayList6;
                    cursorQuery = null;
                    albumEntry = null;
                    albumEntry2 = albumEntry;
                    objValueOf = albumEntry2;
                    FileLog.e(th);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    albumEntry3 = albumEntry;
                    Context context9 = ApplicationLoader.applicationContext;
                    i12 = Build.VERSION.SDK_INT;
                    if (i12 >= 23) {
                        ContentResolver contentResolver16 = ApplicationLoader.applicationContext.getContentResolver();
                        Uri uri16 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                        String[] strArr16 = projectionVideo;
                        StringBuilder sb18 = new StringBuilder();
                        if (i12 > 28) {
                            str = "date_modified";
                        } else {
                            str = "datetaken";
                        }
                        sb18.append(str);
                        sb18.append(" DESC");
                        cursorQuery = MediaStore.Images.Media.query(contentResolver16, uri16, strArr16, null, null, sb18.toString());
                        if (cursorQuery != null) {
                            columnIndex = cursorQuery.getColumnIndex(str11);
                            columnIndex2 = cursorQuery.getColumnIndex(str10);
                            columnIndex3 = cursorQuery.getColumnIndex(str9);
                            columnIndex4 = cursorQuery.getColumnIndex(str8);
                            if (i12 > 28) {
                                str2 = "date_modified";
                            } else {
                                str2 = "datetaken";
                            }
                            columnIndex5 = cursorQuery.getColumnIndex(str2);
                            columnIndex6 = cursorQuery.getColumnIndex("duration");
                            columnIndex7 = cursorQuery.getColumnIndex(str6);
                            columnIndex8 = cursorQuery.getColumnIndex(str5);
                            columnIndex9 = cursorQuery.getColumnIndex("_size");
                            cursorQuery.getColumnIndex(str7);
                            while (cursorQuery.moveToNext()) {
                                string2 = cursorQuery.getString(columnIndex4);
                                if (TextUtils.isEmpty(string2)) {
                                    int i2111118 = cursorQuery.getInt(columnIndex);
                                    i13 = cursorQuery.getInt(columnIndex2);
                                    string3 = cursorQuery.getString(columnIndex3);
                                    int i2111119 = columnIndex;
                                    int i21111110 = columnIndex9;
                                    photoEntry = new PhotoEntry(i13, i2111118, cursorQuery.getLong(columnIndex5), string2, 0, (int) (cursorQuery.getLong(columnIndex6) / 1000), true, cursorQuery.getInt(columnIndex7), cursorQuery.getInt(columnIndex8), cursorQuery.getLong(columnIndex9));
                                    int i21111111 = columnIndex5;
                                    if (albumEntry13 == null) {
                                        arrayList2 = arrayList;
                                        albumEntry4 = new AlbumEntry(0, LocaleController.getString(R.string.AllVideos), photoEntry);
                                        i14 = 1;
                                        albumEntry4.videoOnly = true;
                                        if (albumEntry2 != null) {
                                            i14 = 0;
                                        }
                                        if (albumEntry3 != null) {
                                            i14++;
                                        }
                                        arrayList5.add(i14, albumEntry4);
                                    } else {
                                        arrayList2 = arrayList;
                                        albumEntry4 = albumEntry13;
                                    }
                                    if (albumEntry2 == null) {
                                        albumEntry5 = new AlbumEntry(0, LocaleController.getString(R.string.AllMedia), photoEntry);
                                        arrayList5.add(0, albumEntry5);
                                    } else {
                                        albumEntry5 = albumEntry2;
                                    }
                                    albumEntry4.addPhoto(photoEntry);
                                    albumEntry5.addPhoto(photoEntry);
                                    albumEntry6 = (AlbumEntry) sparseArray3.get(i13);
                                    if (albumEntry6 == null) {
                                        albumEntry6 = new AlbumEntry(i13, string3, photoEntry);
                                        sparseArray3.put(i13, albumEntry6);
                                        if (objValueOf == null) {
                                            arrayList5.add(albumEntry6);
                                        } else {
                                            arrayList5.add(albumEntry6);
                                        }
                                    }
                                    albumEntry6.addPhoto(photoEntry);
                                    albumEntry13 = albumEntry4;
                                    albumEntry2 = albumEntry5;
                                    columnIndex = i2111119;
                                    columnIndex5 = i21111111;
                                    columnIndex2 = columnIndex2;
                                    columnIndex4 = columnIndex4;
                                    columnIndex3 = columnIndex3;
                                    columnIndex9 = i21111110;
                                    arrayList = arrayList2;
                                }
                            }
                        }
                        arrayList2 = arrayList;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    } else {
                        ContentResolver contentResolver17 = ApplicationLoader.applicationContext.getContentResolver();
                        Uri uri17 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                        String[] strArr17 = projectionVideo;
                        StringBuilder sb19 = new StringBuilder();
                        if (i12 > 28) {
                            str = "date_modified";
                        } else {
                            str = "datetaken";
                        }
                        sb19.append(str);
                        sb19.append(" DESC");
                        cursorQuery = MediaStore.Images.Media.query(contentResolver17, uri17, strArr17, null, null, sb19.toString());
                        if (cursorQuery != null) {
                            columnIndex = cursorQuery.getColumnIndex(str11);
                            columnIndex2 = cursorQuery.getColumnIndex(str10);
                            columnIndex3 = cursorQuery.getColumnIndex(str9);
                            columnIndex4 = cursorQuery.getColumnIndex(str8);
                            if (i12 > 28) {
                                str2 = "date_modified";
                            } else {
                                str2 = "datetaken";
                            }
                            columnIndex5 = cursorQuery.getColumnIndex(str2);
                            columnIndex6 = cursorQuery.getColumnIndex("duration");
                            columnIndex7 = cursorQuery.getColumnIndex(str6);
                            columnIndex8 = cursorQuery.getColumnIndex(str5);
                            columnIndex9 = cursorQuery.getColumnIndex("_size");
                            cursorQuery.getColumnIndex(str7);
                            while (cursorQuery.moveToNext()) {
                                string2 = cursorQuery.getString(columnIndex4);
                                if (TextUtils.isEmpty(string2)) {
                                    int i21111112 = cursorQuery.getInt(columnIndex);
                                    i13 = cursorQuery.getInt(columnIndex2);
                                    string3 = cursorQuery.getString(columnIndex3);
                                    int i21111113 = columnIndex;
                                    int i21111114 = columnIndex9;
                                    photoEntry = new PhotoEntry(i13, i21111112, cursorQuery.getLong(columnIndex5), string2, 0, (int) (cursorQuery.getLong(columnIndex6) / 1000), true, cursorQuery.getInt(columnIndex7), cursorQuery.getInt(columnIndex8), cursorQuery.getLong(columnIndex9));
                                    int i21111115 = columnIndex5;
                                    if (albumEntry13 == null) {
                                        arrayList2 = arrayList;
                                        albumEntry4 = new AlbumEntry(0, LocaleController.getString(R.string.AllVideos), photoEntry);
                                        i14 = 1;
                                        albumEntry4.videoOnly = true;
                                        if (albumEntry2 != null) {
                                            i14 = 0;
                                        }
                                        if (albumEntry3 != null) {
                                            i14++;
                                        }
                                        arrayList5.add(i14, albumEntry4);
                                    } else {
                                        arrayList2 = arrayList;
                                        albumEntry4 = albumEntry13;
                                    }
                                    if (albumEntry2 == null) {
                                        albumEntry5 = new AlbumEntry(0, LocaleController.getString(R.string.AllMedia), photoEntry);
                                        arrayList5.add(0, albumEntry5);
                                    } else {
                                        albumEntry5 = albumEntry2;
                                    }
                                    albumEntry4.addPhoto(photoEntry);
                                    albumEntry5.addPhoto(photoEntry);
                                    albumEntry6 = (AlbumEntry) sparseArray3.get(i13);
                                    if (albumEntry6 == null) {
                                        albumEntry6 = new AlbumEntry(i13, string3, photoEntry);
                                        sparseArray3.put(i13, albumEntry6);
                                        if (objValueOf == null) {
                                            arrayList5.add(albumEntry6);
                                        } else {
                                            arrayList5.add(albumEntry6);
                                        }
                                    }
                                    albumEntry6.addPhoto(photoEntry);
                                    albumEntry13 = albumEntry4;
                                    albumEntry2 = albumEntry5;
                                    columnIndex = i21111113;
                                    columnIndex5 = i21111115;
                                    columnIndex2 = columnIndex2;
                                    columnIndex4 = columnIndex4;
                                    columnIndex3 = columnIndex3;
                                    columnIndex9 = i21111114;
                                    arrayList = arrayList2;
                                }
                            }
                        }
                        arrayList2 = arrayList;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    }
                    AlbumEntry albumEntry1112 = albumEntry13;
                    AlbumEntry albumEntry1113 = albumEntry2;
                    Integer num10 = objValueOf;
                    while (i11 < arrayList5.size()) {
                        Collections.sort(((AlbumEntry) arrayList5.get(i11)).photos, new q(6));
                    }
                    broadcastNewPhotos(i10, arrayList5, arrayList2, num10, albumEntry1113, albumEntry3, albumEntry1112, 0);
                }
            } else if (i16 < 33) {
                try {
                    if (context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                        if (i16 >= 33 || (context.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 && context.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0 && context.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0)) {
                            str5 = "height";
                            str6 = "width";
                            str7 = "orientation";
                            str8 = "_data";
                            str9 = "bucket_display_name";
                            str10 = "bucket_id";
                            str11 = "_id";
                            arrayList5 = arrayList5;
                            sparseArray3 = sparseArray3;
                            cursorQuery = null;
                            albumEntry = null;
                            albumEntry2 = null;
                            objValueOf = null;
                            string = string;
                            arrayList = arrayList6;
                        }
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    }
                    ContentResolver contentResolver18 = context.getContentResolver();
                    Uri uri18 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    String[] strArr18 = projectionPhotos;
                    StringBuilder sb20 = new StringBuilder();
                    if (i16 > 28) {
                        str3 = "date_modified";
                    } else {
                        str3 = "datetaken";
                    }
                    sb20.append(str3);
                    sb20.append(" DESC");
                    cursorQuery = MediaStore.Images.Media.query(contentResolver18, uri18, strArr18, null, null, sb20.toString());
                    if (cursorQuery != null) {
                        columnIndex10 = cursorQuery.getColumnIndex("_id");
                        str11 = "_id";
                        columnIndex11 = cursorQuery.getColumnIndex("bucket_id");
                        str10 = "bucket_id";
                        columnIndex12 = cursorQuery.getColumnIndex("bucket_display_name");
                        str9 = "bucket_display_name";
                        columnIndex13 = cursorQuery.getColumnIndex("_data");
                        str8 = "_data";
                        if (i16 > 28) {
                            str4 = "date_modified";
                        } else {
                            str4 = "datetaken";
                        }
                        columnIndex14 = cursorQuery.getColumnIndex(str4);
                        columnIndex15 = cursorQuery.getColumnIndex("orientation");
                        str7 = "orientation";
                        columnIndex16 = cursorQuery.getColumnIndex("width");
                        str6 = "width";
                        columnIndex17 = cursorQuery.getColumnIndex("height");
                        str5 = "height";
                        columnIndex18 = cursorQuery.getColumnIndex("_size");
                        albumEntry = null;
                        albumEntry2 = null;
                        objValueOf = null;
                        numValueOf = null;
                        while (cursorQuery.moveToNext()) {
                            string4 = cursorQuery.getString(columnIndex13);
                            if (TextUtils.isEmpty(string4)) {
                                int i110 = cursorQuery.getInt(columnIndex10);
                                i15 = cursorQuery.getInt(columnIndex11);
                                int i111 = columnIndex10;
                                string5 = cursorQuery.getString(columnIndex12);
                                photoEntry2 = new PhotoEntry(i15, i110, cursorQuery.getLong(columnIndex14), string4, cursorQuery.getInt(columnIndex15), 0, false, cursorQuery.getInt(columnIndex16), cursorQuery.getInt(columnIndex17), cursorQuery.getLong(columnIndex18));
                                int i112 = columnIndex17;
                                int i220 = columnIndex16;
                                int i221 = columnIndex18;
                                if (albumEntry == null) {
                                    albumEntry7 = new AlbumEntry(0, LocaleController.getString(R.string.AllPhotos), photoEntry2);
                                    arrayList = arrayList6;
                                    arrayList.add(0, albumEntry7);
                                } else {
                                    arrayList = arrayList6;
                                    albumEntry7 = albumEntry;
                                }
                                if (albumEntry2 == null) {
                                    albumEntry8 = new AlbumEntry(0, LocaleController.getString(R.string.AllMedia), photoEntry2);
                                    arrayList5 = arrayList5;
                                    arrayList5.add(0, albumEntry8);
                                } else {
                                    arrayList5 = arrayList5;
                                    albumEntry8 = albumEntry2;
                                }
                                cursor = cursorQuery;
                                if (albumEntry7.photos.size() < 15) {
                                    photoEntry2.isLivePhoto();
                                }
                                albumEntry7.addPhoto(photoEntry2);
                                albumEntry8.addPhoto(photoEntry2);
                                sparseArray3 = sparseArray3;
                                albumEntry11 = (AlbumEntry) sparseArray3.get(i15);
                                if (albumEntry11 == null) {
                                    albumEntry11 = new AlbumEntry(i15, string5, photoEntry2);
                                    sparseArray3.put(i15, albumEntry11);
                                    if (objValueOf == null) {
                                        albumEntry9 = albumEntry7;
                                        string = string;
                                        albumEntry10 = albumEntry8;
                                        arrayList5.add(albumEntry11);
                                    } else {
                                        albumEntry9 = albumEntry7;
                                        string = string;
                                        albumEntry10 = albumEntry8;
                                        arrayList5.add(albumEntry11);
                                    }
                                } else {
                                    albumEntry9 = albumEntry7;
                                    string = string;
                                    albumEntry10 = albumEntry8;
                                }
                                albumEntry11.addPhoto(photoEntry2);
                                sparseArray2 = sparseArray;
                                albumEntry12 = (AlbumEntry) sparseArray2.get(i15);
                                if (albumEntry12 == null) {
                                    albumEntry12 = new AlbumEntry(i15, string5, photoEntry2);
                                    sparseArray2.put(i15, albumEntry12);
                                    if (numValueOf == null) {
                                        arrayList.add(albumEntry12);
                                    } else {
                                        arrayList.add(albumEntry12);
                                    }
                                }
                                albumEntry12.addPhoto(photoEntry2);
                                sparseArray = sparseArray2;
                                cursorQuery = cursor;
                                albumEntry = albumEntry9;
                                albumEntry2 = albumEntry10;
                                columnIndex10 = i111;
                                columnIndex17 = i112;
                                columnIndex16 = i220;
                                columnIndex18 = i221;
                                columnIndex12 = columnIndex12;
                                string = string;
                                arrayList5 = arrayList5;
                                sparseArray3 = sparseArray3;
                                columnIndex15 = columnIndex15;
                                columnIndex14 = columnIndex14;
                                columnIndex11 = columnIndex11;
                                arrayList6 = arrayList;
                                columnIndex13 = columnIndex13;
                            }
                        }
                        arrayList5 = arrayList5;
                        sparseArray3 = sparseArray3;
                        string = string;
                        arrayList = arrayList6;
                    } else {
                        str5 = "height";
                        str6 = "width";
                        str7 = "orientation";
                        str8 = "_data";
                        str9 = "bucket_display_name";
                        str10 = "bucket_id";
                        str11 = "_id";
                        arrayList5 = arrayList5;
                        sparseArray3 = sparseArray3;
                        string = string;
                        arrayList = arrayList6;
                        albumEntry = null;
                        albumEntry2 = null;
                        objValueOf = null;
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } catch (Throwable th27) {
                    th = th27;
                    str5 = "height";
                    str6 = "width";
                    str7 = "orientation";
                    str8 = "_data";
                    str9 = "bucket_display_name";
                    str10 = "bucket_id";
                    str11 = "_id";
                    arrayList5 = arrayList5;
                    sparseArray3 = sparseArray3;
                    cursorQuery = null;
                    albumEntry = null;
                    albumEntry2 = null;
                    objValueOf = null;
                    string = string;
                    arrayList = arrayList6;
                    FileLog.e(th);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    albumEntry3 = albumEntry;
                    Context context10 = ApplicationLoader.applicationContext;
                    i12 = Build.VERSION.SDK_INT;
                    if (i12 >= 23) {
                        ContentResolver contentResolver19 = ApplicationLoader.applicationContext.getContentResolver();
                        Uri uri19 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                        String[] strArr19 = projectionVideo;
                        StringBuilder sb110 = new StringBuilder();
                        if (i12 > 28) {
                            str = "date_modified";
                        } else {
                            str = "datetaken";
                        }
                        sb110.append(str);
                        sb110.append(" DESC");
                        cursorQuery = MediaStore.Images.Media.query(contentResolver19, uri19, strArr19, null, null, sb110.toString());
                        if (cursorQuery != null) {
                            columnIndex = cursorQuery.getColumnIndex(str11);
                            columnIndex2 = cursorQuery.getColumnIndex(str10);
                            columnIndex3 = cursorQuery.getColumnIndex(str9);
                            columnIndex4 = cursorQuery.getColumnIndex(str8);
                            if (i12 > 28) {
                                str2 = "date_modified";
                            } else {
                                str2 = "datetaken";
                            }
                            columnIndex5 = cursorQuery.getColumnIndex(str2);
                            columnIndex6 = cursorQuery.getColumnIndex("duration");
                            columnIndex7 = cursorQuery.getColumnIndex(str6);
                            columnIndex8 = cursorQuery.getColumnIndex(str5);
                            columnIndex9 = cursorQuery.getColumnIndex("_size");
                            cursorQuery.getColumnIndex(str7);
                            while (cursorQuery.moveToNext()) {
                                string2 = cursorQuery.getString(columnIndex4);
                                if (TextUtils.isEmpty(string2)) {
                                    int i21111116 = cursorQuery.getInt(columnIndex);
                                    i13 = cursorQuery.getInt(columnIndex2);
                                    string3 = cursorQuery.getString(columnIndex3);
                                    int i21111117 = columnIndex;
                                    int i21111118 = columnIndex9;
                                    photoEntry = new PhotoEntry(i13, i21111116, cursorQuery.getLong(columnIndex5), string2, 0, (int) (cursorQuery.getLong(columnIndex6) / 1000), true, cursorQuery.getInt(columnIndex7), cursorQuery.getInt(columnIndex8), cursorQuery.getLong(columnIndex9));
                                    int i21111119 = columnIndex5;
                                    if (albumEntry13 == null) {
                                        arrayList2 = arrayList;
                                        albumEntry4 = new AlbumEntry(0, LocaleController.getString(R.string.AllVideos), photoEntry);
                                        i14 = 1;
                                        albumEntry4.videoOnly = true;
                                        if (albumEntry2 != null) {
                                            i14 = 0;
                                        }
                                        if (albumEntry3 != null) {
                                            i14++;
                                        }
                                        arrayList5.add(i14, albumEntry4);
                                    } else {
                                        arrayList2 = arrayList;
                                        albumEntry4 = albumEntry13;
                                    }
                                    if (albumEntry2 == null) {
                                        albumEntry5 = new AlbumEntry(0, LocaleController.getString(R.string.AllMedia), photoEntry);
                                        arrayList5.add(0, albumEntry5);
                                    } else {
                                        albumEntry5 = albumEntry2;
                                    }
                                    albumEntry4.addPhoto(photoEntry);
                                    albumEntry5.addPhoto(photoEntry);
                                    albumEntry6 = (AlbumEntry) sparseArray3.get(i13);
                                    if (albumEntry6 == null) {
                                        albumEntry6 = new AlbumEntry(i13, string3, photoEntry);
                                        sparseArray3.put(i13, albumEntry6);
                                        if (objValueOf == null) {
                                            arrayList5.add(albumEntry6);
                                        } else {
                                            arrayList5.add(albumEntry6);
                                        }
                                    }
                                    albumEntry6.addPhoto(photoEntry);
                                    albumEntry13 = albumEntry4;
                                    albumEntry2 = albumEntry5;
                                    columnIndex = i21111117;
                                    columnIndex5 = i21111119;
                                    columnIndex2 = columnIndex2;
                                    columnIndex4 = columnIndex4;
                                    columnIndex3 = columnIndex3;
                                    columnIndex9 = i21111118;
                                    arrayList = arrayList2;
                                }
                            }
                        }
                        arrayList2 = arrayList;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    } else {
                        ContentResolver contentResolver110 = ApplicationLoader.applicationContext.getContentResolver();
                        Uri uri110 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                        String[] strArr110 = projectionVideo;
                        StringBuilder sb111 = new StringBuilder();
                        if (i12 > 28) {
                            str = "date_modified";
                        } else {
                            str = "datetaken";
                        }
                        sb111.append(str);
                        sb111.append(" DESC");
                        cursorQuery = MediaStore.Images.Media.query(contentResolver110, uri110, strArr110, null, null, sb111.toString());
                        if (cursorQuery != null) {
                            columnIndex = cursorQuery.getColumnIndex(str11);
                            columnIndex2 = cursorQuery.getColumnIndex(str10);
                            columnIndex3 = cursorQuery.getColumnIndex(str9);
                            columnIndex4 = cursorQuery.getColumnIndex(str8);
                            if (i12 > 28) {
                                str2 = "date_modified";
                            } else {
                                str2 = "datetaken";
                            }
                            columnIndex5 = cursorQuery.getColumnIndex(str2);
                            columnIndex6 = cursorQuery.getColumnIndex("duration");
                            columnIndex7 = cursorQuery.getColumnIndex(str6);
                            columnIndex8 = cursorQuery.getColumnIndex(str5);
                            columnIndex9 = cursorQuery.getColumnIndex("_size");
                            cursorQuery.getColumnIndex(str7);
                            while (cursorQuery.moveToNext()) {
                                string2 = cursorQuery.getString(columnIndex4);
                                if (TextUtils.isEmpty(string2)) {
                                    int i211111110 = cursorQuery.getInt(columnIndex);
                                    i13 = cursorQuery.getInt(columnIndex2);
                                    string3 = cursorQuery.getString(columnIndex3);
                                    int i211111111 = columnIndex;
                                    int i211111112 = columnIndex9;
                                    photoEntry = new PhotoEntry(i13, i211111110, cursorQuery.getLong(columnIndex5), string2, 0, (int) (cursorQuery.getLong(columnIndex6) / 1000), true, cursorQuery.getInt(columnIndex7), cursorQuery.getInt(columnIndex8), cursorQuery.getLong(columnIndex9));
                                    int i211111113 = columnIndex5;
                                    if (albumEntry13 == null) {
                                        arrayList2 = arrayList;
                                        albumEntry4 = new AlbumEntry(0, LocaleController.getString(R.string.AllVideos), photoEntry);
                                        i14 = 1;
                                        albumEntry4.videoOnly = true;
                                        if (albumEntry2 != null) {
                                            i14 = 0;
                                        }
                                        if (albumEntry3 != null) {
                                            i14++;
                                        }
                                        arrayList5.add(i14, albumEntry4);
                                    } else {
                                        arrayList2 = arrayList;
                                        albumEntry4 = albumEntry13;
                                    }
                                    if (albumEntry2 == null) {
                                        albumEntry5 = new AlbumEntry(0, LocaleController.getString(R.string.AllMedia), photoEntry);
                                        arrayList5.add(0, albumEntry5);
                                    } else {
                                        albumEntry5 = albumEntry2;
                                    }
                                    albumEntry4.addPhoto(photoEntry);
                                    albumEntry5.addPhoto(photoEntry);
                                    albumEntry6 = (AlbumEntry) sparseArray3.get(i13);
                                    if (albumEntry6 == null) {
                                        albumEntry6 = new AlbumEntry(i13, string3, photoEntry);
                                        sparseArray3.put(i13, albumEntry6);
                                        if (objValueOf == null) {
                                            arrayList5.add(albumEntry6);
                                        } else {
                                            arrayList5.add(albumEntry6);
                                        }
                                    }
                                    albumEntry6.addPhoto(photoEntry);
                                    albumEntry13 = albumEntry4;
                                    albumEntry2 = albumEntry5;
                                    columnIndex = i211111111;
                                    columnIndex5 = i211111113;
                                    columnIndex2 = columnIndex2;
                                    columnIndex4 = columnIndex4;
                                    columnIndex3 = columnIndex3;
                                    columnIndex9 = i211111112;
                                    arrayList = arrayList2;
                                }
                            }
                        }
                        arrayList2 = arrayList;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    }
                    AlbumEntry albumEntry1114 = albumEntry13;
                    AlbumEntry albumEntry1115 = albumEntry2;
                    Integer num11 = objValueOf;
                    while (i11 < arrayList5.size()) {
                        Collections.sort(((AlbumEntry) arrayList5.get(i11)).photos, new q(6));
                    }
                    broadcastNewPhotos(i10, arrayList5, arrayList2, num11, albumEntry1115, albumEntry3, albumEntry1114, 0);
                }
            } else {
                if (i16 >= 33) {
                }
                str5 = "height";
                str6 = "width";
                str7 = "orientation";
                str8 = "_data";
                str9 = "bucket_display_name";
                str10 = "bucket_id";
                str11 = "_id";
                arrayList5 = arrayList5;
                sparseArray3 = sparseArray3;
                cursorQuery = null;
                albumEntry = null;
                albumEntry2 = null;
                objValueOf = null;
                string = string;
                arrayList = arrayList6;
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
        } catch (Throwable th28) {
            th = th28;
            arrayList = arrayList4;
        }
        albumEntry3 = albumEntry;
        try {
            Context context11 = ApplicationLoader.applicationContext;
            i12 = Build.VERSION.SDK_INT;
            if (i12 >= 23 || (i12 < 33 && context11.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0)) {
                ContentResolver contentResolver111 = ApplicationLoader.applicationContext.getContentResolver();
                Uri uri111 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                String[] strArr111 = projectionVideo;
                StringBuilder sb112 = new StringBuilder();
                if (i12 > 28) {
                    str = "date_modified";
                } else {
                    str = "datetaken";
                }
                sb112.append(str);
                sb112.append(" DESC");
                cursorQuery = MediaStore.Images.Media.query(contentResolver111, uri111, strArr111, null, null, sb112.toString());
                if (cursorQuery != null) {
                    columnIndex = cursorQuery.getColumnIndex(str11);
                    columnIndex2 = cursorQuery.getColumnIndex(str10);
                    columnIndex3 = cursorQuery.getColumnIndex(str9);
                    columnIndex4 = cursorQuery.getColumnIndex(str8);
                    if (i12 > 28) {
                        str2 = "date_modified";
                    } else {
                        str2 = "datetaken";
                    }
                    columnIndex5 = cursorQuery.getColumnIndex(str2);
                    columnIndex6 = cursorQuery.getColumnIndex("duration");
                    columnIndex7 = cursorQuery.getColumnIndex(str6);
                    columnIndex8 = cursorQuery.getColumnIndex(str5);
                    columnIndex9 = cursorQuery.getColumnIndex("_size");
                    cursorQuery.getColumnIndex(str7);
                    while (cursorQuery.moveToNext()) {
                        string2 = cursorQuery.getString(columnIndex4);
                        if (TextUtils.isEmpty(string2)) {
                            int i211111114 = cursorQuery.getInt(columnIndex);
                            i13 = cursorQuery.getInt(columnIndex2);
                            string3 = cursorQuery.getString(columnIndex3);
                            int i211111115 = columnIndex;
                            int i211111116 = columnIndex9;
                            photoEntry = new PhotoEntry(i13, i211111114, cursorQuery.getLong(columnIndex5), string2, 0, (int) (cursorQuery.getLong(columnIndex6) / 1000), true, cursorQuery.getInt(columnIndex7), cursorQuery.getInt(columnIndex8), cursorQuery.getLong(columnIndex9));
                            int i211111117 = columnIndex5;
                            if (albumEntry13 == null) {
                                arrayList2 = arrayList;
                                albumEntry4 = new AlbumEntry(0, LocaleController.getString(R.string.AllVideos), photoEntry);
                                i14 = 1;
                                albumEntry4.videoOnly = true;
                                if (albumEntry2 != null) {
                                    i14 = 0;
                                }
                                if (albumEntry3 != null) {
                                    i14++;
                                }
                                arrayList5.add(i14, albumEntry4);
                            } else {
                                arrayList2 = arrayList;
                                albumEntry4 = albumEntry13;
                            }
                            if (albumEntry2 == null) {
                                albumEntry5 = new AlbumEntry(0, LocaleController.getString(R.string.AllMedia), photoEntry);
                                arrayList5.add(0, albumEntry5);
                            } else {
                                albumEntry5 = albumEntry2;
                            }
                            albumEntry4.addPhoto(photoEntry);
                            albumEntry5.addPhoto(photoEntry);
                            albumEntry6 = (AlbumEntry) sparseArray3.get(i13);
                            if (albumEntry6 == null) {
                                albumEntry6 = new AlbumEntry(i13, string3, photoEntry);
                                sparseArray3.put(i13, albumEntry6);
                                if (objValueOf == null || string == null || string2 == null || !string2.startsWith(string)) {
                                    arrayList5.add(albumEntry6);
                                } else {
                                    try {
                                        arrayList5.add(0, albumEntry6);
                                        objValueOf = Integer.valueOf(i13);
                                    } catch (Throwable th29) {
                                        th = th29;
                                        albumEntry13 = albumEntry4;
                                        albumEntry2 = albumEntry5;
                                        FileLog.e(th);
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        AlbumEntry albumEntry1116 = albumEntry13;
                                        AlbumEntry albumEntry1117 = albumEntry2;
                                        Integer num12 = objValueOf;
                                        while (i11 < arrayList5.size()) {
                                            Collections.sort(((AlbumEntry) arrayList5.get(i11)).photos, new q(6));
                                        }
                                        broadcastNewPhotos(i10, arrayList5, arrayList2, num12, albumEntry1117, albumEntry3, albumEntry1116, 0);
                                    }
                                }
                            }
                            albumEntry6.addPhoto(photoEntry);
                            albumEntry13 = albumEntry4;
                            albumEntry2 = albumEntry5;
                            columnIndex = i211111115;
                            columnIndex5 = i211111117;
                            columnIndex2 = columnIndex2;
                            columnIndex4 = columnIndex4;
                            columnIndex3 = columnIndex3;
                            columnIndex9 = i211111116;
                            arrayList = arrayList2;
                        }
                    }
                }
                arrayList2 = arrayList;
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } else {
                if (i12 >= 33 && (context11.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0 || context11.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0 || context11.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") == 0)) {
                    ContentResolver contentResolver112 = ApplicationLoader.applicationContext.getContentResolver();
                    Uri uri112 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                    String[] strArr112 = projectionVideo;
                    StringBuilder sb113 = new StringBuilder();
                    if (i12 > 28) {
                        str = "date_modified";
                    } else {
                        str = "datetaken";
                    }
                    sb113.append(str);
                    sb113.append(" DESC");
                    cursorQuery = MediaStore.Images.Media.query(contentResolver112, uri112, strArr112, null, null, sb113.toString());
                    if (cursorQuery != null) {
                        columnIndex = cursorQuery.getColumnIndex(str11);
                        columnIndex2 = cursorQuery.getColumnIndex(str10);
                        columnIndex3 = cursorQuery.getColumnIndex(str9);
                        columnIndex4 = cursorQuery.getColumnIndex(str8);
                        if (i12 > 28) {
                            str2 = "date_modified";
                        } else {
                            str2 = "datetaken";
                        }
                        columnIndex5 = cursorQuery.getColumnIndex(str2);
                        columnIndex6 = cursorQuery.getColumnIndex("duration");
                        columnIndex7 = cursorQuery.getColumnIndex(str6);
                        columnIndex8 = cursorQuery.getColumnIndex(str5);
                        columnIndex9 = cursorQuery.getColumnIndex("_size");
                        cursorQuery.getColumnIndex(str7);
                        while (cursorQuery.moveToNext()) {
                            string2 = cursorQuery.getString(columnIndex4);
                            if (TextUtils.isEmpty(string2)) {
                                int i211111118 = cursorQuery.getInt(columnIndex);
                                i13 = cursorQuery.getInt(columnIndex2);
                                string3 = cursorQuery.getString(columnIndex3);
                                int i211111119 = columnIndex;
                                int i2111111110 = columnIndex9;
                                photoEntry = new PhotoEntry(i13, i211111118, cursorQuery.getLong(columnIndex5), string2, 0, (int) (cursorQuery.getLong(columnIndex6) / 1000), true, cursorQuery.getInt(columnIndex7), cursorQuery.getInt(columnIndex8), cursorQuery.getLong(columnIndex9));
                                int i2111111111 = columnIndex5;
                                if (albumEntry13 == null) {
                                    arrayList2 = arrayList;
                                    albumEntry4 = new AlbumEntry(0, LocaleController.getString(R.string.AllVideos), photoEntry);
                                    i14 = 1;
                                    albumEntry4.videoOnly = true;
                                    if (albumEntry2 != null) {
                                        i14 = 0;
                                    }
                                    if (albumEntry3 != null) {
                                        i14++;
                                    }
                                    arrayList5.add(i14, albumEntry4);
                                } else {
                                    arrayList2 = arrayList;
                                    albumEntry4 = albumEntry13;
                                }
                                if (albumEntry2 == null) {
                                    albumEntry5 = new AlbumEntry(0, LocaleController.getString(R.string.AllMedia), photoEntry);
                                    arrayList5.add(0, albumEntry5);
                                } else {
                                    albumEntry5 = albumEntry2;
                                }
                                albumEntry4.addPhoto(photoEntry);
                                albumEntry5.addPhoto(photoEntry);
                                albumEntry6 = (AlbumEntry) sparseArray3.get(i13);
                                if (albumEntry6 == null) {
                                    albumEntry6 = new AlbumEntry(i13, string3, photoEntry);
                                    sparseArray3.put(i13, albumEntry6);
                                    if (objValueOf == null) {
                                        arrayList5.add(albumEntry6);
                                    } else {
                                        arrayList5.add(albumEntry6);
                                    }
                                }
                                albumEntry6.addPhoto(photoEntry);
                                albumEntry13 = albumEntry4;
                                albumEntry2 = albumEntry5;
                                columnIndex = i211111119;
                                columnIndex5 = i2111111111;
                                columnIndex2 = columnIndex2;
                                columnIndex4 = columnIndex4;
                                columnIndex3 = columnIndex3;
                                columnIndex9 = i2111111110;
                                arrayList = arrayList2;
                            }
                        }
                    }
                }
                arrayList2 = arrayList;
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
        } catch (Throwable th30) {
            th = th30;
            arrayList2 = arrayList;
        }
        AlbumEntry albumEntry1118 = albumEntry13;
        AlbumEntry albumEntry1119 = albumEntry2;
        Integer num13 = objValueOf;
        while (i11 < arrayList5.size()) {
            Collections.sort(((AlbumEntry) arrayList5.get(i11)).photos, new q(6));
        }
        broadcastNewPhotos(i10, arrayList5, arrayList2, num13, albumEntry1119, albumEntry3, albumEntry1118, 0);
    }

    public void lambda$loadMoreMusic$11(int i10, TLRPC.TL_error tL_error, TLObject tLObject, int i11) {
        PlaylistGlobalSearchParams playlistGlobalSearchParams;
        if (this.playlistClassGuid != i10 || (playlistGlobalSearchParams = this.playlistGlobalSearchParams) == null || this.playingMessageObject == null || tL_error != null) {
            return;
        }
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
        this.playlistGlobalSearchParams.endReached = this.playlist.size() == this.playlistGlobalSearchParams.totalCount;
        if (SharedConfig.shuffleMusic) {
            buildShuffledPlayList();
        }
        if (i12 != 0) {
            NotificationCenter.getInstance(this.playingMessageObject.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.moreMusicDidLoad, Integer.valueOf(i12));
        }
    }

    public void lambda$loadMoreMusic$12(int i10, int i11, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new nh.j4(i10, i11, this, tLObject, tL_error));
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
                ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(this.recordBufferSize);
                byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
                this.recordBuffers.add(byteBufferAllocateDirect);
            }
        } catch (Exception e9) {
            FileLog.e(e9);
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
        } catch (Exception e9) {
            FileLog.e(e9);
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
            m61 m61Var = this.emojiSoundPlayer;
            if (m61Var != null) {
                m61Var.I();
            }
            m61 m61Var2 = new m61(false, false);
            this.emojiSoundPlayer = m61Var2;
            m61Var2.F = new AnonymousClass8(i10);
            this.emojiSoundPlayer.E(Uri.fromFile(file), "other");
            this.emojiSoundPlayer.T(3);
            this.emojiSoundPlayer.D();
        } catch (Exception e9) {
            FileLog.e(e9);
            m61 m61Var3 = this.emojiSoundPlayer;
            if (m61Var3 != null) {
                m61Var3.I();
                this.emojiSoundPlayer = null;
            }
        }
    }

    public static void lambda$playEmojiSound$18(AccountInstance accountInstance, TLRPC.Document document) {
        accountInstance.getFileLoader().loadFile(document, null, 1, 1);
    }

    public void lambda$playEmojiSound$19(MessagesController.EmojiSound emojiSound, AccountInstance accountInstance, boolean z10) {
        TLRPC.TL_document tL_document = new TLRPC.TL_document();
        tL_document.access_hash = emojiSound.accessHash;
        tL_document.f22386id = emojiSound.f19623id;
        tL_document.mime_type = "sound/ogg";
        tL_document.file_reference = emojiSound.fileReference;
        tL_document.dc_id = accountInstance.getConnectionsManager().getCurrentDatacenterId();
        File pathToAttach = FileLoader.getInstance(accountInstance.getCurrentAccount()).getPathToAttach(tL_document, true);
        if (!pathToAttach.exists()) {
            AndroidUtilities.runOnUIThread(new d2(16, accountInstance, tL_document));
        } else {
            if (z10) {
                return;
            }
            AndroidUtilities.runOnUIThread(new d2(14, this, pathToAttach));
        }
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
        setBluetoothScoOn(true);
        this.sendAfterDone = 0;
        TLRPC.TL_document tL_document = new TLRPC.TL_document();
        this.recordingAudio = tL_document;
        this.recordingGuid = i10;
        tL_document.dc_id = Integer.MIN_VALUE;
        tL_document.f22386id = draftVoice.f19617id;
        tL_document.user_id = UserConfig.getInstance(i11).getClientUserId();
        TLRPC.TL_document tL_document2 = this.recordingAudio;
        tL_document2.mime_type = "audio/ogg";
        tL_document2.file_reference = new byte[0];
        SharedConfig.saveConfig();
        this.recordingAudioFile = new File(draftVoice.path) {
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
            this.recordTopicId = messageObject == null ? 0L : MessageObject.getTopicId(this.recordingCurrentAccount, messageObject.messageOwner, false);
            this.recordingCurrentAccount = i11;
            this.recordReplyingMsg = messageObject2;
            this.recordReplyingTopMsg = messageObject;
            this.recordReplyingStory = storyItem;
            this.recordSendMessageChatArguments = this.recordSendMessageChatArguments;
            AndroidUtilities.runOnUIThread(new lk(this, this.recordingAudioFile, this.recordingAudio, draftVoice, 11));
        } catch (Exception e9) {
            FileLog.e(e9);
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
            AndroidUtilities.runOnUIThread(new hh.d9(this, i11, j10, 3));
        }
    }

    public void lambda$processMediaObserver$6(ArrayList arrayList) {
        NotificationCenter.getInstance(this.lastChatAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.screenshotTook, new Object[0]);
        checkScreenshots(arrayList);
    }

    public static void lambda$saveFile$44(boolean[] zArr, DialogInterface dialogInterface) {
        zArr[0] = true;
    }

    public static void lambda$saveFile$45(boolean[] zArr, org.telegram.ui.ActionBar.b2 b2Var) {
        if (zArr[0]) {
            return;
        }
        b2Var.show();
    }

    public static void lambda$saveFile$46(org.telegram.ui.ActionBar.b2 b2Var) {
        try {
            b2Var.dismiss();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public static void lambda$saveFile$47(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        try {
            b2Var.n(i10);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public static void lambda$saveFile$49(org.telegram.ui.ActionBar.b2 b2Var, boolean[] zArr) {
        try {
            if (b2Var.isShowing()) {
                b2Var.dismiss();
            } else {
                zArr[0] = true;
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public static void lambda$saveFile$50(int i10, File file, String str, org.telegram.ui.ActionBar.b2 b2Var, boolean[] zArr, String str2, Utilities.Callback callback, boolean[] zArr2) throws Throwable {
        ?? file2;
        String str3;
        char c10;
        ?? r25;
        boolean z10;
        boolean z11;
        Uri uriFromFile;
        Throwable th;
        Throwable th2;
        try {
            boolean z12 = true;
            if (Build.VERSION.SDK_INT >= 29) {
                uriFromFile = saveFileInternal(i10, file, null);
                if (uriFromFile == null) {
                    z12 = false;
                }
            } else {
                if (i10 == 0) {
                    File file3 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Telegram");
                    file3.mkdirs();
                    file2 = new File(file3, AndroidUtilities.generateFileName(0, FileLoader.getFileExtension(file)));
                } else if (i10 == 1) {
                    File file4 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES), "Telegram");
                    file4.mkdirs();
                    file2 = new File(file4, AndroidUtilities.generateFileName(1, FileLoader.getFileExtension(file)));
                } else {
                    File file5 = new File(i10 == 2 ? Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS) : Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC), "Telegram");
                    file5.mkdirs();
                    file2 = new File(file5, (String) str);
                    if (file2.exists()) {
                        int iLastIndexOf = str.lastIndexOf(46);
                        int i11 = 0;
                        file2 = file2;
                        while (i11 < 10) {
                            if (iLastIndexOf != -1) {
                                str3 = str.substring(0, iLastIndexOf) + "(" + (i11 + 1) + ")" + str.substring(iLastIndexOf);
                            } else {
                                str3 = ((String) str) + "(" + (i11 + 1) + ")";
                            }
                            File file6 = new File(file5, str3);
                            if (!file6.exists()) {
                                file2 = file6;
                                break;
                            } else {
                                i11++;
                                file2 = file6;
                            }
                        }
                    }
                }
                if (!file2.exists()) {
                    file2.createNewFile();
                }
                long jCurrentTimeMillis = System.currentTimeMillis() - 500;
                try {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(file);
                        try {
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                try {
                                    FileChannel channel2 = new FileOutputStream((File) file2).getChannel();
                                    c10 = 0;
                                    try {
                                        try {
                                            long size = channel.size();
                                            try {
                                                if (AndroidUtilities.isInternalUri(((Integer) FileDescriptor.class.getDeclaredMethod("getInt$", null).invoke(fileInputStream.getFD(), null)).intValue())) {
                                                    if (b2Var != null) {
                                                        AndroidUtilities.runOnUIThread(new d1(b2Var, 24));
                                                    }
                                                    if (channel2 != null) {
                                                        try {
                                                            channel2.close();
                                                        } catch (Throwable th3) {
                                                            th2 = th3;
                                                            str = file2;
                                                            if (channel != null) {
                                                                throw th2;
                                                            }
                                                            try {
                                                                channel.close();
                                                                throw th2;
                                                            } catch (Throwable th4) {
                                                                th2.addSuppressed(th4);
                                                                throw th2;
                                                            }
                                                        }
                                                    }
                                                    try {
                                                        channel.close();
                                                        try {
                                                            fileInputStream.close();
                                                            return;
                                                        } catch (Exception e9) {
                                                            e = e9;
                                                            str = file2;
                                                            FileLog.e(e);
                                                            z10 = false;
                                                            r25 = str;
                                                            if (zArr[c10]) {
                                                                r25.delete();
                                                                z11 = false;
                                                            } else {
                                                                z11 = z10;
                                                            }
                                                            if (z11) {
                                                                if (i10 == 2) {
                                                                    ((DownloadManager) ApplicationLoader.applicationContext.getSystemService("download")).addCompletedDownload(r25.getName(), r25.getName(), false, str2, r25.getAbsolutePath(), r25.length(), true);
                                                                } else {
                                                                    AndroidUtilities.addMediaToGallery(r25.getAbsoluteFile());
                                                                }
                                                            }
                                                            uriFromFile = Uri.fromFile(r25);
                                                            z12 = z11;
                                                            if (z12) {
                                                                AndroidUtilities.runOnUIThread(new g6(callback, uriFromFile, 0));
                                                            }
                                                            if (b2Var != null) {
                                                                AndroidUtilities.runOnUIThread(new y5(b2Var, zArr2, 1));
                                                            }
                                                        }
                                                    } catch (Throwable th5) {
                                                        th = th5;
                                                        str = file2;
                                                        try {
                                                            fileInputStream.close();
                                                            throw th;
                                                        } catch (Throwable th6) {
                                                            th.addSuppressed(th6);
                                                            throw th;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th7) {
                                                FileLog.e(th7);
                                            }
                                            long j10 = 0;
                                            file2 = file2;
                                            while (j10 < size && !zArr[0]) {
                                                str = file2;
                                                try {
                                                    channel2.transferFrom(channel, j10, Math.min(4096L, size - j10));
                                                    long j11 = j10;
                                                    if (b2Var != null && jCurrentTimeMillis <= System.currentTimeMillis() - 500) {
                                                        jCurrentTimeMillis = System.currentTimeMillis();
                                                        AndroidUtilities.runOnUIThread(new p6(b2Var, (int) ((j11 / size) * 100.0f), 7));
                                                    }
                                                    j10 = j11 + 4096;
                                                    file2 = str;
                                                } catch (Throwable th8) {
                                                    th = th8;
                                                    Throwable th9 = th;
                                                    if (channel2 == null) {
                                                        throw th9;
                                                    }
                                                    try {
                                                        channel2.close();
                                                        throw th9;
                                                    } catch (Throwable th10) {
                                                        th9.addSuppressed(th10);
                                                        throw th9;
                                                    }
                                                }
                                            }
                                            r25 = file2;
                                            if (channel2 != null) {
                                                channel2.close();
                                            }
                                            channel.close();
                                            fileInputStream.close();
                                            z10 = true;
                                            if (zArr[c10]) {
                                                r25.delete();
                                                z11 = false;
                                            } else {
                                                z11 = z10;
                                            }
                                            if (z11) {
                                                if (i10 == 2) {
                                                    ((DownloadManager) ApplicationLoader.applicationContext.getSystemService("download")).addCompletedDownload(r25.getName(), r25.getName(), false, str2, r25.getAbsolutePath(), r25.length(), true);
                                                } else {
                                                    AndroidUtilities.addMediaToGallery(r25.getAbsoluteFile());
                                                }
                                            }
                                            uriFromFile = Uri.fromFile(r25);
                                            z12 = z11;
                                        } catch (Throwable th11) {
                                            th = th11;
                                            str = file2;
                                        }
                                    } catch (Throwable th12) {
                                        th = th12;
                                        th2 = th;
                                        str = str;
                                        if (channel != null) {
                                            throw th2;
                                        }
                                        channel.close();
                                        throw th2;
                                    }
                                } catch (Throwable th13) {
                                    th = th13;
                                    str = file2;
                                    c10 = 0;
                                }
                            } catch (Throwable th14) {
                                th = th14;
                                str = file2;
                                c10 = 0;
                                th = th;
                                str = str;
                                fileInputStream.close();
                                throw th;
                            }
                        } catch (Throwable th15) {
                            th = th15;
                            th = th;
                            str = str;
                            fileInputStream.close();
                            throw th;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        str = file2;
                        c10 = 0;
                    }
                } catch (Exception e11) {
                    e = e11;
                    FileLog.e(e);
                    z10 = false;
                    r25 = str;
                    if (zArr[c10]) {
                        r25.delete();
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if (z11) {
                        if (i10 == 2) {
                            ((DownloadManager) ApplicationLoader.applicationContext.getSystemService("download")).addCompletedDownload(r25.getName(), r25.getName(), false, str2, r25.getAbsolutePath(), r25.length(), true);
                        } else {
                            AndroidUtilities.addMediaToGallery(r25.getAbsoluteFile());
                        }
                    }
                    uriFromFile = Uri.fromFile(r25);
                    z12 = z11;
                    if (z12) {
                        AndroidUtilities.runOnUIThread(new g6(callback, uriFromFile, 0));
                    }
                    if (b2Var != null) {
                        AndroidUtilities.runOnUIThread(new y5(b2Var, zArr2, 1));
                    }
                }
            }
            if (z12 && callback != null) {
                AndroidUtilities.runOnUIThread(new g6(callback, uriFromFile, 0));
            }
        } catch (Exception e12) {
            FileLog.e(e12);
        }
        if (b2Var != null) {
            AndroidUtilities.runOnUIThread(new y5(b2Var, zArr2, 1));
        }
    }

    public static void lambda$saveFile$51(boolean[] zArr, DialogInterface dialogInterface) {
        zArr[0] = true;
    }

    public static void lambda$saveFile$52(boolean[] zArr, org.telegram.ui.ActionBar.b2 b2Var) {
        if (zArr[0]) {
            return;
        }
        b2Var.show();
    }

    public static void lambda$saveFile$54(org.telegram.ui.ActionBar.b2 b2Var, boolean[] zArr) {
        try {
            if (b2Var.isShowing()) {
                b2Var.dismiss();
            } else {
                zArr[0] = true;
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public static void lambda$saveFile$55(File file, File file2, boolean[] zArr, Utilities.Callback callback, org.telegram.ui.ActionBar.b2 b2Var, boolean[] zArr2) {
        Uri uriFromFile = null;
        boolean z10 = false;
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                String strGenerateFileName = AndroidUtilities.generateFileName(0, "jpg");
                ContentValues contentValues = new ContentValues();
                Uri contentUri = MediaStore.Images.Media.getContentUri("external_primary");
                contentValues.put("relative_path", new File(Environment.DIRECTORY_PICTURES, "Telegram") + File.separator);
                contentValues.put("_display_name", strGenerateFileName);
                contentValues.put("mime_type", "image/jpeg");
                contentValues.put("mime_type", "image/jpeg");
                Uri uriInsert = ApplicationLoader.applicationContext.getContentResolver().insert(contentUri, contentValues);
                if (uriInsert != null) {
                    OutputStream outputStreamOpenOutputStream = ApplicationLoader.applicationContext.getContentResolver().openOutputStream(uriInsert);
                    if (outputStreamOpenOutputStream != null) {
                        try {
                            writeMotionPhoto(file, file2, outputStreamOpenOutputStream, zArr);
                            z10 = !zArr[0];
                        } catch (Throwable th) {
                            try {
                                outputStreamOpenOutputStream.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    }
                    if (outputStreamOpenOutputStream != null) {
                        outputStreamOpenOutputStream.close();
                    }
                    if (z10) {
                        uriFromFile = uriInsert;
                    } else {
                        try {
                            ApplicationLoader.applicationContext.getContentResolver().delete(uriInsert, null, null);
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
                try {
                    writeMotionPhoto(file, file2, fileOutputStream, zArr);
                    fileOutputStream.close();
                    if (zArr[0]) {
                        file4.delete();
                    } else {
                        AndroidUtilities.addMediaToGallery(file4.getAbsoluteFile());
                        uriFromFile = Uri.fromFile(file4);
                        z10 = true;
                    }
                } catch (Throwable th3) {
                    try {
                        fileOutputStream.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        if (z10 && callback != null) {
            AndroidUtilities.runOnUIThread(new g6(callback, uriFromFile, 1));
        }
        if (b2Var != null) {
            AndroidUtilities.runOnUIThread(new y5(b2Var, zArr2, 3));
        }
    }

    public void lambda$setCurrentVideoVisible$14() {
        cleanupPlayer(true, true);
    }

    public void lambda$setPlaybackSpeed$16(MessageObject messageObject, float f10) {
        if (this.audioPlayer == null || this.playingMessageObject == null || this.isPaused) {
            return;
        }
        if (isSamePlayingMessage(messageObject)) {
            seekToProgress(this.playingMessageObject, f10);
        }
        this.audioPlayer.D();
    }

    public void lambda$setTextureView$15() {
        cleanupPlayer(true, true);
    }

    public static int lambda$sortPlaylist$13(MessageObject messageObject, MessageObject messageObject2) {
        int iCompare;
        int id2 = messageObject.getId();
        int id3 = messageObject2.getId();
        long j10 = messageObject.messageOwner.grouped_id;
        long j11 = messageObject2.messageOwner.grouped_id;
        if (id2 >= 0 || id3 >= 0) {
            if (j10 == 0 || j10 != j11) {
                return Integer.compare(id2, id3);
            }
            iCompare = Integer.compare(id3, id2);
        } else {
            if (j10 == 0 || j10 != j11) {
                return Integer.compare(id3, id2);
            }
            iCompare = Integer.compare(id2, id3);
        }
        return -iCompare;
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
            final int i12 = 0;
            AndroidUtilities.runOnUIThread(new Runnable(this) {

                public final MediaController f20741b;

                {
                    this.f20741b = this;
                }

                @Override
                public final void run() {
                    switch (i12) {
                        case 0:
                            this.f20741b.lambda$startRecording$33(i10, i11);
                            break;
                        case 1:
                            this.f20741b.lambda$startRecording$34(i10, i11);
                            break;
                        case 2:
                            this.f20741b.lambda$startRecording$35(i10, i11);
                            break;
                        default:
                            this.f20741b.lambda$startRecording$36(i10, i11);
                            break;
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
        tL_document.f22386id = SharedConfig.getLastLocalId();
        this.recordingAudio.user_id = UserConfig.getInstance(i10).getClientUserId();
        TLRPC.TL_document tL_document2 = this.recordingAudio;
        tL_document2.mime_type = "audio/ogg";
        tL_document2.file_reference = new byte[0];
        SharedConfig.saveConfig();
        this.recordingAudioFile = new File(FileLoader.getDirectory(1), System.currentTimeMillis() + "_" + FileLoader.getAttachFileName(this.recordingAudio)) {
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
                final int i13 = 1;
                AndroidUtilities.runOnUIThread(new Runnable(this) {

                    public final MediaController f20741b;

                    {
                        this.f20741b = this;
                    }

                    @Override
                    public final void run() {
                        switch (i13) {
                            case 0:
                                this.f20741b.lambda$startRecording$33(i10, i11);
                                break;
                            case 1:
                                this.f20741b.lambda$startRecording$34(i10, i11);
                                break;
                            case 2:
                                this.f20741b.lambda$startRecording$35(i10, i11);
                                break;
                            default:
                                this.f20741b.lambda$startRecording$36(i10, i11);
                                break;
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
            long topicId = 0;
            this.recordTimeCount = 0L;
            this.writtenFrame = 0;
            this.samplesCount = 0L;
            this.recordDialogId = j10;
            this.recordMonoForumPeerId = j11;
            this.recordMonoForumSuggestionParams = messageSuggestionParams;
            if (messageObject != null) {
                topicId = MessageObject.getTopicId(this.recordingCurrentAccount, messageObject.messageOwner, false);
            }
            this.recordTopicId = topicId;
            this.recordingCurrentAccount = i10;
            this.recordReplyingMsg = messageObject2;
            this.recordReplyingTopMsg = messageObject;
            this.recordReplyingStory = storyItem;
            this.recordSendMessageChatArguments = sendMessageChatArguments;
            this.fileBuffer.rewind();
            this.audioRecorder.startRecording();
            this.recordQueue.postRunnable(this.recordRunnable);
            final int i14 = 3;
            AndroidUtilities.runOnUIThread(new Runnable(this) {

                public final MediaController f20741b;

                {
                    this.f20741b = this;
                }

                @Override
                public final void run() {
                    switch (i14) {
                        case 0:
                            this.f20741b.lambda$startRecording$33(i10, i11);
                            break;
                        case 1:
                            this.f20741b.lambda$startRecording$34(i10, i11);
                            break;
                        case 2:
                            this.f20741b.lambda$startRecording$35(i10, i11);
                            break;
                        default:
                            this.f20741b.lambda$startRecording$36(i10, i11);
                            break;
                    }
                }
            });
        } catch (Exception e9) {
            FileLog.e(e9);
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
            final int i15 = 2;
            AndroidUtilities.runOnUIThread(new Runnable(this) {

                public final MediaController f20741b;

                {
                    this.f20741b = this;
                }

                @Override
                public final void run() {
                    switch (i15) {
                        case 0:
                            this.f20741b.lambda$startRecording$33(i10, i11);
                            break;
                        case 1:
                            this.f20741b.lambda$startRecording$34(i10, i11);
                            break;
                        case 2:
                            this.f20741b.lambda$startRecording$35(i10, i11);
                            break;
                        default:
                            this.f20741b.lambda$startRecording$36(i10, i11);
                            break;
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
        NotificationCenter.getInstance(this.recordingCurrentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStopped, Integer.valueOf(this.recordingGuid), Integer.valueOf(i10 == 2 ? 1 : 0));
    }

    public void lambda$stopRecording$43(int i10, boolean z10, int i11, boolean z11, long j10) {
        if (this.sendAfterDone == 3) {
            this.sendAfterDone = 0;
            stopRecordingInternal(i10, z10, i11, z11, j10);
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
            this.sendAfterDoneNotify = z10;
            this.sendAfterDoneScheduleDate = i11;
            this.sendAfterDoneOnce = z11;
            this.sendAfterDonePayStars = j10;
            audioRecord.stop();
            setBluetoothScoOn(false);
        } catch (Exception e9) {
            FileLog.e(e9);
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
        AndroidUtilities.runOnUIThread(new a6(this, i10, 1));
    }

    public void lambda$stopRecordingInternal$40(File file, TLRPC.TL_document tL_document, int i10, boolean z10, int i11, boolean z11, long j10) {
        boolean z12;
        char c10;
        String str;
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb2 = new StringBuilder("stop recording internal ");
            if (file == null) {
                str = "null";
            } else {
                str = file.exists() + " " + file.length() + "  recordTimeCount " + this.recordTimeCount + " writedFrames" + this.writtenFrame;
            }
            org.telegram.ui.Cells.pa.v(str, sb2);
        }
        if ((file == null || !file.exists()) && BuildVars.DEBUG_VERSION) {
            FileLog.e(new RuntimeException("file not found :( recordTimeCount " + this.recordTimeCount + " writedFrames" + this.writtenFrame));
        }
        MediaDataController.getInstance(this.recordingCurrentAccount).pushDraftVoiceMessage(this.recordDialogId, this.recordTopicId, null);
        tL_document.date = ConnectionsManager.getInstance(this.recordingCurrentAccount).getCurrentTime();
        tL_document.size = file == null ? 0L : (int) file.length();
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
                c10 = 1;
                SendMessagesHelper.SendMessageParams sendMessageParamsOf = SendMessagesHelper.SendMessageParams.of(tL_document, null, file.getAbsolutePath(), this.recordDialogId, this.recordReplyingMsg, this.recordReplyingTopMsg, null, null, null, null, z10, i11, 0, z11 ? Integer.MAX_VALUE : 0, null, null, false);
                sendMessageParamsOf.monoForumPeer = this.recordMonoForumPeerId;
                sendMessageParamsOf.suggestionParams = this.recordMonoForumSuggestionParams;
                sendMessageParamsOf.replyToStoryItem = this.recordReplyingStory;
                sendMessageParamsOf.sendMessageChatArguments = this.recordSendMessageChatArguments;
                sendMessageParamsOf.payStars = j10;
                SendMessagesHelper.getInstance(this.recordingCurrentAccount).sendMessage(sendMessageParamsOf);
            } else {
                c10 = 1;
            }
            NotificationCenter notificationCenter = NotificationCenter.getInstance(this.recordingCurrentAccount);
            int i12 = NotificationCenter.audioDidSent;
            Integer numValueOf = Integer.valueOf(this.recordingGuid);
            TLRPC.TL_document tL_document2 = i10 == 2 ? tL_document : null;
            String absolutePath = i10 == 2 ? file.getAbsolutePath() : null;
            Object[] objArr = new Object[3];
            z12 = false;
            objArr[0] = numValueOf;
            objArr[c10] = tL_document2;
            objArr[2] = absolutePath;
            notificationCenter.lambda$postNotificationNameOnUIThread$1(i12, objArr);
        } else {
            z12 = false;
            NotificationCenter.getInstance(this.recordingCurrentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioRecordTooShort, Integer.valueOf(this.recordingGuid), Boolean.FALSE, Integer.valueOf((int) j11));
            AutoDeleteMediaTask.unlockFile(file);
            file.delete();
        }
        requestRecordAudioFocus(z12);
    }

    public void lambda$stopRecordingInternal$41(File file, File file2, TLRPC.TL_document tL_document, int i10, boolean z10, int i11, boolean z11, long j10) {
        stopRecord();
        File fileJoinRecord = joinRecord(file, file2, tL_document);
        if (fileJoinRecord == null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("stop recording recordingAudioFileToSend == null in queue");
                return;
            }
            return;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("stop recording internal in queue " + fileJoinRecord.exists() + " " + fileJoinRecord.length());
        }
        AndroidUtilities.runOnUIThread(new l6(this, fileJoinRecord, tL_document, i10, z10, i11, z11, j10));
    }

    public void lambda$toggleRecordingPause$27(File file, boolean z10, TLRPC.TL_document tL_document) {
        boolean zExists = file.exists();
        if (!zExists && BuildVars.DEBUG_VERSION) {
            FileLog.e(new RuntimeException("file not found :( recordTimeCount " + this.recordTimeCount + " writedFrames" + this.writtenFrame));
        }
        if (zExists) {
            MediaDataController.getInstance(this.recordingCurrentAccount).pushDraftVoiceMessage(this.recordDialogId, this.recordTopicId, MediaDataController.DraftVoice.of(this, file.getAbsolutePath(), z10, 0.0f, 1.0f));
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

    public void lambda$toggleRecordingPause$28(boolean z10) {
        stopRecord();
        TLRPC.TL_document tL_document = this.recordingAudio;
        File fileJoinRecord = joinRecord(this.recordingPrevAudioFile, this.recordingAudioFile, tL_document);
        if (tL_document == null || fileJoinRecord == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new qj(this, fileJoinRecord, z10, tL_document, 5));
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
        File file = new File(FileLoader.getDirectory(1), System.currentTimeMillis() + "_" + FileLoader.getAttachFileName(this.recordingAudio)) {
            @Override
            public boolean delete() {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("delete voice file (from resume)");
                }
                return super.delete();
            }
        };
        this.recordingAudioFile = file;
        if (startRecord(file.getPath(), this.sampleRate) != 0) {
            AndroidUtilities.runOnUIThread(new w5(this, 3));
            return;
        }
        AndroidUtilities.runOnUIThread(new w5(this, 2));
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("cant resume audio encoder");
        }
    }

    public void lambda$toggleRecordingPause$32(boolean z10) {
        if (this.recordingAudio == null || this.recordingAudioFile == null) {
            return;
        }
        boolean z11 = this.audioRecorderPaused;
        this.audioRecorderPaused = !z11;
        if (z11) {
            this.recordQueue.cancelRunnable(this.recordRunnable);
            this.recordQueue.postRunnable(new w5(this, 9));
            return;
        }
        AudioRecord audioRecord = this.audioRecorder;
        if (audioRecord == null) {
            return;
        }
        this.sendAfterDone = 4;
        audioRecord.stop();
        this.audioRecorder.release();
        this.audioRecorder = null;
        this.recordQueue.postRunnable(new m6(this, z10, 0));
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
        Thread thread = new Thread(new nh.k2(i10, 1));
        thread.setPriority(1);
        thread.start();
    }

    public static int makeVideoBitrate(int i10, int i11, int i12, int i13, int i14) {
        int i15;
        float f10;
        int iMin;
        int videoBitrateWithFactor;
        float f11 = 1.0f;
        if (Math.min(i13, i14) < 1080) {
            if (Math.min(i13, i14) >= 720) {
                i15 = 2600000;
            } else if (Math.min(i13, i14) >= 480) {
                i15 = 1000000;
                f11 = 0.75f;
                f10 = 0.9f;
            } else {
                i15 = 750000;
                f11 = 0.6f;
                f10 = 0.7f;
            }
            iMin = (int) (((int) (i12 / Math.min(i10 / i13, i11 / i14))) * f11);
            videoBitrateWithFactor = (int) (getVideoBitrateWithFactor(f10) / (921600.0f / (i14 * i13)));
            if (i12 < videoBitrateWithFactor) {
                return iMin;
            }
            if (iMin > i15) {
                return i15;
            }
            return Math.max(iMin, videoBitrateWithFactor);
        }
        i15 = 6800000;
        f10 = 1.0f;
        iMin = (int) (((int) (i12 / Math.min(i10 / i13, i11 / i14))) * f11);
        videoBitrateWithFactor = (int) (getVideoBitrateWithFactor(f10) / (921600.0f / (i14 * i13)));
        if (i12 < videoBitrateWithFactor) {
            return iMin;
        }
        if (iMin > i15) {
            return i15;
        }
        return Math.max(iMin, videoBitrateWithFactor);
    }

    public void playNextMessageWithoutOrder(boolean z10) {
        int i10;
        ArrayList<MessageObject> arrayList = SharedConfig.shuffleMusic ? this.shuffledPlaylist : this.playlist;
        if (z10 && (((i10 = SharedConfig.repeatMode) == 2 || (i10 == 1 && arrayList.size() == 1)) && !this.forceLoopCurrentPlaylist)) {
            cleanupPlayer(false, false);
            int i11 = this.currentPlaylistNum;
            if (i11 < 0 || i11 >= arrayList.size()) {
                return;
            }
            MessageObject messageObject = arrayList.get(this.currentPlaylistNum);
            messageObject.audioProgress = 0.0f;
            messageObject.audioProgressSec = 0;
            playMessage(messageObject);
            return;
        }
        if (!traversePlaylist(arrayList, SharedConfig.playOrderReversed ? 1 : -1) || !z10 || SharedConfig.repeatMode != 0 || this.forceLoopCurrentPlaylist) {
            int i12 = this.currentPlaylistNum;
            if (i12 < 0 || i12 >= arrayList.size()) {
                return;
            }
            MessageObject messageObject2 = this.playingMessageObject;
            if (messageObject2 != null) {
                messageObject2.resetPlayingProgress();
            }
            this.playMusicAgain = true;
            playMessage(arrayList.get(this.currentPlaylistNum));
            return;
        }
        m61 m61Var = this.audioPlayer;
        if (m61Var == null && this.videoPlayer == null) {
            return;
        }
        if (m61Var != null) {
            MusicListenReporter musicListenReporter = this.reporter;
            if (musicListenReporter != null) {
                musicListenReporter.destroy();
                this.reporter = null;
            }
            try {
                this.audioPlayer.I();
            } catch (Exception e9) {
                FileLog.e(e9);
            }
            this.audioPlayer = null;
            org.telegram.ui.ActionBar.g6.G1(this.playingMessageObject);
        } else {
            this.currentAspectRatioFrameLayout = null;
            this.currentTextureViewContainer = null;
            this.currentAspectRatioFrameLayoutReady = false;
            this.currentTextureView = null;
            this.videoPlayer.I();
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
        MessageObject messageObject3 = this.playingMessageObject;
        messageObject3.audioProgress = 0.0f;
        messageObject3.audioProgressSec = 0;
        NotificationCenter.getInstance(messageObject3.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagePlayingProgressDidChanged, Integer.valueOf(this.playingMessageObject.getId()), 0);
        NotificationCenter.getInstance(this.playingMessageObject.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagePlayingPlayStateChanged, Integer.valueOf(this.playingMessageObject.getId()));
    }

    public void processMediaObserver(Uri uri) {
        Cursor cursorQuery = null;
        try {
            Point realScreenSize = AndroidUtilities.getRealScreenSize();
            cursorQuery = ApplicationLoader.applicationContext.getContentResolver().query(uri, this.mediaProjections, null, null, "date_added DESC LIMIT 1");
            ArrayList arrayList = new ArrayList();
            if (cursorQuery != null) {
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(0);
                    String string2 = cursorQuery.getString(1);
                    String string3 = cursorQuery.getString(2);
                    long j10 = cursorQuery.getLong(3);
                    String string4 = cursorQuery.getString(4);
                    int i10 = cursorQuery.getInt(5);
                    int i11 = cursorQuery.getInt(6);
                    if (string == null || !string.toLowerCase().contains("screenshot")) {
                        if ((string2 == null || !string2.toLowerCase().contains("screenshot")) && ((string3 == null || !string3.toLowerCase().contains("screenshot")) && (string4 == null || !string4.toLowerCase().contains("screenshot")))) {
                        }
                    }
                    if (i10 == 0 || i11 == 0) {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(string, options);
                        i10 = options.outWidth;
                        i11 = options.outHeight;
                    }
                    if (i10 > 0 && i11 > 0) {
                        try {
                            int i12 = realScreenSize.x;
                            if ((i10 != i12 || i11 != realScreenSize.y) && (i11 != i12 || i10 != realScreenSize.y)) {
                            }
                        } catch (Exception unused) {
                            arrayList.add(Long.valueOf(j10));
                        }
                    }
                    arrayList.add(Long.valueOf(j10));
                }
                cursorQuery.close();
            }
            if (!arrayList.isEmpty()) {
                AndroidUtilities.runOnUIThread(new d2(15, this, arrayList));
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        } finally {
            if (cursorQuery != null) {
                try {
                    cursorQuery.close();
                } catch (Exception unused2) {
                }
            }
        }
    }

    private void raiseToSpeakUpdated(boolean z10) {
        if (this.recordingAudio != null) {
            toggleRecordingPause(false);
            return;
        }
        if (!z10) {
            stopRecording(2, false, 0, false, 0L);
            return;
        }
        int currentAccount = this.raiseChat.getCurrentAccount();
        long jA = this.raiseChat.a();
        rn rnVar = this.raiseChat;
        MessageObject messageObject = rnVar.T3;
        int classGuid = rnVar.getClassGuid();
        rn rnVar2 = this.raiseChat;
        SendMessageChatArguments sendMessageChatArgumentsC8 = rnVar2 != null ? rnVar2.C8() : null;
        rn rnVar3 = this.raiseChat;
        long jN8 = rnVar3 != null ? rnVar3.N8() : 0L;
        rn rnVar4 = this.raiseChat;
        startRecording(currentAccount, jA, null, messageObject, null, classGuid, false, sendMessageChatArgumentsC8, jN8, rnVar4 != null ? rnVar4.f42006c5 : null);
    }

    public boolean restoreMusicPlaylistState() {
        int i10;
        MessageObject messageObject;
        SavedMusicPlaylistState savedMusicPlaylistState = this.savedMusicPlaylistState;
        if (savedMusicPlaylistState == null) {
            return false;
        }
        this.savedMusicPlaylistState = null;
        ArrayList<MessageObject> arrayList = SharedConfig.shuffleMusic ? this.shuffledPlaylist : this.playlist;
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
                if (messageObject.isVoice() || messageObject.isRoundVideo()) {
                    this.audioVolume = 1.0f;
                    setPlayerVolume();
                } else {
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.audioVolume, 1.0f);
                    this.audioVolumeAnimator = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(this.audioVolumeUpdateListener);
                    this.audioVolumeAnimator.setDuration(300L);
                    this.audioVolumeAnimator.start();
                }
                m61 m61Var = this.audioPlayer;
                if (m61Var != null) {
                    m61Var.D();
                } else {
                    m61 m61Var2 = this.videoPlayer;
                    if (m61Var2 != null) {
                        m61Var2.D();
                    }
                }
                checkAudioFocus(messageObject);
                this.isPaused = false;
                NotificationCenter.getInstance(this.playingMessageObject.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagePlayingPlayStateChanged, Integer.valueOf(this.playingMessageObject.getId()));
                try {
                    d1.f.b(1);
                    if (!this.ignorePlayerUpdate) {
                        d1.f.w(true);
                    }
                } catch (Exception e9) {
                    FileLog.e(e9);
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
        Uri contentUri;
        try {
            ContentValues contentValues = new ContentValues();
            String fileExtension = FileLoader.getFileExtension(file);
            String mimeTypeFromExtension = fileExtension != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtension) : null;
            if ((i10 == 0 || i10 == 1) && mimeTypeFromExtension != null) {
                if (mimeTypeFromExtension.startsWith("image")) {
                    i10 = 0;
                }
                if (mimeTypeFromExtension.startsWith("video")) {
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
                contentValues.put("mime_type", mimeTypeFromExtension);
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
            contentValues.put("mime_type", mimeTypeFromExtension);
            Uri uriInsert = ApplicationLoader.applicationContext.getContentResolver().insert(contentUri, contentValues);
            if (uriInsert != null) {
                FileInputStream fileInputStream = new FileInputStream(file);
                AndroidUtilities.copyFile(fileInputStream, ApplicationLoader.applicationContext.getContentResolver().openOutputStream(uriInsert));
                fileInputStream.close();
            }
            return uriInsert;
        } catch (Exception e9) {
            FileLog.e(e9);
            return null;
        }
    }

    public static void saveFilesFromMessages(Context context, AccountInstance accountInstance, ArrayList<MessageObject> arrayList, MessagesStorage.IntCallback intCallback) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        new MediaLoader(context, accountInstance, arrayList, intCallback).start();
    }

    private boolean saveMusicPlaylistStateIfNeeded() {
        MessageObject messageObject = this.playingMessageObject;
        if (messageObject == null || !messageObject.isMusic() || this.playlist.isEmpty()) {
            return this.savedMusicPlaylistState != null;
        }
        this.savedMusicPlaylistState = new SavedMusicPlaylistState(this.playingMessageObject);
        return true;
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
            }
        }
        return mediaCodecInfo;
    }

    public static int selectColorFormat(MediaCodecInfo mediaCodecInfo, String str) {
        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = capabilitiesForType.colorFormats;
            if (i10 >= iArr.length) {
                return i11;
            }
            int i12 = iArr[i10];
            if (isRecognizedFormat(i12)) {
                if (!mediaCodecInfo.getName().equals("OMX.SEC.AVC.Encoder") || i12 != 19) {
                    return i12;
                }
                i11 = i12;
            }
            i10++;
        }
    }

    private void setBluetoothScoOn(boolean z10) {
        AudioManager audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService("audio");
        if (SharedConfig.recordViaSco && !pd0.f("android.permission.BLUETOOTH_CONNECT")) {
            SharedConfig.recordViaSco = false;
            SharedConfig.saveConfig();
        }
        if (!(audioManager.isBluetoothScoAvailableOffCall() && SharedConfig.recordViaSco) && z10) {
            return;
        }
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            try {
                if (defaultAdapter.getProfileConnectionState(1) != 2) {
                    if (z10) {
                        return;
                    }
                }
            } catch (SecurityException unused) {
                return;
            } catch (Throwable th) {
                FileLog.e(th);
                return;
            }
        } else if (z10) {
            return;
        }
        if (z10 && !audioManager.isBluetoothScoOn()) {
            audioManager.startBluetoothSco();
        } else {
            if (z10 || !audioManager.isBluetoothScoOn()) {
                return;
            }
            audioManager.stopBluetoothSco();
        }
    }

    public void setPlayerVolume() {
        float f10;
        try {
            float f11 = 0.0f;
            if (this.isSilent) {
                f10 = 0.0f;
            } else {
                f10 = this.audioFocus != 1 ? 1.0f : 0.2f;
            }
            m61 m61Var = this.audioPlayer;
            if (m61Var != null) {
                if (!d1.f.t()) {
                    f11 = this.audioVolume * f10;
                }
                m61Var.X(f11);
            } else {
                m61 m61Var2 = this.videoPlayer;
                if (m61Var2 != null) {
                    if (!d1.f.t()) {
                        f11 = f10;
                    }
                    m61Var2.X(f11);
                }
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    private void setUseFrontSpeaker(boolean z10) {
        this.useFrontSpeaker = z10;
        AudioManager audioManager = NotificationsController.audioManager;
        if (!z10) {
            audioManager.setSpeakerphoneOn(true);
        } else {
            audioManager.setBluetoothScoOn(false);
            audioManager.setSpeakerphoneOn(false);
        }
    }

    private void sortPlaylist() {
        Collections.sort(this.playlist, new q(7));
    }

    private void startAudioAgain(boolean z10) {
        MessageObject messageObject = this.playingMessageObject;
        if (messageObject == null) {
            return;
        }
        NotificationCenter.getInstance(messageObject.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioRouteChanged, Boolean.valueOf(this.useFrontSpeaker));
        m61 m61Var = this.videoPlayer;
        if (m61Var != null) {
            m61Var.T(this.useFrontSpeaker ? 0 : 3);
            if (z10) {
                lambda$startAudioAgain$7(this.playingMessageObject);
                return;
            }
            if (this.videoPlayer.o() < 1000) {
                this.videoPlayer.L(0L);
            }
            this.videoPlayer.D();
            return;
        }
        m61 m61Var2 = this.audioPlayer;
        boolean z11 = m61Var2 != null;
        MessageObject messageObject2 = this.playingMessageObject;
        float f10 = messageObject2.audioProgress;
        int i10 = messageObject2.audioPlayerDuration;
        if (z10 || m61Var2 == null || !m61Var2.z() || i10 * f10 > 1.0f) {
            messageObject2.audioProgress = f10;
        } else {
            messageObject2.audioProgress = 0.0f;
        }
        cleanupPlayer(false, true);
        playMessage(messageObject2);
        if (z10) {
            if (z11) {
                AndroidUtilities.runOnUIThread(new d2(17, this, messageObject2), 100L);
            } else {
                lambda$startAudioAgain$7(messageObject2);
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
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                messageObject.getFileName();
                java.util.Timer timer2 = new java.util.Timer();
                this.progressTimer = timer2;
                timer2.schedule(new AnonymousClass5(messageObject), 0L, 17L);
            } else {
                messageObject.getFileName();
                java.util.Timer timer3 = new java.util.Timer();
                this.progressTimer = timer3;
                timer3.schedule(new AnonymousClass5(messageObject), 0L, 17L);
            }
            throw th;
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
                } catch (Throwable th) {
                    throw th;
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
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
            }
        }
    }

    private native void stopRecord();

    public void stopRecordingInternal(final int i10, final boolean z10, final int i11, final boolean z11, final long j10) {
        final File file;
        if (i10 == 0 || (file = this.recordingAudioFile) == null) {
            AutoDeleteMediaTask.unlockFile(this.recordingAudioFile);
            File file2 = this.recordingAudioFile;
            if (file2 != null) {
                file2.delete();
            }
            requestRecordAudioFocus(false);
        } else {
            final TLRPC.TL_document tL_document = this.recordingAudio;
            final File file3 = this.recordingPrevAudioFile;
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("stop recording internal filename " + this.recordingAudioFile.getPath());
            }
            this.fileEncodingQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f20106a.lambda$stopRecordingInternal$41(file3, file, tL_document, i10, z10, i11, z11, j10);
                }
            });
        }
        try {
            AudioRecord audioRecord = this.audioRecorder;
            if (audioRecord != null) {
                audioRecord.release();
                this.audioRecorder = null;
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        this.recordingAudio = null;
        this.recordingPrevAudioFile = null;
        this.recordingAudioFile = null;
        this.manualRecording = false;
        this.raiseToEarRecord = false;
        this.ignoreOnPause = false;
    }

    private boolean traversePlaylist(ArrayList<MessageObject> arrayList, int i10) {
        MessageObject messageObject;
        int i11;
        MessageObject messageObject2;
        int i12 = this.currentPlaylistNum;
        boolean z10 = ConnectionsManager.getInstance(UserConfig.selectedAccount).getConnectionState() == 2;
        this.currentPlaylistNum += i10;
        if (z10) {
            while (this.currentPlaylistNum < arrayList.size() && (i11 = this.currentPlaylistNum) >= 0 && ((messageObject2 = arrayList.get(i11)) == null || !messageObject2.mediaExists)) {
                this.currentPlaylistNum += i10;
            }
        }
        if (this.currentPlaylistNum < arrayList.size() && this.currentPlaylistNum >= 0) {
            return false;
        }
        this.currentPlaylistNum = this.currentPlaylistNum >= arrayList.size() ? 0 : arrayList.size() - 1;
        if (z10) {
            while (true) {
                int i13 = this.currentPlaylistNum;
                if (i13 >= 0 && i13 < arrayList.size()) {
                    int i14 = this.currentPlaylistNum;
                    if (i10 <= 0) {
                        if (i14 < i12) {
                            break;
                        }
                        messageObject = arrayList.get(this.currentPlaylistNum);
                        if (messageObject == null) {
                        }
                        this.currentPlaylistNum += i10;
                    } else {
                        if (i14 > i12) {
                            break;
                        }
                        messageObject = arrayList.get(this.currentPlaylistNum);
                        if (messageObject == null && messageObject.mediaExists) {
                            break;
                        }
                        this.currentPlaylistNum += i10;
                    }
                } else {
                    break;
                }
            }
            if (this.currentPlaylistNum >= arrayList.size() || this.currentPlaylistNum < 0) {
                this.currentPlaylistNum = this.currentPlaylistNum < arrayList.size() ? arrayList.size() - 1 : 0;
            }
        }
        return true;
    }

    public void updateVideoState(MessageObject messageObject, int[] iArr, boolean z10, boolean z11, int i10) {
        MessageObject messageObject2;
        if (this.videoPlayer == null) {
            return;
        }
        if (i10 == 4 || i10 == 1) {
            try {
                this.baseActivity.getWindow().clearFlags(128);
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        } else {
            try {
                this.baseActivity.getWindow().addFlags(128);
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
            return;
        }
        if (i10 == 2) {
            if (!z11 || (messageObject2 = this.playingMessageObject) == null) {
                return;
            }
            if (messageObject2.isVideo() || this.playingMessageObject.isRoundVideo()) {
                if (this.playerWasReady) {
                    this.setLoadingRunnable.run();
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(this.setLoadingRunnable, 1000L);
                    return;
                }
            }
            return;
        }
        if (this.videoPlayer.z() && i10 == 4) {
            MessageObject messageObject4 = this.playingMessageObject;
            if (messageObject4 == null || !messageObject4.isVideo() || z10 || (iArr != null && iArr[0] >= 4)) {
                if (restoreMusicPlaylistState()) {
                    return;
                }
                cleanupPlayer(true, hasNoNextVoiceOrRoundVideoMessage(), true, false);
            } else {
                this.videoPlayer.L(0L);
                if (iArr != null) {
                    iArr[0] = iArr[0] + 1;
                }
            }
        }
    }

    public native int writeFrame(ByteBuffer byteBuffer, int i10);

    public static void writeMotionPhoto(File file, File file2, OutputStream outputStream, boolean[] zArr) throws IOException {
        String strBuildMotionPhotoXmp = buildMotionPhotoXmp(file2.length());
        byte[] bytes = "http://ns.adobe.com/xap/1.0/\u0000".getBytes("UTF-8");
        byte[] bytes2 = strBuildMotionPhotoXmp.getBytes("UTF-8");
        int length = bytes.length + bytes2.length + 2;
        if (length > 65535) {
            throw new IOException(i0.a.k(length, "XMP segment too large: "));
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            int i10 = fileInputStream.read();
            int i11 = fileInputStream.read();
            if (i10 != 255 || i11 != 216) {
                throw new IOException("Not a JPEG: " + file);
            }
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
                int i12 = fileInputStream.read(bArr);
                if (i12 <= 0) {
                    fileInputStream.close();
                    FileInputStream fileInputStream2 = new FileInputStream(file2);
                    try {
                        byte[] bArr2 = new byte[65536];
                        while (true) {
                            int i13 = fileInputStream2.read(bArr2);
                            if (i13 <= 0) {
                                fileInputStream2.close();
                                return;
                            } else {
                                if (zArr != null && zArr[0]) {
                                    fileInputStream2.close();
                                    return;
                                }
                                outputStream.write(bArr2, 0, i13);
                            }
                        }
                    } catch (Throwable th) {
                        try {
                            fileInputStream2.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } else {
                    if (zArr != null && zArr[0]) {
                        fileInputStream.close();
                        return;
                    }
                    outputStream.write(bArr, 0, i12);
                }
            }
        } catch (Throwable th3) {
            try {
                fileInputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public void cancelVideoConvert(MessageObject messageObject) {
        if (messageObject == null || this.videoConvertQueue.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < this.videoConvertQueue.size(); i10++) {
            VideoConvertMessage videoConvertMessage = this.videoConvertQueue.get(i10);
            MessageObject messageObject2 = videoConvertMessage.messageObject;
            if (messageObject2.equals(messageObject) && messageObject2.currentAccount == messageObject.currentAccount) {
                if (i10 == 0) {
                    synchronized (this.videoConvertSync) {
                        videoConvertMessage.videoEditedInfo.canceled = true;
                    }
                    return;
                } else {
                    this.foregroundConvertingMessages.remove(this.videoConvertQueue.remove(i10));
                    checkForegroundConvertMessage(true);
                    return;
                }
            }
        }
    }

    public void checkIsNextMediaFileDownloaded() {
        MessageObject messageObject = this.playingMessageObject;
        if (messageObject == null || !messageObject.isMusic()) {
            return;
        }
        checkIsNextMusicFileDownloaded(this.playingMessageObject.currentAccount);
    }

    public void checkVolumeBarUI() {
        if (this.isSilent) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (Math.abs(jCurrentTimeMillis - volumeBarLastTimeShown) < 5000) {
                return;
            }
            AudioManager audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService("audio");
            int i10 = this.useFrontSpeaker ? 0 : 3;
            int streamVolume = audioManager.getStreamVolume(i10);
            if (streamVolume == 0) {
                audioManager.adjustStreamVolume(i10, streamVolume, 1);
                volumeBarLastTimeShown = jCurrentTimeMillis;
            }
        } catch (Exception unused) {
        }
    }

    public void cleanRecording(boolean z10) {
        File file;
        File file2;
        this.recordingAudio = null;
        AutoDeleteMediaTask.unlockFile(this.recordingAudioFile);
        if (z10 && (file2 = this.recordingAudioFile) != null) {
            try {
                file2.delete();
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
        this.recordingAudioFile = null;
        if (z10 && (file = this.recordingPrevAudioFile) != null) {
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

    public void cleanupPlayer(boolean z10, boolean z11) {
        cleanupPlayer(z10, z11, false, false);
    }

    public boolean currentPlaylistIsGlobalSearch() {
        return this.playlistGlobalSearchParams != null;
    }

    @Override
    public void didReceivedNotification(int i10, int i11, Object... objArr) {
        MessagesController.SavedMusicList savedMusicList;
        MessageObject messageObject;
        ArrayList<MessageObject> arrayList;
        int iIndexOf;
        int i12 = 0;
        if (i10 == NotificationCenter.fileLoaded || i10 == NotificationCenter.httpFileDidLoad) {
            String str = (String) objArr[0];
            MessageObject messageObject2 = this.playingMessageObject;
            if (messageObject2 != null && messageObject2.currentAccount == i11 && FileLoader.getAttachFileName(messageObject2.getDocument()).equals(str)) {
                if (this.downloadingCurrentMessage) {
                    this.playMusicAgain = true;
                    playMessage(this.playingMessageObject);
                    return;
                } else {
                    if (this.audioInfo == null) {
                        try {
                            this.audioInfo = se.a.a(FileLoader.getInstance(UserConfig.selectedAccount).getPathToMessage(this.playingMessageObject.messageOwner));
                            return;
                        } catch (Exception e9) {
                            FileLog.e(e9);
                            return;
                        }
                    }
                    return;
                }
            }
            return;
        }
        if (i10 == NotificationCenter.messagesDeleted) {
            if (((Boolean) objArr[2]).booleanValue()) {
                return;
            }
            long jLongValue = ((Long) objArr[1]).longValue();
            ArrayList arrayList2 = (ArrayList) objArr[0];
            MessageObject messageObject3 = this.playingMessageObject;
            if (messageObject3 != null && jLongValue == messageObject3.messageOwner.peer_id.channel_id && arrayList2.contains(Integer.valueOf(messageObject3.getId()))) {
                cleanupPlayer(true, true);
            }
            ArrayList<MessageObject> arrayList3 = this.voiceMessagesPlaylist;
            if (arrayList3 == null || arrayList3.isEmpty() || jLongValue != this.voiceMessagesPlaylist.get(0).messageOwner.peer_id.channel_id) {
                return;
            }
            while (i12 < arrayList2.size()) {
                Integer num = (Integer) arrayList2.get(i12);
                MessageObject messageObject4 = this.voiceMessagesPlaylistMap.get(num.intValue());
                this.voiceMessagesPlaylistMap.remove(num.intValue());
                if (messageObject4 != null) {
                    this.voiceMessagesPlaylist.remove(messageObject4);
                }
                i12++;
            }
            return;
        }
        if (i10 == NotificationCenter.removeAllMessagesFromDialog) {
            long jLongValue2 = ((Long) objArr[0]).longValue();
            MessageObject messageObject5 = this.playingMessageObject;
            if (messageObject5 == null || messageObject5.getDialogId() != jLongValue2) {
                return;
            }
            cleanupPlayer(false, true);
            return;
        }
        if (i10 == NotificationCenter.musicDidLoad) {
            long jLongValue3 = ((Long) objArr[0]).longValue();
            MessageObject messageObject6 = this.playingMessageObject;
            if (messageObject6 == null || !messageObject6.isMusic() || this.playingMessageObject.getDialogId() != jLongValue3 || this.playingMessageObject.scheduled) {
                return;
            }
            ArrayList arrayList4 = (ArrayList) objArr[1];
            ArrayList arrayList5 = (ArrayList) objArr[2];
            this.playlist.addAll(0, arrayList4);
            this.playlist.addAll(arrayList5);
            int size = this.playlist.size();
            for (int i13 = 0; i13 < size; i13++) {
                MessageObject messageObject7 = this.playlist.get(i13);
                this.playlistMap.put(Integer.valueOf(messageObject7.getId()), messageObject7);
                int[] iArr = this.playlistMaxId;
                iArr[0] = Math.min(iArr[0], messageObject7.getId());
            }
            sortPlaylist();
            if (SharedConfig.shuffleMusic) {
                buildShuffledPlayList();
            } else {
                MessageObject messageObject8 = this.playingMessageObject;
                if (messageObject8 != null && (iIndexOf = this.playlist.indexOf(messageObject8)) >= 0) {
                    this.currentPlaylistNum = iIndexOf;
                }
            }
            this.playlistClassGuid = ConnectionsManager.generateClassGuid();
            return;
        }
        if (i10 == NotificationCenter.mediaDidLoad) {
            if (((Integer) objArr[3]).intValue() != this.playlistClassGuid || this.playingMessageObject == null) {
                return;
            }
            long jLongValue4 = ((Long) objArr[0]).longValue();
            ((Integer) objArr[4]).getClass();
            ArrayList arrayList6 = (ArrayList) objArr[2];
            DialogObject.isEncryptedDialog(jLongValue4);
            char c10 = jLongValue4 == this.playlistMergeDialogId ? (char) 1 : (char) 0;
            if (!arrayList6.isEmpty()) {
                this.playlistEndReached[c10] = ((Boolean) objArr[5]).booleanValue();
            }
            int i14 = 0;
            for (int i15 = 0; i15 < arrayList6.size(); i15++) {
                MessageObject messageObject9 = (MessageObject) arrayList6.get(i15);
                if (!messageObject9.isVoiceOnce() && !this.playlistMap.containsKey(Integer.valueOf(messageObject9.getId()))) {
                    i14++;
                    this.playlist.add(0, messageObject9);
                    this.playlistMap.put(Integer.valueOf(messageObject9.getId()), messageObject9);
                    int[] iArr2 = this.playlistMaxId;
                    iArr2[c10] = Math.min(iArr2[c10], messageObject9.getId());
                }
            }
            sortPlaylist();
            int iIndexOf2 = this.playlist.indexOf(this.playingMessageObject);
            if (iIndexOf2 >= 0) {
                this.currentPlaylistNum = iIndexOf2;
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
        if (i10 == NotificationCenter.didReceiveNewMessages) {
            if (((Boolean) objArr[2]).booleanValue() || (arrayList = this.voiceMessagesPlaylist) == null || arrayList.isEmpty() || ((Long) objArr[0]).longValue() != this.voiceMessagesPlaylist.get(0).getDialogId()) {
                return;
            }
            ArrayList arrayList7 = (ArrayList) objArr[1];
            while (i12 < arrayList7.size()) {
                MessageObject messageObject10 = (MessageObject) arrayList7.get(i12);
                if ((messageObject10.isVoice() || messageObject10.isRoundVideo()) && !messageObject10.isVoiceOnce() && !messageObject10.isRoundOnce() && (!this.voiceMessagesPlaylistUnread || (messageObject10.isContentUnread() && !messageObject10.isOut()))) {
                    this.voiceMessagesPlaylist.add(messageObject10);
                    this.voiceMessagesPlaylistMap.put(messageObject10.getId(), messageObject10);
                }
                i12++;
            }
            return;
        }
        if (i10 == NotificationCenter.playerDidStartPlaying) {
            if (isCurrentPlayer((m61) objArr[0])) {
                return;
            }
            MessageObject playingMessageObject = getPlayingMessageObject();
            if (playingMessageObject != null && isPlayingMessage(playingMessageObject) && !isMessagePaused() && (playingMessageObject.isMusic() || playingMessageObject.isVoice())) {
                this.wasPlayingAudioBeforePause = true;
            }
            lambda$startAudioAgain$7(playingMessageObject);
            return;
        }
        if (i10 == NotificationCenter.musicListLoaded && (savedMusicList = this.currentSavedMusicList) != null && objArr[0] == savedMusicList) {
            int size2 = savedMusicList.list.size() - this.playlist.size();
            this.playlist.clear();
            this.playlist.addAll(this.currentSavedMusicList.list);
            sortPlaylist();
            if (SharedConfig.shuffleMusic) {
                buildShuffledPlayList();
            } else {
                MessageObject messageObject11 = this.playingMessageObject;
                if (messageObject11 != null) {
                    int iIndexOf3 = this.playlist.indexOf(messageObject11);
                    if (iIndexOf3 >= 0) {
                        this.currentPlaylistNum = iIndexOf3;
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
            if (size2 == 0 || (messageObject = this.playingMessageObject) == null) {
                return;
            }
            NotificationCenter.getInstance(messageObject.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.moreMusicDidLoad, Integer.valueOf(size2));
        }
    }

    public boolean findMessageInPlaylistAndPlay(MessageObject messageObject) {
        int iIndexOf = this.playlist.indexOf(messageObject);
        if (iIndexOf == -1) {
            return playMessage(messageObject);
        }
        playMessageAtIndex(iIndexOf);
        return true;
    }

    public void generateWaveform(MessageObject messageObject) {
        String str = messageObject.getId() + "_" + messageObject.getDialogId();
        String absolutePath = FileLoader.getInstance(messageObject.currentAccount).getPathToMessage(messageObject.messageOwner).getAbsolutePath();
        if (this.generatingWaveform.containsKey(str)) {
            return;
        }
        this.generatingWaveform.put(str, messageObject);
        Utilities.globalQueue.postRunnable(new lk(this, absolutePath, str, messageObject, 10));
    }

    public se.a getAudioInfo() {
        return this.audioInfo;
    }

    public xe.g getCurrentChromecastMedia() throws Throwable {
        FileOutputStream fileOutputStream;
        MessageObject messageObject = this.playingMessageObject;
        FileOutputStream fileOutputStream2 = null;
        String str = null;
        if (messageObject != null) {
            String musicTitle = messageObject.getMusicTitle();
            String musicAuthor = this.playingMessageObject.getMusicAuthor();
            TLRPC.Document document = this.playingMessageObject.getDocument();
            if (this.playingMessageObject.isRoundVideo() || this.playingMessageObject.isVideo() || this.playingMessageObject.isMusic()) {
                MessageObject messageObject2 = this.playingMessageObject;
                File file = (!messageObject2.attachPathExists || messageObject2.messageOwner == null) ? null : new File(this.playingMessageObject.messageOwner.attachPath);
                if (file == null || !file.exists()) {
                    file = FileLoader.getInstance(this.playingMessageObject.currentAccount).getPathToMessage(this.playingMessageObject.messageOwner);
                }
                if (file != null && file.exists()) {
                    String mimeType = this.playingMessageObject.getMimeType();
                    Uri uri = Uri.parse("file://" + file.getAbsolutePath());
                    m5.l lVar = new m5.l(0);
                    se.a aVar = this.audioInfo;
                    if (aVar != null) {
                        if (!TextUtils.isEmpty(aVar.f47859c)) {
                            lVar.b("com.google.android.gms.cast.metadata.TITLE", this.audioInfo.f47859c);
                        }
                        if (!TextUtils.isEmpty(this.audioInfo.d)) {
                            lVar.b("com.google.android.gms.cast.metadata.ARTIST", this.audioInfo.d);
                        }
                        if (!TextUtils.isEmpty(this.audioInfo.f47861f)) {
                            lVar.b("com.google.android.gms.cast.metadata.ALBUM_TITLE", this.audioInfo.f47861f);
                        }
                        if (!TextUtils.isEmpty(this.audioInfo.f47860e)) {
                            lVar.b("com.google.android.gms.cast.metadata.ALBUM_ARTIST", this.audioInfo.f47860e);
                        }
                        if (!TextUtils.isEmpty(this.audioInfo.f47867m)) {
                            lVar.b("com.google.android.gms.cast.metadata.COMPOSER", this.audioInfo.f47867m);
                        }
                        short s10 = this.audioInfo.f47865k;
                        Bundle bundle = lVar.f17808b;
                        if (s10 != 0) {
                            m5.l.c(2, "com.google.android.gms.cast.metadata.DISC_NUMBER");
                            bundle.putInt("com.google.android.gms.cast.metadata.DISC_NUMBER", s10);
                        }
                        short s11 = this.audioInfo.f47864j;
                        if (s11 != 0) {
                            m5.l.c(2, "com.google.android.gms.cast.metadata.TRACK_NUMBER");
                            bundle.putInt("com.google.android.gms.cast.metadata.TRACK_NUMBER", s11);
                        }
                        se.a aVar2 = this.audioInfo;
                        if (aVar2.f47869o != null) {
                            File fileW = aVar2.f47871q;
                            if (fileW == null || !fileW.exists()) {
                                fileW = lh.z7.w(UserConfig.selectedAccount, "jpg");
                                try {
                                    Bitmap bitmap = this.audioInfo.f47869o;
                                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                                    fileOutputStream = new FileOutputStream(fileW);
                                    try {
                                        try {
                                            bitmap.compress(compressFormat, 80, fileOutputStream);
                                            try {
                                                fileOutputStream.close();
                                            } catch (Exception e9) {
                                                FileLog.e(e9);
                                            }
                                        } catch (Exception e10) {
                                            e = e10;
                                            FileLog.e(e);
                                            if (fileOutputStream != null) {
                                                try {
                                                    fileOutputStream.close();
                                                } catch (Exception e11) {
                                                    FileLog.e(e11);
                                                }
                                            }
                                            fileW = null;
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        fileOutputStream2 = fileOutputStream;
                                        if (fileOutputStream2 != null) {
                                            try {
                                                fileOutputStream2.close();
                                            } catch (Exception e12) {
                                                FileLog.e(e12);
                                            }
                                        }
                                        throw th;
                                    }
                                } catch (Exception e13) {
                                    e = e13;
                                    fileOutputStream = null;
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (fileOutputStream2 != null) {
                                        fileOutputStream2.close();
                                    }
                                    throw th;
                                }
                                this.audioInfo.f47871q = fileW;
                            }
                            if (fileW != null && fileW.exists()) {
                                u2.b bVar = (u2.b) xe.b.D().f49392b;
                                xe.e eVar = (xe.e) bVar.f48263c;
                                if (eVar == null) {
                                    str = "/file" + Utilities.fastRandom.nextLong();
                                    if (((xe.e) bVar.f48263c) == null) {
                                        bVar.f48263c = new xe.e();
                                    }
                                    ((xe.e) bVar.f48263c).l(fileW, str);
                                } else {
                                    Pair pair = eVar.f49404i;
                                    if ((pair == null ? null : (File) pair.second) == null) {
                                        str = "/file" + Utilities.fastRandom.nextLong();
                                        if (((xe.e) bVar.f48263c) == null) {
                                            bVar.f48263c = new xe.e();
                                        }
                                        ((xe.e) bVar.f48263c).l(fileW, str);
                                    } else {
                                        if (TextUtils.equals((pair == null ? null : (File) pair.second).getAbsolutePath(), fileW.getAbsolutePath())) {
                                            Pair pair2 = ((xe.e) bVar.f48263c).f49404i;
                                            if (pair2 != null) {
                                                str = (String) pair2.first;
                                            }
                                        } else {
                                            str = "/file" + Utilities.fastRandom.nextLong();
                                            if (((xe.e) bVar.f48263c) == null) {
                                                bVar.f48263c = new xe.e();
                                            }
                                            ((xe.e) bVar.f48263c).l(fileW, str);
                                        }
                                    }
                                }
                                lVar.f17807a.add(new x5.a(Uri.parse(xe.e.j(xe.e.i(), str)), 0, 0));
                            }
                        }
                    }
                    f2.e1 e1Var = new f2.e1(uri, mimeType, "/player_" + this.playingMessageObject.getId());
                    e1Var.f5652g = musicTitle;
                    e1Var.h = musicAuthor;
                    e1Var.f5651f = lVar;
                    return new xe.g(new xe.f(e1Var));
                }
            }
            m61 m61Var = this.videoPlayer;
            if (m61Var != null) {
                return m61Var.m(a9.p.o(new StringBuilder(), document != null ? document.f22386id : this.playingMessageObject.getId(), ""), musicTitle, musicAuthor);
            }
            m61 m61Var2 = this.audioPlayer;
            if (m61Var2 != null) {
                return m61Var2.m(a9.p.o(new StringBuilder(), document != null ? document.f22386id : this.playingMessageObject.getId(), ""), musicTitle, musicAuthor);
            }
        }
        return null;
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
        m61 m61Var = this.audioPlayer;
        if (m61Var == null) {
            return 0L;
        }
        return m61Var.q();
    }

    public float getFastPlaybackSpeed(boolean z10) {
        return z10 ? this.fastMusicPlaybackSpeed : this.fastPlaybackSpeed;
    }

    public MessagesController.SavedMusicList getMusicList() {
        return this.currentSavedMusicList;
    }

    public float getPlaybackSpeed(boolean z10) {
        return z10 ? this.currentMusicPlaybackSpeed : this.currentPlaybackSpeed;
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
                m61 m61Var = this.audioPlayer;
                if (m61Var != null) {
                    return m61Var.o();
                }
                m61 m61Var2 = this.videoPlayer;
                if (m61Var2 != null) {
                    return m61Var2.o();
                }
            } catch (Exception unused) {
            }
        }
        return -1L;
    }

    public m61 getVideoPlayer() {
        return this.videoPlayer;
    }

    public native byte[] getWaveform2(short[] sArr, int i10);

    public boolean hasNoNextVoiceOrRoundVideoMessage() {
        ArrayList<MessageObject> arrayList;
        MessageObject messageObject = this.playingMessageObject;
        return messageObject == null || !(messageObject.isVoice() || this.playingMessageObject.isRoundVideo()) || (arrayList = this.voiceMessagesPlaylist) == null || arrayList.size() <= 1 || !this.voiceMessagesPlaylist.contains(this.playingMessageObject) || this.voiceMessagesPlaylist.indexOf(this.playingMessageObject) >= this.voiceMessagesPlaylist.size() - 1;
    }

    public void injectVideoPlayer(m61 m61Var, MessageObject messageObject) {
        if (m61Var == null || messageObject == null) {
            return;
        }
        FileLoader.getInstance(messageObject.currentAccount).setLoadingVideoForPlayer(messageObject.getDocument(), true);
        this.playerWasReady = false;
        clearPlaylist();
        this.videoPlayer = m61Var;
        this.playingMessageObject = messageObject;
        int i10 = this.playerNum + 1;
        this.playerNum = i10;
        m61Var.F = new AnonymousClass7(i10, messageObject, null, true);
        this.currentAspectRatioFrameLayoutReady = false;
        TextureView textureView = this.currentTextureView;
        if (textureView != null) {
            this.videoPlayer.W(textureView);
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

    public boolean isBuffering() {
        m61 m61Var = this.audioPlayer;
        return (m61Var == null || m61Var.d == null || m61Var.H != 2) ? false : true;
    }

    public boolean isCurrentPlayer(m61 m61Var) {
        return this.videoPlayer == m61Var || this.audioPlayer == m61Var;
    }

    public boolean isDownloadingCurrentMessage() {
        return this.downloadingCurrentMessage;
    }

    public boolean isGoingToShowMessageObject(MessageObject messageObject) {
        return this.goingToShowMessageObject == messageObject;
    }

    public boolean isMessagePaused() {
        return this.isPaused || this.downloadingCurrentMessage;
    }

    public boolean isPiPShown() {
        return this.pipRoundVideoView != null;
    }

    public boolean isPlayingMessage(MessageObject messageObject) {
        MessageObject messageObject2;
        if (messageObject != null && messageObject.isRepostPreview) {
            return false;
        }
        if ((this.audioPlayer != null || this.videoPlayer != null) && messageObject != null && (messageObject2 = this.playingMessageObject) != null) {
            long j10 = messageObject2.eventId;
            if ((j10 != 0 && j10 == messageObject.eventId) || isSamePlayingMessage(messageObject)) {
                boolean z10 = this.downloadingCurrentMessage;
                return !z10;
            }
        }
        return false;
    }

    public boolean isPlayingMessageAndReadyToDraw(MessageObject messageObject) {
        return this.isDrawingWasReady && isPlayingMessage(messageObject);
    }

    public boolean isRecordingAudio() {
        return (this.recordStartRunnable == null && this.recordingAudio == null) ? false : true;
    }

    public boolean isRecordingOrListeningByProximity() {
        if (!this.proximityTouched) {
            return false;
        }
        if (isRecordingAudio()) {
            return true;
        }
        MessageObject messageObject = this.playingMessageObject;
        if (messageObject != null) {
            return messageObject.isVoice() || this.playingMessageObject.isRoundVideo();
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
        c5.c cVar = this.currentAspectRatioFrameLayout;
        return cVar != null && cVar.d;
    }

    public void loadMoreMusic() {
        MessageObject messageObject;
        int i10;
        long j10;
        TLObject tLObject;
        MessagesController.SavedMusicList savedMusicList = this.currentSavedMusicList;
        if (savedMusicList != null) {
            savedMusicList.load();
            return;
        }
        if (this.loadingPlaylist || (messageObject = this.playingMessageObject) == null || messageObject.scheduled || DialogObject.isEncryptedDialog(messageObject.getDialogId()) || (i10 = this.playlistClassGuid) == 0) {
            return;
        }
        PlaylistGlobalSearchParams playlistGlobalSearchParams = this.playlistGlobalSearchParams;
        if (playlistGlobalSearchParams == null) {
            boolean[] zArr = this.playlistEndReached;
            if (!zArr[0]) {
                this.loadingPlaylist = true;
                AccountInstance.getInstance(this.playingMessageObject.currentAccount).getMediaDataController().loadMedia(this.playingMessageObject.getDialogId(), 50, this.playlistMaxId[0], 0, 4, 0L, 1, this.playlistClassGuid, 0, null, null);
                return;
            } else {
                if (this.playlistMergeDialogId == 0 || zArr[1]) {
                    return;
                }
                this.loadingPlaylist = true;
                AccountInstance.getInstance(this.playingMessageObject.currentAccount).getMediaDataController().loadMedia(this.playlistMergeDialogId, 50, this.playlistMaxId[0], 0, 4, 0L, 1, this.playlistClassGuid, 0, null, null);
                return;
            }
        }
        if (playlistGlobalSearchParams.endReached || this.playlist.isEmpty()) {
            return;
        }
        int i11 = this.playlist.get(0).currentAccount;
        if (this.playlistGlobalSearchParams.dialogId != 0) {
            TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
            PlaylistGlobalSearchParams playlistGlobalSearchParams2 = this.playlistGlobalSearchParams;
            tL_messages_search.f22489q = playlistGlobalSearchParams2.query;
            tL_messages_search.limit = 20;
            pf.e0 e0Var = playlistGlobalSearchParams2.filter;
            tL_messages_search.filter = e0Var == null ? new TLRPC.TL_inputMessagesFilterEmpty() : e0Var.f45782e;
            tL_messages_search.peer = AccountInstance.getInstance(i11).getMessagesController().getInputPeer(this.playlistGlobalSearchParams.dialogId);
            tL_messages_search.offset_id = ((MessageObject) i0.a.i(1, this.playlist)).getId();
            PlaylistGlobalSearchParams playlistGlobalSearchParams3 = this.playlistGlobalSearchParams;
            long j11 = playlistGlobalSearchParams3.minDate;
            if (j11 > 0) {
                tL_messages_search.min_date = (int) (j11 / 1000);
            }
            long j12 = playlistGlobalSearchParams3.maxDate;
            tLObject = tL_messages_search;
            if (j12 > 0) {
                tL_messages_search.min_date = (int) (j12 / 1000);
                tLObject = tL_messages_search;
            }
        } else {
            TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
            tL_messages_searchGlobal.limit = 20;
            PlaylistGlobalSearchParams playlistGlobalSearchParams4 = this.playlistGlobalSearchParams;
            tL_messages_searchGlobal.f22491q = playlistGlobalSearchParams4.query;
            tL_messages_searchGlobal.filter = playlistGlobalSearchParams4.filter.f45782e;
            MessageObject messageObject2 = (MessageObject) i0.a.i(1, this.playlist);
            tL_messages_searchGlobal.offset_id = messageObject2.getId();
            PlaylistGlobalSearchParams playlistGlobalSearchParams5 = this.playlistGlobalSearchParams;
            tL_messages_searchGlobal.offset_rate = playlistGlobalSearchParams5.nextSearchRate;
            tL_messages_searchGlobal.flags |= 1;
            tL_messages_searchGlobal.folder_id = playlistGlobalSearchParams5.folderId;
            TLRPC.Peer peer = messageObject2.messageOwner.peer_id;
            long j13 = peer.channel_id;
            if (j13 != 0) {
                j10 = -j13;
            } else {
                j13 = peer.chat_id;
                if (j13 != 0) {
                    j10 = -j13;
                } else {
                    j10 = peer.user_id;
                }
            }
            tL_messages_searchGlobal.offset_peer = MessagesController.getInstance(i11).getInputPeer(j10);
            PlaylistGlobalSearchParams playlistGlobalSearchParams6 = this.playlistGlobalSearchParams;
            long j14 = playlistGlobalSearchParams6.minDate;
            if (j14 > 0) {
                tL_messages_searchGlobal.min_date = (int) (j14 / 1000);
            }
            long j15 = playlistGlobalSearchParams6.maxDate;
            tLObject = tL_messages_searchGlobal;
            if (j15 > 0) {
                tL_messages_searchGlobal.min_date = (int) (j15 / 1000);
                tLObject = tL_messages_searchGlobal;
            }
        }
        this.loadingPlaylist = true;
        ConnectionsManager.getInstance(i11).sendRequest(tLObject, new d6(this, i10, i11, 0));
    }

    @Override
    public void onAudioFocusChange(int i10) {
        AndroidUtilities.runOnUIThread(new a6(this, i10, 0));
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        long j10;
        char c10;
        ?? r18;
        boolean z10;
        int i10;
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
                c10 = 2;
                r18 = 1;
            } else {
                Sensor sensor = sensorEvent.sensor;
                if (sensor == this.accelerometerSensor) {
                    long j11 = this.lastTimestamp;
                    double d = j11 == 0 ? 0.9800000190734863d : 1.0d / (((sensorEvent.timestamp - j11) / 1.0E9d) + 1.0d);
                    this.lastTimestamp = sensorEvent.timestamp;
                    float[] fArr = this.gravity;
                    double d10 = ((double) fArr[0]) * d;
                    double d11 = 1.0d - d;
                    float[] fArr2 = sensorEvent.values;
                    j10 = 0;
                    float f12 = (float) ((((double) fArr2[0]) * d11) + d10);
                    fArr[0] = f12;
                    c10 = 2;
                    r18 = 1;
                    float f13 = (float) ((((double) fArr2[1]) * d11) + (((double) fArr[1]) * d));
                    fArr[1] = f13;
                    float f14 = (float) ((d11 * ((double) fArr2[2])) + (d * ((double) fArr[2])));
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
                    c10 = 2;
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
                float f19 = (fArr10[c10] * fArr11[c10]) + (fArr10[r18] * fArr11[r18]) + (f18 * fArr11[0]);
                int i11 = this.raisedToBack;
                if (i11 != 6 && ((f19 > 0.0f && this.previousAccValue > 0.0f) || (f19 < 0.0f && this.previousAccValue < 0.0f))) {
                    if (f19 > 0.0f) {
                        z10 = f19 > 15.0f;
                        i10 = 1;
                    } else {
                        z10 = f19 < -15.0f;
                        i10 = 2;
                    }
                    int i12 = this.raisedToTopSign;
                    if (i12 != 0 && i12 != i10) {
                        int i13 = this.raisedToTop;
                        if (i13 != 6 || !z10) {
                            if (!z10) {
                                this.countLess++;
                            }
                            if (this.countLess == 10 || i13 != 6 || i11 != 0) {
                                this.raisedToTop = 0;
                                this.raisedToTopSign = 0;
                                this.raisedToBack = 0;
                                this.countLess = 0;
                            }
                        } else if (i11 < 6) {
                            int i14 = i11 + 1;
                            this.raisedToBack = i14;
                            if (i14 == 6) {
                                this.raisedToTop = 0;
                                this.raisedToTopSign = 0;
                                this.countLess = 0;
                                this.timeSinceRaise = System.currentTimeMillis();
                                if (BuildVars.LOGS_ENABLED && BuildVars.DEBUG_PRIVATE_VERSION) {
                                    FileLog.d("motion detected");
                                }
                            }
                        }
                    } else if (z10 && i11 == 0 && (i12 == 0 || i12 == i10)) {
                        int i15 = this.raisedToTop;
                        if (i15 < 6 && !this.proximityTouched) {
                            this.raisedToTopSign = i10;
                            int i16 = i15 + 1;
                            this.raisedToTop = i16;
                            if (i16 == 6) {
                                this.countLess = 0;
                            }
                        }
                    } else {
                        if (!z10) {
                            this.countLess++;
                        }
                        if (i12 != i10 || this.countLess == 10 || this.raisedToTop != 6 || i11 != 0) {
                            this.raisedToBack = 0;
                            this.raisedToTop = 0;
                            this.raisedToTopSign = 0;
                            this.countLess = 0;
                        }
                    }
                }
                this.previousAccValue = f19;
                float[] fArr12 = this.gravityFast;
                this.accelerometerVertical = fArr12[r18] > 2.5f && Math.abs(fArr12[c10]) < 4.0f && Math.abs(this.gravityFast[0]) > 1.5f;
            }
            if (this.raisedToBack == 6 || this.accelerometerVertical) {
                this.lastAccelerometerDetected = System.currentTimeMillis();
            }
            boolean z11 = !this.manualRecording && this.playingMessageObject == null && SharedConfig.enabledRaiseTo(r18) && ApplicationLoader.isScreenOn && !this.inputFieldHasText && this.allowStartRecord && this.raiseChat != null && !this.callInProgress;
            boolean z12 = SharedConfig.enabledRaiseTo(false) && (messageObject = this.playingMessageObject) != null && (messageObject.isVoice() || this.playingMessageObject.isRoundVideo());
            boolean z13 = this.proximityTouched;
            boolean z14 = this.raisedToBack == 6 || this.accelerometerVertical || System.currentTimeMillis() - this.lastAccelerometerDetected < 60;
            boolean z15 = this.useFrontSpeaker || this.raiseToEarRecord;
            boolean z16 = (z14 || z15) && !forbidRaiseToListen() && !VoIPService.isAnyKindOfCallActive() && (z11 || z12) && !PhotoViewer.t1().Q1();
            PowerManager.WakeLock wakeLock = this.proximityWakeLock;
            if (wakeLock != null) {
                boolean zIsHeld = wakeLock.isHeld();
                if (zIsHeld && !z16) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("wake lock releasing (proximityDetected=" + z13 + ", accelerometerDetected=" + z14 + ", alreadyPlaying=" + z15 + ")");
                    }
                    this.proximityWakeLock.release();
                } else if (!zIsHeld && z16) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("wake lock acquiring (proximityDetected=" + z13 + ", accelerometerDetected=" + z14 + ", alreadyPlaying=" + z15 + ")");
                    }
                    this.proximityWakeLock.acquire();
                }
            }
            boolean z17 = this.proximityTouched;
            if (z17 && z16) {
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
            if (this.timeSinceRaise == j10 || this.raisedToBack != 6 || Math.abs(System.currentTimeMillis() - this.timeSinceRaise) <= 1000) {
                return;
            }
            this.raisedToBack = 0;
            this.raisedToTop = 0;
            this.raisedToTopSign = 0;
            this.countLess = 0;
            this.timeSinceRaise = j10;
        }
    }

    public void pauseByRewind() {
        m61 m61Var = this.audioPlayer;
        if (m61Var != null) {
            m61Var.C();
        }
    }

    public boolean lambda$startAudioAgain$7(MessageObject messageObject) {
        return pauseMessage(messageObject, true);
    }

    public void playEmojiSound(AccountInstance accountInstance, String str, MessagesController.EmojiSound emojiSound, boolean z10) {
        if (emojiSound == null) {
            return;
        }
        Utilities.stageQueue.postRunnable(new qj(this, emojiSound, accountInstance, z10));
    }

    public boolean playMessage(MessageObject messageObject) {
        return playMessage(messageObject, false);
    }

    public void playMessageAtIndex(int i10) {
        int i11 = this.currentPlaylistNum;
        if (i11 < 0 || i11 >= this.playlist.size()) {
            return;
        }
        this.currentPlaylistNum = i10;
        this.playMusicAgain = true;
        MessageObject messageObject = this.playlist.get(i10);
        if (this.playingMessageObject != null && !isSamePlayingMessage(messageObject)) {
            this.playingMessageObject.resetPlayingProgress();
        }
        playMessage(messageObject);
    }

    public void playNextMessage() {
        playNextMessageWithoutOrder(false);
    }

    public void playPreviousMessage() {
        int i10;
        ArrayList<MessageObject> arrayList = SharedConfig.shuffleMusic ? this.shuffledPlaylist : this.playlist;
        if (arrayList.isEmpty() || (i10 = this.currentPlaylistNum) < 0 || i10 >= arrayList.size()) {
            return;
        }
        MessageObject messageObject = arrayList.get(this.currentPlaylistNum);
        if (messageObject.audioProgressSec > 10) {
            seekToProgress(messageObject, 0.0f);
            return;
        }
        traversePlaylist(arrayList, SharedConfig.playOrderReversed ? -1 : 1);
        if (this.currentPlaylistNum >= arrayList.size()) {
            return;
        }
        this.playMusicAgain = true;
        playMessage(arrayList.get(this.currentPlaylistNum));
    }

    public void prepareResumedRecording(int i10, MediaDataController.DraftVoice draftVoice, long j10, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, int i11, SendMessageChatArguments sendMessageChatArguments, long j11, MessageSuggestionParams messageSuggestionParams) {
        this.manualRecording = false;
        requestRecordAudioFocus(true);
        this.recordQueue.cancelRunnable(this.recordStartRunnable);
        this.recordQueue.postRunnable(new j6(this, i11, draftVoice, i10, j10, j11, messageSuggestionParams, messageObject2, messageObject, storyItem));
    }

    public void requestRecordAudioFocus(boolean z10) {
        if (!z10) {
            if (this.hasRecordAudioFocus) {
                NotificationsController.audioManager.abandonAudioFocus(this.audioRecordFocusChangedListener);
                this.hasRecordAudioFocus = false;
                return;
            }
            return;
        }
        if (!this.hasRecordAudioFocus && SharedConfig.pauseMusicOnRecord && NotificationsController.audioManager.requestAudioFocus(this.audioRecordFocusChangedListener, 3, 2) == 1) {
            this.hasRecordAudioFocus = true;
        }
    }

    public void resetGoingToShowMessageObject() {
        this.goingToShowMessageObject = null;
    }

    public void resumeByRewind() {
        MessageObject messageObject;
        m61 m61Var = this.audioPlayer;
        if (m61Var == null || (messageObject = this.playingMessageObject) == null || this.isPaused) {
            return;
        }
        if (m61Var.d == null || m61Var.H != 2) {
            m61Var.D();
        } else {
            cleanupPlayer(false, false);
            playMessage(messageObject);
        }
    }

    public void scheduleVideoConvert(MessageObject messageObject) {
        scheduleVideoConvert(messageObject, false, true, false);
    }

    public boolean seekToProgress(MessageObject messageObject, float f10) {
        MessageObject messageObject2 = this.playingMessageObject;
        if ((this.audioPlayer != null || this.videoPlayer != null) && messageObject != null && messageObject2 != null && isSamePlayingMessage(messageObject)) {
            try {
                m61 m61Var = this.audioPlayer;
                if (m61Var != null) {
                    long jQ = m61Var.q();
                    if (jQ == -9223372036854775807L) {
                        this.seekToProgressPending = f10;
                    } else {
                        messageObject2.audioProgress = f10;
                        long j10 = (int) (jQ * f10);
                        this.audioPlayer.L(j10);
                        this.lastProgress = j10;
                        if (!this.ignorePlayerUpdate) {
                            d1.f.u(j10);
                        }
                    }
                } else {
                    m61 m61Var2 = this.videoPlayer;
                    if (m61Var2 != null) {
                        m61Var2.L((long) (m61Var2.q() * f10));
                        if (!this.ignorePlayerUpdate) {
                            d1.f.u((long) (this.videoPlayer.q() * f10));
                        }
                    }
                }
                NotificationCenter.getInstance(messageObject.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagePlayingDidSeek, Integer.valueOf(messageObject2.getId()), Float.valueOf(f10));
                return true;
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
        return false;
    }

    public boolean seekToProgressMs(MessageObject messageObject, long j10) {
        long jQ;
        MessageObject messageObject2 = this.playingMessageObject;
        if ((this.audioPlayer != null || this.videoPlayer != null) && messageObject != null && messageObject2 != null && isSamePlayingMessage(messageObject)) {
            try {
                m61 m61Var = this.audioPlayer;
                if (m61Var != null) {
                    jQ = m61Var.q();
                    if (jQ != -9223372036854775807L) {
                        messageObject2.audioProgress = Utilities.clamp01(j10 / jQ);
                    }
                    this.audioPlayer.L(j10);
                    this.lastProgress = j10;
                    if (!this.ignorePlayerUpdate) {
                        d1.f.u(j10);
                    }
                } else {
                    m61 m61Var2 = this.videoPlayer;
                    if (m61Var2 != null) {
                        jQ = m61Var2.q();
                        this.videoPlayer.L(j10);
                        if (!this.ignorePlayerUpdate) {
                            d1.f.u(j10);
                        }
                    } else {
                        jQ = 1;
                    }
                }
                if (jQ != 0) {
                    NotificationCenter.getInstance(messageObject.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagePlayingDidSeek, Integer.valueOf(messageObject2.getId()), Float.valueOf(Utilities.clamp01(j10 / jQ)));
                }
                return true;
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
        return false;
    }

    public void setAllowStartRecord(boolean z10) {
        this.allowStartRecord = z10;
    }

    public void setBaseActivity(Activity activity, boolean z10) {
        if (z10) {
            this.baseActivity = activity;
        } else if (this.baseActivity == activity) {
            this.baseActivity = null;
        }
    }

    public void setCurrentVideoVisible(boolean z10) {
        c5.c cVar = this.currentAspectRatioFrameLayout;
        if (cVar == null) {
            return;
        }
        if (z10) {
            PipRoundVideoView pipRoundVideoView = this.pipRoundVideoView;
            if (pipRoundVideoView != null) {
                this.pipSwitchingState = 2;
                pipRoundVideoView.a(true);
                this.pipRoundVideoView = null;
                return;
            } else {
                if (cVar.getParent() == null) {
                    this.currentTextureViewContainer.addView(this.currentAspectRatioFrameLayout);
                }
                this.videoPlayer.W(this.currentTextureView);
                return;
            }
        }
        if (cVar.getParent() != null) {
            this.pipSwitchingState = 1;
            this.currentTextureViewContainer.removeView(this.currentAspectRatioFrameLayout);
            return;
        }
        if (this.pipRoundVideoView == null) {
            try {
                PipRoundVideoView pipRoundVideoView2 = new PipRoundVideoView();
                this.pipRoundVideoView = pipRoundVideoView2;
                pipRoundVideoView2.d(this.baseActivity, new w5(this, 10));
            } catch (Exception unused) {
                this.pipRoundVideoView = null;
            }
        }
        PipRoundVideoView pipRoundVideoView3 = this.pipRoundVideoView;
        if (pipRoundVideoView3 != null) {
            this.videoPlayer.W(pipRoundVideoView3.f26422c);
        }
    }

    public void setFeedbackView(View view, boolean z10) {
        if (z10) {
            this.feedbackView = view;
        } else if (this.feedbackView == view) {
            this.feedbackView = null;
        }
    }

    public void setInputFieldHasText(boolean z10) {
        this.inputFieldHasText = z10;
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
        boolean z10 = SharedConfig.shuffleMusic;
        SharedConfig.setPlaybackOrderType(i10);
        boolean z11 = SharedConfig.shuffleMusic;
        if (z10 != z11) {
            if (z11) {
                buildShuffledPlayList();
                return;
            }
            MessageObject messageObject = this.playingMessageObject;
            if (messageObject != null) {
                int iIndexOf = this.playlist.indexOf(messageObject);
                this.currentPlaylistNum = iIndexOf;
                if (iIndexOf == -1) {
                    clearPlaylist();
                    cleanupPlayer(true, true);
                }
            }
        }
    }

    public void setPlaybackSpeed(boolean z10, float f10) {
        if (z10) {
            if (this.currentMusicPlaybackSpeed >= 6.0f && f10 == 1.0f && this.playingMessageObject != null) {
                this.audioPlayer.C();
                MessageObject messageObject = this.playingMessageObject;
                AndroidUtilities.runOnUIThread(new b6(this, messageObject, messageObject.audioProgress, 0), 50L);
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
        m61 m61Var = this.audioPlayer;
        if (m61Var != null) {
            m61Var.R(Math.round(f10 * 10.0f) / 10.0f);
        } else {
            m61 m61Var2 = this.videoPlayer;
            if (m61Var2 != null) {
                m61Var2.R(Math.round(f10 * 10.0f) / 10.0f);
            }
        }
        MessagesController.getGlobalMainSettings().edit().putFloat(z10 ? "musicPlaybackSpeed" : "playbackSpeed", f10).putFloat(z10 ? "fastMusicPlaybackSpeed" : "fastPlaybackSpeed", z10 ? this.fastMusicPlaybackSpeed : this.fastPlaybackSpeed).commit();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagePlayingSpeedChanged, new Object[0]);
        if (this.ignorePlayerUpdate) {
            return;
        }
        d1.f.y(f10);
    }

    public boolean setPlaylist(ArrayList<MessageObject> arrayList, MessageObject messageObject, long j10, PlaylistGlobalSearchParams playlistGlobalSearchParams) {
        return setPlaylist(arrayList, messageObject, j10, true, playlistGlobalSearchParams);
    }

    public void setReplyingMessage(MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem) {
        this.recordReplyingMsg = messageObject;
        this.recordReplyingTopMsg = messageObject2;
        this.recordReplyingStory = storyItem;
    }

    public void setTextureView(TextureView textureView, c5.c cVar, FrameLayout frameLayout, boolean z10) {
        setTextureView(textureView, cVar, frameLayout, z10, null);
    }

    public void setVoiceMessagesPlaylist(ArrayList<MessageObject> arrayList, boolean z10) {
        ArrayList<MessageObject> arrayList2 = arrayList != null ? new ArrayList<>(arrayList) : null;
        this.voiceMessagesPlaylist = arrayList2;
        if (arrayList2 != null) {
            this.voiceMessagesPlaylistUnread = z10;
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
        } catch (Exception e9) {
            FileLog.e(e9);
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

    public void startRaiseToEarSensors(rn rnVar) {
        if (rnVar != null) {
            if ((this.accelerometerSensor == null && (this.gravitySensor == null || this.linearAcceleration == null)) || this.proximitySensor == null) {
                return;
            }
            if (!SharedConfig.enabledRaiseTo(false)) {
                MessageObject messageObject = this.playingMessageObject;
                if (messageObject == null) {
                    return;
                }
                if (!messageObject.isVoice() && !this.playingMessageObject.isRoundVideo()) {
                    return;
                }
            }
            this.raiseChat = rnVar;
            if (this.sensorsStarted) {
                return;
            }
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
            Utilities.globalQueue.postRunnable(new w5(this, 0));
            this.sensorsStarted = true;
        }
    }

    public void startRecording(int i10, long j10, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, int i11, boolean z10, SendMessageChatArguments sendMessageChatArguments, long j11, MessageSuggestionParams messageSuggestionParams) {
        MessageObject messageObject3 = this.playingMessageObject;
        boolean z11 = (messageObject3 == null || !isPlayingMessage(messageObject3) || isMessagePaused()) ? false : true;
        this.manualRecording = z10;
        requestRecordAudioFocus(true);
        try {
            this.feedbackView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        DispatchQueue dispatchQueue = this.recordQueue;
        j6 j6Var = new j6(this, i10, i11, j10, j11, messageSuggestionParams, messageObject2, messageObject, storyItem, sendMessageChatArguments);
        this.recordStartRunnable = j6Var;
        dispatchQueue.postRunnable(j6Var, z11 ? 500L : 50L);
    }

    public void startRecordingIfFromSpeaker() {
        if (this.useFrontSpeaker && this.raiseChat != null && this.allowStartRecord && SharedConfig.enabledRaiseTo(true)) {
            this.raiseToEarRecord = true;
            int currentAccount = this.raiseChat.getCurrentAccount();
            long jA = this.raiseChat.a();
            rn rnVar = this.raiseChat;
            MessageObject messageObject = rnVar.T3;
            int classGuid = rnVar.getClassGuid();
            rn rnVar2 = this.raiseChat;
            SendMessageChatArguments sendMessageChatArgumentsC8 = rnVar2 != null ? rnVar2.C8() : null;
            rn rnVar3 = this.raiseChat;
            long jN8 = rnVar3 != null ? rnVar3.N8() : 0L;
            rn rnVar4 = this.raiseChat;
            startRecording(currentAccount, jA, null, messageObject, null, classGuid, false, sendMessageChatArgumentsC8, jN8, rnVar4 != null ? rnVar4.f42006c5 : null);
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

    public void stopRaiseToEarSensors(rn rnVar, boolean z10, boolean z11) {
        MediaController mediaController;
        if (this.ignoreOnPause) {
            this.ignoreOnPause = false;
            return;
        }
        if (!z11) {
            mediaController = this;
        } else if (this.recordingAudio == null || isRecordingPaused()) {
            mediaController = this;
            mediaController.stopRecording(z10 ? 2 : 0, false, 0, false, 0L);
        } else {
            toggleRecordingPause(false);
            mediaController = this;
        }
        if (!mediaController.sensorsStarted || mediaController.ignoreOnPause) {
            return;
        }
        if ((mediaController.accelerometerSensor == null && (mediaController.gravitySensor == null || mediaController.linearAcceleration == null)) || mediaController.proximitySensor == null || mediaController.raiseChat != rnVar) {
            return;
        }
        mediaController.raiseChat = null;
        mediaController.sensorsStarted = false;
        mediaController.accelerometerVertical = false;
        mediaController.proximityTouched = false;
        mediaController.raiseToEarRecord = false;
        mediaController.useFrontSpeaker = false;
        Utilities.globalQueue.postRunnable(new w5(this, 4));
        PowerManager.WakeLock wakeLock = mediaController.proximityWakeLock;
        if (wakeLock == null || !wakeLock.isHeld()) {
            return;
        }
        mediaController.proximityWakeLock.release();
    }

    public void stopRecording(final int i10, final boolean z10, final int i11, final boolean z11, final long j10) {
        Runnable runnable = this.recordStartRunnable;
        if (runnable != null) {
            this.recordQueue.cancelRunnable(runnable);
            this.recordStartRunnable = null;
        }
        this.recordQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f20221a.lambda$stopRecording$43(i10, z10, i11, z11, j10);
            }
        });
    }

    public void syncCastedPlayer() {
        AtomicInteger atomicInteger;
        boolean zM;
        r rVarE;
        if (this.playingMessageObject == null) {
            return;
        }
        this.ignorePlayerUpdate = true;
        if (d1.f.t() && ((atomicInteger = d1.f.f4696b) == null || atomicInteger.get() <= 0)) {
            o5.h hVarE = d1.f.e();
            long jA = hVarE == null ? -1L : hVarE.a();
            long progressMs = getProgressMs(this.playingMessageObject);
            if (progressMs >= 0 && jA >= 0 && Math.abs(progressMs - jA) > 1000) {
                seekToProgressMs(this.playingMessageObject, jA);
            }
            o5.h hVarE2 = d1.f.e();
            if (hVarE2 == null) {
                zM = false;
            } else {
                zM = d1.f.f4695a == 0 ? !hVarE2.l() : hVarE2.m();
            }
            if (zM) {
                playMessage(this.playingMessageObject);
            } else {
                lambda$startAudioAgain$7(this.playingMessageObject);
            }
            o5.h hVarE3 = d1.f.e();
            float f10 = 1.0f;
            if (hVarE3 != null && (rVarE = hVarE3.e()) != null) {
                f10 = (float) rVarE.d;
            }
            setPlaybackSpeed(true, f10);
        }
        setPlayerVolume();
        this.ignorePlayerUpdate = false;
    }

    public void toggleRecordingPause(boolean z10) {
        this.recordQueue.postRunnable(new m6(this, z10, 1));
    }

    public void trimCurrentRecording(long j10, long j11, Runnable runnable) {
        if (this.recordingAudioFile == null) {
            if (runnable != null) {
                AndroidUtilities.runOnUIThread(runnable);
                return;
            }
            return;
        }
        this.recordQueue.postRunnable(new cg.t0(this, new File(FileLoader.getDirectory(1), System.currentTimeMillis() + "_" + FileLoader.getAttachFileName(this.recordingAudio)) {
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

    public void updateSilent(boolean z10) {
        this.isSilent = z10;
        m61 m61Var = this.videoPlayer;
        if (m61Var != null) {
            m61Var.O(z10);
        }
        setPlayerVolume();
        checkVolumeBarUI();
        MessageObject messageObject = this.playingMessageObject;
        if (messageObject != null) {
            NotificationCenter notificationCenter = NotificationCenter.getInstance(messageObject.currentAccount);
            int i10 = NotificationCenter.messagePlayingPlayStateChanged;
            MessageObject messageObject2 = this.playingMessageObject;
            notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, Integer.valueOf(messageObject2 != null ? messageObject2.getId() : 0));
        }
    }

    public static String copyFileToCache(Uri uri, String str, long j10) throws Throwable {
        Throwable th;
        File sharingDirectory;
        FileOutputStream fileOutputStream;
        Exception exc;
        InputStream inputStream;
        int i10;
        File file;
        InputStream inputStream2 = null;
        int i11 = 0;
        try {
            String strFixFileName = FileLoader.fixFileName(getFileName(uri));
            if (strFixFileName == null) {
                int lastLocalId = SharedConfig.getLastLocalId();
                SharedConfig.saveConfig();
                Locale locale = Locale.US;
                strFixFileName = lastLocalId + "." + str;
            }
            sharingDirectory = AndroidUtilities.getSharingDirectory();
            try {
                sharingDirectory.mkdirs();
                if (AndroidUtilities.isInternalUri(Uri.fromFile(sharingDirectory))) {
                    if (j10 > 0 && 0 > j10) {
                        sharingDirectory.delete();
                    }
                    return null;
                }
                int i12 = 0;
                do {
                    File sharingDirectory2 = AndroidUtilities.getSharingDirectory();
                    if (i12 == 0) {
                        file = new File(sharingDirectory2, strFixFileName);
                    } else {
                        int iLastIndexOf = strFixFileName.lastIndexOf(".");
                        if (iLastIndexOf > 0) {
                            sharingDirectory = new File(sharingDirectory2, strFixFileName.substring(0, iLastIndexOf) + " (" + i12 + ")" + strFixFileName.substring(iLastIndexOf));
                        } else {
                            file = new File(sharingDirectory2, strFixFileName + " (" + i12 + ")");
                        }
                        i12++;
                    }
                    sharingDirectory = file;
                    i12++;
                } while (sharingDirectory.exists());
                InputStream inputStreamOpenInputStream = ApplicationLoader.applicationContext.getContentResolver().openInputStream(uri);
                try {
                    if (inputStreamOpenInputStream instanceof FileInputStream) {
                        try {
                            if (AndroidUtilities.isInternalUri(((Integer) FileDescriptor.class.getDeclaredMethod("getInt$", null).invoke(((FileInputStream) inputStreamOpenInputStream).getFD(), null)).intValue())) {
                                try {
                                    inputStreamOpenInputStream.close();
                                } catch (Exception e9) {
                                    FileLog.e(e9);
                                }
                                if (j10 > 0 && 0 > j10) {
                                    sharingDirectory.delete();
                                }
                                return null;
                            }
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                        }
                    }
                    fileOutputStream = new FileOutputStream(sharingDirectory);
                    try {
                        byte[] bArr = new byte[20480];
                        i10 = 0;
                        while (true) {
                            try {
                                int i13 = inputStreamOpenInputStream.read(bArr);
                                if (i13 == -1) {
                                    String absolutePath = sharingDirectory.getAbsolutePath();
                                    try {
                                        inputStreamOpenInputStream.close();
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    try {
                                        fileOutputStream.close();
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                    }
                                    if (j10 > 0 && i10 > j10) {
                                        sharingDirectory.delete();
                                    }
                                    return absolutePath;
                                }
                                fileOutputStream.write(bArr, 0, i13);
                                i10 += i13;
                                if (j10 > 0) {
                                    long j11 = i10;
                                    if (j11 > j10) {
                                        try {
                                            inputStreamOpenInputStream.close();
                                        } catch (Exception e12) {
                                            FileLog.e(e12);
                                        }
                                        try {
                                            fileOutputStream.close();
                                        } catch (Exception e13) {
                                            FileLog.e(e13);
                                        }
                                        if (j10 > 0 && j11 > j10) {
                                            sharingDirectory.delete();
                                        }
                                        return null;
                                    }
                                }
                            } catch (Exception e14) {
                                e = e14;
                                sharingDirectory = sharingDirectory;
                                inputStream = inputStreamOpenInputStream;
                                exc = e;
                                FileLog.e(exc);
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (Exception e15) {
                                        FileLog.e(e15);
                                    }
                                }
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (Exception e16) {
                                        FileLog.e(e16);
                                    }
                                }
                                if (j10 > 0) {
                                    sharingDirectory.delete();
                                }
                                return null;
                            } catch (Throwable th3) {
                                inputStream2 = inputStreamOpenInputStream;
                                th = th3;
                                i11 = i10;
                                if (inputStream2 != null) {
                                    try {
                                        inputStream2.close();
                                    } catch (Exception e17) {
                                        FileLog.e(e17);
                                    }
                                }
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (Exception e18) {
                                        FileLog.e(e18);
                                    }
                                }
                                if (j10 > 0) {
                                    throw th;
                                }
                                throw th;
                            }
                        }
                    } catch (Exception e19) {
                        e = e19;
                        i10 = 0;
                        inputStream = inputStreamOpenInputStream;
                        exc = e;
                        FileLog.e(exc);
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        if (j10 > 0) {
                            sharingDirectory.delete();
                        }
                        return null;
                    } catch (Throwable th4) {
                        th = th4;
                        inputStream2 = inputStreamOpenInputStream;
                        th = th;
                        if (inputStream2 != null) {
                            inputStream2.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        if (j10 > 0) {
                            throw th;
                        }
                        throw th;
                    }
                } catch (Exception e20) {
                    e = e20;
                    fileOutputStream = null;
                } catch (Throwable th5) {
                    th = th5;
                    fileOutputStream = null;
                }
            } catch (Exception e21) {
                exc = e21;
                sharingDirectory = sharingDirectory;
                inputStream = null;
                fileOutputStream = null;
                i10 = 0;
            } catch (Throwable th6) {
                th = th6;
                fileOutputStream = null;
            }
        } catch (Exception e22) {
            exc = e22;
            inputStream = null;
            sharingDirectory = null;
            fileOutputStream = null;
        } catch (Throwable th7) {
            th = th7;
            sharingDirectory = null;
            fileOutputStream = null;
        }
        try {
            FileLog.e(exc);
            if (inputStream != null) {
                inputStream.close();
            }
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            if (j10 > 0 && i10 > j10) {
                sharingDirectory.delete();
            }
            return null;
        } catch (Throwable th8) {
            th = th8;
            inputStream2 = inputStream;
            sharingDirectory = sharingDirectory;
            i11 = i10;
            if (inputStream2 != null) {
                inputStream2.close();
            }
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            if (j10 > 0 || i11 <= j10) {
                throw th;
            }
            sharingDirectory.delete();
            throw th;
        }
    }

    private File joinRecord(File file, File file2, TLRPC.TL_document tL_document) {
        if (file != null && file2 != null) {
            File file3 = new File(FileLoader.getDirectory(1), System.currentTimeMillis() + "_" + FileLoader.getAttachFileName(tL_document)) {
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

    public void cleanupPlayer(boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        PipRoundVideoView pipRoundVideoView;
        MessageObject messageObject;
        if (z11 && restoreMusicPlaylistState()) {
            return;
        }
        int i10 = 2;
        if (this.audioPlayer != null) {
            MusicListenReporter musicListenReporter = this.reporter;
            if (musicListenReporter != null) {
                musicListenReporter.destroy();
                this.reporter = null;
            }
            ValueAnimator valueAnimator = this.audioVolumeAnimator;
            if (valueAnimator != null) {
                valueAnimator.removeAllUpdateListeners();
                this.audioVolumeAnimator.cancel();
            }
            if (d1.f.t() || !this.audioPlayer.z() || (messageObject = this.playingMessageObject) == null || messageObject.isVoice()) {
                try {
                    this.audioPlayer.I();
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
            } else {
                final m61 m61Var = this.audioPlayer;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.audioVolume, 0.0f);
                valueAnimatorOfFloat.addUpdateListener(new sh(i10, this, m61Var));
                valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        try {
                            m61Var.I();
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                    }
                });
                valueAnimatorOfFloat.setDuration(300L);
                valueAnimatorOfFloat.start();
            }
            this.audioPlayer = null;
            org.telegram.ui.ActionBar.g6.G1(this.playingMessageObject);
        } else {
            m61 m61Var2 = this.videoPlayer;
            if (m61Var2 != null) {
                this.currentAspectRatioFrameLayout = null;
                this.currentTextureViewContainer = null;
                this.currentAspectRatioFrameLayoutReady = false;
                this.isDrawingWasReady = false;
                this.currentTextureView = null;
                this.goingToShowMessageObject = null;
                if (z13) {
                    PhotoViewer.t1().O2 = this.videoPlayer;
                    MessageObject messageObject2 = this.playingMessageObject;
                    this.goingToShowMessageObject = messageObject2;
                    NotificationCenter.getInstance(messageObject2.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagePlayingGoingToStop, this.playingMessageObject, Boolean.TRUE);
                } else {
                    long jO = m61Var2.o();
                    MessageObject messageObject3 = this.playingMessageObject;
                    if (messageObject3 != null && messageObject3.isVideo() && jO > 0) {
                        MessageObject messageObject4 = this.playingMessageObject;
                        messageObject4.audioProgressMs = (int) jO;
                        NotificationCenter.getInstance(messageObject4.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagePlayingGoingToStop, this.playingMessageObject, Boolean.FALSE);
                    }
                    this.videoPlayer.I();
                    this.videoPlayer = null;
                }
                try {
                    this.baseActivity.getWindow().clearFlags(128);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                if (this.playingMessageObject != null && !z13) {
                    AndroidUtilities.cancelRunOnUIThread(this.setLoadingRunnable);
                    FileLoader.getInstance(this.playingMessageObject.currentAccount).removeLoadingVideo(this.playingMessageObject.getDocument(), true, false);
                }
            }
        }
        stopProgressTimer();
        this.lastProgress = 0L;
        this.isPaused = false;
        MessageObject messageObject5 = this.playingMessageObject;
        if (messageObject5 != null) {
            if (this.downloadingCurrentMessage) {
                FileLoader.getInstance(messageObject5.currentAccount).cancelLoadFile(this.playingMessageObject.getDocument());
            }
            MessageObject messageObject6 = this.playingMessageObject;
            if (z10) {
                messageObject6.resetPlayingProgress();
                NotificationCenter.getInstance(messageObject6.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagePlayingProgressDidChanged, Integer.valueOf(this.playingMessageObject.getId()), 0);
            }
            this.playingMessageObject = null;
            this.downloadingCurrentMessage = false;
            if (z10) {
                NotificationsController.audioManager.abandonAudioFocus(this);
                this.hasAudioFocus = 0;
                ArrayList<MessageObject> arrayList = this.voiceMessagesPlaylist;
                int iIndexOf = -1;
                if (arrayList != null) {
                    if (!z12 || (iIndexOf = arrayList.indexOf(messageObject6)) < 0) {
                        this.voiceMessagesPlaylist = null;
                        this.voiceMessagesPlaylistMap = null;
                    } else {
                        this.voiceMessagesPlaylist.remove(iIndexOf);
                        this.voiceMessagesPlaylistMap.remove(messageObject6.getId());
                        if (this.voiceMessagesPlaylist.isEmpty()) {
                            this.voiceMessagesPlaylist = null;
                            this.voiceMessagesPlaylistMap = null;
                        }
                    }
                }
                ArrayList<MessageObject> arrayList2 = this.voiceMessagesPlaylist;
                if (arrayList2 == null || iIndexOf >= arrayList2.size()) {
                    if ((messageObject6.isVoice() || messageObject6.isRoundVideo()) && messageObject6.getId() != 0) {
                        startRecordingIfFromSpeaker();
                    }
                    NotificationCenter.getInstance(messageObject6.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagePlayingDidReset, Integer.valueOf(messageObject6.getId()), Boolean.valueOf(z11));
                    this.pipSwitchingState = 0;
                    PipRoundVideoView pipRoundVideoView2 = this.pipRoundVideoView;
                    if (pipRoundVideoView2 != null) {
                        pipRoundVideoView2.a(true);
                        this.pipRoundVideoView = null;
                    }
                    z14 = false;
                } else {
                    MessageObject messageObject7 = this.voiceMessagesPlaylist.get(iIndexOf);
                    playMessage(messageObject7);
                    if (!messageObject7.isRoundVideo() && (pipRoundVideoView = this.pipRoundVideoView) != null) {
                        pipRoundVideoView.a(true);
                        this.pipRoundVideoView = null;
                    }
                    z14 = true;
                }
            } else {
                z14 = false;
            }
            if (z11) {
                ApplicationLoader.applicationContext.stopService(new Intent(ApplicationLoader.applicationContext, (Class<?>) MusicPlayerService.class));
            }
        } else {
            z14 = false;
        }
        if (!z14 && z12 && !SharedConfig.enabledRaiseTo(true)) {
            rn rnVar = this.raiseChat;
            stopRaiseToEarSensors(rnVar, false, false);
            this.raiseChat = rnVar;
        }
        if (!z11 || d1.f.f() == null) {
            return;
        }
        try {
            n5.a aVarC = n5.a.c(d1.f.f());
            if (aVarC == null) {
                return;
            }
            aVarC.b().b(true);
        } catch (Exception e11) {
            FileLog.e(e11);
        }
    }

    public boolean pauseMessage(MessageObject messageObject, boolean z10) {
        if ((this.audioPlayer != null || this.videoPlayer != null) && messageObject != null && this.playingMessageObject != null && isSamePlayingMessage(messageObject)) {
            stopProgressTimer();
            try {
                if (this.audioPlayer == null) {
                    m61 m61Var = this.videoPlayer;
                    if (m61Var != null) {
                        m61Var.C();
                    }
                } else if (!z10 || d1.f.t() || this.playingMessageObject.isVoice() || this.playingMessageObject.getDuration() * ((double) (1.0f - this.playingMessageObject.audioProgress)) <= 1.0d || !LaunchActivity.A1) {
                    this.audioPlayer.C();
                } else {
                    ValueAnimator valueAnimator = this.audioVolumeAnimator;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllUpdateListeners();
                        this.audioVolumeAnimator.cancel();
                    }
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                    this.audioVolumeAnimator = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(this.audioVolumeUpdateListener);
                    this.audioVolumeAnimator.setDuration(300L);
                    this.audioVolumeAnimator.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            if (MediaController.this.audioPlayer != null) {
                                MediaController.this.audioPlayer.C();
                            }
                        }
                    });
                    this.audioVolumeAnimator.start();
                }
                this.isPaused = true;
                NotificationCenter.getInstance(this.playingMessageObject.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagePlayingPlayStateChanged, Integer.valueOf(this.playingMessageObject.getId()));
                try {
                    d1.f.b(1);
                    if (!this.ignorePlayerUpdate) {
                        if (xe.b.D().H()) {
                            xe.b.D().P(getCurrentChromecastMedia());
                        }
                        d1.f.w(false);
                    }
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                return true;
            } catch (Exception e10) {
                FileLog.e(e10);
                this.isPaused = false;
            }
        }
        return false;
    }

    public boolean playMessage(final MessageObject messageObject, boolean z10) {
        boolean z11;
        File file;
        boolean zExists;
        float f10;
        final File pathToMessage;
        String str;
        String str2;
        int[] iArr;
        String str3;
        String str4;
        PipRoundVideoView pipRoundVideoView;
        byte[] bArr;
        int i10;
        float f11;
        char c10;
        PowerManager.WakeLock wakeLock;
        ?? r10;
        MusicListenReporter musicListenReporter;
        if (messageObject != null) {
            this.isSilent = z10;
            checkVolumeBarUI();
            if (!(this.audioPlayer == null && this.videoPlayer == null) && isSamePlayingMessage(messageObject)) {
                if (this.isPaused) {
                    resumeAudio(messageObject);
                }
                if (SharedConfig.enabledRaiseTo(true)) {
                    return true;
                }
                startRaiseToEarSensors(this.raiseChat);
                return true;
            }
            if (!messageObject.isOut() && messageObject.isContentUnread()) {
                MessagesController.getInstance(messageObject.currentAccount).markMessageContentAsRead(messageObject);
            }
            boolean z12 = !this.playMusicAgain;
            MessageObject messageObject2 = this.playingMessageObject;
            if (messageObject2 != null) {
                boolean zSaveMusicPlaylistStateIfNeeded = ((messageObject2.isMusic() && messageObject.isVoice()) || messageObject.isRoundVideo() || messageObject.isVideo()) ? saveMusicPlaylistStateIfNeeded() : false;
                if (!this.playMusicAgain) {
                    this.playingMessageObject.resetPlayingProgress();
                    NotificationCenter.getInstance(this.playingMessageObject.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagePlayingProgressDidChanged, Integer.valueOf(this.playingMessageObject.getId()), 0);
                }
                z11 = zSaveMusicPlaylistStateIfNeeded;
                z12 = false;
            } else {
                z11 = false;
            }
            cleanupPlayer(z12, false);
            this.shouldSavePositionForCurrentAudio = null;
            this.lastSaveTime = 0L;
            this.playMusicAgain = false;
            this.seekToProgressPending = 0.0f;
            String str5 = messageObject.messageOwner.attachPath;
            if (str5 == null || str5.length() <= 0) {
                file = null;
                zExists = false;
            } else {
                File file2 = new File(messageObject.messageOwner.attachPath);
                zExists = file2.exists();
                file = !zExists ? null : file2;
            }
            if (file != null) {
                pathToMessage = file;
                f10 = 0.0f;
            } else {
                f10 = 0.0f;
                pathToMessage = FileLoader.getInstance(messageObject.currentAccount).getPathToMessage(messageObject.messageOwner);
            }
            boolean z13 = SharedConfig.streamMedia && !((!messageObject.isMusic() && !messageObject.isRoundVideo() && (!messageObject.isVideo() || !messageObject.canStreamVideo())) || messageObject.shouldEncryptPhotoOrVideo() || DialogObject.isEncryptedDialog(messageObject.getDialogId()));
            if (pathToMessage != file && !(zExists = pathToMessage.exists()) && !z13) {
                FileLoader.getInstance(messageObject.currentAccount).loadFile(messageObject.getDocument(), messageObject, 0, messageObject.shouldEncryptPhotoOrVideo() ? 2 : 0);
                this.downloadingCurrentMessage = true;
                this.isPaused = false;
                this.lastProgress = 0L;
                this.audioInfo = null;
                this.playingMessageObject = messageObject;
                if (canStartMusicPlayerService()) {
                    try {
                        ApplicationLoader.applicationContext.startService(new Intent(ApplicationLoader.applicationContext, (Class<?>) MusicPlayerService.class));
                    } catch (Throwable th) {
                        FileLog.e(th);
                    }
                } else {
                    ApplicationLoader.applicationContext.stopService(new Intent(ApplicationLoader.applicationContext, (Class<?>) MusicPlayerService.class));
                }
                NotificationCenter.getInstance(this.playingMessageObject.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagePlayingPlayStateChanged, Integer.valueOf(this.playingMessageObject.getId()));
                return true;
            }
            boolean z14 = zExists;
            this.downloadingCurrentMessage = false;
            if (messageObject.isMusic()) {
                checkIsNextMusicFileDownloaded(messageObject.currentAccount);
            } else {
                checkIsNextVoiceFileDownloaded(messageObject.currentAccount);
            }
            c5.c cVar = this.currentAspectRatioFrameLayout;
            if (cVar != null) {
                this.isDrawingWasReady = false;
                cVar.setDrawingReady(false);
            }
            boolean zIsVideo = messageObject.isVideo();
            boolean z15 = z11;
            if (messageObject.isRoundVideo() || zIsVideo) {
                final File file3 = pathToMessage;
                FileLoader.getInstance(messageObject.currentAccount).setLoadingVideoForPlayer(messageObject.getDocument(), true);
                this.playerWasReady = false;
                if (zIsVideo) {
                    str = "other";
                    str2 = "&reference=";
                    boolean z16 = messageObject.messageOwner.peer_id.channel_id == 0 && messageObject.audioProgress <= 0.1f;
                    if (zIsVideo || messageObject.getDuration() > 30.0d) {
                        iArr = null;
                    } else {
                        iArr = new int[]{1};
                    }
                    if (!z15) {
                        clearPlaylist();
                    }
                    m61 m61Var = new m61();
                    this.videoPlayer = m61Var;
                    str3 = str2;
                    m61Var.O(z10);
                    int i11 = this.playerNum + 1;
                    this.playerNum = i11;
                    str4 = str;
                    this.videoPlayer.F = new AnonymousClass9(i11, messageObject, iArr, z16);
                    this.currentAspectRatioFrameLayoutReady = false;
                    if (this.pipRoundVideoView == null || !MessagesController.getInstance(messageObject.currentAccount).isDialogVisible(messageObject.getDialogId(), messageObject.scheduled)) {
                        if (this.pipRoundVideoView == null) {
                            try {
                                PipRoundVideoView pipRoundVideoView2 = new PipRoundVideoView();
                                this.pipRoundVideoView = pipRoundVideoView2;
                                pipRoundVideoView2.d(this.baseActivity, new w5(this, 1));
                            } catch (Exception unused) {
                                this.pipRoundVideoView = null;
                            }
                        }
                        pipRoundVideoView = this.pipRoundVideoView;
                        if (pipRoundVideoView != null) {
                            this.videoPlayer.W(pipRoundVideoView.f26422c);
                        }
                    } else {
                        TextureView textureView = this.currentTextureView;
                        if (textureView != null) {
                            this.videoPlayer.W(textureView);
                        }
                    }
                    if (z14) {
                        if (!messageObject.mediaExists && file3 != file) {
                            final int i12 = 0;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            MediaController.lambda$playMessage$21(messageObject, file3);
                                            break;
                                        default:
                                            MediaController.lambda$playMessage$22(messageObject, file3);
                                            break;
                                    }
                                }
                            });
                        }
                        this.videoPlayer.E(Uri.fromFile(file3), str4);
                    } else {
                        try {
                            int fileReference = FileLoader.getInstance(messageObject.currentAccount).getFileReference(messageObject);
                            TLRPC.Document document = messageObject.getDocument();
                            StringBuilder sb2 = new StringBuilder("?account=");
                            sb2.append(messageObject.currentAccount);
                            sb2.append("&id=");
                            sb2.append(document.f22386id);
                            sb2.append("&hash=");
                            sb2.append(document.access_hash);
                            sb2.append("&dc=");
                            sb2.append(document.dc_id);
                            sb2.append("&size=");
                            sb2.append(document.size);
                            sb2.append("&mime=");
                            sb2.append(URLEncoder.encode(document.mime_type, "UTF-8"));
                            sb2.append("&rid=");
                            sb2.append(fileReference);
                            sb2.append("&name=");
                            sb2.append(URLEncoder.encode(FileLoader.getDocumentFileName(document), "UTF-8"));
                            sb2.append(str3);
                            bArr = document.file_reference;
                            if (bArr != null) {
                                bArr = new byte[0];
                            }
                            sb2.append(Utilities.bytesToHex(bArr));
                            this.videoPlayer.E(Uri.parse("tg://" + messageObject.getFileName() + sb2.toString()), str4);
                        } catch (Exception e9) {
                            FileLog.e(e9);
                        }
                    }
                    if (messageObject.isRoundVideo()) {
                        m61 m61Var2 = this.videoPlayer;
                        if (this.useFrontSpeaker) {
                            i10 = 0;
                        } else {
                            i10 = 3;
                        }
                        m61Var2.T(i10);
                        if (Math.abs(this.currentPlaybackSpeed - 1.0f) > 0.001f) {
                            this.videoPlayer.R(Math.round(this.currentPlaybackSpeed * 10.0f) / 10.0f);
                        }
                        f11 = messageObject.forceSeekTo;
                        if (f11 >= f10) {
                            this.seekToProgressPending = f11;
                            messageObject.audioProgress = f11;
                            messageObject.forceSeekTo = -1.0f;
                        }
                    } else {
                        this.videoPlayer.T(3);
                    }
                } else {
                    str = "other";
                    str2 = "&reference=";
                }
                if (zIsVideo) {
                    iArr = null;
                } else {
                    iArr = null;
                }
                if (!z15) {
                    clearPlaylist();
                }
                m61 m61Var3 = new m61();
                this.videoPlayer = m61Var3;
                str3 = str2;
                m61Var3.O(z10);
                int i13 = this.playerNum + 1;
                this.playerNum = i13;
                str4 = str;
                this.videoPlayer.F = new AnonymousClass9(i13, messageObject, iArr, z16);
                this.currentAspectRatioFrameLayoutReady = false;
                if (this.pipRoundVideoView == null) {
                    if (this.pipRoundVideoView == null) {
                        PipRoundVideoView pipRoundVideoView3 = new PipRoundVideoView();
                        this.pipRoundVideoView = pipRoundVideoView3;
                        pipRoundVideoView3.d(this.baseActivity, new w5(this, 1));
                    }
                    pipRoundVideoView = this.pipRoundVideoView;
                    if (pipRoundVideoView != null) {
                        this.videoPlayer.W(pipRoundVideoView.f26422c);
                    }
                } else {
                    if (this.pipRoundVideoView == null) {
                        PipRoundVideoView pipRoundVideoView4 = new PipRoundVideoView();
                        this.pipRoundVideoView = pipRoundVideoView4;
                        pipRoundVideoView4.d(this.baseActivity, new w5(this, 1));
                    }
                    pipRoundVideoView = this.pipRoundVideoView;
                    if (pipRoundVideoView != null) {
                        this.videoPlayer.W(pipRoundVideoView.f26422c);
                    }
                }
                if (z14) {
                    if (!messageObject.mediaExists) {
                        final int i14 = 0;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (i14) {
                                    case 0:
                                        MediaController.lambda$playMessage$21(messageObject, file3);
                                        break;
                                    default:
                                        MediaController.lambda$playMessage$22(messageObject, file3);
                                        break;
                                }
                            }
                        });
                    }
                    this.videoPlayer.E(Uri.fromFile(file3), str4);
                } else {
                    int fileReference2 = FileLoader.getInstance(messageObject.currentAccount).getFileReference(messageObject);
                    TLRPC.Document document2 = messageObject.getDocument();
                    StringBuilder sb3 = new StringBuilder("?account=");
                    sb3.append(messageObject.currentAccount);
                    sb3.append("&id=");
                    sb3.append(document2.f22386id);
                    sb3.append("&hash=");
                    sb3.append(document2.access_hash);
                    sb3.append("&dc=");
                    sb3.append(document2.dc_id);
                    sb3.append("&size=");
                    sb3.append(document2.size);
                    sb3.append("&mime=");
                    sb3.append(URLEncoder.encode(document2.mime_type, "UTF-8"));
                    sb3.append("&rid=");
                    sb3.append(fileReference2);
                    sb3.append("&name=");
                    sb3.append(URLEncoder.encode(FileLoader.getDocumentFileName(document2), "UTF-8"));
                    sb3.append(str3);
                    bArr = document2.file_reference;
                    if (bArr != null) {
                        bArr = new byte[0];
                    }
                    sb3.append(Utilities.bytesToHex(bArr));
                    this.videoPlayer.E(Uri.parse("tg://" + messageObject.getFileName() + sb3.toString()), str4);
                }
                if (messageObject.isRoundVideo()) {
                    m61 m61Var4 = this.videoPlayer;
                    if (this.useFrontSpeaker) {
                        i10 = 0;
                    } else {
                        i10 = 3;
                    }
                    m61Var4.T(i10);
                    if (Math.abs(this.currentPlaybackSpeed - 1.0f) > 0.001f) {
                        this.videoPlayer.R(Math.round(this.currentPlaybackSpeed * 10.0f) / 10.0f);
                    }
                    f11 = messageObject.forceSeekTo;
                    if (f11 >= f10) {
                        this.seekToProgressPending = f11;
                        messageObject.audioProgress = f11;
                        messageObject.forceSeekTo = -1.0f;
                    }
                } else {
                    this.videoPlayer.T(3);
                }
            } else {
                PipRoundVideoView pipRoundVideoView5 = this.pipRoundVideoView;
                if (pipRoundVideoView5 != null) {
                    pipRoundVideoView5.a(true);
                    this.pipRoundVideoView = null;
                }
                try {
                    m61 m61Var5 = new m61();
                    this.audioPlayer = m61Var5;
                    final int i15 = this.playerNum + 1;
                    this.playerNum = i15;
                    m61Var5.F = new j61() {
                        @Override
                        public void onRenderedFirstFrame() {
                        }

                        @Override
                        public void onStateChanged(boolean z17, int i16) {
                            if (i15 != MediaController.this.playerNum) {
                                return;
                            }
                            if (i16 == 4 || ((i16 == 1 || i16 == 2) && z17 && messageObject.audioProgress >= 0.999f)) {
                                MessageObject messageObject3 = messageObject;
                                messageObject3.audioProgress = 1.0f;
                                NotificationCenter.getInstance(messageObject3.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagePlayingProgressDidChanged, Integer.valueOf(messageObject.getId()), 0);
                                if (!MediaController.this.restoreMusicPlaylistState()) {
                                    if (MediaController.this.playlist.isEmpty() || (MediaController.this.playlist.size() <= 1 && messageObject.isVoice())) {
                                        MediaController mediaController = MediaController.this;
                                        mediaController.cleanupPlayer(true, mediaController.hasNoNextVoiceOrRoundVideoMessage(), messageObject.isVoice(), false);
                                    } else {
                                        MediaController.this.playNextMessageWithoutOrder(true);
                                    }
                                }
                            } else if (MediaController.this.audioPlayer != null && MediaController.this.seekToProgressPending != 0.0f && (i16 == 3 || i16 == 1)) {
                                long jQ = (int) (MediaController.this.seekToProgressPending * MediaController.this.audioPlayer.q());
                                MediaController.this.audioPlayer.L(jQ);
                                MediaController.this.lastProgress = jQ;
                                MediaController.this.seekToProgressPending = 0.0f;
                            }
                            if (MediaController.this.audioPlayer == null || !d1.f.t()) {
                                return;
                            }
                            MediaController.this.audioPlayer.P(true);
                        }

                        @Override
                        public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
                            return false;
                        }

                        @Override
                        public void onRenderedFirstFrame(i3.a aVar) {
                        }

                        @Override
                        public void onSeekFinished(i3.a aVar) {
                        }

                        @Override
                        public void onSeekStarted(i3.a aVar) {
                        }

                        @Override
                        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                        }

                        @Override
                        public void onError(m61 m61Var6, Exception exc) {
                        }

                        @Override
                        public void onVideoSizeChanged(int i16, int i17, int i18, float f12) {
                        }
                    };
                    this.audioPlayer.G = new f61() {
                        @Override
                        public boolean needUpdate() {
                            return org.telegram.ui.ActionBar.g6.x0().f27363i != null;
                        }

                        @Override
                        public void onVisualizerUpdate(boolean z17, boolean z18, float[] fArr) {
                            org.telegram.ui.ActionBar.g6.x0().e(z17, z18, fArr);
                        }
                    };
                    if (z14) {
                        if (!messageObject.mediaExists && pathToMessage != file) {
                            final int i16 = 1;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i16) {
                                        case 0:
                                            MediaController.lambda$playMessage$21(messageObject, pathToMessage);
                                            break;
                                        default:
                                            MediaController.lambda$playMessage$22(messageObject, pathToMessage);
                                            break;
                                    }
                                }
                            });
                        }
                        this.audioPlayer.E(Uri.fromFile(pathToMessage), "other");
                        this.isStreamingCurrentAudio = false;
                    } else {
                        int fileReference3 = FileLoader.getInstance(messageObject.currentAccount).getFileReference(messageObject);
                        TLRPC.Document document3 = messageObject.getDocument();
                        StringBuilder sb4 = new StringBuilder("?account=");
                        sb4.append(messageObject.currentAccount);
                        sb4.append("&id=");
                        sb4.append(document3.f22386id);
                        sb4.append("&hash=");
                        sb4.append(document3.access_hash);
                        sb4.append("&dc=");
                        sb4.append(document3.dc_id);
                        sb4.append("&size=");
                        sb4.append(document3.size);
                        sb4.append("&mime=");
                        sb4.append(URLEncoder.encode(document3.mime_type, "UTF-8"));
                        sb4.append("&rid=");
                        sb4.append(fileReference3);
                        sb4.append("&name=");
                        sb4.append(URLEncoder.encode(FileLoader.getDocumentFileName(document3), "UTF-8"));
                        sb4.append("&reference=");
                        byte[] bArr2 = document3.file_reference;
                        if (bArr2 == null) {
                            bArr2 = new byte[0];
                        }
                        sb4.append(Utilities.bytesToHex(bArr2));
                        this.audioPlayer.E(Uri.parse("tg://" + messageObject.getFileName() + sb4.toString()), "other");
                        this.isStreamingCurrentAudio = true;
                    }
                    if (messageObject.isVoice()) {
                        String fileName = messageObject.getFileName();
                        if (fileName != null && messageObject.getDuration() >= 300.0d) {
                            float f12 = ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).getFloat(fileName, -1.0f);
                            if (f12 > f10 && f12 < 0.99f) {
                                this.seekToProgressPending = f12;
                                messageObject.audioProgress = f12;
                            }
                            this.shouldSavePositionForCurrentAudio = fileName;
                        }
                        if (Math.abs(this.currentPlaybackSpeed - 1.0f) > 0.001f) {
                            this.audioPlayer.R(Math.round(this.currentPlaybackSpeed * 10.0f) / 10.0f);
                        }
                        this.audioInfo = null;
                        if (!z15) {
                            clearPlaylist();
                        }
                    } else {
                        try {
                            this.audioInfo = se.a.a(pathToMessage);
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        String fileName2 = messageObject.getFileName();
                        if (!TextUtils.isEmpty(fileName2) && messageObject.getDuration() >= 600.0d) {
                            float f13 = ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).getFloat(fileName2, -1.0f);
                            if (f13 > f10 && f13 < 0.999f) {
                                this.seekToProgressPending = f13;
                                messageObject.audioProgress = f13;
                            }
                            this.shouldSavePositionForCurrentAudio = fileName2;
                            if (Math.abs(this.currentMusicPlaybackSpeed - 1.0f) > 0.001f) {
                                this.audioPlayer.R(Math.round(this.currentMusicPlaybackSpeed * 10.0f) / 10.0f);
                            }
                        }
                    }
                    float f14 = messageObject.forceSeekTo;
                    if (f14 >= f10) {
                        this.seekToProgressPending = f14;
                        messageObject.audioProgress = f14;
                        messageObject.forceSeekTo = -1.0f;
                    }
                    if (!messageObject.isMusic() || messageObject.getDocument() == null || DialogObject.isEncryptedDialog(messageObject.getDialogId())) {
                        MusicListenReporter musicListenReporter2 = this.reporter;
                        if (musicListenReporter2 != null) {
                            musicListenReporter2.destroy();
                            this.reporter = null;
                        }
                    } else {
                        MusicListenReporter musicListenReporter3 = this.reporter;
                        if (musicListenReporter3 == null || musicListenReporter3.currentAccount != messageObject.currentAccount) {
                            if (musicListenReporter3 != null) {
                                musicListenReporter3.destroy();
                            }
                            this.reporter = new MusicListenReporter(messageObject.currentAccount);
                        }
                        TLRPC.Document document4 = messageObject.getDocument();
                        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                        tL_inputDocument.f22392id = document4.f22386id;
                        tL_inputDocument.access_hash = document4.access_hash;
                        byte[] bArr3 = document4.file_reference;
                        tL_inputDocument.file_reference = bArr3;
                        if (bArr3 == null) {
                            tL_inputDocument.file_reference = new byte[0];
                        }
                        this.reporter.setup(tL_inputDocument);
                    }
                    h3.k0 k0Var = this.audioPlayer.d;
                    if (k0Var != null && (musicListenReporter = this.reporter) != null) {
                        k0Var.k(musicListenReporter.getPlayerListener(k0Var));
                    }
                    this.audioPlayer.T(this.useFrontSpeaker ? 0 : 3);
                    this.audioPlayer.D();
                    if (messageObject.isVoice()) {
                        this.audioVolume = 1.0f;
                        setPlayerVolume();
                    } else {
                        ValueAnimator valueAnimator = this.audioVolumeAnimator;
                        if (valueAnimator != null) {
                            valueAnimator.removeAllListeners();
                            this.audioVolumeAnimator.cancel();
                        }
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.audioVolume, 1.0f);
                        this.audioVolumeAnimator = valueAnimatorOfFloat;
                        valueAnimatorOfFloat.addUpdateListener(this.audioVolumeUpdateListener);
                        this.audioVolumeAnimator.setDuration(300L);
                        this.audioVolumeAnimator.start();
                    }
                } catch (Exception e11) {
                    FileLog.e(e11);
                    NotificationCenter notificationCenter = NotificationCenter.getInstance(messageObject.currentAccount);
                    int i17 = NotificationCenter.messagePlayingPlayStateChanged;
                    MessageObject messageObject3 = this.playingMessageObject;
                    notificationCenter.lambda$postNotificationNameOnUIThread$1(i17, Integer.valueOf(messageObject3 != null ? messageObject3.getId() : 0));
                    if (this.audioPlayer != null) {
                        MusicListenReporter musicListenReporter4 = this.reporter;
                        if (musicListenReporter4 != null) {
                            musicListenReporter4.destroy();
                            r10 = 0;
                            this.reporter = null;
                        } else {
                            r10 = 0;
                        }
                        this.audioPlayer.I();
                        this.audioPlayer = r10;
                        org.telegram.ui.ActionBar.g6.G1(this.playingMessageObject);
                        this.isPaused = false;
                        this.playingMessageObject = r10;
                        this.downloadingCurrentMessage = false;
                        return false;
                    }
                }
            }
            checkAudioFocus(messageObject);
            setPlayerVolume();
            this.isPaused = false;
            this.lastProgress = 0L;
            this.playingMessageObject = messageObject;
            if (!SharedConfig.enabledRaiseTo(true)) {
                startRaiseToEarSensors(this.raiseChat);
            }
            if (ApplicationLoader.mainInterfacePaused || (wakeLock = this.proximityWakeLock) == null || wakeLock.isHeld() || !(this.playingMessageObject.isVoice() || this.playingMessageObject.isRoundVideo())) {
                c10 = 0;
            } else {
                c10 = 0;
                SharedConfig.enabledRaiseTo(false);
            }
            startProgressTimer(this.playingMessageObject);
            NotificationCenter notificationCenter2 = NotificationCenter.getInstance(messageObject.currentAccount);
            int i18 = NotificationCenter.messagePlayingDidStart;
            Object[] objArr = new Object[2];
            objArr[c10] = messageObject;
            objArr[1] = messageObject2;
            notificationCenter2.lambda$postNotificationNameOnUIThread$1(i18, objArr);
            m61 m61Var6 = this.videoPlayer;
            if (m61Var6 != null) {
                try {
                    if (this.playingMessageObject.audioProgress != f10) {
                        long jQ = m61Var6.q();
                        if (jQ == -9223372036854775807L) {
                            jQ = ((long) this.playingMessageObject.getDuration()) * 1000;
                        }
                        MessageObject messageObject4 = this.playingMessageObject;
                        int i19 = (int) (jQ * messageObject4.audioProgress);
                        int i20 = messageObject4.audioProgressMs;
                        if (i20 != 0) {
                            messageObject4.audioProgressMs = 0;
                            i19 = i20;
                        }
                        this.videoPlayer.L(i19);
                    }
                } catch (Exception e12) {
                    MessageObject messageObject5 = this.playingMessageObject;
                    messageObject5.audioProgress = 0.0f;
                    messageObject5.audioProgressSec = 0;
                    NotificationCenter.getInstance(messageObject.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagePlayingProgressDidChanged, Integer.valueOf(this.playingMessageObject.getId()), 0);
                    FileLog.e(e12);
                }
                this.videoPlayer.D();
            } else {
                m61 m61Var7 = this.audioPlayer;
                if (m61Var7 != null) {
                    try {
                        if (this.playingMessageObject.audioProgress != 0.0f) {
                            long jQ2 = m61Var7.q();
                            if (jQ2 == -9223372036854775807L) {
                                jQ2 = ((long) this.playingMessageObject.getDuration()) * 1000;
                            }
                            long j10 = (int) (jQ2 * this.playingMessageObject.audioProgress);
                            this.audioPlayer.L(j10);
                            if (!this.ignorePlayerUpdate) {
                                d1.f.u(j10);
                            }
                        }
                    } catch (Exception e13) {
                        this.playingMessageObject.resetPlayingProgress();
                        NotificationCenter.getInstance(messageObject.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagePlayingProgressDidChanged, Integer.valueOf(this.playingMessageObject.getId()), 0);
                        FileLog.e(e13);
                    }
                }
            }
            if (canStartMusicPlayerService()) {
                try {
                    ApplicationLoader.applicationContext.startService(new Intent(ApplicationLoader.applicationContext, (Class<?>) MusicPlayerService.class));
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            } else {
                ApplicationLoader.applicationContext.stopService(new Intent(ApplicationLoader.applicationContext, (Class<?>) MusicPlayerService.class));
            }
            try {
                d1.f.b(1);
                if (this.ignorePlayerUpdate) {
                    return true;
                }
                if (xe.b.D().H()) {
                    xe.b.D().P(getCurrentChromecastMedia());
                }
                d1.f.w(true);
                return true;
            } catch (Exception e14) {
                FileLog.e(e14);
                return true;
            }
        }
        return false;
    }

    public void scheduleVideoConvert(MessageObject messageObject, VideoEditedInfo videoEditedInfo) {
        scheduleVideoConvert(messageObject, videoEditedInfo, false, true, false);
    }

    public boolean setPlaylist(ArrayList<MessageObject> arrayList, MessageObject messageObject, long j10) {
        return setPlaylist(arrayList, messageObject, j10, true, null);
    }

    public void setTextureView(TextureView textureView, c5.c cVar, FrameLayout frameLayout, boolean z10, Runnable runnable) {
        if (textureView == null) {
            return;
        }
        if (!z10 && this.currentTextureView == textureView) {
            this.pipSwitchingState = 1;
            this.currentTextureView = null;
            this.currentAspectRatioFrameLayout = null;
            this.currentTextureViewContainer = null;
            return;
        }
        if (this.videoPlayer == null || textureView == this.currentTextureView) {
            return;
        }
        this.isDrawingWasReady = cVar != null && cVar.d;
        this.currentTextureView = textureView;
        if (runnable != null && this.pipRoundVideoView == null) {
            try {
                PipRoundVideoView pipRoundVideoView = new PipRoundVideoView();
                this.pipRoundVideoView = pipRoundVideoView;
                pipRoundVideoView.d(this.baseActivity, new w5(this, 8));
            } catch (Exception unused) {
                this.pipRoundVideoView = null;
            }
        }
        PipRoundVideoView pipRoundVideoView2 = this.pipRoundVideoView;
        if (pipRoundVideoView2 != null) {
            this.videoPlayer.W(pipRoundVideoView2.f26422c);
        } else {
            this.videoPlayer.W(this.currentTextureView);
        }
        this.currentAspectRatioFrameLayout = cVar;
        this.currentTextureViewContainer = frameLayout;
        if (!this.currentAspectRatioFrameLayoutReady || cVar == null) {
            return;
        }
        cVar.a(this.currentAspectRatioFrameLayoutRatio, this.currentAspectRatioFrameLayoutRotation);
    }

    public static void saveFile(String str, Context context, int i10, String str2, String str3, Utilities.Callback<Uri> callback, boolean z10) {
        File file;
        org.telegram.ui.ActionBar.b2 b2Var;
        if (str == null || context == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            file = null;
        } else {
            File file2 = new File(str);
            if (!file2.exists() || AndroidUtilities.isInternalUri(Uri.fromFile(file2))) {
                file = null;
            } else {
                file = file2;
            }
        }
        if (file == null) {
            return;
        }
        int i11 = 0;
        boolean[] zArr = {false};
        if (file.exists()) {
            boolean[] zArr2 = new boolean[1];
            if (i10 != 0) {
                try {
                    org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(context, 2, null);
                    b2Var2.m(LocaleController.getString(R.string.Loading));
                    b2Var2.setCanceledOnTouchOutside(false);
                    b2Var2.setCancelable(true);
                    b2Var2.setOnCancelListener(new x5(zArr, i11));
                    AndroidUtilities.runOnUIThread(new y5(zArr2, b2Var2, i11), 250L);
                    b2Var = b2Var2;
                } catch (Exception e9) {
                    FileLog.e(e9);
                    b2Var = null;
                }
            } else {
                b2Var = null;
            }
            new Thread(new z5(i10, file, str2, b2Var, zArr, str3, callback, zArr2)).start();
        }
    }

    public boolean scheduleVideoConvert(MessageObject messageObject, boolean z10, boolean z11, boolean z12) {
        return scheduleVideoConvert(messageObject, messageObject != null ? messageObject.videoEditedInfo : null, z10, z11, z12);
    }

    public boolean setPlaylist(ArrayList<MessageObject> arrayList, MessageObject messageObject, long j10, boolean z10, PlaylistGlobalSearchParams playlistGlobalSearchParams) {
        if (this.playingMessageObject == messageObject) {
            int iIndexOf = this.playlist.indexOf(messageObject);
            if (iIndexOf >= 0) {
                this.currentPlaylistNum = iIndexOf;
            }
            return playMessage(messageObject);
        }
        this.forceLoopCurrentPlaylist = !z10;
        this.playlistMergeDialogId = j10;
        this.playMusicAgain = !this.playlist.isEmpty();
        clearPlaylist();
        this.playlistGlobalSearchParams = playlistGlobalSearchParams;
        boolean z11 = false;
        if (!arrayList.isEmpty() && DialogObject.isEncryptedDialog(arrayList.get(0).getDialogId())) {
            z11 = true;
        }
        int iMin = Integer.MAX_VALUE;
        int iMax = Integer.MIN_VALUE;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            MessageObject messageObject2 = arrayList.get(size);
            if (messageObject2.isMusic()) {
                int id2 = messageObject2.getId();
                if (id2 > 0 || z11) {
                    iMin = Math.min(iMin, id2);
                    iMax = Math.max(iMax, id2);
                }
                this.playlist.add(messageObject2);
                this.playlistMap.put(Integer.valueOf(id2), messageObject2);
            }
        }
        sortPlaylist();
        int iIndexOf2 = this.playlist.indexOf(messageObject);
        this.currentPlaylistNum = iIndexOf2;
        if (iIndexOf2 == -1) {
            clearPlaylist();
            this.currentPlaylistNum = this.playlist.size();
            this.playlist.add(messageObject);
            this.playlistMap.put(Integer.valueOf(messageObject.getId()), messageObject);
        }
        if (messageObject.isMusic() && !messageObject.scheduled) {
            if (SharedConfig.shuffleMusic) {
                buildShuffledPlayList();
            }
            if (z10) {
                if (this.playlistGlobalSearchParams == null) {
                    MediaDataController.getInstance(messageObject.currentAccount).loadMusic(messageObject.getDialogId(), iMin, iMax);
                } else {
                    this.playlistClassGuid = ConnectionsManager.generateClassGuid();
                }
            }
        }
        return playMessage(messageObject);
    }

    public boolean scheduleVideoConvert(MessageObject messageObject, VideoEditedInfo videoEditedInfo, boolean z10, boolean z11, boolean z12) {
        if (messageObject == null || videoEditedInfo == null) {
            return false;
        }
        if (z10 && !this.videoConvertQueue.isEmpty()) {
            return false;
        }
        if (z10) {
            new File(messageObject.messageOwner.attachPath).delete();
        }
        VideoConvertMessage videoConvertMessage = new VideoConvertMessage(messageObject, videoEditedInfo, z11, z12);
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

    public static void saveFile(String str, String str2, Context context, Utilities.Callback<Uri> callback) {
        org.telegram.ui.ActionBar.b2 b2Var;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || context == null) {
            return;
        }
        File file = new File(str);
        File file2 = new File(str2);
        if (file.exists() && file2.exists()) {
            if (AndroidUtilities.isInternalUri(Uri.fromFile(file)) || AndroidUtilities.isInternalUri(Uri.fromFile(file2))) {
                return;
            }
            int i10 = 1;
            boolean[] zArr = {false};
            boolean[] zArr2 = new boolean[1];
            try {
                org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(context, 2, null);
                b2Var2.m(LocaleController.getString(R.string.Loading));
                b2Var2.setCanceledOnTouchOutside(false);
                b2Var2.setCancelable(true);
                b2Var2.setOnCancelListener(new x5(zArr, i10));
                AndroidUtilities.runOnUIThread(new y5(zArr2, b2Var2, 2), 250L);
                b2Var = b2Var2;
            } catch (Exception e9) {
                FileLog.e(e9);
                b2Var = null;
            }
            new Thread(new b0(file, file2, zArr, callback, b2Var, zArr2, 2)).start();
            return;
        }
        saveFile(str, context, 0, null, null, callback);
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
