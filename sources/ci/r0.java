package ci;

import android.view.ViewGroup;
public final class r0 implements Runnable {
    public final int f5879a;
    public final s0 f5880b;

    public r0(s0 s0Var, int i10) {
        this.f5879a = i10;
        this.f5880b = s0Var;
    }

    @Override
    public final void run() {
        switch (this.f5879a) {
            case 0:
                s0 s0Var = this.f5880b;
                if (s0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) s0Var.getParent()).removeView(s0Var);
                    return;
                }
                return;
            default:
                this.f5880b.a();
                return;
        }
    }
}
