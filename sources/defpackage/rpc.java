package defpackage;

import org.telegram.ui.Wallet.WalletEngine2;
public final class rpc implements Runnable {
    public final byte a;
    public final WalletEngine2 b;
    public final jac c;

    public rpc(WalletEngine2 walletEngine2, jac jacVar, byte b) {
        this.a = b;
        this.b = walletEngine2;
        this.c = jacVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        jac jacVar = this.c;
        WalletEngine2 walletEngine2 = this.b;
        switch (b) {
            case 0:
                walletEngine2.lambda$emulateRotateKey$33(jacVar);
                return;
            case 1:
                walletEngine2.lambda$prepareSendNFT$27(jacVar);
                return;
            default:
                walletEngine2.lambda$balance$17(jacVar);
                return;
        }
    }
}
