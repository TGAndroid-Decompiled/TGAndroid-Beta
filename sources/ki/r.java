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
public final class r {
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
    public m0 N;
    public m0 O;
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
    public Size f15075a;
    public final Surface f15077b;
    public volatile a f15078b0;
    public final int f15079c;
    public boolean f15080c0;
    public final boolean d;
    public volatile RuntimeException f15081d0;
    public final n f15082e;
    public int f15084f;
    public boolean f15085g;
    public final q f15087j;
    public final b f15088k;
    public HandlerThread f15089l;
    public Handler f15090m;
    public SurfaceTexture f15091n;
    public Surface f15092o;
    public int f15096s;
    public int f15097t;
    public int f15098u;
    public b0 f15100x;
    public int f15101y;
    public long f15102z;
    public volatile long f15086i = Long.MAX_VALUE;
    public EGLDisplay f15093p = EGL14.EGL_NO_DISPLAY;
    public EGLContext f15094q = EGL14.EGL_NO_CONTEXT;
    public EGLSurface f15095r = EGL14.EGL_NO_SURFACE;
    public final int[] v = new int[1];
    public final float[] f15099w = new float[16];
    public long A = -1;
    public long C = -1;
    public final o f15083e0 = new o(this, 0);
    public volatile long h = 0;
    public volatile boolean f15076a0 = false;

    public r(Size size, Surface surface, int i10, int i11, boolean z10, boolean z11, n nVar, q qVar, b bVar) {
        this.f15075a = size;
        this.f15077b = surface;
        this.f15079c = i10;
        this.f15084f = i11;
        this.f15085g = z10;
        this.d = z11;
        this.f15082e = nVar;
        this.f15097t = i10;
        this.f15098u = i10;
        this.f15087j = qVar;
        this.f15088k = bVar;
    }

    public static void a(String str, boolean z10) {
        if (z10) {
            return;
        }
        StringBuilder j3 = sc.v.j(str, ": 0x");
        j3.append(Integer.toHexString(EGL14.eglGetError()));
        throw new IllegalStateException(j3.toString());
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: ki.r.b():void");
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
        float f7 = ((this.f15100x.f14883a * 4.0f) / 48.0f) * 1.15f;
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
        this.f15093p = eglGetDisplay;
        if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr2 = new int[1];
                if (EGL14.eglChooseConfig(this.f15093p, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] != 0) {
                    EGLContext eglCreateContext = EGL14.eglCreateContext(this.f15093p, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                    this.f15094q = eglCreateContext;
                    if (eglCreateContext != EGL14.EGL_NO_CONTEXT) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    a("Unable to create EGL context", z10);
                    EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.f15093p, eGLConfigArr[0], this.f15077b, new int[]{12344}, 0);
                    this.f15095r = eglCreateWindowSurface;
                    if (eglCreateWindowSurface != EGL14.EGL_NO_SURFACE) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    a("Unable to create EGL surface", z11);
                    EGLDisplay eGLDisplay = this.f15093p;
                    EGLSurface eGLSurface = this.f15095r;
                    if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f15094q)) {
                        this.f15082e.b("GL initialized: egl=" + iArr[0] + "." + iArr[1] + ", vendor=" + GLES20.glGetString(7936) + ", renderer=" + GLES20.glGetString(7937) + ", version=" + GLES20.glGetString(7938) + ", elapsedMs=" + ((System.nanoTime() - this.Y) / 1000000));
                        int[] iArr3 = new int[1];
                        GLES20.glGenTextures(1, iArr3, 0);
                        int i10 = iArr3[0];
                        this.f15096s = i10;
                        GLES20.glBindTexture(36197, i10);
                        g();
                        GLES20.glTexParameteri(36197, 10242, 33071);
                        GLES20.glTexParameteri(36197, 10243, 33071);
                        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f15096s);
                        this.f15091n = surfaceTexture;
                        surfaceTexture.setDefaultBufferSize(this.f15075a.getWidth(), this.f15075a.getHeight());
                        this.f15091n.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() {
                            @Override
                            public final void onFrameAvailable(android.graphics.SurfaceTexture r21) {
                                throw new UnsupportedOperationException("Method not decompiled: ki.p.onFrameAvailable(android.graphics.SurfaceTexture):void");
                            }
                        }, this.f15090m);
                        this.f15092o = new Surface(this.f15091n);
                        Size size = this.f15075a;
                        int i11 = this.f15084f;
                        boolean z12 = this.d;
                        int i12 = this.f15079c;
                        this.f15100x = new b0(i12, size, i11, z12);
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
        int i10 = (nanoTime > 0L ? 1 : (nanoTime == 0L ? 0 : -1));
        Object obj = "n/a";
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
        this.f15082e.b(sb2.toString());
        Handler handler = this.f15090m;
        if (handler != null) {
            handler.removeCallbacks(this.f15083e0);
        }
        EGLDisplay eGLDisplay = this.f15093p;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY && (eGLSurface = this.f15095r) != EGL14.EGL_NO_SURFACE && (eGLContext = this.f15094q) != EGL14.EGL_NO_CONTEXT) {
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
        }
        SurfaceTexture surfaceTexture = this.f15091n;
        if (surfaceTexture != null) {
            surfaceTexture.setOnFrameAvailableListener(null);
        }
        Surface surface = this.f15092o;
        if (surface != null) {
            surface.release();
            this.f15092o = null;
        }
        SurfaceTexture surfaceTexture2 = this.f15091n;
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
            this.f15091n = null;
        }
        b0 b0Var = this.f15100x;
        if (b0Var != null) {
            b0Var.f14888g.d();
            b0Var.h.d();
            y yVar = b0Var.f14889i;
            if (yVar != null) {
                yVar.d();
            }
            w wVar = b0Var.f14890j;
            if (wVar != null) {
                wVar.d();
            }
            b0Var.f14891k.d();
            b0Var.f14892l.d();
            b0Var.f14893m.d();
            x xVar = b0Var.f14894n;
            if (xVar != null) {
                xVar.d();
            }
            int[] iArr = b0Var.f14900t;
            GLES20.glDeleteTextures(iArr.length, iArr, 0);
            int[] iArr2 = b0Var.f14899s;
            GLES20.glDeleteFramebuffers(iArr2.length, iArr2, 0);
            this.f15100x = null;
        }
        int i12 = this.f15096s;
        if (i12 != 0) {
            GLES20.glDeleteTextures(1, new int[]{i12}, 0);
            this.f15096s = 0;
        }
        EGLDisplay eGLDisplay2 = this.f15093p;
        if (eGLDisplay2 != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT);
            EGLSurface eGLSurface3 = this.f15095r;
            if (eGLSurface3 != EGL14.EGL_NO_SURFACE) {
                EGL14.eglDestroySurface(this.f15093p, eGLSurface3);
            }
            EGLContext eGLContext2 = this.f15094q;
            if (eGLContext2 != EGL14.EGL_NO_CONTEXT) {
                EGL14.eglDestroyContext(this.f15093p, eGLContext2);
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f15093p);
        }
        this.f15093p = EGL14.EGL_NO_DISPLAY;
        this.f15094q = EGL14.EGL_NO_CONTEXT;
        this.f15095r = EGL14.EGL_NO_SURFACE;
    }

    public final void g() {
        int i10;
        GLES20.glBindTexture(36197, this.f15096s);
        if (this.f15084f == this.f15079c) {
            i10 = 9728;
        } else {
            i10 = 9729;
        }
        GLES20.glTexParameteri(36197, 10241, i10);
        GLES20.glTexParameteri(36197, 10240, i10);
    }

    public final void h() {
        Handler handler = this.f15090m;
        HandlerThread handlerThread = this.f15089l;
        if (handler != null) {
            handler.removeCallbacks(this.f15083e0);
        }
        this.f15090m = null;
        this.f15089l = null;
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
        EGLExt.eglPresentationTimeANDROID(this.f15093p, this.f15095r, j3);
        long nanoTime = System.nanoTime();
        if (EGL14.eglSwapBuffers(this.f15093p, this.f15095r)) {
            long nanoTime2 = System.nanoTime();
            this.U++;
            long j10 = nanoTime2 - nanoTime;
            this.P++;
            this.Q += j10;
            this.R = Math.max(this.R, j10);
            if (this.P % 30 == 0) {
                this.f15082e.b("encoder swap: average=" + ((((float) this.Q) / this.P) / 1000000.0f) + " ms, max=" + (((float) this.R) / 1000000.0f) + " ms");
            }
            q qVar = this.f15087j;
            if (qVar != null) {
                m mVar = (m) qVar;
                long j11 = mVar.f15053x;
                int i10 = (int) (j11 % 256);
                mVar.f15041k[i10] = j3 / 1000;
                mVar.f15042l[i10] = nanoTime2;
                mVar.f15053x = j11 + 1;
                synchronized (mVar) {
                    if (mVar.f15050t != null && !mVar.f15051u) {
                        c cVar = mVar.f15050t;
                        mVar.f15050t = null;
                        mVar.f15037f.b("first synchronized video frame submitted");
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
        Handler handler = this.f15090m;
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
        EGLDisplay eGLDisplay = this.f15093p;
        EGLSurface eGLSurface = this.f15095r;
        int[] iArr = this.v;
        if (EGL14.eglQuerySurface(eGLDisplay, eGLSurface, 12375, iArr, 0)) {
            int i10 = iArr[0];
            if (EGL14.eglQuerySurface(this.f15093p, this.f15095r, 12374, iArr, 0)) {
                int i11 = iArr[0];
                if (i10 > 0 && i11 > 0) {
                    if (i10 != this.f15097t || i11 != this.f15098u) {
                        this.f15097t = i10;
                        this.f15098u = i11;
                        this.f15082e.b("EGL output size changed: " + i10 + "x" + i11);
                    }
                }
            }
        }
    }
}
