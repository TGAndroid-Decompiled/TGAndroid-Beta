package ei;

import android.view.ViewGroup;
public final class s0 implements Runnable {
    public final int f9763a;
    public final t0 f9764b;

    public s0(t0 t0Var, int i10) {
        this.f9763a = i10;
        this.f9764b = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f9763a) {
            case 0:
                t0 t0Var = this.f9764b;
                if (t0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) t0Var.getParent()).removeView(t0Var);
                    return;
                }
                return;
            default:
                this.f9764b.a();
                return;
        }
    }
}
