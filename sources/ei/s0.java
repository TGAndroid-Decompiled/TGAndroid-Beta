package ei;

import android.view.ViewGroup;
public final class s0 implements Runnable {
    public final int f9761a;
    public final t0 f9762b;

    public s0(t0 t0Var, int i10) {
        this.f9761a = i10;
        this.f9762b = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f9761a) {
            case 0:
                t0 t0Var = this.f9762b;
                if (t0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) t0Var.getParent()).removeView(t0Var);
                    return;
                }
                return;
            default:
                this.f9762b.a();
                return;
        }
    }
}
