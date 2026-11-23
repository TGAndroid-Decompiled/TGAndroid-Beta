package og;

import android.graphics.Matrix;
public final class m {
    public float f21877a;
    public float f21878b;
    public float f21881f;
    public float h;
    public boolean f21884j;
    public final o f21886l;
    public float f21879c = 0.0f;
    public float d = 0.0f;
    public float f21880e = 1.0f;
    public final float f21882g = 0;
    public float f21883i = 0.0f;
    public final Matrix f21885k = new Matrix();

    public m(o oVar, int i7, int i10) {
        this.f21886l = oVar;
        this.f21877a = i7;
        this.f21878b = i10;
    }

    public static float a(m mVar) {
        if ((mVar.h + mVar.f21882g) % 180.0f != 0.0f) {
            return mVar.f21878b;
        }
        return mVar.f21877a;
    }

    public static float b(m mVar) {
        if ((mVar.h + mVar.f21882g) % 180.0f != 0.0f) {
            return mVar.f21877a;
        }
        return mVar.f21878b;
    }

    public static boolean c(m mVar) {
        if (Math.abs(mVar.f21879c) <= 1.0E-5f && Math.abs(mVar.d) <= 1.0E-5f && Math.abs(mVar.f21880e - mVar.f21881f) <= 1.0E-5f && Math.abs(mVar.f21883i) <= 1.0E-5f && Math.abs(mVar.h) <= 1.0E-5f) {
            return false;
        }
        return true;
    }

    public static void d(m mVar, float f10) {
        Matrix matrix = mVar.f21885k;
        matrix.reset();
        mVar.f21879c = 0.0f;
        mVar.d = 0.0f;
        mVar.f21883i = 0.0f;
        mVar.h = f10;
        mVar.h();
        float f11 = mVar.f21881f;
        mVar.f21880e = f11;
        matrix.postScale(f11, f11);
    }

    public static void e(m mVar, float f10) {
        mVar.f21883i += f10;
        mVar.f21885k.postRotate(f10, 0.0f, 0.0f);
    }

    public static void f(m mVar, float f10, float f11) {
        mVar.f21879c += f10;
        mVar.d += f11;
        mVar.f21885k.postTranslate(f10, f11);
    }

    public static void g(m mVar, float f10, float f11, float f12) {
        mVar.f21880e *= f10;
        mVar.f21885k.postScale(f10, f10, f11, f12);
    }

    public final void h() {
        float f10;
        float f11;
        float f12 = this.h;
        float f13 = this.f21882g;
        if ((f12 + f13) % 180.0f != 0.0f) {
            f10 = this.f21878b;
        } else {
            f10 = this.f21877a;
        }
        if ((f12 + f13) % 180.0f != 0.0f) {
            f11 = this.f21877a;
        } else {
            f11 = this.f21878b;
        }
        o oVar = this.f21886l;
        if (oVar.f21897y) {
            this.f21881f = oVar.f21887a.getCropWidth() / f10;
        } else {
            this.f21881f = Math.max(oVar.f21887a.getCropWidth() / f10, oVar.f21887a.getCropHeight() / f11);
        }
    }
}
