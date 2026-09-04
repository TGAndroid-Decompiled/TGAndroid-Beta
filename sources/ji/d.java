package ji;

import org.telegram.messenger.UserConfig;
import org.telegram.ui.cj0;
public final class d implements Runnable {
    public final int f13849a;
    public final r f13850b;

    public d(r rVar, int i10) {
        this.f13849a = i10;
        this.f13850b = rVar;
    }

    @Override
    public final void run() {
        switch (this.f13849a) {
            case 0:
                r rVar = this.f13850b;
                rVar.I(2147483646, true, 0, false, 0L);
                cj0 cj0Var = rVar.O;
                if (cj0Var != null) {
                    cj0Var.h(false);
                    rVar.O = null;
                    return;
                }
                return;
            case 1:
                r rVar2 = this.f13850b;
                rVar2.I(0, false, 0, false, 0L);
                cj0 cj0Var2 = rVar2.O;
                if (cj0Var2 != null) {
                    cj0Var2.h(true);
                    rVar2.O = null;
                    return;
                }
                return;
            case 2:
                r rVar3 = this.f13850b;
                if (!UserConfig.getInstance(rVar3.f14132n).isPremium()) {
                    new sg.a1(rVar3.f28753b.f31279f0, rVar3.getContext(), rVar3.f14132n, 43, true).show();
                    return;
                }
                return;
            case 3:
                r rVar4 = this.f13850b;
                a4 a4Var = rVar4.f14134s;
                if (a4Var != null) {
                    a4Var.setSendEnabled(rVar4.f14133r.L3());
                    return;
                }
                return;
            default:
                this.f13850b.a0();
                return;
        }
    }
}
