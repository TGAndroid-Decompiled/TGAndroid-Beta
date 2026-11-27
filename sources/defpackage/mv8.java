package defpackage;

import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.e;
public final class mv8 implements Runnable {
    public final byte a;
    public final e b;
    public final TL_wallet.card c;

    public mv8(e eVar, TL_wallet.card cardVar, byte b) {
        this.a = b;
        this.b = eVar;
        this.c = cardVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TL_wallet.card cardVar = this.c;
        e eVar = this.b;
        switch (b) {
            case 0:
                eVar.presentFragment(new euc(eVar.getCurrentAccount(), cardVar.address));
                return;
            default:
                eVar.presentFragment(new euc(eVar.getCurrentAccount(), cardVar.address));
                return;
        }
    }
}
