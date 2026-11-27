package defpackage;

import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.WalletEngine2;
public final class dsc implements Runnable {
    public final byte a;
    public final WalletEngine2 b;
    public final icc c;
    public final TL_wallet.walletTransaction d;
    public final String e;

    public dsc(WalletEngine2 walletEngine2, icc iccVar, TL_wallet.walletTransaction wallettransaction, String str, byte b) {
        this.a = b;
        this.b = walletEngine2;
        this.c = iccVar;
        this.d = wallettransaction;
        this.e = str;
    }

    @Override
    public final void run() {
        byte b = this.a;
        String str = this.e;
        TL_wallet.walletTransaction wallettransaction = this.d;
        icc iccVar = this.c;
        WalletEngine2 walletEngine2 = this.b;
        switch (b) {
            case 0:
                walletEngine2.lambda$emulateRotateKey$32(iccVar, wallettransaction, str);
                return;
            default:
                walletEngine2.lambda$previewTonConnect$1(iccVar, wallettransaction, str);
                return;
        }
    }
}
