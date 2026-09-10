package kg;

import android.graphics.Matrix;
public final class n {
    public float f12486a;
    public float f12487b;
    public float f12489f;
    public float h;
    public boolean f12492j;
    public final p f12494l;
    public float f12488c = 0.0f;
    public float d = 0.0f;
    public float e = 1.0f;
    public final float f12490g = 0;
    public float f12491i = 0.0f;
    public final Matrix f12493k = new Matrix();

    public n(p pVar, int i10, int i11) {
        this.f12494l = pVar;
        this.f12486a = i10;
        this.f12487b = i11;
    }

    public static float a(n nVar) {
        if ((nVar.h + nVar.f12490g) % 180.0f != 0.0f) {
            return nVar.f12487b;
        }
        return nVar.f12486a;
    }

    public static float b(n nVar) {
        if ((nVar.h + nVar.f12490g) % 180.0f != 0.0f) {
            return nVar.f12486a;
        }
        return nVar.f12487b;
    }

    public static boolean c(n nVar) {
        if (Math.abs(nVar.f12488c) <= 1.0E-5f && Math.abs(nVar.d) <= 1.0E-5f && Math.abs(nVar.e - nVar.f12489f) <= 1.0E-5f && Math.abs(nVar.f12491i) <= 1.0E-5f && Math.abs(nVar.h) <= 1.0E-5f) {
            return false;
        }
        return true;
    }

    public static void d(n nVar, float f7) {
        Matrix matrix = nVar.f12493k;
        matrix.reset();
        nVar.f12488c = 0.0f;
        nVar.d = 0.0f;
        nVar.f12491i = 0.0f;
        nVar.h = f7;
        nVar.h();
        float f10 = nVar.f12489f;
        nVar.e = f10;
        matrix.postScale(f10, f10);
    }

    public static void e(n nVar, float f7) {
        nVar.f12491i += f7;
        nVar.f12493k.postRotate(f7, 0.0f, 0.0f);
    }

    public static void f(n nVar, float f7, float f10) {
        nVar.f12488c += f7;
        nVar.d += f10;
        nVar.f12493k.postTranslate(f7, f10);
    }

    public static void g(n nVar, float f7, float f10, float f11) {
        nVar.e *= f7;
        nVar.f12493k.postScale(f7, f7, f10, f11);
    }

    public final void h() {
        float f7;
        float f10;
        float f11 = this.h;
        float f12 = this.f12490g;
        if ((f11 + f12) % 180.0f != 0.0f) {
            f7 = this.f12487b;
        } else {
            f7 = this.f12486a;
        }
        if ((f11 + f12) % 180.0f != 0.0f) {
            f10 = this.f12486a;
        } else {
            f10 = this.f12487b;
        }
        p pVar = this.f12494l;
        if (pVar.f12503x) {
            this.f12489f = pVar.f12495a.getCropWidth() / f7;
        } else {
            this.f12489f = Math.max(pVar.f12495a.getCropWidth() / f7, pVar.f12495a.getCropHeight() / f10);
        }
    }
}
