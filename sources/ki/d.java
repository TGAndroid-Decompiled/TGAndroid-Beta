package ki;

import org.telegram.messenger.UserConfig;
import org.telegram.ui.li0;
public final class d implements Runnable {
    public final int f15191a;
    public final q f15192b;

    public d(q qVar, int i10) {
        this.f15191a = i10;
        this.f15192b = qVar;
    }

    @Override
    public final void run() {
        switch (this.f15191a) {
            case 0:
                q qVar = this.f15192b;
                qVar.K(2147483646, true, 0, false, 0L);
                li0 li0Var = qVar.O;
                if (li0Var != null) {
                    li0Var.h(false);
                    qVar.O = null;
                    return;
                }
                return;
            case 1:
                q qVar2 = this.f15192b;
                qVar2.K(0, false, 0, false, 0L);
                li0 li0Var2 = qVar2.O;
                if (li0Var2 != null) {
                    li0Var2.h(true);
                    qVar2.O = null;
                    return;
                }
                return;
            case 2:
                q qVar3 = this.f15192b;
                if (!UserConfig.getInstance(qVar3.f15449n).isPremium()) {
                    new sg.y0(qVar3.f28225b.f30536f0, qVar3.getContext(), qVar3.f15449n, 43, true).show();
                    return;
                }
                return;
            case 3:
                q qVar4 = this.f15192b;
                b4 b4Var = qVar4.f15451s;
                if (b4Var != null) {
                    b4Var.setSendEnabled(qVar4.f15450r.N3());
                    return;
                }
                return;
            default:
                this.f15192b.d0();
                return;
        }
    }
}
