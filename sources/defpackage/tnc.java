package defpackage;

import org.telegram.ui.Wallet.WalletEngine2;
public final class tnc implements Runnable {
    public final byte a = 0;
    public final WalletEngine2 b;
    public final p8c c;
    public final String d;

    public tnc(WalletEngine2 walletEngine2, p8c p8cVar, String str) {
        this.b = walletEngine2;
        this.c = p8cVar;
        this.d = str;
    }

    @Override
    public final void run() {
        byte b = this.a;
        String str = this.d;
        p8c p8cVar = this.c;
        WalletEngine2 walletEngine2 = this.b;
        switch (b) {
            case 0:
                walletEngine2.lambda$getTransactionByHash$42(str, p8cVar);
                return;
            default:
                walletEngine2.lambda$previewSignMessage$10(p8cVar, str);
                return;
        }
    }

    public tnc(WalletEngine2 walletEngine2, String str, p8c p8cVar) {
        this.b = walletEngine2;
        this.d = str;
        this.c = p8cVar;
    }
}
