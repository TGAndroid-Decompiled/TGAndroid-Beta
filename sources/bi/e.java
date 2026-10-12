package bi;

import org.telegram.ui.PremiumPreviewFragment;
public final class e implements Runnable {
    public final int f2964a;
    public final v f2965b;

    public e(v vVar, int i10) {
        this.f2964a = i10;
        this.f2965b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f2964a) {
            case 0:
                this.f2965b.q(true, false);
                return;
            case 1:
                v vVar = this.f2965b;
                di.d4 d4Var = vVar.J;
                if (d4Var != null) {
                    d4Var.e(true);
                }
                vVar.f3818e0.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            default:
                this.f2965b.c();
                return;
        }
    }
}
