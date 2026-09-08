package ji;

import org.telegram.messenger.UserConfig;
import org.telegram.ui.cj0;
public final class d implements Runnable {
    public final int f13875a;
    public final r f13876b;

    public d(r rVar, int i10) {
        this.f13875a = i10;
        this.f13876b = rVar;
    }

    @Override
    public final void run() {
        switch (this.f13875a) {
            case 0:
                r rVar = this.f13876b;
                rVar.I(2147483646, true, 0, false, 0L);
                cj0 cj0Var = rVar.O;
                if (cj0Var != null) {
                    cj0Var.h(false);
                    rVar.O = null;
                    return;
                }
                return;
            case 1:
                r rVar2 = this.f13876b;
                rVar2.I(0, false, 0, false, 0L);
                cj0 cj0Var2 = rVar2.O;
                if (cj0Var2 != null) {
                    cj0Var2.h(true);
                    rVar2.O = null;
                    return;
                }
                return;
            case 2:
                r rVar3 = this.f13876b;
                if (!UserConfig.getInstance(rVar3.f14158n).isPremium()) {
                    new sg.a1(rVar3.f28780b.f31306f0, rVar3.getContext(), rVar3.f14158n, 43, true).show();
                    return;
                }
                return;
            case 3:
                r rVar4 = this.f13876b;
                a4 a4Var = rVar4.f14160s;
                if (a4Var != null) {
                    a4Var.setSendEnabled(rVar4.f14159r.L3());
                    return;
                }
                return;
            default:
                this.f13876b.a0();
                return;
        }
    }
}
