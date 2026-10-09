package ci;

import android.view.ViewGroup;
public final class r0 implements Runnable {
    public final int f5880a;
    public final s0 f5881b;

    public r0(s0 s0Var, int i10) {
        this.f5880a = i10;
        this.f5881b = s0Var;
    }

    @Override
    public final void run() {
        switch (this.f5880a) {
            case 0:
                s0 s0Var = this.f5881b;
                if (s0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) s0Var.getParent()).removeView(s0Var);
                    return;
                }
                return;
            default:
                this.f5881b.a();
                return;
        }
    }
}
