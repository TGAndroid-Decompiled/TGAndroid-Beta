package lg;

import android.graphics.Matrix;
public final class n {
    public float f15308a;
    public float f15309b;
    public float f15312f;
    public float h;
    public boolean f15315j;
    public final p f15317l;
    public float f15310c = 0.0f;
    public float d = 0.0f;
    public float f15311e = 1.0f;
    public final float f15313g = 0;
    public float f15314i = 0.0f;
    public final Matrix f15316k = new Matrix();

    public n(p pVar, int i10, int i11) {
        this.f15317l = pVar;
        this.f15308a = i10;
        this.f15309b = i11;
    }

    public static float a(n nVar) {
        if ((nVar.h + nVar.f15313g) % 180.0f != 0.0f) {
            return nVar.f15309b;
        }
        return nVar.f15308a;
    }

    public static float b(n nVar) {
        if ((nVar.h + nVar.f15313g) % 180.0f != 0.0f) {
            return nVar.f15308a;
        }
        return nVar.f15309b;
    }

    public static boolean c(n nVar) {
        if (Math.abs(nVar.f15310c) <= 1.0E-5f && Math.abs(nVar.d) <= 1.0E-5f && Math.abs(nVar.f15311e - nVar.f15312f) <= 1.0E-5f && Math.abs(nVar.f15314i) <= 1.0E-5f && Math.abs(nVar.h) <= 1.0E-5f) {
            return false;
        }
        return true;
    }

    public static void d(n nVar, float f7) {
        Matrix matrix = nVar.f15316k;
        matrix.reset();
        nVar.f15310c = 0.0f;
        nVar.d = 0.0f;
        nVar.f15314i = 0.0f;
        nVar.h = f7;
        nVar.h();
        float f10 = nVar.f15312f;
        nVar.f15311e = f10;
        matrix.postScale(f10, f10);
    }

    public static void e(n nVar, float f7) {
        nVar.f15314i += f7;
        nVar.f15316k.postRotate(f7, 0.0f, 0.0f);
    }

    public static void f(n nVar, float f7, float f10) {
        nVar.f15310c += f7;
        nVar.d += f10;
        nVar.f15316k.postTranslate(f7, f10);
    }

    public static void g(n nVar, float f7, float f10, float f11) {
        nVar.f15311e *= f7;
        nVar.f15316k.postScale(f7, f7, f10, f11);
    }

    public final void h() {
        float f7;
        float f10;
        float f11 = this.h;
        float f12 = this.f15313g;
        if ((f11 + f12) % 180.0f != 0.0f) {
            f7 = this.f15309b;
        } else {
            f7 = this.f15308a;
        }
        if ((f11 + f12) % 180.0f != 0.0f) {
            f10 = this.f15308a;
        } else {
            f10 = this.f15309b;
        }
        p pVar = this.f15317l;
        if (pVar.f15327x) {
            this.f15312f = pVar.f15318a.getCropWidth() / f7;
        } else {
            this.f15312f = Math.max(pVar.f15318a.getCropWidth() / f7, pVar.f15318a.getCropHeight() / f10);
        }
    }
}
