package g5;

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
import f5.d0;
import java.util.Locale;
public final class k extends HandlerThread implements Handler.Callback {
    public f5.e f7063a;
    public Handler f7064b;
    public Error f7065c;
    public RuntimeException d;
    public l f7066e;

    public final void a(int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        EGLSurface eglCreatePbufferSurface;
        boolean z13;
        this.f7063a.getClass();
        f5.e eVar = this.f7063a;
        int[] iArr = eVar.f6592b;
        boolean z14 = false;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        f5.a.g("eglGetDisplay failed", z10);
        int[] iArr2 = new int[2];
        f5.a.g("eglInitialize failed", EGL14.eglInitialize(eglGetDisplay, iArr2, 0, iArr2, 1));
        eVar.f6593c = eglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr3 = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, f5.e.h, 0, eGLConfigArr, 0, 1, iArr3, 0);
        if (eglChooseConfig && iArr3[0] > 0 && eGLConfigArr[0] != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        Object[] objArr = {Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr3[0]), eGLConfigArr[0]};
        int i11 = d0.f6579a;
        f5.a.g(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z11);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eglCreateContext = EGL14.eglCreateContext(eVar.f6593c, eGLConfig, EGL14.EGL_NO_CONTEXT, i10 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        if (eglCreateContext != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        f5.a.g("eglCreateContext failed", z12);
        eVar.d = eglCreateContext;
        EGLDisplay eGLDisplay = eVar.f6593c;
        if (i10 == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i10 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            if (eglCreatePbufferSurface != null) {
                z13 = true;
            } else {
                z13 = false;
            }
            f5.a.g("eglCreatePbufferSurface failed", z13);
        }
        f5.a.g("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext));
        eVar.f6594e = eglCreatePbufferSurface;
        GLES20.glGenTextures(1, iArr, 0);
        StringBuilder sb2 = new StringBuilder();
        boolean z15 = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z15) {
                sb2.append('\n');
            }
            sb2.append("glError: ");
            sb2.append(GLU.gluErrorString(glGetError));
            z15 = true;
        }
        if (!z15) {
            SurfaceTexture surfaceTexture = new SurfaceTexture(iArr[0]);
            eVar.f6595f = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(eVar);
            SurfaceTexture surfaceTexture2 = this.f7063a.f6595f;
            surfaceTexture2.getClass();
            if (i10 != 0) {
                z14 = true;
            }
            this.f7066e = new l(this, surfaceTexture2, z14);
            return;
        }
        throw new Exception(sb2.toString());
    }

    public final void b() {
        this.f7063a.getClass();
        f5.e eVar = this.f7063a;
        eVar.f6591a.removeCallbacks(eVar);
        try {
            SurfaceTexture surfaceTexture = eVar.f6595f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, eVar.f6592b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = eVar.f6593c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = eVar.f6593c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = eVar.f6594e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(eVar.f6593c, eVar.f6594e);
            }
            EGLContext eGLContext = eVar.d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(eVar.f6593c, eGLContext);
            }
            if (d0.f6579a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = eVar.f6593c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(eVar.f6593c);
            }
            eVar.f6593c = null;
            eVar.d = null;
            eVar.f6594e = null;
            eVar.f6595f = null;
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
                            f5.a.p("PlaceholderSurface", "Failed to release placeholder surface", th2);
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
                } catch (f5.h e10) {
                    f5.a.p("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                    this.d = new IllegalStateException(e10);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e11) {
                    f5.a.p("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                    this.f7065c = e11;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e12) {
                    f5.a.p("PlaceholderSurface", "Failed to initialize placeholder surface", e12);
                    this.d = e12;
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
