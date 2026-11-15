package og;

import android.graphics.Matrix;
public final class m {
    public float f21520a;
    public float f21521b;
    public float f21524f;
    public float h;
    public boolean f21527j;
    public final o f21529l;
    public float f21522c = 0.0f;
    public float d = 0.0f;
    public float f21523e = 1.0f;
    public final float f21525g = 0;
    public float f21526i = 0.0f;
    public final Matrix f21528k = new Matrix();

    public m(o oVar, int i7, int i10) {
        this.f21529l = oVar;
        this.f21520a = i7;
        this.f21521b = i10;
    }

    public static float a(m mVar) {
        if ((mVar.h + mVar.f21525g) % 180.0f != 0.0f) {
            return mVar.f21521b;
        }
        return mVar.f21520a;
    }

    public static float b(m mVar) {
        if ((mVar.h + mVar.f21525g) % 180.0f != 0.0f) {
            return mVar.f21520a;
        }
        return mVar.f21521b;
    }

    public static boolean c(m mVar) {
        if (Math.abs(mVar.f21522c) <= 1.0E-5f && Math.abs(mVar.d) <= 1.0E-5f && Math.abs(mVar.f21523e - mVar.f21524f) <= 1.0E-5f && Math.abs(mVar.f21526i) <= 1.0E-5f && Math.abs(mVar.h) <= 1.0E-5f) {
            return false;
        }
        return true;
    }

    public static void d(m mVar, float f10) {
        Matrix matrix = mVar.f21528k;
        matrix.reset();
        mVar.f21522c = 0.0f;
        mVar.d = 0.0f;
        mVar.f21526i = 0.0f;
        mVar.h = f10;
        mVar.h();
        float f11 = mVar.f21524f;
        mVar.f21523e = f11;
        matrix.postScale(f11, f11);
    }

    public static void e(m mVar, float f10) {
        mVar.f21526i += f10;
        mVar.f21528k.postRotate(f10, 0.0f, 0.0f);
    }

    public static void f(m mVar, float f10, float f11) {
        mVar.f21522c += f10;
        mVar.d += f11;
        mVar.f21528k.postTranslate(f10, f11);
    }

    public static void g(m mVar, float f10, float f11, float f12) {
        mVar.f21523e *= f10;
        mVar.f21528k.postScale(f10, f10, f11, f12);
    }

    public final void h() {
        float f10;
        float f11;
        float f12 = this.h;
        float f13 = this.f21525g;
        if ((f12 + f13) % 180.0f != 0.0f) {
            f10 = this.f21521b;
        } else {
            f10 = this.f21520a;
        }
        if ((f12 + f13) % 180.0f != 0.0f) {
            f11 = this.f21520a;
        } else {
            f11 = this.f21521b;
        }
        o oVar = this.f21529l;
        if (oVar.f21540y) {
            this.f21524f = oVar.f21530a.getCropWidth() / f10;
        } else {
            this.f21524f = Math.max(oVar.f21530a.getCropWidth() / f10, oVar.f21530a.getCropHeight() / f11);
        }
    }
}
