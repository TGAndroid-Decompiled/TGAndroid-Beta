package di;

import org.telegram.ui.PremiumPreviewFragment;
public final class d implements Runnable {
    public final int f8906a;
    public final q f8907b;

    public d(q qVar, int i7) {
        this.f8906a = i7;
        this.f8907b = qVar;
    }

    @Override
    public final void run() {
        switch (this.f8906a) {
            case 0:
                this.f8907b.p(true, false);
                return;
            case 1:
                q qVar = this.f8907b;
                fi.m3 m3Var = qVar.J;
                if (m3Var != null) {
                    m3Var.f(true);
                }
                qVar.f9534e0.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            default:
                this.f8907b.c();
                return;
        }
    }
}
