package d3;

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
import h2.l0;
import java.util.Arrays;
import java.util.Locale;
public final class m extends HandlerThread implements Handler.Callback {
    public h2.l f7445a;
    public Handler f7446b;
    public Error f7447c;
    public RuntimeException d;
    public n f7448e;

    public final void a(int i7) {
        boolean z10;
        boolean z11;
        boolean z12;
        EGLSurface eglCreatePbufferSurface;
        boolean z13;
        this.f7445a.getClass();
        h2.l lVar = this.f7445a;
        int[] iArr = lVar.f13467b;
        boolean z14 = false;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        h2.e.a("eglGetDisplay failed", z10);
        int[] iArr2 = new int[2];
        h2.e.a("eglInitialize failed", EGL14.eglInitialize(eglGetDisplay, iArr2, 0, iArr2, 1));
        lVar.f13468c = eglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr3 = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, h2.l.h, 0, eGLConfigArr, 0, 1, iArr3, 0);
        if (eglChooseConfig && iArr3[0] > 0 && eGLConfigArr[0] != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        Object[] objArr = {Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr3[0]), eGLConfigArr[0]};
        String str = l0.f13471a;
        h2.e.a(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z11);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eglCreateContext = EGL14.eglCreateContext(lVar.f13468c, eGLConfig, EGL14.EGL_NO_CONTEXT, i7 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        if (eglCreateContext != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        h2.e.a("eglCreateContext failed", z12);
        lVar.d = eglCreateContext;
        EGLDisplay eGLDisplay = lVar.f13468c;
        if (i7 == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i7 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            if (eglCreatePbufferSurface != null) {
                z13 = true;
            } else {
                z13 = false;
            }
            h2.e.a("eglCreatePbufferSurface failed", z13);
        }
        h2.e.a("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext));
        lVar.f13469e = eglCreatePbufferSurface;
        GLES20.glGenTextures(1, iArr, 0);
        StringBuilder sb2 = new StringBuilder();
        h9.o.g(4, "initialCapacity");
        Object[] objArr2 = new Object[4];
        boolean z15 = false;
        int i10 = 0;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z15) {
                sb2.append('\n');
            }
            String gluErrorString = GLU.gluErrorString(glGetError);
            if (gluErrorString == null) {
                gluErrorString = "error code: 0x" + Integer.toHexString(glGetError);
            }
            sb2.append("glError: ");
            sb2.append(gluErrorString);
            Integer valueOf = Integer.valueOf(glGetError);
            int i11 = i10 + 1;
            int b10 = h9.c0.b(objArr2.length, i11);
            if (b10 > objArr2.length) {
                objArr2 = Arrays.copyOf(objArr2, b10);
            }
            objArr2[i10] = valueOf;
            i10 = i11;
            z15 = true;
        }
        if (!z15) {
            SurfaceTexture surfaceTexture = new SurfaceTexture(iArr[0]);
            lVar.f13470f = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(lVar);
            SurfaceTexture surfaceTexture2 = this.f7445a.f13470f;
            surfaceTexture2.getClass();
            if (i7 != 0) {
                z14 = true;
            }
            this.f7448e = new n(this, surfaceTexture2, z14);
            return;
        }
        throw new h2.m(sb2.toString(), h9.i0.o(i10, objArr2));
    }

    public final void b() {
        this.f7445a.getClass();
        h2.l lVar = this.f7445a;
        lVar.f13466a.removeCallbacks(lVar);
        try {
            SurfaceTexture surfaceTexture = lVar.f13470f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, lVar.f13467b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = lVar.f13468c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = lVar.f13468c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = lVar.f13469e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(lVar.f13468c, lVar.f13469e);
            }
            EGLContext eGLContext = lVar.d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(lVar.f13468c, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = lVar.f13468c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(lVar.f13468c);
            }
            lVar.f13468c = null;
            lVar.d = null;
            lVar.f13469e = null;
            lVar.f13470f = null;
        }
    }

    @Override
    public final boolean handleMessage(Message message) {
        int i7 = message.what;
        try {
            if (i7 != 1) {
                if (i7 == 2) {
                    try {
                        b();
                        return true;
                    } catch (Throwable th2) {
                        try {
                            h2.a.d("PlaceholderSurface", "Failed to release placeholder surface", th2);
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
                } catch (h2.m e10) {
                    h2.a.d("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                    this.d = new IllegalStateException(e10);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e11) {
                    h2.a.d("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                    this.f7447c = e11;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e12) {
                    h2.a.d("PlaceholderSurface", "Failed to initialize placeholder surface", e12);
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
