package di;

import org.telegram.ui.PremiumPreviewFragment;
public final class d implements Runnable {
    public final int f8911a;
    public final q f8912b;

    public d(q qVar, int i7) {
        this.f8911a = i7;
        this.f8912b = qVar;
    }

    @Override
    public final void run() {
        switch (this.f8911a) {
            case 0:
                this.f8912b.p(true, false);
                return;
            case 1:
                q qVar = this.f8912b;
                fi.m3 m3Var = qVar.J;
                if (m3Var != null) {
                    m3Var.f(true);
                }
                qVar.f9539e0.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            default:
                this.f8912b.c();
                return;
        }
    }
}
