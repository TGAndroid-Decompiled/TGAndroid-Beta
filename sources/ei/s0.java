package ei;

import android.view.ViewGroup;
public final class s0 implements Runnable {
    public final int f9776a;
    public final t0 f9777b;

    public s0(t0 t0Var, int i10) {
        this.f9776a = i10;
        this.f9777b = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f9776a) {
            case 0:
                t0 t0Var = this.f9777b;
                if (t0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) t0Var.getParent()).removeView(t0Var);
                    return;
                }
                return;
            default:
                this.f9777b.a();
                return;
        }
    }
}
