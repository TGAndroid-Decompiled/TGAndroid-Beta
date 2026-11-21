package og;

import android.graphics.Matrix;
public final class m {
    public float f21908a;
    public float f21909b;
    public float f21912f;
    public float h;
    public boolean f21915j;
    public final o f21917l;
    public float f21910c = 0.0f;
    public float d = 0.0f;
    public float f21911e = 1.0f;
    public final float f21913g = 0;
    public float f21914i = 0.0f;
    public final Matrix f21916k = new Matrix();

    public m(o oVar, int i7, int i10) {
        this.f21917l = oVar;
        this.f21908a = i7;
        this.f21909b = i10;
    }

    public static float a(m mVar) {
        if ((mVar.h + mVar.f21913g) % 180.0f != 0.0f) {
            return mVar.f21909b;
        }
        return mVar.f21908a;
    }

    public static float b(m mVar) {
        if ((mVar.h + mVar.f21913g) % 180.0f != 0.0f) {
            return mVar.f21908a;
        }
        return mVar.f21909b;
    }

    public static boolean c(m mVar) {
        if (Math.abs(mVar.f21910c) <= 1.0E-5f && Math.abs(mVar.d) <= 1.0E-5f && Math.abs(mVar.f21911e - mVar.f21912f) <= 1.0E-5f && Math.abs(mVar.f21914i) <= 1.0E-5f && Math.abs(mVar.h) <= 1.0E-5f) {
            return false;
        }
        return true;
    }

    public static void d(m mVar, float f10) {
        Matrix matrix = mVar.f21916k;
        matrix.reset();
        mVar.f21910c = 0.0f;
        mVar.d = 0.0f;
        mVar.f21914i = 0.0f;
        mVar.h = f10;
        mVar.h();
        float f11 = mVar.f21912f;
        mVar.f21911e = f11;
        matrix.postScale(f11, f11);
    }

    public static void e(m mVar, float f10) {
        mVar.f21914i += f10;
        mVar.f21916k.postRotate(f10, 0.0f, 0.0f);
    }

    public static void f(m mVar, float f10, float f11) {
        mVar.f21910c += f10;
        mVar.d += f11;
        mVar.f21916k.postTranslate(f10, f11);
    }

    public static void g(m mVar, float f10, float f11, float f12) {
        mVar.f21911e *= f10;
        mVar.f21916k.postScale(f10, f10, f11, f12);
    }

    public final void h() {
        float f10;
        float f11;
        float f12 = this.h;
        float f13 = this.f21913g;
        if ((f12 + f13) % 180.0f != 0.0f) {
            f10 = this.f21909b;
        } else {
            f10 = this.f21908a;
        }
        if ((f12 + f13) % 180.0f != 0.0f) {
            f11 = this.f21908a;
        } else {
            f11 = this.f21909b;
        }
        o oVar = this.f21917l;
        if (oVar.f21928y) {
            this.f21912f = oVar.f21918a.getCropWidth() / f10;
        } else {
            this.f21912f = Math.max(oVar.f21918a.getCropWidth() / f10, oVar.f21918a.getCropHeight() / f11);
        }
    }
}
