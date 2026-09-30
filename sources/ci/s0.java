package ci;

import android.view.ViewGroup;
public final class s0 implements Runnable {
    public final int f5479a;
    public final t0 f5480b;

    public s0(t0 t0Var, int i10) {
        this.f5479a = i10;
        this.f5480b = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f5479a) {
            case 0:
                t0 t0Var = this.f5480b;
                if (t0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) t0Var.getParent()).removeView(t0Var);
                    return;
                }
                return;
            default:
                this.f5480b.a();
                return;
        }
    }
}
