package ci;

import android.view.ViewGroup;
public final class s0 implements Runnable {
    public final int f5482a;
    public final t0 f5483b;

    public s0(t0 t0Var, int i10) {
        this.f5482a = i10;
        this.f5483b = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f5482a) {
            case 0:
                t0 t0Var = this.f5483b;
                if (t0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) t0Var.getParent()).removeView(t0Var);
                    return;
                }
                return;
            default:
                this.f5483b.a();
                return;
        }
    }
}
