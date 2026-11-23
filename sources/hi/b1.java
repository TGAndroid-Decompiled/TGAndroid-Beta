package hi;

import android.view.ViewGroup;
public final class b1 implements Runnable {
    public final int f14213a;
    public final c1 f14214b;

    public b1(c1 c1Var, int i7) {
        this.f14213a = i7;
        this.f14214b = c1Var;
    }

    @Override
    public final void run() {
        switch (this.f14213a) {
            case 0:
                c1 c1Var = this.f14214b;
                if (c1Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) c1Var.getParent()).removeView(c1Var);
                    return;
                }
                return;
            default:
                this.f14214b.a();
                return;
        }
    }
}
