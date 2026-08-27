package eh;

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
    public final j M;

    public final f f5490c;
    public final SurfaceTexture d;

    public boolean f5492f;
    public int h;

    public int f5493n;

    public int f5494r;
    public EGL10 v;

    public EGLDisplay f5496w;

    public EGLConfig f5497x;

    public EGLSurface f5498y;

    public volatile boolean f5488a = true;

    public volatile boolean f5489b = false;

    public final Object f5491e = new Object();

    public final float f5495s = AndroidUtilities.dpf2(1.2f);
    public boolean I = true;
    public int J = 0;

    public i(j jVar, SurfaceTexture surfaceTexture, int i10, int i11, f fVar) {
        this.M = jVar;
        this.f5490c = fVar;
        this.d = surfaceTexture;
        this.h = i10;
        this.f5493n = i11;
        this.f5494r = (int) Utilities.clamp(((i10 * i11) / 250000.0f) * 1000.0f, 10000.0f, 500.0f);
    }

    public static void a() {
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                return;
            }
            FileLog.e("spoiler gles error " + iGlGetError);
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
        for (int i10 = 0; i10 < 2; i10++) {
            GLES20.glBindBuffer(34962, this.K[i10]);
            GLES20.glBufferData(34962, this.f5494r * 24, null, 35048);
        }
        a();
    }

    @Override
    public final void run() {
        int i10;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.v = egl10;
        EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(0);
        this.f5496w = eGLDisplayEglGetDisplay;
        if (eGLDisplayEglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            this.f5488a = false;
        } else {
            if (this.v.eglInitialize(eGLDisplayEglGetDisplay, new int[2])) {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (this.v.eglChooseConfig(this.f5496w, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 64, 12344}, eGLConfigArr, 1, new int[1])) {
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    this.f5497x = eGLConfig;
                    EGLContext eGLContextEglCreateContext = this.v.eglCreateContext(this.f5496w, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 3, 12344});
                    this.A = eGLContextEglCreateContext;
                    if (eGLContextEglCreateContext == null) {
                        this.f5488a = false;
                    } else {
                        EGLSurface eGLSurfaceEglCreateWindowSurface = this.v.eglCreateWindowSurface(this.f5496w, this.f5497x, this.d, null);
                        this.f5498y = eGLSurfaceEglCreateWindowSurface;
                        if (eGLSurfaceEglCreateWindowSurface != null && this.v.eglMakeCurrent(this.f5496w, eGLSurfaceEglCreateWindowSurface, eGLSurfaceEglCreateWindowSurface, this.A)) {
                            b();
                            int iGlCreateShader = GLES20.glCreateShader(35633);
                            int iGlCreateShader2 = GLES20.glCreateShader(35632);
                            if (iGlCreateShader == 0 || iGlCreateShader2 == 0) {
                                this.f5488a = false;
                            } else {
                                GLES20.glShaderSource(iGlCreateShader, AndroidUtilities.readRes(R.raw.spoiler_vertex));
                                GLES20.glCompileShader(iGlCreateShader);
                                int[] iArr = new int[1];
                                GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
                                if (iArr[0] == 0) {
                                    FileLog.e("SpoilerEffect2, compile vertex shader error: " + GLES20.glGetShaderInfoLog(iGlCreateShader));
                                    GLES20.glDeleteShader(iGlCreateShader);
                                    this.f5488a = false;
                                } else {
                                    GLES20.glShaderSource(iGlCreateShader2, AndroidUtilities.readRes(R.raw.spoiler_fragment));
                                    GLES20.glCompileShader(iGlCreateShader2);
                                    GLES20.glGetShaderiv(iGlCreateShader2, 35713, iArr, 0);
                                    if (iArr[0] == 0) {
                                        FileLog.e("SpoilerEffect2, compile fragment shader error: " + GLES20.glGetShaderInfoLog(iGlCreateShader2));
                                        GLES20.glDeleteShader(iGlCreateShader2);
                                        this.f5488a = false;
                                    } else {
                                        int iGlCreateProgram = GLES20.glCreateProgram();
                                        this.B = iGlCreateProgram;
                                        if (iGlCreateProgram == 0) {
                                            this.f5488a = false;
                                        } else {
                                            GLES20.glAttachShader(iGlCreateProgram, iGlCreateShader);
                                            GLES20.glAttachShader(this.B, iGlCreateShader2);
                                            GLES30.glTransformFeedbackVaryings(this.B, new String[]{"outPosition", "outVelocity", "outTime", "outDuration"}, 35980);
                                            GLES20.glLinkProgram(this.B);
                                            GLES20.glGetProgramiv(this.B, 35714, iArr, 0);
                                            if (iArr[0] == 0) {
                                                FileLog.e("SpoilerEffect2, link draw program error: " + GLES20.glGetProgramInfoLog(this.B));
                                                this.f5488a = false;
                                            } else {
                                                this.C = GLES20.glGetUniformLocation(this.B, "reset");
                                                this.D = GLES20.glGetUniformLocation(this.B, "time");
                                                this.E = GLES20.glGetUniformLocation(this.B, "deltaTime");
                                                this.F = GLES20.glGetUniformLocation(this.B, "size");
                                                this.G = GLES20.glGetUniformLocation(this.B, "r");
                                                this.H = GLES20.glGetUniformLocation(this.B, "seed");
                                                GLES20.glViewport(0, 0, this.h, this.f5493n);
                                                GLES20.glEnable(3042);
                                                GLES20.glBlendFunc(770, 771);
                                                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                                                GLES20.glUseProgram(this.B);
                                                GLES20.glUniform2f(this.F, this.h, this.f5493n);
                                                GLES20.glUniform1f(this.C, this.I ? 1.0f : 0.0f);
                                                GLES20.glUniform1f(this.G, this.f5495s);
                                                GLES20.glUniform1f(this.H, Utilities.fastRandom.nextInt(256) / 256.0f);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            this.f5488a = false;
                        }
                    }
                } else {
                    this.f5488a = false;
                }
            } else {
                this.f5488a = false;
            }
        }
        long jNanoTime = System.nanoTime();
        while (this.f5488a) {
            long jNanoTime2 = System.nanoTime();
            double d = (jNanoTime2 - jNanoTime) / 1.0E9d;
            j jVar = this.M;
            double d10 = jVar.f5500a;
            if (d < d10) {
                double d11 = d10 - d;
                long j10 = (long) (d11 * 1000.0d);
                i10 = 3;
                try {
                    Thread.sleep(j10, (int) ((d11 - (j10 / 1000.0d)) * 1.0E9d));
                } catch (Exception unused) {
                }
                d = this.M.f5500a;
            } else {
                i10 = 3;
                double d12 = jVar.f5501b;
                if (d > d12) {
                    d = d12;
                }
            }
            while (this.f5489b) {
                try {
                    Thread.sleep(1000L);
                } catch (Exception unused2) {
                }
            }
            synchronized (this.f5491e) {
                try {
                    if (this.f5492f) {
                        GLES20.glUniform2f(this.F, this.h, this.f5493n);
                        GLES20.glViewport(0, 0, this.h, this.f5493n);
                        int iClamp = (int) Utilities.clamp(((this.h * this.f5493n) / 250000.0f) * 1000.0f, 10000.0f, 500.0f);
                        if (iClamp > this.f5494r) {
                            this.I = true;
                            b();
                        }
                        this.f5494r = iClamp;
                        this.f5492f = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            float f10 = (float) d;
            EGL10 egl11 = this.v;
            EGLDisplay eGLDisplay = this.f5496w;
            EGLSurface eGLSurface = this.f5498y;
            if (egl11.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.A)) {
                float f11 = f10 * 0.65f;
                float f12 = this.L + f11;
                this.L = f12;
                if (f12 > 1000.0f) {
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
                GLES20.glEnableVertexAttribArray(i10);
                GLES30.glBindBufferBase(35982, 0, this.K[1 - this.J]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 24, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 24, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 1, 5126, false, 24, 16);
                GLES20.glEnableVertexAttribArray(2);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 24, 20);
                GLES20.glEnableVertexAttribArray(i10);
                GLES20.glUniform1f(this.D, this.L);
                GLES20.glUniform1f(this.E, f11);
                GLES30.glBeginTransformFeedback(0);
                GLES20.glDrawArrays(0, 0, this.f5494r);
                GLES30.glEndTransformFeedback();
                if (this.I) {
                    this.I = false;
                    GLES20.glUniform1f(this.C, 0.0f);
                }
                this.J = 1 - this.J;
                this.v.eglSwapBuffers(this.f5496w, this.f5498y);
                a();
            } else {
                this.f5488a = false;
            }
            AndroidUtilities.cancelRunOnUIThread(this.f5490c);
            AndroidUtilities.runOnUIThread(this.f5490c);
            jNanoTime = jNanoTime2;
        }
        int[] iArr2 = this.K;
        if (iArr2 != null) {
            try {
                GLES20.glDeleteBuffers(2, iArr2, 0);
            } catch (Exception e9) {
                FileLog.e(e9);
            }
            this.K = null;
        }
        int i11 = this.B;
        if (i11 != 0) {
            try {
                GLES20.glDeleteProgram(i11);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            this.B = 0;
        }
        EGL10 egl12 = this.v;
        if (egl12 != null) {
            try {
                EGLDisplay eGLDisplay2 = this.f5496w;
                EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
                egl12.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL10.EGL_NO_CONTEXT);
            } catch (Exception e11) {
                FileLog.e(e11);
            }
            try {
                this.v.eglDestroySurface(this.f5496w, this.f5498y);
            } catch (Exception e12) {
                FileLog.e(e12);
            }
            try {
                this.v.eglDestroyContext(this.f5496w, this.A);
            } catch (Exception e13) {
                FileLog.e(e13);
            }
        }
        try {
            this.d.release();
        } catch (Exception e14) {
            FileLog.e(e14);
        }
        a();
    }
}
