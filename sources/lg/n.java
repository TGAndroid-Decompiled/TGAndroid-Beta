package lg;

import android.graphics.Matrix;
public final class n {
    public float f14079a;
    public float f14080b;
    public float f14082f;
    public float h;
    public boolean f14085j;
    public final p f14087l;
    public float f14081c = 0.0f;
    public float d = 0.0f;
    public float e = 1.0f;
    public final float f14083g = 0;
    public float f14084i = 0.0f;
    public final Matrix f14086k = new Matrix();

    public n(p pVar, int i10, int i11) {
        this.f14087l = pVar;
        this.f14079a = i10;
        this.f14080b = i11;
    }

    public static float a(n nVar) {
        if ((nVar.h + nVar.f14083g) % 180.0f != 0.0f) {
            return nVar.f14080b;
        }
        return nVar.f14079a;
    }

    public static float b(n nVar) {
        if ((nVar.h + nVar.f14083g) % 180.0f != 0.0f) {
            return nVar.f14079a;
        }
        return nVar.f14080b;
    }

    public static boolean c(n nVar) {
        if (Math.abs(nVar.f14081c) <= 1.0E-5f && Math.abs(nVar.d) <= 1.0E-5f && Math.abs(nVar.e - nVar.f14082f) <= 1.0E-5f && Math.abs(nVar.f14084i) <= 1.0E-5f && Math.abs(nVar.h) <= 1.0E-5f) {
            return false;
        }
        return true;
    }

    public static void d(n nVar, float f7) {
        Matrix matrix = nVar.f14086k;
        matrix.reset();
        nVar.f14081c = 0.0f;
        nVar.d = 0.0f;
        nVar.f14084i = 0.0f;
        nVar.h = f7;
        nVar.h();
        float f10 = nVar.f14082f;
        nVar.e = f10;
        matrix.postScale(f10, f10);
    }

    public static void e(n nVar, float f7) {
        nVar.f14084i += f7;
        nVar.f14086k.postRotate(f7, 0.0f, 0.0f);
    }

    public static void f(n nVar, float f7, float f10) {
        nVar.f14081c += f7;
        nVar.d += f10;
        nVar.f14086k.postTranslate(f7, f10);
    }

    public static void g(n nVar, float f7, float f10, float f11) {
        nVar.e *= f7;
        nVar.f14086k.postScale(f7, f7, f10, f11);
    }

    public final void h() {
        float f7;
        float f10;
        float f11 = this.h;
        float f12 = this.f14083g;
        if ((f11 + f12) % 180.0f != 0.0f) {
            f7 = this.f14080b;
        } else {
            f7 = this.f14079a;
        }
        if ((f11 + f12) % 180.0f != 0.0f) {
            f10 = this.f14079a;
        } else {
            f10 = this.f14080b;
        }
        p pVar = this.f14087l;
        if (pVar.f14096x) {
            this.f14082f = pVar.f14088a.getCropWidth() / f7;
        } else {
            this.f14082f = Math.max(pVar.f14088a.getCropWidth() / f7, pVar.f14088a.getCropHeight() / f10);
        }
    }
}
