package di;

import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.cc;
public final class d9 implements ab {
    public final float[] f8937a = new float[2];
    public final e9 f8938b;

    public d9(e9 e9Var) {
        this.f8938b = e9Var;
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
        e9 e9Var = this.f8938b;
        q9 q9Var = e9Var.f8975r0;
        j4 z9 = q9Var.z();
        if (z9 == null) {
            return 0;
        }
        j3 j3Var = z9.L0;
        e9 e9Var2 = q9Var.f9634s;
        float[] fArr = this.f8937a;
        org.telegram.messenger.g0.r1(j3Var, e9Var2, fArr);
        return (int) (e9Var.getMeasuredHeight() - (fArr[1] + j3Var.getMeasuredHeight()));
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
