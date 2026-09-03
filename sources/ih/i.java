package ih;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLES30;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class i extends Thread {
    public EGLContext B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int[] L;
    public float M;
    public final j N;
    public final f f7566c;
    public final SurfaceTexture d;
    public boolean f7567f;
    public int h;
    public int f7568n;
    public int f7569r;
    public EGL10 v;
    public EGLDisplay f7571w;
    public EGLConfig f7572x;
    public EGLSurface f7573y;
    public volatile boolean f7564a = true;
    public volatile boolean f7565b = false;
    public final Object e = new Object();
    public final float f7570s = AndroidUtilities.dpf2(1.2f);
    public boolean J = true;
    public int K = 0;

    public i(j jVar, SurfaceTexture surfaceTexture, int i10, int i11, f fVar) {
        this.N = jVar;
        this.f7566c = fVar;
        this.d = surfaceTexture;
        this.h = i10;
        this.f7568n = i11;
        this.f7569r = (int) Utilities.clamp(((i10 * i11) / 250000.0f) * 1000.0f, 10000.0f, 500.0f);
    }

    public static void a() {
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError != 0) {
                FileLog.e("spoiler gles error " + glGetError);
            } else {
                return;
            }
        }
    }

    public final void b() {
        int[] iArr = this.L;
        if (iArr != null) {
            GLES20.glDeleteBuffers(2, iArr, 0);
        }
        int[] iArr2 = new int[2];
        this.L = iArr2;
        GLES20.glGenBuffers(2, iArr2, 0);
        for (int i10 = 0; i10 < 2; i10++) {
            GLES20.glBindBuffer(34962, this.L[i10]);
            GLES20.glBufferData(34962, this.f7569r * 24, null, 35048);
        }
        a();
    }

    @Override
    public final void run() {
        float f10;
        int i10;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.v = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(0);
        this.f7571w = eglGetDisplay;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            this.f7564a = false;
        } else {
            if (!this.v.eglInitialize(eglGetDisplay, new int[2])) {
                this.f7564a = false;
            } else {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (!this.v.eglChooseConfig(this.f7571w, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 64, 12344}, eGLConfigArr, 1, new int[1])) {
                    this.f7564a = false;
                } else {
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    this.f7572x = eGLConfig;
                    EGLContext eglCreateContext = this.v.eglCreateContext(this.f7571w, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 3, 12344});
                    this.B = eglCreateContext;
                    if (eglCreateContext == null) {
                        this.f7564a = false;
                    } else {
                        EGLSurface eglCreateWindowSurface = this.v.eglCreateWindowSurface(this.f7571w, this.f7572x, this.d, null);
                        this.f7573y = eglCreateWindowSurface;
                        if (eglCreateWindowSurface == null) {
                            this.f7564a = false;
                        } else if (!this.v.eglMakeCurrent(this.f7571w, eglCreateWindowSurface, eglCreateWindowSurface, this.B)) {
                            this.f7564a = false;
                        } else {
                            b();
                            int glCreateShader = GLES20.glCreateShader(35633);
                            int glCreateShader2 = GLES20.glCreateShader(35632);
                            if (glCreateShader != 0 && glCreateShader2 != 0) {
                                GLES20.glShaderSource(glCreateShader, AndroidUtilities.readRes(R.raw.spoiler_vertex));
                                GLES20.glCompileShader(glCreateShader);
                                int[] iArr = new int[1];
                                GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
                                if (iArr[0] == 0) {
                                    FileLog.e("SpoilerEffect2, compile vertex shader error: " + GLES20.glGetShaderInfoLog(glCreateShader));
                                    GLES20.glDeleteShader(glCreateShader);
                                    this.f7564a = false;
                                } else {
                                    GLES20.glShaderSource(glCreateShader2, AndroidUtilities.readRes(R.raw.spoiler_fragment));
                                    GLES20.glCompileShader(glCreateShader2);
                                    GLES20.glGetShaderiv(glCreateShader2, 35713, iArr, 0);
                                    if (iArr[0] == 0) {
                                        FileLog.e("SpoilerEffect2, compile fragment shader error: " + GLES20.glGetShaderInfoLog(glCreateShader2));
                                        GLES20.glDeleteShader(glCreateShader2);
                                        this.f7564a = false;
                                    } else {
                                        int glCreateProgram = GLES20.glCreateProgram();
                                        this.C = glCreateProgram;
                                        if (glCreateProgram == 0) {
                                            this.f7564a = false;
                                        } else {
                                            GLES20.glAttachShader(glCreateProgram, glCreateShader);
                                            GLES20.glAttachShader(this.C, glCreateShader2);
                                            GLES30.glTransformFeedbackVaryings(this.C, new String[]{"outPosition", "outVelocity", "outTime", "outDuration"}, 35980);
                                            GLES20.glLinkProgram(this.C);
                                            GLES20.glGetProgramiv(this.C, 35714, iArr, 0);
                                            if (iArr[0] == 0) {
                                                FileLog.e("SpoilerEffect2, link draw program error: " + GLES20.glGetProgramInfoLog(this.C));
                                                this.f7564a = false;
                                            } else {
                                                this.D = GLES20.glGetUniformLocation(this.C, "reset");
                                                this.E = GLES20.glGetUniformLocation(this.C, "time");
                                                this.F = GLES20.glGetUniformLocation(this.C, "deltaTime");
                                                this.G = GLES20.glGetUniformLocation(this.C, "size");
                                                this.H = GLES20.glGetUniformLocation(this.C, "r");
                                                this.I = GLES20.glGetUniformLocation(this.C, "seed");
                                                GLES20.glViewport(0, 0, this.h, this.f7568n);
                                                GLES20.glEnable(3042);
                                                GLES20.glBlendFunc(770, 771);
                                                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                                                GLES20.glUseProgram(this.C);
                                                GLES20.glUniform2f(this.G, this.h, this.f7568n);
                                                int i11 = this.D;
                                                if (this.J) {
                                                    f10 = 1.0f;
                                                } else {
                                                    f10 = 0.0f;
                                                }
                                                GLES20.glUniform1f(i11, f10);
                                                GLES20.glUniform1f(this.H, this.f7570s);
                                                GLES20.glUniform1f(this.I, Utilities.fastRandom.nextInt(256) / 256.0f);
                                            }
                                        }
                                    }
                                }
                            } else {
                                this.f7564a = false;
                            }
                        }
                    }
                }
            }
        }
        long nanoTime = System.nanoTime();
        while (this.f7564a) {
            long nanoTime2 = System.nanoTime();
            double d = (nanoTime2 - nanoTime) / 1.0E9d;
            j jVar = this.N;
            double d10 = jVar.f7575a;
            if (d < d10) {
                double d11 = d10 - d;
                long j10 = (long) (d11 * 1000.0d);
                i10 = 3;
                try {
                    Thread.sleep(j10, (int) ((d11 - (j10 / 1000.0d)) * 1.0E9d));
                } catch (Exception unused) {
                }
                d = this.N.f7575a;
            } else {
                i10 = 3;
                double d12 = jVar.f7576b;
                if (d > d12) {
                    d = d12;
                }
            }
            while (this.f7565b) {
                try {
                    Thread.sleep(1000L);
                } catch (Exception unused2) {
                }
            }
            synchronized (this.e) {
                try {
                    if (this.f7567f) {
                        GLES20.glUniform2f(this.G, this.h, this.f7568n);
                        GLES20.glViewport(0, 0, this.h, this.f7568n);
                        int clamp = (int) Utilities.clamp(((this.h * this.f7568n) / 250000.0f) * 1000.0f, 10000.0f, 500.0f);
                        if (clamp > this.f7569r) {
                            this.J = true;
                            b();
                        }
                        this.f7569r = clamp;
                        this.f7567f = false;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            float f11 = (float) d;
            EGL10 egl102 = this.v;
            EGLDisplay eGLDisplay = this.f7571w;
            EGLSurface eGLSurface = this.f7573y;
            if (!egl102.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.B)) {
                this.f7564a = false;
            } else {
                float f12 = f11 * 0.65f;
                float f13 = this.M + f12;
                this.M = f13;
                if (f13 > 1000.0f) {
                    this.M = 0.0f;
                }
                GLES20.glClear(16384);
                GLES20.glBindBuffer(34962, this.L[this.K]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 24, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 24, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 1, 5126, false, 24, 16);
                GLES20.glEnableVertexAttribArray(2);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 24, 20);
                GLES20.glEnableVertexAttribArray(i10);
                GLES30.glBindBufferBase(35982, 0, this.L[1 - this.K]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 24, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 24, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 1, 5126, false, 24, 16);
                GLES20.glEnableVertexAttribArray(2);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 24, 20);
                GLES20.glEnableVertexAttribArray(i10);
                GLES20.glUniform1f(this.E, this.M);
                GLES20.glUniform1f(this.F, f12);
                GLES30.glBeginTransformFeedback(0);
                GLES20.glDrawArrays(0, 0, this.f7569r);
                GLES30.glEndTransformFeedback();
                if (this.J) {
                    this.J = false;
                    GLES20.glUniform1f(this.D, 0.0f);
                }
                this.K = 1 - this.K;
                this.v.eglSwapBuffers(this.f7571w, this.f7573y);
                a();
            }
            AndroidUtilities.cancelRunOnUIThread(this.f7566c);
            AndroidUtilities.runOnUIThread(this.f7566c);
            nanoTime = nanoTime2;
        }
        int[] iArr2 = this.L;
        if (iArr2 != null) {
            try {
                GLES20.glDeleteBuffers(2, iArr2, 0);
            } catch (Exception e) {
                FileLog.e(e);
            }
            this.L = null;
        }
        int i12 = this.C;
        if (i12 != 0) {
            try {
                GLES20.glDeleteProgram(i12);
            } catch (Exception e6) {
                FileLog.e(e6);
            }
            this.C = 0;
        }
        EGL10 egl103 = this.v;
        if (egl103 != null) {
            try {
                EGLDisplay eGLDisplay2 = this.f7571w;
                EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
                egl103.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL10.EGL_NO_CONTEXT);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            try {
                this.v.eglDestroySurface(this.f7571w, this.f7573y);
            } catch (Exception e11) {
                FileLog.e(e11);
            }
            try {
                this.v.eglDestroyContext(this.f7571w, this.B);
            } catch (Exception e12) {
                FileLog.e(e12);
            }
        }
        try {
            this.d.release();
        } catch (Exception e13) {
            FileLog.e(e13);
        }
        a();
    }
}
