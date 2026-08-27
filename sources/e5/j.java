package e5;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import d5.g0;
import java.util.Locale;

public final class j extends HandlerThread implements Handler.Callback {

    public d5.e f5265a;

    public Handler f5266b;

    public Error f5267c;
    public RuntimeException d;

    public k f5268e;

    public final void a(int i10) throws d5.h {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        this.f5265a.getClass();
        d5.e eVar = this.f5265a;
        int[] iArr = eVar.f4784b;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        d5.a.g("eglGetDisplay failed", eGLDisplayEglGetDisplay != null);
        int[] iArr2 = new int[2];
        d5.a.g("eglInitialize failed", EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr2, 0, iArr2, 1));
        eVar.f4785c = eGLDisplayEglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr3 = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, d5.e.h, 0, eGLConfigArr, 0, 1, iArr3, 0);
        boolean z10 = zEglChooseConfig && iArr3[0] > 0 && eGLConfigArr[0] != null;
        Object[] objArr = {Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr3[0]), eGLConfigArr[0]};
        int i11 = g0.f4795a;
        d5.a.g(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z10);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eVar.f4785c, eGLConfig, EGL14.EGL_NO_CONTEXT, i10 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        d5.a.g("eglCreateContext failed", eGLContextEglCreateContext != null);
        eVar.d = eGLContextEglCreateContext;
        EGLDisplay eGLDisplay = eVar.f4785c;
        if (i10 == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i10 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            d5.a.g("eglCreatePbufferSurface failed", eGLSurfaceEglCreatePbufferSurface != null);
        }
        d5.a.g("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext));
        eVar.f4786e = eGLSurfaceEglCreatePbufferSurface;
        GLES20.glGenTextures(1, iArr, 0);
        StringBuilder sb2 = new StringBuilder();
        boolean z11 = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z11) {
                sb2.append('\n');
            }
            sb2.append("glError: ");
            sb2.append(GLU.gluErrorString(iGlGetError));
            z11 = true;
        }
        if (z11) {
            throw new d5.h(sb2.toString());
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr[0]);
        eVar.f4787f = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(eVar);
        SurfaceTexture surfaceTexture2 = this.f5265a.f4787f;
        surfaceTexture2.getClass();
        this.f5268e = new k(this, surfaceTexture2, i10 != 0);
    }

    public final void b() {
        this.f5265a.getClass();
        d5.e eVar = this.f5265a;
        eVar.f4783a.removeCallbacks(eVar);
        try {
            SurfaceTexture surfaceTexture = eVar.f4787f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, eVar.f4784b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = eVar.f4785c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = eVar.f4785c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = eVar.f4786e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(eVar.f4785c, eVar.f4786e);
            }
            EGLContext eGLContext = eVar.d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(eVar.f4785c, eGLContext);
            }
            if (g0.f4795a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = eVar.f4785c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(eVar.f4785c);
            }
            eVar.f4785c = null;
            eVar.d = null;
            eVar.f4786e = null;
            eVar.f4787f = null;
        }
    }

    @Override
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        try {
            if (i10 == 1) {
                try {
                    a(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                    return true;
                } catch (d5.h e9) {
                    d5.a.p("PlaceholderSurface", "Failed to initialize placeholder surface", e9);
                    this.d = new IllegalStateException(e9);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e10) {
                    d5.a.p("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                    this.f5267c = e10;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e11) {
                    d5.a.p("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                    this.d = e11;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i10 == 2) {
                try {
                    b();
                    quit();
                    return true;
                } catch (Throwable th) {
                    try {
                        d5.a.p("PlaceholderSurface", "Failed to release placeholder surface", th);
                        return true;
                    } finally {
                        quit();
                    }
                }
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }
}
