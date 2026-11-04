package ei;

import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.za;
public final class d9 implements za {
    public final float[] f10211a = new float[2];
    public final e9 f10212b;

    public d9(e9 e9Var) {
        this.f10212b = e9Var;
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
    public final int f(int i3) {
        e9 e9Var = this.f10212b;
        r9 r9Var = e9Var.f10249s0;
        j4 H = r9Var.H();
        if (H == null) {
            return 0;
        }
        m3 m3Var = H.M0;
        e9 e9Var2 = r9Var.f10948s;
        float[] fArr = this.f10211a;
        org.telegram.messenger.g0.r1(m3Var, e9Var2, fArr);
        return (int) (e9Var.getMeasuredHeight() - (fArr[1] + m3Var.getMeasuredHeight()));
    }

    @Override
    public final boolean g(int i3) {
        return false;
    }

    @Override
    public final int h(int i3) {
        return 0;
    }

    @Override
    public final void b(ac acVar) {
    }

    @Override
    public final void c(float f10) {
    }

    @Override
    public final void d(ac acVar) {
    }
}
