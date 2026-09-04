package a3;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.Locale;
public final class n extends HandlerThread implements Handler.Callback {
    public e2.j f161a;
    public Handler f162b;
    public Error f163c;
    public RuntimeException d;
    public o f164e;

    public final void a(int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        EGLSurface eglCreatePbufferSurface;
        boolean z13;
        this.f161a.getClass();
        e2.j jVar = this.f161a;
        int[] iArr = jVar.f8759b;
        boolean z14 = false;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.a.c("eglGetDisplay failed", z10);
        int[] iArr2 = new int[2];
        e2.a.c("eglInitialize failed", EGL14.eglInitialize(eglGetDisplay, iArr2, 0, iArr2, 1));
        jVar.f8760c = eglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr3 = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, e2.j.h, 0, eGLConfigArr, 0, 1, iArr3, 0);
        if (eglChooseConfig && iArr3[0] > 0 && eGLConfigArr[0] != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        Object[] objArr = {Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr3[0]), eGLConfigArr[0]};
        String str = e2.d0.f8737a;
        e2.a.c(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z11);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eglCreateContext = EGL14.eglCreateContext(jVar.f8760c, eGLConfig, EGL14.EGL_NO_CONTEXT, i10 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        if (eglCreateContext != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        e2.a.c("eglCreateContext failed", z12);
        jVar.d = eglCreateContext;
        EGLDisplay eGLDisplay = jVar.f8760c;
        if (i10 == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i10 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            if (eglCreatePbufferSurface != null) {
                z13 = true;
            } else {
                z13 = false;
            }
            e2.a.c("eglCreatePbufferSurface failed", z13);
        }
        e2.a.c("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext));
        jVar.f8761e = eglCreatePbufferSurface;
        GLES20.glGenTextures(1, iArr, 0);
        e2.a.b();
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr[0]);
        jVar.f8762f = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(jVar);
        SurfaceTexture surfaceTexture2 = this.f161a.f8762f;
        surfaceTexture2.getClass();
        if (i10 != 0) {
            z14 = true;
        }
        this.f164e = new o(this, surfaceTexture2, z14);
    }

    public final void b() {
        this.f161a.getClass();
        e2.j jVar = this.f161a;
        jVar.f8758a.removeCallbacks(jVar);
        try {
            SurfaceTexture surfaceTexture = jVar.f8762f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, jVar.f8759b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = jVar.f8760c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = jVar.f8760c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = jVar.f8761e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(jVar.f8760c, jVar.f8761e);
            }
            EGLContext eGLContext = jVar.d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(jVar.f8760c, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = jVar.f8760c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(jVar.f8760c);
            }
            jVar.f8760c = null;
            jVar.d = null;
            jVar.f8761e = null;
            jVar.f8762f = null;
        }
    }

    @Override
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        try {
            if (i10 != 1) {
                if (i10 == 2) {
                    try {
                        b();
                        return true;
                    } catch (Throwable th2) {
                        try {
                            e2.a.f("PlaceholderSurface", "Failed to release placeholder surface", th2);
                            return true;
                        } finally {
                            quit();
                        }
                    }
                }
            } else {
                try {
                    a(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                    return true;
                } catch (e2.k e7) {
                    e2.a.f("PlaceholderSurface", "Failed to initialize placeholder surface", e7);
                    this.d = new IllegalStateException(e7);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e10) {
                    e2.a.f("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                    this.f163c = e10;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e11) {
                    e2.a.f("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                    this.d = e11;
                    synchronized (this) {
                        notify();
                    }
                }
            }
            return true;
        } catch (Throwable th3) {
            synchronized (this) {
                notify();
                throw th3;
            }
        }
    }
}
