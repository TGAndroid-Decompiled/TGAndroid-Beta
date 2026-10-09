package lg;

import android.graphics.Matrix;
public final class n {
    public float f15562a;
    public float f15563b;
    public float f15566f;
    public float h;
    public boolean f15569j;
    public final p f15571l;
    public float f15564c = 0.0f;
    public float d = 0.0f;
    public float f15565e = 1.0f;
    public final float f15567g = 0;
    public float f15568i = 0.0f;
    public final Matrix f15570k = new Matrix();

    public n(p pVar, int i10, int i11) {
        this.f15571l = pVar;
        this.f15562a = i10;
        this.f15563b = i11;
    }

    public static float a(n nVar) {
        if ((nVar.h + nVar.f15567g) % 180.0f != 0.0f) {
            return nVar.f15563b;
        }
        return nVar.f15562a;
    }

    public static float b(n nVar) {
        if ((nVar.h + nVar.f15567g) % 180.0f != 0.0f) {
            return nVar.f15562a;
        }
        return nVar.f15563b;
    }

    public static boolean c(n nVar) {
        if (Math.abs(nVar.f15564c) <= 1.0E-5f && Math.abs(nVar.d) <= 1.0E-5f && Math.abs(nVar.f15565e - nVar.f15566f) <= 1.0E-5f && Math.abs(nVar.f15568i) <= 1.0E-5f && Math.abs(nVar.h) <= 1.0E-5f) {
            return false;
        }
        return true;
    }

    public static void d(n nVar, float f7) {
        Matrix matrix = nVar.f15570k;
        matrix.reset();
        nVar.f15564c = 0.0f;
        nVar.d = 0.0f;
        nVar.f15568i = 0.0f;
        nVar.h = f7;
        nVar.h();
        float f10 = nVar.f15566f;
        nVar.f15565e = f10;
        matrix.postScale(f10, f10);
    }

    public static void e(n nVar, float f7) {
        nVar.f15568i += f7;
        nVar.f15570k.postRotate(f7, 0.0f, 0.0f);
    }

    public static void f(n nVar, float f7, float f10) {
        nVar.f15564c += f7;
        nVar.d += f10;
        nVar.f15570k.postTranslate(f7, f10);
    }

    public static void g(n nVar, float f7, float f10, float f11) {
        nVar.f15565e *= f7;
        nVar.f15570k.postScale(f7, f7, f10, f11);
    }

    public final void h() {
        float f7;
        float f10;
        float f11 = this.h;
        float f12 = this.f15567g;
        if ((f11 + f12) % 180.0f != 0.0f) {
            f7 = this.f15563b;
        } else {
            f7 = this.f15562a;
        }
        if ((f11 + f12) % 180.0f != 0.0f) {
            f10 = this.f15562a;
        } else {
            f10 = this.f15563b;
        }
        p pVar = this.f15571l;
        if (pVar.f15581x) {
            this.f15566f = pVar.f15572a.getCropWidth() / f7;
        } else {
            this.f15566f = Math.max(pVar.f15572a.getCropWidth() / f7, pVar.f15572a.getCropHeight() / f10);
        }
    }
}
