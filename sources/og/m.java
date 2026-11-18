package og;

import android.graphics.Matrix;
public final class m {
    public float f21883a;
    public float f21884b;
    public float f21887f;
    public float h;
    public boolean f21890j;
    public final o f21892l;
    public float f21885c = 0.0f;
    public float d = 0.0f;
    public float f21886e = 1.0f;
    public final float f21888g = 0;
    public float f21889i = 0.0f;
    public final Matrix f21891k = new Matrix();

    public m(o oVar, int i7, int i10) {
        this.f21892l = oVar;
        this.f21883a = i7;
        this.f21884b = i10;
    }

    public static float a(m mVar) {
        if ((mVar.h + mVar.f21888g) % 180.0f != 0.0f) {
            return mVar.f21884b;
        }
        return mVar.f21883a;
    }

    public static float b(m mVar) {
        if ((mVar.h + mVar.f21888g) % 180.0f != 0.0f) {
            return mVar.f21883a;
        }
        return mVar.f21884b;
    }

    public static boolean c(m mVar) {
        if (Math.abs(mVar.f21885c) <= 1.0E-5f && Math.abs(mVar.d) <= 1.0E-5f && Math.abs(mVar.f21886e - mVar.f21887f) <= 1.0E-5f && Math.abs(mVar.f21889i) <= 1.0E-5f && Math.abs(mVar.h) <= 1.0E-5f) {
            return false;
        }
        return true;
    }

    public static void d(m mVar, float f10) {
        Matrix matrix = mVar.f21891k;
        matrix.reset();
        mVar.f21885c = 0.0f;
        mVar.d = 0.0f;
        mVar.f21889i = 0.0f;
        mVar.h = f10;
        mVar.h();
        float f11 = mVar.f21887f;
        mVar.f21886e = f11;
        matrix.postScale(f11, f11);
    }

    public static void e(m mVar, float f10) {
        mVar.f21889i += f10;
        mVar.f21891k.postRotate(f10, 0.0f, 0.0f);
    }

    public static void f(m mVar, float f10, float f11) {
        mVar.f21885c += f10;
        mVar.d += f11;
        mVar.f21891k.postTranslate(f10, f11);
    }

    public static void g(m mVar, float f10, float f11, float f12) {
        mVar.f21886e *= f10;
        mVar.f21891k.postScale(f10, f10, f11, f12);
    }

    public final void h() {
        float f10;
        float f11;
        float f12 = this.h;
        float f13 = this.f21888g;
        if ((f12 + f13) % 180.0f != 0.0f) {
            f10 = this.f21884b;
        } else {
            f10 = this.f21883a;
        }
        if ((f12 + f13) % 180.0f != 0.0f) {
            f11 = this.f21883a;
        } else {
            f11 = this.f21884b;
        }
        o oVar = this.f21892l;
        if (oVar.f21903y) {
            this.f21887f = oVar.f21893a.getCropWidth() / f10;
        } else {
            this.f21887f = Math.max(oVar.f21893a.getCropWidth() / f10, oVar.f21893a.getCropHeight() / f11);
        }
    }
}
