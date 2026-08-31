package oh;

import org.telegram.ui.PremiumPreviewFragment;
public final class d implements Runnable {
    public final int f16951a;
    public final p f16952b;

    public d(p pVar, int i10) {
        this.f16951a = i10;
        this.f16952b = pVar;
    }

    @Override
    public final void run() {
        switch (this.f16951a) {
            case 0:
                this.f16952b.p(true, false);
                return;
            case 1:
                p pVar = this.f16952b;
                qh.f3 f3Var = pVar.G;
                if (f3Var != null) {
                    f3Var.e(true);
                }
                pVar.f17577b0.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            default:
                this.f16952b.c();
                return;
        }
    }
}
