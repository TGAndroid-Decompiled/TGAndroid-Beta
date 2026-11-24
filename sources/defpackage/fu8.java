package defpackage;

import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.d;
public final class fu8 implements Runnable {
    public final byte a;
    public final d b;
    public final TL_wallet.card c;

    public fu8(d dVar, TL_wallet.card cardVar, byte b) {
        this.a = b;
        this.b = dVar;
        this.c = cardVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TL_wallet.card cardVar = this.c;
        d dVar = this.b;
        switch (b) {
            case 0:
                dVar.presentFragment(new rrc(dVar.getCurrentAccount(), cardVar.address));
                return;
            default:
                dVar.presentFragment(new rrc(dVar.getCurrentAccount(), cardVar.address));
                return;
        }
    }
}
