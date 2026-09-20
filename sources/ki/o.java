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
public final class o {
    public long A;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public long G;
    public long H;
    public int I;
    public long J;
    public long K;
    public long L;
    public long M;
    public int N;
    public int O;
    public long P;
    public int Q;
    public long R;
    public long S;
    public long T;
    public volatile boolean U;
    public volatile b W;
    public boolean X;
    public volatile RuntimeException Y;
    public Size f13778a;
    public final Surface f13779b;
    public final int f13780c;
    public final boolean d;
    public final k e;
    public int f13781f;
    public final j h;
    public final a f13783i;
    public HandlerThread f13784j;
    public Handler f13785k;
    public SurfaceTexture f13786l;
    public Surface f13787m;
    public int f13791q;
    public int f13792r;
    public int f13793s;
    public x v;
    public int f13796w;
    public int f13797x;
    public long f13798y;
    public EGLDisplay f13788n = EGL14.EGL_NO_DISPLAY;
    public EGLContext f13789o = EGL14.EGL_NO_CONTEXT;
    public EGLSurface f13790p = EGL14.EGL_NO_SURFACE;
    public final int[] f13794t = new int[1];
    public final float[] f13795u = new float[16];
    public long f13799z = -1;
    public long B = -1;
    public final m Z = new m(this, 0);
    public volatile long f13782g = 0;
    public volatile boolean V = false;

    public o(Size size, Surface surface, int i10, int i11, boolean z10, k kVar, j jVar, a aVar) {
        this.f13778a = size;
        this.f13779b = surface;
        this.f13780c = i10;
        this.f13781f = i11;
        this.d = z10;
        this.e = kVar;
        this.f13792r = i10;
        this.f13793s = i10;
        this.h = jVar;
        this.f13783i = aVar;
    }

    public static void a(String str, boolean z10) {
        if (z10) {
            return;
        }
        StringBuilder h = v7.j0.h(str, ": 0x");
        h.append(Integer.toHexString(EGL14.eglGetError()));
        throw new IllegalStateException(h.toString());
    }

    public static float f(float f7) {
        float max = Math.max(0.0f, Math.min(1.0f, f7));
        return (3.0f - (max * 2.0f)) * max * max;
    }

    public final long b() {
        long max;
        if (this.f13782g == 0) {
            max = this.B + 33333333;
        } else {
            max = Math.max(0L, System.nanoTime() - this.f13782g);
        }
        return Math.max(max, this.B + 1);
    }

    public final void c() {
        boolean z10;
        boolean z11;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f13788n = eglGetDisplay;
        if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr2 = new int[1];
                if (EGL14.eglChooseConfig(this.f13788n, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] != 0) {
                    EGLContext eglCreateContext = EGL14.eglCreateContext(this.f13788n, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                    this.f13789o = eglCreateContext;
                    if (eglCreateContext != EGL14.EGL_NO_CONTEXT) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    a("Unable to create EGL context", z10);
                    EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.f13788n, eGLConfigArr[0], this.f13779b, new int[]{12344}, 0);
                    this.f13790p = eglCreateWindowSurface;
                    if (eglCreateWindowSurface != EGL14.EGL_NO_SURFACE) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    a("Unable to create EGL surface", z11);
                    EGLDisplay eGLDisplay = this.f13788n;
                    EGLSurface eGLSurface = this.f13790p;
                    if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f13789o)) {
                        this.e.b("GL initialized: egl=" + iArr[0] + "." + iArr[1] + ", vendor=" + GLES20.glGetString(7936) + ", renderer=" + GLES20.glGetString(7937) + ", version=" + GLES20.glGetString(7938) + ", elapsedMs=" + ((System.nanoTime() - this.T) / 1000000));
                        int[] iArr3 = new int[1];
                        GLES20.glGenTextures(1, iArr3, 0);
                        int i10 = iArr3[0];
                        this.f13791q = i10;
                        GLES20.glBindTexture(36197, i10);
                        e();
                        GLES20.glTexParameteri(36197, 10242, 33071);
                        GLES20.glTexParameteri(36197, 10243, 33071);
                        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f13791q);
                        this.f13786l = surfaceTexture;
                        surfaceTexture.setDefaultBufferSize(this.f13778a.getWidth(), this.f13778a.getHeight());
                        this.f13786l.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() {
                            @Override
                            public final void onFrameAvailable(android.graphics.SurfaceTexture r23) {
                                throw new UnsupportedOperationException("Method not decompiled: ki.n.onFrameAvailable(android.graphics.SurfaceTexture):void");
                            }
                        }, this.f13785k);
                        this.f13787m = new Surface(this.f13786l);
                        Size size = this.f13778a;
                        int i11 = this.f13781f;
                        boolean z12 = this.d;
                        int i12 = this.f13780c;
                        this.v = new x(i12, size, i11, z12);
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
        if (this.T == 0) {
            nanoTime = 0;
        } else {
            nanoTime = System.nanoTime() - this.T;
        }
        StringBuilder sb2 = new StringBuilder("GL summary: inputFrames=");
        sb2.append(this.L);
        sb2.append(", inputFps=");
        long j3 = this.L;
        Object obj = "n/a";
        int i10 = (nanoTime > 0L ? 1 : (nanoTime == 0L ? 0 : -1));
        if (i10 <= 0) {
            valueOf = "n/a";
        } else {
            valueOf = String.valueOf((j3 * 1.0E9d) / nanoTime);
        }
        sb2.append(valueOf);
        sb2.append(", submittedFrames=");
        sb2.append(this.M);
        sb2.append(", submittedFps=");
        long j10 = this.M;
        if (i10 <= 0) {
            valueOf2 = "n/a";
        } else {
            valueOf2 = String.valueOf((j10 * 1.0E9d) / nanoTime);
        }
        sb2.append(valueOf2);
        sb2.append(", syntheticFrames=");
        sb2.append(this.N);
        sb2.append(", largeFrameGaps=");
        sb2.append(this.O);
        sb2.append(", maxFrameGapMs=");
        sb2.append(((float) this.P) / 1000000.0f);
        sb2.append(", gpuSamples=");
        sb2.append(this.Q);
        sb2.append(", gpuAverageMs=");
        int i11 = this.Q;
        if (i11 == 0) {
            valueOf3 = "n/a";
        } else {
            valueOf3 = Float.valueOf((((float) this.R) / i11) / 1000000.0f);
        }
        sb2.append(valueOf3);
        sb2.append(", gpuMaxMs=");
        sb2.append(((float) this.S) / 1000000.0f);
        sb2.append(", swapAverageMs=");
        int i12 = this.I;
        if (i12 != 0) {
            obj = Float.valueOf((((float) this.J) / i12) / 1000000.0f);
        }
        sb2.append(obj);
        sb2.append(", swapMaxMs=");
        sb2.append(((float) this.K) / 1000000.0f);
        this.e.b(sb2.toString());
        Handler handler = this.f13785k;
        if (handler != null) {
            handler.removeCallbacks(this.Z);
        }
        EGLDisplay eGLDisplay = this.f13788n;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY && (eGLSurface = this.f13790p) != EGL14.EGL_NO_SURFACE && (eGLContext = this.f13789o) != EGL14.EGL_NO_CONTEXT) {
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
        }
        SurfaceTexture surfaceTexture = this.f13786l;
        if (surfaceTexture != null) {
            surfaceTexture.setOnFrameAvailableListener(null);
        }
        Surface surface = this.f13787m;
        if (surface != null) {
            surface.release();
            this.f13787m = null;
        }
        SurfaceTexture surfaceTexture2 = this.f13786l;
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
            this.f13786l = null;
        }
        x xVar = this.v;
        if (xVar != null) {
            xVar.e.a();
            xVar.f13847f.a();
            xVar.f13848g.a();
            xVar.h.a();
            xVar.f13849i.a();
            u uVar = xVar.f13850j;
            if (uVar != null) {
                uVar.a();
            }
            int[] iArr = xVar.f13856p;
            GLES20.glDeleteTextures(iArr.length, iArr, 0);
            int[] iArr2 = xVar.f13855o;
            GLES20.glDeleteFramebuffers(iArr2.length, iArr2, 0);
            this.v = null;
        }
        int i13 = this.f13791q;
        if (i13 != 0) {
            GLES20.glDeleteTextures(1, new int[]{i13}, 0);
            this.f13791q = 0;
        }
        EGLDisplay eGLDisplay2 = this.f13788n;
        if (eGLDisplay2 != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT);
            EGLSurface eGLSurface3 = this.f13790p;
            if (eGLSurface3 != EGL14.EGL_NO_SURFACE) {
                EGL14.eglDestroySurface(this.f13788n, eGLSurface3);
            }
            EGLContext eGLContext2 = this.f13789o;
            if (eGLContext2 != EGL14.EGL_NO_CONTEXT) {
                EGL14.eglDestroyContext(this.f13788n, eGLContext2);
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f13788n);
        }
        this.f13788n = EGL14.EGL_NO_DISPLAY;
        this.f13789o = EGL14.EGL_NO_CONTEXT;
        this.f13790p = EGL14.EGL_NO_SURFACE;
    }

    public final void e() {
        int i10;
        GLES20.glBindTexture(36197, this.f13791q);
        if (this.f13781f == this.f13780c) {
            i10 = 9728;
        } else {
            i10 = 9729;
        }
        GLES20.glTexParameteri(36197, 10241, i10);
        GLES20.glTexParameteri(36197, 10240, i10);
    }

    public final Surface g() {
        String str;
        if (this.U) {
            return this.f13787m;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        HandlerThread handlerThread = new HandlerThread("RoundVideoGlProcessor");
        this.f13784j = handlerThread;
        handlerThread.start();
        this.T = System.nanoTime();
        k kVar = this.e;
        StringBuilder sb2 = new StringBuilder("GL processor start requested: input=");
        sb2.append(this.f13778a);
        sb2.append(", crop=");
        sb2.append(this.f13781f);
        sb2.append(", output=");
        sb2.append(this.f13780c);
        sb2.append("x");
        sb2.append(this.f13780c);
        sb2.append(", filter=");
        if (this.f13781f == this.f13780c) {
            str = "NEAREST";
        } else {
            str = "LINEAR";
        }
        sb2.append(str);
        sb2.append(", composition=");
        sb2.append(this.d);
        kVar.b(sb2.toString());
        Handler handler = new Handler(this.f13784j.getLooper());
        this.f13785k = handler;
        handler.post(new x1(29, this, countDownLatch));
        try {
            countDownLatch.await();
            if (this.Y == null) {
                return this.f13787m;
            }
            RuntimeException runtimeException = this.Y;
            this.Y = null;
            h();
            throw runtimeException;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            h();
            throw new IllegalStateException("GL initialization was interrupted", e);
        }
    }

    public final void h() {
        Handler handler = this.f13785k;
        HandlerThread handlerThread = this.f13784j;
        if (handler != null) {
            handler.removeCallbacks(this.Z);
        }
        this.f13785k = null;
        this.f13784j = null;
        this.U = false;
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
        this.B = j3;
        EGLExt.eglPresentationTimeANDROID(this.f13788n, this.f13790p, j3);
        long nanoTime = System.nanoTime();
        if (EGL14.eglSwapBuffers(this.f13788n, this.f13790p)) {
            long nanoTime2 = System.nanoTime();
            this.M++;
            long j10 = nanoTime2 - nanoTime;
            this.I++;
            this.J += j10;
            this.K = Math.max(this.K, j10);
            if (this.I % 30 == 0) {
                this.e.b("encoder swap: average=" + ((((float) this.J) / this.I) / 1000000.0f) + " ms, max=" + (((float) this.K) / 1000000.0f) + " ms");
            }
            j jVar = this.h;
            if (jVar != null) {
                long j11 = jVar.f13748r;
                int i10 = (int) (j11 % 256);
                jVar.f13739i[i10] = j3 / 1000;
                jVar.f13740j[i10] = nanoTime2;
                jVar.f13748r = j11 + 1;
                return;
            }
            return;
        }
        throw new IllegalStateException("Unable to swap EGL buffers: 0x" + Integer.toHexString(EGL14.eglGetError()));
    }

    public final void j(Size size, int i10) {
        Handler handler = this.f13785k;
        if (this.U && handler != null) {
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
        EGLDisplay eGLDisplay = this.f13788n;
        EGLSurface eGLSurface = this.f13790p;
        int[] iArr = this.f13794t;
        if (EGL14.eglQuerySurface(eGLDisplay, eGLSurface, 12375, iArr, 0)) {
            int i10 = iArr[0];
            if (EGL14.eglQuerySurface(this.f13788n, this.f13790p, 12374, iArr, 0)) {
                int i11 = iArr[0];
                if (i10 > 0 && i11 > 0) {
                    if (i10 != this.f13792r || i11 != this.f13793s) {
                        this.f13792r = i10;
                        this.f13793s = i11;
                        this.e.b("EGL output size changed: " + i10 + "x" + i11);
                    }
                }
            }
        }
    }
}
