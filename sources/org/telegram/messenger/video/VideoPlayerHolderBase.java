package org.telegram.messenger.video;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import gg.a0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FileStreamLoadOperation;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a9;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.q71;
import org.telegram.ui.Components.t71;
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
    t71 videoPlayer;
    final DispatchQueue dispatchQueue = Utilities.getOrCreatePlayerQueue();
    Runnable progressRunnable = new Runnable() {
        {
            VideoPlayerHolderBase.this = this;
        }

        @Override
        public void run() {
            VideoPlayerHolderBase videoPlayerHolderBase = VideoPlayerHolderBase.this;
            t71 t71Var = videoPlayerHolderBase.videoPlayer;
            if (t71Var != null) {
                if (videoPlayerHolderBase.lastState == 4) {
                    videoPlayerHolderBase.progress = 1.0f;
                } else {
                    videoPlayerHolderBase.currentPosition = t71Var.n();
                    VideoPlayerHolderBase videoPlayerHolderBase2 = VideoPlayerHolderBase.this;
                    videoPlayerHolderBase2.playerDuration = videoPlayerHolderBase2.videoPlayer.p();
                }
                VideoPlayerHolderBase videoPlayerHolderBase3 = VideoPlayerHolderBase.this;
                int i10 = videoPlayerHolderBase3.lastState;
                if (i10 == 3 || i10 == 2) {
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
    private final Runnable betterSeek = new j(this, 0);
    private final Runnable updateSeek = new j(this, 2);

    public class AnonymousClass2 implements q71 {
        public AnonymousClass2() {
            VideoPlayerHolderBase.this = r1;
        }

        public void lambda$onError$0(long j3) {
            VideoPlayerHolderBase videoPlayerHolderBase;
            Uri uri;
            if (!VideoPlayerHolderBase.this.released && (uri = (videoPlayerHolderBase = VideoPlayerHolderBase.this).uri) != null) {
                videoPlayerHolderBase.videoPlayer.D(uri, "other");
                VideoPlayerHolderBase.this.videoPlayer.K(j3);
            }
        }

        public void lambda$onError$1() {
            if (VideoPlayerHolderBase.this.onErrorListener != null) {
                VideoPlayerHolderBase.this.onErrorListener.run();
                VideoPlayerHolderBase.this.onErrorListener = null;
            }
        }

        public void lambda$onRenderedFirstFrame$2() {
            if (!VideoPlayerHolderBase.this.released) {
                VideoPlayerHolderBase.this.onRenderedFirstFrame();
                if (VideoPlayerHolderBase.this.onReadyListener != null) {
                    VideoPlayerHolderBase.this.onReadyListener.run();
                    VideoPlayerHolderBase.this.onReadyListener = null;
                }
            }
        }

        @Override
        public void onError(t71 t71Var, Exception exc) {
            FileLog.e(exc);
            long currentPosition = VideoPlayerHolderBase.this.getCurrentPosition();
            VideoPlayerHolderBase.access$010(VideoPlayerHolderBase.this);
            if (VideoPlayerHolderBase.this.triesCount > 0) {
                VideoPlayerHolderBase videoPlayerHolderBase = VideoPlayerHolderBase.this;
                DispatchQueue dispatchQueue = videoPlayerHolderBase.dispatchQueue;
                p pVar = new p(this, currentPosition, 0);
                videoPlayerHolderBase.initRunnable = pVar;
                dispatchQueue.postRunnable(pVar);
                return;
            }
            AndroidUtilities.runOnUIThread(new o(this, 1));
        }

        @Override
        public void onRenderedFirstFrame(j2.a aVar) {
        }

        @Override
        public void onStateChanged(boolean z10, int i10) {
            VideoPlayerHolderBase videoPlayerHolderBase = VideoPlayerHolderBase.this;
            videoPlayerHolderBase.lastState = i10;
            videoPlayerHolderBase.currentPosition = videoPlayerHolderBase.videoPlayer.n();
            VideoPlayerHolderBase videoPlayerHolderBase2 = VideoPlayerHolderBase.this;
            videoPlayerHolderBase2.playerDuration = videoPlayerHolderBase2.videoPlayer.p();
            if (i10 != 3 && i10 != 2) {
                if (i10 == 4) {
                    if (VideoPlayerHolderBase.this.needRepeat()) {
                        VideoPlayerHolderBase videoPlayerHolderBase3 = VideoPlayerHolderBase.this;
                        videoPlayerHolderBase3.progress = 0.0f;
                        videoPlayerHolderBase3.videoPlayer.K(0L);
                        VideoPlayerHolderBase.this.videoPlayer.C();
                    } else {
                        VideoPlayerHolderBase.this.progress = 1.0f;
                    }
                }
            } else {
                VideoPlayerHolderBase videoPlayerHolderBase4 = VideoPlayerHolderBase.this;
                videoPlayerHolderBase4.dispatchQueue.cancelRunnable(videoPlayerHolderBase4.progressRunnable);
                VideoPlayerHolderBase videoPlayerHolderBase5 = VideoPlayerHolderBase.this;
                videoPlayerHolderBase5.dispatchQueue.postRunnable(videoPlayerHolderBase5.progressRunnable);
            }
            VideoPlayerHolderBase.this.onStateChanged(z10, i10);
        }

        @Override
        public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
            return false;
        }

        @Override
        public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
            VideoPlayerHolderBase.this.onVideoSizeChanged(i10, i11, i12, f7);
        }

        @Override
        public void onRenderedFirstFrame() {
            long j3;
            o oVar = new o(this, 0);
            if (VideoPlayerHolderBase.this.surface != null) {
                j3 = 0;
            } else {
                j3 = VideoPlayerHolderBase.this.surfaceView == null ? 16L : 32L;
            }
            AndroidUtilities.runOnUIThread(oVar, j3);
        }

        @Override
        public void onSeekFinished(j2.a aVar) {
        }

        @Override
        public void onSeekStarted(j2.a aVar) {
        }

        @Override
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public static int access$010(VideoPlayerHolderBase videoPlayerHolderBase) {
        int i10 = videoPlayerHolderBase.triesCount;
        videoPlayerHolderBase.triesCount = i10 - 1;
        return i10;
    }

    private void ensurePlayerCreated(boolean z10) {
        t71 t71Var = this.videoPlayer;
        if (t71Var != null) {
            t71Var.H();
        }
        t71 t71Var2 = new t71(false, z10);
        this.videoPlayer = t71Var2;
        t71Var2.f27379y = this.allowMultipleInstances;
        t71Var2.J = new AnonymousClass2();
        this.videoPlayer.f27365c = true;
    }

    public void lambda$loopBack$9() {
        t71 t71Var = this.videoPlayer;
        if (t71Var != null) {
            t71Var.K(0L);
        }
        this.progress = 0.0f;
        this.currentPosition = 0L;
    }

    public void lambda$new$14() {
        int i10;
        if (this.videoPlayer != null) {
            long j3 = this.currentSeekThread * ((float) this.duration);
            if (this.lastSeek <= -1) {
                this.lastSeek = j3;
            }
            long abs = Math.abs(j3 - this.lastSeek);
            if (this.firstSeek) {
                i10 = 350;
            } else {
                i10 = 40;
            }
            if (abs >= i10) {
                this.firstSeek = false;
                this.lastBetterSeek = j3;
                this.dispatchQueue.cancelRunnable(this.betterSeek);
                this.dispatchQueue.postRunnable(this.betterSeek, 300L);
                t71 t71Var = this.videoPlayer;
                this.lastSeek = j3;
                t71Var.L(j3, true);
            }
        }
    }

    public void lambda$pause$4() {
        t71 t71Var = this.videoPlayer;
        if (t71Var != null) {
            t71Var.B();
        }
    }

    public void lambda$play$6() {
        t71 t71Var = this.videoPlayer;
        if (t71Var != null) {
            Surface surface = this.surface;
            if (surface != null) {
                t71Var.T(surface);
            } else {
                SurfaceView surfaceView = this.surfaceView;
                if (surfaceView != null) {
                    t71Var.U(surfaceView);
                } else {
                    t71Var.V(this.textureView);
                }
            }
            long j3 = this.pendingSeekTo;
            if (j3 > 0) {
                this.videoPlayer.K(j3);
                this.pendingSeekTo = 0L;
            }
            this.videoPlayer.P(true);
        }
    }

    public void lambda$play$7(float f7) {
        t71 t71Var = this.videoPlayer;
        if (t71Var != null) {
            Surface surface = this.surface;
            if (surface != null) {
                t71Var.T(surface);
            } else {
                SurfaceView surfaceView = this.surfaceView;
                if (surfaceView != null) {
                    t71Var.U(surfaceView);
                } else {
                    t71Var.V(this.textureView);
                }
            }
            long j3 = this.pendingSeekTo;
            if (j3 > 0) {
                this.videoPlayer.K(j3);
                this.pendingSeekTo = 0L;
            }
            this.videoPlayer.Q(f7);
            this.videoPlayer.P(true);
        }
    }

    public void lambda$preparePlayer$0(boolean z10, float f7, Uri uri) {
        if (this.released) {
            return;
        }
        ensurePlayerCreated(z10);
        this.videoPlayer.Q(f7);
        FileLog.d("videoplayerholderbase.preparePlayer(): preparePlayer new player as preload uri=" + uri);
        this.videoPlayer.E(uri, "other", 0L);
        this.videoPlayer.P(false);
        this.videoPlayer.X(this.dispatchQueue);
    }

    public void lambda$release$3(TLRPC.Document document, Runnable runnable) {
        t71 t71Var = this.videoPlayer;
        if (t71Var != null) {
            t71Var.T(null);
            this.videoPlayer.V(null);
            this.videoPlayer.U(null);
            this.videoPlayer.H();
        }
        if (document != null) {
            FileLoader.getInstance(this.currentAccount).cancelLoadFile(document);
        }
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
        }
        this.videoPlayer = null;
        this.dispatchQueue.cancelRunnable(this.progressRunnable);
    }

    public void lambda$seekTo$11(long j3) {
        t71 t71Var = this.videoPlayer;
        if (t71Var == null) {
            this.pendingSeekTo = j3;
        } else {
            t71Var.K(j3);
        }
    }

    public void lambda$seekTo$12(long j3, boolean z10, Runnable runnable) {
        t71 t71Var = this.videoPlayer;
        if (t71Var == null) {
            this.pendingSeekTo = j3;
        } else {
            t71Var.M(j3, z10, runnable);
        }
    }

    public void lambda$setAudioEnabled$8(boolean z10, boolean z11) {
        float f7;
        t71 t71Var = this.videoPlayer;
        if (t71Var == null) {
            return;
        }
        boolean y3 = t71Var.y();
        if (z10) {
            t71 t71Var2 = this.videoPlayer;
            if (t71Var2.f27364b0) {
                t71Var2.B();
                long n10 = this.videoPlayer.n();
                this.videoPlayer.H();
                this.videoPlayer = null;
                ensurePlayerCreated(this.audioDisabled);
                Uri uri = this.uri;
                if (uri == null) {
                    uri = this.contentUri;
                }
                FileLog.d("videoplayerholderbase.setAudioEnabled(): repreparePlayer as audio track is enabled back uri=" + uri);
                this.videoPlayer.D(uri, "other");
                this.videoPlayer.X(this.dispatchQueue);
                if (!z11) {
                    Surface surface = this.surface;
                    if (surface != null) {
                        this.videoPlayer.T(surface);
                    } else {
                        SurfaceView surfaceView = this.surfaceView;
                        if (surfaceView != null) {
                            this.videoPlayer.U(surfaceView);
                        } else {
                            this.videoPlayer.V(this.textureView);
                        }
                    }
                }
                this.videoPlayer.K(n10 + 50);
                if (y3 && !z11) {
                    this.videoPlayer.P(true);
                    this.videoPlayer.C();
                    return;
                }
                this.videoPlayer.P(false);
                this.videoPlayer.B();
                return;
            }
        }
        t71 t71Var3 = this.videoPlayer;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        t71Var3.W(f7);
    }

    public void lambda$setSpeed$5(float f7) {
        t71 t71Var = this.videoPlayer;
        if (t71Var != null) {
            t71Var.Q(f7);
        }
    }

    public void lambda$setVolume$10(float f7) {
        t71 t71Var = this.videoPlayer;
        if (t71Var != null) {
            t71Var.W(f7);
        }
    }

    public void lambda$start$1() {
        this.initRunnable = null;
    }

    public void lambda$start$2(boolean z10, float f7, Uri uri, boolean z11, boolean z12, long j3) {
        if (this.released) {
            FileLog.d("videoplayerholderbase returned from start: released");
            return;
        }
        if (this.videoPlayer == null) {
            ensurePlayerCreated(z10);
            this.videoPlayer.Q(f7);
            FileLog.d("videoplayerholderbase.start(): preparePlayer new player uri=" + uri);
            this.videoPlayer.D(uri, "other");
            this.videoPlayer.X(this.dispatchQueue);
            if (!z11) {
                Surface surface = this.surface;
                if (surface != null) {
                    this.videoPlayer.T(surface);
                } else {
                    SurfaceView surfaceView = this.surfaceView;
                    if (surfaceView != null) {
                        this.videoPlayer.U(surfaceView);
                    } else {
                        this.videoPlayer.V(this.textureView);
                    }
                }
                this.videoPlayer.P(true);
            } else if (z12) {
                Surface surface2 = this.surface;
                if (surface2 != null) {
                    this.videoPlayer.T(surface2);
                } else {
                    SurfaceView surfaceView2 = this.surfaceView;
                    if (surfaceView2 != null) {
                        this.videoPlayer.U(surfaceView2);
                    } else {
                        this.videoPlayer.V(this.textureView);
                    }
                }
                this.videoPlayer.P(false);
            }
        } else {
            FileLog.d("videoplayerholderbase.start(): player already exist");
            if (!z11) {
                Surface surface3 = this.surface;
                if (surface3 != null) {
                    this.videoPlayer.T(surface3);
                } else {
                    SurfaceView surfaceView3 = this.surfaceView;
                    if (surfaceView3 != null) {
                        this.videoPlayer.U(surfaceView3);
                    } else {
                        this.videoPlayer.V(this.textureView);
                    }
                }
                this.videoPlayer.C();
            } else if (z12) {
                Surface surface4 = this.surface;
                if (surface4 != null) {
                    this.videoPlayer.T(surface4);
                } else {
                    SurfaceView surfaceView4 = this.surfaceView;
                    if (surfaceView4 != null) {
                        this.videoPlayer.U(surfaceView4);
                    } else {
                        this.videoPlayer.V(this.textureView);
                    }
                }
                this.videoPlayer.P(false);
            }
        }
        if (j3 > 0) {
            this.videoPlayer.K(j3);
        }
        AndroidUtilities.runOnUIThread(new j(this, 1));
    }

    public void allowMultipleInstances(boolean z10) {
        this.allowMultipleInstances = z10;
    }

    public long getCurrentPosition() {
        return this.currentPosition;
    }

    public Uri getCurrentUri() {
        return this.contentUri;
    }

    public long getDuration() {
        return this.playerDuration;
    }

    public float getPlaybackProgress(long j3) {
        float f7;
        if (this.lastState == 4) {
            this.progress = 1.0f;
        } else {
            if (j3 != 0) {
                f7 = ((float) this.currentPosition) / ((float) j3);
            } else {
                f7 = ((float) this.currentPosition) / ((float) this.playerDuration);
            }
            this.progress = f7;
            if (!this.seeking) {
                this.currentSeek = this.progress;
                this.lastSeek = this.currentPosition;
            }
        }
        return this.progress;
    }

    public boolean isBuffering() {
        if (!this.released && this.lastState == 2) {
            return true;
        }
        return false;
    }

    public boolean isPlaying() {
        return !this.paused;
    }

    public void loopBack() {
        this.progress = 0.0f;
        this.lastState = 1;
        this.dispatchQueue.postRunnable(new j(this, 5));
    }

    public boolean needRepeat() {
        return false;
    }

    public void pause() {
        if (this.released || this.paused) {
            return;
        }
        this.paused = true;
        prepareStub();
        this.dispatchQueue.postRunnable(new j(this, 4));
    }

    public void play() {
        if (!this.released && this.paused) {
            this.paused = false;
            this.dispatchQueue.postRunnable(new j(this, 3));
        }
    }

    public void preparePlayer(final Uri uri, final boolean z10, final float f7) {
        this.audioDisabled = z10;
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
                VideoPlayerHolderBase.this.lambda$preparePlayer$0(z10, f7, uri);
            }
        };
        this.initRunnable = runnable2;
        dispatchQueue.postRunnable(runnable2);
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

    public boolean release(Runnable runnable) {
        TLRPC.Document document = this.document;
        if (document != null && FileStreamLoadOperation.getStreamPrioriy(document) != 0) {
            FileStreamLoadOperation.setPriorityForDocument(document, 0);
            FileLoader.getInstance(this.currentAccount).changePriority(0, document, null, null, null, null, null);
        }
        this.released = true;
        this.dispatchQueue.cancelRunnable(this.initRunnable);
        this.dispatchQueue.cancelRunnable(this.progressRunnable);
        this.initRunnable = null;
        this.dispatchQueue.postRunnable(new a0(this, document, runnable, 19));
        Bitmap bitmap = this.playerStubBitmap;
        if (bitmap != null) {
            AndroidUtilities.recycleBitmap(bitmap);
            this.playerStubBitmap = null;
        }
        return true;
    }

    public float seek(float f7, long j3) {
        if (this.videoPlayer == null) {
            return this.currentSeek;
        }
        this.duration = j3;
        float clamp = Utilities.clamp(this.currentSeek + f7, 1.0f, 0.0f);
        this.currentSeek = clamp;
        this.currentSeekThread = clamp;
        this.dispatchQueue.cancelRunnable(this.updateSeek);
        this.dispatchQueue.postRunnable(this.updateSeek);
        return this.currentSeek;
    }

    public void seekTo(long j3) {
        this.dispatchQueue.postRunnable(new p(this, j3, 1));
    }

    public void setAudioEnabled(boolean z10, boolean z11) {
        boolean z12 = !z10;
        if (this.audioDisabled == z12) {
            return;
        }
        this.audioDisabled = z12;
        this.triesCount = 3;
        this.dispatchQueue.postRunnable(new k(this, z10, z11, 0));
    }

    public void setOnErrorListener(Runnable runnable) {
        this.onErrorListener = runnable;
    }

    public void setOnReadyListener(Runnable runnable) {
        this.onReadyListener = runnable;
    }

    public void setOnSeekUpdate(Runnable runnable) {
        this.onSeekUpdate = runnable;
    }

    public void setSeeking(boolean z10) {
        if (z10 && !this.seeking) {
            this.firstSeek = true;
        }
        this.seeking = z10;
        if (!z10) {
            this.dispatchQueue.cancelRunnable(this.betterSeek);
        }
    }

    public void setSpeed(float f7) {
        if (this.released) {
            return;
        }
        this.dispatchQueue.postRunnable(new l(this, f7, 0));
    }

    public void setVolume(float f7) {
        this.dispatchQueue.postRunnable(new l(this, f7, 2));
    }

    public void start(final boolean z10, final boolean z11, final Uri uri, final long j3, final boolean z12, final float f7) {
        this.startTime = System.currentTimeMillis();
        this.audioDisabled = z12;
        this.paused = z11;
        this.triesCount = 3;
        if (j3 > 0) {
            this.currentPosition = j3;
        }
        DispatchQueue dispatchQueue = this.dispatchQueue;
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                VideoPlayerHolderBase.this.lambda$start$2(z12, f7, uri, z11, z10, j3);
            }
        };
        this.initRunnable = runnable;
        dispatchQueue.postRunnable(runnable);
    }

    public VideoPlayerHolderBase with(SurfaceView surfaceView) {
        this.surfaceView = surfaceView;
        this.textureView = null;
        this.surface = null;
        return this;
    }

    public void seekTo(long j3, boolean z10, Runnable runnable) {
        this.dispatchQueue.postRunnable(new a9(this, j3, z10, runnable));
    }

    public VideoPlayerHolderBase with(TextureView textureView) {
        this.surfaceView = null;
        this.textureView = textureView;
        this.surface = null;
        return this;
    }

    public void play(float f7) {
        if (!this.released && this.paused) {
            this.paused = false;
            this.dispatchQueue.postRunnable(new l(this, f7, 1));
        }
    }

    public VideoPlayerHolderBase with(Surface surface) {
        this.surfaceView = null;
        this.textureView = null;
        this.surface = surface;
        return this;
    }

    public void lambda$new$13() {
    }

    public void onRenderedFirstFrame() {
    }

    public void onStateChanged(boolean z10, int i10) {
    }

    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
