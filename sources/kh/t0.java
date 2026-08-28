package kh;

import android.view.ViewGroup;
public final class t0 implements Runnable {
    public final int f16076a;
    public final u0 f16077b;

    public t0(u0 u0Var, int i9) {
        this.f16076a = i9;
        this.f16077b = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f16076a) {
            case 0:
                u0 u0Var = this.f16077b;
                if (u0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) u0Var.getParent()).removeView(u0Var);
                    return;
                }
                return;
            default:
                this.f16077b.a();
                return;
        }
    }
}
