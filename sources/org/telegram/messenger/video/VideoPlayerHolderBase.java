package org.telegram.messenger.video;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FileStreamLoadOperation;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.VideoPlayer;

public class VideoPlayerHolderBase {
    private boolean allowMultipleInstances;
    boolean audioDisabled;
    Uri contentUri;
    private int currentAccount;
    public volatile long currentPosition;
    public TLRPC.Document document;
    private volatile long duration;
    public boolean firstFrameRendered;
    Runnable initRunnable;
    int lastState;
    private Runnable onErrorListener;
    private Runnable onReadyListener;
    private Runnable onSeekUpdate;
    public boolean paused;
    public long pendingSeekTo;
    long playerDuration;
    public Bitmap playerStubBitmap;
    public Paint playerStubPaint;
    public float progress;
    public volatile boolean released;
    private volatile boolean seeking;
    long startTime;
    public boolean stubAvailable;
    private Surface surface;
    private SurfaceView surfaceView;
    private TextureView textureView;
    public Uri uri;
    VideoPlayer videoPlayer;
    final DispatchQueue dispatchQueue = Utilities.getOrCreatePlayerQueue();
    Runnable progressRunnable = new Runnable() {
        @Override
        public void run() {
            VideoPlayerHolderBase videoPlayerHolderBase = VideoPlayerHolderBase.this;
            VideoPlayer videoPlayer = videoPlayerHolderBase.videoPlayer;
            if (videoPlayer != null) {
                if (videoPlayerHolderBase.lastState == 4) {
                    videoPlayerHolderBase.progress = 1.0f;
                } else {
                    videoPlayerHolderBase.currentPosition = videoPlayer.getCurrentPosition();
                    VideoPlayerHolderBase videoPlayerHolderBase2 = VideoPlayerHolderBase.this;
                    videoPlayerHolderBase2.playerDuration = videoPlayerHolderBase2.videoPlayer.getDuration();
                }
                VideoPlayerHolderBase videoPlayerHolderBase3 = VideoPlayerHolderBase.this;
                int i = videoPlayerHolderBase3.lastState;
                if (i == 3 || i == 2) {
                    videoPlayerHolderBase3.dispatchQueue.cancelRunnable(videoPlayerHolderBase3.progressRunnable);
                    VideoPlayerHolderBase videoPlayerHolderBase4 = VideoPlayerHolderBase.this;
                    videoPlayerHolderBase4.dispatchQueue.postRunnable(videoPlayerHolderBase4.progressRunnable, 16L);
                }
            }
        }
    };
    private volatile int triesCount = 3;
    private volatile boolean firstSeek = true;
    private volatile long lastSeek = -1;
    private long lastBetterSeek = -1;
    public float currentSeek = 0.0f;
    public volatile float currentSeekThread = 0.0f;
    private final Runnable betterSeek = new Runnable() {
        @Override
        public final void run() {
            this.f$0.getClass();
        }
    };
    private final Runnable updateSeek = new Runnable() {
        @Override
        public final void run() {
            VideoPlayerHolderBase.m1144$r8$lambda$Eyl2Vq94jm7XI2XxR7O08EAf4(this.f$0);
        }
    };

    public boolean needRepeat() {
        return false;
    }

    public void onRenderedFirstFrame() {
    }

    public void onStateChanged(boolean z, int i) {
    }

    protected void onVideoSizeChanged(int i, int i2, int i3, float f) {
    }

    static int access$010(VideoPlayerHolderBase videoPlayerHolderBase) {
        int i = videoPlayerHolderBase.triesCount;
        videoPlayerHolderBase.triesCount = i - 1;
        return i;
    }

    public VideoPlayerHolderBase with(SurfaceView surfaceView) {
        this.surfaceView = surfaceView;
        this.textureView = null;
        this.surface = null;
        return this;
    }

    public VideoPlayerHolderBase with(TextureView textureView) {
        this.surfaceView = null;
        this.textureView = textureView;
        this.surface = null;
        return this;
    }

    public VideoPlayerHolderBase with(Surface surface) {
        this.surfaceView = null;
        this.textureView = null;
        this.surface = surface;
        return this;
    }

    public void preparePlayer(final Uri uri, final boolean z, final float f) {
        this.audioDisabled = z;
        this.currentAccount = this.currentAccount;
        this.contentUri = uri;
        this.paused = true;
        Runnable runnable = this.initRunnable;
        if (runnable != null) {
            this.dispatchQueue.cancelRunnable(runnable);
        }
        DispatchQueue dispatchQueue = this.dispatchQueue;
        Runnable runnable2 = new Runnable() {
            @Override
            public final void run() {
                VideoPlayerHolderBase.$r8$lambda$Gnh0RpH4cmuNKyptc6j3tIoF3oU(this.f$0, z, f, uri);
            }
        };
        this.initRunnable = runnable2;
        dispatchQueue.postRunnable(runnable2);
    }

    public static void $r8$lambda$Gnh0RpH4cmuNKyptc6j3tIoF3oU(VideoPlayerHolderBase videoPlayerHolderBase, boolean z, float f, Uri uri) {
        if (videoPlayerHolderBase.released) {
            return;
        }
        videoPlayerHolderBase.ensurePlayerCreated(z);
        videoPlayerHolderBase.videoPlayer.setPlaybackSpeed(f);
        FileLog.d("videoplayerholderbase.preparePlayer(): preparePlayer new player as preload uri=" + uri);
        videoPlayerHolderBase.videoPlayer.preparePlayer(uri, "other", 0, 0L);
        videoPlayerHolderBase.videoPlayer.setPlayWhenReady(false);
        videoPlayerHolderBase.videoPlayer.setWorkerQueue(videoPlayerHolderBase.dispatchQueue);
    }

    public void start(final boolean z, final boolean z2, final Uri uri, final long j, final boolean z3, final float f) {
        this.startTime = System.currentTimeMillis();
        this.audioDisabled = z3;
        this.paused = z2;
        this.triesCount = 3;
        if (j > 0) {
            this.currentPosition = j;
        }
        DispatchQueue dispatchQueue = this.dispatchQueue;
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                VideoPlayerHolderBase.$r8$lambda$hE10YIYy_9c8ezKIjdaoegZXcb4(this.f$0, z3, f, uri, z2, z, j);
            }
        };
        this.initRunnable = runnable;
        dispatchQueue.postRunnable(runnable);
    }

    public static void $r8$lambda$hE10YIYy_9c8ezKIjdaoegZXcb4(final VideoPlayerHolderBase videoPlayerHolderBase, boolean z, float f, Uri uri, boolean z2, boolean z3, long j) {
        if (videoPlayerHolderBase.released) {
            FileLog.d("videoplayerholderbase returned from start: released");
            return;
        }
        if (videoPlayerHolderBase.videoPlayer == null) {
            videoPlayerHolderBase.ensurePlayerCreated(z);
            videoPlayerHolderBase.videoPlayer.setPlaybackSpeed(f);
            FileLog.d("videoplayerholderbase.start(): preparePlayer new player uri=" + uri);
            videoPlayerHolderBase.videoPlayer.preparePlayer(uri, "other");
            videoPlayerHolderBase.videoPlayer.setWorkerQueue(videoPlayerHolderBase.dispatchQueue);
            if (!z2) {
                Surface surface = videoPlayerHolderBase.surface;
                if (surface != null) {
                    videoPlayerHolderBase.videoPlayer.setSurface(surface);
                } else {
                    SurfaceView surfaceView = videoPlayerHolderBase.surfaceView;
                    if (surfaceView != null) {
                        videoPlayerHolderBase.videoPlayer.setSurfaceView(surfaceView);
                    } else {
                        videoPlayerHolderBase.videoPlayer.setTextureView(videoPlayerHolderBase.textureView);
                    }
                }
                videoPlayerHolderBase.videoPlayer.setPlayWhenReady(true);
            } else if (z3) {
                Surface surface2 = videoPlayerHolderBase.surface;
                if (surface2 != null) {
                    videoPlayerHolderBase.videoPlayer.setSurface(surface2);
                } else {
                    SurfaceView surfaceView2 = videoPlayerHolderBase.surfaceView;
                    if (surfaceView2 != null) {
                        videoPlayerHolderBase.videoPlayer.setSurfaceView(surfaceView2);
                    } else {
                        videoPlayerHolderBase.videoPlayer.setTextureView(videoPlayerHolderBase.textureView);
                    }
                }
                videoPlayerHolderBase.videoPlayer.setPlayWhenReady(false);
            }
        } else {
            FileLog.d("videoplayerholderbase.start(): player already exist");
            if (!z2) {
                Surface surface3 = videoPlayerHolderBase.surface;
                if (surface3 != null) {
                    videoPlayerHolderBase.videoPlayer.setSurface(surface3);
                } else {
                    SurfaceView surfaceView3 = videoPlayerHolderBase.surfaceView;
                    if (surfaceView3 != null) {
                        videoPlayerHolderBase.videoPlayer.setSurfaceView(surfaceView3);
                    } else {
                        videoPlayerHolderBase.videoPlayer.setTextureView(videoPlayerHolderBase.textureView);
                    }
                }
                videoPlayerHolderBase.videoPlayer.play();
            } else if (z3) {
                Surface surface4 = videoPlayerHolderBase.surface;
                if (surface4 != null) {
                    videoPlayerHolderBase.videoPlayer.setSurface(surface4);
                } else {
                    SurfaceView surfaceView4 = videoPlayerHolderBase.surfaceView;
                    if (surfaceView4 != null) {
                        videoPlayerHolderBase.videoPlayer.setSurfaceView(surfaceView4);
                    } else {
                        videoPlayerHolderBase.videoPlayer.setTextureView(videoPlayerHolderBase.textureView);
                    }
                }
                videoPlayerHolderBase.videoPlayer.setPlayWhenReady(false);
            }
        }
        if (j > 0) {
            videoPlayerHolderBase.videoPlayer.seekTo(j);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.initRunnable = null;
            }
        });
    }

    public void allowMultipleInstances(boolean z) {
        this.allowMultipleInstances = z;
    }

    private void ensurePlayerCreated(boolean z) {
        VideoPlayer videoPlayer = this.videoPlayer;
        if (videoPlayer != null) {
            videoPlayer.releasePlayer(true);
        }
        VideoPlayer videoPlayer2 = new VideoPlayer(false, z);
        this.videoPlayer = videoPlayer2;
        videoPlayer2.allowMultipleInstances = this.allowMultipleInstances;
        videoPlayer2.setDelegate(new AnonymousClass2());
        this.videoPlayer.setIsStory();
    }

    class AnonymousClass2 implements VideoPlayer.VideoPlayerDelegate {
        @Override
        public void onRenderedFirstFrame(AnalyticsListener.EventTime eventTime) {
            VideoPlayer.VideoPlayerDelegate.CC.$default$onRenderedFirstFrame(this, eventTime);
        }

        @Override
        public void onSeekFinished(AnalyticsListener.EventTime eventTime) {
            VideoPlayer.VideoPlayerDelegate.CC.$default$onSeekFinished(this, eventTime);
        }

        @Override
        public void onSeekStarted(AnalyticsListener.EventTime eventTime) {
            VideoPlayer.VideoPlayerDelegate.CC.$default$onSeekStarted(this, eventTime);
        }

        @Override
        public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
            return VideoPlayer.VideoPlayerDelegate.CC.$default$onSurfaceDestroyed(this, surfaceTexture);
        }

        @Override
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            VideoPlayer.VideoPlayerDelegate.CC.$default$onSurfaceTextureUpdated(this, surfaceTexture);
        }

        AnonymousClass2() {
        }

        @Override
        public void onStateChanged(boolean z, int i) {
            VideoPlayerHolderBase videoPlayerHolderBase = VideoPlayerHolderBase.this;
            videoPlayerHolderBase.lastState = i;
            videoPlayerHolderBase.currentPosition = videoPlayerHolderBase.videoPlayer.getCurrentPosition();
            VideoPlayerHolderBase videoPlayerHolderBase2 = VideoPlayerHolderBase.this;
            videoPlayerHolderBase2.playerDuration = videoPlayerHolderBase2.videoPlayer.getDuration();
            if (i == 3 || i == 2) {
                VideoPlayerHolderBase videoPlayerHolderBase3 = VideoPlayerHolderBase.this;
                videoPlayerHolderBase3.dispatchQueue.cancelRunnable(videoPlayerHolderBase3.progressRunnable);
                VideoPlayerHolderBase videoPlayerHolderBase4 = VideoPlayerHolderBase.this;
                videoPlayerHolderBase4.dispatchQueue.postRunnable(videoPlayerHolderBase4.progressRunnable);
            } else if (i == 4) {
                if (VideoPlayerHolderBase.this.needRepeat()) {
                    VideoPlayerHolderBase videoPlayerHolderBase5 = VideoPlayerHolderBase.this;
                    videoPlayerHolderBase5.progress = 0.0f;
                    videoPlayerHolderBase5.videoPlayer.seekTo(0L);
                    VideoPlayerHolderBase.this.videoPlayer.play();
                } else {
                    VideoPlayerHolderBase.this.progress = 1.0f;
                }
            }
            VideoPlayerHolderBase.this.onStateChanged(z, i);
        }

        @Override
        public void onError(VideoPlayer videoPlayer, Exception exc) {
            FileLog.e(exc);
            final long currentPosition = VideoPlayerHolderBase.this.getCurrentPosition();
            VideoPlayerHolderBase.access$010(VideoPlayerHolderBase.this);
            if (VideoPlayerHolderBase.this.triesCount > 0) {
                VideoPlayerHolderBase videoPlayerHolderBase = VideoPlayerHolderBase.this;
                DispatchQueue dispatchQueue = videoPlayerHolderBase.dispatchQueue;
                Runnable runnable = new Runnable() {
                    @Override
                    public final void run() {
                        VideoPlayerHolderBase.AnonymousClass2.m1152$r8$lambda$NeEfwsiV2l5cT4YJXZLLGYlWKQ(this.f$0, currentPosition);
                    }
                };
                videoPlayerHolderBase.initRunnable = runnable;
                dispatchQueue.postRunnable(runnable);
                return;
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    VideoPlayerHolderBase.AnonymousClass2.m1151$r8$lambda$JlaAh_r0EMYD5KXDDi8JKiqT5c(this.f$0);
                }
            });
        }

        public static void m1152$r8$lambda$NeEfwsiV2l5cT4YJXZLLGYlWKQ(AnonymousClass2 anonymousClass2, long j) {
            VideoPlayerHolderBase videoPlayerHolderBase;
            Uri uri;
            if (VideoPlayerHolderBase.this.released || (uri = (videoPlayerHolderBase = VideoPlayerHolderBase.this).uri) == null) {
                return;
            }
            videoPlayerHolderBase.videoPlayer.preparePlayer(uri, "other");
            VideoPlayerHolderBase.this.videoPlayer.seekTo(j);
        }

        public static void m1151$r8$lambda$JlaAh_r0EMYD5KXDDi8JKiqT5c(AnonymousClass2 anonymousClass2) {
            if (VideoPlayerHolderBase.this.onErrorListener != null) {
                VideoPlayerHolderBase.this.onErrorListener.run();
                VideoPlayerHolderBase.this.onErrorListener = null;
            }
        }

        @Override
        public void onVideoSizeChanged(int i, int i2, int i3, float f) {
            VideoPlayerHolderBase.this.onVideoSizeChanged(i, i2, i3, f);
        }

        @Override
        public void onRenderedFirstFrame() {
            long j;
            Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    VideoPlayerHolderBase.AnonymousClass2.m1150$r8$lambda$IiCThXiJXTNIgoP29o6eMwLd88(this.f$0);
                }
            };
            if (VideoPlayerHolderBase.this.surface != null) {
                j = 0;
            } else {
                j = VideoPlayerHolderBase.this.surfaceView == null ? 16L : 32L;
            }
            AndroidUtilities.runOnUIThread(runnable, j);
        }

        public static void m1150$r8$lambda$IiCThXiJXTNIgoP29o6eMwLd88(AnonymousClass2 anonymousClass2) {
            if (VideoPlayerHolderBase.this.released) {
                return;
            }
            VideoPlayerHolderBase.this.onRenderedFirstFrame();
            if (VideoPlayerHolderBase.this.onReadyListener != null) {
                VideoPlayerHolderBase.this.onReadyListener.run();
                VideoPlayerHolderBase.this.onReadyListener = null;
            }
        }
    }

    public void setOnReadyListener(Runnable runnable) {
        this.onReadyListener = runnable;
    }

    public void setOnErrorListener(Runnable runnable) {
        this.onErrorListener = runnable;
    }

    public boolean release(final Runnable runnable) {
        final TLRPC.Document document = this.document;
        if (document != null && FileStreamLoadOperation.getStreamPrioriy(document) != 0) {
            FileStreamLoadOperation.setPriorityForDocument(document, 0);
            FileLoader.getInstance(this.currentAccount).changePriority(0, document, null, null, null, null, null);
        }
        this.released = true;
        this.dispatchQueue.cancelRunnable(this.initRunnable);
        this.dispatchQueue.cancelRunnable(this.progressRunnable);
        this.initRunnable = null;
        this.dispatchQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                VideoPlayerHolderBase.$r8$lambda$g6FW80RBqHlVAFWmkAcsL1pNedA(this.f$0, document, runnable);
            }
        });
        Bitmap bitmap = this.playerStubBitmap;
        if (bitmap != null) {
            AndroidUtilities.recycleBitmap(bitmap);
            this.playerStubBitmap = null;
        }
        return true;
    }

    public static void $r8$lambda$g6FW80RBqHlVAFWmkAcsL1pNedA(VideoPlayerHolderBase videoPlayerHolderBase, TLRPC.Document document, Runnable runnable) {
        VideoPlayer videoPlayer = videoPlayerHolderBase.videoPlayer;
        if (videoPlayer != null) {
            videoPlayer.setSurface(null);
            videoPlayerHolderBase.videoPlayer.setTextureView(null);
            videoPlayerHolderBase.videoPlayer.setSurfaceView(null);
            videoPlayerHolderBase.videoPlayer.releasePlayer(false);
        }
        if (document != null) {
            FileLoader.getInstance(videoPlayerHolderBase.currentAccount).cancelLoadFile(document);
        }
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
        }
        videoPlayerHolderBase.videoPlayer = null;
        videoPlayerHolderBase.dispatchQueue.cancelRunnable(videoPlayerHolderBase.progressRunnable);
    }

    public void pause() {
        if (this.released || this.paused) {
            return;
        }
        this.paused = true;
        prepareStub();
        this.dispatchQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                VideoPlayerHolderBase.$r8$lambda$5pHCvmGDVEjs0kz60XQ2YRe1v2o(this.f$0);
            }
        });
    }

    public static void $r8$lambda$5pHCvmGDVEjs0kz60XQ2YRe1v2o(VideoPlayerHolderBase videoPlayerHolderBase) {
        VideoPlayer videoPlayer = videoPlayerHolderBase.videoPlayer;
        if (videoPlayer != null) {
            videoPlayer.pause();
        }
    }

    public void prepareStub() {
        SurfaceView surfaceView = this.surfaceView;
        if (surfaceView != null && this.firstFrameRendered && surfaceView.getHolder().getSurface().isValid()) {
            this.stubAvailable = true;
            if (this.playerStubBitmap == null) {
                this.playerStubBitmap = Bitmap.createBitmap(720, 1280, Bitmap.Config.ARGB_8888);
                this.playerStubPaint = new Paint(1);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                AndroidUtilities.getBitmapFromSurface(this.surfaceView, this.playerStubBitmap);
                if (this.playerStubBitmap.getPixel(0, 0) == 0) {
                    this.stubAvailable = false;
                }
            }
        }
    }

    public void setSpeed(final float f) {
        if (this.released) {
            return;
        }
        this.dispatchQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                VideoPlayerHolderBase.$r8$lambda$AGQrprKht5FKAPdMwG7vIHssO4E(this.f$0, f);
            }
        });
    }

    public static void $r8$lambda$AGQrprKht5FKAPdMwG7vIHssO4E(VideoPlayerHolderBase videoPlayerHolderBase, float f) {
        VideoPlayer videoPlayer = videoPlayerHolderBase.videoPlayer;
        if (videoPlayer != null) {
            videoPlayer.setPlaybackSpeed(f);
        }
    }

    public void play() {
        if (!this.released && this.paused) {
            this.paused = false;
            this.dispatchQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    VideoPlayerHolderBase.m1142$r8$lambda$sYTElh4T8Kel46C28GlwD7YSk(this.f$0);
                }
            });
        }
    }

    public static void m1142$r8$lambda$sYTElh4T8Kel46C28GlwD7YSk(VideoPlayerHolderBase videoPlayerHolderBase) {
        VideoPlayer videoPlayer = videoPlayerHolderBase.videoPlayer;
        if (videoPlayer != null) {
            Surface surface = videoPlayerHolderBase.surface;
            if (surface != null) {
                videoPlayer.setSurface(surface);
            } else {
                SurfaceView surfaceView = videoPlayerHolderBase.surfaceView;
                if (surfaceView != null) {
                    videoPlayer.setSurfaceView(surfaceView);
                } else {
                    videoPlayer.setTextureView(videoPlayerHolderBase.textureView);
                }
            }
            long j = videoPlayerHolderBase.pendingSeekTo;
            if (j > 0) {
                videoPlayerHolderBase.videoPlayer.seekTo(j);
                videoPlayerHolderBase.pendingSeekTo = 0L;
            }
            videoPlayerHolderBase.videoPlayer.setPlayWhenReady(true);
        }
    }

    public void play(final float f) {
        if (!this.released && this.paused) {
            this.paused = false;
            this.dispatchQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    VideoPlayerHolderBase.m1148$r8$lambda$k5V7ZOg0_niWDNXjuh8AbQyCaE(this.f$0, f);
                }
            });
        }
    }

    public static void m1148$r8$lambda$k5V7ZOg0_niWDNXjuh8AbQyCaE(VideoPlayerHolderBase videoPlayerHolderBase, float f) {
        VideoPlayer videoPlayer = videoPlayerHolderBase.videoPlayer;
        if (videoPlayer != null) {
            Surface surface = videoPlayerHolderBase.surface;
            if (surface != null) {
                videoPlayer.setSurface(surface);
            } else {
                SurfaceView surfaceView = videoPlayerHolderBase.surfaceView;
                if (surfaceView != null) {
                    videoPlayer.setSurfaceView(surfaceView);
                } else {
                    videoPlayer.setTextureView(videoPlayerHolderBase.textureView);
                }
            }
            long j = videoPlayerHolderBase.pendingSeekTo;
            if (j > 0) {
                videoPlayerHolderBase.videoPlayer.seekTo(j);
                videoPlayerHolderBase.pendingSeekTo = 0L;
            }
            videoPlayerHolderBase.videoPlayer.setPlaybackSpeed(f);
            videoPlayerHolderBase.videoPlayer.setPlayWhenReady(true);
        }
    }

    public void setAudioEnabled(final boolean z, final boolean z2) {
        boolean z3 = !z;
        if (this.audioDisabled == z3) {
            return;
        }
        this.audioDisabled = z3;
        this.triesCount = 3;
        this.dispatchQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                VideoPlayerHolderBase.$r8$lambda$B1OqUlFM1Azo2Zp7enzeQZUa_2U(this.f$0, z, z2);
            }
        });
    }

    public static void $r8$lambda$B1OqUlFM1Azo2Zp7enzeQZUa_2U(VideoPlayerHolderBase videoPlayerHolderBase, boolean z, boolean z2) {
        VideoPlayer videoPlayer = videoPlayerHolderBase.videoPlayer;
        if (videoPlayer == null) {
            return;
        }
        boolean zIsPlaying = videoPlayer.isPlaying();
        if (z && !videoPlayerHolderBase.videoPlayer.createdWithAudioTrack()) {
            videoPlayerHolderBase.videoPlayer.pause();
            long currentPosition = videoPlayerHolderBase.videoPlayer.getCurrentPosition();
            videoPlayerHolderBase.videoPlayer.releasePlayer(false);
            videoPlayerHolderBase.videoPlayer = null;
            videoPlayerHolderBase.ensurePlayerCreated(videoPlayerHolderBase.audioDisabled);
            Uri uri = videoPlayerHolderBase.uri;
            if (uri == null) {
                uri = videoPlayerHolderBase.contentUri;
            }
            FileLog.d("videoplayerholderbase.setAudioEnabled(): repreparePlayer as audio track is enabled back uri=" + uri);
            videoPlayerHolderBase.videoPlayer.preparePlayer(uri, "other");
            videoPlayerHolderBase.videoPlayer.setWorkerQueue(videoPlayerHolderBase.dispatchQueue);
            if (!z2) {
                Surface surface = videoPlayerHolderBase.surface;
                if (surface != null) {
                    videoPlayerHolderBase.videoPlayer.setSurface(surface);
                } else {
                    SurfaceView surfaceView = videoPlayerHolderBase.surfaceView;
                    if (surfaceView != null) {
                        videoPlayerHolderBase.videoPlayer.setSurfaceView(surfaceView);
                    } else {
                        videoPlayerHolderBase.videoPlayer.setTextureView(videoPlayerHolderBase.textureView);
                    }
                }
            }
            videoPlayerHolderBase.videoPlayer.seekTo(currentPosition + 50);
            if (zIsPlaying && !z2) {
                videoPlayerHolderBase.videoPlayer.setPlayWhenReady(true);
                videoPlayerHolderBase.videoPlayer.play();
                return;
            } else {
                videoPlayerHolderBase.videoPlayer.setPlayWhenReady(false);
                videoPlayerHolderBase.videoPlayer.pause();
                return;
            }
        }
        videoPlayerHolderBase.videoPlayer.setVolume(z ? 1.0f : 0.0f);
    }

    public float getPlaybackProgress(long j) {
        float f;
        if (this.lastState == 4) {
            this.progress = 1.0f;
        } else {
            if (j != 0) {
                f = this.currentPosition / j;
            } else {
                f = this.currentPosition / this.playerDuration;
            }
            this.progress = f;
            if (!this.seeking) {
                this.currentSeek = this.progress;
                this.lastSeek = this.currentPosition;
            }
        }
        return this.progress;
    }

    public void loopBack() {
        this.progress = 0.0f;
        this.lastState = 1;
        this.dispatchQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                VideoPlayerHolderBase.m1149$r8$lambda$vhcK6anMbCiIdornxk5khyXYGY(this.f$0);
            }
        });
    }

    public static void m1149$r8$lambda$vhcK6anMbCiIdornxk5khyXYGY(VideoPlayerHolderBase videoPlayerHolderBase) {
        VideoPlayer videoPlayer = videoPlayerHolderBase.videoPlayer;
        if (videoPlayer != null) {
            videoPlayer.seekTo(0L);
        }
        videoPlayerHolderBase.progress = 0.0f;
        videoPlayerHolderBase.currentPosition = 0L;
    }

    public void setVolume(final float f) {
        this.dispatchQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                VideoPlayerHolderBase.m1143$r8$lambda$1JmyPfX7O1IYAjA91aL_F2SolA(this.f$0, f);
            }
        });
    }

    public static void m1143$r8$lambda$1JmyPfX7O1IYAjA91aL_F2SolA(VideoPlayerHolderBase videoPlayerHolderBase, float f) {
        VideoPlayer videoPlayer = videoPlayerHolderBase.videoPlayer;
        if (videoPlayer != null) {
            videoPlayer.setVolume(f);
        }
    }

    public boolean isBuffering() {
        return !this.released && this.lastState == 2;
    }

    public long getCurrentPosition() {
        return this.currentPosition;
    }

    public long getDuration() {
        return this.playerDuration;
    }

    public boolean isPlaying() {
        return !this.paused;
    }

    public void seekTo(final long j) {
        this.dispatchQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                VideoPlayerHolderBase.m1147$r8$lambda$V8uLnehJLNonS5NQRMCLtIDLQ0(this.f$0, j);
            }
        });
    }

    public static void m1147$r8$lambda$V8uLnehJLNonS5NQRMCLtIDLQ0(VideoPlayerHolderBase videoPlayerHolderBase, long j) {
        VideoPlayer videoPlayer = videoPlayerHolderBase.videoPlayer;
        if (videoPlayer == null) {
            videoPlayerHolderBase.pendingSeekTo = j;
        } else {
            videoPlayer.seekTo(j);
        }
    }

    public void seekTo(final long j, final boolean z, final Runnable runnable) {
        this.dispatchQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                VideoPlayerHolderBase.m1145$r8$lambda$JpoSD8UdUavBi_IGlKF50fL1qs(this.f$0, j, z, runnable);
            }
        });
    }

    public static void m1145$r8$lambda$JpoSD8UdUavBi_IGlKF50fL1qs(VideoPlayerHolderBase videoPlayerHolderBase, long j, boolean z, Runnable runnable) {
        VideoPlayer videoPlayer = videoPlayerHolderBase.videoPlayer;
        if (videoPlayer == null) {
            videoPlayerHolderBase.pendingSeekTo = j;
        } else {
            videoPlayer.seekTo(j, z, runnable);
        }
    }

    public Uri getCurrentUri() {
        return this.contentUri;
    }

    public void setOnSeekUpdate(Runnable runnable) {
        this.onSeekUpdate = runnable;
    }

    public static void m1144$r8$lambda$Eyl2Vq94jm7XI2XxR7O08EAf4(VideoPlayerHolderBase videoPlayerHolderBase) {
        if (videoPlayerHolderBase.videoPlayer == null) {
            return;
        }
        long j = (long) (videoPlayerHolderBase.currentSeekThread * videoPlayerHolderBase.duration);
        if (videoPlayerHolderBase.lastSeek <= -1) {
            videoPlayerHolderBase.lastSeek = j;
        }
        if (Math.abs(j - videoPlayerHolderBase.lastSeek) >= (videoPlayerHolderBase.firstSeek ? 350 : 40)) {
            videoPlayerHolderBase.firstSeek = false;
            videoPlayerHolderBase.lastBetterSeek = j;
            videoPlayerHolderBase.dispatchQueue.cancelRunnable(videoPlayerHolderBase.betterSeek);
            videoPlayerHolderBase.dispatchQueue.postRunnable(videoPlayerHolderBase.betterSeek, 300L);
            VideoPlayer videoPlayer = videoPlayerHolderBase.videoPlayer;
            videoPlayerHolderBase.lastSeek = j;
            videoPlayer.seekTo(j, true);
        }
    }

    public void setSeeking(boolean z) {
        if (z && !this.seeking) {
            this.firstSeek = true;
        }
        this.seeking = z;
        if (z) {
            return;
        }
        this.dispatchQueue.cancelRunnable(this.betterSeek);
    }

    public float seek(float f, long j) {
        if (this.videoPlayer == null) {
            return this.currentSeek;
        }
        this.duration = j;
        float fClamp = Utilities.clamp(this.currentSeek + f, 1.0f, 0.0f);
        this.currentSeek = fClamp;
        this.currentSeekThread = fClamp;
        this.dispatchQueue.cancelRunnable(this.updateSeek);
        this.dispatchQueue.postRunnable(this.updateSeek);
        return this.currentSeek;
    }
}
