package oh;

import org.telegram.ui.PremiumPreviewFragment;
public final class d implements Runnable {
    public final int f16953a;
    public final p f16954b;

    public d(p pVar, int i10) {
        this.f16953a = i10;
        this.f16954b = pVar;
    }

    @Override
    public final void run() {
        switch (this.f16953a) {
            case 0:
                this.f16954b.p(true, false);
                return;
            case 1:
                p pVar = this.f16954b;
                qh.e3 e3Var = pVar.G;
                if (e3Var != null) {
                    e3Var.e(true);
                }
                pVar.f17579b0.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            default:
                this.f16954b.c();
                return;
        }
    }
}
