package defpackage;

import org.telegram.ui.Wallet.WalletEngine2;
public final class vpc implements Runnable {
    public final byte a = 0;
    public final WalletEngine2 b;
    public final qac c;
    public final String d;

    public vpc(WalletEngine2 walletEngine2, qac qacVar, String str) {
        this.b = walletEngine2;
        this.c = qacVar;
        this.d = str;
    }

    @Override
    public final void run() {
        byte b = this.a;
        String str = this.d;
        qac qacVar = this.c;
        WalletEngine2 walletEngine2 = this.b;
        switch (b) {
            case 0:
                walletEngine2.lambda$getTransactionByHash$42(str, qacVar);
                return;
            default:
                walletEngine2.lambda$previewSignMessage$10(qacVar, str);
                return;
        }
    }

    public vpc(WalletEngine2 walletEngine2, String str, qac qacVar) {
        this.b = walletEngine2;
        this.d = str;
        this.c = qacVar;
    }
}
