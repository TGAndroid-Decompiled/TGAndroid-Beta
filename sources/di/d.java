package di;

import org.telegram.ui.PremiumPreviewFragment;
public final class d implements Runnable {
    public final int f8902a;
    public final q f8903b;

    public d(q qVar, int i7) {
        this.f8902a = i7;
        this.f8903b = qVar;
    }

    @Override
    public final void run() {
        switch (this.f8902a) {
            case 0:
                this.f8903b.p(true, false);
                return;
            case 1:
                q qVar = this.f8903b;
                fi.m3 m3Var = qVar.J;
                if (m3Var != null) {
                    m3Var.f(true);
                }
                qVar.f9593e0.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            default:
                this.f8903b.c();
                return;
        }
    }
}
