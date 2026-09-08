package mg;

import android.graphics.Matrix;
public final class o {
    public float f16320a;
    public float f16321b;
    public float f16324f;
    public float h;
    public boolean f16327j;
    public final q f16329l;
    public float f16322c = 0.0f;
    public float d = 0.0f;
    public float f16323e = 1.0f;
    public final float f16325g = 0;
    public float f16326i = 0.0f;
    public final Matrix f16328k = new Matrix();

    public o(q qVar, int i10, int i11) {
        this.f16329l = qVar;
        this.f16320a = i10;
        this.f16321b = i11;
    }

    public static float a(o oVar) {
        if ((oVar.h + oVar.f16325g) % 180.0f != 0.0f) {
            return oVar.f16321b;
        }
        return oVar.f16320a;
    }

    public static float b(o oVar) {
        if ((oVar.h + oVar.f16325g) % 180.0f != 0.0f) {
            return oVar.f16320a;
        }
        return oVar.f16321b;
    }

    public static boolean c(o oVar) {
        if (Math.abs(oVar.f16322c) <= 1.0E-5f && Math.abs(oVar.d) <= 1.0E-5f && Math.abs(oVar.f16323e - oVar.f16324f) <= 1.0E-5f && Math.abs(oVar.f16326i) <= 1.0E-5f && Math.abs(oVar.h) <= 1.0E-5f) {
            return false;
        }
        return true;
    }

    public static void d(o oVar, float f7) {
        Matrix matrix = oVar.f16328k;
        matrix.reset();
        oVar.f16322c = 0.0f;
        oVar.d = 0.0f;
        oVar.f16326i = 0.0f;
        oVar.h = f7;
        oVar.h();
        float f10 = oVar.f16324f;
        oVar.f16323e = f10;
        matrix.postScale(f10, f10);
    }

    public static void e(o oVar, float f7) {
        oVar.f16326i += f7;
        oVar.f16328k.postRotate(f7, 0.0f, 0.0f);
    }

    public static void f(o oVar, float f7, float f10) {
        oVar.f16322c += f7;
        oVar.d += f10;
        oVar.f16328k.postTranslate(f7, f10);
    }

    public static void g(o oVar, float f7, float f10, float f11) {
        oVar.f16323e *= f7;
        oVar.f16328k.postScale(f7, f7, f10, f11);
    }

    public final void h() {
        float f7;
        float f10;
        float f11 = this.h;
        float f12 = this.f16325g;
        if ((f11 + f12) % 180.0f != 0.0f) {
            f7 = this.f16321b;
        } else {
            f7 = this.f16320a;
        }
        if ((f11 + f12) % 180.0f != 0.0f) {
            f10 = this.f16320a;
        } else {
            f10 = this.f16321b;
        }
        q qVar = this.f16329l;
        if (qVar.f16339x) {
            this.f16324f = qVar.f16330a.getCropWidth() / f7;
        } else {
            this.f16324f = Math.max(qVar.f16330a.getCropWidth() / f7, qVar.f16330a.getCropHeight() / f10);
        }
    }
}
