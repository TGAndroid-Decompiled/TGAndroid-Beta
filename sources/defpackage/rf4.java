package defpackage;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Locale;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
public final class rf4 extends uo3 {
    public final float[] E;
    public final int[] F;
    public boolean G;
    public boolean H;
    public final tl0 I;
    public yl0 J;
    public final uf4 K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public boolean U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public final FloatBuffer Z;
    public final SurfaceTexture a;
    public boolean a0;
    public EGL10 b;
    public long b0;
    public EGLDisplay c;
    public final ftb c0;
    public EGLContext d;
    public boolean d0;
    public EGLSurface e;
    public final Runnable e0;
    public boolean f;
    public final boolean h;
    public volatile int n;
    public volatile int r;
    public Bitmap s;
    public final int w;
    public SurfaceTexture x;
    public boolean y;

    public rf4(SurfaceTexture surfaceTexture, Bitmap bitmap, int i, boolean z, boolean z2, tl0 tl0Var, int i2, int i3) {
        super("PhotoFilterGLThread", false);
        boolean z3;
        this.E = new float[16];
        this.F = new int[1];
        this.e0 = new pf4(this, (byte) 1);
        this.a = surfaceTexture;
        this.n = i2;
        this.r = i3;
        this.s = bitmap;
        this.w = i;
        this.I = tl0Var;
        if (tl0Var != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.H = z3;
        if (z3) {
            yl0 yl0Var = new yl0();
            this.J = yl0Var;
            tl0 tl0Var2 = yl0Var.t;
            if (tl0Var2 != null && tl0Var2.m != null) {
                tl0Var2.m = null;
            }
            yl0Var.t = tl0Var;
            if (tl0Var != null && tl0Var.m != yl0Var) {
                tl0Var.m = yl0Var;
                tl0Var.d();
            }
        }
        this.h = false;
        uf4 uf4Var = new uf4(false, null);
        this.K = uf4Var;
        uf4Var.i1 = z2;
        float[] fArr = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        if (z) {
            fArr[2] = 0.0f;
            fArr[0] = 1.0f;
            fArr[6] = 0.0f;
            fArr[4] = 1.0f;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        this.Z = asFloatBuffer;
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        start();
    }

    public final void a() {
        if (!this.d.equals(this.b.eglGetCurrentContext()) || !this.e.equals(this.b.eglGetCurrentSurface(12377))) {
            EGL10 egl10 = this.b;
            EGLDisplay eGLDisplay = this.c;
            EGLSurface eGLSurface = this.e;
            if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d) && f11.a) {
                c00.w(this.b, new StringBuilder("eglMakeCurrent failed "));
            }
        }
    }

    public final void b(boolean z, boolean z2, boolean z3) {
        postRunnable(new qf4(this, z, z3, z2, (byte) 0));
    }

    public final void c(tf4 tf4Var) {
        postRunnable(new se4(this, tf4Var, (byte) 2));
    }

    public final void d() {
        int i;
        int i2;
        if (!this.a0 && (i = this.X) > 0 && (i2 = this.Y) > 0) {
            this.K.i(this.s, this.w, this.F[0], i, i2);
            this.a0 = true;
            uf4 uf4Var = this.K;
            this.V = uf4Var.X0;
            this.W = uf4Var.Y0;
        }
    }

    public final boolean e(b8b b8bVar) {
        int i;
        String str;
        int h;
        int h2;
        if (b8bVar != null) {
            i = b8bVar.a();
        } else {
            i = 0;
        }
        if (i == 1) {
            str = hl.v2(null, 2131624046);
        } else if (i == 2) {
            str = hl.v2(null, 2131624047);
        } else {
            str = "";
        }
        if (i != 0) {
            h = uf4.h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
            h2 = uf4.h(35632, String.format(Locale.US, "%1$s\nvarying highp vec2 vTextureCoord;void main() {gl_FragColor = TEX(vTextureCoord);}", str));
        } else {
            h = uf4.h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
            h2 = uf4.h(35632, "#extension GL_OES_EGL_image_external : require\n" + "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {gl_FragColor = texture2D(sTexture, vTextureCoord);}".replace("sampler2D", "samplerExternalOES"));
        }
        if (h == 0 || h2 == 0) {
            return false;
        }
        int i2 = this.P;
        if (i2 != 0) {
            GLES20.glDeleteProgram(i2);
        }
        int glCreateProgram = GLES20.glCreateProgram();
        this.P = glCreateProgram;
        GLES20.glAttachShader(glCreateProgram, h);
        GLES20.glAttachShader(this.P, h2);
        GLES20.glBindAttribLocation(this.P, 0, "position");
        GLES20.glBindAttribLocation(this.P, 1, "inputTexCoord");
        GLES20.glLinkProgram(this.P);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(this.P, 35714, iArr, 0);
        int i3 = iArr[0];
        int i4 = this.P;
        if (i3 == 0) {
            GLES20.glDeleteProgram(i4);
            this.P = 0;
        } else {
            this.Q = GLES20.glGetAttribLocation(i4, "position");
            this.S = GLES20.glGetAttribLocation(this.P, "inputTexCoord");
            this.T = GLES20.glGetUniformLocation(this.P, "sourceImage");
            this.R = GLES20.glGetUniformLocation(this.P, "videoMatrix");
        }
        return true;
    }

    public final void f(int i, int i2) {
        if (this.J == null) {
            return;
        }
        postRunnable(new of4(this, i, i2, (byte) 2));
    }

    public final void finish() {
        this.s = null;
        if (this.e != null) {
            EGL10 egl10 = this.b;
            EGLDisplay eGLDisplay = this.c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.b.eglDestroySurface(this.c, this.e);
            this.e = null;
        }
        EGLContext eGLContext = this.d;
        if (eGLContext != null) {
            tl0 tl0Var = this.I;
            if (tl0Var != null) {
                synchronized (tl0Var.f) {
                    if (tl0Var.g == eGLContext) {
                        tl0Var.g = null;
                    }
                }
            }
            this.b.eglDestroyContext(this.c, this.d);
            this.d = null;
        }
        EGLDisplay eGLDisplay2 = this.c;
        if (eGLDisplay2 != null) {
            this.b.eglTerminate(eGLDisplay2);
            this.c = null;
        }
        SurfaceTexture surfaceTexture = this.a;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
    }

    @Override
    public final void run() {
        EGLContext eGLContext;
        int i;
        int i2;
        yl0 yl0Var;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.c = eglGetDisplay;
        boolean z = false;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            if (f11.a) {
                c00.w(this.b, new StringBuilder("eglGetDisplay failed "));
            }
            finish();
        } else if (!this.b.eglInitialize(eglGetDisplay, new int[2])) {
            if (f11.a) {
                c00.w(this.b, new StringBuilder("eglInitialize failed "));
            }
            finish();
        } else {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.b.eglChooseConfig(this.c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                if (f11.a) {
                    c00.w(this.b, new StringBuilder("eglChooseConfig failed "));
                }
                finish();
            } else if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                int[] iArr2 = {12440, 2, 12344};
                tl0 tl0Var = this.I;
                if (tl0Var != null) {
                    synchronized (tl0Var.f) {
                        eGLContext = tl0Var.g;
                        if (eGLContext == null) {
                            eGLContext = EGL10.EGL_NO_CONTEXT;
                        }
                    }
                } else {
                    eGLContext = EGL10.EGL_NO_CONTEXT;
                }
                EGLContext eglCreateContext = this.b.eglCreateContext(this.c, eGLConfig, eGLContext, iArr2);
                this.d = eglCreateContext;
                if (eglCreateContext == null) {
                    if (f11.a) {
                        c00.w(this.b, new StringBuilder("eglCreateContext failed "));
                    }
                    finish();
                } else {
                    tl0 tl0Var2 = this.I;
                    if (tl0Var2 != null) {
                        tl0Var2.a(eglCreateContext);
                    }
                    SurfaceTexture surfaceTexture = this.a;
                    if (surfaceTexture != null) {
                        EGLSurface eglCreateWindowSurface = this.b.eglCreateWindowSurface(this.c, eGLConfig, surfaceTexture, null);
                        this.e = eglCreateWindowSurface;
                        if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                            if (!this.b.eglMakeCurrent(this.c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                if (f11.a) {
                                    c00.w(this.b, new StringBuilder("eglMakeCurrent failed "));
                                }
                                finish();
                            } else {
                                int h = uf4.h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
                                int h2 = uf4.h(35632, "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {gl_FragColor = texture2D(sTexture, vTextureCoord);}");
                                if (h != 0 && h2 != 0) {
                                    int glCreateProgram = GLES20.glCreateProgram();
                                    this.L = glCreateProgram;
                                    GLES20.glAttachShader(glCreateProgram, h);
                                    GLES20.glAttachShader(this.L, h2);
                                    GLES20.glBindAttribLocation(this.L, 0, "position");
                                    GLES20.glBindAttribLocation(this.L, 1, "inputTexCoord");
                                    GLES20.glLinkProgram(this.L);
                                    int[] iArr3 = new int[1];
                                    GLES20.glGetProgramiv(this.L, 35714, iArr3, 0);
                                    int i3 = iArr3[0];
                                    int i4 = this.L;
                                    if (i3 == 0) {
                                        GLES20.glDeleteProgram(i4);
                                        this.L = 0;
                                    } else {
                                        this.M = GLES20.glGetAttribLocation(i4, "position");
                                        this.N = GLES20.glGetAttribLocation(this.L, "inputTexCoord");
                                        this.O = GLES20.glGetUniformLocation(this.L, "sourceImage");
                                    }
                                    if (e(null)) {
                                        Bitmap bitmap = this.s;
                                        if (bitmap != null) {
                                            i = bitmap.getWidth();
                                            i2 = this.s.getHeight();
                                        } else {
                                            i = this.X;
                                            i2 = this.Y;
                                        }
                                        int i5 = i;
                                        int i6 = i2;
                                        if (this.c0 != null) {
                                            GLES20.glGenTextures(1, this.F, 0);
                                            Matrix.setIdentityM(this.E, 0);
                                            SurfaceTexture surfaceTexture2 = new SurfaceTexture(this.F[0]);
                                            this.x = surfaceTexture2;
                                            surfaceTexture2.setOnFrameAvailableListener(new pa1(this, (byte) 1));
                                            GLES20.glBindTexture(36197, this.F[0]);
                                            GLES20.glTexParameterf(36197, 10240, 9729.0f);
                                            GLES20.glTexParameterf(36197, 10241, 9728.0f);
                                            GLES20.glTexParameteri(36197, 10242, 33071);
                                            GLES20.glTexParameteri(36197, 10243, 33071);
                                            hl.c3(new pf4(this, (byte) 2));
                                        }
                                        if (this.H && (yl0Var = this.J) != null && !yl0Var.b(this.n / this.r, this.I.a ? 1 : 0)) {
                                            cc4.d("Failed to create uiBlurFramebuffer");
                                            this.H = false;
                                            this.J = null;
                                        }
                                        if (!this.K.a()) {
                                            finish();
                                        } else {
                                            if (i5 != 0 && i6 != 0) {
                                                this.K.i(this.s, this.w, this.F[0], i5, i6);
                                                this.a0 = true;
                                                uf4 uf4Var = this.K;
                                                this.V = uf4Var.X0;
                                                this.W = uf4Var.Y0;
                                            }
                                            z = true;
                                        }
                                    }
                                }
                            }
                        } else {
                            if (f11.a) {
                                c00.w(this.b, new StringBuilder("createWindowSurface failed "));
                            }
                            finish();
                        }
                    } else {
                        finish();
                    }
                }
            } else {
                if (f11.a) {
                    cc4.d("eglConfig not initialized");
                }
                finish();
            }
        }
        this.f = z;
        super.run();
    }

    public rf4(SurfaceTexture surfaceTexture, ftb ftbVar, b8b b8bVar, tl0 tl0Var, int i, int i2) {
        super("VideoFilterGLThread", false);
        this.E = new float[16];
        this.F = new int[1];
        this.e0 = new pf4(this, (byte) 1);
        this.a = surfaceTexture;
        this.n = i;
        this.r = i2;
        this.c0 = ftbVar;
        this.I = tl0Var;
        boolean z = tl0Var != null;
        this.H = z;
        if (z) {
            yl0 yl0Var = new yl0();
            this.J = yl0Var;
            tl0 tl0Var2 = yl0Var.t;
            if (tl0Var2 != null && tl0Var2.m != null) {
                tl0Var2.m = null;
            }
            yl0Var.t = tl0Var;
            if (tl0Var != null && tl0Var.m != yl0Var) {
                tl0Var.m = yl0Var;
                tl0Var.d();
            }
        }
        this.h = true;
        this.K = new uf4(true, b8bVar);
        start();
    }
}
