package ei;

import org.telegram.ui.PremiumPreviewFragment;
public final class d implements Runnable {
    public final int f10184a;
    public final r f10185b;

    public d(r rVar, int i3) {
        this.f10184a = i3;
        this.f10185b = rVar;
    }

    @Override
    public final void run() {
        switch (this.f10184a) {
            case 0:
                this.f10185b.p(true, false);
                return;
            case 1:
                r rVar = this.f10185b;
                gi.l3 l3Var = rVar.K;
                if (l3Var != null) {
                    l3Var.f(true);
                }
                rVar.f10832f0.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            default:
                this.f10185b.c();
                return;
        }
    }
}
