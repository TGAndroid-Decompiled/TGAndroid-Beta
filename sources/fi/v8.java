package fi;

import org.telegram.ui.Components.wa;
import org.telegram.ui.Components.xb;
public final class v8 implements wa {
    public final float[] f12449a = new float[2];
    public final w8 f12450b;

    public v8(w8 w8Var) {
        this.f12450b = w8Var;
    }

    @Override
    public final boolean a() {
        return true;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final int f(int i7) {
        w8 w8Var = this.f12450b;
        i9 i9Var = w8Var.f12486s0;
        b4 z10 = i9Var.z();
        if (z10 == null) {
            return 0;
        }
        e3 e3Var = z10.M0;
        w8 w8Var2 = i9Var.f11870s;
        float[] fArr = this.f12449a;
        org.telegram.messenger.g0.r1(e3Var, w8Var2, fArr);
        return (int) (w8Var.getMeasuredHeight() - (fArr[1] + e3Var.getMeasuredHeight()));
    }

    @Override
    public final boolean g(int i7) {
        return false;
    }

    @Override
    public final int h(int i7) {
        return 0;
    }

    @Override
    public final void b(xb xbVar) {
    }

    @Override
    public final void c(float f10) {
    }

    @Override
    public final void d(xb xbVar) {
    }
}
