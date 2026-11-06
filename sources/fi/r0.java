package fi;

import android.view.ViewGroup;
public final class r0 implements Runnable {
    public final int f12716a;
    public final s0 f12717b;

    public r0(s0 s0Var, int i7) {
        this.f12716a = i7;
        this.f12717b = s0Var;
    }

    @Override
    public final void run() {
        switch (this.f12716a) {
            case 0:
                s0 s0Var = this.f12717b;
                if (s0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) s0Var.getParent()).removeView(s0Var);
                    return;
                }
                return;
            default:
                this.f12717b.a();
                return;
        }
    }
}
