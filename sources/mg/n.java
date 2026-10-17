package mg;

import android.graphics.Matrix;
public final class n {
    public float f16902a;
    public float f16903b;
    public float f16905f;
    public float h;
    public boolean f16908j;
    public final p f16910l;
    public float f16904c = 0.0f;
    public float d = 0.0f;
    public float e = 1.0f;
    public final float f16906g = 0;
    public float f16907i = 0.0f;
    public final Matrix f16909k = new Matrix();

    public n(p pVar, int i10, int i11) {
        this.f16910l = pVar;
        this.f16902a = i10;
        this.f16903b = i11;
    }

    public static float a(n nVar) {
        if ((nVar.h + nVar.f16906g) % 180.0f != 0.0f) {
            return nVar.f16903b;
        }
        return nVar.f16902a;
    }

    public static float b(n nVar) {
        if ((nVar.h + nVar.f16906g) % 180.0f != 0.0f) {
            return nVar.f16902a;
        }
        return nVar.f16903b;
    }

    public static boolean c(n nVar) {
        if (Math.abs(nVar.f16904c) <= 1.0E-5f && Math.abs(nVar.d) <= 1.0E-5f && Math.abs(nVar.e - nVar.f16905f) <= 1.0E-5f && Math.abs(nVar.f16907i) <= 1.0E-5f && Math.abs(nVar.h) <= 1.0E-5f) {
            return false;
        }
        return true;
    }

    public static void d(n nVar, float f7) {
        Matrix matrix = nVar.f16909k;
        matrix.reset();
        nVar.f16904c = 0.0f;
        nVar.d = 0.0f;
        nVar.f16907i = 0.0f;
        nVar.h = f7;
        nVar.h();
        float f10 = nVar.f16905f;
        nVar.e = f10;
        matrix.postScale(f10, f10);
    }

    public static void e(n nVar, float f7) {
        nVar.f16907i += f7;
        nVar.f16909k.postRotate(f7, 0.0f, 0.0f);
    }

    public static void f(n nVar, float f7, float f10) {
        nVar.f16904c += f7;
        nVar.d += f10;
        nVar.f16909k.postTranslate(f7, f10);
    }

    public static void g(n nVar, float f7, float f10, float f11) {
        nVar.e *= f7;
        nVar.f16909k.postScale(f7, f7, f10, f11);
    }

    public final void h() {
        float f7;
        float f10;
        float f11 = this.h;
        float f12 = this.f16906g;
        if ((f11 + f12) % 180.0f != 0.0f) {
            f7 = this.f16903b;
        } else {
            f7 = this.f16902a;
        }
        if ((f11 + f12) % 180.0f != 0.0f) {
            f10 = this.f16902a;
        } else {
            f10 = this.f16903b;
        }
        p pVar = this.f16910l;
        if (pVar.f16919x) {
            this.f16905f = pVar.f16911a.getCropWidth() / f7;
        } else {
            this.f16905f = Math.max(pVar.f16911a.getCropWidth() / f7, pVar.f16911a.getCropHeight() / f10);
        }
    }
}
