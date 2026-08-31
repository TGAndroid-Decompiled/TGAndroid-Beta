package gg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import org.telegram.ui.ActionBar.k6;
public final class a implements GLSurfaceView.Renderer {
    public final int A;
    public final int B;
    public boolean C;
    public float D;
    public int f7046a;
    public int f7047b;
    public j f7048c;
    public float f7052i;
    public final Context f7057n;
    public Bitmap f7058o;
    public float f7059p;
    public float f7060q;
    public float f7061r;
    public float f7062s;
    public boolean f7063t;
    public int f7064u;
    public int v;
    public float d = 0.0f;
    public float f7049e = 0.0f;
    public float f7050f = 0.0f;
    public float f7051g = 0.0f;
    public float h = 0.0f;
    public final float[] f7053j = new float[16];
    public final float[] f7054k = new float[16];
    public final float[] f7055l = new float[16];
    public final float[] f7056m = new float[16];
    public int f7065w = k6.Vj;
    public int f7066x = k6.Wj;
    public final int f7067y = k6.fk;
    public final int f7068z = k6.gk;

    public a(Context context, int i10, int i11) {
        this.f7052i = 0.0f;
        this.f7057n = context;
        this.A = i10;
        this.B = i11;
        if (i11 == 2) {
            this.f7052i = 1.0f;
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
        int i10 = k6.f21731h5;
        boolean z10 = false;
        if (i0.a.f(k6.w0(null, i10, false)) < 0.5d) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f7063t = z4;
        this.f7064u = i0.a.d(this.f7052i, k6.w0(null, this.f7065w, false), k6.w0(null, this.f7067y, false));
        this.v = i0.a.d(this.f7052i, k6.w0(null, this.f7066x, false), k6.w0(null, this.f7068z, false));
        if (this.A == 1 && i0.a.f(k6.w0(null, i10, false)) < 0.5d) {
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
        Matrix.setLookAtM(this.f7055l, 0, 0.0f, f10, 100.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        float[] fArr = this.f7056m;
        Matrix.setIdentityM(fArr, 0);
        Matrix.translateM(fArr, 0, 0.0f, this.f7049e, 0.0f);
        Matrix.rotateM(this.f7056m, 0, -this.f7051g, 1.0f, 0.0f, 0.0f);
        Matrix.rotateM(this.f7056m, 0, (-this.d) - this.f7050f, 0.0f, 1.0f, 0.0f);
        Matrix.multiplyMM(this.f7053j, 0, this.f7055l, 0, this.f7056m, 0);
        float[] fArr2 = this.f7053j;
        Matrix.multiplyMM(fArr2, 0, this.f7054k, 0, fArr2, 0);
        j jVar = this.f7048c;
        if (jVar != null) {
            jVar.D = this.f7063t;
            jVar.f7122y = this.f7064u;
            jVar.f7123z = this.v;
            int i10 = this.f7046a;
            int i11 = this.f7047b;
            float f11 = this.f7059p;
            float f12 = this.f7061r;
            float f13 = this.f7060q;
            float f14 = this.f7062s;
            float f15 = this.h;
            float f16 = this.f7052i;
            float f17 = this.D;
            if (jVar.V != null) {
                GLES20.glBindTexture(3553, jVar.f7108j);
                GLUtils.texImage2D(3553, 0, jVar.V, 0);
                jVar.V = null;
            }
            GLES20.glUniform1i(jVar.f7106g, 0);
            GLES20.glUniform1f(jVar.f7112n, jVar.f7117s);
            GLES20.glUniform1f(jVar.f7113o, jVar.f7119u);
            GLES20.glUniform1f(jVar.f7115q, f15);
            GLES20.glUniform1f(jVar.f7116r, f16);
            GLES20.glUniformMatrix4fv(jVar.f7102b, 1, false, this.f7053j, 0);
            GLES20.glUniformMatrix4fv(jVar.f7103c, 1, false, fArr, 0);
            GLES20.glUniform1f(jVar.E, jVar.v);
            GLES20.glUniform1f(jVar.F, jVar.f7120w);
            GLES20.glUniform1f(jVar.G, jVar.f7121x);
            GLES20.glUniform1f(jVar.J, jVar.A);
            GLES20.glUniform3f(jVar.H, Color.red(jVar.f7122y) / 255.0f, Color.green(jVar.f7122y) / 255.0f, Color.blue(jVar.f7122y) / 255.0f);
            GLES20.glUniform3f(jVar.I, Color.red(jVar.f7123z) / 255.0f, Color.green(jVar.f7123z) / 255.0f, Color.blue(jVar.f7123z) / 255.0f);
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
            float f19 = jVar.f7119u;
            if (f19 < 1.0f) {
                float f20 = f19 + 0.07272727f;
                jVar.f7119u = f20;
                if (f20 > 1.0f) {
                    jVar.f7119u = 1.0f;
                }
            }
            float f21 = jVar.f7117s + 5.0E-4f;
            jVar.f7117s = f21;
            if (f21 > 1.0f) {
                jVar.f7117s = f21 - 1.0f;
            }
        }
    }

    @Override
    public final void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        float f10;
        this.f7046a = i10;
        this.f7047b = i11;
        GLES20.glViewport(0, 0, i10, i11);
        float f11 = i10 / i11;
        if (this.B == 4) {
            f10 = 12.0f;
        } else {
            f10 = 53.13f;
        }
        Matrix.perspectiveM(this.f7054k, 0, f10, f11, 1.0f, 200.0f);
    }

    @Override
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        j jVar = this.f7048c;
        if (jVar != null) {
            GLES20.glDeleteProgram(jVar.f7101a);
        }
        j jVar2 = new j(this.f7057n, this.B);
        this.f7048c = jVar2;
        Bitmap bitmap = this.f7058o;
        if (bitmap != null) {
            jVar2.V = bitmap;
        }
        if (this.C) {
            jVar2.v = 1.0f;
            jVar2.f7120w = 0.2f;
        }
    }
}
