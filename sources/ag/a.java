package ag;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import org.telegram.ui.ActionBar.f6;
public final class a implements GLSurfaceView.Renderer {
    public final int A;
    public final int B;
    public boolean C;
    public float D;
    public int f162a;
    public int f163b;
    public k f164c;
    public float f168i;
    public final Context f173n;
    public Bitmap f174o;
    public float f175p;
    public float f176q;
    public float f177r;
    public float f178s;
    public boolean f179t;
    public int f180u;
    public int v;
    public float d = 0.0f;
    public float f165e = 0.0f;
    public float f166f = 0.0f;
    public float f167g = 0.0f;
    public float h = 0.0f;
    public final float[] f169j = new float[16];
    public final float[] f170k = new float[16];
    public final float[] f171l = new float[16];
    public final float[] f172m = new float[16];
    public int f181w = f6.Vj;
    public int f182x = f6.Wj;
    public final int f183y = f6.fk;
    public final int f184z = f6.gk;

    public a(Context context, int i9, int i10) {
        this.f168i = 0.0f;
        this.f173n = context;
        this.A = i9;
        this.B = i10;
        if (i10 == 2) {
            this.f168i = 1.0f;
        }
        b();
    }

    public static int a(int i9, String str) {
        int[] iArr = new int[1];
        int glCreateShader = GLES20.glCreateShader(i9);
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
        int i9 = f6.f23072h5;
        boolean z11 = false;
        if (i0.a.f(f6.w0(null, i9, false)) < 0.5d) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f179t = z10;
        this.f180u = i0.a.d(this.f168i, f6.w0(null, this.f181w, false), f6.w0(null, this.f183y, false));
        this.v = i0.a.d(this.f168i, f6.w0(null, this.f182x, false), f6.w0(null, this.f184z, false));
        if (this.A == 1 && i0.a.f(f6.w0(null, i9, false)) < 0.5d) {
            z11 = true;
        }
        this.C = z11;
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
        Matrix.setLookAtM(this.f171l, 0, 0.0f, f10, 100.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        float[] fArr = this.f172m;
        Matrix.setIdentityM(fArr, 0);
        Matrix.translateM(fArr, 0, 0.0f, this.f165e, 0.0f);
        Matrix.rotateM(this.f172m, 0, -this.f167g, 1.0f, 0.0f, 0.0f);
        Matrix.rotateM(this.f172m, 0, (-this.d) - this.f166f, 0.0f, 1.0f, 0.0f);
        Matrix.multiplyMM(this.f169j, 0, this.f171l, 0, this.f172m, 0);
        float[] fArr2 = this.f169j;
        Matrix.multiplyMM(fArr2, 0, this.f170k, 0, fArr2, 0);
        k kVar = this.f164c;
        if (kVar != null) {
            kVar.D = this.f179t;
            kVar.f240y = this.f180u;
            kVar.f241z = this.v;
            int i9 = this.f162a;
            int i10 = this.f163b;
            float f11 = this.f175p;
            float f12 = this.f177r;
            float f13 = this.f176q;
            float f14 = this.f178s;
            float f15 = this.h;
            float f16 = this.f168i;
            float f17 = this.D;
            if (kVar.V != null) {
                GLES20.glBindTexture(3553, kVar.f226j);
                GLUtils.texImage2D(3553, 0, kVar.V, 0);
                kVar.V = null;
            }
            GLES20.glUniform1i(kVar.f224g, 0);
            GLES20.glUniform1f(kVar.f230n, kVar.f235s);
            GLES20.glUniform1f(kVar.f231o, kVar.f237u);
            GLES20.glUniform1f(kVar.f233q, f15);
            GLES20.glUniform1f(kVar.f234r, f16);
            GLES20.glUniformMatrix4fv(kVar.f220b, 1, false, this.f169j, 0);
            GLES20.glUniformMatrix4fv(kVar.f221c, 1, false, fArr, 0);
            GLES20.glUniform1f(kVar.E, kVar.v);
            GLES20.glUniform1f(kVar.F, kVar.f238w);
            GLES20.glUniform1f(kVar.G, kVar.f239x);
            GLES20.glUniform1f(kVar.J, kVar.A);
            GLES20.glUniform3f(kVar.H, Color.red(kVar.f240y) / 255.0f, Color.green(kVar.f240y) / 255.0f, Color.blue(kVar.f240y) / 255.0f);
            GLES20.glUniform3f(kVar.I, Color.red(kVar.f241z) / 255.0f, Color.green(kVar.f241z) / 255.0f, Color.blue(kVar.f241z) / 255.0f);
            GLES20.glUniform3f(kVar.K, Color.red(kVar.B) / 255.0f, Color.green(kVar.B) / 255.0f, Color.blue(kVar.B) / 255.0f);
            GLES20.glUniform3f(kVar.L, Color.red(kVar.C) / 255.0f, Color.green(kVar.C) / 255.0f, Color.blue(kVar.C) / 255.0f);
            GLES20.glUniform2f(kVar.M, i9, i10);
            GLES20.glUniform4f(kVar.N, f11, f12, f13, f14);
            GLES20.glUniform1i(kVar.S, kVar.D ? 1 : 0);
            float f18 = kVar.Z + f17;
            kVar.Z = f18;
            GLES20.glUniform1f(kVar.T, f18);
            if (kVar.X == 4) {
                kVar.a(0, true);
                GLES20.glClear(256);
                kVar.a(1, true);
                GLES20.glClear(256);
                kVar.a(2, false);
                kVar.a(1, false);
                kVar.a(0, false);
            } else {
                for (int i11 = 0; i11 < kVar.W; i11++) {
                    kVar.a(i11, false);
                }
            }
            float f19 = kVar.f237u;
            if (f19 < 1.0f) {
                float f20 = f19 + 0.07272727f;
                kVar.f237u = f20;
                if (f20 > 1.0f) {
                    kVar.f237u = 1.0f;
                }
            }
            float f21 = kVar.f235s + 5.0E-4f;
            kVar.f235s = f21;
            if (f21 > 1.0f) {
                kVar.f235s = f21 - 1.0f;
            }
        }
    }

    @Override
    public final void onSurfaceChanged(GL10 gl10, int i9, int i10) {
        float f10;
        this.f162a = i9;
        this.f163b = i10;
        GLES20.glViewport(0, 0, i9, i10);
        float f11 = i9 / i10;
        if (this.B == 4) {
            f10 = 12.0f;
        } else {
            f10 = 53.13f;
        }
        Matrix.perspectiveM(this.f170k, 0, f10, f11, 1.0f, 200.0f);
    }

    @Override
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        k kVar = this.f164c;
        if (kVar != null) {
            GLES20.glDeleteProgram(kVar.f219a);
        }
        k kVar2 = new k(this.f173n, this.B);
        this.f164c = kVar2;
        Bitmap bitmap = this.f174o;
        if (bitmap != null) {
            kVar2.V = bitmap;
        }
        if (this.C) {
            kVar2.v = 1.0f;
            kVar2.f238w = 0.2f;
        }
    }
}
