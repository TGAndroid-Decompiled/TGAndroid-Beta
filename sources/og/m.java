package og;

import android.graphics.Matrix;
public final class m {
    public float f21002a;
    public float f21003b;
    public float f21006f;
    public float h;
    public boolean f21009j;
    public final o f21011l;
    public float f21004c = 0.0f;
    public float d = 0.0f;
    public float f21005e = 1.0f;
    public final float f21007g = 0;
    public float f21008i = 0.0f;
    public final Matrix f21010k = new Matrix();

    public m(o oVar, int i7, int i10) {
        this.f21011l = oVar;
        this.f21002a = i7;
        this.f21003b = i10;
    }

    public static float a(m mVar) {
        if ((mVar.h + mVar.f21007g) % 180.0f != 0.0f) {
            return mVar.f21003b;
        }
        return mVar.f21002a;
    }

    public static float b(m mVar) {
        if ((mVar.h + mVar.f21007g) % 180.0f != 0.0f) {
            return mVar.f21002a;
        }
        return mVar.f21003b;
    }

    public static boolean c(m mVar) {
        if (Math.abs(mVar.f21004c) <= 1.0E-5f && Math.abs(mVar.d) <= 1.0E-5f && Math.abs(mVar.f21005e - mVar.f21006f) <= 1.0E-5f && Math.abs(mVar.f21008i) <= 1.0E-5f && Math.abs(mVar.h) <= 1.0E-5f) {
            return false;
        }
        return true;
    }

    public static void d(m mVar, float f10) {
        Matrix matrix = mVar.f21010k;
        matrix.reset();
        mVar.f21004c = 0.0f;
        mVar.d = 0.0f;
        mVar.f21008i = 0.0f;
        mVar.h = f10;
        mVar.h();
        float f11 = mVar.f21006f;
        mVar.f21005e = f11;
        matrix.postScale(f11, f11);
    }

    public static void e(m mVar, float f10) {
        mVar.f21008i += f10;
        mVar.f21010k.postRotate(f10, 0.0f, 0.0f);
    }

    public static void f(m mVar, float f10, float f11) {
        mVar.f21004c += f10;
        mVar.d += f11;
        mVar.f21010k.postTranslate(f10, f11);
    }

    public static void g(m mVar, float f10, float f11, float f12) {
        mVar.f21005e *= f10;
        mVar.f21010k.postScale(f10, f10, f11, f12);
    }

    public final void h() {
        float f10;
        float f11;
        float f12 = this.h;
        float f13 = this.f21007g;
        if ((f12 + f13) % 180.0f != 0.0f) {
            f10 = this.f21003b;
        } else {
            f10 = this.f21002a;
        }
        if ((f12 + f13) % 180.0f != 0.0f) {
            f11 = this.f21002a;
        } else {
            f11 = this.f21003b;
        }
        o oVar = this.f21011l;
        if (oVar.f21022y) {
            this.f21006f = oVar.f21012a.getCropWidth() / f10;
        } else {
            this.f21006f = Math.max(oVar.f21012a.getCropWidth() / f10, oVar.f21012a.getCropHeight() / f11);
        }
    }
}
