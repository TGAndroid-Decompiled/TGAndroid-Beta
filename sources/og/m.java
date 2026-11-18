package og;

import android.graphics.Matrix;
public final class m {
    public float f21886a;
    public float f21887b;
    public float f21890f;
    public float h;
    public boolean f21893j;
    public final o f21895l;
    public float f21888c = 0.0f;
    public float d = 0.0f;
    public float f21889e = 1.0f;
    public final float f21891g = 0;
    public float f21892i = 0.0f;
    public final Matrix f21894k = new Matrix();

    public m(o oVar, int i7, int i10) {
        this.f21895l = oVar;
        this.f21886a = i7;
        this.f21887b = i10;
    }

    public static float a(m mVar) {
        if ((mVar.h + mVar.f21891g) % 180.0f != 0.0f) {
            return mVar.f21887b;
        }
        return mVar.f21886a;
    }

    public static float b(m mVar) {
        if ((mVar.h + mVar.f21891g) % 180.0f != 0.0f) {
            return mVar.f21886a;
        }
        return mVar.f21887b;
    }

    public static boolean c(m mVar) {
        if (Math.abs(mVar.f21888c) <= 1.0E-5f && Math.abs(mVar.d) <= 1.0E-5f && Math.abs(mVar.f21889e - mVar.f21890f) <= 1.0E-5f && Math.abs(mVar.f21892i) <= 1.0E-5f && Math.abs(mVar.h) <= 1.0E-5f) {
            return false;
        }
        return true;
    }

    public static void d(m mVar, float f10) {
        Matrix matrix = mVar.f21894k;
        matrix.reset();
        mVar.f21888c = 0.0f;
        mVar.d = 0.0f;
        mVar.f21892i = 0.0f;
        mVar.h = f10;
        mVar.h();
        float f11 = mVar.f21890f;
        mVar.f21889e = f11;
        matrix.postScale(f11, f11);
    }

    public static void e(m mVar, float f10) {
        mVar.f21892i += f10;
        mVar.f21894k.postRotate(f10, 0.0f, 0.0f);
    }

    public static void f(m mVar, float f10, float f11) {
        mVar.f21888c += f10;
        mVar.d += f11;
        mVar.f21894k.postTranslate(f10, f11);
    }

    public static void g(m mVar, float f10, float f11, float f12) {
        mVar.f21889e *= f10;
        mVar.f21894k.postScale(f10, f10, f11, f12);
    }

    public final void h() {
        float f10;
        float f11;
        float f12 = this.h;
        float f13 = this.f21891g;
        if ((f12 + f13) % 180.0f != 0.0f) {
            f10 = this.f21887b;
        } else {
            f10 = this.f21886a;
        }
        if ((f12 + f13) % 180.0f != 0.0f) {
            f11 = this.f21886a;
        } else {
            f11 = this.f21887b;
        }
        o oVar = this.f21895l;
        if (oVar.f21906y) {
            this.f21890f = oVar.f21896a.getCropWidth() / f10;
        } else {
            this.f21890f = Math.max(oVar.f21896a.getCropWidth() / f10, oVar.f21896a.getCropHeight() / f11);
        }
    }
}
