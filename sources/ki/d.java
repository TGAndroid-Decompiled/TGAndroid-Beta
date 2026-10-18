package ki;

import org.telegram.messenger.UserConfig;
import org.telegram.ui.oi0;
public final class d implements Runnable {
    public final int f15190a;
    public final q f15191b;

    public d(q qVar, int i10) {
        this.f15190a = i10;
        this.f15191b = qVar;
    }

    @Override
    public final void run() {
        switch (this.f15190a) {
            case 0:
                q qVar = this.f15191b;
                qVar.K(2147483646, true, 0, false, 0L);
                oi0 oi0Var = qVar.O;
                if (oi0Var != null) {
                    oi0Var.h(false);
                    qVar.O = null;
                    return;
                }
                return;
            case 1:
                q qVar2 = this.f15191b;
                qVar2.K(0, false, 0, false, 0L);
                oi0 oi0Var2 = qVar2.O;
                if (oi0Var2 != null) {
                    oi0Var2.h(true);
                    qVar2.O = null;
                    return;
                }
                return;
            case 2:
                q qVar3 = this.f15191b;
                if (!UserConfig.getInstance(qVar3.f15448n).isPremium()) {
                    new sg.x0(qVar3.f28245b.f30581f0, qVar3.getContext(), qVar3.f15448n, 43, true).show();
                    return;
                }
                return;
            case 3:
                q qVar4 = this.f15191b;
                b4 b4Var = qVar4.f15450s;
                if (b4Var != null) {
                    b4Var.setSendEnabled(qVar4.f15449r.N3());
                    return;
                }
                return;
            default:
                this.f15191b.d0();
                return;
        }
    }
}
