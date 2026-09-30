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
    public Size f13818a;
    public final Surface f13820b;
    public volatile a f13821b0;
    public final int f13822c;
    public boolean f13823c0;
    public final boolean d;
    public volatile RuntimeException f13824d0;
    public final m e;
    public int f13826f;
    public boolean f13827g;
    public final p f13829j;
    public final b f13830k;
    public HandlerThread f13831l;
    public Handler f13832m;
    public SurfaceTexture f13833n;
    public Surface f13834o;
    public int f13838s;
    public int f13839t;
    public int f13840u;
    public a0 f13842x;
    public int f13843y;
    public long f13844z;
    public volatile long f13828i = Long.MAX_VALUE;
    public EGLDisplay f13835p = EGL14.EGL_NO_DISPLAY;
    public EGLContext f13836q = EGL14.EGL_NO_CONTEXT;
    public EGLSurface f13837r = EGL14.EGL_NO_SURFACE;
    public final int[] v = new int[1];
    public final float[] f13841w = new float[16];
    public long A = -1;
    public long C = -1;
    public final n f13825e0 = new n(this, 0);
    public volatile long h = 0;
    public volatile boolean f13819a0 = false;

    public q(Size size, Surface surface, int i10, int i11, boolean z10, boolean z11, m mVar, p pVar, b bVar) {
        this.f13818a = size;
        this.f13820b = surface;
        this.f13822c = i10;
        this.f13826f = i11;
        this.f13827g = z10;
        this.d = z11;
        this.e = mVar;
        this.f13839t = i10;
        this.f13840u = i10;
        this.f13829j = pVar;
        this.f13830k = bVar;
    }

    public static void a(String str, boolean z10) {
        if (z10) {
            return;
        }
        StringBuilder h = v7.j.h(str, ": 0x");
        h.append(Integer.toHexString(EGL14.eglGetError()));
        throw new IllegalStateException(h.toString());
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
        float f7 = ((this.f13842x.f13654a * 4.0f) / 48.0f) * 1.15f;
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
        this.f13835p = eglGetDisplay;
        if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr2 = new int[1];
                if (EGL14.eglChooseConfig(this.f13835p, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] != 0) {
                    EGLContext eglCreateContext = EGL14.eglCreateContext(this.f13835p, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                    this.f13836q = eglCreateContext;
                    if (eglCreateContext != EGL14.EGL_NO_CONTEXT) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    a("Unable to create EGL context", z10);
                    EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.f13835p, eGLConfigArr[0], this.f13820b, new int[]{12344}, 0);
                    this.f13837r = eglCreateWindowSurface;
                    if (eglCreateWindowSurface != EGL14.EGL_NO_SURFACE) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    a("Unable to create EGL surface", z11);
                    EGLDisplay eGLDisplay = this.f13835p;
                    EGLSurface eGLSurface = this.f13837r;
                    if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f13836q)) {
                        this.e.b("GL initialized: egl=" + iArr[0] + "." + iArr[1] + ", vendor=" + GLES20.glGetString(7936) + ", renderer=" + GLES20.glGetString(7937) + ", version=" + GLES20.glGetString(7938) + ", elapsedMs=" + ((System.nanoTime() - this.Y) / 1000000));
                        int[] iArr3 = new int[1];
                        GLES20.glGenTextures(1, iArr3, 0);
                        int i10 = iArr3[0];
                        this.f13838s = i10;
                        GLES20.glBindTexture(36197, i10);
                        g();
                        GLES20.glTexParameteri(36197, 10242, 33071);
                        GLES20.glTexParameteri(36197, 10243, 33071);
                        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f13838s);
                        this.f13833n = surfaceTexture;
                        surfaceTexture.setDefaultBufferSize(this.f13818a.getWidth(), this.f13818a.getHeight());
                        this.f13833n.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() {
                            @Override
                            public final void onFrameAvailable(android.graphics.SurfaceTexture r21) {
                                throw new UnsupportedOperationException("Method not decompiled: ki.o.onFrameAvailable(android.graphics.SurfaceTexture):void");
                            }
                        }, this.f13832m);
                        this.f13834o = new Surface(this.f13833n);
                        Size size = this.f13818a;
                        int i11 = this.f13826f;
                        boolean z12 = this.d;
                        int i12 = this.f13822c;
                        this.f13842x = new a0(i12, size, i11, z12);
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
        this.e.b(sb2.toString());
        Handler handler = this.f13832m;
        if (handler != null) {
            handler.removeCallbacks(this.f13825e0);
        }
        EGLDisplay eGLDisplay = this.f13835p;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY && (eGLSurface = this.f13837r) != EGL14.EGL_NO_SURFACE && (eGLContext = this.f13836q) != EGL14.EGL_NO_CONTEXT) {
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
        }
        SurfaceTexture surfaceTexture = this.f13833n;
        if (surfaceTexture != null) {
            surfaceTexture.setOnFrameAvailableListener(null);
        }
        Surface surface = this.f13834o;
        if (surface != null) {
            surface.release();
            this.f13834o = null;
        }
        SurfaceTexture surfaceTexture2 = this.f13833n;
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
            this.f13833n = null;
        }
        a0 a0Var = this.f13842x;
        if (a0Var != null) {
            a0Var.f13658g.b();
            a0Var.h.b();
            x xVar = a0Var.f13659i;
            if (xVar != null) {
                xVar.b();
            }
            v vVar = a0Var.f13660j;
            if (vVar != null) {
                vVar.b();
            }
            a0Var.f13661k.b();
            a0Var.f13662l.b();
            a0Var.f13663m.b();
            w wVar = a0Var.f13664n;
            if (wVar != null) {
                wVar.b();
            }
            int[] iArr = a0Var.f13670t;
            GLES20.glDeleteTextures(iArr.length, iArr, 0);
            int[] iArr2 = a0Var.f13669s;
            GLES20.glDeleteFramebuffers(iArr2.length, iArr2, 0);
            this.f13842x = null;
        }
        int i12 = this.f13838s;
        if (i12 != 0) {
            GLES20.glDeleteTextures(1, new int[]{i12}, 0);
            this.f13838s = 0;
        }
        EGLDisplay eGLDisplay2 = this.f13835p;
        if (eGLDisplay2 != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT);
            EGLSurface eGLSurface3 = this.f13837r;
            if (eGLSurface3 != EGL14.EGL_NO_SURFACE) {
                EGL14.eglDestroySurface(this.f13835p, eGLSurface3);
            }
            EGLContext eGLContext2 = this.f13836q;
            if (eGLContext2 != EGL14.EGL_NO_CONTEXT) {
                EGL14.eglDestroyContext(this.f13835p, eGLContext2);
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f13835p);
        }
        this.f13835p = EGL14.EGL_NO_DISPLAY;
        this.f13836q = EGL14.EGL_NO_CONTEXT;
        this.f13837r = EGL14.EGL_NO_SURFACE;
    }

    public final void g() {
        int i10;
        GLES20.glBindTexture(36197, this.f13838s);
        if (this.f13826f == this.f13822c) {
            i10 = 9728;
        } else {
            i10 = 9729;
        }
        GLES20.glTexParameteri(36197, 10241, i10);
        GLES20.glTexParameteri(36197, 10240, i10);
    }

    public final void h() {
        Handler handler = this.f13832m;
        HandlerThread handlerThread = this.f13831l;
        if (handler != null) {
            handler.removeCallbacks(this.f13825e0);
        }
        this.f13832m = null;
        this.f13831l = null;
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
        EGLExt.eglPresentationTimeANDROID(this.f13835p, this.f13837r, j3);
        long nanoTime = System.nanoTime();
        if (EGL14.eglSwapBuffers(this.f13835p, this.f13837r)) {
            long nanoTime2 = System.nanoTime();
            this.U++;
            long j10 = nanoTime2 - nanoTime;
            this.P++;
            this.Q += j10;
            this.R = Math.max(this.R, j10);
            if (this.P % 30 == 0) {
                this.e.b("encoder swap: average=" + ((((float) this.Q) / this.P) / 1000000.0f) + " ms, max=" + (((float) this.R) / 1000000.0f) + " ms");
            }
            p pVar = this.f13829j;
            if (pVar != null) {
                l lVar = (l) pVar;
                long j11 = lVar.f13797x;
                int i10 = (int) (j11 % 256);
                lVar.f13785k[i10] = j3 / 1000;
                lVar.f13786l[i10] = nanoTime2;
                lVar.f13797x = j11 + 1;
                synchronized (lVar) {
                    if (lVar.f13794t != null && !lVar.f13795u) {
                        c cVar = lVar.f13794t;
                        lVar.f13794t = null;
                        lVar.f13781f.b("first synchronized video frame submitted");
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
        Handler handler = this.f13832m;
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
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException("Input size update was interrupted", e);
            }
        }
    }

    public final void k() {
        EGLDisplay eGLDisplay = this.f13835p;
        EGLSurface eGLSurface = this.f13837r;
        int[] iArr = this.v;
        if (EGL14.eglQuerySurface(eGLDisplay, eGLSurface, 12375, iArr, 0)) {
            int i10 = iArr[0];
            if (EGL14.eglQuerySurface(this.f13835p, this.f13837r, 12374, iArr, 0)) {
                int i11 = iArr[0];
                if (i10 > 0 && i11 > 0) {
                    if (i10 != this.f13839t || i11 != this.f13840u) {
                        this.f13839t = i10;
                        this.f13840u = i11;
                        this.e.b("EGL output size changed: " + i10 + "x" + i11);
                    }
                }
            }
        }
    }
}
