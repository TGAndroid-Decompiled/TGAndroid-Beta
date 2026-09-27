package lg;

import android.graphics.Matrix;
public final class n {
    public float f14316a;
    public float f14317b;
    public float f14319f;
    public float h;
    public boolean f14322j;
    public final p f14324l;
    public float f14318c = 0.0f;
    public float d = 0.0f;
    public float e = 1.0f;
    public final float f14320g = 0;
    public float f14321i = 0.0f;
    public final Matrix f14323k = new Matrix();

    public n(p pVar, int i10, int i11) {
        this.f14324l = pVar;
        this.f14316a = i10;
        this.f14317b = i11;
    }

    public static float a(n nVar) {
        if ((nVar.h + nVar.f14320g) % 180.0f != 0.0f) {
            return nVar.f14317b;
        }
        return nVar.f14316a;
    }

    public static float b(n nVar) {
        if ((nVar.h + nVar.f14320g) % 180.0f != 0.0f) {
            return nVar.f14316a;
        }
        return nVar.f14317b;
    }

    public static boolean c(n nVar) {
        if (Math.abs(nVar.f14318c) <= 1.0E-5f && Math.abs(nVar.d) <= 1.0E-5f && Math.abs(nVar.e - nVar.f14319f) <= 1.0E-5f && Math.abs(nVar.f14321i) <= 1.0E-5f && Math.abs(nVar.h) <= 1.0E-5f) {
            return false;
        }
        return true;
    }

    public static void d(n nVar, float f7) {
        Matrix matrix = nVar.f14323k;
        matrix.reset();
        nVar.f14318c = 0.0f;
        nVar.d = 0.0f;
        nVar.f14321i = 0.0f;
        nVar.h = f7;
        nVar.h();
        float f10 = nVar.f14319f;
        nVar.e = f10;
        matrix.postScale(f10, f10);
    }

    public static void e(n nVar, float f7) {
        nVar.f14321i += f7;
        nVar.f14323k.postRotate(f7, 0.0f, 0.0f);
    }

    public static void f(n nVar, float f7, float f10) {
        nVar.f14318c += f7;
        nVar.d += f10;
        nVar.f14323k.postTranslate(f7, f10);
    }

    public static void g(n nVar, float f7, float f10, float f11) {
        nVar.e *= f7;
        nVar.f14323k.postScale(f7, f7, f10, f11);
    }

    public final void h() {
        float f7;
        float f10;
        float f11 = this.h;
        float f12 = this.f14320g;
        if ((f11 + f12) % 180.0f != 0.0f) {
            f7 = this.f14317b;
        } else {
            f7 = this.f14316a;
        }
        if ((f11 + f12) % 180.0f != 0.0f) {
            f10 = this.f14316a;
        } else {
            f10 = this.f14317b;
        }
        p pVar = this.f14324l;
        if (pVar.f14333x) {
            this.f14319f = pVar.f14325a.getCropWidth() / f7;
        } else {
            this.f14319f = Math.max(pVar.f14325a.getCropWidth() / f7, pVar.f14325a.getCropHeight() / f10);
        }
    }
}
