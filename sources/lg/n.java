package lg;

import android.graphics.Matrix;
public final class n {
    public float f15565a;
    public float f15566b;
    public float f15569f;
    public float h;
    public boolean f15572j;
    public final p f15574l;
    public float f15567c = 0.0f;
    public float d = 0.0f;
    public float f15568e = 1.0f;
    public final float f15570g = 0;
    public float f15571i = 0.0f;
    public final Matrix f15573k = new Matrix();

    public n(p pVar, int i10, int i11) {
        this.f15574l = pVar;
        this.f15565a = i10;
        this.f15566b = i11;
    }

    public static float a(n nVar) {
        if ((nVar.h + nVar.f15570g) % 180.0f != 0.0f) {
            return nVar.f15566b;
        }
        return nVar.f15565a;
    }

    public static float b(n nVar) {
        if ((nVar.h + nVar.f15570g) % 180.0f != 0.0f) {
            return nVar.f15565a;
        }
        return nVar.f15566b;
    }

    public static boolean c(n nVar) {
        if (Math.abs(nVar.f15567c) <= 1.0E-5f && Math.abs(nVar.d) <= 1.0E-5f && Math.abs(nVar.f15568e - nVar.f15569f) <= 1.0E-5f && Math.abs(nVar.f15571i) <= 1.0E-5f && Math.abs(nVar.h) <= 1.0E-5f) {
            return false;
        }
        return true;
    }

    public static void d(n nVar, float f7) {
        Matrix matrix = nVar.f15573k;
        matrix.reset();
        nVar.f15567c = 0.0f;
        nVar.d = 0.0f;
        nVar.f15571i = 0.0f;
        nVar.h = f7;
        nVar.h();
        float f10 = nVar.f15569f;
        nVar.f15568e = f10;
        matrix.postScale(f10, f10);
    }

    public static void e(n nVar, float f7) {
        nVar.f15571i += f7;
        nVar.f15573k.postRotate(f7, 0.0f, 0.0f);
    }

    public static void f(n nVar, float f7, float f10) {
        nVar.f15567c += f7;
        nVar.d += f10;
        nVar.f15573k.postTranslate(f7, f10);
    }

    public static void g(n nVar, float f7, float f10, float f11) {
        nVar.f15568e *= f7;
        nVar.f15573k.postScale(f7, f7, f10, f11);
    }

    public final void h() {
        float f7;
        float f10;
        float f11 = this.h;
        float f12 = this.f15570g;
        if ((f11 + f12) % 180.0f != 0.0f) {
            f7 = this.f15566b;
        } else {
            f7 = this.f15565a;
        }
        if ((f11 + f12) % 180.0f != 0.0f) {
            f10 = this.f15565a;
        } else {
            f10 = this.f15566b;
        }
        p pVar = this.f15574l;
        if (pVar.f15584x) {
            this.f15569f = pVar.f15575a.getCropWidth() / f7;
        } else {
            this.f15569f = Math.max(pVar.f15575a.getCropWidth() / f7, pVar.f15575a.getCropHeight() / f10);
        }
    }
}
