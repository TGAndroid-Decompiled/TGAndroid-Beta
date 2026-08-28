package org.telegram.messenger.video;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FileStreamLoadOperation;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.q8;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.k61;
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
    k61 videoPlayer;
    final DispatchQueue dispatchQueue = Utilities.getOrCreatePlayerQueue();
    Runnable progressRunnable = new Runnable() {
        {
            VideoPlayerHolderBase.this = this;
        }

        @Override
        public void run() {
            VideoPlayerHolderBase videoPlayerHolderBase = VideoPlayerHolderBase.this;
            k61 k61Var = videoPlayerHolderBase.videoPlayer;
            if (k61Var != null) {
                if (videoPlayerHolderBase.lastState == 4) {
                    videoPlayerHolderBase.progress = 1.0f;
                } else {
                    videoPlayerHolderBase.currentPosition = k61Var.o();
                    VideoPlayerHolderBase videoPlayerHolderBase2 = VideoPlayerHolderBase.this;
                    videoPlayerHolderBase2.playerDuration = videoPlayerHolderBase2.videoPlayer.q();
                }
                VideoPlayerHolderBase videoPlayerHolderBase3 = VideoPlayerHolderBase.this;
                int i9 = videoPlayerHolderBase3.lastState;
                if (i9 == 3 || i9 == 2) {
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
    private final Runnable betterSeek = new k(this, 0);
    private final Runnable updateSeek = new k(this, 2);

    public class AnonymousClass2 implements h61 {
        public AnonymousClass2() {
            VideoPlayerHolderBase.this = r1;
        }

        public void lambda$onError$0(long j10) {
            VideoPlayerHolderBase videoPlayerHolderBase;
            Uri uri;
            if (!VideoPlayerHolderBase.this.released && (uri = (videoPlayerHolderBase = VideoPlayerHolderBase.this).uri) != null) {
                videoPlayerHolderBase.videoPlayer.E(uri, "other");
                VideoPlayerHolderBase.this.videoPlayer.L(j10);
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
        public void onError(k61 k61Var, Exception exc) {
            FileLog.e(exc);
            long currentPosition = VideoPlayerHolderBase.this.getCurrentPosition();
            VideoPlayerHolderBase.access$010(VideoPlayerHolderBase.this);
            if (VideoPlayerHolderBase.this.triesCount > 0) {
                VideoPlayerHolderBase videoPlayerHolderBase = VideoPlayerHolderBase.this;
                DispatchQueue dispatchQueue = videoPlayerHolderBase.dispatchQueue;
                q qVar = new q(this, currentPosition, 0);
                videoPlayerHolderBase.initRunnable = qVar;
                dispatchQueue.postRunnable(qVar);
                return;
            }
            AndroidUtilities.runOnUIThread(new p(this, 1));
        }

        @Override
        public void onRenderedFirstFrame(i3.a aVar) {
        }

        @Override
        public void onStateChanged(boolean z10, int i9) {
            VideoPlayerHolderBase videoPlayerHolderBase = VideoPlayerHolderBase.this;
            videoPlayerHolderBase.lastState = i9;
            videoPlayerHolderBase.currentPosition = videoPlayerHolderBase.videoPlayer.o();
            VideoPlayerHolderBase videoPlayerHolderBase2 = VideoPlayerHolderBase.this;
            videoPlayerHolderBase2.playerDuration = videoPlayerHolderBase2.videoPlayer.q();
            if (i9 != 3 && i9 != 2) {
                if (i9 == 4) {
                    if (VideoPlayerHolderBase.this.needRepeat()) {
                        VideoPlayerHolderBase videoPlayerHolderBase3 = VideoPlayerHolderBase.this;
                        videoPlayerHolderBase3.progress = 0.0f;
                        videoPlayerHolderBase3.videoPlayer.L(0L);
                        VideoPlayerHolderBase.this.videoPlayer.D();
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
            VideoPlayerHolderBase.this.onStateChanged(z10, i9);
        }

        @Override
        public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
            return false;
        }

        @Override
        public void onVideoSizeChanged(int i9, int i10, int i11, float f10) {
            VideoPlayerHolderBase.this.onVideoSizeChanged(i9, i10, i11, f10);
        }

        @Override
        public void onRenderedFirstFrame() {
            long j10;
            p pVar = new p(this, 0);
            if (VideoPlayerHolderBase.this.surface != null) {
                j10 = 0;
            } else {
                j10 = VideoPlayerHolderBase.this.surfaceView == null ? 16L : 32L;
            }
            AndroidUtilities.runOnUIThread(pVar, j10);
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

    public static int access$010(VideoPlayerHolderBase videoPlayerHolderBase) {
        int i9 = videoPlayerHolderBase.triesCount;
        videoPlayerHolderBase.triesCount = i9 - 1;
        return i9;
    }

    private void ensurePlayerCreated(boolean z10) {
        k61 k61Var = this.videoPlayer;
        if (k61Var != null) {
            k61Var.I();
        }
        k61 k61Var2 = new k61(false, z10);
        this.videoPlayer = k61Var2;
        k61Var2.f30013y = this.allowMultipleInstances;
        k61Var2.F = new AnonymousClass2();
        this.videoPlayer.f30002c = true;
    }

    public void lambda$loopBack$9() {
        k61 k61Var = this.videoPlayer;
        if (k61Var != null) {
            k61Var.L(0L);
        }
        this.progress = 0.0f;
        this.currentPosition = 0L;
    }

    public void lambda$new$14() {
        int i9;
        if (this.videoPlayer != null) {
            long j10 = this.currentSeekThread * ((float) this.duration);
            if (this.lastSeek <= -1) {
                this.lastSeek = j10;
            }
            long abs = Math.abs(j10 - this.lastSeek);
            if (this.firstSeek) {
                i9 = 350;
            } else {
                i9 = 40;
            }
            if (abs >= i9) {
                this.firstSeek = false;
                this.lastBetterSeek = j10;
                this.dispatchQueue.cancelRunnable(this.betterSeek);
                this.dispatchQueue.postRunnable(this.betterSeek, 300L);
                k61 k61Var = this.videoPlayer;
                this.lastSeek = j10;
                k61Var.M(j10, true);
            }
        }
    }

    public void lambda$pause$4() {
        k61 k61Var = this.videoPlayer;
        if (k61Var != null) {
            k61Var.C();
        }
    }

    public void lambda$play$6() {
        k61 k61Var = this.videoPlayer;
        if (k61Var != null) {
            Surface surface = this.surface;
            if (surface != null) {
                k61Var.U(surface);
            } else {
                SurfaceView surfaceView = this.surfaceView;
                if (surfaceView != null) {
                    k61Var.V(surfaceView);
                } else {
                    k61Var.W(this.textureView);
                }
            }
            long j10 = this.pendingSeekTo;
            if (j10 > 0) {
                this.videoPlayer.L(j10);
                this.pendingSeekTo = 0L;
            }
            this.videoPlayer.Q(true);
        }
    }

    public void lambda$play$7(float f10) {
        k61 k61Var = this.videoPlayer;
        if (k61Var != null) {
            Surface surface = this.surface;
            if (surface != null) {
                k61Var.U(surface);
            } else {
                SurfaceView surfaceView = this.surfaceView;
                if (surfaceView != null) {
                    k61Var.V(surfaceView);
                } else {
                    k61Var.W(this.textureView);
                }
            }
            long j10 = this.pendingSeekTo;
            if (j10 > 0) {
                this.videoPlayer.L(j10);
                this.pendingSeekTo = 0L;
            }
            this.videoPlayer.R(f10);
            this.videoPlayer.Q(true);
        }
    }

    public void lambda$preparePlayer$0(boolean z10, float f10, Uri uri) {
        if (this.released) {
            return;
        }
        ensurePlayerCreated(z10);
        this.videoPlayer.R(f10);
        FileLog.d("videoplayerholderbase.preparePlayer(): preparePlayer new player as preload uri=" + uri);
        this.videoPlayer.F(uri, "other", 0L);
        this.videoPlayer.Q(false);
        k61 k61Var = this.videoPlayer;
        DispatchQueue dispatchQueue = this.dispatchQueue;
        k61Var.f30000b = dispatchQueue;
        k61Var.d.f9551l0 = dispatchQueue;
    }

    public void lambda$release$3(TLRPC.Document document, Runnable runnable) {
        k61 k61Var = this.videoPlayer;
        if (k61Var != null) {
            k61Var.U(null);
            this.videoPlayer.W(null);
            this.videoPlayer.V(null);
            this.videoPlayer.I();
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

    public void lambda$seekTo$11(long j10) {
        k61 k61Var = this.videoPlayer;
        if (k61Var == null) {
            this.pendingSeekTo = j10;
        } else {
            k61Var.L(j10);
        }
    }

    public void lambda$seekTo$12(long j10, boolean z10, Runnable runnable) {
        k61 k61Var = this.videoPlayer;
        if (k61Var == null) {
            this.pendingSeekTo = j10;
        } else {
            k61Var.N(j10, z10, runnable);
        }
    }

    public void lambda$setAudioEnabled$8(boolean z10, boolean z11) {
        float f10;
        k61 k61Var = this.videoPlayer;
        if (k61Var == null) {
            return;
        }
        boolean z12 = k61Var.z();
        if (z10) {
            k61 k61Var2 = this.videoPlayer;
            if (k61Var2.X) {
                k61Var2.C();
                long o6 = this.videoPlayer.o();
                this.videoPlayer.I();
                this.videoPlayer = null;
                ensurePlayerCreated(this.audioDisabled);
                Uri uri = this.uri;
                if (uri == null) {
                    uri = this.contentUri;
                }
                FileLog.d("videoplayerholderbase.setAudioEnabled(): repreparePlayer as audio track is enabled back uri=" + uri);
                this.videoPlayer.E(uri, "other");
                k61 k61Var3 = this.videoPlayer;
                DispatchQueue dispatchQueue = this.dispatchQueue;
                k61Var3.f30000b = dispatchQueue;
                k61Var3.d.f9551l0 = dispatchQueue;
                if (!z11) {
                    Surface surface = this.surface;
                    if (surface != null) {
                        k61Var3.U(surface);
                    } else {
                        SurfaceView surfaceView = this.surfaceView;
                        if (surfaceView != null) {
                            k61Var3.V(surfaceView);
                        } else {
                            k61Var3.W(this.textureView);
                        }
                    }
                }
                this.videoPlayer.L(o6 + 50);
                if (z12 && !z11) {
                    this.videoPlayer.Q(true);
                    this.videoPlayer.D();
                    return;
                }
                this.videoPlayer.Q(false);
                this.videoPlayer.C();
                return;
            }
        }
        k61 k61Var4 = this.videoPlayer;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        k61Var4.X(f10);
    }

    public void lambda$setSpeed$5(float f10) {
        k61 k61Var = this.videoPlayer;
        if (k61Var != null) {
            k61Var.R(f10);
        }
    }

    public void lambda$setVolume$10(float f10) {
        k61 k61Var = this.videoPlayer;
        if (k61Var != null) {
            k61Var.X(f10);
        }
    }

    public void lambda$start$1() {
        this.initRunnable = null;
    }

    public void lambda$start$2(boolean z10, float f10, Uri uri, boolean z11, boolean z12, long j10) {
        if (this.released) {
            FileLog.d("videoplayerholderbase returned from start: released");
            return;
        }
        if (this.videoPlayer == null) {
            ensurePlayerCreated(z10);
            this.videoPlayer.R(f10);
            FileLog.d("videoplayerholderbase.start(): preparePlayer new player uri=" + uri);
            this.videoPlayer.E(uri, "other");
            k61 k61Var = this.videoPlayer;
            DispatchQueue dispatchQueue = this.dispatchQueue;
            k61Var.f30000b = dispatchQueue;
            k61Var.d.f9551l0 = dispatchQueue;
            if (!z11) {
                Surface surface = this.surface;
                if (surface != null) {
                    k61Var.U(surface);
                } else {
                    SurfaceView surfaceView = this.surfaceView;
                    if (surfaceView != null) {
                        k61Var.V(surfaceView);
                    } else {
                        k61Var.W(this.textureView);
                    }
                }
                this.videoPlayer.Q(true);
            } else if (z12) {
                Surface surface2 = this.surface;
                if (surface2 != null) {
                    k61Var.U(surface2);
                } else {
                    SurfaceView surfaceView2 = this.surfaceView;
                    if (surfaceView2 != null) {
                        k61Var.V(surfaceView2);
                    } else {
                        k61Var.W(this.textureView);
                    }
                }
                this.videoPlayer.Q(false);
            }
        } else {
            FileLog.d("videoplayerholderbase.start(): player already exist");
            if (!z11) {
                Surface surface3 = this.surface;
                if (surface3 != null) {
                    this.videoPlayer.U(surface3);
                } else {
                    SurfaceView surfaceView3 = this.surfaceView;
                    if (surfaceView3 != null) {
                        this.videoPlayer.V(surfaceView3);
                    } else {
                        this.videoPlayer.W(this.textureView);
                    }
                }
                this.videoPlayer.D();
            } else if (z12) {
                Surface surface4 = this.surface;
                if (surface4 != null) {
                    this.videoPlayer.U(surface4);
                } else {
                    SurfaceView surfaceView4 = this.surfaceView;
                    if (surfaceView4 != null) {
                        this.videoPlayer.V(surfaceView4);
                    } else {
                        this.videoPlayer.W(this.textureView);
                    }
                }
                this.videoPlayer.Q(false);
            }
        }
        if (j10 > 0) {
            this.videoPlayer.L(j10);
        }
        AndroidUtilities.runOnUIThread(new k(this, 1));
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

    public float getPlaybackProgress(long j10) {
        float f10;
        if (this.lastState == 4) {
            this.progress = 1.0f;
        } else {
            if (j10 != 0) {
                f10 = ((float) this.currentPosition) / ((float) j10);
            } else {
                f10 = ((float) this.currentPosition) / ((float) this.playerDuration);
            }
            this.progress = f10;
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
        this.dispatchQueue.postRunnable(new k(this, 5));
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
        this.dispatchQueue.postRunnable(new k(this, 4));
    }

    public void play() {
        if (!this.released && this.paused) {
            this.paused = false;
            this.dispatchQueue.postRunnable(new k(this, 3));
        }
    }

    public void preparePlayer(final Uri uri, final boolean z10, final float f10) {
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
                VideoPlayerHolderBase.this.lambda$preparePlayer$0(z10, f10, uri);
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
        this.dispatchQueue.postRunnable(new e(this, document, runnable, 2));
        Bitmap bitmap = this.playerStubBitmap;
        if (bitmap != null) {
            AndroidUtilities.recycleBitmap(bitmap);
            this.playerStubBitmap = null;
        }
        return true;
    }

    public float seek(float f10, long j10) {
        if (this.videoPlayer == null) {
            return this.currentSeek;
        }
        this.duration = j10;
        float clamp = Utilities.clamp(this.currentSeek + f10, 1.0f, 0.0f);
        this.currentSeek = clamp;
        this.currentSeekThread = clamp;
        this.dispatchQueue.cancelRunnable(this.updateSeek);
        this.dispatchQueue.postRunnable(this.updateSeek);
        return this.currentSeek;
    }

    public void seekTo(long j10) {
        this.dispatchQueue.postRunnable(new q(this, j10, 1));
    }

    public void setAudioEnabled(boolean z10, boolean z11) {
        boolean z12 = !z10;
        if (this.audioDisabled == z12) {
            return;
        }
        this.audioDisabled = z12;
        this.triesCount = 3;
        this.dispatchQueue.postRunnable(new l(this, z10, z11, 0));
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

    public void setSpeed(float f10) {
        if (this.released) {
            return;
        }
        this.dispatchQueue.postRunnable(new m(this, f10, 0));
    }

    public void setVolume(float f10) {
        this.dispatchQueue.postRunnable(new m(this, f10, 2));
    }

    public void start(final boolean z10, final boolean z11, final Uri uri, final long j10, final boolean z12, final float f10) {
        this.startTime = System.currentTimeMillis();
        this.audioDisabled = z12;
        this.paused = z11;
        this.triesCount = 3;
        if (j10 > 0) {
            this.currentPosition = j10;
        }
        DispatchQueue dispatchQueue = this.dispatchQueue;
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                VideoPlayerHolderBase.this.lambda$start$2(z12, f10, uri, z11, z10, j10);
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

    public void seekTo(long j10, boolean z10, Runnable runnable) {
        this.dispatchQueue.postRunnable(new q8(this, j10, z10, runnable));
    }

    public VideoPlayerHolderBase with(TextureView textureView) {
        this.surfaceView = null;
        this.textureView = textureView;
        this.surface = null;
        return this;
    }

    public void play(float f10) {
        if (!this.released && this.paused) {
            this.paused = false;
            this.dispatchQueue.postRunnable(new m(this, f10, 1));
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

    public void onStateChanged(boolean z10, int i9) {
    }

    public void onVideoSizeChanged(int i9, int i10, int i11, float f10) {
    }
}
