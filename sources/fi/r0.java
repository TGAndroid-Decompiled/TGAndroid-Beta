package fi;

import android.view.ViewGroup;
public final class r0 implements Runnable {
    public final int f12721a;
    public final s0 f12722b;

    public r0(s0 s0Var, int i7) {
        this.f12721a = i7;
        this.f12722b = s0Var;
    }

    @Override
    public final void run() {
        switch (this.f12721a) {
            case 0:
                s0 s0Var = this.f12722b;
                if (s0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) s0Var.getParent()).removeView(s0Var);
                    return;
                }
                return;
            default:
                this.f12722b.a();
                return;
        }
    }
}
