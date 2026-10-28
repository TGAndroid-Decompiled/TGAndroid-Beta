package fi;

import android.view.ViewGroup;
public final class s0 implements Runnable {
    public final int f11571a;
    public final t0 f11572b;

    public s0(t0 t0Var, int i10) {
        this.f11571a = i10;
        this.f11572b = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f11571a) {
            case 0:
                t0 t0Var = this.f11572b;
                if (t0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) t0Var.getParent()).removeView(t0Var);
                    return;
                }
                return;
            default:
                this.f11572b.a();
                return;
        }
    }
}
