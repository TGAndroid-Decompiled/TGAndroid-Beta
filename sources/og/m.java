package og;

import android.graphics.Matrix;
public final class m {
    public float f20994a;
    public float f20995b;
    public float f20998f;
    public float h;
    public boolean f21001j;
    public final o f21003l;
    public float f20996c = 0.0f;
    public float d = 0.0f;
    public float f20997e = 1.0f;
    public final float f20999g = 0;
    public float f21000i = 0.0f;
    public final Matrix f21002k = new Matrix();

    public m(o oVar, int i7, int i10) {
        this.f21003l = oVar;
        this.f20994a = i7;
        this.f20995b = i10;
    }

    public static float a(m mVar) {
        if ((mVar.h + mVar.f20999g) % 180.0f != 0.0f) {
            return mVar.f20995b;
        }
        return mVar.f20994a;
    }

    public static float b(m mVar) {
        if ((mVar.h + mVar.f20999g) % 180.0f != 0.0f) {
            return mVar.f20994a;
        }
        return mVar.f20995b;
    }

    public static boolean c(m mVar) {
        if (Math.abs(mVar.f20996c) <= 1.0E-5f && Math.abs(mVar.d) <= 1.0E-5f && Math.abs(mVar.f20997e - mVar.f20998f) <= 1.0E-5f && Math.abs(mVar.f21000i) <= 1.0E-5f && Math.abs(mVar.h) <= 1.0E-5f) {
            return false;
        }
        return true;
    }

    public static void d(m mVar, float f10) {
        Matrix matrix = mVar.f21002k;
        matrix.reset();
        mVar.f20996c = 0.0f;
        mVar.d = 0.0f;
        mVar.f21000i = 0.0f;
        mVar.h = f10;
        mVar.h();
        float f11 = mVar.f20998f;
        mVar.f20997e = f11;
        matrix.postScale(f11, f11);
    }

    public static void e(m mVar, float f10) {
        mVar.f21000i += f10;
        mVar.f21002k.postRotate(f10, 0.0f, 0.0f);
    }

    public static void f(m mVar, float f10, float f11) {
        mVar.f20996c += f10;
        mVar.d += f11;
        mVar.f21002k.postTranslate(f10, f11);
    }

    public static void g(m mVar, float f10, float f11, float f12) {
        mVar.f20997e *= f10;
        mVar.f21002k.postScale(f10, f10, f11, f12);
    }

    public final void h() {
        float f10;
        float f11;
        float f12 = this.h;
        float f13 = this.f20999g;
        if ((f12 + f13) % 180.0f != 0.0f) {
            f10 = this.f20995b;
        } else {
            f10 = this.f20994a;
        }
        if ((f12 + f13) % 180.0f != 0.0f) {
            f11 = this.f20994a;
        } else {
            f11 = this.f20995b;
        }
        o oVar = this.f21003l;
        if (oVar.f21014y) {
            this.f20998f = oVar.f21004a.getCropWidth() / f10;
        } else {
            this.f20998f = Math.max(oVar.f21004a.getCropWidth() / f10, oVar.f21004a.getCropHeight() / f11);
        }
    }
}
