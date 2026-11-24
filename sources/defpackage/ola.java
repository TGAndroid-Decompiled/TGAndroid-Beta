package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLES30;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.Utilities;
public final class ola extends Thread {
    public EGLSurface E;
    public EGLContext F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int[] P;
    public float Q;
    public final pla R;
    public final nla c;
    public final SurfaceTexture d;
    public boolean f;
    public int h;
    public int n;
    public int r;
    public EGL10 w;
    public EGLDisplay x;
    public EGLConfig y;
    public volatile boolean a = true;
    public volatile boolean b = false;
    public final Object e = new Object();
    public final float s = gl.N(1.2f);
    public boolean N = true;
    public int O = 0;

    public ola(pla plaVar, SurfaceTexture surfaceTexture, int i, int i2, nla nlaVar) {
        this.R = plaVar;
        this.c = nlaVar;
        this.d = surfaceTexture;
        this.h = i;
        this.n = i2;
        this.r = (int) Utilities.i(((i * i2) / 250000.0f) * 1000.0f, 10000.0f, 500.0f);
    }

    public static void a() {
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError != 0) {
                fa4.d("spoiler gles error " + glGetError);
            } else {
                return;
            }
        }
    }

    public final void b() {
        int[] iArr = this.P;
        if (iArr != null) {
            GLES20.glDeleteBuffers(2, iArr, 0);
        }
        int[] iArr2 = new int[2];
        this.P = iArr2;
        GLES20.glGenBuffers(2, iArr2, 0);
        for (int i = 0; i < 2; i++) {
            GLES20.glBindBuffer(34962, this.P[i]);
            GLES20.glBufferData(34962, this.r * 24, null, 35048);
        }
        a();
    }

    @Override
    public final void run() {
        float f;
        int i;
        int i2;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.w = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(0);
        this.x = eglGetDisplay;
        int i3 = 3;
        int i4 = 2;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            this.a = false;
        } else {
            if (!this.w.eglInitialize(eglGetDisplay, new int[2])) {
                this.a = false;
            } else {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (!this.w.eglChooseConfig(this.x, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 64, 12344}, eGLConfigArr, 1, new int[1])) {
                    this.a = false;
                } else {
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    this.y = eGLConfig;
                    EGLContext eglCreateContext = this.w.eglCreateContext(this.x, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 3, 12344});
                    this.F = eglCreateContext;
                    if (eglCreateContext == null) {
                        this.a = false;
                    } else {
                        EGLSurface eglCreateWindowSurface = this.w.eglCreateWindowSurface(this.x, this.y, this.d, null);
                        this.E = eglCreateWindowSurface;
                        if (eglCreateWindowSurface == null) {
                            this.a = false;
                        } else if (!this.w.eglMakeCurrent(this.x, eglCreateWindowSurface, eglCreateWindowSurface, this.F)) {
                            this.a = false;
                        } else {
                            b();
                            int glCreateShader = GLES20.glCreateShader(35633);
                            int glCreateShader2 = GLES20.glCreateShader(35632);
                            if (glCreateShader != 0 && glCreateShader2 != 0) {
                                GLES20.glShaderSource(glCreateShader, gl.v2(null, 2131624208));
                                GLES20.glCompileShader(glCreateShader);
                                int[] iArr = new int[1];
                                GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
                                if (iArr[0] == 0) {
                                    fa4.d("SpoilerEffect2, compile vertex shader error: " + GLES20.glGetShaderInfoLog(glCreateShader));
                                    GLES20.glDeleteShader(glCreateShader);
                                    this.a = false;
                                } else {
                                    GLES20.glShaderSource(glCreateShader2, gl.v2(null, 2131624207));
                                    GLES20.glCompileShader(glCreateShader2);
                                    GLES20.glGetShaderiv(glCreateShader2, 35713, iArr, 0);
                                    if (iArr[0] == 0) {
                                        fa4.d("SpoilerEffect2, compile fragment shader error: " + GLES20.glGetShaderInfoLog(glCreateShader2));
                                        GLES20.glDeleteShader(glCreateShader2);
                                        this.a = false;
                                    } else {
                                        int glCreateProgram = GLES20.glCreateProgram();
                                        this.G = glCreateProgram;
                                        if (glCreateProgram == 0) {
                                            this.a = false;
                                        } else {
                                            GLES20.glAttachShader(glCreateProgram, glCreateShader);
                                            GLES20.glAttachShader(this.G, glCreateShader2);
                                            GLES30.glTransformFeedbackVaryings(this.G, new String[]{"outPosition", "outVelocity", "outTime", "outDuration"}, 35980);
                                            GLES20.glLinkProgram(this.G);
                                            GLES20.glGetProgramiv(this.G, 35714, iArr, 0);
                                            int i5 = iArr[0];
                                            int i6 = this.G;
                                            if (i5 == 0) {
                                                fa4.d("SpoilerEffect2, link draw program error: " + GLES20.glGetProgramInfoLog(i6));
                                                this.a = false;
                                            } else {
                                                this.H = GLES20.glGetUniformLocation(i6, "reset");
                                                this.I = GLES20.glGetUniformLocation(this.G, "time");
                                                this.J = GLES20.glGetUniformLocation(this.G, "deltaTime");
                                                this.K = GLES20.glGetUniformLocation(this.G, "size");
                                                this.L = GLES20.glGetUniformLocation(this.G, "r");
                                                this.M = GLES20.glGetUniformLocation(this.G, "seed");
                                                GLES20.glViewport(0, 0, this.h, this.n);
                                                GLES20.glEnable(3042);
                                                GLES20.glBlendFunc(770, 771);
                                                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                                                GLES20.glUseProgram(this.G);
                                                GLES20.glUniform2f(this.K, this.h, this.n);
                                                int i7 = this.H;
                                                if (this.N) {
                                                    f = 1.0f;
                                                } else {
                                                    f = 0.0f;
                                                }
                                                GLES20.glUniform1f(i7, f);
                                                GLES20.glUniform1f(this.L, this.s);
                                                GLES20.glUniform1f(this.M, Utilities.c.nextInt(256) / 256.0f);
                                            }
                                        }
                                    }
                                }
                            } else {
                                this.a = false;
                            }
                        }
                    }
                }
            }
        }
        long nanoTime = System.nanoTime();
        while (this.a) {
            long nanoTime2 = System.nanoTime();
            double d = (nanoTime2 - nanoTime) / 1.0E9d;
            pla plaVar = this.R;
            double d2 = plaVar.a;
            if (d < d2) {
                double d3 = d2 - d;
                long j = (long) (d3 * 1000.0d);
                i = i3;
                i2 = i4;
                try {
                    Thread.sleep(j, (int) ((d3 - (j / 1000.0d)) * 1.0E9d));
                } catch (Exception unused) {
                }
                d = this.R.a;
            } else {
                i = i3;
                i2 = i4;
                double d4 = plaVar.b;
                if (d > d4) {
                    d = d4;
                }
            }
            while (this.b) {
                try {
                    Thread.sleep(1000L);
                } catch (Exception unused2) {
                }
            }
            synchronized (this.e) {
                if (this.f) {
                    GLES20.glUniform2f(this.K, this.h, this.n);
                    GLES20.glViewport(0, 0, this.h, this.n);
                    int i8 = (int) Utilities.i(((this.h * this.n) / 250000.0f) * 1000.0f, 10000.0f, 500.0f);
                    if (i8 > this.r) {
                        this.N = true;
                        b();
                    }
                    this.r = i8;
                    this.f = false;
                }
            }
            float f2 = (float) d;
            EGL10 egl102 = this.w;
            EGLDisplay eGLDisplay = this.x;
            EGLSurface eGLSurface = this.E;
            if (!egl102.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.F)) {
                this.a = false;
            } else {
                float f3 = f2 * 0.65f;
                float f4 = this.Q + f3;
                this.Q = f4;
                if (f4 > 1000.0f) {
                    this.Q = 0.0f;
                }
                GLES20.glClear(16384);
                GLES20.glBindBuffer(34962, this.P[this.O]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 24, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 24, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 1, 5126, false, 24, 16);
                GLES20.glEnableVertexAttribArray(i2);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 24, 20);
                GLES20.glEnableVertexAttribArray(i);
                GLES30.glBindBufferBase(35982, 0, this.P[1 - this.O]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 24, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 24, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 1, 5126, false, 24, 16);
                GLES20.glEnableVertexAttribArray(i2);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 24, 20);
                GLES20.glEnableVertexAttribArray(i);
                GLES20.glUniform1f(this.I, this.Q);
                GLES20.glUniform1f(this.J, f3);
                GLES30.glBeginTransformFeedback(0);
                GLES20.glDrawArrays(0, 0, this.r);
                GLES30.glEndTransformFeedback();
                if (this.N) {
                    this.N = false;
                    GLES20.glUniform1f(this.H, 0.0f);
                }
                this.O = 1 - this.O;
                this.w.eglSwapBuffers(this.x, this.E);
                a();
            }
            gl.r(this.c);
            gl.c3(this.c);
            i3 = i;
            nanoTime = nanoTime2;
            i4 = i2;
        }
        int i9 = i4;
        int[] iArr2 = this.P;
        if (iArr2 != null) {
            try {
                GLES20.glDeleteBuffers(i9, iArr2, 0);
            } catch (Exception e) {
                fa4.g(e, true);
            }
            this.P = null;
        }
        int i10 = this.G;
        if (i10 != 0) {
            try {
                GLES20.glDeleteProgram(i10);
            } catch (Exception e2) {
                fa4.g(e2, true);
            }
            this.G = 0;
        }
        EGL10 egl103 = this.w;
        if (egl103 != null) {
            try {
                EGLDisplay eGLDisplay2 = this.x;
                EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
                egl103.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL10.EGL_NO_CONTEXT);
            } catch (Exception e3) {
                fa4.g(e3, true);
            }
            try {
                this.w.eglDestroySurface(this.x, this.E);
            } catch (Exception e4) {
                fa4.g(e4, true);
            }
            try {
                this.w.eglDestroyContext(this.x, this.F);
            } catch (Exception e5) {
                fa4.g(e5, true);
            }
        }
        try {
            this.d.release();
        } catch (Exception e6) {
            fa4.g(e6, true);
        }
        a();
    }
}
