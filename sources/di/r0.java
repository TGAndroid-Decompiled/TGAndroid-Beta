package di;

import android.view.ViewGroup;
public final class r0 implements Runnable {
    public final int f7689a;
    public final s0 f7690b;

    public r0(s0 s0Var, int i10) {
        this.f7689a = i10;
        this.f7690b = s0Var;
    }

    @Override
    public final void run() {
        switch (this.f7689a) {
            case 0:
                s0 s0Var = this.f7690b;
                if (s0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) s0Var.getParent()).removeView(s0Var);
                    return;
                }
                return;
            default:
                this.f7690b.a();
                return;
        }
    }
}
