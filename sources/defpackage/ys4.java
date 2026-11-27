package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
public final class ys4 implements GLSurfaceView.Renderer {
    public final boolean D;
    public final byte E;
    public boolean F;
    public float G;
    public int a;
    public int b;
    public nl5 c;
    public float l;
    public final Context q;
    public Bitmap r;
    public float s;
    public float t;
    public float u;
    public float v;
    public boolean w;
    public int x;
    public int y;
    public float d = 0.0f;
    public float e = 0.0f;
    public volatile float f = 0.0f;
    public volatile float g = 0.0f;
    public volatile float h = 1.0f;
    public float i = 0.0f;
    public volatile float j = 0.0f;
    public float k = 0.0f;
    public final float[] m = new float[16];
    public final float[] n = new float[16];
    public final float[] o = new float[16];
    public final float[] p = new float[16];
    public int z = aob.Mk;
    public int A = aob.Nk;
    public final int B = aob.Wk;
    public final int C = aob.Xk;

    public ys4(Context context, int i, int i2) {
        this.l = 0.0f;
        this.q = context;
        this.D = i;
        this.E = i2;
        if (i2 == 2) {
            this.l = 1.0f;
        }
        b();
    }

    public static int a(int i, String str) {
        int[] iArr = new int[1];
        int glCreateShader = GLES20.glCreateShader(i);
        if (glCreateShader == 0) {
            return 0;
        }
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
        throw new RuntimeException("Could not compile program: " + glGetShaderInfoLog + " " + str);
    }

    public final void b() {
        boolean z;
        int i = aob.h5;
        boolean z2 = false;
        if (vm2.h(aob.w0(null, i, false)) < 0.5d) {
            z = true;
        } else {
            z = false;
        }
        this.w = z;
        this.x = vm2.f(this.l, aob.w0(null, this.z, false), aob.w0(null, this.B, false));
        this.y = vm2.f(this.l, aob.w0(null, this.A, false), aob.w0(null, this.C, false));
        if (this.D && vm2.h(aob.w0(null, i, false)) < 0.5d) {
            z2 = true;
        }
        this.F = z2;
    }

    @Override
    public final void onDrawFrame(GL10 gl10) {
        float f;
        GLES20.glClear(16640);
        GLES20.glEnable(2929);
        float[] fArr = this.o;
        if (this.E == 4) {
            f = 40.0f;
        } else {
            f = 0.0f;
        }
        Matrix.setLookAtM(fArr, 0, 0.0f, f, 100.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        Matrix.setIdentityM(this.p, 0);
        Matrix.translateM(this.p, 0, 0.0f, this.e, 0.0f);
        Matrix.rotateM(this.p, 0, (-this.i) - this.j, 1.0f, 0.0f, 0.0f);
        Matrix.rotateM(this.p, 0, (-this.d) - this.f, 0.0f, 1.0f, 0.0f);
        Matrix.multiplyMM(this.m, 0, this.o, 0, this.p, 0);
        float[] fArr2 = this.m;
        Matrix.multiplyMM(fArr2, 0, this.n, 0, fArr2, 0);
        nl5 nl5Var = this.c;
        if (nl5Var != null) {
            nl5Var.b = (float) Math.toRadians(this.d + this.f);
            this.c.c = (float) Math.toRadians(this.i + this.j);
            this.c.d = (float) Math.toRadians(this.g);
            this.c.e = this.h;
            nl5 nl5Var2 = this.c;
            nl5Var2.getClass();
            nl5Var2.J = this.w;
            nl5Var2.E = this.x;
            nl5Var2.F = this.y;
            float[] fArr3 = this.m;
            float[] fArr4 = this.p;
            int i = this.a;
            int i2 = this.b;
            float f2 = this.s;
            float f3 = this.u;
            float f4 = this.t;
            float f5 = this.v;
            float f6 = this.k;
            float f7 = this.l;
            float f8 = this.G;
            if (nl5Var2.a != null) {
                float min = Math.min(1.0f, (Math.max(0.0f, Math.min(f8, 0.1f)) / 0.22f) + nl5Var2.z);
                nl5Var2.z = min;
                ul3 ul3Var = nl5Var2.a;
                ul3Var.B = nl5Var2.e;
                ul3Var.C = (byte) 0;
                ul3Var.c(i, i2, nl5Var2.b, nl5Var2.c, nl5Var2.d, f8, min * nl5Var2.A, f6, false);
                return;
            }
            if (nl5Var2.Z != null) {
                GLES20.glBindTexture(3553, nl5Var2.o);
                GLUtils.texImage2D(3553, 0, nl5Var2.Z, 0);
                nl5Var2.Z = null;
            }
            GLES20.glUniform1i(nl5Var2.l, 0);
            GLES20.glUniform1f(nl5Var2.s, nl5Var2.x);
            GLES20.glUniform1f(nl5Var2.t, nl5Var2.z);
            GLES20.glUniform1f(nl5Var2.v, f6);
            GLES20.glUniform1f(nl5Var2.w, f7);
            GLES20.glUniformMatrix4fv(nl5Var2.g, 1, false, fArr3, 0);
            GLES20.glUniformMatrix4fv(nl5Var2.h, 1, false, fArr4, 0);
            GLES20.glUniform1f(nl5Var2.K, nl5Var2.B);
            GLES20.glUniform1f(nl5Var2.L, nl5Var2.C);
            GLES20.glUniform1f(nl5Var2.M, nl5Var2.D);
            GLES20.glUniform1f(nl5Var2.P, nl5Var2.G);
            GLES20.glUniform3f(nl5Var2.N, Color.red(nl5Var2.E) / 255.0f, Color.green(nl5Var2.E) / 255.0f, Color.blue(nl5Var2.E) / 255.0f);
            GLES20.glUniform3f(nl5Var2.O, Color.red(nl5Var2.F) / 255.0f, Color.green(nl5Var2.F) / 255.0f, Color.blue(nl5Var2.F) / 255.0f);
            GLES20.glUniform3f(nl5Var2.Q, Color.red(nl5Var2.H) / 255.0f, Color.green(nl5Var2.H) / 255.0f, Color.blue(nl5Var2.H) / 255.0f);
            GLES20.glUniform3f(nl5Var2.R, Color.red(nl5Var2.I) / 255.0f, Color.green(nl5Var2.I) / 255.0f, Color.blue(nl5Var2.I) / 255.0f);
            GLES20.glUniform2f(nl5Var2.S, i, i2);
            GLES20.glUniform4f(nl5Var2.T, f2, f3, f4, f5);
            GLES20.glUniform1i(nl5Var2.W, nl5Var2.J ? 1 : 0);
            float f9 = nl5Var2.d0 + f8;
            nl5Var2.d0 = f9;
            GLES20.glUniform1f(nl5Var2.X, f9);
            for (int i3 = 0; i3 < nl5Var2.a0; i3++) {
                int i4 = i3 * 3;
                GLES20.glBindBuffer(34962, nl5Var2.c0[i4]);
                GLES20.glVertexAttribPointer(nl5Var2.q, 2, 5126, false, 0, 0);
                GLES20.glBindBuffer(34962, nl5Var2.c0[i4 + 1]);
                GLES20.glVertexAttribPointer(nl5Var2.r, 3, 5126, false, 0, 0);
                GLES20.glBindBuffer(34962, nl5Var2.c0[i4 + 2]);
                GLES20.glVertexAttribPointer(nl5Var2.p, 3, 5126, false, 0, 0);
                GLES20.glUniform1i(nl5Var2.U, i3);
                GLES20.glUniform1i(nl5Var2.V, nl5Var2.b0);
                GLES20.glDrawArrays(4, 0, nl5Var2.y[i3] / 3);
            }
            float f10 = nl5Var2.z;
            if (f10 < 1.0f) {
                float f11 = f10 + 0.07272727f;
                nl5Var2.z = f11;
                if (f11 > 1.0f) {
                    nl5Var2.z = 1.0f;
                }
            }
            float f12 = nl5Var2.x + 5.0E-4f;
            nl5Var2.x = f12;
            if (f12 > 1.0f) {
                nl5Var2.x = f12 - 1.0f;
            }
        }
    }

    @Override
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        float f;
        this.a = i;
        this.b = i2;
        GLES20.glViewport(0, 0, i, i2);
        float f2 = i / i2;
        if (this.E == 4) {
            f = 12.0f;
        } else {
            f = 53.13f;
        }
        Matrix.perspectiveM(this.n, 0, f, f2, 1.0f, 200.0f);
    }

    @Override
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        nl5 nl5Var = this.c;
        if (nl5Var != null) {
            ul3 ul3Var = nl5Var.a;
            if (ul3Var != null) {
                ul3Var.b();
                nl5Var.a = null;
            } else {
                GLES20.glDeleteProgram(nl5Var.f);
            }
        }
        nl5 nl5Var2 = new nl5(this.q, this.E);
        this.c = nl5Var2;
        Bitmap bitmap = this.r;
        if (bitmap != null && nl5Var2.a == null) {
            nl5Var2.Z = bitmap;
        }
        if (this.F) {
            nl5Var2.B = 1.0f;
            nl5Var2.C = 0.2f;
        }
    }
}
