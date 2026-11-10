package org.telegram.messenger.video;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import h2.n0;
import j$.util.concurrent.ConcurrentHashMap;
import l2.z0;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.q5;
import org.telegram.messenger.s8;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.t51;
public class VideoPlayerHolderBase {
    private boolean allowMultipleInstances;
    boolean audioDisabled;
    private final Runnable betterSeek;
    Uri contentUri;
    private int currentAccount;
    public volatile long currentPosition;
    public float currentSeek;
    public volatile float currentSeekThread;
    final q5 dispatchQueue;
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
    t51 videoPlayer;

    public class AnonymousClass2 implements q51 {
        public AnonymousClass2() {
            VideoPlayerHolderBase.this = r1;
        }

        public void lambda$onError$0(long j3) {
            VideoPlayerHolderBase videoPlayerHolderBase;
            Uri uri;
            if (!VideoPlayerHolderBase.this.released && (uri = (videoPlayerHolderBase = VideoPlayerHolderBase.this).uri) != null) {
                videoPlayerHolderBase.videoPlayer.j0(uri, "other");
                VideoPlayerHolderBase.this.videoPlayer.p0(j3);
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
        public void onError(t51 t51Var, Exception exc) {
            a8.g(exc, true);
            long currentPosition = VideoPlayerHolderBase.this.getCurrentPosition();
            VideoPlayerHolderBase.access$010(VideoPlayerHolderBase.this);
            if (VideoPlayerHolderBase.this.triesCount > 0) {
                VideoPlayerHolderBase videoPlayerHolderBase = VideoPlayerHolderBase.this;
                q5 q5Var = videoPlayerHolderBase.dispatchQueue;
                p pVar = new p(this, currentPosition, 0);
                videoPlayerHolderBase.initRunnable = pVar;
                q5Var.postRunnable(pVar);
                return;
            }
            g0.h3(new o(this, 1));
        }

        @Override
        public void onRenderedFirstFrame(m2.a aVar) {
        }

        @Override
        public void onStateChanged(boolean z9, int i7) {
            VideoPlayerHolderBase videoPlayerHolderBase = VideoPlayerHolderBase.this;
            videoPlayerHolderBase.lastState = i7;
            videoPlayerHolderBase.currentPosition = videoPlayerHolderBase.videoPlayer.S();
            VideoPlayerHolderBase videoPlayerHolderBase2 = VideoPlayerHolderBase.this;
            videoPlayerHolderBase2.playerDuration = videoPlayerHolderBase2.videoPlayer.U();
            if (i7 != 3 && i7 != 2) {
                if (i7 == 4) {
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
            VideoPlayerHolderBase.this.onStateChanged(z9, i7);
        }

        @Override
        public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
            return false;
        }

        @Override
        public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
            VideoPlayerHolderBase.this.onVideoSizeChanged(i7, i10, i11, f10);
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
            g0.i3(oVar, j3);
        }

        @Override
        public void onSeekFinished(m2.a aVar) {
        }

        @Override
        public void onSeekStarted(m2.a aVar) {
        }

        @Override
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public VideoPlayerHolderBase() {
        if (Utilities.f21346k == null) {
            Utilities.f21346k = new q5("playerQueue", true);
        }
        this.dispatchQueue = Utilities.f21346k;
        this.progressRunnable = new Runnable() {
            {
                VideoPlayerHolderBase.this = this;
            }

            @Override
            public void run() {
                VideoPlayerHolderBase videoPlayerHolderBase = VideoPlayerHolderBase.this;
                t51 t51Var = videoPlayerHolderBase.videoPlayer;
                if (t51Var != null) {
                    if (videoPlayerHolderBase.lastState == 4) {
                        videoPlayerHolderBase.progress = 1.0f;
                    } else {
                        videoPlayerHolderBase.currentPosition = t51Var.S();
                        VideoPlayerHolderBase videoPlayerHolderBase2 = VideoPlayerHolderBase.this;
                        videoPlayerHolderBase2.playerDuration = videoPlayerHolderBase2.videoPlayer.U();
                    }
                    VideoPlayerHolderBase videoPlayerHolderBase3 = VideoPlayerHolderBase.this;
                    int i7 = videoPlayerHolderBase3.lastState;
                    if (i7 == 3 || i7 == 2) {
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
        this.betterSeek = new j(this, 0);
        this.updateSeek = new j(this, 2);
    }

    public static int access$010(VideoPlayerHolderBase videoPlayerHolderBase) {
        int i7 = videoPlayerHolderBase.triesCount;
        videoPlayerHolderBase.triesCount = i7 - 1;
        return i7;
    }

    private void ensurePlayerCreated(boolean z9) {
        t51 t51Var = this.videoPlayer;
        if (t51Var != null) {
            t51Var.m0();
        }
        t51 t51Var2 = new t51(false, z9);
        this.videoPlayer = t51Var2;
        t51Var2.D = this.allowMultipleInstances;
        t51Var2.J = new AnonymousClass2();
        this.videoPlayer.f38198c = true;
    }

    public void lambda$loopBack$9() {
        t51 t51Var = this.videoPlayer;
        if (t51Var != null) {
            t51Var.p0(0L);
        }
        this.progress = 0.0f;
        this.currentPosition = 0L;
    }

    public void lambda$new$14() {
        int i7;
        if (this.videoPlayer != null) {
            long j3 = this.currentSeekThread * ((float) this.duration);
            if (this.lastSeek <= -1) {
                this.lastSeek = j3;
            }
            long abs = Math.abs(j3 - this.lastSeek);
            if (this.firstSeek) {
                i7 = 350;
            } else {
                i7 = 40;
            }
            if (abs >= i7) {
                this.firstSeek = false;
                this.lastBetterSeek = j3;
                this.dispatchQueue.cancelRunnable(this.betterSeek);
                this.dispatchQueue.postRunnable(this.betterSeek, 300L);
                t51 t51Var = this.videoPlayer;
                this.lastSeek = j3;
                t51Var.q0(j3, true);
            }
        }
    }

    public void lambda$pause$4() {
        t51 t51Var = this.videoPlayer;
        if (t51Var != null) {
            t51Var.g0();
        }
    }

    public void lambda$play$6() {
        t51 t51Var = this.videoPlayer;
        if (t51Var != null) {
            Surface surface = this.surface;
            if (surface != null) {
                t51Var.y0(surface);
            } else {
                SurfaceView surfaceView = this.surfaceView;
                if (surfaceView != null) {
                    t51Var.z0(surfaceView);
                } else {
                    t51Var.A0(this.textureView);
                }
            }
            long j3 = this.pendingSeekTo;
            if (j3 > 0) {
                this.videoPlayer.p0(j3);
                this.pendingSeekTo = 0L;
            }
            this.videoPlayer.u0(true);
        }
    }

    public void lambda$play$7(float f10) {
        t51 t51Var = this.videoPlayer;
        if (t51Var != null) {
            Surface surface = this.surface;
            if (surface != null) {
                t51Var.y0(surface);
            } else {
                SurfaceView surfaceView = this.surfaceView;
                if (surfaceView != null) {
                    t51Var.z0(surfaceView);
                } else {
                    t51Var.A0(this.textureView);
                }
            }
            long j3 = this.pendingSeekTo;
            if (j3 > 0) {
                this.videoPlayer.p0(j3);
                this.pendingSeekTo = 0L;
            }
            this.videoPlayer.v0(f10);
            this.videoPlayer.u0(true);
        }
    }

    public void lambda$preparePlayer$0(boolean z9, float f10, Uri uri) {
        if (this.released) {
            return;
        }
        ensurePlayerCreated(z9);
        this.videoPlayer.v0(f10);
        a8.b("videoplayerholderbase.preparePlayer(): preparePlayer new player as preload uri=" + uri);
        this.videoPlayer.i0(0L, uri, "other");
        this.videoPlayer.u0(false);
        this.videoPlayer.C0(this.dispatchQueue);
    }

    public void lambda$release$3(TLRPC.Document document, Runnable runnable) {
        t51 t51Var = this.videoPlayer;
        if (t51Var != null) {
            t51Var.y0(null);
            this.videoPlayer.A0(null);
            this.videoPlayer.z0(null);
            this.videoPlayer.m0();
        }
        if (document != null) {
            w7.G(this.currentAccount).f(document);
        }
        if (runnable != null) {
            g0.h3(runnable);
        }
        this.videoPlayer = null;
        this.dispatchQueue.cancelRunnable(this.progressRunnable);
    }

    public void lambda$seekTo$11(long j3) {
        t51 t51Var = this.videoPlayer;
        if (t51Var == null) {
            this.pendingSeekTo = j3;
        } else {
            t51Var.p0(j3);
        }
    }

    public void lambda$seekTo$12(long j3, boolean z9, Runnable runnable) {
        t51 t51Var = this.videoPlayer;
        if (t51Var == null) {
            this.pendingSeekTo = j3;
        } else {
            t51Var.r0(j3, z9, runnable);
        }
    }

    public void lambda$setAudioEnabled$8(boolean z9, boolean z10) {
        float f10;
        t51 t51Var = this.videoPlayer;
        if (t51Var == null) {
            return;
        }
        boolean d02 = t51Var.d0();
        if (z9) {
            t51 t51Var2 = this.videoPlayer;
            if (t51Var2.f38197b0) {
                t51Var2.g0();
                long S = this.videoPlayer.S();
                this.videoPlayer.m0();
                this.videoPlayer = null;
                ensurePlayerCreated(this.audioDisabled);
                Uri uri = this.uri;
                if (uri == null) {
                    uri = this.contentUri;
                }
                a8.b("videoplayerholderbase.setAudioEnabled(): repreparePlayer as audio track is enabled back uri=" + uri);
                this.videoPlayer.j0(uri, "other");
                this.videoPlayer.C0(this.dispatchQueue);
                if (!z10) {
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
                if (d02 && !z10) {
                    this.videoPlayer.u0(true);
                    this.videoPlayer.h0();
                    return;
                }
                this.videoPlayer.u0(false);
                this.videoPlayer.g0();
                return;
            }
        }
        t51 t51Var3 = this.videoPlayer;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        t51Var3.B0(f10);
    }

    public void lambda$setSpeed$5(float f10) {
        t51 t51Var = this.videoPlayer;
        if (t51Var != null) {
            t51Var.v0(f10);
        }
    }

    public void lambda$setVolume$10(float f10) {
        t51 t51Var = this.videoPlayer;
        if (t51Var != null) {
            t51Var.B0(f10);
        }
    }

    public void lambda$start$1() {
        this.initRunnable = null;
    }

    public void lambda$start$2(boolean z9, float f10, Uri uri, boolean z10, boolean z11, long j3) {
        if (this.released) {
            a8.b("videoplayerholderbase returned from start: released");
            return;
        }
        if (this.videoPlayer == null) {
            ensurePlayerCreated(z9);
            this.videoPlayer.v0(f10);
            a8.b("videoplayerholderbase.start(): preparePlayer new player uri=" + uri);
            this.videoPlayer.j0(uri, "other");
            this.videoPlayer.C0(this.dispatchQueue);
            if (!z10) {
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
            } else if (z11) {
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
            a8.b("videoplayerholderbase.start(): player already exist");
            if (!z10) {
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
            } else if (z11) {
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
        if (j3 > 0) {
            this.videoPlayer.p0(j3);
        }
        g0.h3(new j(this, 1));
    }

    public void allowMultipleInstances(boolean z9) {
        this.allowMultipleInstances = z9;
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
        float f10;
        if (this.lastState == 4) {
            this.progress = 1.0f;
        } else {
            if (j3 != 0) {
                f10 = ((float) this.currentPosition) / ((float) j3);
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

    public void preparePlayer(final Uri uri, final boolean z9, final float f10) {
        this.audioDisabled = z9;
        this.currentAccount = this.currentAccount;
        this.contentUri = uri;
        this.paused = true;
        Runnable runnable = this.initRunnable;
        if (runnable != null) {
            this.dispatchQueue.cancelRunnable(runnable);
        }
        q5 q5Var = this.dispatchQueue;
        Runnable runnable2 = new Runnable() {
            @Override
            public final void run() {
                VideoPlayerHolderBase.this.lambda$preparePlayer$0(z9, f10, uri);
            }
        };
        this.initRunnable = runnable2;
        q5Var.postRunnable(runnable2);
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
                g0.z0(this.surfaceView, this.playerStubBitmap);
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
            ConcurrentHashMap concurrentHashMap = s8.I;
            Integer num = (Integer) concurrentHashMap.get(Long.valueOf(document.f26966id));
            if (num == null) {
                intValue = 3;
            } else {
                intValue = num.intValue();
            }
            if (intValue != 0) {
                concurrentHashMap.put(Long.valueOf(document.f26966id), 0);
                w7.G(this.currentAccount).h(0, document, null, null, null, null);
            }
        }
        this.released = true;
        this.dispatchQueue.cancelRunnable(this.initRunnable);
        this.dispatchQueue.cancelRunnable(this.progressRunnable);
        this.initRunnable = null;
        this.dispatchQueue.postRunnable(new z0(this, document, runnable, 15));
        Bitmap bitmap = this.playerStubBitmap;
        if (bitmap != null) {
            g0.z2(bitmap);
            this.playerStubBitmap = null;
        }
        return true;
    }

    public float seek(float f10, long j3) {
        if (this.videoPlayer == null) {
            return this.currentSeek;
        }
        this.duration = j3;
        float i7 = Utilities.i(this.currentSeek + f10, 1.0f, 0.0f);
        this.currentSeek = i7;
        this.currentSeekThread = i7;
        this.dispatchQueue.cancelRunnable(this.updateSeek);
        this.dispatchQueue.postRunnable(this.updateSeek);
        return this.currentSeek;
    }

    public void seekTo(long j3) {
        this.dispatchQueue.postRunnable(new p(this, j3, 1));
    }

    public void setAudioEnabled(boolean z9, boolean z10) {
        boolean z11 = !z9;
        if (this.audioDisabled == z11) {
            return;
        }
        this.audioDisabled = z11;
        this.triesCount = 3;
        this.dispatchQueue.postRunnable(new n0(this, z9, z10, 1));
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

    public void setSeeking(boolean z9) {
        if (z9 && !this.seeking) {
            this.firstSeek = true;
        }
        this.seeking = z9;
        if (!z9) {
            this.dispatchQueue.cancelRunnable(this.betterSeek);
        }
    }

    public void setSpeed(float f10) {
        if (this.released) {
            return;
        }
        this.dispatchQueue.postRunnable(new k(this, f10, 0));
    }

    public void setVolume(float f10) {
        this.dispatchQueue.postRunnable(new k(this, f10, 2));
    }

    public void start(final boolean z9, final boolean z10, final Uri uri, final long j3, final boolean z11, final float f10) {
        this.startTime = System.currentTimeMillis();
        this.audioDisabled = z11;
        this.paused = z10;
        this.triesCount = 3;
        if (j3 > 0) {
            this.currentPosition = j3;
        }
        q5 q5Var = this.dispatchQueue;
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                VideoPlayerHolderBase.this.lambda$start$2(z11, f10, uri, z10, z9, j3);
            }
        };
        this.initRunnable = runnable;
        q5Var.postRunnable(runnable);
    }

    public VideoPlayerHolderBase with(SurfaceView surfaceView) {
        this.surfaceView = surfaceView;
        this.textureView = null;
        this.surface = null;
        return this;
    }

    public void seekTo(long j3, boolean z9, Runnable runnable) {
        this.dispatchQueue.postRunnable(new n(this, j3, z9, runnable, 0));
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
            this.dispatchQueue.postRunnable(new k(this, f10, 1));
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

    public void onStateChanged(boolean z9, int i7) {
    }

    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
    }
}
