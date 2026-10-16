package a3;

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
import java.util.Arrays;
import java.util.Locale;
public final class o extends HandlerThread implements Handler.Callback {
    public e2.l f173a;
    public Handler f174b;
    public Error f175c;
    public RuntimeException d;
    public p e;

    public final void a(int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        EGLSurface eglCreatePbufferSurface;
        boolean z13;
        this.f173a.getClass();
        e2.l lVar = this.f173a;
        int[] iArr = lVar.f8371b;
        boolean z14 = false;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.e.a("eglGetDisplay failed", z10);
        int[] iArr2 = new int[2];
        e2.e.a("eglInitialize failed", EGL14.eglInitialize(eglGetDisplay, iArr2, 0, iArr2, 1));
        lVar.f8372c = eglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr3 = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, e2.l.h, 0, eGLConfigArr, 0, 1, iArr3, 0);
        if (eglChooseConfig && iArr3[0] > 0 && eGLConfigArr[0] != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        Object[] objArr = {Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr3[0]), eGLConfigArr[0]};
        String str = e2.m0.f8375a;
        e2.e.a(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z11);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eglCreateContext = EGL14.eglCreateContext(lVar.f8372c, eGLConfig, EGL14.EGL_NO_CONTEXT, i10 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        if (eglCreateContext != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        e2.e.a("eglCreateContext failed", z12);
        lVar.d = eglCreateContext;
        EGLDisplay eGLDisplay = lVar.f8372c;
        if (i10 == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i10 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            if (eglCreatePbufferSurface != null) {
                z13 = true;
            } else {
                z13 = false;
            }
            e2.e.a("eglCreatePbufferSurface failed", z13);
        }
        e2.e.a("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext));
        lVar.e = eglCreatePbufferSurface;
        GLES20.glGenTextures(1, iArr, 0);
        StringBuilder sb2 = new StringBuilder();
        e9.s.f(4, "initialCapacity");
        Object[] objArr2 = new Object[4];
        boolean z15 = false;
        int i11 = 0;
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
            int i12 = i11 + 1;
            int b10 = e9.h0.b(objArr2.length, i12);
            if (b10 > objArr2.length) {
                objArr2 = Arrays.copyOf(objArr2, b10);
            }
            objArr2[i11] = valueOf;
            i11 = i12;
            z15 = true;
        }
        if (!z15) {
            SurfaceTexture surfaceTexture = new SurfaceTexture(iArr[0]);
            lVar.f8373f = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(lVar);
            SurfaceTexture surfaceTexture2 = this.f173a.f8373f;
            surfaceTexture2.getClass();
            if (i10 != 0) {
                z14 = true;
            }
            this.e = new p(this, surfaceTexture2, z14);
            return;
        }
        throw new e2.m(sb2.toString(), e9.n0.s(i11, objArr2));
    }

    public final void b() {
        this.f173a.getClass();
        e2.l lVar = this.f173a;
        lVar.f8370a.removeCallbacks(lVar);
        try {
            SurfaceTexture surfaceTexture = lVar.f8373f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, lVar.f8371b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = lVar.f8372c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = lVar.f8372c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = lVar.e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(lVar.f8372c, lVar.e);
            }
            EGLContext eGLContext = lVar.d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(lVar.f8372c, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = lVar.f8372c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(lVar.f8372c);
            }
            lVar.f8372c = null;
            lVar.d = null;
            lVar.e = null;
            lVar.f8373f = null;
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
                            e2.a.d("PlaceholderSurface", "Failed to release placeholder surface", th2);
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
                } catch (e2.m e) {
                    e2.a.d("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                    this.d = new IllegalStateException(e);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e7) {
                    e2.a.d("PlaceholderSurface", "Failed to initialize placeholder surface", e7);
                    this.f175c = e7;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e10) {
                    e2.a.d("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
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
