package ki;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import ei.l3;
import gg.x1;
import java.util.concurrent.CountDownLatch;
public final class m {
    public boolean B;
    public boolean C;
    public boolean D;
    public int E;
    public long F;
    public long G;
    public int H;
    public long I;
    public long J;
    public long K;
    public long L;
    public int M;
    public int N;
    public long O;
    public int P;
    public long Q;
    public long R;
    public long S;
    public volatile boolean T;
    public volatile a V;
    public boolean W;
    public volatile RuntimeException X;
    public Size f13755a;
    public final Surface f13756b;
    public final int f13757c;
    public final j d;
    public int e;
    public final i f13759g;
    public final b h;
    public HandlerThread f13760i;
    public Handler f13761j;
    public SurfaceTexture f13762k;
    public Surface f13763l;
    public int f13767p;
    public int f13768q;
    public int f13769r;
    public v f13772u;
    public int v;
    public int f13773w;
    public long f13774x;
    public long f13776z;
    public EGLDisplay f13764m = EGL14.EGL_NO_DISPLAY;
    public EGLContext f13765n = EGL14.EGL_NO_CONTEXT;
    public EGLSurface f13766o = EGL14.EGL_NO_SURFACE;
    public final int[] f13770s = new int[1];
    public final float[] f13771t = new float[16];
    public long f13775y = -1;
    public long A = -1;
    public final k Y = new k(this, 0);
    public volatile long f13758f = 0;
    public volatile boolean U = false;

    public m(Size size, Surface surface, int i10, int i11, j jVar, i iVar, b bVar) {
        this.f13755a = size;
        this.f13756b = surface;
        this.f13757c = i10;
        this.e = i11;
        this.d = jVar;
        this.f13768q = i10;
        this.f13769r = i10;
        this.f13759g = iVar;
        this.h = bVar;
    }

    public static void a(String str, boolean z10) {
        if (z10) {
            return;
        }
        StringBuilder j3 = t8.b.j(str, ": 0x");
        j3.append(Integer.toHexString(EGL14.eglGetError()));
        throw new IllegalStateException(j3.toString());
    }

    public static float f(float f7) {
        float max = Math.max(0.0f, Math.min(1.0f, f7));
        return (3.0f - (max * 2.0f)) * max * max;
    }

    public final long b() {
        long max;
        if (this.f13758f == 0) {
            max = this.A + 33333333;
        } else {
            max = Math.max(0L, System.nanoTime() - this.f13758f);
        }
        return Math.max(max, this.A + 1);
    }

    public final void c() {
        boolean z10;
        boolean z11;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f13764m = eglGetDisplay;
        if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr2 = new int[1];
                if (EGL14.eglChooseConfig(this.f13764m, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] != 0) {
                    EGLContext eglCreateContext = EGL14.eglCreateContext(this.f13764m, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                    this.f13765n = eglCreateContext;
                    if (eglCreateContext != EGL14.EGL_NO_CONTEXT) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    a("Unable to create EGL context", z10);
                    EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.f13764m, eGLConfigArr[0], this.f13756b, new int[]{12344}, 0);
                    this.f13766o = eglCreateWindowSurface;
                    if (eglCreateWindowSurface != EGL14.EGL_NO_SURFACE) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    a("Unable to create EGL surface", z11);
                    EGLDisplay eGLDisplay = this.f13764m;
                    EGLSurface eGLSurface = this.f13766o;
                    if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f13765n)) {
                        this.d.b("GL initialized: egl=" + iArr[0] + "." + iArr[1] + ", vendor=" + GLES20.glGetString(7936) + ", renderer=" + GLES20.glGetString(7937) + ", version=" + GLES20.glGetString(7938) + ", elapsedMs=" + ((System.nanoTime() - this.S) / 1000000));
                        int[] iArr3 = new int[1];
                        GLES20.glGenTextures(1, iArr3, 0);
                        int i10 = iArr3[0];
                        this.f13767p = i10;
                        GLES20.glBindTexture(36197, i10);
                        e();
                        GLES20.glTexParameteri(36197, 10242, 33071);
                        GLES20.glTexParameteri(36197, 10243, 33071);
                        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f13767p);
                        this.f13762k = surfaceTexture;
                        surfaceTexture.setDefaultBufferSize(this.f13755a.getWidth(), this.f13755a.getHeight());
                        this.f13762k.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() {
                            @Override
                            public final void onFrameAvailable(android.graphics.SurfaceTexture r23) {
                                throw new UnsupportedOperationException("Method not decompiled: ki.l.onFrameAvailable(android.graphics.SurfaceTexture):void");
                            }
                        }, this.f13761j);
                        this.f13763l = new Surface(this.f13762k);
                        Size size = this.f13755a;
                        int i11 = this.e;
                        int i12 = this.f13757c;
                        this.f13772u = new v(i12, size, i11);
                        GLES20.glViewport(0, 0, i12, i12);
                        return;
                    }
                    throw new IllegalStateException("Unable to make EGL context current: 0x" + Integer.toHexString(EGL14.eglGetError()));
                }
                throw new IllegalStateException("Unable to choose EGL config");
            }
            throw new IllegalStateException("Unable to initialize EGL");
        }
        throw new IllegalStateException("Unable to get EGL display");
    }

    public final void d() {
        long nanoTime;
        String valueOf;
        String valueOf2;
        Float valueOf3;
        EGLSurface eGLSurface;
        EGLContext eGLContext;
        if (this.S == 0) {
            nanoTime = 0;
        } else {
            nanoTime = System.nanoTime() - this.S;
        }
        StringBuilder sb2 = new StringBuilder("GL summary: inputFrames=");
        sb2.append(this.K);
        sb2.append(", inputFps=");
        long j3 = this.K;
        Object obj = "n/a";
        int i10 = (nanoTime > 0L ? 1 : (nanoTime == 0L ? 0 : -1));
        if (i10 <= 0) {
            valueOf = "n/a";
        } else {
            valueOf = String.valueOf((j3 * 1.0E9d) / nanoTime);
        }
        sb2.append(valueOf);
        sb2.append(", submittedFrames=");
        sb2.append(this.L);
        sb2.append(", submittedFps=");
        long j10 = this.L;
        if (i10 <= 0) {
            valueOf2 = "n/a";
        } else {
            valueOf2 = String.valueOf((j10 * 1.0E9d) / nanoTime);
        }
        sb2.append(valueOf2);
        sb2.append(", syntheticFrames=");
        sb2.append(this.M);
        sb2.append(", largeFrameGaps=");
        sb2.append(this.N);
        sb2.append(", maxFrameGapMs=");
        sb2.append(((float) this.O) / 1000000.0f);
        sb2.append(", gpuSamples=");
        sb2.append(this.P);
        sb2.append(", gpuAverageMs=");
        int i11 = this.P;
        if (i11 == 0) {
            valueOf3 = "n/a";
        } else {
            valueOf3 = Float.valueOf((((float) this.Q) / i11) / 1000000.0f);
        }
        sb2.append(valueOf3);
        sb2.append(", gpuMaxMs=");
        sb2.append(((float) this.R) / 1000000.0f);
        sb2.append(", swapAverageMs=");
        int i12 = this.H;
        if (i12 != 0) {
            obj = Float.valueOf((((float) this.I) / i12) / 1000000.0f);
        }
        sb2.append(obj);
        sb2.append(", swapMaxMs=");
        sb2.append(((float) this.J) / 1000000.0f);
        this.d.b(sb2.toString());
        Handler handler = this.f13761j;
        if (handler != null) {
            handler.removeCallbacks(this.Y);
        }
        EGLDisplay eGLDisplay = this.f13764m;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY && (eGLSurface = this.f13766o) != EGL14.EGL_NO_SURFACE && (eGLContext = this.f13765n) != EGL14.EGL_NO_CONTEXT) {
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
        }
        SurfaceTexture surfaceTexture = this.f13762k;
        if (surfaceTexture != null) {
            surfaceTexture.setOnFrameAvailableListener(null);
        }
        Surface surface = this.f13763l;
        if (surface != null) {
            surface.release();
            this.f13763l = null;
        }
        SurfaceTexture surfaceTexture2 = this.f13762k;
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
            this.f13762k = null;
        }
        v vVar = this.f13772u;
        if (vVar != null) {
            vVar.d.a();
            vVar.e.a();
            vVar.f13802f.a();
            vVar.f13803g.a();
            vVar.h.a();
            vVar.f13804i.a();
            int[] iArr = vVar.f13810o;
            GLES20.glDeleteTextures(iArr.length, iArr, 0);
            int[] iArr2 = vVar.f13809n;
            GLES20.glDeleteFramebuffers(iArr2.length, iArr2, 0);
            this.f13772u = null;
        }
        int i13 = this.f13767p;
        if (i13 != 0) {
            GLES20.glDeleteTextures(1, new int[]{i13}, 0);
            this.f13767p = 0;
        }
        EGLDisplay eGLDisplay2 = this.f13764m;
        if (eGLDisplay2 != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT);
            EGLSurface eGLSurface3 = this.f13766o;
            if (eGLSurface3 != EGL14.EGL_NO_SURFACE) {
                EGL14.eglDestroySurface(this.f13764m, eGLSurface3);
            }
            EGLContext eGLContext2 = this.f13765n;
            if (eGLContext2 != EGL14.EGL_NO_CONTEXT) {
                EGL14.eglDestroyContext(this.f13764m, eGLContext2);
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f13764m);
        }
        this.f13764m = EGL14.EGL_NO_DISPLAY;
        this.f13765n = EGL14.EGL_NO_CONTEXT;
        this.f13766o = EGL14.EGL_NO_SURFACE;
    }

    public final void e() {
        int i10;
        GLES20.glBindTexture(36197, this.f13767p);
        if (this.e == this.f13757c) {
            i10 = 9728;
        } else {
            i10 = 9729;
        }
        GLES20.glTexParameteri(36197, 10241, i10);
        GLES20.glTexParameteri(36197, 10240, i10);
    }

    public final Surface g() {
        String str;
        if (this.T) {
            return this.f13763l;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        HandlerThread handlerThread = new HandlerThread("RoundVideoGlProcessor");
        this.f13760i = handlerThread;
        handlerThread.start();
        this.S = System.nanoTime();
        j jVar = this.d;
        StringBuilder sb2 = new StringBuilder("GL processor start requested: input=");
        sb2.append(this.f13755a);
        sb2.append(", crop=");
        sb2.append(this.e);
        sb2.append(", output=");
        sb2.append(this.f13757c);
        sb2.append("x");
        sb2.append(this.f13757c);
        sb2.append(", filter=");
        if (this.e == this.f13757c) {
            str = "NEAREST";
        } else {
            str = "LINEAR";
        }
        sb2.append(str);
        jVar.b(sb2.toString());
        Handler handler = new Handler(this.f13760i.getLooper());
        this.f13761j = handler;
        handler.post(new x1(28, this, countDownLatch));
        try {
            countDownLatch.await();
            if (this.X == null) {
                return this.f13763l;
            }
            RuntimeException runtimeException = this.X;
            this.X = null;
            h();
            throw runtimeException;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            h();
            throw new IllegalStateException("GL initialization was interrupted", e);
        }
    }

    public final void h() {
        Handler handler = this.f13761j;
        HandlerThread handlerThread = this.f13760i;
        if (handler != null) {
            handler.removeCallbacks(this.Y);
        }
        this.f13761j = null;
        this.f13760i = null;
        this.T = false;
        if (handler != null && handlerThread != null) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            handler.post(new gg.t(this, handlerThread, countDownLatch, 22));
            try {
                countDownLatch.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public final void i(long j3) {
        this.A = j3;
        EGLExt.eglPresentationTimeANDROID(this.f13764m, this.f13766o, j3);
        long nanoTime = System.nanoTime();
        if (EGL14.eglSwapBuffers(this.f13764m, this.f13766o)) {
            long nanoTime2 = System.nanoTime();
            this.L++;
            long j10 = nanoTime2 - nanoTime;
            this.H++;
            this.I += j10;
            this.J = Math.max(this.J, j10);
            if (this.H % 30 == 0) {
                this.d.b("encoder swap: average=" + ((((float) this.I) / this.H) / 1000000.0f) + " ms, max=" + (((float) this.J) / 1000000.0f) + " ms");
            }
            i iVar = this.f13759g;
            if (iVar != null) {
                long j11 = iVar.f13740q;
                int i10 = (int) (j11 % 256);
                iVar.h[i10] = j3 / 1000;
                iVar.f13732i[i10] = nanoTime2;
                iVar.f13740q = j11 + 1;
                return;
            }
            return;
        }
        throw new IllegalStateException("Unable to swap EGL buffers: 0x" + Integer.toHexString(EGL14.eglGetError()));
    }

    public final void j(Size size, int i10) {
        Handler handler = this.f13761j;
        if (this.T && handler != null) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            RuntimeException[] runtimeExceptionArr = new RuntimeException[1];
            handler.post(new l3(this, size, i10, runtimeExceptionArr, countDownLatch, 5));
            try {
                countDownLatch.await();
                RuntimeException runtimeException = runtimeExceptionArr[0];
                if (runtimeException != null) {
                    throw runtimeException;
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException("Input size update was interrupted", e);
            }
        }
    }

    public final void k() {
        EGLDisplay eGLDisplay = this.f13764m;
        EGLSurface eGLSurface = this.f13766o;
        int[] iArr = this.f13770s;
        if (EGL14.eglQuerySurface(eGLDisplay, eGLSurface, 12375, iArr, 0)) {
            int i10 = iArr[0];
            if (EGL14.eglQuerySurface(this.f13764m, this.f13766o, 12374, iArr, 0)) {
                int i11 = iArr[0];
                if (i10 > 0 && i11 > 0) {
                    if (i10 != this.f13768q || i11 != this.f13769r) {
                        this.f13768q = i10;
                        this.f13769r = i11;
                        this.d.b("EGL output size changed: " + i10 + "x" + i11);
                    }
                }
            }
        }
    }
}
