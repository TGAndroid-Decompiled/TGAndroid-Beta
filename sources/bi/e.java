package bi;

import org.telegram.ui.PremiumPreviewFragment;
public final class e implements Runnable {
    public final int f2968a;
    public final v f2969b;

    public e(v vVar, int i10) {
        this.f2968a = i10;
        this.f2969b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f2968a) {
            case 0:
                this.f2969b.q(true, false);
                return;
            case 1:
                v vVar = this.f2969b;
                di.d4 d4Var = vVar.J;
                if (d4Var != null) {
                    d4Var.e(true);
                }
                vVar.f3822e0.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            default:
                this.f2969b.c();
                return;
        }
    }
}
