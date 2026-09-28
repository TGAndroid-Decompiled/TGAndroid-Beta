package lg;

import android.graphics.Matrix;
public final class n {
    public float f14315a;
    public float f14316b;
    public float f14318f;
    public float h;
    public boolean f14321j;
    public final p f14323l;
    public float f14317c = 0.0f;
    public float d = 0.0f;
    public float e = 1.0f;
    public final float f14319g = 0;
    public float f14320i = 0.0f;
    public final Matrix f14322k = new Matrix();

    public n(p pVar, int i10, int i11) {
        this.f14323l = pVar;
        this.f14315a = i10;
        this.f14316b = i11;
    }

    public static float a(n nVar) {
        if ((nVar.h + nVar.f14319g) % 180.0f != 0.0f) {
            return nVar.f14316b;
        }
        return nVar.f14315a;
    }

    public static float b(n nVar) {
        if ((nVar.h + nVar.f14319g) % 180.0f != 0.0f) {
            return nVar.f14315a;
        }
        return nVar.f14316b;
    }

    public static boolean c(n nVar) {
        if (Math.abs(nVar.f14317c) <= 1.0E-5f && Math.abs(nVar.d) <= 1.0E-5f && Math.abs(nVar.e - nVar.f14318f) <= 1.0E-5f && Math.abs(nVar.f14320i) <= 1.0E-5f && Math.abs(nVar.h) <= 1.0E-5f) {
            return false;
        }
        return true;
    }

    public static void d(n nVar, float f7) {
        Matrix matrix = nVar.f14322k;
        matrix.reset();
        nVar.f14317c = 0.0f;
        nVar.d = 0.0f;
        nVar.f14320i = 0.0f;
        nVar.h = f7;
        nVar.h();
        float f10 = nVar.f14318f;
        nVar.e = f10;
        matrix.postScale(f10, f10);
    }

    public static void e(n nVar, float f7) {
        nVar.f14320i += f7;
        nVar.f14322k.postRotate(f7, 0.0f, 0.0f);
    }

    public static void f(n nVar, float f7, float f10) {
        nVar.f14317c += f7;
        nVar.d += f10;
        nVar.f14322k.postTranslate(f7, f10);
    }

    public static void g(n nVar, float f7, float f10, float f11) {
        nVar.e *= f7;
        nVar.f14322k.postScale(f7, f7, f10, f11);
    }

    public final void h() {
        float f7;
        float f10;
        float f11 = this.h;
        float f12 = this.f14319g;
        if ((f11 + f12) % 180.0f != 0.0f) {
            f7 = this.f14316b;
        } else {
            f7 = this.f14315a;
        }
        if ((f11 + f12) % 180.0f != 0.0f) {
            f10 = this.f14315a;
        } else {
            f10 = this.f14316b;
        }
        p pVar = this.f14323l;
        if (pVar.f14332x) {
            this.f14318f = pVar.f14324a.getCropWidth() / f7;
        } else {
            this.f14318f = Math.max(pVar.f14324a.getCropWidth() / f7, pVar.f14324a.getCropHeight() / f10);
        }
    }
}
