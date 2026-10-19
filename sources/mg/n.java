package mg;

import android.graphics.Matrix;
public final class n {
    public float f16908a;
    public float f16909b;
    public float f16911f;
    public float h;
    public boolean f16914j;
    public final p f16916l;
    public float f16910c = 0.0f;
    public float d = 0.0f;
    public float e = 1.0f;
    public final float f16912g = 0;
    public float f16913i = 0.0f;
    public final Matrix f16915k = new Matrix();

    public n(p pVar, int i10, int i11) {
        this.f16916l = pVar;
        this.f16908a = i10;
        this.f16909b = i11;
    }

    public static float a(n nVar) {
        if ((nVar.h + nVar.f16912g) % 180.0f != 0.0f) {
            return nVar.f16909b;
        }
        return nVar.f16908a;
    }

    public static float b(n nVar) {
        if ((nVar.h + nVar.f16912g) % 180.0f != 0.0f) {
            return nVar.f16908a;
        }
        return nVar.f16909b;
    }

    public static boolean c(n nVar) {
        if (Math.abs(nVar.f16910c) <= 1.0E-5f && Math.abs(nVar.d) <= 1.0E-5f && Math.abs(nVar.e - nVar.f16911f) <= 1.0E-5f && Math.abs(nVar.f16913i) <= 1.0E-5f && Math.abs(nVar.h) <= 1.0E-5f) {
            return false;
        }
        return true;
    }

    public static void d(n nVar, float f7) {
        Matrix matrix = nVar.f16915k;
        matrix.reset();
        nVar.f16910c = 0.0f;
        nVar.d = 0.0f;
        nVar.f16913i = 0.0f;
        nVar.h = f7;
        nVar.h();
        float f10 = nVar.f16911f;
        nVar.e = f10;
        matrix.postScale(f10, f10);
    }

    public static void e(n nVar, float f7) {
        nVar.f16913i += f7;
        nVar.f16915k.postRotate(f7, 0.0f, 0.0f);
    }

    public static void f(n nVar, float f7, float f10) {
        nVar.f16910c += f7;
        nVar.d += f10;
        nVar.f16915k.postTranslate(f7, f10);
    }

    public static void g(n nVar, float f7, float f10, float f11) {
        nVar.e *= f7;
        nVar.f16915k.postScale(f7, f7, f10, f11);
    }

    public final void h() {
        float f7;
        float f10;
        float f11 = this.h;
        float f12 = this.f16912g;
        if ((f11 + f12) % 180.0f != 0.0f) {
            f7 = this.f16909b;
        } else {
            f7 = this.f16908a;
        }
        if ((f11 + f12) % 180.0f != 0.0f) {
            f10 = this.f16908a;
        } else {
            f10 = this.f16909b;
        }
        p pVar = this.f16916l;
        if (pVar.f16925x) {
            this.f16911f = pVar.f16917a.getCropWidth() / f7;
        } else {
            this.f16911f = Math.max(pVar.f16917a.getCropWidth() / f7, pVar.f16917a.getCropHeight() / f10);
        }
    }
}
