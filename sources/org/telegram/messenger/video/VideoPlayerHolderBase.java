package org.telegram.messenger.video;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import j$.util.concurrent.ConcurrentHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
public class VideoPlayerHolderBase {
    private boolean allowMultipleInstances;
    boolean audioDisabled;
    private final Runnable betterSeek;
    Uri contentUri;
    private int currentAccount;
    public volatile long currentPosition;
    public float currentSeek;
    public volatile float currentSeekThread;
    final uo3 dispatchQueue;
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
    kfc videoPlayer;

    public VideoPlayerHolderBase() {
        if (Utilities.k == null) {
            Utilities.k = new uo3("playerQueue", true);
        }
        this.dispatchQueue = Utilities.k;
        this.progressRunnable = new Runnable() {
            {
                VideoPlayerHolderBase.this = this;
            }

            @Override
            public void run() {
                VideoPlayerHolderBase videoPlayerHolderBase = VideoPlayerHolderBase.this;
                kfc kfcVar = videoPlayerHolderBase.videoPlayer;
                if (kfcVar != null) {
                    if (videoPlayerHolderBase.lastState == 4) {
                        videoPlayerHolderBase.progress = 1.0f;
                    } else {
                        videoPlayerHolderBase.currentPosition = kfcVar.S();
                        VideoPlayerHolderBase videoPlayerHolderBase2 = VideoPlayerHolderBase.this;
                        videoPlayerHolderBase2.playerDuration = videoPlayerHolderBase2.videoPlayer.U();
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
        this.triesCount = 3;
        this.firstSeek = true;
        this.lastSeek = -1L;
        this.lastBetterSeek = -1L;
        this.currentSeek = 0.0f;
        this.currentSeekThread = 0.0f;
        this.betterSeek = new mfc(this, (byte) 0);
        this.updateSeek = new mfc(this, (byte) 2);
    }

    private void ensurePlayerCreated(boolean z) {
        kfc kfcVar = this.videoPlayer;
        if (kfcVar != null) {
            kfcVar.l0();
        }
        kfc kfcVar2 = new kfc(false, z);
        this.videoPlayer = kfcVar2;
        kfcVar2.E = this.allowMultipleInstances;
        kfcVar2.K = new AnonymousClass2();
        this.videoPlayer.c = true;
    }

    public void lambda$loopBack$9() {
        kfc kfcVar = this.videoPlayer;
        if (kfcVar != null) {
            kfcVar.o0(0L);
        }
        this.progress = 0.0f;
        this.currentPosition = 0L;
    }

    public void lambda$new$14() {
        int i;
        if (this.videoPlayer != null) {
            long j = this.currentSeekThread * ((float) this.duration);
            if (this.lastSeek <= -1) {
                this.lastSeek = j;
            }
            long abs = Math.abs(j - this.lastSeek);
            if (this.firstSeek) {
                i = 350;
            } else {
                i = 40;
            }
            if (abs >= i) {
                this.firstSeek = false;
                this.lastBetterSeek = j;
                this.dispatchQueue.cancelRunnable(this.betterSeek);
                this.dispatchQueue.postRunnable(this.betterSeek, 300L);
                kfc kfcVar = this.videoPlayer;
                this.lastSeek = j;
                kfcVar.p0(j, true);
            }
        }
    }

    public void lambda$pause$4() {
        kfc kfcVar = this.videoPlayer;
        if (kfcVar != null) {
            kfcVar.f0();
        }
    }

    public void lambda$play$6() {
        kfc kfcVar = this.videoPlayer;
        if (kfcVar != null) {
            Surface surface = this.surface;
            if (surface != null) {
                kfcVar.x0(surface);
            } else {
                SurfaceView surfaceView = this.surfaceView;
                if (surfaceView != null) {
                    kfcVar.y0(surfaceView);
                } else {
                    kfcVar.z0(this.textureView);
                }
            }
            long j = this.pendingSeekTo;
            if (j > 0) {
                this.videoPlayer.o0(j);
                this.pendingSeekTo = 0L;
            }
            this.videoPlayer.t0(true);
        }
    }

    public void lambda$play$7(float f) {
        kfc kfcVar = this.videoPlayer;
        if (kfcVar != null) {
            Surface surface = this.surface;
            if (surface != null) {
                kfcVar.x0(surface);
            } else {
                SurfaceView surfaceView = this.surfaceView;
                if (surfaceView != null) {
                    kfcVar.y0(surfaceView);
                } else {
                    kfcVar.z0(this.textureView);
                }
            }
            long j = this.pendingSeekTo;
            if (j > 0) {
                this.videoPlayer.o0(j);
                this.pendingSeekTo = 0L;
            }
            this.videoPlayer.u0(f);
            this.videoPlayer.t0(true);
        }
    }

    public void lambda$preparePlayer$0(boolean z, float f, Uri uri) {
        if (this.released) {
            return;
        }
        ensurePlayerCreated(z);
        this.videoPlayer.u0(f);
        cc4.b("videoplayerholderbase.preparePlayer(): preparePlayer new player as preload uri=" + uri);
        this.videoPlayer.h0(0L, uri, "other");
        this.videoPlayer.t0(false);
        this.videoPlayer.B0(this.dispatchQueue);
    }

    public void lambda$release$3(TLRPC.Document document, Runnable runnable) {
        kfc kfcVar = this.videoPlayer;
        if (kfcVar != null) {
            kfcVar.x0(null);
            this.videoPlayer.z0(null);
            this.videoPlayer.y0(null);
            this.videoPlayer.l0();
        }
        if (document != null) {
            xb4.G(this.currentAccount).f(document);
        }
        if (runnable != null) {
            hl.c3(runnable);
        }
        this.videoPlayer = null;
        this.dispatchQueue.cancelRunnable(this.progressRunnable);
    }

    public void lambda$seekTo$11(long j) {
        kfc kfcVar = this.videoPlayer;
        if (kfcVar == null) {
            this.pendingSeekTo = j;
        } else {
            kfcVar.o0(j);
        }
    }

    public void lambda$seekTo$12(long j, boolean z, Runnable runnable) {
        kfc kfcVar = this.videoPlayer;
        if (kfcVar == null) {
            this.pendingSeekTo = j;
        } else {
            kfcVar.q0(j, z, runnable);
        }
    }

    public void lambda$setAudioEnabled$8(boolean z, boolean z2) {
        float f;
        kfc kfcVar = this.videoPlayer;
        if (kfcVar == null) {
            return;
        }
        boolean c0 = kfcVar.c0();
        if (z) {
            kfc kfcVar2 = this.videoPlayer;
            if (kfcVar2.c0) {
                kfcVar2.f0();
                long S = this.videoPlayer.S();
                this.videoPlayer.l0();
                this.videoPlayer = null;
                ensurePlayerCreated(this.audioDisabled);
                Uri uri = this.uri;
                if (uri == null) {
                    uri = this.contentUri;
                }
                cc4.b("videoplayerholderbase.setAudioEnabled(): repreparePlayer as audio track is enabled back uri=" + uri);
                this.videoPlayer.i0(uri, "other");
                this.videoPlayer.B0(this.dispatchQueue);
                if (!z2) {
                    Surface surface = this.surface;
                    if (surface != null) {
                        this.videoPlayer.x0(surface);
                    } else {
                        SurfaceView surfaceView = this.surfaceView;
                        kfc kfcVar3 = this.videoPlayer;
                        if (surfaceView != null) {
                            kfcVar3.y0(surfaceView);
                        } else {
                            kfcVar3.z0(this.textureView);
                        }
                    }
                }
                this.videoPlayer.o0(S + 50);
                if (c0 && !z2) {
                    this.videoPlayer.t0(true);
                    this.videoPlayer.g0();
                    return;
                }
                this.videoPlayer.t0(false);
                this.videoPlayer.f0();
                return;
            }
        }
        kfc kfcVar4 = this.videoPlayer;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        kfcVar4.A0(f);
    }

    public void lambda$setSpeed$5(float f) {
        kfc kfcVar = this.videoPlayer;
        if (kfcVar != null) {
            kfcVar.u0(f);
        }
    }

    public void lambda$setVolume$10(float f) {
        kfc kfcVar = this.videoPlayer;
        if (kfcVar != null) {
            kfcVar.A0(f);
        }
    }

    public void lambda$start$1() {
        this.initRunnable = null;
    }

    public void lambda$start$2(boolean z, float f, Uri uri, boolean z2, boolean z3, long j) {
        if (this.released) {
            cc4.b("videoplayerholderbase returned from start: released");
            return;
        }
        if (this.videoPlayer == null) {
            ensurePlayerCreated(z);
            this.videoPlayer.u0(f);
            cc4.b("videoplayerholderbase.start(): preparePlayer new player uri=" + uri);
            this.videoPlayer.i0(uri, "other");
            this.videoPlayer.B0(this.dispatchQueue);
            if (!z2) {
                Surface surface = this.surface;
                if (surface != null) {
                    this.videoPlayer.x0(surface);
                } else {
                    SurfaceView surfaceView = this.surfaceView;
                    kfc kfcVar = this.videoPlayer;
                    if (surfaceView != null) {
                        kfcVar.y0(surfaceView);
                    } else {
                        kfcVar.z0(this.textureView);
                    }
                }
                this.videoPlayer.t0(true);
            } else if (z3) {
                Surface surface2 = this.surface;
                if (surface2 != null) {
                    this.videoPlayer.x0(surface2);
                } else {
                    SurfaceView surfaceView2 = this.surfaceView;
                    kfc kfcVar2 = this.videoPlayer;
                    if (surfaceView2 != null) {
                        kfcVar2.y0(surfaceView2);
                    } else {
                        kfcVar2.z0(this.textureView);
                    }
                }
                this.videoPlayer.t0(false);
            }
        } else {
            cc4.b("videoplayerholderbase.start(): player already exist");
            if (!z2) {
                Surface surface3 = this.surface;
                if (surface3 != null) {
                    this.videoPlayer.x0(surface3);
                } else {
                    SurfaceView surfaceView3 = this.surfaceView;
                    kfc kfcVar3 = this.videoPlayer;
                    if (surfaceView3 != null) {
                        kfcVar3.y0(surfaceView3);
                    } else {
                        kfcVar3.z0(this.textureView);
                    }
                }
                this.videoPlayer.g0();
            } else if (z3) {
                Surface surface4 = this.surface;
                if (surface4 != null) {
                    this.videoPlayer.x0(surface4);
                } else {
                    SurfaceView surfaceView4 = this.surfaceView;
                    kfc kfcVar4 = this.videoPlayer;
                    if (surfaceView4 != null) {
                        kfcVar4.y0(surfaceView4);
                    } else {
                        kfcVar4.z0(this.textureView);
                    }
                }
                this.videoPlayer.t0(false);
            }
        }
        if (j > 0) {
            this.videoPlayer.o0(j);
        }
        hl.c3(new mfc(this, (byte) 1));
    }

    public void allowMultipleInstances(boolean z) {
        this.allowMultipleInstances = z;
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

    public float getPlaybackProgress(long j) {
        float f;
        if (this.lastState == 4) {
            this.progress = 1.0f;
        } else {
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            long j2 = this.currentPosition;
            if (i != 0) {
                f = ((float) j2) / ((float) j);
            } else {
                f = ((float) j2) / ((float) this.playerDuration);
            }
            this.progress = f;
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
        this.dispatchQueue.postRunnable(new mfc(this, (byte) 5));
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
        this.dispatchQueue.postRunnable(new mfc(this, (byte) 4));
    }

    public void play() {
        if (this.released || !this.paused) {
            return;
        }
        this.paused = false;
        this.dispatchQueue.postRunnable(new mfc(this, (byte) 3));
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
        uo3 uo3Var = this.dispatchQueue;
        Runnable runnable2 = new Runnable() {
            @Override
            public final void run() {
                VideoPlayerHolderBase.this.lambda$preparePlayer$0(z, f, uri);
            }
        };
        this.initRunnable = runnable2;
        uo3Var.postRunnable(runnable2);
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
                hl.y0(this.surfaceView, this.playerStubBitmap);
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
            ConcurrentHashMap concurrentHashMap = hd4.J;
            Integer num = (Integer) concurrentHashMap.get(Long.valueOf(document.id));
            if (num == null) {
                intValue = 3;
            } else {
                intValue = num.intValue();
            }
            if (intValue != 0) {
                concurrentHashMap.put(Long.valueOf(document.id), 0);
                xb4.G(this.currentAccount).h(0, document, null, null, null, null);
            }
        }
        this.released = true;
        this.dispatchQueue.cancelRunnable(this.initRunnable);
        this.dispatchQueue.cancelRunnable(this.progressRunnable);
        this.initRunnable = null;
        this.dispatchQueue.postRunnable(new b6c(this, document, runnable, (byte) 8));
        Bitmap bitmap = this.playerStubBitmap;
        if (bitmap != null) {
            hl.w2(bitmap);
            this.playerStubBitmap = null;
        }
        return true;
    }

    public float seek(float f, long j) {
        if (this.videoPlayer == null) {
            return this.currentSeek;
        }
        this.duration = j;
        float i = Utilities.i(this.currentSeek + f, 1.0f, 0.0f);
        this.currentSeek = i;
        this.currentSeekThread = i;
        this.dispatchQueue.cancelRunnable(this.updateSeek);
        this.dispatchQueue.postRunnable(this.updateSeek);
        return this.currentSeek;
    }

    public void seekTo(long j, boolean z, Runnable runnable) {
        this.dispatchQueue.postRunnable(new j61(this, j, z, runnable, (byte) 10));
    }

    public void setAudioEnabled(boolean z, boolean z2) {
        boolean z3 = !z;
        if (this.audioDisabled == z3) {
            return;
        }
        this.audioDisabled = z3;
        this.triesCount = 3;
        this.dispatchQueue.postRunnable(new mz3(this, z, z2, (byte) 2));
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

    public void setSeeking(boolean z) {
        if (z && !this.seeking) {
            this.firstSeek = true;
        }
        this.seeking = z;
        if (!z) {
            this.dispatchQueue.cancelRunnable(this.betterSeek);
        }
    }

    public void setSpeed(float f) {
        if (this.released) {
            return;
        }
        this.dispatchQueue.postRunnable(new nfc(this, f, (byte) 0));
    }

    public void setVolume(float f) {
        this.dispatchQueue.postRunnable(new nfc(this, f, (byte) 2));
    }

    public void start(final boolean z, final boolean z2, final Uri uri, final long j, final boolean z3, final float f) {
        this.startTime = System.currentTimeMillis();
        this.audioDisabled = z3;
        this.paused = z2;
        this.triesCount = 3;
        if (j > 0) {
            this.currentPosition = j;
        }
        uo3 uo3Var = this.dispatchQueue;
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                VideoPlayerHolderBase.this.lambda$start$2(z3, f, uri, z2, z, j);
            }
        };
        this.initRunnable = runnable;
        uo3Var.postRunnable(runnable);
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

    public void seekTo(long j) {
        this.dispatchQueue.postRunnable(new pqa(this, j, (byte) 8));
    }

    public void lambda$new$13() {
    }

    public void onRenderedFirstFrame() {
    }

    public void play(float f) {
        if (this.released || !this.paused) {
            return;
        }
        this.paused = false;
        this.dispatchQueue.postRunnable(new nfc(this, f, (byte) 1));
    }

    public class AnonymousClass2 implements ifc {
        public AnonymousClass2() {
            VideoPlayerHolderBase.this = r1;
        }

        public void lambda$onError$0(long j) {
            VideoPlayerHolderBase videoPlayerHolderBase;
            Uri uri;
            if (!VideoPlayerHolderBase.this.released && (uri = (videoPlayerHolderBase = VideoPlayerHolderBase.this).uri) != null) {
                videoPlayerHolderBase.videoPlayer.i0(uri, "other");
                VideoPlayerHolderBase.this.videoPlayer.o0(j);
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
        public void onError(kfc kfcVar, Exception exc) {
            cc4.g(exc, true);
            final long currentPosition = VideoPlayerHolderBase.this.getCurrentPosition();
            VideoPlayerHolderBase.this.triesCount--;
            if (VideoPlayerHolderBase.this.triesCount > 0) {
                VideoPlayerHolderBase videoPlayerHolderBase = VideoPlayerHolderBase.this;
                uo3 uo3Var = videoPlayerHolderBase.dispatchQueue;
                Runnable runnable = new Runnable() {
                    @Override
                    public final void run() {
                        VideoPlayerHolderBase.AnonymousClass2.this.lambda$onError$0(currentPosition);
                    }
                };
                videoPlayerHolderBase.initRunnable = runnable;
                uo3Var.postRunnable(runnable);
                return;
            }
            hl.c3(new b(this, (byte) 1));
        }

        @Override
        public void onRenderedFirstFrame() {
            long j;
            b bVar = new b(this, (byte) 0);
            if (VideoPlayerHolderBase.this.surface != null) {
                j = 0;
            } else if (VideoPlayerHolderBase.this.surfaceView == null) {
                j = 16;
            } else {
                j = 32;
            }
            hl.d3(bVar, j);
        }

        @Override
        public void onStateChanged(boolean z, int i) {
            VideoPlayerHolderBase videoPlayerHolderBase = VideoPlayerHolderBase.this;
            videoPlayerHolderBase.lastState = i;
            videoPlayerHolderBase.currentPosition = videoPlayerHolderBase.videoPlayer.S();
            VideoPlayerHolderBase videoPlayerHolderBase2 = VideoPlayerHolderBase.this;
            videoPlayerHolderBase2.playerDuration = videoPlayerHolderBase2.videoPlayer.U();
            if (i != 3 && i != 2) {
                if (i == 4) {
                    boolean needRepeat = VideoPlayerHolderBase.this.needRepeat();
                    VideoPlayerHolderBase videoPlayerHolderBase3 = VideoPlayerHolderBase.this;
                    if (needRepeat) {
                        videoPlayerHolderBase3.progress = 0.0f;
                        videoPlayerHolderBase3.videoPlayer.o0(0L);
                        VideoPlayerHolderBase.this.videoPlayer.g0();
                    } else {
                        videoPlayerHolderBase3.progress = 1.0f;
                    }
                }
            } else {
                VideoPlayerHolderBase videoPlayerHolderBase4 = VideoPlayerHolderBase.this;
                videoPlayerHolderBase4.dispatchQueue.cancelRunnable(videoPlayerHolderBase4.progressRunnable);
                VideoPlayerHolderBase videoPlayerHolderBase5 = VideoPlayerHolderBase.this;
                videoPlayerHolderBase5.dispatchQueue.postRunnable(videoPlayerHolderBase5.progressRunnable);
            }
            VideoPlayerHolderBase.this.onStateChanged(z, i);
        }

        @Override
        public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
            return false;
        }

        @Override
        public void onVideoSizeChanged(int i, int i2, int i3, float f) {
            VideoPlayerHolderBase.this.onVideoSizeChanged(i, i2, i3, f);
        }

        @Override
        public void onSeekFinished(uj ujVar) {
        }

        @Override
        public void onSeekStarted(uj ujVar) {
        }

        @Override
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override
        public void onRenderedFirstFrame(uj ujVar) {
        }
    }

    public void onStateChanged(boolean z, int i) {
    }

    public void onVideoSizeChanged(int i, int i2, int i3, float f) {
    }
}
