package mg;

import android.graphics.Matrix;
public final class n {
    public float f16909a;
    public float f16910b;
    public float f16912f;
    public float h;
    public boolean f16915j;
    public final p f16917l;
    public float f16911c = 0.0f;
    public float d = 0.0f;
    public float e = 1.0f;
    public final float f16913g = 0;
    public float f16914i = 0.0f;
    public final Matrix f16916k = new Matrix();

    public n(p pVar, int i10, int i11) {
        this.f16917l = pVar;
        this.f16909a = i10;
        this.f16910b = i11;
    }

    public static float a(n nVar) {
        if ((nVar.h + nVar.f16913g) % 180.0f != 0.0f) {
            return nVar.f16910b;
        }
        return nVar.f16909a;
    }

    public static float b(n nVar) {
        if ((nVar.h + nVar.f16913g) % 180.0f != 0.0f) {
            return nVar.f16909a;
        }
        return nVar.f16910b;
    }

    public static boolean c(n nVar) {
        if (Math.abs(nVar.f16911c) <= 1.0E-5f && Math.abs(nVar.d) <= 1.0E-5f && Math.abs(nVar.e - nVar.f16912f) <= 1.0E-5f && Math.abs(nVar.f16914i) <= 1.0E-5f && Math.abs(nVar.h) <= 1.0E-5f) {
            return false;
        }
        return true;
    }

    public static void d(n nVar, float f7) {
        Matrix matrix = nVar.f16916k;
        matrix.reset();
        nVar.f16911c = 0.0f;
        nVar.d = 0.0f;
        nVar.f16914i = 0.0f;
        nVar.h = f7;
        nVar.h();
        float f10 = nVar.f16912f;
        nVar.e = f10;
        matrix.postScale(f10, f10);
    }

    public static void e(n nVar, float f7) {
        nVar.f16914i += f7;
        nVar.f16916k.postRotate(f7, 0.0f, 0.0f);
    }

    public static void f(n nVar, float f7, float f10) {
        nVar.f16911c += f7;
        nVar.d += f10;
        nVar.f16916k.postTranslate(f7, f10);
    }

    public static void g(n nVar, float f7, float f10, float f11) {
        nVar.e *= f7;
        nVar.f16916k.postScale(f7, f7, f10, f11);
    }

    public final void h() {
        float f7;
        float f10;
        float f11 = this.h;
        float f12 = this.f16913g;
        if ((f11 + f12) % 180.0f != 0.0f) {
            f7 = this.f16910b;
        } else {
            f7 = this.f16909a;
        }
        if ((f11 + f12) % 180.0f != 0.0f) {
            f10 = this.f16909a;
        } else {
            f10 = this.f16910b;
        }
        p pVar = this.f16917l;
        if (pVar.f16926x) {
            this.f16912f = pVar.f16918a.getCropWidth() / f7;
        } else {
            this.f16912f = Math.max(pVar.f16918a.getCropWidth() / f7, pVar.f16918a.getCropHeight() / f10);
        }
    }
}
