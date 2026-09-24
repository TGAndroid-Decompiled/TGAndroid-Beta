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
import android.os.SystemClock;
import android.util.Size;
import android.view.Surface;
import ii.s2;
import java.util.concurrent.CountDownLatch;
public final class q {
    public long B;
    public boolean D;
    public boolean E;
    public boolean F;
    public int G;
    public long H;
    public long I;
    public int J;
    public long K;
    public long L;
    public long M;
    public long N;
    public int O;
    public int P;
    public long Q;
    public int R;
    public long S;
    public long T;
    public long U;
    public volatile boolean V;
    public volatile b X;
    public boolean Y;
    public volatile RuntimeException Z;
    public Size f13802a;
    public final Surface f13804b;
    public final int f13805c;
    public final boolean d;
    public final l e;
    public int f13806f;
    public boolean f13807g;
    public final p f13808i;
    public final a f13809j;
    public HandlerThread f13810k;
    public Handler f13811l;
    public SurfaceTexture f13812m;
    public Surface f13813n;
    public int f13817r;
    public int f13818s;
    public int f13819t;
    public a0 f13821w;
    public int f13822x;
    public int f13823y;
    public long f13824z;
    public EGLDisplay f13814o = EGL14.EGL_NO_DISPLAY;
    public EGLContext f13815p = EGL14.EGL_NO_CONTEXT;
    public EGLSurface f13816q = EGL14.EGL_NO_SURFACE;
    public final int[] f13820u = new int[1];
    public final float[] v = new float[16];
    public long A = -1;
    public long C = -1;
    public final m f13803a0 = new m(this, 0);
    public volatile long h = 0;
    public volatile boolean W = false;

    public q(Size size, Surface surface, int i10, int i11, boolean z10, boolean z11, l lVar, p pVar, a aVar) {
        this.f13802a = size;
        this.f13804b = surface;
        this.f13805c = i10;
        this.f13806f = i11;
        this.f13807g = z10;
        this.d = z11;
        this.e = lVar;
        this.f13818s = i10;
        this.f13819t = i10;
        this.f13808i = pVar;
        this.f13809j = aVar;
    }

    public static void a(String str, boolean z10) {
        if (z10) {
            return;
        }
        StringBuilder h = v7.j.h(str, ": 0x");
        h.append(Integer.toHexString(EGL14.eglGetError()));
        throw new IllegalStateException(h.toString());
    }

    public static float f(float f7) {
        float max = Math.max(0.0f, Math.min(1.0f, f7));
        return (3.0f - (max * 2.0f)) * max * max;
    }

    public final long b() {
        long max;
        if (this.h == 0) {
            max = this.C + 33333333;
        } else {
            max = Math.max(0L, SystemClock.elapsedRealtimeNanos() - this.h);
        }
        return Math.max(max, this.C + 1);
    }

    public final void c() {
        boolean z10;
        boolean z11;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f13814o = eglGetDisplay;
        if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr2 = new int[1];
                if (EGL14.eglChooseConfig(this.f13814o, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] != 0) {
                    EGLContext eglCreateContext = EGL14.eglCreateContext(this.f13814o, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                    this.f13815p = eglCreateContext;
                    if (eglCreateContext != EGL14.EGL_NO_CONTEXT) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    a("Unable to create EGL context", z10);
                    EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.f13814o, eGLConfigArr[0], this.f13804b, new int[]{12344}, 0);
                    this.f13816q = eglCreateWindowSurface;
                    if (eglCreateWindowSurface != EGL14.EGL_NO_SURFACE) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    a("Unable to create EGL surface", z11);
                    EGLDisplay eGLDisplay = this.f13814o;
                    EGLSurface eGLSurface = this.f13816q;
                    if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f13815p)) {
                        this.e.b("GL initialized: egl=" + iArr[0] + "." + iArr[1] + ", vendor=" + GLES20.glGetString(7936) + ", renderer=" + GLES20.glGetString(7937) + ", version=" + GLES20.glGetString(7938) + ", elapsedMs=" + ((System.nanoTime() - this.U) / 1000000));
                        int[] iArr3 = new int[1];
                        GLES20.glGenTextures(1, iArr3, 0);
                        int i10 = iArr3[0];
                        this.f13817r = i10;
                        GLES20.glBindTexture(36197, i10);
                        e();
                        GLES20.glTexParameteri(36197, 10242, 33071);
                        GLES20.glTexParameteri(36197, 10243, 33071);
                        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f13817r);
                        this.f13812m = surfaceTexture;
                        surfaceTexture.setDefaultBufferSize(this.f13802a.getWidth(), this.f13802a.getHeight());
                        this.f13812m.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() {
                            @Override
                            public final void onFrameAvailable(android.graphics.SurfaceTexture r23) {
                                throw new UnsupportedOperationException("Method not decompiled: ki.o.onFrameAvailable(android.graphics.SurfaceTexture):void");
                            }
                        }, this.f13811l);
                        this.f13813n = new Surface(this.f13812m);
                        Size size = this.f13802a;
                        int i11 = this.f13806f;
                        boolean z12 = this.d;
                        int i12 = this.f13805c;
                        this.f13821w = new a0(i12, size, i11, z12);
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
        if (this.U == 0) {
            nanoTime = 0;
        } else {
            nanoTime = System.nanoTime() - this.U;
        }
        StringBuilder sb2 = new StringBuilder("GL summary: inputFrames=");
        sb2.append(this.M);
        sb2.append(", inputFps=");
        long j3 = this.M;
        Object obj = "n/a";
        int i10 = (nanoTime > 0L ? 1 : (nanoTime == 0L ? 0 : -1));
        if (i10 <= 0) {
            valueOf = "n/a";
        } else {
            valueOf = String.valueOf((j3 * 1.0E9d) / nanoTime);
        }
        sb2.append(valueOf);
        sb2.append(", submittedFrames=");
        sb2.append(this.N);
        sb2.append(", submittedFps=");
        long j10 = this.N;
        if (i10 <= 0) {
            valueOf2 = "n/a";
        } else {
            valueOf2 = String.valueOf((j10 * 1.0E9d) / nanoTime);
        }
        sb2.append(valueOf2);
        sb2.append(", syntheticFrames=");
        sb2.append(this.O);
        sb2.append(", largeFrameGaps=");
        sb2.append(this.P);
        sb2.append(", maxFrameGapMs=");
        sb2.append(((float) this.Q) / 1000000.0f);
        sb2.append(", gpuSamples=");
        sb2.append(this.R);
        sb2.append(", gpuAverageMs=");
        int i11 = this.R;
        if (i11 == 0) {
            valueOf3 = "n/a";
        } else {
            valueOf3 = Float.valueOf((((float) this.S) / i11) / 1000000.0f);
        }
        sb2.append(valueOf3);
        sb2.append(", gpuMaxMs=");
        sb2.append(((float) this.T) / 1000000.0f);
        sb2.append(", swapAverageMs=");
        int i12 = this.J;
        if (i12 != 0) {
            obj = Float.valueOf((((float) this.K) / i12) / 1000000.0f);
        }
        sb2.append(obj);
        sb2.append(", swapMaxMs=");
        sb2.append(((float) this.L) / 1000000.0f);
        this.e.b(sb2.toString());
        Handler handler = this.f13811l;
        if (handler != null) {
            handler.removeCallbacks(this.f13803a0);
        }
        EGLDisplay eGLDisplay = this.f13814o;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY && (eGLSurface = this.f13816q) != EGL14.EGL_NO_SURFACE && (eGLContext = this.f13815p) != EGL14.EGL_NO_CONTEXT) {
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
        }
        SurfaceTexture surfaceTexture = this.f13812m;
        if (surfaceTexture != null) {
            surfaceTexture.setOnFrameAvailableListener(null);
        }
        Surface surface = this.f13813n;
        if (surface != null) {
            surface.release();
            this.f13813n = null;
        }
        SurfaceTexture surfaceTexture2 = this.f13812m;
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
            this.f13812m = null;
        }
        a0 a0Var = this.f13821w;
        if (a0Var != null) {
            a0Var.e.a();
            a0Var.f13641f.a();
            a0Var.f13642g.a();
            a0Var.h.a();
            a0Var.f13643i.a();
            x xVar = a0Var.f13644j;
            if (xVar != null) {
                xVar.a();
            }
            int[] iArr = a0Var.f13650p;
            GLES20.glDeleteTextures(iArr.length, iArr, 0);
            int[] iArr2 = a0Var.f13649o;
            GLES20.glDeleteFramebuffers(iArr2.length, iArr2, 0);
            this.f13821w = null;
        }
        int i13 = this.f13817r;
        if (i13 != 0) {
            GLES20.glDeleteTextures(1, new int[]{i13}, 0);
            this.f13817r = 0;
        }
        EGLDisplay eGLDisplay2 = this.f13814o;
        if (eGLDisplay2 != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT);
            EGLSurface eGLSurface3 = this.f13816q;
            if (eGLSurface3 != EGL14.EGL_NO_SURFACE) {
                EGL14.eglDestroySurface(this.f13814o, eGLSurface3);
            }
            EGLContext eGLContext2 = this.f13815p;
            if (eGLContext2 != EGL14.EGL_NO_CONTEXT) {
                EGL14.eglDestroyContext(this.f13814o, eGLContext2);
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f13814o);
        }
        this.f13814o = EGL14.EGL_NO_DISPLAY;
        this.f13815p = EGL14.EGL_NO_CONTEXT;
        this.f13816q = EGL14.EGL_NO_SURFACE;
    }

    public final void e() {
        int i10;
        GLES20.glBindTexture(36197, this.f13817r);
        if (this.f13806f == this.f13805c) {
            i10 = 9728;
        } else {
            i10 = 9729;
        }
        GLES20.glTexParameteri(36197, 10241, i10);
        GLES20.glTexParameteri(36197, 10240, i10);
    }

    public final void g() {
        Handler handler = this.f13811l;
        HandlerThread handlerThread = this.f13810k;
        if (handler != null) {
            handler.removeCallbacks(this.f13803a0);
        }
        this.f13811l = null;
        this.f13810k = null;
        this.V = false;
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

    public final void h(long j3) {
        this.C = j3;
        EGLExt.eglPresentationTimeANDROID(this.f13814o, this.f13816q, j3);
        long nanoTime = System.nanoTime();
        if (EGL14.eglSwapBuffers(this.f13814o, this.f13816q)) {
            long nanoTime2 = System.nanoTime();
            this.N++;
            long j10 = nanoTime2 - nanoTime;
            this.J++;
            this.K += j10;
            this.L = Math.max(this.L, j10);
            if (this.J % 30 == 0) {
                this.e.b("encoder swap: average=" + ((((float) this.K) / this.J) / 1000000.0f) + " ms, max=" + (((float) this.L) / 1000000.0f) + " ms");
            }
            p pVar = this.f13808i;
            if (pVar != null) {
                k kVar = (k) pVar;
                long j11 = kVar.f13772t;
                int i10 = (int) (j11 % 256);
                kVar.f13763k[i10] = j3 / 1000;
                kVar.f13764l[i10] = nanoTime2;
                kVar.f13772t = j11 + 1;
                return;
            }
            return;
        }
        throw new IllegalStateException("Unable to swap EGL buffers: 0x" + Integer.toHexString(EGL14.eglGetError()));
    }

    public final void i(Size size, int i10, boolean z10) {
        Handler handler = this.f13811l;
        if (this.V && handler != null) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            RuntimeException[] runtimeExceptionArr = new RuntimeException[1];
            handler.post(new s2(this, size, i10, z10, runtimeExceptionArr, countDownLatch));
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

    public final void j() {
        EGLDisplay eGLDisplay = this.f13814o;
        EGLSurface eGLSurface = this.f13816q;
        int[] iArr = this.f13820u;
        if (EGL14.eglQuerySurface(eGLDisplay, eGLSurface, 12375, iArr, 0)) {
            int i10 = iArr[0];
            if (EGL14.eglQuerySurface(this.f13814o, this.f13816q, 12374, iArr, 0)) {
                int i11 = iArr[0];
                if (i10 > 0 && i11 > 0) {
                    if (i10 != this.f13818s || i11 != this.f13819t) {
                        this.f13818s = i10;
                        this.f13819t = i11;
                        this.e.b("EGL output size changed: " + i10 + "x" + i11);
                    }
                }
            }
        }
    }
}
