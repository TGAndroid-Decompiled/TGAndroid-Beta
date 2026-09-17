package di;

import android.view.ViewGroup;
public final class s0 implements Runnable {
    public final int f8117a;
    public final t0 f8118b;

    public s0(t0 t0Var, int i10) {
        this.f8117a = i10;
        this.f8118b = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f8117a) {
            case 0:
                t0 t0Var = this.f8118b;
                if (t0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) t0Var.getParent()).removeView(t0Var);
                    return;
                }
                return;
            default:
                this.f8118b.a();
                return;
        }
    }
}
