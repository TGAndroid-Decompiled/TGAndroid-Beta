package defpackage;

import org.telegram.ui.Wallet.WalletEngine2;
public final class csc implements Runnable {
    public final byte a;
    public final WalletEngine2 b;
    public final icc c;

    public csc(WalletEngine2 walletEngine2, icc iccVar, byte b) {
        this.a = b;
        this.b = walletEngine2;
        this.c = iccVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        icc iccVar = this.c;
        WalletEngine2 walletEngine2 = this.b;
        switch (b) {
            case 0:
                walletEngine2.lambda$emulateRotateKey$33(iccVar);
                return;
            case 1:
                walletEngine2.lambda$prepareSendNFT$27(iccVar);
                return;
            default:
                walletEngine2.lambda$balance$17(iccVar);
                return;
        }
    }
}
