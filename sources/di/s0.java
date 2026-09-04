package di;

import android.view.ViewGroup;
public final class s0 implements Runnable {
    public final int f8089a;
    public final t0 f8090b;

    public s0(t0 t0Var, int i10) {
        this.f8089a = i10;
        this.f8090b = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f8089a) {
            case 0:
                t0 t0Var = this.f8090b;
                if (t0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) t0Var.getParent()).removeView(t0Var);
                    return;
                }
                return;
            default:
                this.f8090b.a();
                return;
        }
    }
}
