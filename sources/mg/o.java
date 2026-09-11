package mg;

import android.graphics.Matrix;
public final class o {
    public float f16293a;
    public float f16294b;
    public float f16297f;
    public float h;
    public boolean f16300j;
    public final q f16302l;
    public float f16295c = 0.0f;
    public float d = 0.0f;
    public float f16296e = 1.0f;
    public final float f16298g = 0;
    public float f16299i = 0.0f;
    public final Matrix f16301k = new Matrix();

    public o(q qVar, int i10, int i11) {
        this.f16302l = qVar;
        this.f16293a = i10;
        this.f16294b = i11;
    }

    public static float a(o oVar) {
        if ((oVar.h + oVar.f16298g) % 180.0f != 0.0f) {
            return oVar.f16294b;
        }
        return oVar.f16293a;
    }

    public static float b(o oVar) {
        if ((oVar.h + oVar.f16298g) % 180.0f != 0.0f) {
            return oVar.f16293a;
        }
        return oVar.f16294b;
    }

    public static boolean c(o oVar) {
        if (Math.abs(oVar.f16295c) <= 1.0E-5f && Math.abs(oVar.d) <= 1.0E-5f && Math.abs(oVar.f16296e - oVar.f16297f) <= 1.0E-5f && Math.abs(oVar.f16299i) <= 1.0E-5f && Math.abs(oVar.h) <= 1.0E-5f) {
            return false;
        }
        return true;
    }

    public static void d(o oVar, float f7) {
        Matrix matrix = oVar.f16301k;
        matrix.reset();
        oVar.f16295c = 0.0f;
        oVar.d = 0.0f;
        oVar.f16299i = 0.0f;
        oVar.h = f7;
        oVar.h();
        float f10 = oVar.f16297f;
        oVar.f16296e = f10;
        matrix.postScale(f10, f10);
    }

    public static void e(o oVar, float f7) {
        oVar.f16299i += f7;
        oVar.f16301k.postRotate(f7, 0.0f, 0.0f);
    }

    public static void f(o oVar, float f7, float f10) {
        oVar.f16295c += f7;
        oVar.d += f10;
        oVar.f16301k.postTranslate(f7, f10);
    }

    public static void g(o oVar, float f7, float f10, float f11) {
        oVar.f16296e *= f7;
        oVar.f16301k.postScale(f7, f7, f10, f11);
    }

    public final void h() {
        float f7;
        float f10;
        float f11 = this.h;
        float f12 = this.f16298g;
        if ((f11 + f12) % 180.0f != 0.0f) {
            f7 = this.f16294b;
        } else {
            f7 = this.f16293a;
        }
        if ((f11 + f12) % 180.0f != 0.0f) {
            f10 = this.f16293a;
        } else {
            f10 = this.f16294b;
        }
        q qVar = this.f16302l;
        if (qVar.f16312x) {
            this.f16297f = qVar.f16303a.getCropWidth() / f7;
        } else {
            this.f16297f = Math.max(qVar.f16303a.getCropWidth() / f7, qVar.f16303a.getCropHeight() / f10);
        }
    }
}
