package lg;

import android.graphics.Matrix;
public final class n {
    public float f15601a;
    public float f15602b;
    public float f15605f;
    public float h;
    public boolean f15608j;
    public final p f15610l;
    public float f15603c = 0.0f;
    public float d = 0.0f;
    public float f15604e = 1.0f;
    public final float f15606g = 0;
    public float f15607i = 0.0f;
    public final Matrix f15609k = new Matrix();

    public n(p pVar, int i10, int i11) {
        this.f15610l = pVar;
        this.f15601a = i10;
        this.f15602b = i11;
    }

    public static float a(n nVar) {
        if ((nVar.h + nVar.f15606g) % 180.0f != 0.0f) {
            return nVar.f15602b;
        }
        return nVar.f15601a;
    }

    public static float b(n nVar) {
        if ((nVar.h + nVar.f15606g) % 180.0f != 0.0f) {
            return nVar.f15601a;
        }
        return nVar.f15602b;
    }

    public static boolean c(n nVar) {
        if (Math.abs(nVar.f15603c) <= 1.0E-5f && Math.abs(nVar.d) <= 1.0E-5f && Math.abs(nVar.f15604e - nVar.f15605f) <= 1.0E-5f && Math.abs(nVar.f15607i) <= 1.0E-5f && Math.abs(nVar.h) <= 1.0E-5f) {
            return false;
        }
        return true;
    }

    public static void d(n nVar, float f7) {
        Matrix matrix = nVar.f15609k;
        matrix.reset();
        nVar.f15603c = 0.0f;
        nVar.d = 0.0f;
        nVar.f15607i = 0.0f;
        nVar.h = f7;
        nVar.h();
        float f10 = nVar.f15605f;
        nVar.f15604e = f10;
        matrix.postScale(f10, f10);
    }

    public static void e(n nVar, float f7) {
        nVar.f15607i += f7;
        nVar.f15609k.postRotate(f7, 0.0f, 0.0f);
    }

    public static void f(n nVar, float f7, float f10) {
        nVar.f15603c += f7;
        nVar.d += f10;
        nVar.f15609k.postTranslate(f7, f10);
    }

    public static void g(n nVar, float f7, float f10, float f11) {
        nVar.f15604e *= f7;
        nVar.f15609k.postScale(f7, f7, f10, f11);
    }

    public final void h() {
        float f7;
        float f10;
        float f11 = this.h;
        float f12 = this.f15606g;
        if ((f11 + f12) % 180.0f != 0.0f) {
            f7 = this.f15602b;
        } else {
            f7 = this.f15601a;
        }
        if ((f11 + f12) % 180.0f != 0.0f) {
            f10 = this.f15601a;
        } else {
            f10 = this.f15602b;
        }
        p pVar = this.f15610l;
        if (pVar.f15620x) {
            this.f15605f = pVar.f15611a.getCropWidth() / f7;
        } else {
            this.f15605f = Math.max(pVar.f15611a.getCropWidth() / f7, pVar.f15611a.getCropHeight() / f10);
        }
    }
}
