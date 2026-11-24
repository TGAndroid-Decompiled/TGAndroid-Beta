package defpackage;

import org.telegram.tgnet.tl.TL_wallet;
public final class gpc implements p8c {
    public final byte a;
    public final qpc b;

    public gpc(qpc qpcVar, byte b) {
        this.a = b;
        this.b = qpcVar;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        qpc qpcVar = this.b;
        switch (b) {
            case 0:
                qpcVar.q0((String) obj);
                return;
            case 1:
                qpcVar.r0 = (TL_wallet.walletTransaction) obj;
                return;
            case 2:
                qpcVar.r0 = (TL_wallet.walletTransaction) obj;
                return;
            default:
                qpcVar.r0 = (TL_wallet.walletTransaction) obj;
                return;
        }
    }
}
