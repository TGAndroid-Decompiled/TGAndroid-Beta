package lg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import org.telegram.ui.ActionBar.t6;
public final class h implements GLSurfaceView.Renderer {
    public final int D;
    public final int E;
    public boolean F;
    public float G;
    public int f11876a;
    public int f11877b;
    public r f11878c;
    public float f11884l;
    public final Context f11889q;
    public Bitmap f11890r;
    public float f11891s;
    public float f11892t;
    public float f11893u;
    public float v;
    public boolean f11894w;
    public int f11895x;
    public int f11896y;
    public float d = 0.0f;
    public float e = 0.0f;
    public volatile float f11879f = 0.0f;
    public volatile float f11880g = 0.0f;
    public volatile float h = 1.0f;
    public float f11881i = 0.0f;
    public volatile float f11882j = 0.0f;
    public float f11883k = 0.0f;
    public final float[] f11885m = new float[16];
    public final float[] f11886n = new float[16];
    public final float[] f11887o = new float[16];
    public final float[] f11888p = new float[16];
    public int f11897z = t6.Jk;
    public int A = t6.Kk;
    public final int B = t6.Tk;
    public final int C = t6.Uk;

    public h(Context context, int i10, int i11) {
        this.f11884l = 0.0f;
        this.f11889q = context;
        this.D = i10;
        this.E = i11;
        if (i11 == 2) {
            this.f11884l = 1.0f;
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
        int i10 = t6.f21001h5;
        boolean z11 = false;
        if (i0.b.h(t6.x0(null, i10, false)) < 0.5d) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f11894w = z10;
        this.f11895x = i0.b.f(this.f11884l, t6.x0(null, this.f11897z, false), t6.x0(null, this.B, false));
        this.f11896y = i0.b.f(this.f11884l, t6.x0(null, this.A, false), t6.x0(null, this.C, false));
        if (this.D == 1 && i0.b.h(t6.x0(null, i10, false)) < 0.5d) {
            z11 = true;
        }
        this.F = z11;
    }

    @Override
    public final void onDrawFrame(GL10 gl10) {
        float f7;
        int i10;
        GLES20.glClear(16640);
        GLES20.glEnable(2929);
        float[] fArr = this.f11887o;
        if (this.E == 4) {
            f7 = 40.0f;
        } else {
            f7 = 0.0f;
        }
        Matrix.setLookAtM(fArr, 0, 0.0f, f7, 100.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        Matrix.setIdentityM(this.f11888p, 0);
        Matrix.translateM(this.f11888p, 0, 0.0f, this.e, 0.0f);
        Matrix.rotateM(this.f11888p, 0, (-this.f11881i) - this.f11882j, 1.0f, 0.0f, 0.0f);
        Matrix.rotateM(this.f11888p, 0, (-this.d) - this.f11879f, 0.0f, 1.0f, 0.0f);
        Matrix.multiplyMM(this.f11885m, 0, this.f11887o, 0, this.f11888p, 0);
        float[] fArr2 = this.f11885m;
        Matrix.multiplyMM(fArr2, 0, this.f11886n, 0, fArr2, 0);
        r rVar = this.f11878c;
        if (rVar != null) {
            rVar.f11940b = (float) Math.toRadians(this.d + this.f11879f);
            this.f11878c.f11942c = (float) Math.toRadians(this.f11881i + this.f11882j);
            this.f11878c.d = (float) Math.toRadians(this.f11880g);
            this.f11878c.e = this.h;
            r rVar2 = this.f11878c;
            rVar2.getClass();
            rVar2.J = this.f11894w;
            rVar2.E = this.f11895x;
            rVar2.F = this.f11896y;
            float[] fArr3 = this.f11885m;
            float[] fArr4 = this.f11888p;
            int i11 = this.f11876a;
            int i12 = this.f11877b;
            float f10 = this.f11891s;
            float f11 = this.f11893u;
            float f12 = this.f11892t;
            float f13 = this.v;
            float f14 = this.f11883k;
            float f15 = this.f11884l;
            float f16 = this.G;
            if (rVar2.f11938a != null) {
                float min = Math.min(1.0f, (Math.max(0.0f, Math.min(f16, 0.1f)) / 0.22f) + rVar2.f11963z);
                rVar2.f11963z = min;
                a aVar = rVar2.f11938a;
                aVar.B = rVar2.e;
                aVar.C = 0;
                aVar.c(i11, i12, rVar2.f11940b, rVar2.f11942c, rVar2.d, f16, min * rVar2.A, f14, false);
                return;
            }
            if (rVar2.Z != null) {
                GLES20.glBindTexture(3553, rVar2.f11953o);
                i10 = 0;
                GLUtils.texImage2D(3553, 0, rVar2.Z, 0);
                rVar2.Z = null;
            } else {
                i10 = 0;
            }
            GLES20.glUniform1i(rVar2.f11950l, i10);
            GLES20.glUniform1f(rVar2.f11957s, rVar2.f11961x);
            GLES20.glUniform1f(rVar2.f11958t, rVar2.f11963z);
            GLES20.glUniform1f(rVar2.v, f14);
            GLES20.glUniform1f(rVar2.f11960w, f15);
            GLES20.glUniformMatrix4fv(rVar2.f11946g, 1, false, fArr3, 0);
            GLES20.glUniformMatrix4fv(rVar2.h, 1, false, fArr4, 0);
            GLES20.glUniform1f(rVar2.K, rVar2.B);
            GLES20.glUniform1f(rVar2.L, rVar2.C);
            GLES20.glUniform1f(rVar2.M, rVar2.D);
            GLES20.glUniform1f(rVar2.P, rVar2.G);
            GLES20.glUniform3f(rVar2.N, Color.red(rVar2.E) / 255.0f, Color.green(rVar2.E) / 255.0f, Color.blue(rVar2.E) / 255.0f);
            GLES20.glUniform3f(rVar2.O, Color.red(rVar2.F) / 255.0f, Color.green(rVar2.F) / 255.0f, Color.blue(rVar2.F) / 255.0f);
            GLES20.glUniform3f(rVar2.Q, Color.red(rVar2.H) / 255.0f, Color.green(rVar2.H) / 255.0f, Color.blue(rVar2.H) / 255.0f);
            GLES20.glUniform3f(rVar2.R, Color.red(rVar2.I) / 255.0f, Color.green(rVar2.I) / 255.0f, Color.blue(rVar2.I) / 255.0f);
            GLES20.glUniform2f(rVar2.S, i11, i12);
            GLES20.glUniform4f(rVar2.T, f10, f11, f12, f13);
            GLES20.glUniform1i(rVar2.W, rVar2.J ? 1 : 0);
            float f17 = rVar2.f11944d0 + f16;
            rVar2.f11944d0 = f17;
            GLES20.glUniform1f(rVar2.X, f17);
            for (int i13 = 0; i13 < rVar2.f11939a0; i13++) {
                int i14 = i13 * 3;
                GLES20.glBindBuffer(34962, rVar2.f11943c0[i14]);
                GLES20.glVertexAttribPointer(rVar2.f11955q, 2, 5126, false, 0, 0);
                GLES20.glBindBuffer(34962, rVar2.f11943c0[i14 + 1]);
                GLES20.glVertexAttribPointer(rVar2.f11956r, 3, 5126, false, 0, 0);
                GLES20.glBindBuffer(34962, rVar2.f11943c0[i14 + 2]);
                GLES20.glVertexAttribPointer(rVar2.f11954p, 3, 5126, false, 0, 0);
                GLES20.glUniform1i(rVar2.U, i13);
                GLES20.glUniform1i(rVar2.V, rVar2.f11941b0);
                GLES20.glDrawArrays(4, 0, rVar2.f11962y[i13] / 3);
            }
            float f18 = rVar2.f11963z;
            if (f18 < 1.0f) {
                float f19 = f18 + 0.07272727f;
                rVar2.f11963z = f19;
                if (f19 > 1.0f) {
                    rVar2.f11963z = 1.0f;
                }
            }
            float f20 = rVar2.f11961x + 5.0E-4f;
            rVar2.f11961x = f20;
            if (f20 > 1.0f) {
                rVar2.f11961x = f20 - 1.0f;
            }
        }
    }

    @Override
    public final void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        float f7;
        this.f11876a = i10;
        this.f11877b = i11;
        GLES20.glViewport(0, 0, i10, i11);
        float f10 = i10 / i11;
        if (this.E == 4) {
            f7 = 12.0f;
        } else {
            f7 = 53.13f;
        }
        Matrix.perspectiveM(this.f11886n, 0, f7, f10, 1.0f, 200.0f);
    }

    @Override
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        r rVar = this.f11878c;
        if (rVar != null) {
            a aVar = rVar.f11938a;
            if (aVar != null) {
                aVar.b();
                rVar.f11938a = null;
            } else {
                GLES20.glDeleteProgram(rVar.f11945f);
            }
        }
        r rVar2 = new r(this.f11889q, this.E);
        this.f11878c = rVar2;
        Bitmap bitmap = this.f11890r;
        if (bitmap != null && rVar2.f11938a == null) {
            rVar2.Z = bitmap;
        }
        if (this.F) {
            rVar2.B = 1.0f;
            rVar2.C = 0.2f;
        }
    }
}
