package hi;

import android.view.ViewGroup;
public final class t0 implements Runnable {
    public final int f15405a;
    public final u0 f15406b;

    public t0(u0 u0Var, int i7) {
        this.f15405a = i7;
        this.f15406b = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f15405a) {
            case 0:
                u0 u0Var = this.f15406b;
                if (u0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) u0Var.getParent()).removeView(u0Var);
                    return;
                }
                return;
            default:
                this.f15406b.a();
                return;
        }
    }
}
