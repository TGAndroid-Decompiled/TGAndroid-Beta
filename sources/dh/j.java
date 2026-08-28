package dh;

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
public final class j extends Thread {
    public EGLContext A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int[] K;
    public float L;
    public final k M;
    public final f f4592c;
    public final SurfaceTexture d;
    public boolean f4594f;
    public int h;
    public int f4595n;
    public int f4596r;
    public EGL10 v;
    public EGLDisplay f4598w;
    public EGLConfig f4599x;
    public EGLSurface f4600y;
    public volatile boolean f4590a = true;
    public volatile boolean f4591b = false;
    public final Object f4593e = new Object();
    public final float f4597s = AndroidUtilities.dpf2(1.2f);
    public boolean I = true;
    public int J = 0;

    public j(k kVar, SurfaceTexture surfaceTexture, int i9, int i10, f fVar) {
        this.M = kVar;
        this.f4592c = fVar;
        this.d = surfaceTexture;
        this.h = i9;
        this.f4595n = i10;
        this.f4596r = (int) Utilities.clamp(((i9 * i10) / 250000.0f) * 1000.0f, 10000.0f, 500.0f);
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
        int[] iArr = this.K;
        if (iArr != null) {
            GLES20.glDeleteBuffers(2, iArr, 0);
        }
        int[] iArr2 = new int[2];
        this.K = iArr2;
        GLES20.glGenBuffers(2, iArr2, 0);
        for (int i9 = 0; i9 < 2; i9++) {
            GLES20.glBindBuffer(34962, this.K[i9]);
            GLES20.glBufferData(34962, this.f4596r * 24, null, 35048);
        }
        a();
    }

    @Override
    public final void run() {
        float f10;
        int i9;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.v = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(0);
        this.f4598w = eglGetDisplay;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            this.f4590a = false;
        } else {
            if (!this.v.eglInitialize(eglGetDisplay, new int[2])) {
                this.f4590a = false;
            } else {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (!this.v.eglChooseConfig(this.f4598w, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 64, 12344}, eGLConfigArr, 1, new int[1])) {
                    this.f4590a = false;
                } else {
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    this.f4599x = eGLConfig;
                    EGLContext eglCreateContext = this.v.eglCreateContext(this.f4598w, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 3, 12344});
                    this.A = eglCreateContext;
                    if (eglCreateContext == null) {
                        this.f4590a = false;
                    } else {
                        EGLSurface eglCreateWindowSurface = this.v.eglCreateWindowSurface(this.f4598w, this.f4599x, this.d, null);
                        this.f4600y = eglCreateWindowSurface;
                        if (eglCreateWindowSurface == null) {
                            this.f4590a = false;
                        } else if (!this.v.eglMakeCurrent(this.f4598w, eglCreateWindowSurface, eglCreateWindowSurface, this.A)) {
                            this.f4590a = false;
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
                                    this.f4590a = false;
                                } else {
                                    GLES20.glShaderSource(glCreateShader2, AndroidUtilities.readRes(R.raw.spoiler_fragment));
                                    GLES20.glCompileShader(glCreateShader2);
                                    GLES20.glGetShaderiv(glCreateShader2, 35713, iArr, 0);
                                    if (iArr[0] == 0) {
                                        FileLog.e("SpoilerEffect2, compile fragment shader error: " + GLES20.glGetShaderInfoLog(glCreateShader2));
                                        GLES20.glDeleteShader(glCreateShader2);
                                        this.f4590a = false;
                                    } else {
                                        int glCreateProgram = GLES20.glCreateProgram();
                                        this.B = glCreateProgram;
                                        if (glCreateProgram == 0) {
                                            this.f4590a = false;
                                        } else {
                                            GLES20.glAttachShader(glCreateProgram, glCreateShader);
                                            GLES20.glAttachShader(this.B, glCreateShader2);
                                            GLES30.glTransformFeedbackVaryings(this.B, new String[]{"outPosition", "outVelocity", "outTime", "outDuration"}, 35980);
                                            GLES20.glLinkProgram(this.B);
                                            GLES20.glGetProgramiv(this.B, 35714, iArr, 0);
                                            if (iArr[0] == 0) {
                                                FileLog.e("SpoilerEffect2, link draw program error: " + GLES20.glGetProgramInfoLog(this.B));
                                                this.f4590a = false;
                                            } else {
                                                this.C = GLES20.glGetUniformLocation(this.B, "reset");
                                                this.D = GLES20.glGetUniformLocation(this.B, "time");
                                                this.E = GLES20.glGetUniformLocation(this.B, "deltaTime");
                                                this.F = GLES20.glGetUniformLocation(this.B, "size");
                                                this.G = GLES20.glGetUniformLocation(this.B, "r");
                                                this.H = GLES20.glGetUniformLocation(this.B, "seed");
                                                GLES20.glViewport(0, 0, this.h, this.f4595n);
                                                GLES20.glEnable(3042);
                                                GLES20.glBlendFunc(770, 771);
                                                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                                                GLES20.glUseProgram(this.B);
                                                GLES20.glUniform2f(this.F, this.h, this.f4595n);
                                                int i10 = this.C;
                                                if (this.I) {
                                                    f10 = 1.0f;
                                                } else {
                                                    f10 = 0.0f;
                                                }
                                                GLES20.glUniform1f(i10, f10);
                                                GLES20.glUniform1f(this.G, this.f4597s);
                                                GLES20.glUniform1f(this.H, Utilities.fastRandom.nextInt(256) / 256.0f);
                                            }
                                        }
                                    }
                                }
                            } else {
                                this.f4590a = false;
                            }
                        }
                    }
                }
            }
        }
        long nanoTime = System.nanoTime();
        while (this.f4590a) {
            long nanoTime2 = System.nanoTime();
            double d = (nanoTime2 - nanoTime) / 1.0E9d;
            k kVar = this.M;
            double d9 = kVar.f4602a;
            if (d < d9) {
                double d10 = d9 - d;
                long j10 = (long) (d10 * 1000.0d);
                i9 = 3;
                try {
                    Thread.sleep(j10, (int) ((d10 - (j10 / 1000.0d)) * 1.0E9d));
                } catch (Exception unused) {
                }
                d = this.M.f4602a;
            } else {
                i9 = 3;
                double d11 = kVar.f4603b;
                if (d > d11) {
                    d = d11;
                }
            }
            while (this.f4591b) {
                try {
                    Thread.sleep(1000L);
                } catch (Exception unused2) {
                }
            }
            synchronized (this.f4593e) {
                try {
                    if (this.f4594f) {
                        GLES20.glUniform2f(this.F, this.h, this.f4595n);
                        GLES20.glViewport(0, 0, this.h, this.f4595n);
                        int clamp = (int) Utilities.clamp(((this.h * this.f4595n) / 250000.0f) * 1000.0f, 10000.0f, 500.0f);
                        if (clamp > this.f4596r) {
                            this.I = true;
                            b();
                        }
                        this.f4596r = clamp;
                        this.f4594f = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            float f11 = (float) d;
            EGL10 egl102 = this.v;
            EGLDisplay eGLDisplay = this.f4598w;
            EGLSurface eGLSurface = this.f4600y;
            if (!egl102.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.A)) {
                this.f4590a = false;
            } else {
                float f12 = f11 * 0.65f;
                float f13 = this.L + f12;
                this.L = f13;
                if (f13 > 1000.0f) {
                    this.L = 0.0f;
                }
                GLES20.glClear(16384);
                GLES20.glBindBuffer(34962, this.K[this.J]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 24, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 24, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 1, 5126, false, 24, 16);
                GLES20.glEnableVertexAttribArray(2);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 24, 20);
                GLES20.glEnableVertexAttribArray(i9);
                GLES30.glBindBufferBase(35982, 0, this.K[1 - this.J]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 24, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 24, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 1, 5126, false, 24, 16);
                GLES20.glEnableVertexAttribArray(2);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 24, 20);
                GLES20.glEnableVertexAttribArray(i9);
                GLES20.glUniform1f(this.D, this.L);
                GLES20.glUniform1f(this.E, f12);
                GLES30.glBeginTransformFeedback(0);
                GLES20.glDrawArrays(0, 0, this.f4596r);
                GLES30.glEndTransformFeedback();
                if (this.I) {
                    this.I = false;
                    GLES20.glUniform1f(this.C, 0.0f);
                }
                this.J = 1 - this.J;
                this.v.eglSwapBuffers(this.f4598w, this.f4600y);
                a();
            }
            AndroidUtilities.cancelRunOnUIThread(this.f4592c);
            AndroidUtilities.runOnUIThread(this.f4592c);
            nanoTime = nanoTime2;
        }
        int[] iArr2 = this.K;
        if (iArr2 != null) {
            try {
                GLES20.glDeleteBuffers(2, iArr2, 0);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            this.K = null;
        }
        int i11 = this.B;
        if (i11 != 0) {
            try {
                GLES20.glDeleteProgram(i11);
            } catch (Exception e11) {
                FileLog.e(e11);
            }
            this.B = 0;
        }
        EGL10 egl103 = this.v;
        if (egl103 != null) {
            try {
                EGLDisplay eGLDisplay2 = this.f4598w;
                EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
                egl103.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL10.EGL_NO_CONTEXT);
            } catch (Exception e12) {
                FileLog.e(e12);
            }
            try {
                this.v.eglDestroySurface(this.f4598w, this.f4600y);
            } catch (Exception e13) {
                FileLog.e(e13);
            }
            try {
                this.v.eglDestroyContext(this.f4598w, this.A);
            } catch (Exception e14) {
                FileLog.e(e14);
            }
        }
        try {
            this.d.release();
        } catch (Exception e15) {
            FileLog.e(e15);
        }
        a();
    }
}
