package nh;

import android.view.ViewGroup;
public final class s0 implements Runnable {
    public final int f18543a;
    public final t0 f18544b;

    public s0(t0 t0Var, int i10) {
        this.f18543a = i10;
        this.f18544b = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f18543a) {
            case 0:
                t0 t0Var = this.f18544b;
                if (t0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) t0Var.getParent()).removeView(t0Var);
                    return;
                }
                return;
            default:
                this.f18544b.a();
                return;
        }
    }
}
