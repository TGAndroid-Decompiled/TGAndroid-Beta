package ei;

import android.view.ViewGroup;
public final class s0 implements Runnable {
    public final int f9762a;
    public final t0 f9763b;

    public s0(t0 t0Var, int i10) {
        this.f9762a = i10;
        this.f9763b = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f9762a) {
            case 0:
                t0 t0Var = this.f9763b;
                if (t0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) t0Var.getParent()).removeView(t0Var);
                    return;
                }
                return;
            default:
                this.f9763b.a();
                return;
        }
    }
}
