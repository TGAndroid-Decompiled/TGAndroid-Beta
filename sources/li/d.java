package li;

import org.telegram.messenger.UserConfig;
import org.telegram.ui.pi0;
public final class d implements Runnable {
    public final int f17178a;
    public final q f17179b;

    public d(q qVar, int i10) {
        this.f17178a = i10;
        this.f17179b = qVar;
    }

    @Override
    public final void run() {
        switch (this.f17178a) {
            case 0:
                q qVar = this.f17179b;
                qVar.K(2147483646, true, 0, false, 0L);
                pi0 pi0Var = qVar.O;
                if (pi0Var != null) {
                    pi0Var.g(false);
                    qVar.O = null;
                    return;
                }
                return;
            case 1:
                q qVar2 = this.f17179b;
                qVar2.K(0, false, 0, false, 0L);
                pi0 pi0Var2 = qVar2.O;
                if (pi0Var2 != null) {
                    pi0Var2.g(true);
                    qVar2.O = null;
                    return;
                }
                return;
            case 2:
                q qVar3 = this.f17179b;
                if (!UserConfig.getInstance(qVar3.f17416n).isPremium()) {
                    new tg.y0(qVar3.f30254b.f32990f0, qVar3.getContext(), qVar3.f17416n, 43, true).show();
                    return;
                }
                return;
            case 3:
                q qVar4 = this.f17179b;
                a4 a4Var = qVar4.f17418s;
                if (a4Var != null) {
                    a4Var.setSendEnabled(qVar4.f17417r.S3());
                    return;
                }
                return;
            default:
                this.f17179b.d0();
                return;
        }
    }
}
