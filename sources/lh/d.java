package lh;

import org.telegram.ui.PremiumPreviewFragment;
public final class d implements Runnable {
    public final int f15448a;
    public final p f15449b;

    public d(p pVar, int i10) {
        this.f15448a = i10;
        this.f15449b = pVar;
    }

    @Override
    public final void run() {
        switch (this.f15448a) {
            case 0:
                this.f15449b.p(true, false);
                return;
            case 1:
                p pVar = this.f15449b;
                nh.t3 t3Var = pVar.F;
                if (t3Var != null) {
                    t3Var.e(true);
                }
                pVar.f16043a0.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            default:
                this.f15449b.c();
                return;
        }
    }
}
