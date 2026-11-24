package defpackage;

import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.WalletEngine2;
public final class spc implements Runnable {
    public final byte a;
    public final WalletEngine2 b;
    public final jac c;
    public final TL_wallet.walletTransaction d;
    public final String e;

    public spc(WalletEngine2 walletEngine2, jac jacVar, TL_wallet.walletTransaction wallettransaction, String str, byte b) {
        this.a = b;
        this.b = walletEngine2;
        this.c = jacVar;
        this.d = wallettransaction;
        this.e = str;
    }

    @Override
    public final void run() {
        byte b = this.a;
        String str = this.e;
        TL_wallet.walletTransaction wallettransaction = this.d;
        jac jacVar = this.c;
        WalletEngine2 walletEngine2 = this.b;
        switch (b) {
            case 0:
                walletEngine2.lambda$emulateRotateKey$32(jacVar, wallettransaction, str);
                return;
            default:
                walletEngine2.lambda$previewTonConnect$1(jacVar, wallettransaction, str);
                return;
        }
    }
}
