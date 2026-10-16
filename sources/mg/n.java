package mg;

import android.graphics.Matrix;
public final class n {
    public float f15550a;
    public float f15551b;
    public float f15553f;
    public float h;
    public boolean f15556j;
    public final p f15558l;
    public float f15552c = 0.0f;
    public float d = 0.0f;
    public float e = 1.0f;
    public final float f15554g = 0;
    public float f15555i = 0.0f;
    public final Matrix f15557k = new Matrix();

    public n(p pVar, int i10, int i11) {
        this.f15558l = pVar;
        this.f15550a = i10;
        this.f15551b = i11;
    }

    public static float a(n nVar) {
        if ((nVar.h + nVar.f15554g) % 180.0f != 0.0f) {
            return nVar.f15551b;
        }
        return nVar.f15550a;
    }

    public static float b(n nVar) {
        if ((nVar.h + nVar.f15554g) % 180.0f != 0.0f) {
            return nVar.f15550a;
        }
        return nVar.f15551b;
    }

    public static boolean c(n nVar) {
        if (Math.abs(nVar.f15552c) <= 1.0E-5f && Math.abs(nVar.d) <= 1.0E-5f && Math.abs(nVar.e - nVar.f15553f) <= 1.0E-5f && Math.abs(nVar.f15555i) <= 1.0E-5f && Math.abs(nVar.h) <= 1.0E-5f) {
            return false;
        }
        return true;
    }

    public static void d(n nVar, float f7) {
        Matrix matrix = nVar.f15557k;
        matrix.reset();
        nVar.f15552c = 0.0f;
        nVar.d = 0.0f;
        nVar.f15555i = 0.0f;
        nVar.h = f7;
        nVar.h();
        float f10 = nVar.f15553f;
        nVar.e = f10;
        matrix.postScale(f10, f10);
    }

    public static void e(n nVar, float f7) {
        nVar.f15555i += f7;
        nVar.f15557k.postRotate(f7, 0.0f, 0.0f);
    }

    public static void f(n nVar, float f7, float f10) {
        nVar.f15552c += f7;
        nVar.d += f10;
        nVar.f15557k.postTranslate(f7, f10);
    }

    public static void g(n nVar, float f7, float f10, float f11) {
        nVar.e *= f7;
        nVar.f15557k.postScale(f7, f7, f10, f11);
    }

    public final void h() {
        float f7;
        float f10;
        float f11 = this.h;
        float f12 = this.f15554g;
        if ((f11 + f12) % 180.0f != 0.0f) {
            f7 = this.f15551b;
        } else {
            f7 = this.f15550a;
        }
        if ((f11 + f12) % 180.0f != 0.0f) {
            f10 = this.f15550a;
        } else {
            f10 = this.f15551b;
        }
        p pVar = this.f15558l;
        if (pVar.f15567x) {
            this.f15553f = pVar.f15559a.getCropWidth() / f7;
        } else {
            this.f15553f = Math.max(pVar.f15559a.getCropWidth() / f7, pVar.f15559a.getCropHeight() / f10);
        }
    }
}
