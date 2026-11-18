package fi;

import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.gc;
public final class s8 implements fb {
    public final float[] f12552a = new float[2];
    public final t8 f12553b;

    public s8(t8 t8Var) {
        this.f12553b = t8Var;
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
        t8 t8Var = this.f12553b;
        f9 f9Var = t8Var.f12604s0;
        z3 z10 = f9Var.z();
        if (z10 == null) {
            return 0;
        }
        c3 c3Var = z10.M0;
        t8 t8Var2 = f9Var.f11992s;
        float[] fArr = this.f12552a;
        org.telegram.messenger.g0.r1(c3Var, t8Var2, fArr);
        return (int) (t8Var.getMeasuredHeight() - (fArr[1] + c3Var.getMeasuredHeight()));
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
    public final void b(gc gcVar) {
    }

    @Override
    public final void c(float f10) {
    }

    @Override
    public final void d(gc gcVar) {
    }
}
