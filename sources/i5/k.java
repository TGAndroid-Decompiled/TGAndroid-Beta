package i5;

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
import h5.d0;
import java.util.Locale;
public final class k extends HandlerThread implements Handler.Callback {
    public h5.f f7305a;
    public Handler f7306b;
    public Error f7307c;
    public RuntimeException d;
    public l e;

    public final void a(int i10) {
        boolean z4;
        boolean z10;
        boolean z11;
        EGLSurface eglCreatePbufferSurface;
        boolean z12;
        this.f7305a.getClass();
        h5.f fVar = this.f7305a;
        int[] iArr = fVar.f6952b;
        boolean z13 = false;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        h5.a.g("eglGetDisplay failed", z4);
        int[] iArr2 = new int[2];
        h5.a.g("eglInitialize failed", EGL14.eglInitialize(eglGetDisplay, iArr2, 0, iArr2, 1));
        fVar.f6953c = eglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr3 = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, h5.f.h, 0, eGLConfigArr, 0, 1, iArr3, 0);
        if (eglChooseConfig && iArr3[0] > 0 && eGLConfigArr[0] != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        Object[] objArr = {Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr3[0]), eGLConfigArr[0]};
        int i11 = d0.f6937a;
        h5.a.g(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z10);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eglCreateContext = EGL14.eglCreateContext(fVar.f6953c, eGLConfig, EGL14.EGL_NO_CONTEXT, i10 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        if (eglCreateContext != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        h5.a.g("eglCreateContext failed", z11);
        fVar.d = eglCreateContext;
        EGLDisplay eGLDisplay = fVar.f6953c;
        if (i10 == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i10 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            if (eglCreatePbufferSurface != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            h5.a.g("eglCreatePbufferSurface failed", z12);
        }
        h5.a.g("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext));
        fVar.e = eglCreatePbufferSurface;
        GLES20.glGenTextures(1, iArr, 0);
        StringBuilder sb = new StringBuilder();
        boolean z14 = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z14) {
                sb.append('\n');
            }
            sb.append("glError: ");
            sb.append(GLU.gluErrorString(glGetError));
            z14 = true;
        }
        if (!z14) {
            SurfaceTexture surfaceTexture = new SurfaceTexture(iArr[0]);
            fVar.f6954f = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(fVar);
            SurfaceTexture surfaceTexture2 = this.f7305a.f6954f;
            surfaceTexture2.getClass();
            if (i10 != 0) {
                z13 = true;
            }
            this.e = new l(this, surfaceTexture2, z13);
            return;
        }
        throw new Exception(sb.toString());
    }

    public final void b() {
        this.f7305a.getClass();
        h5.f fVar = this.f7305a;
        fVar.f6951a.removeCallbacks(fVar);
        try {
            SurfaceTexture surfaceTexture = fVar.f6954f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, fVar.f6952b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = fVar.f6953c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = fVar.f6953c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = fVar.e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(fVar.f6953c, fVar.e);
            }
            EGLContext eGLContext = fVar.d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(fVar.f6953c, eGLContext);
            }
            if (d0.f6937a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = fVar.f6953c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(fVar.f6953c);
            }
            fVar.f6953c = null;
            fVar.d = null;
            fVar.e = null;
            fVar.f6954f = null;
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
                            h5.a.p("PlaceholderSurface", "Failed to release placeholder surface", th2);
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
                } catch (h5.h e) {
                    h5.a.p("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                    this.d = new IllegalStateException(e);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e6) {
                    h5.a.p("PlaceholderSurface", "Failed to initialize placeholder surface", e6);
                    this.f7307c = e6;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e10) {
                    h5.a.p("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                    this.d = e10;
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
