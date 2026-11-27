package defpackage;

import org.telegram.ui.Wallet.WalletEngine2;
public final class bsc implements Runnable {
    public final byte a;
    public final WalletEngine2 b;
    public final byte[] c;
    public final z45 d;
    public final String e;
    public final icc f;

    public bsc(WalletEngine2 walletEngine2, byte[] bArr, z45 z45Var, String str, icc iccVar, byte b) {
        this.a = b;
        this.b = walletEngine2;
        this.c = bArr;
        this.d = z45Var;
        this.e = str;
        this.f = iccVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        icc iccVar = this.f;
        String str = this.e;
        z45 z45Var = this.d;
        byte[] bArr = this.c;
        WalletEngine2 walletEngine2 = this.b;
        switch (b) {
            case 0:
                walletEngine2.lambda$signMessage$14(bArr, z45Var, str, iccVar);
                return;
            default:
                walletEngine2.lambda$prepareTonConnectTransfer$5(bArr, z45Var, str, iccVar);
                return;
        }
    }
}
