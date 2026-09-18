package lg;

import android.graphics.Matrix;
public final class n {
    public float f14247a;
    public float f14248b;
    public float f14250f;
    public float h;
    public boolean f14253j;
    public final p f14255l;
    public float f14249c = 0.0f;
    public float d = 0.0f;
    public float e = 1.0f;
    public final float f14251g = 0;
    public float f14252i = 0.0f;
    public final Matrix f14254k = new Matrix();

    public n(p pVar, int i10, int i11) {
        this.f14255l = pVar;
        this.f14247a = i10;
        this.f14248b = i11;
    }

    public static float a(n nVar) {
        if ((nVar.h + nVar.f14251g) % 180.0f != 0.0f) {
            return nVar.f14248b;
        }
        return nVar.f14247a;
    }

    public static float b(n nVar) {
        if ((nVar.h + nVar.f14251g) % 180.0f != 0.0f) {
            return nVar.f14247a;
        }
        return nVar.f14248b;
    }

    public static boolean c(n nVar) {
        if (Math.abs(nVar.f14249c) <= 1.0E-5f && Math.abs(nVar.d) <= 1.0E-5f && Math.abs(nVar.e - nVar.f14250f) <= 1.0E-5f && Math.abs(nVar.f14252i) <= 1.0E-5f && Math.abs(nVar.h) <= 1.0E-5f) {
            return false;
        }
        return true;
    }

    public static void d(n nVar, float f7) {
        Matrix matrix = nVar.f14254k;
        matrix.reset();
        nVar.f14249c = 0.0f;
        nVar.d = 0.0f;
        nVar.f14252i = 0.0f;
        nVar.h = f7;
        nVar.h();
        float f10 = nVar.f14250f;
        nVar.e = f10;
        matrix.postScale(f10, f10);
    }

    public static void e(n nVar, float f7) {
        nVar.f14252i += f7;
        nVar.f14254k.postRotate(f7, 0.0f, 0.0f);
    }

    public static void f(n nVar, float f7, float f10) {
        nVar.f14249c += f7;
        nVar.d += f10;
        nVar.f14254k.postTranslate(f7, f10);
    }

    public static void g(n nVar, float f7, float f10, float f11) {
        nVar.e *= f7;
        nVar.f14254k.postScale(f7, f7, f10, f11);
    }

    public final void h() {
        float f7;
        float f10;
        float f11 = this.h;
        float f12 = this.f14251g;
        if ((f11 + f12) % 180.0f != 0.0f) {
            f7 = this.f14248b;
        } else {
            f7 = this.f14247a;
        }
        if ((f11 + f12) % 180.0f != 0.0f) {
            f10 = this.f14247a;
        } else {
            f10 = this.f14248b;
        }
        p pVar = this.f14255l;
        if (pVar.f14264x) {
            this.f14250f = pVar.f14256a.getCropWidth() / f7;
        } else {
            this.f14250f = Math.max(pVar.f14256a.getCropWidth() / f7, pVar.f14256a.getCropHeight() / f10);
        }
    }
}
