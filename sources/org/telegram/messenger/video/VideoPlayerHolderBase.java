package org.telegram.messenger.video;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import e2.m0;
import j$.util.concurrent.ConcurrentHashMap;
import li.s;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.b8;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.messenger.s5;
import org.telegram.messenger.x8;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.v61;
public class VideoPlayerHolderBase {
    private boolean allowMultipleInstances;
    boolean audioDisabled;
    private final Runnable betterSeek;
    Uri contentUri;
    private int currentAccount;
    public volatile long currentPosition;
    public float currentSeek;
    public volatile float currentSeekThread;
    final s5 dispatchQueue;
    public TLRPC.Document document;
    private volatile long duration;
    public boolean firstFrameRendered;
    private volatile boolean firstSeek;
    Runnable initRunnable;
    private long lastBetterSeek;
    private volatile long lastSeek;
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
    Runnable progressRunnable;
    public volatile boolean released;
    private volatile boolean seeking;
    long startTime;
    public boolean stubAvailable;
    private Surface surface;
    private SurfaceView surfaceView;
    private TextureView textureView;
    private volatile int triesCount;
    private final Runnable updateSeek;
    public Uri uri;
    v61 videoPlayer;

    public class AnonymousClass2 implements t61 {
        public AnonymousClass2() {
            VideoPlayerHolderBase.this = r1;
        }

        public void lambda$onError$0(long j10) {
            VideoPlayerHolderBase videoPlayerHolderBase;
            Uri uri;
            if (!VideoPlayerHolderBase.this.released && (uri = (videoPlayerHolderBase = VideoPlayerHolderBase.this).uri) != null) {
                videoPlayerHolderBase.videoPlayer.j0(uri, "other");
                VideoPlayerHolderBase.this.videoPlayer.p0(j10);
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
        public void onError(v61 v61Var, Exception exc) {
            f8.g(exc, true);
            long currentPosition = VideoPlayerHolderBase.this.getCurrentPosition();
            VideoPlayerHolderBase.access$010(VideoPlayerHolderBase.this);
            if (VideoPlayerHolderBase.this.triesCount > 0) {
                VideoPlayerHolderBase videoPlayerHolderBase = VideoPlayerHolderBase.this;
                s5 s5Var = videoPlayerHolderBase.dispatchQueue;
                q qVar = new q(this, currentPosition, 0);
                videoPlayerHolderBase.initRunnable = qVar;
                s5Var.postRunnable(qVar);
                return;
            }
            i0.g3(new p(this, 1));
        }

        @Override
        public void onRenderedFirstFrame(j2.a aVar) {
        }

        @Override
        public void onStateChanged(boolean z10, int i10) {
            VideoPlayerHolderBase videoPlayerHolderBase = VideoPlayerHolderBase.this;
            videoPlayerHolderBase.lastState = i10;
            videoPlayerHolderBase.currentPosition = videoPlayerHolderBase.videoPlayer.S();
            VideoPlayerHolderBase videoPlayerHolderBase2 = VideoPlayerHolderBase.this;
            videoPlayerHolderBase2.playerDuration = videoPlayerHolderBase2.videoPlayer.U();
            if (i10 != 3 && i10 != 2) {
                if (i10 == 4) {
                    if (VideoPlayerHolderBase.this.needRepeat()) {
                        VideoPlayerHolderBase videoPlayerHolderBase3 = VideoPlayerHolderBase.this;
                        videoPlayerHolderBase3.progress = 0.0f;
                        videoPlayerHolderBase3.videoPlayer.p0(0L);
                        VideoPlayerHolderBase.this.videoPlayer.h0();
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
            long j10;
            p pVar = new p(this, 0);
            if (VideoPlayerHolderBase.this.surface != null) {
                j10 = 0;
            } else {
                j10 = VideoPlayerHolderBase.this.surfaceView == null ? 16L : 32L;
            }
            i0.h3(pVar, j10);
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

    public VideoPlayerHolderBase() {
        if (Utilities.f14526k == null) {
            Utilities.f14526k = new s5("playerQueue", true);
        }
        this.dispatchQueue = Utilities.f14526k;
        this.progressRunnable = new Runnable() {
            {
                VideoPlayerHolderBase.this = this;
            }

            @Override
            public void run() {
                VideoPlayerHolderBase videoPlayerHolderBase = VideoPlayerHolderBase.this;
                v61 v61Var = videoPlayerHolderBase.videoPlayer;
                if (v61Var != null) {
                    if (videoPlayerHolderBase.lastState == 4) {
                        videoPlayerHolderBase.progress = 1.0f;
                    } else {
                        videoPlayerHolderBase.currentPosition = v61Var.S();
                        VideoPlayerHolderBase videoPlayerHolderBase2 = VideoPlayerHolderBase.this;
                        videoPlayerHolderBase2.playerDuration = videoPlayerHolderBase2.videoPlayer.U();
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
        this.triesCount = 3;
        this.firstSeek = true;
        this.lastSeek = -1L;
        this.lastBetterSeek = -1L;
        this.currentSeek = 0.0f;
        this.currentSeekThread = 0.0f;
        this.betterSeek = new k(this, 0);
        this.updateSeek = new k(this, 2);
    }

    public static int access$010(VideoPlayerHolderBase videoPlayerHolderBase) {
        int i10 = videoPlayerHolderBase.triesCount;
        videoPlayerHolderBase.triesCount = i10 - 1;
        return i10;
    }

    private void ensurePlayerCreated(boolean z10) {
        v61 v61Var = this.videoPlayer;
        if (v61Var != null) {
            v61Var.m0();
        }
        v61 v61Var2 = new v61(false, z10);
        this.videoPlayer = v61Var2;
        v61Var2.D = this.allowMultipleInstances;
        v61Var2.J = new AnonymousClass2();
        this.videoPlayer.f31202c = true;
    }

    public void lambda$loopBack$9() {
        v61 v61Var = this.videoPlayer;
        if (v61Var != null) {
            v61Var.p0(0L);
        }
        this.progress = 0.0f;
        this.currentPosition = 0L;
    }

    public void lambda$new$14() {
        int i10;
        if (this.videoPlayer != null) {
            long j10 = this.currentSeekThread * ((float) this.duration);
            if (this.lastSeek <= -1) {
                this.lastSeek = j10;
            }
            long abs = Math.abs(j10 - this.lastSeek);
            if (this.firstSeek) {
                i10 = 350;
            } else {
                i10 = 40;
            }
            if (abs >= i10) {
                this.firstSeek = false;
                this.lastBetterSeek = j10;
                this.dispatchQueue.cancelRunnable(this.betterSeek);
                this.dispatchQueue.postRunnable(this.betterSeek, 300L);
                v61 v61Var = this.videoPlayer;
                this.lastSeek = j10;
                v61Var.q0(j10, true);
            }
        }
    }

    public void lambda$pause$4() {
        v61 v61Var = this.videoPlayer;
        if (v61Var != null) {
            v61Var.g0();
        }
    }

    public void lambda$play$6() {
        v61 v61Var = this.videoPlayer;
        if (v61Var != null) {
            Surface surface = this.surface;
            if (surface != null) {
                v61Var.y0(surface);
            } else {
                SurfaceView surfaceView = this.surfaceView;
                if (surfaceView != null) {
                    v61Var.z0(surfaceView);
                } else {
                    v61Var.A0(this.textureView);
                }
            }
            long j10 = this.pendingSeekTo;
            if (j10 > 0) {
                this.videoPlayer.p0(j10);
                this.pendingSeekTo = 0L;
            }
            this.videoPlayer.u0(true);
        }
    }

    public void lambda$play$7(float f7) {
        v61 v61Var = this.videoPlayer;
        if (v61Var != null) {
            Surface surface = this.surface;
            if (surface != null) {
                v61Var.y0(surface);
            } else {
                SurfaceView surfaceView = this.surfaceView;
                if (surfaceView != null) {
                    v61Var.z0(surfaceView);
                } else {
                    v61Var.A0(this.textureView);
                }
            }
            long j10 = this.pendingSeekTo;
            if (j10 > 0) {
                this.videoPlayer.p0(j10);
                this.pendingSeekTo = 0L;
            }
            this.videoPlayer.v0(f7);
            this.videoPlayer.u0(true);
        }
    }

    public void lambda$preparePlayer$0(boolean z10, float f7, Uri uri) {
        if (this.released) {
            return;
        }
        ensurePlayerCreated(z10);
        this.videoPlayer.v0(f7);
        f8.b("videoplayerholderbase.preparePlayer(): preparePlayer new player as preload uri=" + uri);
        this.videoPlayer.i0(0L, uri, "other");
        this.videoPlayer.u0(false);
        this.videoPlayer.C0(this.dispatchQueue);
    }

    public void lambda$release$3(TLRPC.Document document, Runnable runnable) {
        v61 v61Var = this.videoPlayer;
        if (v61Var != null) {
            v61Var.y0(null);
            this.videoPlayer.A0(null);
            this.videoPlayer.z0(null);
            this.videoPlayer.m0();
        }
        if (document != null) {
            b8.G(this.currentAccount).f(document);
        }
        if (runnable != null) {
            i0.g3(runnable);
        }
        this.videoPlayer = null;
        this.dispatchQueue.cancelRunnable(this.progressRunnable);
    }

    public void lambda$seekTo$11(long j10) {
        v61 v61Var = this.videoPlayer;
        if (v61Var == null) {
            this.pendingSeekTo = j10;
        } else {
            v61Var.p0(j10);
        }
    }

    public void lambda$seekTo$12(long j10, boolean z10, Runnable runnable) {
        v61 v61Var = this.videoPlayer;
        if (v61Var == null) {
            this.pendingSeekTo = j10;
        } else {
            v61Var.r0(j10, z10, runnable);
        }
    }

    public void lambda$setAudioEnabled$8(boolean z10, boolean z11) {
        float f7;
        v61 v61Var = this.videoPlayer;
        if (v61Var == null) {
            return;
        }
        boolean d02 = v61Var.d0();
        if (z10) {
            v61 v61Var2 = this.videoPlayer;
            if (v61Var2.f31201b0) {
                v61Var2.g0();
                long S = this.videoPlayer.S();
                this.videoPlayer.m0();
                this.videoPlayer = null;
                ensurePlayerCreated(this.audioDisabled);
                Uri uri = this.uri;
                if (uri == null) {
                    uri = this.contentUri;
                }
                f8.b("videoplayerholderbase.setAudioEnabled(): repreparePlayer as audio track is enabled back uri=" + uri);
                this.videoPlayer.j0(uri, "other");
                this.videoPlayer.C0(this.dispatchQueue);
                if (!z11) {
                    Surface surface = this.surface;
                    if (surface != null) {
                        this.videoPlayer.y0(surface);
                    } else {
                        SurfaceView surfaceView = this.surfaceView;
                        if (surfaceView != null) {
                            this.videoPlayer.z0(surfaceView);
                        } else {
                            this.videoPlayer.A0(this.textureView);
                        }
                    }
                }
                this.videoPlayer.p0(S + 50);
                if (d02 && !z11) {
                    this.videoPlayer.u0(true);
                    this.videoPlayer.h0();
                    return;
                }
                this.videoPlayer.u0(false);
                this.videoPlayer.g0();
                return;
            }
        }
        v61 v61Var3 = this.videoPlayer;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        v61Var3.B0(f7);
    }

    public void lambda$setSpeed$5(float f7) {
        v61 v61Var = this.videoPlayer;
        if (v61Var != null) {
            v61Var.v0(f7);
        }
    }

    public void lambda$setVolume$10(float f7) {
        v61 v61Var = this.videoPlayer;
        if (v61Var != null) {
            v61Var.B0(f7);
        }
    }

    public void lambda$start$1() {
        this.initRunnable = null;
    }

    public void lambda$start$2(boolean z10, float f7, Uri uri, boolean z11, boolean z12, long j10) {
        if (this.released) {
            f8.b("videoplayerholderbase returned from start: released");
            return;
        }
        if (this.videoPlayer == null) {
            ensurePlayerCreated(z10);
            this.videoPlayer.v0(f7);
            f8.b("videoplayerholderbase.start(): preparePlayer new player uri=" + uri);
            this.videoPlayer.j0(uri, "other");
            this.videoPlayer.C0(this.dispatchQueue);
            if (!z11) {
                Surface surface = this.surface;
                if (surface != null) {
                    this.videoPlayer.y0(surface);
                } else {
                    SurfaceView surfaceView = this.surfaceView;
                    if (surfaceView != null) {
                        this.videoPlayer.z0(surfaceView);
                    } else {
                        this.videoPlayer.A0(this.textureView);
                    }
                }
                this.videoPlayer.u0(true);
            } else if (z12) {
                Surface surface2 = this.surface;
                if (surface2 != null) {
                    this.videoPlayer.y0(surface2);
                } else {
                    SurfaceView surfaceView2 = this.surfaceView;
                    if (surfaceView2 != null) {
                        this.videoPlayer.z0(surfaceView2);
                    } else {
                        this.videoPlayer.A0(this.textureView);
                    }
                }
                this.videoPlayer.u0(false);
            }
        } else {
            f8.b("videoplayerholderbase.start(): player already exist");
            if (!z11) {
                Surface surface3 = this.surface;
                if (surface3 != null) {
                    this.videoPlayer.y0(surface3);
                } else {
                    SurfaceView surfaceView3 = this.surfaceView;
                    if (surfaceView3 != null) {
                        this.videoPlayer.z0(surfaceView3);
                    } else {
                        this.videoPlayer.A0(this.textureView);
                    }
                }
                this.videoPlayer.h0();
            } else if (z12) {
                Surface surface4 = this.surface;
                if (surface4 != null) {
                    this.videoPlayer.y0(surface4);
                } else {
                    SurfaceView surfaceView4 = this.surfaceView;
                    if (surfaceView4 != null) {
                        this.videoPlayer.z0(surfaceView4);
                    } else {
                        this.videoPlayer.A0(this.textureView);
                    }
                }
                this.videoPlayer.u0(false);
            }
        }
        if (j10 > 0) {
            this.videoPlayer.p0(j10);
        }
        i0.g3(new k(this, 1));
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
        float f7;
        if (this.lastState == 4) {
            this.progress = 1.0f;
        } else {
            if (j10 != 0) {
                f7 = ((float) this.currentPosition) / ((float) j10);
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

    public void preparePlayer(final Uri uri, final boolean z10, final float f7) {
        this.audioDisabled = z10;
        this.currentAccount = this.currentAccount;
        this.contentUri = uri;
        this.paused = true;
        Runnable runnable = this.initRunnable;
        if (runnable != null) {
            this.dispatchQueue.cancelRunnable(runnable);
        }
        s5 s5Var = this.dispatchQueue;
        Runnable runnable2 = new Runnable() {
            @Override
            public final void run() {
                VideoPlayerHolderBase.this.lambda$preparePlayer$0(z10, f7, uri);
            }
        };
        this.initRunnable = runnable2;
        s5Var.postRunnable(runnable2);
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
                i0.z0(this.surfaceView, this.playerStubBitmap);
                if (this.playerStubBitmap.getPixel(0, 0) == 0) {
                    this.stubAvailable = false;
                }
            }
        }
    }

    public boolean release(Runnable runnable) {
        int intValue;
        TLRPC.Document document = this.document;
        if (document != null) {
            ConcurrentHashMap concurrentHashMap = x8.I;
            Integer num = (Integer) concurrentHashMap.get(Long.valueOf(document.f19800id));
            if (num == null) {
                intValue = 3;
            } else {
                intValue = num.intValue();
            }
            if (intValue != 0) {
                concurrentHashMap.put(Long.valueOf(document.f19800id), 0);
                b8.G(this.currentAccount).h(0, document, null, null, null, null);
            }
        }
        this.released = true;
        this.dispatchQueue.cancelRunnable(this.initRunnable);
        this.dispatchQueue.cancelRunnable(this.progressRunnable);
        this.initRunnable = null;
        this.dispatchQueue.postRunnable(new s(this, document, runnable, 15));
        Bitmap bitmap = this.playerStubBitmap;
        if (bitmap != null) {
            i0.z2(bitmap);
            this.playerStubBitmap = null;
        }
        return true;
    }

    public float seek(float f7, long j10) {
        if (this.videoPlayer == null) {
            return this.currentSeek;
        }
        this.duration = j10;
        float i10 = Utilities.i(this.currentSeek + f7, 1.0f, 0.0f);
        this.currentSeek = i10;
        this.currentSeekThread = i10;
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
        this.dispatchQueue.postRunnable(new m0(this, z10, z11, 1));
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

    public void start(final boolean z10, final boolean z11, final Uri uri, final long j10, final boolean z12, final float f7) {
        this.startTime = System.currentTimeMillis();
        this.audioDisabled = z12;
        this.paused = z11;
        this.triesCount = 3;
        if (j10 > 0) {
            this.currentPosition = j10;
        }
        s5 s5Var = this.dispatchQueue;
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                VideoPlayerHolderBase.this.lambda$start$2(z12, f7, uri, z11, z10, j10);
            }
        };
        this.initRunnable = runnable;
        s5Var.postRunnable(runnable);
    }

    public VideoPlayerHolderBase with(SurfaceView surfaceView) {
        this.surfaceView = surfaceView;
        this.textureView = null;
        this.surface = null;
        return this;
    }

    public void seekTo(long j10, boolean z10, Runnable runnable) {
        this.dispatchQueue.postRunnable(new o(this, j10, z10, runnable, 0));
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
