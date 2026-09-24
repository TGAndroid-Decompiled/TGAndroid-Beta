package lg;

import android.graphics.Matrix;
public final class n {
    public float f14299a;
    public float f14300b;
    public float f14302f;
    public float h;
    public boolean f14305j;
    public final p f14307l;
    public float f14301c = 0.0f;
    public float d = 0.0f;
    public float e = 1.0f;
    public final float f14303g = 0;
    public float f14304i = 0.0f;
    public final Matrix f14306k = new Matrix();

    public n(p pVar, int i10, int i11) {
        this.f14307l = pVar;
        this.f14299a = i10;
        this.f14300b = i11;
    }

    public static float a(n nVar) {
        if ((nVar.h + nVar.f14303g) % 180.0f != 0.0f) {
            return nVar.f14300b;
        }
        return nVar.f14299a;
    }

    public static float b(n nVar) {
        if ((nVar.h + nVar.f14303g) % 180.0f != 0.0f) {
            return nVar.f14299a;
        }
        return nVar.f14300b;
    }

    public static boolean c(n nVar) {
        if (Math.abs(nVar.f14301c) <= 1.0E-5f && Math.abs(nVar.d) <= 1.0E-5f && Math.abs(nVar.e - nVar.f14302f) <= 1.0E-5f && Math.abs(nVar.f14304i) <= 1.0E-5f && Math.abs(nVar.h) <= 1.0E-5f) {
            return false;
        }
        return true;
    }

    public static void d(n nVar, float f7) {
        Matrix matrix = nVar.f14306k;
        matrix.reset();
        nVar.f14301c = 0.0f;
        nVar.d = 0.0f;
        nVar.f14304i = 0.0f;
        nVar.h = f7;
        nVar.h();
        float f10 = nVar.f14302f;
        nVar.e = f10;
        matrix.postScale(f10, f10);
    }

    public static void e(n nVar, float f7) {
        nVar.f14304i += f7;
        nVar.f14306k.postRotate(f7, 0.0f, 0.0f);
    }

    public static void f(n nVar, float f7, float f10) {
        nVar.f14301c += f7;
        nVar.d += f10;
        nVar.f14306k.postTranslate(f7, f10);
    }

    public static void g(n nVar, float f7, float f10, float f11) {
        nVar.e *= f7;
        nVar.f14306k.postScale(f7, f7, f10, f11);
    }

    public final void h() {
        float f7;
        float f10;
        float f11 = this.h;
        float f12 = this.f14303g;
        if ((f11 + f12) % 180.0f != 0.0f) {
            f7 = this.f14300b;
        } else {
            f7 = this.f14299a;
        }
        if ((f11 + f12) % 180.0f != 0.0f) {
            f10 = this.f14299a;
        } else {
            f10 = this.f14300b;
        }
        p pVar = this.f14307l;
        if (pVar.f14316x) {
            this.f14302f = pVar.f14308a.getCropWidth() / f7;
        } else {
            this.f14302f = Math.max(pVar.f14308a.getCropWidth() / f7, pVar.f14308a.getCropHeight() / f10);
        }
    }
}
