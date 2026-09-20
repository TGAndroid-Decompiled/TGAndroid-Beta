package ci;

import android.view.ViewGroup;
public final class s0 implements Runnable {
    public final int f5484a;
    public final t0 f5485b;

    public s0(t0 t0Var, int i10) {
        this.f5484a = i10;
        this.f5485b = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f5484a) {
            case 0:
                t0 t0Var = this.f5485b;
                if (t0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) t0Var.getParent()).removeView(t0Var);
                    return;
                }
                return;
            default:
                this.f5485b.a();
                return;
        }
    }
}
