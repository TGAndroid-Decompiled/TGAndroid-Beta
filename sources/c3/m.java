package c3;

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
import g2.n0;
import java.util.Arrays;
import java.util.Locale;
public final class m extends HandlerThread implements Handler.Callback {
    public g2.m f4082a;
    public Handler f4083b;
    public Error f4084c;
    public RuntimeException d;
    public n f4085e;

    public final void a(int i3) {
        boolean z10;
        boolean z11;
        boolean z12;
        EGLSurface eglCreatePbufferSurface;
        boolean z13;
        this.f4082a.getClass();
        g2.m mVar = this.f4082a;
        int[] iArr = mVar.f11868b;
        boolean z14 = false;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        g2.f.a("eglGetDisplay failed", z10);
        int[] iArr2 = new int[2];
        g2.f.a("eglInitialize failed", EGL14.eglInitialize(eglGetDisplay, iArr2, 0, iArr2, 1));
        mVar.f11869c = eglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr3 = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, g2.m.h, 0, eGLConfigArr, 0, 1, iArr3, 0);
        if (eglChooseConfig && iArr3[0] > 0 && eGLConfigArr[0] != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        Object[] objArr = {Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr3[0]), eGLConfigArr[0]};
        String str = n0.f11873a;
        g2.f.a(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z11);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eglCreateContext = EGL14.eglCreateContext(mVar.f11869c, eGLConfig, EGL14.EGL_NO_CONTEXT, i3 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        if (eglCreateContext != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        g2.f.a("eglCreateContext failed", z12);
        mVar.d = eglCreateContext;
        EGLDisplay eGLDisplay = mVar.f11869c;
        if (i3 == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i3 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            if (eglCreatePbufferSurface != null) {
                z13 = true;
            } else {
                z13 = false;
            }
            g2.f.a("eglCreatePbufferSurface failed", z13);
        }
        g2.f.a("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext));
        mVar.f11870e = eglCreatePbufferSurface;
        GLES20.glGenTextures(1, iArr, 0);
        StringBuilder sb2 = new StringBuilder();
        g9.o.g(4, "initialCapacity");
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
            int b10 = g9.c0.b(objArr2.length, i11);
            if (b10 > objArr2.length) {
                objArr2 = Arrays.copyOf(objArr2, b10);
            }
            objArr2[i10] = valueOf;
            i10 = i11;
            z15 = true;
        }
        if (!z15) {
            SurfaceTexture surfaceTexture = new SurfaceTexture(iArr[0]);
            mVar.f11871f = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(mVar);
            SurfaceTexture surfaceTexture2 = this.f4082a.f11871f;
            surfaceTexture2.getClass();
            if (i3 != 0) {
                z14 = true;
            }
            this.f4085e = new n(this, surfaceTexture2, z14);
            return;
        }
        throw new g2.n(sb2.toString(), g9.i0.o(i10, objArr2));
    }

    public final void b() {
        this.f4082a.getClass();
        g2.m mVar = this.f4082a;
        mVar.f11867a.removeCallbacks(mVar);
        try {
            SurfaceTexture surfaceTexture = mVar.f11871f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, mVar.f11868b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = mVar.f11869c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = mVar.f11869c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = mVar.f11870e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(mVar.f11869c, mVar.f11870e);
            }
            EGLContext eGLContext = mVar.d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(mVar.f11869c, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = mVar.f11869c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(mVar.f11869c);
            }
            mVar.f11869c = null;
            mVar.d = null;
            mVar.f11870e = null;
            mVar.f11871f = null;
        }
    }

    @Override
    public final boolean handleMessage(Message message) {
        int i3 = message.what;
        try {
            if (i3 != 1) {
                if (i3 == 2) {
                    try {
                        b();
                        return true;
                    } catch (Throwable th2) {
                        try {
                            g2.a.d("PlaceholderSurface", "Failed to release placeholder surface", th2);
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
                } catch (g2.n e10) {
                    g2.a.d("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                    this.d = new IllegalStateException(e10);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e11) {
                    g2.a.d("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                    this.f4084c = e11;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e12) {
                    g2.a.d("PlaceholderSurface", "Failed to initialize placeholder surface", e12);
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
