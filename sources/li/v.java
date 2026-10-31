package li;

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
public final class v {
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
    public g0 N;
    public int O;
    public long P;
    public long Q;
    public long R;
    public long S;
    public boolean T;
    public boolean U;
    public boolean V;
    public int W;
    public long X;
    public long Y;
    public long Z;
    public Size f12250a;
    public long f12251a0;
    public Size f12252b;
    public int f12253b0;
    public Size f12254c;
    public float f12255c0;
    public final Surface d;
    public q0 f12256d0;
    public final Surface e;
    public q0 f12257e0;
    public final boolean f12258f;
    public int f12259f0;
    public final int f12260g;
    public long f12261g0;
    public final boolean h;
    public long f12262h0;
    public final p f12263i;
    public long f12264i0;
    public int f12265j;
    public long f12266j0;
    public int f12267k;
    public long f12268k0;
    public int f12269l;
    public long f12270l0;
    public boolean f12271m;
    public long m0;
    public boolean f12272n;
    public int f12273n0;
    public boolean f12274o;
    public int f12275o0;
    public volatile long f12276p;
    public long f12277p0;
    public long f12279q0;
    public final u f12280r;
    public volatile boolean f12281r0;
    public final c f12282s;
    public volatile boolean f12283s0;
    public HandlerThread f12284t;
    public volatile a f12285t0;
    public Handler f12286u;
    public Runnable f12287u0;
    public SurfaceTexture v;
    public boolean f12288v0;
    public Surface f12289w;
    public volatile RuntimeException f12290w0;
    public SurfaceTexture f12291x;
    public final q f12292x0;
    public Surface f12293y;
    public volatile long f12278q = Long.MAX_VALUE;
    public EGLDisplay f12294z = EGL14.EGL_NO_DISPLAY;
    public EGLContext A = EGL14.EGL_NO_CONTEXT;

    public v(Size size, Surface surface, Surface surface2, boolean z10, int i10, int i11, boolean z11, boolean z12, p pVar, u uVar, c cVar) {
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        this.B = eGLSurface;
        this.C = eGLSurface;
        this.K = new int[1];
        this.L = new float[16];
        this.M = new float[16];
        this.Q = -1L;
        this.S = -1L;
        this.f12292x0 = new q(this, 1);
        this.f12250a = size;
        this.f12252b = size;
        this.f12254c = size;
        this.d = surface;
        this.e = surface2;
        this.f12258f = z10;
        this.f12260g = i10;
        this.f12265j = i11;
        this.f12267k = i11;
        this.f12269l = i11;
        this.f12271m = z11;
        this.f12272n = z11;
        this.f12274o = z11;
        this.h = z12;
        this.f12263i = pVar;
        this.G = i10;
        this.H = i10;
        this.f12276p = 0L;
        this.f12283s0 = false;
        this.f12280r = uVar;
        this.f12282s = cVar;
    }

    public static void a(String str, boolean z10) {
        if (z10) {
            return;
        }
        StringBuilder i10 = sc.e.i(str, ": 0x");
        i10.append(Integer.toHexString(EGL14.eglGetError()));
        throw new IllegalStateException(i10.toString());
    }

    public final void b(boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: li.v.b(boolean):void");
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: li.v.c():void");
    }

    public final long d() {
        long max;
        if (this.f12276p == 0) {
            max = this.S + 33333333;
        } else {
            max = Math.max(0L, SystemClock.elapsedRealtimeNanos() - this.f12276p);
        }
        return Math.max(max, this.S + 1);
    }

    public final float e(long j10) {
        long max = Math.max(0L, j10 - this.Y);
        long max2 = Math.max(33L, this.f12253b0) * 1000000;
        float f7 = ((this.N.f12053a * 4.0f) / 48.0f) * 1.15f;
        if (max <= max2) {
            float max3 = 1.0f - Math.max(0.0f, Math.min(1.0f, ((float) max) / ((float) max2)));
            return (1.0f - (((max3 * max3) * max3) * max3)) * f7;
        }
        return f7 * ((float) Math.sqrt((Math.log1p(((float) (max - max2)) / ((float) max2)) * 0.3499999940395355d) + 1.0d));
    }

    public final void f() {
        boolean z10;
        boolean z11;
        boolean z12;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f12294z = eglGetDisplay;
        if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
            int i10 = 2;
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr2 = new int[1];
                if (EGL14.eglChooseConfig(this.f12294z, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] != 0) {
                    EGLContext eglCreateContext = EGL14.eglCreateContext(this.f12294z, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                    this.A = eglCreateContext;
                    if (eglCreateContext != EGL14.EGL_NO_CONTEXT) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    a("Unable to create EGL context", z10);
                    int[] iArr3 = {12344};
                    EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.f12294z, eGLConfigArr[0], this.d, iArr3, 0);
                    this.B = eglCreateWindowSurface;
                    if (eglCreateWindowSurface != EGL14.EGL_NO_SURFACE) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    a("Unable to create EGL surface", z11);
                    Surface surface = this.e;
                    if (surface != null) {
                        EGLSurface eglCreateWindowSurface2 = EGL14.eglCreateWindowSurface(this.f12294z, eGLConfigArr[0], surface, iArr3, 0);
                        this.C = eglCreateWindowSurface2;
                        if (eglCreateWindowSurface2 != EGL14.EGL_NO_SURFACE) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        a("Unable to create preview EGL surface", z12);
                        this.I = h(this.C, 12375);
                        this.J = h(this.C, 12374);
                    }
                    g();
                    this.f12263i.b("GL initialized: egl=" + iArr[0] + "." + iArr[1] + ", vendor=" + GLES20.glGetString(7936) + ", renderer=" + GLES20.glGetString(7937) + ", version=" + GLES20.glGetString(7938) + ", elapsedMs=" + ((System.nanoTime() - this.f12279q0) / 1000000));
                    boolean z13 = this.f12258f;
                    if (!z13) {
                        i10 = 1;
                    }
                    int[] iArr4 = new int[i10];
                    GLES20.glGenTextures(i10, iArr4, 0);
                    int i11 = iArr4[0];
                    this.D = i11;
                    GLES20.glBindTexture(36197, i11);
                    k(i11, this.f12265j);
                    GLES20.glTexParameteri(36197, 10242, 33071);
                    GLES20.glTexParameteri(36197, 10243, 33071);
                    SurfaceTexture surfaceTexture = new SurfaceTexture(this.D);
                    this.v = surfaceTexture;
                    surfaceTexture.setDefaultBufferSize(this.f12250a.getWidth(), this.f12250a.getHeight());
                    this.v.setOnFrameAvailableListener(new t(this, 0), this.f12286u);
                    this.f12289w = new Surface(this.v);
                    if (z13) {
                        int i12 = iArr4[1];
                        this.E = i12;
                        GLES20.glBindTexture(36197, i12);
                        k(i12, this.f12265j);
                        GLES20.glTexParameteri(36197, 10242, 33071);
                        GLES20.glTexParameteri(36197, 10243, 33071);
                        SurfaceTexture surfaceTexture2 = new SurfaceTexture(this.E);
                        this.f12291x = surfaceTexture2;
                        surfaceTexture2.setDefaultBufferSize(this.f12250a.getWidth(), this.f12250a.getHeight());
                        this.f12291x.setOnFrameAvailableListener(new t(this, 1), this.f12286u);
                        this.f12293y = new Surface(this.f12291x);
                    }
                    Size size = this.f12250a;
                    int i13 = this.f12265j;
                    boolean z14 = this.h;
                    int i14 = this.f12260g;
                    this.N = new g0(i14, size, i13, z14);
                    GLES20.glViewport(0, 0, i14, i14);
                    return;
                }
                throw new IllegalStateException("Unable to choose EGL config");
            }
            throw new IllegalStateException("Unable to initialize EGL");
        }
        throw new IllegalStateException("Unable to get EGL display");
    }

    public final void g() {
        EGLDisplay eGLDisplay = this.f12294z;
        EGLSurface eGLSurface = this.B;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.A)) {
            return;
        }
        throw new IllegalStateException("Unable to make EGL context current: 0x" + Integer.toHexString(EGL14.eglGetError()));
    }

    public final int h(EGLSurface eGLSurface, int i10) {
        EGLDisplay eGLDisplay = this.f12294z;
        int[] iArr = this.K;
        if (!EGL14.eglQuerySurface(eGLDisplay, eGLSurface, i10, iArr, 0)) {
            return this.f12260g;
        }
        return Math.max(1, iArr[0]);
    }

    public final void i() {
        long nanoTime;
        String valueOf;
        String valueOf2;
        EGLSurface eGLSurface;
        EGLContext eGLContext;
        if (this.f12279q0 == 0) {
            nanoTime = 0;
        } else {
            nanoTime = System.nanoTime() - this.f12279q0;
        }
        StringBuilder sb2 = new StringBuilder("GL summary: inputFrames=");
        sb2.append(this.f12264i0);
        sb2.append(", inputFps=");
        long j10 = this.f12264i0;
        int i10 = (nanoTime > 0L ? 1 : (nanoTime == 0L ? 0 : -1));
        Object obj = "n/a";
        if (i10 <= 0) {
            valueOf = "n/a";
        } else {
            valueOf = String.valueOf((j10 * 1.0E9d) / nanoTime);
        }
        sb2.append(valueOf);
        sb2.append(", primaryInputFrames=");
        sb2.append(this.f12266j0);
        sb2.append(", secondaryInputFrames=");
        sb2.append(this.f12268k0);
        sb2.append(", preOriginFrames=");
        sb2.append(this.f12270l0);
        sb2.append(", submittedFrames=");
        sb2.append(this.m0);
        sb2.append(", submittedFps=");
        long j11 = this.m0;
        if (i10 <= 0) {
            valueOf2 = "n/a";
        } else {
            valueOf2 = String.valueOf((j11 * 1.0E9d) / nanoTime);
        }
        sb2.append(valueOf2);
        sb2.append(", syntheticFrames=");
        sb2.append(this.f12273n0);
        sb2.append(", largeFrameGaps=");
        sb2.append(this.f12275o0);
        sb2.append(", maxFrameGapMs=");
        sb2.append(((float) this.f12277p0) / 1000000.0f);
        sb2.append(", gpuSamples=0, gpuAverageMs=n/a, gpuMaxMs=");
        sb2.append(((float) 0) / 1000000.0f);
        sb2.append(", swapAverageMs=");
        int i11 = this.f12259f0;
        if (i11 != 0) {
            obj = Float.valueOf((((float) this.f12261g0) / i11) / 1000000.0f);
        }
        sb2.append(obj);
        sb2.append(", swapMaxMs=");
        sb2.append(((float) this.f12262h0) / 1000000.0f);
        this.f12263i.b(sb2.toString());
        Handler handler = this.f12286u;
        if (handler != null) {
            handler.removeCallbacks(this.f12292x0);
        }
        EGLDisplay eGLDisplay = this.f12294z;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY && (eGLSurface = this.B) != EGL14.EGL_NO_SURFACE && (eGLContext = this.A) != EGL14.EGL_NO_CONTEXT) {
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
        }
        SurfaceTexture surfaceTexture = this.v;
        if (surfaceTexture != null) {
            surfaceTexture.setOnFrameAvailableListener(null);
        }
        SurfaceTexture surfaceTexture2 = this.f12291x;
        if (surfaceTexture2 != null) {
            surfaceTexture2.setOnFrameAvailableListener(null);
        }
        Surface surface = this.f12289w;
        if (surface != null) {
            surface.release();
            this.f12289w = null;
        }
        SurfaceTexture surfaceTexture3 = this.v;
        if (surfaceTexture3 != null) {
            surfaceTexture3.release();
            this.v = null;
        }
        Surface surface2 = this.f12293y;
        if (surface2 != null) {
            surface2.release();
            this.f12293y = null;
        }
        SurfaceTexture surfaceTexture4 = this.f12291x;
        if (surfaceTexture4 != null) {
            surfaceTexture4.release();
            this.f12291x = null;
        }
        g0 g0Var = this.N;
        if (g0Var != null) {
            g0Var.f12057g.b();
            g0Var.h.b();
            d0 d0Var = g0Var.f12058i;
            if (d0Var != null) {
                d0Var.b();
            }
            b0 b0Var = g0Var.f12059j;
            if (b0Var != null) {
                b0Var.b();
            }
            g0Var.f12060k.b();
            g0Var.f12061l.b();
            g0Var.f12062m.b();
            c0 c0Var = g0Var.f12063n;
            if (c0Var != null) {
                c0Var.b();
            }
            int[] iArr = g0Var.f12069t;
            GLES20.glDeleteTextures(iArr.length, iArr, 0);
            int[] iArr2 = g0Var.f12068s;
            GLES20.glDeleteFramebuffers(iArr2.length, iArr2, 0);
            this.N = null;
        }
        int i12 = this.D;
        if (i12 != 0) {
            GLES20.glDeleteTextures(1, new int[]{i12}, 0);
            this.D = 0;
        }
        int i13 = this.E;
        if (i13 != 0) {
            GLES20.glDeleteTextures(1, new int[]{i13}, 0);
            this.E = 0;
        }
        EGLDisplay eGLDisplay2 = this.f12294z;
        if (eGLDisplay2 != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT);
            EGLSurface eGLSurface3 = this.B;
            if (eGLSurface3 != EGL14.EGL_NO_SURFACE) {
                EGL14.eglDestroySurface(this.f12294z, eGLSurface3);
            }
            EGLSurface eGLSurface4 = this.C;
            if (eGLSurface4 != EGL14.EGL_NO_SURFACE) {
                EGL14.eglDestroySurface(this.f12294z, eGLSurface4);
            }
            EGLContext eGLContext2 = this.A;
            if (eGLContext2 != EGL14.EGL_NO_CONTEXT) {
                EGL14.eglDestroyContext(this.f12294z, eGLContext2);
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f12294z);
        }
        this.f12294z = EGL14.EGL_NO_DISPLAY;
        this.A = EGL14.EGL_NO_CONTEXT;
        EGLSurface eGLSurface5 = EGL14.EGL_NO_SURFACE;
        this.B = eGLSurface5;
        this.C = eGLSurface5;
    }

    public final void j(int i10, float[] fArr) {
        EGLSurface eGLSurface = this.C;
        if (eGLSurface != EGL14.EGL_NO_SURFACE && this.N != null) {
            if (EGL14.eglMakeCurrent(this.f12294z, eGLSurface, eGLSurface, this.A)) {
                g0 g0Var = this.N;
                int i11 = this.I;
                int i12 = this.J;
                g0Var.getClass();
                GLES20.glDisable(3042);
                GLES20.glBindFramebuffer(36160, 0);
                GLES20.glViewport(0, 0, i11, i12);
                g0Var.c(g0Var.f12057g, fArr);
                g0.d(i10);
                GLES20.glDrawArrays(5, 0, 4);
                if (EGL14.eglSwapBuffers(this.f12294z, this.C)) {
                    g();
                } else {
                    throw new IllegalStateException("Unable to swap preview EGL buffers: 0x" + Integer.toHexString(EGL14.eglGetError()));
                }
            } else {
                throw new IllegalStateException("Unable to make preview EGL surface current: 0x" + Integer.toHexString(EGL14.eglGetError()));
            }
        }
        Runnable runnable = this.f12287u0;
        if (runnable != null) {
            this.f12287u0 = null;
            runnable.run();
        }
    }

    public final void k(int i10, int i11) {
        int i12;
        GLES20.glBindTexture(36197, i10);
        if (i11 == this.f12260g) {
            i12 = 9728;
        } else {
            i12 = 9729;
        }
        GLES20.glTexParameteri(36197, 10241, i12);
        GLES20.glTexParameteri(36197, 10240, i12);
    }

    public final void l() {
        Handler handler = this.f12286u;
        HandlerThread handlerThread = this.f12284t;
        if (handler != null) {
            handler.removeCallbacks(this.f12292x0);
        }
        this.f12286u = null;
        this.f12284t = null;
        this.f12281r0 = false;
        if (handler != null && handlerThread != null) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            handler.post(new s(this, handlerThread, countDownLatch, 0));
            try {
                countDownLatch.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public final void m(long j10) {
        this.S = j10;
        EGLExt.eglPresentationTimeANDROID(this.f12294z, this.B, j10);
        long nanoTime = System.nanoTime();
        if (EGL14.eglSwapBuffers(this.f12294z, this.B)) {
            long nanoTime2 = System.nanoTime();
            this.m0++;
            long j11 = nanoTime2 - nanoTime;
            this.f12259f0++;
            this.f12261g0 += j11;
            this.f12262h0 = Math.max(this.f12262h0, j11);
            if (this.f12259f0 % 30 == 0) {
                this.f12263i.b("encoder swap: average=" + ((((float) this.f12261g0) / this.f12259f0) / 1000000.0f) + " ms, max=" + (((float) this.f12262h0) / 1000000.0f) + " ms");
            }
            u uVar = this.f12280r;
            if (uVar != null) {
                o oVar = (o) uVar;
                long j12 = oVar.C;
                int i10 = (int) (j12 % 256);
                oVar.f12198l[i10] = j10 / 1000;
                oVar.f12199m[i10] = nanoTime2;
                oVar.C = j12 + 1;
                synchronized (oVar) {
                    if (oVar.f12207u != null && !oVar.v) {
                        d dVar = oVar.f12207u;
                        oVar.f12207u = null;
                        oVar.f12193f.b("first synchronized video frame submitted");
                        dVar.run();
                        return;
                    }
                    return;
                }
            }
            return;
        }
        throw new IllegalStateException("Unable to swap EGL buffers: 0x" + Integer.toHexString(EGL14.eglGetError()));
    }

    public final void n(Size size, int i10, boolean z10) {
        Handler handler = this.f12286u;
        if (this.f12281r0 && handler != null) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            RuntimeException[] runtimeExceptionArr = new RuntimeException[1];
            handler.post(new r(this, size, i10, z10, runtimeExceptionArr, countDownLatch, 1));
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

    public final void o() {
        EGLDisplay eGLDisplay = this.f12294z;
        EGLSurface eGLSurface = this.B;
        int[] iArr = this.K;
        if (EGL14.eglQuerySurface(eGLDisplay, eGLSurface, 12375, iArr, 0)) {
            int i10 = iArr[0];
            if (EGL14.eglQuerySurface(this.f12294z, this.B, 12374, iArr, 0)) {
                int i11 = iArr[0];
                if (i10 > 0 && i11 > 0 && (i10 != this.G || i11 != this.H)) {
                    this.G = i10;
                    this.H = i11;
                    this.f12263i.b("EGL output size changed: " + i10 + "x" + i11);
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
