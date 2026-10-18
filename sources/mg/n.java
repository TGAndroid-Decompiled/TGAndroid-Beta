package mg;

import android.graphics.Matrix;
public final class n {
    public float f16907a;
    public float f16908b;
    public float f16910f;
    public float h;
    public boolean f16913j;
    public final p f16915l;
    public float f16909c = 0.0f;
    public float d = 0.0f;
    public float e = 1.0f;
    public final float f16911g = 0;
    public float f16912i = 0.0f;
    public final Matrix f16914k = new Matrix();

    public n(p pVar, int i10, int i11) {
        this.f16915l = pVar;
        this.f16907a = i10;
        this.f16908b = i11;
    }

    public static float a(n nVar) {
        if ((nVar.h + nVar.f16911g) % 180.0f != 0.0f) {
            return nVar.f16908b;
        }
        return nVar.f16907a;
    }

    public static float b(n nVar) {
        if ((nVar.h + nVar.f16911g) % 180.0f != 0.0f) {
            return nVar.f16907a;
        }
        return nVar.f16908b;
    }

    public static boolean c(n nVar) {
        if (Math.abs(nVar.f16909c) <= 1.0E-5f && Math.abs(nVar.d) <= 1.0E-5f && Math.abs(nVar.e - nVar.f16910f) <= 1.0E-5f && Math.abs(nVar.f16912i) <= 1.0E-5f && Math.abs(nVar.h) <= 1.0E-5f) {
            return false;
        }
        return true;
    }

    public static void d(n nVar, float f7) {
        Matrix matrix = nVar.f16914k;
        matrix.reset();
        nVar.f16909c = 0.0f;
        nVar.d = 0.0f;
        nVar.f16912i = 0.0f;
        nVar.h = f7;
        nVar.h();
        float f10 = nVar.f16910f;
        nVar.e = f10;
        matrix.postScale(f10, f10);
    }

    public static void e(n nVar, float f7) {
        nVar.f16912i += f7;
        nVar.f16914k.postRotate(f7, 0.0f, 0.0f);
    }

    public static void f(n nVar, float f7, float f10) {
        nVar.f16909c += f7;
        nVar.d += f10;
        nVar.f16914k.postTranslate(f7, f10);
    }

    public static void g(n nVar, float f7, float f10, float f11) {
        nVar.e *= f7;
        nVar.f16914k.postScale(f7, f7, f10, f11);
    }

    public final void h() {
        float f7;
        float f10;
        float f11 = this.h;
        float f12 = this.f16911g;
        if ((f11 + f12) % 180.0f != 0.0f) {
            f7 = this.f16908b;
        } else {
            f7 = this.f16907a;
        }
        if ((f11 + f12) % 180.0f != 0.0f) {
            f10 = this.f16907a;
        } else {
            f10 = this.f16908b;
        }
        p pVar = this.f16915l;
        if (pVar.f16924x) {
            this.f16910f = pVar.f16916a.getCropWidth() / f7;
        } else {
            this.f16910f = Math.max(pVar.f16916a.getCropWidth() / f7, pVar.f16916a.getCropHeight() / f10);
        }
    }
}
