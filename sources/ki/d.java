package ki;

import org.telegram.messenger.UserConfig;
import org.telegram.ui.mi0;
public final class d implements Runnable {
    public final int f15189a;
    public final q f15190b;

    public d(q qVar, int i10) {
        this.f15189a = i10;
        this.f15190b = qVar;
    }

    @Override
    public final void run() {
        switch (this.f15189a) {
            case 0:
                q qVar = this.f15190b;
                qVar.K(2147483646, true, 0, false, 0L);
                mi0 mi0Var = qVar.O;
                if (mi0Var != null) {
                    mi0Var.g(false);
                    qVar.O = null;
                    return;
                }
                return;
            case 1:
                q qVar2 = this.f15190b;
                qVar2.K(0, false, 0, false, 0L);
                mi0 mi0Var2 = qVar2.O;
                if (mi0Var2 != null) {
                    mi0Var2.g(true);
                    qVar2.O = null;
                    return;
                }
                return;
            case 2:
                q qVar3 = this.f15190b;
                if (!UserConfig.getInstance(qVar3.f15447n).isPremium()) {
                    new sg.y0(qVar3.f28173b.f30546f0, qVar3.getContext(), qVar3.f15447n, 43, true).show();
                    return;
                }
                return;
            case 3:
                q qVar4 = this.f15190b;
                b4 b4Var = qVar4.f15449s;
                if (b4Var != null) {
                    b4Var.setSendEnabled(qVar4.f15448r.N3());
                    return;
                }
                return;
            default:
                this.f15190b.d0();
                return;
        }
    }
}
