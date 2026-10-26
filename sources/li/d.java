package li;

import org.telegram.messenger.UserConfig;
import org.telegram.ui.ni0;
public final class d implements Runnable {
    public final int f17179a;
    public final q f17180b;

    public d(q qVar, int i10) {
        this.f17179a = i10;
        this.f17180b = qVar;
    }

    @Override
    public final void run() {
        switch (this.f17179a) {
            case 0:
                q qVar = this.f17180b;
                qVar.K(2147483646, true, 0, false, 0L);
                ni0 ni0Var = qVar.O;
                if (ni0Var != null) {
                    ni0Var.g(false);
                    qVar.O = null;
                    return;
                }
                return;
            case 1:
                q qVar2 = this.f17180b;
                qVar2.K(0, false, 0, false, 0L);
                ni0 ni0Var2 = qVar2.O;
                if (ni0Var2 != null) {
                    ni0Var2.g(true);
                    qVar2.O = null;
                    return;
                }
                return;
            case 2:
                q qVar3 = this.f17180b;
                if (!UserConfig.getInstance(qVar3.f17417n).isPremium()) {
                    new tg.y0(qVar3.f30215b.f33021f0, qVar3.getContext(), qVar3.f17417n, 43, true).show();
                    return;
                }
                return;
            case 3:
                q qVar4 = this.f17180b;
                a4 a4Var = qVar4.f17419s;
                if (a4Var != null) {
                    a4Var.setSendEnabled(qVar4.f17418r.S3());
                    return;
                }
                return;
            default:
                this.f17180b.d0();
                return;
        }
    }
}
