package lh;

import android.view.ViewGroup;

public final class s0 implements Runnable {

    public final int f16713a;

    public final t0 f16714b;

    public s0(t0 t0Var, int i10) {
        this.f16713a = i10;
        this.f16714b = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f16713a) {
            case 0:
                t0 t0Var = this.f16714b;
                if (t0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) t0Var.getParent()).removeView(t0Var);
                }
                break;
            default:
                this.f16714b.a();
                break;
        }
    }
}
