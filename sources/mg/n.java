package mg;

import android.graphics.Matrix;
public final class n {
    public float f16971a;
    public float f16972b;
    public float f16974f;
    public float h;
    public boolean f16977j;
    public final p f16979l;
    public float f16973c = 0.0f;
    public float d = 0.0f;
    public float e = 1.0f;
    public final float f16975g = 0;
    public float f16976i = 0.0f;
    public final Matrix f16978k = new Matrix();

    public n(p pVar, int i10, int i11) {
        this.f16979l = pVar;
        this.f16971a = i10;
        this.f16972b = i11;
    }

    public static float a(n nVar) {
        if ((nVar.h + nVar.f16975g) % 180.0f != 0.0f) {
            return nVar.f16972b;
        }
        return nVar.f16971a;
    }

    public static float b(n nVar) {
        if ((nVar.h + nVar.f16975g) % 180.0f != 0.0f) {
            return nVar.f16971a;
        }
        return nVar.f16972b;
    }

    public static boolean c(n nVar) {
        if (Math.abs(nVar.f16973c) <= 1.0E-5f && Math.abs(nVar.d) <= 1.0E-5f && Math.abs(nVar.e - nVar.f16974f) <= 1.0E-5f && Math.abs(nVar.f16976i) <= 1.0E-5f && Math.abs(nVar.h) <= 1.0E-5f) {
            return false;
        }
        return true;
    }

    public static void d(n nVar, float f7) {
        Matrix matrix = nVar.f16978k;
        matrix.reset();
        nVar.f16973c = 0.0f;
        nVar.d = 0.0f;
        nVar.f16976i = 0.0f;
        nVar.h = f7;
        nVar.h();
        float f10 = nVar.f16974f;
        nVar.e = f10;
        matrix.postScale(f10, f10);
    }

    public static void e(n nVar, float f7) {
        nVar.f16976i += f7;
        nVar.f16978k.postRotate(f7, 0.0f, 0.0f);
    }

    public static void f(n nVar, float f7, float f10) {
        nVar.f16973c += f7;
        nVar.d += f10;
        nVar.f16978k.postTranslate(f7, f10);
    }

    public static void g(n nVar, float f7, float f10, float f11) {
        nVar.e *= f7;
        nVar.f16978k.postScale(f7, f7, f10, f11);
    }

    public final void h() {
        float f7;
        float f10;
        float f11 = this.h;
        float f12 = this.f16975g;
        if ((f11 + f12) % 180.0f != 0.0f) {
            f7 = this.f16972b;
        } else {
            f7 = this.f16971a;
        }
        if ((f11 + f12) % 180.0f != 0.0f) {
            f10 = this.f16971a;
        } else {
            f10 = this.f16972b;
        }
        p pVar = this.f16979l;
        if (pVar.f16988x) {
            this.f16974f = pVar.f16980a.getCropWidth() / f7;
        } else {
            this.f16974f = Math.max(pVar.f16980a.getCropWidth() / f7, pVar.f16980a.getCropHeight() / f10);
        }
    }
}
