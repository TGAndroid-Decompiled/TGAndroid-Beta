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
    public long J;
    public long K;
    public int L;
    public float M;
    public l0 N;
    public l0 O;
    public int P;
    public long Q;
    public long R;
    public long S;
    public long T;
    public long U;
    public int V;
    public int W;
    public long X;
    public long Y;
    public volatile boolean Z;
    public Size f15002a;
    public final Surface f15004b;
    public volatile a f15005b0;
    public final int f15006c;
    public boolean f15007c0;
    public final boolean d;
    public volatile RuntimeException f15008d0;
    public final m f15009e;
    public int f15011f;
    public boolean f15012g;
    public final p f15014j;
    public final b f15015k;
    public HandlerThread f15016l;
    public Handler f15017m;
    public SurfaceTexture f15018n;
    public Surface f15019o;
    public int f15023s;
    public int f15024t;
    public int f15025u;
    public a0 f15027x;
    public int f15028y;
    public long f15029z;
    public volatile long f15013i = Long.MAX_VALUE;
    public EGLDisplay f15020p = EGL14.EGL_NO_DISPLAY;
    public EGLContext f15021q = EGL14.EGL_NO_CONTEXT;
    public EGLSurface f15022r = EGL14.EGL_NO_SURFACE;
    public final int[] v = new int[1];
    public final float[] f15026w = new float[16];
    public long A = -1;
    public long C = -1;
    public final n f15010e0 = new n(this, 0);
    public volatile long h = 0;
    public volatile boolean f15003a0 = false;

    public q(Size size, Surface surface, int i10, int i11, boolean z10, boolean z11, m mVar, p pVar, b bVar) {
        this.f15002a = size;
        this.f15004b = surface;
        this.f15006c = i10;
        this.f15011f = i11;
        this.f15012g = z10;
        this.d = z11;
        this.f15009e = mVar;
        this.f15024t = i10;
        this.f15025u = i10;
        this.f15014j = pVar;
        this.f15015k = bVar;
    }

    public static void a(String str, boolean z10) {
        if (z10) {
            return;
        }
        StringBuilder j3 = sa.e.j(str, ": 0x");
        j3.append(Integer.toHexString(EGL14.eglGetError()));
        throw new IllegalStateException(j3.toString());
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: ki.q.b():void");
    }

    public final long c() {
        long max;
        if (this.h == 0) {
            max = this.C + 33333333;
        } else {
            max = Math.max(0L, SystemClock.elapsedRealtimeNanos() - this.h);
        }
        return Math.max(max, this.C + 1);
    }

    public final float d(long j3) {
        long max = Math.max(0L, j3 - this.I);
        long max2 = Math.max(33L, this.L) * 1000000;
        float f7 = ((this.f15027x.f14830a * 4.0f) / 48.0f) * 1.15f;
        if (max <= max2) {
            float max3 = 1.0f - Math.max(0.0f, Math.min(1.0f, ((float) max) / ((float) max2)));
            return (1.0f - (((max3 * max3) * max3) * max3)) * f7;
        }
        return f7 * ((float) Math.sqrt((Math.log1p(((float) (max - max2)) / ((float) max2)) * 0.3499999940395355d) + 1.0d));
    }

    public final void e() {
        boolean z10;
        boolean z11;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f15020p = eglGetDisplay;
        if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr2 = new int[1];
                if (EGL14.eglChooseConfig(this.f15020p, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] != 0) {
                    EGLContext eglCreateContext = EGL14.eglCreateContext(this.f15020p, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                    this.f15021q = eglCreateContext;
                    if (eglCreateContext != EGL14.EGL_NO_CONTEXT) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    a("Unable to create EGL context", z10);
                    EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.f15020p, eGLConfigArr[0], this.f15004b, new int[]{12344}, 0);
                    this.f15022r = eglCreateWindowSurface;
                    if (eglCreateWindowSurface != EGL14.EGL_NO_SURFACE) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    a("Unable to create EGL surface", z11);
                    EGLDisplay eGLDisplay = this.f15020p;
                    EGLSurface eGLSurface = this.f15022r;
                    if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f15021q)) {
                        this.f15009e.b("GL initialized: egl=" + iArr[0] + "." + iArr[1] + ", vendor=" + GLES20.glGetString(7936) + ", renderer=" + GLES20.glGetString(7937) + ", version=" + GLES20.glGetString(7938) + ", elapsedMs=" + ((System.nanoTime() - this.Y) / 1000000));
                        int[] iArr3 = new int[1];
                        GLES20.glGenTextures(1, iArr3, 0);
                        int i10 = iArr3[0];
                        this.f15023s = i10;
                        GLES20.glBindTexture(36197, i10);
                        g();
                        GLES20.glTexParameteri(36197, 10242, 33071);
                        GLES20.glTexParameteri(36197, 10243, 33071);
                        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f15023s);
                        this.f15018n = surfaceTexture;
                        surfaceTexture.setDefaultBufferSize(this.f15002a.getWidth(), this.f15002a.getHeight());
                        this.f15018n.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() {
                            @Override
                            public final void onFrameAvailable(android.graphics.SurfaceTexture r21) {
                                throw new UnsupportedOperationException("Method not decompiled: ki.o.onFrameAvailable(android.graphics.SurfaceTexture):void");
                            }
                        }, this.f15017m);
                        this.f15019o = new Surface(this.f15018n);
                        Size size = this.f15002a;
                        int i11 = this.f15011f;
                        boolean z12 = this.d;
                        int i12 = this.f15006c;
                        this.f15027x = new a0(i12, size, i11, z12);
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

    public final void f() {
        long nanoTime;
        String valueOf;
        String valueOf2;
        EGLSurface eGLSurface;
        EGLContext eGLContext;
        if (this.Y == 0) {
            nanoTime = 0;
        } else {
            nanoTime = System.nanoTime() - this.Y;
        }
        StringBuilder sb2 = new StringBuilder("GL summary: inputFrames=");
        sb2.append(this.S);
        sb2.append(", inputFps=");
        long j3 = this.S;
        Object obj = "n/a";
        int i10 = (nanoTime > 0L ? 1 : (nanoTime == 0L ? 0 : -1));
        if (i10 <= 0) {
            valueOf = "n/a";
        } else {
            valueOf = String.valueOf((j3 * 1.0E9d) / nanoTime);
        }
        sb2.append(valueOf);
        sb2.append(", preOriginFrames=");
        sb2.append(this.T);
        sb2.append(", submittedFrames=");
        sb2.append(this.U);
        sb2.append(", submittedFps=");
        long j10 = this.U;
        if (i10 <= 0) {
            valueOf2 = "n/a";
        } else {
            valueOf2 = String.valueOf((j10 * 1.0E9d) / nanoTime);
        }
        sb2.append(valueOf2);
        sb2.append(", syntheticFrames=");
        sb2.append(this.V);
        sb2.append(", largeFrameGaps=");
        sb2.append(this.W);
        sb2.append(", maxFrameGapMs=");
        sb2.append(((float) this.X) / 1000000.0f);
        sb2.append(", gpuSamples=0, gpuAverageMs=n/a, gpuMaxMs=");
        sb2.append(((float) 0) / 1000000.0f);
        sb2.append(", swapAverageMs=");
        int i11 = this.P;
        if (i11 != 0) {
            obj = Float.valueOf((((float) this.Q) / i11) / 1000000.0f);
        }
        sb2.append(obj);
        sb2.append(", swapMaxMs=");
        sb2.append(((float) this.R) / 1000000.0f);
        this.f15009e.b(sb2.toString());
        Handler handler = this.f15017m;
        if (handler != null) {
            handler.removeCallbacks(this.f15010e0);
        }
        EGLDisplay eGLDisplay = this.f15020p;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY && (eGLSurface = this.f15022r) != EGL14.EGL_NO_SURFACE && (eGLContext = this.f15021q) != EGL14.EGL_NO_CONTEXT) {
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
        }
        SurfaceTexture surfaceTexture = this.f15018n;
        if (surfaceTexture != null) {
            surfaceTexture.setOnFrameAvailableListener(null);
        }
        Surface surface = this.f15019o;
        if (surface != null) {
            surface.release();
            this.f15019o = null;
        }
        SurfaceTexture surfaceTexture2 = this.f15018n;
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
            this.f15018n = null;
        }
        a0 a0Var = this.f15027x;
        if (a0Var != null) {
            a0Var.f14835g.b();
            a0Var.h.b();
            x xVar = a0Var.f14836i;
            if (xVar != null) {
                xVar.b();
            }
            v vVar = a0Var.f14837j;
            if (vVar != null) {
                vVar.b();
            }
            a0Var.f14838k.b();
            a0Var.f14839l.b();
            a0Var.f14840m.b();
            w wVar = a0Var.f14841n;
            if (wVar != null) {
                wVar.b();
            }
            int[] iArr = a0Var.f14847t;
            GLES20.glDeleteTextures(iArr.length, iArr, 0);
            int[] iArr2 = a0Var.f14846s;
            GLES20.glDeleteFramebuffers(iArr2.length, iArr2, 0);
            this.f15027x = null;
        }
        int i12 = this.f15023s;
        if (i12 != 0) {
            GLES20.glDeleteTextures(1, new int[]{i12}, 0);
            this.f15023s = 0;
        }
        EGLDisplay eGLDisplay2 = this.f15020p;
        if (eGLDisplay2 != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT);
            EGLSurface eGLSurface3 = this.f15022r;
            if (eGLSurface3 != EGL14.EGL_NO_SURFACE) {
                EGL14.eglDestroySurface(this.f15020p, eGLSurface3);
            }
            EGLContext eGLContext2 = this.f15021q;
            if (eGLContext2 != EGL14.EGL_NO_CONTEXT) {
                EGL14.eglDestroyContext(this.f15020p, eGLContext2);
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f15020p);
        }
        this.f15020p = EGL14.EGL_NO_DISPLAY;
        this.f15021q = EGL14.EGL_NO_CONTEXT;
        this.f15022r = EGL14.EGL_NO_SURFACE;
    }

    public final void g() {
        int i10;
        GLES20.glBindTexture(36197, this.f15023s);
        if (this.f15011f == this.f15006c) {
            i10 = 9728;
        } else {
            i10 = 9729;
        }
        GLES20.glTexParameteri(36197, 10241, i10);
        GLES20.glTexParameteri(36197, 10240, i10);
    }

    public final void h() {
        Handler handler = this.f15017m;
        HandlerThread handlerThread = this.f15016l;
        if (handler != null) {
            handler.removeCallbacks(this.f15010e0);
        }
        this.f15017m = null;
        this.f15016l = null;
        this.Z = false;
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
        this.C = j3;
        EGLExt.eglPresentationTimeANDROID(this.f15020p, this.f15022r, j3);
        long nanoTime = System.nanoTime();
        if (EGL14.eglSwapBuffers(this.f15020p, this.f15022r)) {
            long nanoTime2 = System.nanoTime();
            this.U++;
            long j10 = nanoTime2 - nanoTime;
            this.P++;
            this.Q += j10;
            this.R = Math.max(this.R, j10);
            if (this.P % 30 == 0) {
                this.f15009e.b("encoder swap: average=" + ((((float) this.Q) / this.P) / 1000000.0f) + " ms, max=" + (((float) this.R) / 1000000.0f) + " ms");
            }
            p pVar = this.f15014j;
            if (pVar != null) {
                l lVar = (l) pVar;
                long j11 = lVar.f14980x;
                int i10 = (int) (j11 % 256);
                lVar.f14968k[i10] = j3 / 1000;
                lVar.f14969l[i10] = nanoTime2;
                lVar.f14980x = j11 + 1;
                synchronized (lVar) {
                    if (lVar.f14977t != null && !lVar.f14978u) {
                        c cVar = lVar.f14977t;
                        lVar.f14977t = null;
                        lVar.f14964f.b("first synchronized video frame submitted");
                        cVar.run();
                        return;
                    }
                    return;
                }
            }
            return;
        }
        throw new IllegalStateException("Unable to swap EGL buffers: 0x" + Integer.toHexString(EGL14.eglGetError()));
    }

    public final void j(Size size, int i10, boolean z10) {
        Handler handler = this.f15017m;
        if (this.Z && handler != null) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            RuntimeException[] runtimeExceptionArr = new RuntimeException[1];
            handler.post(new s2(this, size, i10, z10, runtimeExceptionArr, countDownLatch));
            try {
                countDownLatch.await();
                RuntimeException runtimeException = runtimeExceptionArr[0];
                if (runtimeException != null) {
                    throw runtimeException;
                }
            } catch (InterruptedException e7) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException("Input size update was interrupted", e7);
            }
        }
    }

    public final void k() {
        EGLDisplay eGLDisplay = this.f15020p;
        EGLSurface eGLSurface = this.f15022r;
        int[] iArr = this.v;
        if (EGL14.eglQuerySurface(eGLDisplay, eGLSurface, 12375, iArr, 0)) {
            int i10 = iArr[0];
            if (EGL14.eglQuerySurface(this.f15020p, this.f15022r, 12374, iArr, 0)) {
                int i11 = iArr[0];
                if (i10 > 0 && i11 > 0) {
                    if (i10 != this.f15024t || i11 != this.f15025u) {
                        this.f15024t = i10;
                        this.f15025u = i11;
                        this.f15009e.b("EGL output size changed: " + i10 + "x" + i11);
                    }
                }
            }
        }
    }
}
