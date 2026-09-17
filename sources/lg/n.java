package lg;

import android.graphics.Matrix;
public final class n {
    public float f14101a;
    public float f14102b;
    public float f14104f;
    public float h;
    public boolean f14107j;
    public final p f14109l;
    public float f14103c = 0.0f;
    public float d = 0.0f;
    public float e = 1.0f;
    public final float f14105g = 0;
    public float f14106i = 0.0f;
    public final Matrix f14108k = new Matrix();

    public n(p pVar, int i10, int i11) {
        this.f14109l = pVar;
        this.f14101a = i10;
        this.f14102b = i11;
    }

    public static float a(n nVar) {
        if ((nVar.h + nVar.f14105g) % 180.0f != 0.0f) {
            return nVar.f14102b;
        }
        return nVar.f14101a;
    }

    public static float b(n nVar) {
        if ((nVar.h + nVar.f14105g) % 180.0f != 0.0f) {
            return nVar.f14101a;
        }
        return nVar.f14102b;
    }

    public static boolean c(n nVar) {
        if (Math.abs(nVar.f14103c) <= 1.0E-5f && Math.abs(nVar.d) <= 1.0E-5f && Math.abs(nVar.e - nVar.f14104f) <= 1.0E-5f && Math.abs(nVar.f14106i) <= 1.0E-5f && Math.abs(nVar.h) <= 1.0E-5f) {
            return false;
        }
        return true;
    }

    public static void d(n nVar, float f7) {
        Matrix matrix = nVar.f14108k;
        matrix.reset();
        nVar.f14103c = 0.0f;
        nVar.d = 0.0f;
        nVar.f14106i = 0.0f;
        nVar.h = f7;
        nVar.h();
        float f10 = nVar.f14104f;
        nVar.e = f10;
        matrix.postScale(f10, f10);
    }

    public static void e(n nVar, float f7) {
        nVar.f14106i += f7;
        nVar.f14108k.postRotate(f7, 0.0f, 0.0f);
    }

    public static void f(n nVar, float f7, float f10) {
        nVar.f14103c += f7;
        nVar.d += f10;
        nVar.f14108k.postTranslate(f7, f10);
    }

    public static void g(n nVar, float f7, float f10, float f11) {
        nVar.e *= f7;
        nVar.f14108k.postScale(f7, f7, f10, f11);
    }

    public final void h() {
        float f7;
        float f10;
        float f11 = this.h;
        float f12 = this.f14105g;
        if ((f11 + f12) % 180.0f != 0.0f) {
            f7 = this.f14102b;
        } else {
            f7 = this.f14101a;
        }
        if ((f11 + f12) % 180.0f != 0.0f) {
            f10 = this.f14101a;
        } else {
            f10 = this.f14102b;
        }
        p pVar = this.f14109l;
        if (pVar.f14118x) {
            this.f14104f = pVar.f14110a.getCropWidth() / f7;
        } else {
            this.f14104f = Math.max(pVar.f14110a.getCropWidth() / f7, pVar.f14110a.getCropHeight() / f10);
        }
    }
}
