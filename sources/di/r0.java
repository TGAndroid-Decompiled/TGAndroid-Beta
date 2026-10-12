package di;

import android.view.ViewGroup;
public final class r0 implements Runnable {
    public final int f7686a;
    public final s0 f7687b;

    public r0(s0 s0Var, int i10) {
        this.f7686a = i10;
        this.f7687b = s0Var;
    }

    @Override
    public final void run() {
        switch (this.f7686a) {
            case 0:
                s0 s0Var = this.f7687b;
                if (s0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) s0Var.getParent()).removeView(s0Var);
                    return;
                }
                return;
            default:
                this.f7687b.a();
                return;
        }
    }
}
