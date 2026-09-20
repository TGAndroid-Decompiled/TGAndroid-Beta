package lg;

import android.graphics.Matrix;
public final class n {
    public float f14283a;
    public float f14284b;
    public float f14286f;
    public float h;
    public boolean f14289j;
    public final p f14291l;
    public float f14285c = 0.0f;
    public float d = 0.0f;
    public float e = 1.0f;
    public final float f14287g = 0;
    public float f14288i = 0.0f;
    public final Matrix f14290k = new Matrix();

    public n(p pVar, int i10, int i11) {
        this.f14291l = pVar;
        this.f14283a = i10;
        this.f14284b = i11;
    }

    public static float a(n nVar) {
        if ((nVar.h + nVar.f14287g) % 180.0f != 0.0f) {
            return nVar.f14284b;
        }
        return nVar.f14283a;
    }

    public static float b(n nVar) {
        if ((nVar.h + nVar.f14287g) % 180.0f != 0.0f) {
            return nVar.f14283a;
        }
        return nVar.f14284b;
    }

    public static boolean c(n nVar) {
        if (Math.abs(nVar.f14285c) <= 1.0E-5f && Math.abs(nVar.d) <= 1.0E-5f && Math.abs(nVar.e - nVar.f14286f) <= 1.0E-5f && Math.abs(nVar.f14288i) <= 1.0E-5f && Math.abs(nVar.h) <= 1.0E-5f) {
            return false;
        }
        return true;
    }

    public static void d(n nVar, float f7) {
        Matrix matrix = nVar.f14290k;
        matrix.reset();
        nVar.f14285c = 0.0f;
        nVar.d = 0.0f;
        nVar.f14288i = 0.0f;
        nVar.h = f7;
        nVar.h();
        float f10 = nVar.f14286f;
        nVar.e = f10;
        matrix.postScale(f10, f10);
    }

    public static void e(n nVar, float f7) {
        nVar.f14288i += f7;
        nVar.f14290k.postRotate(f7, 0.0f, 0.0f);
    }

    public static void f(n nVar, float f7, float f10) {
        nVar.f14285c += f7;
        nVar.d += f10;
        nVar.f14290k.postTranslate(f7, f10);
    }

    public static void g(n nVar, float f7, float f10, float f11) {
        nVar.e *= f7;
        nVar.f14290k.postScale(f7, f7, f10, f11);
    }

    public final void h() {
        float f7;
        float f10;
        float f11 = this.h;
        float f12 = this.f14287g;
        if ((f11 + f12) % 180.0f != 0.0f) {
            f7 = this.f14284b;
        } else {
            f7 = this.f14283a;
        }
        if ((f11 + f12) % 180.0f != 0.0f) {
            f10 = this.f14283a;
        } else {
            f10 = this.f14284b;
        }
        p pVar = this.f14291l;
        if (pVar.f14300x) {
            this.f14286f = pVar.f14292a.getCropWidth() / f7;
        } else {
            this.f14286f = Math.max(pVar.f14292a.getCropWidth() / f7, pVar.f14292a.getCropHeight() / f10);
        }
    }
}
