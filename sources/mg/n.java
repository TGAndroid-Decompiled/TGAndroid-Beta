package mg;

import android.graphics.Matrix;
public final class n {
    public float f15815a;
    public float f15816b;
    public float f15818f;
    public float h;
    public boolean f15821j;
    public final p f15823l;
    public float f15817c = 0.0f;
    public float d = 0.0f;
    public float e = 1.0f;
    public final float f15819g = 0;
    public float f15820i = 0.0f;
    public final Matrix f15822k = new Matrix();

    public n(p pVar, int i10, int i11) {
        this.f15823l = pVar;
        this.f15815a = i10;
        this.f15816b = i11;
    }

    public static float a(n nVar) {
        if ((nVar.h + nVar.f15819g) % 180.0f != 0.0f) {
            return nVar.f15816b;
        }
        return nVar.f15815a;
    }

    public static float b(n nVar) {
        if ((nVar.h + nVar.f15819g) % 180.0f != 0.0f) {
            return nVar.f15815a;
        }
        return nVar.f15816b;
    }

    public static boolean c(n nVar) {
        if (Math.abs(nVar.f15817c) <= 1.0E-5f && Math.abs(nVar.d) <= 1.0E-5f && Math.abs(nVar.e - nVar.f15818f) <= 1.0E-5f && Math.abs(nVar.f15820i) <= 1.0E-5f && Math.abs(nVar.h) <= 1.0E-5f) {
            return false;
        }
        return true;
    }

    public static void d(n nVar, float f7) {
        Matrix matrix = nVar.f15822k;
        matrix.reset();
        nVar.f15817c = 0.0f;
        nVar.d = 0.0f;
        nVar.f15820i = 0.0f;
        nVar.h = f7;
        nVar.h();
        float f10 = nVar.f15818f;
        nVar.e = f10;
        matrix.postScale(f10, f10);
    }

    public static void e(n nVar, float f7) {
        nVar.f15820i += f7;
        nVar.f15822k.postRotate(f7, 0.0f, 0.0f);
    }

    public static void f(n nVar, float f7, float f10) {
        nVar.f15817c += f7;
        nVar.d += f10;
        nVar.f15822k.postTranslate(f7, f10);
    }

    public static void g(n nVar, float f7, float f10, float f11) {
        nVar.e *= f7;
        nVar.f15822k.postScale(f7, f7, f10, f11);
    }

    public final void h() {
        float f7;
        float f10;
        float f11 = this.h;
        float f12 = this.f15819g;
        if ((f11 + f12) % 180.0f != 0.0f) {
            f7 = this.f15816b;
        } else {
            f7 = this.f15815a;
        }
        if ((f11 + f12) % 180.0f != 0.0f) {
            f10 = this.f15815a;
        } else {
            f10 = this.f15816b;
        }
        p pVar = this.f15823l;
        if (pVar.f15832x) {
            this.f15818f = pVar.f15824a.getCropWidth() / f7;
        } else {
            this.f15818f = Math.max(pVar.f15824a.getCropWidth() / f7, pVar.f15824a.getCropHeight() / f10);
        }
    }
}
