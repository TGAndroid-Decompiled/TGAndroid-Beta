package og;

import android.graphics.Matrix;
public final class m {
    public float f21911a;
    public float f21912b;
    public float f21915f;
    public float h;
    public boolean f21918j;
    public final o f21920l;
    public float f21913c = 0.0f;
    public float d = 0.0f;
    public float f21914e = 1.0f;
    public final float f21916g = 0;
    public float f21917i = 0.0f;
    public final Matrix f21919k = new Matrix();

    public m(o oVar, int i7, int i10) {
        this.f21920l = oVar;
        this.f21911a = i7;
        this.f21912b = i10;
    }

    public static float a(m mVar) {
        if ((mVar.h + mVar.f21916g) % 180.0f != 0.0f) {
            return mVar.f21912b;
        }
        return mVar.f21911a;
    }

    public static float b(m mVar) {
        if ((mVar.h + mVar.f21916g) % 180.0f != 0.0f) {
            return mVar.f21911a;
        }
        return mVar.f21912b;
    }

    public static boolean c(m mVar) {
        if (Math.abs(mVar.f21913c) <= 1.0E-5f && Math.abs(mVar.d) <= 1.0E-5f && Math.abs(mVar.f21914e - mVar.f21915f) <= 1.0E-5f && Math.abs(mVar.f21917i) <= 1.0E-5f && Math.abs(mVar.h) <= 1.0E-5f) {
            return false;
        }
        return true;
    }

    public static void d(m mVar, float f10) {
        Matrix matrix = mVar.f21919k;
        matrix.reset();
        mVar.f21913c = 0.0f;
        mVar.d = 0.0f;
        mVar.f21917i = 0.0f;
        mVar.h = f10;
        mVar.h();
        float f11 = mVar.f21915f;
        mVar.f21914e = f11;
        matrix.postScale(f11, f11);
    }

    public static void e(m mVar, float f10) {
        mVar.f21917i += f10;
        mVar.f21919k.postRotate(f10, 0.0f, 0.0f);
    }

    public static void f(m mVar, float f10, float f11) {
        mVar.f21913c += f10;
        mVar.d += f11;
        mVar.f21919k.postTranslate(f10, f11);
    }

    public static void g(m mVar, float f10, float f11, float f12) {
        mVar.f21914e *= f10;
        mVar.f21919k.postScale(f10, f10, f11, f12);
    }

    public final void h() {
        float f10;
        float f11;
        float f12 = this.h;
        float f13 = this.f21916g;
        if ((f12 + f13) % 180.0f != 0.0f) {
            f10 = this.f21912b;
        } else {
            f10 = this.f21911a;
        }
        if ((f12 + f13) % 180.0f != 0.0f) {
            f11 = this.f21911a;
        } else {
            f11 = this.f21912b;
        }
        o oVar = this.f21920l;
        if (oVar.f21931y) {
            this.f21915f = oVar.f21921a.getCropWidth() / f10;
        } else {
            this.f21915f = Math.max(oVar.f21921a.getCropWidth() / f10, oVar.f21921a.getCropHeight() / f11);
        }
    }
}
