package di;

import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.cc;
public final class c9 implements ab {
    public final float[] f8900a = new float[2];
    public final d9 f8901b;

    public c9(d9 d9Var) {
        this.f8901b = d9Var;
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
        d9 d9Var = this.f8901b;
        p9 p9Var = d9Var.f8950r0;
        i4 z9 = p9Var.z();
        if (z9 == null) {
            return 0;
        }
        j3 j3Var = z9.L0;
        d9 d9Var2 = p9Var.f9569s;
        float[] fArr = this.f8900a;
        org.telegram.messenger.g0.r1(j3Var, d9Var2, fArr);
        return (int) (d9Var.getMeasuredHeight() - (fArr[1] + j3Var.getMeasuredHeight()));
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
    public final void b(cc ccVar) {
    }

    @Override
    public final void c(float f10) {
    }

    @Override
    public final void d(cc ccVar) {
    }
}
