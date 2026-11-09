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
import h2.m0;
import java.util.Arrays;
import java.util.Locale;
public final class m extends HandlerThread implements Handler.Callback {
    public h2.l f8054a;
    public Handler f8055b;
    public Error f8056c;
    public RuntimeException d;
    public n f8057e;

    public final void a(int i7) {
        boolean z9;
        boolean z10;
        boolean z11;
        EGLSurface eglCreatePbufferSurface;
        boolean z12;
        this.f8054a.getClass();
        h2.l lVar = this.f8054a;
        int[] iArr = lVar.f14107b;
        boolean z13 = false;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        h2.e.a("eglGetDisplay failed", z9);
        int[] iArr2 = new int[2];
        h2.e.a("eglInitialize failed", EGL14.eglInitialize(eglGetDisplay, iArr2, 0, iArr2, 1));
        lVar.f14108c = eglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr3 = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, h2.l.h, 0, eGLConfigArr, 0, 1, iArr3, 0);
        if (eglChooseConfig && iArr3[0] > 0 && eGLConfigArr[0] != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        Object[] objArr = {Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr3[0]), eGLConfigArr[0]};
        String str = m0.f14112a;
        h2.e.a(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z10);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eglCreateContext = EGL14.eglCreateContext(lVar.f14108c, eGLConfig, EGL14.EGL_NO_CONTEXT, i7 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        if (eglCreateContext != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        h2.e.a("eglCreateContext failed", z11);
        lVar.d = eglCreateContext;
        EGLDisplay eGLDisplay = lVar.f14108c;
        if (i7 == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i7 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            if (eglCreatePbufferSurface != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            h2.e.a("eglCreatePbufferSurface failed", z12);
        }
        h2.e.a("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext));
        lVar.f14109e = eglCreatePbufferSurface;
        GLES20.glGenTextures(1, iArr, 0);
        StringBuilder sb2 = new StringBuilder();
        h9.o.g(4, "initialCapacity");
        Object[] objArr2 = new Object[4];
        boolean z14 = false;
        int i10 = 0;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z14) {
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
            z14 = true;
        }
        if (!z14) {
            SurfaceTexture surfaceTexture = new SurfaceTexture(iArr[0]);
            lVar.f14110f = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(lVar);
            SurfaceTexture surfaceTexture2 = this.f8054a.f14110f;
            surfaceTexture2.getClass();
            if (i7 != 0) {
                z13 = true;
            }
            this.f8057e = new n(this, surfaceTexture2, z13);
            return;
        }
        throw new h2.m(sb2.toString(), h9.i0.o(i10, objArr2));
    }

    public final void b() {
        this.f8054a.getClass();
        h2.l lVar = this.f8054a;
        lVar.f14106a.removeCallbacks(lVar);
        try {
            SurfaceTexture surfaceTexture = lVar.f14110f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, lVar.f14107b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = lVar.f14108c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = lVar.f14108c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = lVar.f14109e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(lVar.f14108c, lVar.f14109e);
            }
            EGLContext eGLContext = lVar.d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(lVar.f14108c, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = lVar.f14108c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(lVar.f14108c);
            }
            lVar.f14108c = null;
            lVar.d = null;
            lVar.f14109e = null;
            lVar.f14110f = null;
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
                    this.f8056c = e11;
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
