package defpackage;

import org.telegram.ui.Wallet.WalletEngine2;
public final class fsc implements Runnable {
    public final byte a = 0;
    public final WalletEngine2 b;
    public final pcc c;
    public final String d;

    public fsc(WalletEngine2 walletEngine2, pcc pccVar, String str) {
        this.b = walletEngine2;
        this.c = pccVar;
        this.d = str;
    }

    @Override
    public final void run() {
        byte b = this.a;
        String str = this.d;
        pcc pccVar = this.c;
        WalletEngine2 walletEngine2 = this.b;
        switch (b) {
            case 0:
                walletEngine2.lambda$getTransactionByHash$42(str, pccVar);
                return;
            default:
                walletEngine2.lambda$previewSignMessage$10(pccVar, str);
                return;
        }
    }

    public fsc(WalletEngine2 walletEngine2, String str, pcc pccVar) {
        this.b = walletEngine2;
        this.d = str;
        this.c = pccVar;
    }
}
