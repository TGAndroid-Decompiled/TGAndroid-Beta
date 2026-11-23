package hi;

import android.view.ViewGroup;
public final class t0 implements Runnable {
    public final int f15493a;
    public final u0 f15494b;

    public t0(u0 u0Var, int i7) {
        this.f15493a = i7;
        this.f15494b = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f15493a) {
            case 0:
                u0 u0Var = this.f15494b;
                if (u0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) u0Var.getParent()).removeView(u0Var);
                    return;
                }
                return;
            default:
                this.f15494b.a();
                return;
        }
    }
}
