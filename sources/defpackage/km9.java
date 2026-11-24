package defpackage;

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
import java.util.concurrent.CountDownLatch;
public final class km9 {
    public EGLSurface B;
    public EGLSurface C;
    public int D;
    public int E;
    public volatile boolean F;
    public int G;
    public int H;
    public int I;
    public int J;
    public final int[] K;
    public final float[] L;
    public final float[] M;
    public um9 N;
    public int O;
    public long P;
    public long Q;
    public long R;
    public long S;
    public boolean T;
    public boolean U;
    public boolean V;
    public byte W;
    public long X;
    public long Y;
    public long Z;
    public Size a;
    public long a0;
    public Size b;
    public int b0;
    public Size c;
    public float c0;
    public final Surface d;
    public nn9 d0;
    public final Surface e;
    public nn9 e0;
    public final boolean f;
    public int f0;
    public final short g;
    public long g0;
    public final boolean h;
    public long h0;
    public final fm9 i;
    public long i0;
    public int j;
    public long j0;
    public int k;
    public long k0;
    public int l;
    public long l0;
    public boolean m;
    public long m0;
    public boolean n;
    public int n0;
    public boolean o;
    public int o0;
    public volatile long p;
    public long p0;
    public long q0;
    public final jm9 r;
    public volatile boolean r0;
    public final tl9 s;
    public volatile int s0;
    public HandlerThread t;
    public volatile boolean t0;
    public Handler u;
    public volatile rl9 u0;
    public SurfaceTexture v;
    public sl9 v0;
    public Surface w;
    public boolean w0;
    public SurfaceTexture x;
    public volatile RuntimeException x0;
    public Surface y;
    public final hm9 y0;
    public volatile long q = Long.MAX_VALUE;
    public EGLDisplay z = EGL14.EGL_NO_DISPLAY;
    public EGLContext A = EGL14.EGL_NO_CONTEXT;

    public km9(Size size, Surface surface, Surface surface2, boolean z, int i, int i2, boolean z2, boolean z3, fm9 fm9Var, jm9 jm9Var, tl9 tl9Var) {
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        this.B = eGLSurface;
        this.C = eGLSurface;
        this.K = new int[1];
        this.L = new float[16];
        this.M = new float[16];
        this.Q = -1L;
        this.S = -1L;
        this.y0 = new hm9(this, (byte) 1);
        this.a = size;
        this.b = size;
        this.c = size;
        this.d = surface;
        this.e = surface2;
        this.f = z;
        this.g = i;
        this.j = i2;
        this.k = i2;
        this.l = i2;
        this.m = z2;
        this.n = z2;
        this.o = z2;
        this.h = z3;
        this.i = fm9Var;
        this.G = i;
        this.H = i;
        this.p = 0L;
        this.t0 = false;
        this.r = jm9Var;
        this.s = tl9Var;
    }

    public static void a(String str, boolean z) {
        if (z) {
            return;
        }
        rjb.l(b10.k(str, ": 0x"), Integer.toHexString(EGL14.eglGetError()));
    }

    public final void b(boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.km9.b(boolean):void");
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.km9.c():void");
    }

    public final long d() {
        long max;
        if (this.p == 0) {
            max = this.S + 33333333;
        } else {
            max = Math.max(0L, SystemClock.elapsedRealtimeNanos() - this.p);
        }
        return Math.max(max, this.S + 1);
    }

    public final float e(long j) {
        long max = Math.max(0L, j - this.Y);
        long max2 = Math.max(33L, this.b0) * 1000000;
        float f = ((this.N.a * 4.0f) / 48.0f) * 1.15f;
        if (max <= max2) {
            float max3 = 1.0f - Math.max(0.0f, Math.min(1.0f, ((float) max) / ((float) max2)));
            return (1.0f - (((max3 * max3) * max3) * max3)) * f;
        }
        return f * ((float) Math.sqrt((Math.log1p(((float) (max - max2)) / ((float) max2)) * 0.3499999940395355d) + 1.0d));
    }

    public final void f() {
        boolean z;
        boolean z2;
        boolean z3;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.z = eglGetDisplay;
        if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
            int i = 2;
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr2 = new int[1];
                if (EGL14.eglChooseConfig(this.z, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] != 0) {
                    EGLContext eglCreateContext = EGL14.eglCreateContext(this.z, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                    this.A = eglCreateContext;
                    if (eglCreateContext != EGL14.EGL_NO_CONTEXT) {
                        z = true;
                    } else {
                        z = false;
                    }
                    a("Unable to create EGL context", z);
                    int[] iArr3 = {12344};
                    EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.z, eGLConfigArr[0], this.d, iArr3, 0);
                    this.B = eglCreateWindowSurface;
                    if (eglCreateWindowSurface != EGL14.EGL_NO_SURFACE) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    a("Unable to create EGL surface", z2);
                    Surface surface = this.e;
                    if (surface != null) {
                        EGLSurface eglCreateWindowSurface2 = EGL14.eglCreateWindowSurface(this.z, eGLConfigArr[0], surface, iArr3, 0);
                        this.C = eglCreateWindowSurface2;
                        if (eglCreateWindowSurface2 != EGL14.EGL_NO_SURFACE) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        a("Unable to create preview EGL surface", z3);
                        this.I = h(this.C, 12375);
                        this.J = h(this.C, 12374);
                    }
                    g();
                    this.i.b("GL initialized: egl=" + iArr[0] + "." + iArr[1] + ", vendor=" + GLES20.glGetString(7936) + ", renderer=" + GLES20.glGetString(7937) + ", version=" + GLES20.glGetString(7938) + ", elapsedMs=" + ((System.nanoTime() - this.q0) / 1000000));
                    boolean z4 = this.f;
                    if (!z4) {
                        i = 1;
                    }
                    int[] iArr4 = new int[i];
                    GLES20.glGenTextures(i, iArr4, 0);
                    int i2 = iArr4[0];
                    this.D = i2;
                    GLES20.glBindTexture(36197, i2);
                    k(i2, this.j);
                    GLES20.glTexParameteri(36197, 10242, 33071);
                    GLES20.glTexParameteri(36197, 10243, 33071);
                    SurfaceTexture surfaceTexture = new SurfaceTexture(this.D);
                    this.v = surfaceTexture;
                    surfaceTexture.setDefaultBufferSize(this.a.getWidth(), this.a.getHeight());
                    this.v.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener(this) {
                        public final km9 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                            byte b = r2;
                            km9 km9Var = this.b;
                            switch (b) {
                                case 0:
                                    km9Var.b(true);
                                    return;
                                default:
                                    km9Var.b(false);
                                    return;
                            }
                        }
                    }, this.u);
                    this.w = new Surface(this.v);
                    if (z4) {
                        int i3 = iArr4[1];
                        this.E = i3;
                        GLES20.glBindTexture(36197, i3);
                        k(i3, this.j);
                        GLES20.glTexParameteri(36197, 10242, 33071);
                        GLES20.glTexParameteri(36197, 10243, 33071);
                        SurfaceTexture surfaceTexture2 = new SurfaceTexture(this.E);
                        this.x = surfaceTexture2;
                        surfaceTexture2.setDefaultBufferSize(this.a.getWidth(), this.a.getHeight());
                        this.x.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener(this) {
                            public final km9 b;

                            {
                                this.b = this;
                            }

                            @Override
                            public final void onFrameAvailable(SurfaceTexture surfaceTexture22) {
                                byte b = r2;
                                km9 km9Var = this.b;
                                switch (b) {
                                    case 0:
                                        km9Var.b(true);
                                        return;
                                    default:
                                        km9Var.b(false);
                                        return;
                                }
                            }
                        }, this.u);
                        this.y = new Surface(this.x);
                    }
                    um9 um9Var = new um9(this.g, this.j, this.a, this.h);
                    this.N = um9Var;
                    int i4 = ((this.s0 % 360) + 360) % 360;
                    if (um9Var.s != i4) {
                        um9Var.s = i4;
                        um9Var.v();
                    }
                    short s = this.g;
                    GLES20.glViewport(0, 0, s, s);
                    return;
                }
                dq9.m("Unable to choose EGL config");
                return;
            }
            dq9.m("Unable to initialize EGL");
            return;
        }
        dq9.m("Unable to get EGL display");
    }

    public final void g() {
        EGLDisplay eGLDisplay = this.z;
        EGLSurface eGLSurface = this.B;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.A)) {
            return;
        }
        zo4.r(Integer.toHexString(EGL14.eglGetError()), "Unable to make EGL context current: 0x");
    }

    public final int h(EGLSurface eGLSurface, int i) {
        EGLDisplay eGLDisplay = this.z;
        int[] iArr = this.K;
        if (!EGL14.eglQuerySurface(eGLDisplay, eGLSurface, i, iArr, 0)) {
            return this.g;
        }
        return Math.max(1, iArr[0]);
    }

    public final void i() {
        long nanoTime;
        String valueOf;
        String valueOf2;
        EGLSurface eGLSurface;
        EGLContext eGLContext;
        if (this.q0 == 0) {
            nanoTime = 0;
        } else {
            nanoTime = System.nanoTime() - this.q0;
        }
        StringBuilder sb = new StringBuilder("GL summary: inputFrames=");
        sb.append(this.i0);
        sb.append(", inputFps=");
        long j = this.i0;
        int i = (nanoTime > 0L ? 1 : (nanoTime == 0L ? 0 : -1));
        Object obj = "n/a";
        if (i <= 0) {
            valueOf = "n/a";
        } else {
            valueOf = String.valueOf((j * 1.0E9d) / nanoTime);
        }
        sb.append(valueOf);
        sb.append(", primaryInputFrames=");
        sb.append(this.j0);
        sb.append(", secondaryInputFrames=");
        sb.append(this.k0);
        sb.append(", preOriginFrames=");
        sb.append(this.l0);
        sb.append(", submittedFrames=");
        sb.append(this.m0);
        sb.append(", submittedFps=");
        long j2 = this.m0;
        if (i <= 0) {
            valueOf2 = "n/a";
        } else {
            valueOf2 = String.valueOf((j2 * 1.0E9d) / nanoTime);
        }
        sb.append(valueOf2);
        sb.append(", syntheticFrames=");
        sb.append(this.n0);
        sb.append(", largeFrameGaps=");
        sb.append(this.o0);
        sb.append(", maxFrameGapMs=");
        sb.append(((float) this.p0) / 1000000.0f);
        sb.append(", gpuSamples=0, gpuAverageMs=n/a, gpuMaxMs=0.0, swapAverageMs=");
        int i2 = this.f0;
        if (i2 != 0) {
            obj = Float.valueOf((((float) this.g0) / i2) / 1000000.0f);
        }
        sb.append(obj);
        sb.append(", swapMaxMs=");
        sb.append(((float) this.h0) / 1000000.0f);
        this.i.b(sb.toString());
        Handler handler = this.u;
        if (handler != null) {
            handler.removeCallbacks(this.y0);
        }
        EGLDisplay eGLDisplay = this.z;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY && (eGLSurface = this.B) != EGL14.EGL_NO_SURFACE && (eGLContext = this.A) != EGL14.EGL_NO_CONTEXT) {
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
        }
        SurfaceTexture surfaceTexture = this.v;
        if (surfaceTexture != null) {
            surfaceTexture.setOnFrameAvailableListener(null);
        }
        SurfaceTexture surfaceTexture2 = this.x;
        if (surfaceTexture2 != null) {
            surfaceTexture2.setOnFrameAvailableListener(null);
        }
        Surface surface = this.w;
        if (surface != null) {
            surface.release();
            this.w = null;
        }
        SurfaceTexture surfaceTexture3 = this.v;
        if (surfaceTexture3 != null) {
            surfaceTexture3.release();
            this.v = null;
        }
        Surface surface2 = this.y;
        if (surface2 != null) {
            surface2.release();
            this.y = null;
        }
        SurfaceTexture surfaceTexture4 = this.x;
        if (surfaceTexture4 != null) {
            surfaceTexture4.release();
            this.x = null;
        }
        um9 um9Var = this.N;
        if (um9Var != null) {
            um9Var.g.b();
            um9Var.h.b();
            rm9 rm9Var = um9Var.i;
            if (rm9Var != null) {
                rm9Var.b();
            }
            qm9 qm9Var = um9Var.j;
            if (qm9Var != null) {
                qm9Var.b();
            }
            um9Var.k.b();
            um9Var.l.b();
            um9Var.m.b();
            pd0 pd0Var = um9Var.n;
            if (pd0Var != null) {
                pd0Var.b();
            }
            int[] iArr = um9Var.u;
            GLES20.glDeleteTextures(iArr.length, iArr, 0);
            int[] iArr2 = um9Var.t;
            GLES20.glDeleteFramebuffers(iArr2.length, iArr2, 0);
            this.N = null;
        }
        int i3 = this.D;
        if (i3 != 0) {
            GLES20.glDeleteTextures(1, new int[]{i3}, 0);
            this.D = 0;
        }
        int i4 = this.E;
        if (i4 != 0) {
            GLES20.glDeleteTextures(1, new int[]{i4}, 0);
            this.E = 0;
        }
        EGLDisplay eGLDisplay2 = this.z;
        if (eGLDisplay2 != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT);
            EGLSurface eGLSurface3 = this.B;
            if (eGLSurface3 != EGL14.EGL_NO_SURFACE) {
                EGL14.eglDestroySurface(this.z, eGLSurface3);
            }
            EGLSurface eGLSurface4 = this.C;
            if (eGLSurface4 != EGL14.EGL_NO_SURFACE) {
                EGL14.eglDestroySurface(this.z, eGLSurface4);
            }
            EGLContext eGLContext2 = this.A;
            if (eGLContext2 != EGL14.EGL_NO_CONTEXT) {
                EGL14.eglDestroyContext(this.z, eGLContext2);
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.z);
        }
        this.z = EGL14.EGL_NO_DISPLAY;
        this.A = EGL14.EGL_NO_CONTEXT;
        EGLSurface eGLSurface5 = EGL14.EGL_NO_SURFACE;
        this.B = eGLSurface5;
        this.C = eGLSurface5;
    }

    public final void j(int i, float[] fArr) {
        EGLSurface eGLSurface = this.C;
        if (eGLSurface != EGL14.EGL_NO_SURFACE && this.N != null) {
            if (EGL14.eglMakeCurrent(this.z, eGLSurface, eGLSurface, this.A)) {
                um9 um9Var = this.N;
                int i2 = this.I;
                int i3 = this.J;
                um9Var.getClass();
                GLES20.glDisable(3042);
                GLES20.glBindFramebuffer(36160, 0);
                GLES20.glViewport(0, 0, i2, i3);
                um9Var.b(um9Var.g, fArr);
                um9.c(i);
                GLES20.glDrawArrays(5, 0, 4);
                if (EGL14.eglSwapBuffers(this.z, this.C)) {
                    g();
                } else {
                    zo4.r(Integer.toHexString(EGL14.eglGetError()), "Unable to swap preview EGL buffers: 0x");
                    return;
                }
            } else {
                zo4.r(Integer.toHexString(EGL14.eglGetError()), "Unable to make preview EGL surface current: 0x");
                return;
            }
        }
        sl9 sl9Var = this.v0;
        if (sl9Var != null) {
            this.v0 = null;
            sl9Var.run();
        }
    }

    public final void k(int i, int i2) {
        int i3;
        GLES20.glBindTexture(36197, i);
        if (i2 == this.g) {
            i3 = 9728;
        } else {
            i3 = 9729;
        }
        GLES20.glTexParameteri(36197, 10241, i3);
        GLES20.glTexParameteri(36197, 10240, i3);
    }

    public final void l() {
        Handler handler = this.u;
        HandlerThread handlerThread = this.t;
        if (handler != null) {
            handler.removeCallbacks(this.y0);
        }
        this.u = null;
        this.t = null;
        this.r0 = false;
        if (handler != null && handlerThread != null) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            handler.post(new ak8(this, handlerThread, countDownLatch, (byte) 19));
            try {
                countDownLatch.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public final void m(long j) {
        this.S = j;
        EGLExt.eglPresentationTimeANDROID(this.z, this.B, j);
        long nanoTime = System.nanoTime();
        if (EGL14.eglSwapBuffers(this.z, this.B)) {
            long nanoTime2 = System.nanoTime();
            this.m0++;
            long j2 = nanoTime2 - nanoTime;
            this.f0++;
            this.g0 += j2;
            this.h0 = Math.max(this.h0, j2);
            if (this.f0 % 30 == 0) {
                this.i.b("encoder swap: average=" + ((((float) this.g0) / this.f0) / 1000000.0f) + " ms, max=" + (((float) this.h0) / 1000000.0f) + " ms");
            }
            jm9 jm9Var = this.r;
            if (jm9Var != null) {
                em9 em9Var = (em9) jm9Var;
                long j3 = em9Var.C;
                int i = (int) (j3 % 256);
                em9Var.l[i] = j / 1000;
                em9Var.m[i] = nanoTime2;
                em9Var.C = j3 + 1;
                synchronized (em9Var) {
                    if (em9Var.u != null && !em9Var.v) {
                        ul9 ul9Var = em9Var.u;
                        em9Var.u = null;
                        em9Var.f.b("first synchronized video frame submitted");
                        ul9Var.run();
                        return;
                    }
                    return;
                }
            }
            return;
        }
        zo4.r(Integer.toHexString(EGL14.eglGetError()), "Unable to swap EGL buffers: 0x");
    }

    public final void n(Size size, int i, boolean z) {
        Handler handler = this.u;
        if (this.r0 && handler != null) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            RuntimeException[] runtimeExceptionArr = new RuntimeException[1];
            handler.post(new im9(this, size, i, z, runtimeExceptionArr, countDownLatch, (byte) 1));
            try {
                countDownLatch.await();
                RuntimeException runtimeException = runtimeExceptionArr[0];
                if (runtimeException != null) {
                    throw runtimeException;
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                wa3.h("Input size update was interrupted", e);
            }
        }
    }

    public final void o() {
        EGLDisplay eGLDisplay = this.z;
        EGLSurface eGLSurface = this.B;
        int[] iArr = this.K;
        if (EGL14.eglQuerySurface(eGLDisplay, eGLSurface, 12375, iArr, 0)) {
            int i = iArr[0];
            if (EGL14.eglQuerySurface(this.z, this.B, 12374, iArr, 0)) {
                int i2 = iArr[0];
                if (i > 0 && i2 > 0 && (i != this.G || i2 != this.H)) {
                    this.G = i;
                    this.H = i2;
                    this.i.b("EGL output size changed: " + i + "x" + i2);
                }
                EGLSurface eGLSurface2 = this.C;
                if (eGLSurface2 != EGL14.EGL_NO_SURFACE) {
                    this.I = h(eGLSurface2, 12375);
                    this.J = h(this.C, 12374);
                }
            }
        }
    }
}
