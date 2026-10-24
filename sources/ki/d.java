package ki;

import org.telegram.messenger.UserConfig;
import org.telegram.ui.pi0;
public final class d implements Runnable {
    public final int f15247a;
    public final q f15248b;

    public d(q qVar, int i10) {
        this.f15247a = i10;
        this.f15248b = qVar;
    }

    @Override
    public final void run() {
        switch (this.f15247a) {
            case 0:
                q qVar = this.f15248b;
                qVar.K(2147483646, true, 0, false, 0L);
                pi0 pi0Var = qVar.O;
                if (pi0Var != null) {
                    pi0Var.g(false);
                    qVar.O = null;
                    return;
                }
                return;
            case 1:
                q qVar2 = this.f15248b;
                qVar2.K(0, false, 0, false, 0L);
                pi0 pi0Var2 = qVar2.O;
                if (pi0Var2 != null) {
                    pi0Var2.g(true);
                    qVar2.O = null;
                    return;
                }
                return;
            case 2:
                q qVar3 = this.f15248b;
                if (!UserConfig.getInstance(qVar3.f15507n).isPremium()) {
                    new sg.y0(qVar3.f27704b.f30146f0, qVar3.getContext(), qVar3.f15507n, 43, true).show();
                    return;
                }
                return;
            case 3:
                q qVar4 = this.f15248b;
                b4 b4Var = qVar4.f15509s;
                if (b4Var != null) {
                    b4Var.setSendEnabled(qVar4.f15508r.S3());
                    return;
                }
                return;
            default:
                this.f15248b.d0();
                return;
        }
    }
}
