package lg;

import android.graphics.Matrix;
public final class n {
    public float f14089a;
    public float f14090b;
    public float f14092f;
    public float h;
    public boolean f14095j;
    public final p f14097l;
    public float f14091c = 0.0f;
    public float d = 0.0f;
    public float e = 1.0f;
    public final float f14093g = 0;
    public float f14094i = 0.0f;
    public final Matrix f14096k = new Matrix();

    public n(p pVar, int i10, int i11) {
        this.f14097l = pVar;
        this.f14089a = i10;
        this.f14090b = i11;
    }

    public static float a(n nVar) {
        if ((nVar.h + nVar.f14093g) % 180.0f != 0.0f) {
            return nVar.f14090b;
        }
        return nVar.f14089a;
    }

    public static float b(n nVar) {
        if ((nVar.h + nVar.f14093g) % 180.0f != 0.0f) {
            return nVar.f14089a;
        }
        return nVar.f14090b;
    }

    public static boolean c(n nVar) {
        if (Math.abs(nVar.f14091c) <= 1.0E-5f && Math.abs(nVar.d) <= 1.0E-5f && Math.abs(nVar.e - nVar.f14092f) <= 1.0E-5f && Math.abs(nVar.f14094i) <= 1.0E-5f && Math.abs(nVar.h) <= 1.0E-5f) {
            return false;
        }
        return true;
    }

    public static void d(n nVar, float f7) {
        Matrix matrix = nVar.f14096k;
        matrix.reset();
        nVar.f14091c = 0.0f;
        nVar.d = 0.0f;
        nVar.f14094i = 0.0f;
        nVar.h = f7;
        nVar.h();
        float f10 = nVar.f14092f;
        nVar.e = f10;
        matrix.postScale(f10, f10);
    }

    public static void e(n nVar, float f7) {
        nVar.f14094i += f7;
        nVar.f14096k.postRotate(f7, 0.0f, 0.0f);
    }

    public static void f(n nVar, float f7, float f10) {
        nVar.f14091c += f7;
        nVar.d += f10;
        nVar.f14096k.postTranslate(f7, f10);
    }

    public static void g(n nVar, float f7, float f10, float f11) {
        nVar.e *= f7;
        nVar.f14096k.postScale(f7, f7, f10, f11);
    }

    public final void h() {
        float f7;
        float f10;
        float f11 = this.h;
        float f12 = this.f14093g;
        if ((f11 + f12) % 180.0f != 0.0f) {
            f7 = this.f14090b;
        } else {
            f7 = this.f14089a;
        }
        if ((f11 + f12) % 180.0f != 0.0f) {
            f10 = this.f14089a;
        } else {
            f10 = this.f14090b;
        }
        p pVar = this.f14097l;
        if (pVar.f14106x) {
            this.f14092f = pVar.f14098a.getCropWidth() / f7;
        } else {
            this.f14092f = Math.max(pVar.f14098a.getCropWidth() / f7, pVar.f14098a.getCropHeight() / f10);
        }
    }
}
