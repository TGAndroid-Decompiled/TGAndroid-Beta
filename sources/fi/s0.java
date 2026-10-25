package fi;

import android.view.ViewGroup;
public final class s0 implements Runnable {
    public final int f11572a;
    public final t0 f11573b;

    public s0(t0 t0Var, int i10) {
        this.f11572a = i10;
        this.f11573b = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f11572a) {
            case 0:
                t0 t0Var = this.f11573b;
                if (t0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) t0Var.getParent()).removeView(t0Var);
                    return;
                }
                return;
            default:
                this.f11573b.a();
                return;
        }
    }
}
