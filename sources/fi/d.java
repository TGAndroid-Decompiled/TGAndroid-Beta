package fi;

import org.telegram.ui.PremiumPreviewFragment;
public final class d implements Runnable {
    public final int f11824a;
    public final q f11825b;

    public d(q qVar, int i7) {
        this.f11824a = i7;
        this.f11825b = qVar;
    }

    @Override
    public final void run() {
        switch (this.f11824a) {
            case 0:
                this.f11825b.p(true, false);
                return;
            case 1:
                q qVar = this.f11825b;
                hi.l3 l3Var = qVar.K;
                if (l3Var != null) {
                    l3Var.f(true);
                }
                qVar.f12414f0.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            default:
                this.f11825b.c();
                return;
        }
    }
}
