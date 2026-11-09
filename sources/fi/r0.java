package fi;

import android.view.ViewGroup;
public final class r0 implements Runnable {
    public final int f12717a;
    public final s0 f12718b;

    public r0(s0 s0Var, int i7) {
        this.f12717a = i7;
        this.f12718b = s0Var;
    }

    @Override
    public final void run() {
        switch (this.f12717a) {
            case 0:
                s0 s0Var = this.f12718b;
                if (s0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) s0Var.getParent()).removeView(s0Var);
                    return;
                }
                return;
            default:
                this.f12718b.a();
                return;
        }
    }
}
