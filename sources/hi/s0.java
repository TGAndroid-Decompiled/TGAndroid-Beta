package hi;

import android.view.ViewGroup;
public final class s0 implements Runnable {
    public final int f15014a;
    public final t0 f15015b;

    public s0(t0 t0Var, int i7) {
        this.f15014a = i7;
        this.f15015b = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f15014a) {
            case 0:
                t0 t0Var = this.f15015b;
                if (t0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) t0Var.getParent()).removeView(t0Var);
                    return;
                }
                return;
            default:
                this.f15015b.a();
                return;
        }
    }
}
