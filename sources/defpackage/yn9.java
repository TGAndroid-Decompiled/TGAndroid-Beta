package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
public final class yn9 {
    public static final float[] n = {-1.0f, -1.0f, 0.0f, 0.0f, 1.0f, -1.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f};
    public final short a;
    public final FloatBuffer d;
    public final HandlerThread e;
    public int i;
    public int j;
    public SurfaceTexture k;
    public Surface l;
    public boolean m;
    public final Object b = new Object();
    public final float[] c = new float[16];
    public EGLDisplay f = EGL14.EGL_NO_DISPLAY;
    public EGLContext g = EGL14.EGL_NO_CONTEXT;
    public EGLSurface h = EGL14.EGL_NO_SURFACE;

    public yn9(Surface surface, int i) {
        this.a = i;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(64).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.d = asFloatBuffer;
        asFloatBuffer.put(n).position(0);
        HandlerThread handlerThread = new HandlerThread("RoundVideoTranscoderFrames");
        this.e = handlerThread;
        handlerThread.start();
        try {
            c(surface);
            this.i = b();
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            int i2 = iArr[0];
            this.j = i2;
            GLES20.glBindTexture(36197, i2);
            GLES20.glTexParameteri(36197, 10241, 9729);
            GLES20.glTexParameteri(36197, 10240, 9729);
            GLES20.glTexParameteri(36197, 10242, 33071);
            GLES20.glTexParameteri(36197, 10243, 33071);
            SurfaceTexture surfaceTexture = new SurfaceTexture(this.j);
            this.k = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(new pb1(this, (byte) 2), new Handler(handlerThread.getLooper()));
            this.l = new Surface(this.k);
        } catch (RuntimeException e) {
            d();
            throw e;
        }
    }

    public static int a(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        dq9.m(b10.h("Unable to compile shader: ", glGetShaderInfoLog));
        return 0;
    }

    public static int b() {
        int a = a(35633, "uniform mat4 uTextureMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = aPosition;\n    vTextureCoord = (uTextureMatrix * aTextureCoord).xy;\n}\n");
        int a2 = a(35632, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
        int glCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram, a);
        GLES20.glAttachShader(glCreateProgram, a2);
        GLES20.glLinkProgram(glCreateProgram);
        GLES20.glDeleteShader(a);
        GLES20.glDeleteShader(a2);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateProgram;
        }
        String glGetProgramInfoLog = GLES20.glGetProgramInfoLog(glCreateProgram);
        GLES20.glDeleteProgram(glCreateProgram);
        dq9.m(b10.h("Unable to link program: ", glGetProgramInfoLog));
        return 0;
    }

    public final void c(Surface surface) {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f = eglGetDisplay;
        int[] iArr = new int[2];
        if (eglGetDisplay != EGL14.EGL_NO_DISPLAY && EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr2 = new int[1];
            if (EGL14.eglChooseConfig(this.f, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] != 0) {
                EGLContext eglCreateContext = EGL14.eglCreateContext(this.f, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                this.g = eglCreateContext;
                if (eglCreateContext != EGL14.EGL_NO_CONTEXT) {
                    EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.f, eGLConfigArr[0], surface, new int[]{12344}, 0);
                    this.h = eglCreateWindowSurface;
                    if (eglCreateWindowSurface != EGL14.EGL_NO_SURFACE) {
                        if (EGL14.eglMakeCurrent(this.f, eglCreateWindowSurface, eglCreateWindowSurface, this.g)) {
                            return;
                        }
                        dq9.m("Unable to make EGL context current");
                        return;
                    }
                    dq9.m("Unable to create EGL surface");
                    return;
                }
                dq9.m("Unable to create EGL context");
                return;
            }
            dq9.m("Unable to choose EGL config");
            return;
        }
        dq9.m("Unable to initialize EGL");
    }

    public final void d() {
        EGLDisplay eGLDisplay = this.f;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = this.h;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.g);
            int i = this.i;
            if (i != 0) {
                GLES20.glDeleteProgram(i);
            }
            int i2 = this.j;
            if (i2 != 0) {
                GLES20.glDeleteTextures(1, new int[]{i2}, 0);
            }
            EGLDisplay eGLDisplay2 = this.f;
            EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT);
            EGLSurface eGLSurface3 = this.h;
            if (eGLSurface3 != EGL14.EGL_NO_SURFACE) {
                EGL14.eglDestroySurface(this.f, eGLSurface3);
            }
            EGLContext eGLContext = this.g;
            if (eGLContext != EGL14.EGL_NO_CONTEXT) {
                EGL14.eglDestroyContext(this.f, eGLContext);
            }
            EGL14.eglReleaseThread();
        }
        this.f = EGL14.EGL_NO_DISPLAY;
        this.g = EGL14.EGL_NO_CONTEXT;
        this.h = EGL14.EGL_NO_SURFACE;
        this.i = 0;
        this.j = 0;
        Surface surface = this.l;
        if (surface != null) {
            surface.release();
            this.l = null;
        }
        SurfaceTexture surfaceTexture = this.k;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.k = null;
        }
        this.e.quitSafely();
    }
}
