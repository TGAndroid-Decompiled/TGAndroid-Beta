package ci;

import android.view.ViewGroup;
public final class s0 implements Runnable {
    public final int f5474a;
    public final t0 f5475b;

    public s0(t0 t0Var, int i10) {
        this.f5474a = i10;
        this.f5475b = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f5474a) {
            case 0:
                t0 t0Var = this.f5475b;
                if (t0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) t0Var.getParent()).removeView(t0Var);
                    return;
                }
                return;
            default:
                this.f5475b.a();
                return;
        }
    }
}
