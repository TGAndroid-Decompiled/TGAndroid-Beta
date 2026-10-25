package ng;

import android.graphics.Matrix;
public final class n {
    public float f18834a;
    public float f18835b;
    public float f18837f;
    public float h;
    public boolean f18840j;
    public final p f18842l;
    public float f18836c = 0.0f;
    public float d = 0.0f;
    public float e = 1.0f;
    public final float f18838g = 0;
    public float f18839i = 0.0f;
    public final Matrix f18841k = new Matrix();

    public n(p pVar, int i10, int i11) {
        this.f18842l = pVar;
        this.f18834a = i10;
        this.f18835b = i11;
    }

    public static float a(n nVar) {
        if ((nVar.h + nVar.f18838g) % 180.0f != 0.0f) {
            return nVar.f18835b;
        }
        return nVar.f18834a;
    }

    public static float b(n nVar) {
        if ((nVar.h + nVar.f18838g) % 180.0f != 0.0f) {
            return nVar.f18834a;
        }
        return nVar.f18835b;
    }

    public static boolean c(n nVar) {
        if (Math.abs(nVar.f18836c) <= 1.0E-5f && Math.abs(nVar.d) <= 1.0E-5f && Math.abs(nVar.e - nVar.f18837f) <= 1.0E-5f && Math.abs(nVar.f18839i) <= 1.0E-5f && Math.abs(nVar.h) <= 1.0E-5f) {
            return false;
        }
        return true;
    }

    public static void d(n nVar, float f7) {
        Matrix matrix = nVar.f18841k;
        matrix.reset();
        nVar.f18836c = 0.0f;
        nVar.d = 0.0f;
        nVar.f18839i = 0.0f;
        nVar.h = f7;
        nVar.h();
        float f10 = nVar.f18837f;
        nVar.e = f10;
        matrix.postScale(f10, f10);
    }

    public static void e(n nVar, float f7) {
        nVar.f18839i += f7;
        nVar.f18841k.postRotate(f7, 0.0f, 0.0f);
    }

    public static void f(n nVar, float f7, float f10) {
        nVar.f18836c += f7;
        nVar.d += f10;
        nVar.f18841k.postTranslate(f7, f10);
    }

    public static void g(n nVar, float f7, float f10, float f11) {
        nVar.e *= f7;
        nVar.f18841k.postScale(f7, f7, f10, f11);
    }

    public final void h() {
        float f7;
        float f10;
        float f11 = this.h;
        float f12 = this.f18838g;
        if ((f11 + f12) % 180.0f != 0.0f) {
            f7 = this.f18835b;
        } else {
            f7 = this.f18834a;
        }
        if ((f11 + f12) % 180.0f != 0.0f) {
            f10 = this.f18834a;
        } else {
            f10 = this.f18835b;
        }
        p pVar = this.f18842l;
        if (pVar.f18851x) {
            this.f18837f = pVar.f18843a.getCropWidth() / f7;
        } else {
            this.f18837f = Math.max(pVar.f18843a.getCropWidth() / f7, pVar.f18843a.getCropHeight() / f10);
        }
    }
}
