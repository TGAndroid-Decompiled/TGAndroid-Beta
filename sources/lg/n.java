package lg;

import android.graphics.Matrix;
public final class n {
    public float f15564a;
    public float f15565b;
    public float f15568f;
    public float h;
    public boolean f15571j;
    public final p f15573l;
    public float f15566c = 0.0f;
    public float d = 0.0f;
    public float f15567e = 1.0f;
    public final float f15569g = 0;
    public float f15570i = 0.0f;
    public final Matrix f15572k = new Matrix();

    public n(p pVar, int i10, int i11) {
        this.f15573l = pVar;
        this.f15564a = i10;
        this.f15565b = i11;
    }

    public static float a(n nVar) {
        if ((nVar.h + nVar.f15569g) % 180.0f != 0.0f) {
            return nVar.f15565b;
        }
        return nVar.f15564a;
    }

    public static float b(n nVar) {
        if ((nVar.h + nVar.f15569g) % 180.0f != 0.0f) {
            return nVar.f15564a;
        }
        return nVar.f15565b;
    }

    public static boolean c(n nVar) {
        if (Math.abs(nVar.f15566c) <= 1.0E-5f && Math.abs(nVar.d) <= 1.0E-5f && Math.abs(nVar.f15567e - nVar.f15568f) <= 1.0E-5f && Math.abs(nVar.f15570i) <= 1.0E-5f && Math.abs(nVar.h) <= 1.0E-5f) {
            return false;
        }
        return true;
    }

    public static void d(n nVar, float f7) {
        Matrix matrix = nVar.f15572k;
        matrix.reset();
        nVar.f15566c = 0.0f;
        nVar.d = 0.0f;
        nVar.f15570i = 0.0f;
        nVar.h = f7;
        nVar.h();
        float f10 = nVar.f15568f;
        nVar.f15567e = f10;
        matrix.postScale(f10, f10);
    }

    public static void e(n nVar, float f7) {
        nVar.f15570i += f7;
        nVar.f15572k.postRotate(f7, 0.0f, 0.0f);
    }

    public static void f(n nVar, float f7, float f10) {
        nVar.f15566c += f7;
        nVar.d += f10;
        nVar.f15572k.postTranslate(f7, f10);
    }

    public static void g(n nVar, float f7, float f10, float f11) {
        nVar.f15567e *= f7;
        nVar.f15572k.postScale(f7, f7, f10, f11);
    }

    public final void h() {
        float f7;
        float f10;
        float f11 = this.h;
        float f12 = this.f15569g;
        if ((f11 + f12) % 180.0f != 0.0f) {
            f7 = this.f15565b;
        } else {
            f7 = this.f15564a;
        }
        if ((f11 + f12) % 180.0f != 0.0f) {
            f10 = this.f15564a;
        } else {
            f10 = this.f15565b;
        }
        p pVar = this.f15573l;
        if (pVar.f15583x) {
            this.f15568f = pVar.f15574a.getCropWidth() / f7;
        } else {
            this.f15568f = Math.max(pVar.f15574a.getCropWidth() / f7, pVar.f15574a.getCropHeight() / f10);
        }
    }
}
