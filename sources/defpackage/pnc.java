package defpackage;

import org.telegram.ui.Wallet.WalletEngine2;
public final class pnc implements Runnable {
    public final byte a;
    public final WalletEngine2 b;
    public final i8c c;

    public pnc(WalletEngine2 walletEngine2, i8c i8cVar, byte b) {
        this.a = b;
        this.b = walletEngine2;
        this.c = i8cVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        i8c i8cVar = this.c;
        WalletEngine2 walletEngine2 = this.b;
        switch (b) {
            case 0:
                walletEngine2.lambda$emulateRotateKey$33(i8cVar);
                return;
            case 1:
                walletEngine2.lambda$prepareSendNFT$27(i8cVar);
                return;
            default:
                walletEngine2.lambda$balance$17(i8cVar);
                return;
        }
    }
}
