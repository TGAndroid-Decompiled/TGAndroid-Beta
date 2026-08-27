package bg;

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

    public int f2088a;

    public int f2089b;

    public j f2090c;

    public float f2094i;

    public final Context f2099n;

    public Bitmap f2100o;

    public float f2101p;

    public float f2102q;

    public float f2103r;

    public float f2104s;

    public boolean f2105t;

    public int f2106u;
    public int v;
    public float d = 0.0f;

    public float f2091e = 0.0f;

    public float f2092f = 0.0f;

    public float f2093g = 0.0f;
    public float h = 0.0f;

    public final float[] f2095j = new float[16];

    public final float[] f2096k = new float[16];

    public final float[] f2097l = new float[16];

    public final float[] f2098m = new float[16];

    public int f2107w = g6.Vj;

    public int f2108x = g6.Wj;

    public final int f2109y = g6.fk;

    public final int f2110z = g6.gk;

    public a(Context context, int i10, int i11) {
        this.f2094i = 0.0f;
        this.f2099n = context;
        this.A = i10;
        this.B = i11;
        if (i11 == 2) {
            this.f2094i = 1.0f;
        }
        b();
    }

    public static int a(int i10, String str) {
        int[] iArr = new int[1];
        int iGlCreateShader = GLES20.glCreateShader(i10);
        if (iGlCreateShader == 0) {
            return 0;
        }
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        throw new RuntimeException("Could not compile program: " + GLES20.glGetShaderInfoLog(iGlCreateShader) + " " + str);
    }

    public final void b() {
        int i10 = g6.f23124h5;
        boolean z10 = false;
        this.f2105t = i0.b.f(g6.w0(null, i10, false)) < 0.5d;
        this.f2106u = i0.b.d(this.f2094i, g6.w0(null, this.f2107w, false), g6.w0(null, this.f2109y, false));
        this.v = i0.b.d(this.f2094i, g6.w0(null, this.f2108x, false), g6.w0(null, this.f2110z, false));
        if (this.A == 1 && i0.b.f(g6.w0(null, i10, false)) < 0.5d) {
            z10 = true;
        }
        this.C = z10;
    }

    @Override
    public final void onDrawFrame(GL10 gl10) {
        GLES20.glClear(16640);
        GLES20.glEnable(2929);
        Matrix.setLookAtM(this.f2097l, 0, 0.0f, this.B == 4 ? 40.0f : 0.0f, 100.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        float[] fArr = this.f2098m;
        Matrix.setIdentityM(fArr, 0);
        Matrix.translateM(fArr, 0, 0.0f, this.f2091e, 0.0f);
        Matrix.rotateM(this.f2098m, 0, -this.f2093g, 1.0f, 0.0f, 0.0f);
        Matrix.rotateM(this.f2098m, 0, (-this.d) - this.f2092f, 0.0f, 1.0f, 0.0f);
        Matrix.multiplyMM(this.f2095j, 0, this.f2097l, 0, this.f2098m, 0);
        float[] fArr2 = this.f2095j;
        Matrix.multiplyMM(fArr2, 0, this.f2096k, 0, fArr2, 0);
        j jVar = this.f2090c;
        if (jVar != null) {
            jVar.D = this.f2105t;
            jVar.f2164y = this.f2106u;
            jVar.f2165z = this.v;
            int i10 = this.f2088a;
            int i11 = this.f2089b;
            float f10 = this.f2101p;
            float f11 = this.f2103r;
            float f12 = this.f2102q;
            float f13 = this.f2104s;
            float f14 = this.h;
            float f15 = this.f2094i;
            float f16 = this.D;
            if (jVar.V != null) {
                GLES20.glBindTexture(3553, jVar.f2150j);
                GLUtils.texImage2D(3553, 0, jVar.V, 0);
                jVar.V = null;
            }
            GLES20.glUniform1i(jVar.f2148g, 0);
            GLES20.glUniform1f(jVar.f2154n, jVar.f2159s);
            GLES20.glUniform1f(jVar.f2155o, jVar.f2161u);
            GLES20.glUniform1f(jVar.f2157q, f14);
            GLES20.glUniform1f(jVar.f2158r, f15);
            GLES20.glUniformMatrix4fv(jVar.f2144b, 1, false, this.f2095j, 0);
            GLES20.glUniformMatrix4fv(jVar.f2145c, 1, false, fArr, 0);
            GLES20.glUniform1f(jVar.E, jVar.v);
            GLES20.glUniform1f(jVar.F, jVar.f2162w);
            GLES20.glUniform1f(jVar.G, jVar.f2163x);
            GLES20.glUniform1f(jVar.J, jVar.A);
            GLES20.glUniform3f(jVar.H, Color.red(jVar.f2164y) / 255.0f, Color.green(jVar.f2164y) / 255.0f, Color.blue(jVar.f2164y) / 255.0f);
            GLES20.glUniform3f(jVar.I, Color.red(jVar.f2165z) / 255.0f, Color.green(jVar.f2165z) / 255.0f, Color.blue(jVar.f2165z) / 255.0f);
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
            float f18 = jVar.f2161u;
            if (f18 < 1.0f) {
                float f19 = f18 + 0.07272727f;
                jVar.f2161u = f19;
                if (f19 > 1.0f) {
                    jVar.f2161u = 1.0f;
                }
            }
            float f20 = jVar.f2159s + 5.0E-4f;
            jVar.f2159s = f20;
            if (f20 > 1.0f) {
                jVar.f2159s = f20 - 1.0f;
            }
        }
    }

    @Override
    public final void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        this.f2088a = i10;
        this.f2089b = i11;
        GLES20.glViewport(0, 0, i10, i11);
        Matrix.perspectiveM(this.f2096k, 0, this.B == 4 ? 12.0f : 53.13f, i10 / i11, 1.0f, 200.0f);
    }

    @Override
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        j jVar = this.f2090c;
        if (jVar != null) {
            GLES20.glDeleteProgram(jVar.f2143a);
        }
        j jVar2 = new j(this.f2099n, this.B);
        this.f2090c = jVar2;
        Bitmap bitmap = this.f2100o;
        if (bitmap != null) {
            jVar2.V = bitmap;
        }
        if (this.C) {
            jVar2.v = 1.0f;
            jVar2.f2162w = 0.2f;
        }
    }
}
