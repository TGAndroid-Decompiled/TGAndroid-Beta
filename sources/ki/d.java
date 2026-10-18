package ki;

import org.telegram.messenger.UserConfig;
import org.telegram.ui.ni0;
public final class d implements Runnable {
    public final int f15188a;
    public final q f15189b;

    public d(q qVar, int i10) {
        this.f15188a = i10;
        this.f15189b = qVar;
    }

    @Override
    public final void run() {
        switch (this.f15188a) {
            case 0:
                q qVar = this.f15189b;
                qVar.K(2147483646, true, 0, false, 0L);
                ni0 ni0Var = qVar.O;
                if (ni0Var != null) {
                    ni0Var.h(false);
                    qVar.O = null;
                    return;
                }
                return;
            case 1:
                q qVar2 = this.f15189b;
                qVar2.K(0, false, 0, false, 0L);
                ni0 ni0Var2 = qVar2.O;
                if (ni0Var2 != null) {
                    ni0Var2.h(true);
                    qVar2.O = null;
                    return;
                }
                return;
            case 2:
                q qVar3 = this.f15189b;
                if (!UserConfig.getInstance(qVar3.f15446n).isPremium()) {
                    new sg.y0(qVar3.f28238b.f30574f0, qVar3.getContext(), qVar3.f15446n, 43, true).show();
                    return;
                }
                return;
            case 3:
                q qVar4 = this.f15189b;
                b4 b4Var = qVar4.f15448s;
                if (b4Var != null) {
                    b4Var.setSendEnabled(qVar4.f15447r.N3());
                    return;
                }
                return;
            default:
                this.f15189b.d0();
                return;
        }
    }
}
