package lg;

import android.graphics.Matrix;
public final class n {
    public float f15566a;
    public float f15567b;
    public float f15570f;
    public float h;
    public boolean f15573j;
    public final p f15575l;
    public float f15568c = 0.0f;
    public float d = 0.0f;
    public float f15569e = 1.0f;
    public final float f15571g = 0;
    public float f15572i = 0.0f;
    public final Matrix f15574k = new Matrix();

    public n(p pVar, int i10, int i11) {
        this.f15575l = pVar;
        this.f15566a = i10;
        this.f15567b = i11;
    }

    public static float a(n nVar) {
        if ((nVar.h + nVar.f15571g) % 180.0f != 0.0f) {
            return nVar.f15567b;
        }
        return nVar.f15566a;
    }

    public static float b(n nVar) {
        if ((nVar.h + nVar.f15571g) % 180.0f != 0.0f) {
            return nVar.f15566a;
        }
        return nVar.f15567b;
    }

    public static boolean c(n nVar) {
        if (Math.abs(nVar.f15568c) <= 1.0E-5f && Math.abs(nVar.d) <= 1.0E-5f && Math.abs(nVar.f15569e - nVar.f15570f) <= 1.0E-5f && Math.abs(nVar.f15572i) <= 1.0E-5f && Math.abs(nVar.h) <= 1.0E-5f) {
            return false;
        }
        return true;
    }

    public static void d(n nVar, float f7) {
        Matrix matrix = nVar.f15574k;
        matrix.reset();
        nVar.f15568c = 0.0f;
        nVar.d = 0.0f;
        nVar.f15572i = 0.0f;
        nVar.h = f7;
        nVar.h();
        float f10 = nVar.f15570f;
        nVar.f15569e = f10;
        matrix.postScale(f10, f10);
    }

    public static void e(n nVar, float f7) {
        nVar.f15572i += f7;
        nVar.f15574k.postRotate(f7, 0.0f, 0.0f);
    }

    public static void f(n nVar, float f7, float f10) {
        nVar.f15568c += f7;
        nVar.d += f10;
        nVar.f15574k.postTranslate(f7, f10);
    }

    public static void g(n nVar, float f7, float f10, float f11) {
        nVar.f15569e *= f7;
        nVar.f15574k.postScale(f7, f7, f10, f11);
    }

    public final void h() {
        float f7;
        float f10;
        float f11 = this.h;
        float f12 = this.f15571g;
        if ((f11 + f12) % 180.0f != 0.0f) {
            f7 = this.f15567b;
        } else {
            f7 = this.f15566a;
        }
        if ((f11 + f12) % 180.0f != 0.0f) {
            f10 = this.f15566a;
        } else {
            f10 = this.f15567b;
        }
        p pVar = this.f15575l;
        if (pVar.f15585x) {
            this.f15570f = pVar.f15576a.getCropWidth() / f7;
        } else {
            this.f15570f = Math.max(pVar.f15576a.getCropWidth() / f7, pVar.f15576a.getCropHeight() / f10);
        }
    }
}
