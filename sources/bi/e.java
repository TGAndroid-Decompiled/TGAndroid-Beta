package bi;

import org.telegram.ui.PremiumPreviewFragment;
public final class e implements Runnable {
    public final int f2891a;
    public final v f2892b;

    public e(v vVar, int i10) {
        this.f2891a = i10;
        this.f2892b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f2891a) {
            case 0:
                this.f2892b.p(true, false);
                return;
            case 1:
                v vVar = this.f2892b;
                di.f4 f4Var = vVar.J;
                if (f4Var != null) {
                    f4Var.e(true);
                }
                vVar.f3854e0.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            default:
                this.f2892b.c();
                return;
        }
    }
}
