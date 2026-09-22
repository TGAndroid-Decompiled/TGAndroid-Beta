package lg;

import android.graphics.Matrix;
public final class n {
    public float f14298a;
    public float f14299b;
    public float f14301f;
    public float h;
    public boolean f14304j;
    public final p f14306l;
    public float f14300c = 0.0f;
    public float d = 0.0f;
    public float e = 1.0f;
    public final float f14302g = 0;
    public float f14303i = 0.0f;
    public final Matrix f14305k = new Matrix();

    public n(p pVar, int i10, int i11) {
        this.f14306l = pVar;
        this.f14298a = i10;
        this.f14299b = i11;
    }

    public static float a(n nVar) {
        if ((nVar.h + nVar.f14302g) % 180.0f != 0.0f) {
            return nVar.f14299b;
        }
        return nVar.f14298a;
    }

    public static float b(n nVar) {
        if ((nVar.h + nVar.f14302g) % 180.0f != 0.0f) {
            return nVar.f14298a;
        }
        return nVar.f14299b;
    }

    public static boolean c(n nVar) {
        if (Math.abs(nVar.f14300c) <= 1.0E-5f && Math.abs(nVar.d) <= 1.0E-5f && Math.abs(nVar.e - nVar.f14301f) <= 1.0E-5f && Math.abs(nVar.f14303i) <= 1.0E-5f && Math.abs(nVar.h) <= 1.0E-5f) {
            return false;
        }
        return true;
    }

    public static void d(n nVar, float f7) {
        Matrix matrix = nVar.f14305k;
        matrix.reset();
        nVar.f14300c = 0.0f;
        nVar.d = 0.0f;
        nVar.f14303i = 0.0f;
        nVar.h = f7;
        nVar.h();
        float f10 = nVar.f14301f;
        nVar.e = f10;
        matrix.postScale(f10, f10);
    }

    public static void e(n nVar, float f7) {
        nVar.f14303i += f7;
        nVar.f14305k.postRotate(f7, 0.0f, 0.0f);
    }

    public static void f(n nVar, float f7, float f10) {
        nVar.f14300c += f7;
        nVar.d += f10;
        nVar.f14305k.postTranslate(f7, f10);
    }

    public static void g(n nVar, float f7, float f10, float f11) {
        nVar.e *= f7;
        nVar.f14305k.postScale(f7, f7, f10, f11);
    }

    public final void h() {
        float f7;
        float f10;
        float f11 = this.h;
        float f12 = this.f14302g;
        if ((f11 + f12) % 180.0f != 0.0f) {
            f7 = this.f14299b;
        } else {
            f7 = this.f14298a;
        }
        if ((f11 + f12) % 180.0f != 0.0f) {
            f10 = this.f14298a;
        } else {
            f10 = this.f14299b;
        }
        p pVar = this.f14306l;
        if (pVar.f14315x) {
            this.f14301f = pVar.f14307a.getCropWidth() / f7;
        } else {
            this.f14301f = Math.max(pVar.f14307a.getCropWidth() / f7, pVar.f14307a.getCropHeight() / f10);
        }
    }
}
