package ng;

import android.graphics.Matrix;
public final class n {
    public float f18833a;
    public float f18834b;
    public float f18836f;
    public float h;
    public boolean f18839j;
    public final p f18841l;
    public float f18835c = 0.0f;
    public float d = 0.0f;
    public float e = 1.0f;
    public final float f18837g = 0;
    public float f18838i = 0.0f;
    public final Matrix f18840k = new Matrix();

    public n(p pVar, int i10, int i11) {
        this.f18841l = pVar;
        this.f18833a = i10;
        this.f18834b = i11;
    }

    public static float a(n nVar) {
        if ((nVar.h + nVar.f18837g) % 180.0f != 0.0f) {
            return nVar.f18834b;
        }
        return nVar.f18833a;
    }

    public static float b(n nVar) {
        if ((nVar.h + nVar.f18837g) % 180.0f != 0.0f) {
            return nVar.f18833a;
        }
        return nVar.f18834b;
    }

    public static boolean c(n nVar) {
        if (Math.abs(nVar.f18835c) <= 1.0E-5f && Math.abs(nVar.d) <= 1.0E-5f && Math.abs(nVar.e - nVar.f18836f) <= 1.0E-5f && Math.abs(nVar.f18838i) <= 1.0E-5f && Math.abs(nVar.h) <= 1.0E-5f) {
            return false;
        }
        return true;
    }

    public static void d(n nVar, float f7) {
        Matrix matrix = nVar.f18840k;
        matrix.reset();
        nVar.f18835c = 0.0f;
        nVar.d = 0.0f;
        nVar.f18838i = 0.0f;
        nVar.h = f7;
        nVar.h();
        float f10 = nVar.f18836f;
        nVar.e = f10;
        matrix.postScale(f10, f10);
    }

    public static void e(n nVar, float f7) {
        nVar.f18838i += f7;
        nVar.f18840k.postRotate(f7, 0.0f, 0.0f);
    }

    public static void f(n nVar, float f7, float f10) {
        nVar.f18835c += f7;
        nVar.d += f10;
        nVar.f18840k.postTranslate(f7, f10);
    }

    public static void g(n nVar, float f7, float f10, float f11) {
        nVar.e *= f7;
        nVar.f18840k.postScale(f7, f7, f10, f11);
    }

    public final void h() {
        float f7;
        float f10;
        float f11 = this.h;
        float f12 = this.f18837g;
        if ((f11 + f12) % 180.0f != 0.0f) {
            f7 = this.f18834b;
        } else {
            f7 = this.f18833a;
        }
        if ((f11 + f12) % 180.0f != 0.0f) {
            f10 = this.f18833a;
        } else {
            f10 = this.f18834b;
        }
        p pVar = this.f18841l;
        if (pVar.f18850x) {
            this.f18836f = pVar.f18842a.getCropWidth() / f7;
        } else {
            this.f18836f = Math.max(pVar.f18842a.getCropWidth() / f7, pVar.f18842a.getCropHeight() / f10);
        }
    }
}
