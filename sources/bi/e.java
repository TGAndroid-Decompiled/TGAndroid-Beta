package bi;

import org.telegram.ui.PremiumPreviewFragment;
public final class e implements Runnable {
    public final int f2918a;
    public final v f2919b;

    public e(v vVar, int i10) {
        this.f2918a = i10;
        this.f2919b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f2918a) {
            case 0:
                this.f2919b.p(true, false);
                return;
            case 1:
                v vVar = this.f2919b;
                di.f4 f4Var = vVar.J;
                if (f4Var != null) {
                    f4Var.e(true);
                }
                vVar.f3881e0.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            default:
                this.f2919b.c();
                return;
        }
    }
}
