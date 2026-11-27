package defpackage;

import org.telegram.tgnet.tl.TL_wallet;
public final class stc implements pcc {
    public final byte a;
    public final euc b;

    public stc(euc eucVar, byte b) {
        this.a = b;
        this.b = eucVar;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        euc eucVar = this.b;
        switch (b) {
            case 0:
                eucVar.q0((String) obj);
                return;
            case 1:
                eucVar.r0 = (TL_wallet.walletTransaction) obj;
                return;
            case 2:
                eucVar.r0 = (TL_wallet.walletTransaction) obj;
                return;
            default:
                eucVar.r0 = (TL_wallet.walletTransaction) obj;
                return;
        }
    }
}
