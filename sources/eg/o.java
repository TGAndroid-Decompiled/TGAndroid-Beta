package eg;

import android.graphics.Matrix;
public final class o {
    public float f6574a;
    public float f6575b;
    public float f6577f;
    public float h;
    public boolean f6580j;
    public final q f6582l;
    public float f6576c = 0.0f;
    public float d = 0.0f;
    public float e = 1.0f;
    public final float f6578g = 0;
    public float f6579i = 0.0f;
    public final Matrix f6581k = new Matrix();

    public o(q qVar, int i10, int i11) {
        this.f6582l = qVar;
        this.f6574a = i10;
        this.f6575b = i11;
    }

    public static float a(o oVar) {
        if ((oVar.h + oVar.f6578g) % 180.0f != 0.0f) {
            return oVar.f6575b;
        }
        return oVar.f6574a;
    }

    public static float b(o oVar) {
        if ((oVar.h + oVar.f6578g) % 180.0f != 0.0f) {
            return oVar.f6574a;
        }
        return oVar.f6575b;
    }

    public static boolean c(o oVar) {
        if (Math.abs(oVar.f6576c) <= 1.0E-5f && Math.abs(oVar.d) <= 1.0E-5f && Math.abs(oVar.e - oVar.f6577f) <= 1.0E-5f && Math.abs(oVar.f6579i) <= 1.0E-5f && Math.abs(oVar.h) <= 1.0E-5f) {
            return false;
        }
        return true;
    }

    public static void d(o oVar, float f7) {
        Matrix matrix = oVar.f6581k;
        matrix.reset();
        oVar.f6576c = 0.0f;
        oVar.d = 0.0f;
        oVar.f6579i = 0.0f;
        oVar.h = f7;
        oVar.h();
        float f10 = oVar.f6577f;
        oVar.e = f10;
        matrix.postScale(f10, f10);
    }

    public static void e(o oVar, float f7) {
        oVar.f6579i += f7;
        oVar.f6581k.postRotate(f7, 0.0f, 0.0f);
    }

    public static void f(o oVar, float f7, float f10) {
        oVar.f6576c += f7;
        oVar.d += f10;
        oVar.f6581k.postTranslate(f7, f10);
    }

    public static void g(o oVar, float f7, float f10, float f11) {
        oVar.e *= f7;
        oVar.f6581k.postScale(f7, f7, f10, f11);
    }

    public final void h() {
        float f7;
        float f10;
        float f11 = this.h;
        float f12 = this.f6578g;
        if ((f11 + f12) % 180.0f != 0.0f) {
            f7 = this.f6575b;
        } else {
            f7 = this.f6574a;
        }
        if ((f11 + f12) % 180.0f != 0.0f) {
            f10 = this.f6574a;
        } else {
            f10 = this.f6575b;
        }
        q qVar = this.f6582l;
        if (qVar.f6592y) {
            this.f6577f = qVar.f6583a.getCropWidth() / f7;
        } else {
            this.f6577f = Math.max(qVar.f6583a.getCropWidth() / f7, qVar.f6583a.getCropHeight() / f10);
        }
    }
}
