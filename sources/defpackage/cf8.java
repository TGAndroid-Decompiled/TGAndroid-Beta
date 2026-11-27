package defpackage;

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
public final class cf8 extends HandlerThread implements Handler.Callback {
    public zs3 a;
    public Handler b;
    public Error c;
    public RuntimeException d;
    public df8 e;

    public final void a(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        EGLSurface eglCreatePbufferSurface;
        boolean z4;
        this.a.getClass();
        zs3 zs3Var = this.a;
        int[] iArr = zs3Var.b;
        boolean z5 = false;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            z = true;
        } else {
            z = false;
        }
        one.a("eglGetDisplay failed", z);
        int[] iArr2 = new int[2];
        one.a("eglInitialize failed", EGL14.eglInitialize(eglGetDisplay, iArr2, 0, iArr2, 1));
        zs3Var.c = eglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr3 = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, zs3.h, 0, eGLConfigArr, 0, 1, iArr3, 0);
        if (eglChooseConfig && iArr3[0] > 0 && eGLConfigArr[0] != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        Object[] objArr = {Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr3[0]), eGLConfigArr[0]};
        String str = gcc.a;
        one.a(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z2);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eglCreateContext = EGL14.eglCreateContext(zs3Var.c, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        if (eglCreateContext != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        one.a("eglCreateContext failed", z3);
        zs3Var.d = eglCreateContext;
        EGLDisplay eGLDisplay = zs3Var.c;
        if (i == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            if (eglCreatePbufferSurface != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            one.a("eglCreatePbufferSurface failed", z4);
        }
        one.a("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext));
        zs3Var.e = eglCreatePbufferSurface;
        GLES20.glGenTextures(1, iArr, 0);
        StringBuilder sb = new StringBuilder();
        awd.b(4, "initialCapacity");
        Object[] objArr2 = new Object[4];
        boolean z6 = false;
        int i2 = 0;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z6) {
                sb.append('\n');
            }
            String gluErrorString = GLU.gluErrorString(glGetError);
            if (gluErrorString == null) {
                gluErrorString = "error code: 0x" + Integer.toHexString(glGetError);
            }
            sb.append("glError: ");
            sb.append(gluErrorString);
            Integer valueOf = Integer.valueOf(glGetError);
            int i3 = i2 + 1;
            int b = io5.b(objArr2.length, i3);
            if (b > objArr2.length) {
                objArr2 = Arrays.copyOf(objArr2, b);
            }
            objArr2[i2] = valueOf;
            i2 = i3;
            z6 = true;
        }
        if (!z6) {
            SurfaceTexture surfaceTexture = new SurfaceTexture(iArr[0]);
            zs3Var.f = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(zs3Var);
            SurfaceTexture surfaceTexture2 = this.a.f;
            surfaceTexture2.getClass();
            if (i != 0) {
                z5 = true;
            }
            this.e = new df8(this, surfaceTexture2, z5);
            return;
        }
        throw new gy4(sb.toString(), po5.o(i2, objArr2));
    }

    public final void b() {
        this.a.getClass();
        zs3 zs3Var = this.a;
        zs3Var.a.removeCallbacks(zs3Var);
        try {
            SurfaceTexture surfaceTexture = zs3Var.f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, zs3Var.b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = zs3Var.c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = zs3Var.c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = zs3Var.e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(zs3Var.c, zs3Var.e);
            }
            EGLContext eGLContext = zs3Var.d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(zs3Var.c, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = zs3Var.c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(zs3Var.c);
            }
            zs3Var.c = null;
            zs3Var.d = null;
            zs3Var.e = null;
            zs3Var.f = null;
        }
    }

    @Override
    public final boolean handleMessage(Message message) {
        int i = message.what;
        try {
            if (i != 1) {
                if (i == 2) {
                    try {
                        b();
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                }
            } else {
                try {
                    try {
                        a(message.arg1);
                        synchronized (this) {
                            notify();
                        }
                        return true;
                    } catch (RuntimeException e) {
                        efd.d("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                        this.d = e;
                        synchronized (this) {
                            notify();
                        }
                    }
                } catch (gy4 e2) {
                    efd.d("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                    this.d = new IllegalStateException(e2);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e3) {
                    efd.d("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                    this.c = e3;
                    synchronized (this) {
                        notify();
                    }
                }
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }
}
