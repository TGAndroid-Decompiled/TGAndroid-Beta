package og;

import android.graphics.Matrix;
public final class m {
    public float f21977a;
    public float f21978b;
    public float f21981f;
    public float h;
    public boolean f21984j;
    public final o f21986l;
    public float f21979c = 0.0f;
    public float d = 0.0f;
    public float f21980e = 1.0f;
    public final float f21982g = 0;
    public float f21983i = 0.0f;
    public final Matrix f21985k = new Matrix();

    public m(o oVar, int i7, int i10) {
        this.f21986l = oVar;
        this.f21977a = i7;
        this.f21978b = i10;
    }

    public static float a(m mVar) {
        if ((mVar.h + mVar.f21982g) % 180.0f != 0.0f) {
            return mVar.f21978b;
        }
        return mVar.f21977a;
    }

    public static float b(m mVar) {
        if ((mVar.h + mVar.f21982g) % 180.0f != 0.0f) {
            return mVar.f21977a;
        }
        return mVar.f21978b;
    }

    public static boolean c(m mVar) {
        if (Math.abs(mVar.f21979c) <= 1.0E-5f && Math.abs(mVar.d) <= 1.0E-5f && Math.abs(mVar.f21980e - mVar.f21981f) <= 1.0E-5f && Math.abs(mVar.f21983i) <= 1.0E-5f && Math.abs(mVar.h) <= 1.0E-5f) {
            return false;
        }
        return true;
    }

    public static void d(m mVar, float f10) {
        Matrix matrix = mVar.f21985k;
        matrix.reset();
        mVar.f21979c = 0.0f;
        mVar.d = 0.0f;
        mVar.f21983i = 0.0f;
        mVar.h = f10;
        mVar.h();
        float f11 = mVar.f21981f;
        mVar.f21980e = f11;
        matrix.postScale(f11, f11);
    }

    public static void e(m mVar, float f10) {
        mVar.f21983i += f10;
        mVar.f21985k.postRotate(f10, 0.0f, 0.0f);
    }

    public static void f(m mVar, float f10, float f11) {
        mVar.f21979c += f10;
        mVar.d += f11;
        mVar.f21985k.postTranslate(f10, f11);
    }

    public static void g(m mVar, float f10, float f11, float f12) {
        mVar.f21980e *= f10;
        mVar.f21985k.postScale(f10, f10, f11, f12);
    }

    public final void h() {
        float f10;
        float f11;
        float f12 = this.h;
        float f13 = this.f21982g;
        if ((f12 + f13) % 180.0f != 0.0f) {
            f10 = this.f21978b;
        } else {
            f10 = this.f21977a;
        }
        if ((f12 + f13) % 180.0f != 0.0f) {
            f11 = this.f21977a;
        } else {
            f11 = this.f21978b;
        }
        o oVar = this.f21986l;
        if (oVar.f21997y) {
            this.f21981f = oVar.f21987a.getCropWidth() / f10;
        } else {
            this.f21981f = Math.max(oVar.f21987a.getCropWidth() / f10, oVar.f21987a.getCropHeight() / f11);
        }
    }
}
