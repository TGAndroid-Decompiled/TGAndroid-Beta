package mg;

import android.graphics.Matrix;
public final class n {
    public float f16910a;
    public float f16911b;
    public float f16913f;
    public float h;
    public boolean f16916j;
    public final p f16918l;
    public float f16912c = 0.0f;
    public float d = 0.0f;
    public float e = 1.0f;
    public final float f16914g = 0;
    public float f16915i = 0.0f;
    public final Matrix f16917k = new Matrix();

    public n(p pVar, int i10, int i11) {
        this.f16918l = pVar;
        this.f16910a = i10;
        this.f16911b = i11;
    }

    public static float a(n nVar) {
        if ((nVar.h + nVar.f16914g) % 180.0f != 0.0f) {
            return nVar.f16911b;
        }
        return nVar.f16910a;
    }

    public static float b(n nVar) {
        if ((nVar.h + nVar.f16914g) % 180.0f != 0.0f) {
            return nVar.f16910a;
        }
        return nVar.f16911b;
    }

    public static boolean c(n nVar) {
        if (Math.abs(nVar.f16912c) <= 1.0E-5f && Math.abs(nVar.d) <= 1.0E-5f && Math.abs(nVar.e - nVar.f16913f) <= 1.0E-5f && Math.abs(nVar.f16915i) <= 1.0E-5f && Math.abs(nVar.h) <= 1.0E-5f) {
            return false;
        }
        return true;
    }

    public static void d(n nVar, float f7) {
        Matrix matrix = nVar.f16917k;
        matrix.reset();
        nVar.f16912c = 0.0f;
        nVar.d = 0.0f;
        nVar.f16915i = 0.0f;
        nVar.h = f7;
        nVar.h();
        float f10 = nVar.f16913f;
        nVar.e = f10;
        matrix.postScale(f10, f10);
    }

    public static void e(n nVar, float f7) {
        nVar.f16915i += f7;
        nVar.f16917k.postRotate(f7, 0.0f, 0.0f);
    }

    public static void f(n nVar, float f7, float f10) {
        nVar.f16912c += f7;
        nVar.d += f10;
        nVar.f16917k.postTranslate(f7, f10);
    }

    public static void g(n nVar, float f7, float f10, float f11) {
        nVar.e *= f7;
        nVar.f16917k.postScale(f7, f7, f10, f11);
    }

    public final void h() {
        float f7;
        float f10;
        float f11 = this.h;
        float f12 = this.f16914g;
        if ((f11 + f12) % 180.0f != 0.0f) {
            f7 = this.f16911b;
        } else {
            f7 = this.f16910a;
        }
        if ((f11 + f12) % 180.0f != 0.0f) {
            f10 = this.f16910a;
        } else {
            f10 = this.f16911b;
        }
        p pVar = this.f16918l;
        if (pVar.f16927x) {
            this.f16913f = pVar.f16919a.getCropWidth() / f7;
        } else {
            this.f16913f = Math.max(pVar.f16919a.getCropWidth() / f7, pVar.f16919a.getCropHeight() / f10);
        }
    }
}
