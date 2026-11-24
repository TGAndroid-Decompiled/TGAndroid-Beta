package defpackage;

import org.telegram.tgnet.tl.TL_wallet;
public final class irc implements qac {
    public final byte a;
    public final rrc b;

    public irc(rrc rrcVar, byte b) {
        this.a = b;
        this.b = rrcVar;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        rrc rrcVar = this.b;
        switch (b) {
            case 0:
                rrcVar.r0((String) obj);
                return;
            case 1:
                rrcVar.r0 = (TL_wallet.walletTransaction) obj;
                return;
            case 2:
                rrcVar.r0 = (TL_wallet.walletTransaction) obj;
                return;
            default:
                rrcVar.r0 = (TL_wallet.walletTransaction) obj;
                return;
        }
    }
}
