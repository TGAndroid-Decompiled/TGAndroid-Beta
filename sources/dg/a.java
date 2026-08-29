package dg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import org.telegram.ui.ActionBar.g6;
public final class a implements GLSurfaceView.Renderer {
    public final int A;
    public final int B;
    public boolean C;
    public float D;
    public int f5549a;
    public int f5550b;
    public j f5551c;
    public float f5555i;
    public final Context f5560n;
    public Bitmap f5561o;
    public float f5562p;
    public float f5563q;
    public float f5564r;
    public float f5565s;
    public boolean f5566t;
    public int f5567u;
    public int v;
    public float d = 0.0f;
    public float f5552e = 0.0f;
    public float f5553f = 0.0f;
    public float f5554g = 0.0f;
    public float h = 0.0f;
    public final float[] f5556j = new float[16];
    public final float[] f5557k = new float[16];
    public final float[] f5558l = new float[16];
    public final float[] f5559m = new float[16];
    public int f5568w = g6.Vj;
    public int f5569x = g6.Wj;
    public final int f5570y = g6.fk;
    public final int f5571z = g6.gk;

    public a(Context context, int i10, int i11) {
        this.f5555i = 0.0f;
        this.f5560n = context;
        this.A = i10;
        this.B = i11;
        if (i11 == 2) {
            this.f5555i = 1.0f;
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
        boolean z10;
        int i10 = g6.f23133h5;
        boolean z11 = false;
        if (i0.a.f(g6.w0(null, i10, false)) < 0.5d) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f5566t = z10;
        this.f5567u = i0.a.d(this.f5555i, g6.w0(null, this.f5568w, false), g6.w0(null, this.f5570y, false));
        this.v = i0.a.d(this.f5555i, g6.w0(null, this.f5569x, false), g6.w0(null, this.f5571z, false));
        if (this.A == 1 && i0.a.f(g6.w0(null, i10, false)) < 0.5d) {
            z11 = true;
        }
        this.C = z11;
    }

    @Override
    public final void onDrawFrame(GL10 gl10) {
        float f9;
        GLES20.glClear(16640);
        GLES20.glEnable(2929);
        if (this.B == 4) {
            f9 = 40.0f;
        } else {
            f9 = 0.0f;
        }
        Matrix.setLookAtM(this.f5558l, 0, 0.0f, f9, 100.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        float[] fArr = this.f5559m;
        Matrix.setIdentityM(fArr, 0);
        Matrix.translateM(fArr, 0, 0.0f, this.f5552e, 0.0f);
        Matrix.rotateM(this.f5559m, 0, -this.f5554g, 1.0f, 0.0f, 0.0f);
        Matrix.rotateM(this.f5559m, 0, (-this.d) - this.f5553f, 0.0f, 1.0f, 0.0f);
        Matrix.multiplyMM(this.f5556j, 0, this.f5558l, 0, this.f5559m, 0);
        float[] fArr2 = this.f5556j;
        Matrix.multiplyMM(fArr2, 0, this.f5557k, 0, fArr2, 0);
        j jVar = this.f5551c;
        if (jVar != null) {
            jVar.D = this.f5566t;
            jVar.f5625y = this.f5567u;
            jVar.f5626z = this.v;
            int i10 = this.f5549a;
            int i11 = this.f5550b;
            float f10 = this.f5562p;
            float f11 = this.f5564r;
            float f12 = this.f5563q;
            float f13 = this.f5565s;
            float f14 = this.h;
            float f15 = this.f5555i;
            float f16 = this.D;
            if (jVar.V != null) {
                GLES20.glBindTexture(3553, jVar.f5611j);
                GLUtils.texImage2D(3553, 0, jVar.V, 0);
                jVar.V = null;
            }
            GLES20.glUniform1i(jVar.f5609g, 0);
            GLES20.glUniform1f(jVar.f5615n, jVar.f5620s);
            GLES20.glUniform1f(jVar.f5616o, jVar.f5622u);
            GLES20.glUniform1f(jVar.f5618q, f14);
            GLES20.glUniform1f(jVar.f5619r, f15);
            GLES20.glUniformMatrix4fv(jVar.f5605b, 1, false, this.f5556j, 0);
            GLES20.glUniformMatrix4fv(jVar.f5606c, 1, false, fArr, 0);
            GLES20.glUniform1f(jVar.E, jVar.v);
            GLES20.glUniform1f(jVar.F, jVar.f5623w);
            GLES20.glUniform1f(jVar.G, jVar.f5624x);
            GLES20.glUniform1f(jVar.J, jVar.A);
            GLES20.glUniform3f(jVar.H, Color.red(jVar.f5625y) / 255.0f, Color.green(jVar.f5625y) / 255.0f, Color.blue(jVar.f5625y) / 255.0f);
            GLES20.glUniform3f(jVar.I, Color.red(jVar.f5626z) / 255.0f, Color.green(jVar.f5626z) / 255.0f, Color.blue(jVar.f5626z) / 255.0f);
            GLES20.glUniform3f(jVar.K, Color.red(jVar.B) / 255.0f, Color.green(jVar.B) / 255.0f, Color.blue(jVar.B) / 255.0f);
            GLES20.glUniform3f(jVar.L, Color.red(jVar.C) / 255.0f, Color.green(jVar.C) / 255.0f, Color.blue(jVar.C) / 255.0f);
            GLES20.glUniform2f(jVar.M, i10, i11);
            GLES20.glUniform4f(jVar.N, f10, f11, f12, f13);
            GLES20.glUniform1i(jVar.S, jVar.D ? 1 : 0);
            float f17 = jVar.Z + f16;
            jVar.Z = f17;
            GLES20.glUniform1f(jVar.T, f17);
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
            float f18 = jVar.f5622u;
            if (f18 < 1.0f) {
                float f19 = f18 + 0.07272727f;
                jVar.f5622u = f19;
                if (f19 > 1.0f) {
                    jVar.f5622u = 1.0f;
                }
            }
            float f20 = jVar.f5620s + 5.0E-4f;
            jVar.f5620s = f20;
            if (f20 > 1.0f) {
                jVar.f5620s = f20 - 1.0f;
            }
        }
    }

    @Override
    public final void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        float f9;
        this.f5549a = i10;
        this.f5550b = i11;
        GLES20.glViewport(0, 0, i10, i11);
        float f10 = i10 / i11;
        if (this.B == 4) {
            f9 = 12.0f;
        } else {
            f9 = 53.13f;
        }
        Matrix.perspectiveM(this.f5557k, 0, f9, f10, 1.0f, 200.0f);
    }

    @Override
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        j jVar = this.f5551c;
        if (jVar != null) {
            GLES20.glDeleteProgram(jVar.f5604a);
        }
        j jVar2 = new j(this.f5560n, this.B);
        this.f5551c = jVar2;
        Bitmap bitmap = this.f5561o;
        if (bitmap != null) {
            jVar2.V = bitmap;
        }
        if (this.C) {
            jVar2.v = 1.0f;
            jVar2.f5623w = 0.2f;
        }
    }
}
