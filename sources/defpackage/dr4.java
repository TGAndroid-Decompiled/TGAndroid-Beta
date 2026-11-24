package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.GLUtils;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;
public final class dr4 extends Thread {
    public final SurfaceTexture a;
    public volatile boolean b;
    public boolean c;
    public final er4 d;

    public dr4(er4 er4Var, SurfaceTexture surfaceTexture) {
        this.d = er4Var;
        this.a = surfaceTexture;
    }

    public final void a() {
        int[] iArr;
        int i;
        boolean z;
        er4 er4Var;
        uq4 uq4Var;
        er4 er4Var2 = this.d;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        er4Var2.r = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        er4Var2.f = eglGetDisplay;
        EGLDisplay eGLDisplay = EGL10.EGL_NO_DISPLAY;
        EGL10 egl102 = er4Var2.r;
        if (eglGetDisplay != eGLDisplay) {
            if (egl102.eglInitialize(eglGetDisplay, new int[2])) {
                int[] iArr2 = new int[1];
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (h24.m(er4Var2.getContext()).h()) {
                    iArr = new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12344};
                } else {
                    iArr = new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12326, 0, 12338, 1, 12337, er4Var2.getMsaaSamples(), 12344};
                }
                er4Var2.s = null;
                if (!h24.m(er4Var2.getContext()).h() && er4Var2.r.eglChooseConfig(er4Var2.f, iArr, eGLConfigArr, 1, iArr2) && iArr2[0] != 0) {
                    er4Var2.s = eGLConfigArr[0];
                } else if (er4Var2.r.eglChooseConfig(er4Var2.f, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12326, 0, 12344}, eGLConfigArr, 1, iArr2)) {
                    if (iArr2[0] > 0) {
                        er4Var2.s = eGLConfigArr[0];
                    }
                } else {
                    k32.e(GLUtils.getEGLErrorString(er4Var2.r.eglGetError()), "eglChooseConfig failed ");
                    return;
                }
                EGLConfig eGLConfig = er4Var2.s;
                if (eGLConfig != null) {
                    if (er4Var2.T == 4) {
                        i = 3;
                    } else {
                        i = 2;
                    }
                    EGL10 egl103 = er4Var2.r;
                    EGLDisplay eGLDisplay2 = er4Var2.f;
                    EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
                    EGLContext eglCreateContext = egl103.eglCreateContext(eGLDisplay2, eGLConfig, eGLContext, new int[]{12440, i, 12344});
                    er4Var2.n = eglCreateContext;
                    if (eglCreateContext != null && eglCreateContext != eGLContext) {
                        er4Var2.c();
                        er4Var2.h = er4Var2.r.eglCreateWindowSurface(er4Var2.f, er4Var2.s, er4Var2.c, null);
                        er4Var2.c();
                        EGLSurface eGLSurface = er4Var2.h;
                        if (eGLSurface != null && eGLSurface != EGL10.EGL_NO_SURFACE) {
                            if (er4Var2.r.eglMakeCurrent(er4Var2.f, eGLSurface, eGLSurface, er4Var2.n)) {
                                er4Var2.c();
                                er4Var2.w = (GL10) er4Var2.n.getGL();
                                er4Var2.c();
                            } else {
                                k93.c(GLUtils.getEGLErrorString(er4Var2.r.eglGetError()), "eglMakeCurrent failed ");
                                return;
                            }
                        } else {
                            int eglGetError = er4Var2.r.eglGetError();
                            if (eglGetError == 12299) {
                                fa4.d("eglCreateWindowSurface returned EGL10.EGL_BAD_NATIVE_WINDOW");
                            } else {
                                k93.c(GLUtils.getEGLErrorString(eglGetError), "eglCreateWindowSurface failed ");
                                return;
                            }
                        }
                        this.d.d();
                        long nanoTime = System.nanoTime();
                        while (!this.b) {
                            synchronized (this.d) {
                                if (this.d.I && (uq4Var = (er4Var = this.d).b) != null) {
                                    er4Var.f(uq4Var);
                                    this.d.I = false;
                                }
                            }
                            er4 er4Var3 = this.d;
                            if (er4Var3.b != null && !er4Var3.H) {
                                long nanoTime2 = System.nanoTime();
                                this.d.e(((float) (nanoTime2 - nanoTime)) / 1.0E9f);
                                if (!this.c) {
                                    this.c = true;
                                    gl.d3(new cr4(this, (byte) 1));
                                }
                                nanoTime = nanoTime2;
                            }
                            try {
                                er4 er4Var4 = this.d;
                                if (er4Var4.b != null && !er4Var4.H) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                if (z) {
                                    Thread.sleep(100L);
                                } else {
                                    long nanoTime3 = this.d.x - (System.nanoTime() - nanoTime);
                                    if (nanoTime3 > 0) {
                                        Thread.sleep(nanoTime3 / 1000000, (int) (nanoTime3 % 1000000));
                                    }
                                }
                            } catch (InterruptedException unused) {
                            }
                        }
                        return;
                    }
                    fvc.d(er4Var2.r.eglGetError(), "eglCreateContext failed: ");
                    return;
                }
                wn4.j("eglConfig not initialized");
                return;
            }
            k93.c(GLUtils.getEGLErrorString(er4Var2.r.eglGetError()), "eglInitialize failed ");
            return;
        }
        k93.c(GLUtils.getEGLErrorString(egl102.eglGetError()), "eglGetDisplay failed ");
    }

    @Override
    public final void run() {
        synchronized (this.d.d) {
            if (this.b) {
                return;
            }
            er4 er4Var = this.d;
            er4Var.c = this.a;
            er4Var.I = true;
            try {
                a();
            } catch (Exception e) {
                if (!this.b) {
                    fa4.g(e, true);
                    gl.d3(new cr4(this, (byte) 0));
                }
            }
            this.d.i();
        }
    }
}
