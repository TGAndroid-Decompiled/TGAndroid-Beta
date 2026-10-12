package ji;

import org.telegram.messenger.UserConfig;
import org.telegram.ui.hj0;
public final class d implements Runnable {
    public final int f13189a;
    public final r f13190b;

    public d(r rVar, int i10) {
        this.f13189a = i10;
        this.f13190b = rVar;
    }

    @Override
    public final void run() {
        switch (this.f13189a) {
            case 0:
                r rVar = this.f13190b;
                rVar.K(2147483646, true, 0, false, 0L);
                hj0 hj0Var = rVar.O;
                if (hj0Var != null) {
                    hj0Var.h(false);
                    rVar.O = null;
                    return;
                }
                return;
            case 1:
                r rVar2 = this.f13190b;
                rVar2.K(0, false, 0, false, 0L);
                hj0 hj0Var2 = rVar2.O;
                if (hj0Var2 != null) {
                    hj0Var2.h(true);
                    rVar2.O = null;
                    return;
                }
                return;
            case 2:
                r rVar3 = this.f13190b;
                if (!UserConfig.getInstance(rVar3.f13482n).isPremium()) {
                    new sg.y0(rVar3.f27671b.f30001f0, rVar3.getContext(), rVar3.f13482n, 43, true).show();
                    return;
                }
                return;
            case 3:
                r rVar4 = this.f13190b;
                c4 c4Var = rVar4.f13484s;
                if (c4Var != null) {
                    c4Var.setSendEnabled(rVar4.f13483r.N3());
                    return;
                }
                return;
            default:
                this.f13190b.d0();
                return;
        }
    }
}
