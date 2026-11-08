package og;

import android.graphics.Matrix;
public final class m {
    public float f20997a;
    public float f20998b;
    public float f21001f;
    public float h;
    public boolean f21004j;
    public final o f21006l;
    public float f20999c = 0.0f;
    public float d = 0.0f;
    public float f21000e = 1.0f;
    public final float f21002g = 0;
    public float f21003i = 0.0f;
    public final Matrix f21005k = new Matrix();

    public m(o oVar, int i7, int i10) {
        this.f21006l = oVar;
        this.f20997a = i7;
        this.f20998b = i10;
    }

    public static float a(m mVar) {
        if ((mVar.h + mVar.f21002g) % 180.0f != 0.0f) {
            return mVar.f20998b;
        }
        return mVar.f20997a;
    }

    public static float b(m mVar) {
        if ((mVar.h + mVar.f21002g) % 180.0f != 0.0f) {
            return mVar.f20997a;
        }
        return mVar.f20998b;
    }

    public static boolean c(m mVar) {
        if (Math.abs(mVar.f20999c) <= 1.0E-5f && Math.abs(mVar.d) <= 1.0E-5f && Math.abs(mVar.f21000e - mVar.f21001f) <= 1.0E-5f && Math.abs(mVar.f21003i) <= 1.0E-5f && Math.abs(mVar.h) <= 1.0E-5f) {
            return false;
        }
        return true;
    }

    public static void d(m mVar, float f10) {
        Matrix matrix = mVar.f21005k;
        matrix.reset();
        mVar.f20999c = 0.0f;
        mVar.d = 0.0f;
        mVar.f21003i = 0.0f;
        mVar.h = f10;
        mVar.h();
        float f11 = mVar.f21001f;
        mVar.f21000e = f11;
        matrix.postScale(f11, f11);
    }

    public static void e(m mVar, float f10) {
        mVar.f21003i += f10;
        mVar.f21005k.postRotate(f10, 0.0f, 0.0f);
    }

    public static void f(m mVar, float f10, float f11) {
        mVar.f20999c += f10;
        mVar.d += f11;
        mVar.f21005k.postTranslate(f10, f11);
    }

    public static void g(m mVar, float f10, float f11, float f12) {
        mVar.f21000e *= f10;
        mVar.f21005k.postScale(f10, f10, f11, f12);
    }

    public final void h() {
        float f10;
        float f11;
        float f12 = this.h;
        float f13 = this.f21002g;
        if ((f12 + f13) % 180.0f != 0.0f) {
            f10 = this.f20998b;
        } else {
            f10 = this.f20997a;
        }
        if ((f12 + f13) % 180.0f != 0.0f) {
            f11 = this.f20997a;
        } else {
            f11 = this.f20998b;
        }
        o oVar = this.f21006l;
        if (oVar.f21017y) {
            this.f21001f = oVar.f21007a.getCropWidth() / f10;
        } else {
            this.f21001f = Math.max(oVar.f21007a.getCropWidth() / f10, oVar.f21007a.getCropHeight() / f11);
        }
    }
}
