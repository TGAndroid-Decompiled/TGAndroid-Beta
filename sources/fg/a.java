package fg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import org.telegram.ui.ActionBar.j6;
public final class a implements GLSurfaceView.Renderer {
    public final int A;
    public final int B;
    public boolean C;
    public float D;
    public int f6117a;
    public int f6118b;
    public j f6119c;
    public float f6122i;
    public final Context f6127n;
    public Bitmap f6128o;
    public float f6129p;
    public float f6130q;
    public float f6131r;
    public float f6132s;
    public boolean f6133t;
    public int f6134u;
    public int v;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f6120f = 0.0f;
    public float f6121g = 0.0f;
    public float h = 0.0f;
    public final float[] f6123j = new float[16];
    public final float[] f6124k = new float[16];
    public final float[] f6125l = new float[16];
    public final float[] f6126m = new float[16];
    public int f6135w = j6.Vj;
    public int f6136x = j6.Wj;
    public final int f6137y = j6.fk;
    public final int f6138z = j6.gk;

    public a(Context context, int i10, int i11) {
        this.f6122i = 0.0f;
        this.f6127n = context;
        this.A = i10;
        this.B = i11;
        if (i11 == 2) {
            this.f6122i = 1.0f;
        }
        b();
    }

    public static int a(int i10, String str) {
        int[] iArr = new int[1];
        int glCreateShader = GLES20.glCreateShader(i10);
        if (glCreateShader == 0) {
            return 0;
        }
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        throw new RuntimeException("Could not compile program: " + GLES20.glGetShaderInfoLog(glCreateShader) + " " + str);
    }

    public final void b() {
        boolean z4;
        int i10 = j6.f19952h5;
        boolean z10 = false;
        if (i0.a.f(j6.w0(null, i10, false)) < 0.5d) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f6133t = z4;
        this.f6134u = i0.a.d(this.f6122i, j6.w0(null, this.f6135w, false), j6.w0(null, this.f6137y, false));
        this.v = i0.a.d(this.f6122i, j6.w0(null, this.f6136x, false), j6.w0(null, this.f6138z, false));
        if (this.A == 1 && i0.a.f(j6.w0(null, i10, false)) < 0.5d) {
            z10 = true;
        }
        this.C = z10;
    }

    @Override
    public final void onDrawFrame(GL10 gl10) {
        float f10;
        GLES20.glClear(16640);
        GLES20.glEnable(2929);
        if (this.B == 4) {
            f10 = 40.0f;
        } else {
            f10 = 0.0f;
        }
        Matrix.setLookAtM(this.f6125l, 0, 0.0f, f10, 100.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        float[] fArr = this.f6126m;
        Matrix.setIdentityM(fArr, 0);
        Matrix.translateM(fArr, 0, 0.0f, this.e, 0.0f);
        Matrix.rotateM(this.f6126m, 0, -this.f6121g, 1.0f, 0.0f, 0.0f);
        Matrix.rotateM(this.f6126m, 0, (-this.d) - this.f6120f, 0.0f, 1.0f, 0.0f);
        Matrix.multiplyMM(this.f6123j, 0, this.f6125l, 0, this.f6126m, 0);
        float[] fArr2 = this.f6123j;
        Matrix.multiplyMM(fArr2, 0, this.f6124k, 0, fArr2, 0);
        j jVar = this.f6119c;
        if (jVar != null) {
            jVar.D = this.f6133t;
            jVar.f6189y = this.f6134u;
            jVar.f6190z = this.v;
            int i10 = this.f6117a;
            int i11 = this.f6118b;
            float f11 = this.f6129p;
            float f12 = this.f6131r;
            float f13 = this.f6130q;
            float f14 = this.f6132s;
            float f15 = this.h;
            float f16 = this.f6122i;
            float f17 = this.D;
            if (jVar.V != null) {
                GLES20.glBindTexture(3553, jVar.f6175j);
                GLUtils.texImage2D(3553, 0, jVar.V, 0);
                jVar.V = null;
            }
            GLES20.glUniform1i(jVar.f6173g, 0);
            GLES20.glUniform1f(jVar.f6179n, jVar.f6184s);
            GLES20.glUniform1f(jVar.f6180o, jVar.f6186u);
            GLES20.glUniform1f(jVar.f6182q, f15);
            GLES20.glUniform1f(jVar.f6183r, f16);
            GLES20.glUniformMatrix4fv(jVar.f6170b, 1, false, this.f6123j, 0);
            GLES20.glUniformMatrix4fv(jVar.f6171c, 1, false, fArr, 0);
            GLES20.glUniform1f(jVar.E, jVar.v);
            GLES20.glUniform1f(jVar.F, jVar.f6187w);
            GLES20.glUniform1f(jVar.G, jVar.f6188x);
            GLES20.glUniform1f(jVar.J, jVar.A);
            GLES20.glUniform3f(jVar.H, Color.red(jVar.f6189y) / 255.0f, Color.green(jVar.f6189y) / 255.0f, Color.blue(jVar.f6189y) / 255.0f);
            GLES20.glUniform3f(jVar.I, Color.red(jVar.f6190z) / 255.0f, Color.green(jVar.f6190z) / 255.0f, Color.blue(jVar.f6190z) / 255.0f);
            GLES20.glUniform3f(jVar.K, Color.red(jVar.B) / 255.0f, Color.green(jVar.B) / 255.0f, Color.blue(jVar.B) / 255.0f);
            GLES20.glUniform3f(jVar.L, Color.red(jVar.C) / 255.0f, Color.green(jVar.C) / 255.0f, Color.blue(jVar.C) / 255.0f);
            GLES20.glUniform2f(jVar.M, i10, i11);
            GLES20.glUniform4f(jVar.N, f11, f12, f13, f14);
            GLES20.glUniform1i(jVar.S, jVar.D ? 1 : 0);
            float f18 = jVar.Z + f17;
            jVar.Z = f18;
            GLES20.glUniform1f(jVar.T, f18);
            if (jVar.X == 4) {
                jVar.a(0, true);
                GLES20.glClear(256);
                jVar.a(1, true);
                GLES20.glClear(256);
                jVar.a(2, false);
                jVar.a(1, false);
                jVar.a(0, false);
            } else {
                for (int i12 = 0; i12 < jVar.W; i12++) {
                    jVar.a(i12, false);
                }
            }
            float f19 = jVar.f6186u;
            if (f19 < 1.0f) {
                float f20 = f19 + 0.07272727f;
                jVar.f6186u = f20;
                if (f20 > 1.0f) {
                    jVar.f6186u = 1.0f;
                }
            }
            float f21 = jVar.f6184s + 5.0E-4f;
            jVar.f6184s = f21;
            if (f21 > 1.0f) {
                jVar.f6184s = f21 - 1.0f;
            }
        }
    }

    @Override
    public final void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        float f10;
        this.f6117a = i10;
        this.f6118b = i11;
        GLES20.glViewport(0, 0, i10, i11);
        float f11 = i10 / i11;
        if (this.B == 4) {
            f10 = 12.0f;
        } else {
            f10 = 53.13f;
        }
        Matrix.perspectiveM(this.f6124k, 0, f10, f11, 1.0f, 200.0f);
    }

    @Override
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        j jVar = this.f6119c;
        if (jVar != null) {
            GLES20.glDeleteProgram(jVar.f6169a);
        }
        j jVar2 = new j(this.f6127n, this.B);
        this.f6119c = jVar2;
        Bitmap bitmap = this.f6128o;
        if (bitmap != null) {
            jVar2.V = bitmap;
        }
        if (this.C) {
            jVar2.v = 1.0f;
            jVar2.f6187w = 0.2f;
        }
    }
}
