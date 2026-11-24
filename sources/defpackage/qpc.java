package defpackage;

import org.telegram.ui.Wallet.WalletEngine2;
public final class qpc implements Runnable {
    public final byte a;
    public final WalletEngine2 b;
    public final byte[] c;
    public final v45 d;
    public final String e;
    public final jac f;

    public qpc(WalletEngine2 walletEngine2, byte[] bArr, v45 v45Var, String str, jac jacVar, byte b) {
        this.a = b;
        this.b = walletEngine2;
        this.c = bArr;
        this.d = v45Var;
        this.e = str;
        this.f = jacVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        jac jacVar = this.f;
        String str = this.e;
        v45 v45Var = this.d;
        byte[] bArr = this.c;
        WalletEngine2 walletEngine2 = this.b;
        switch (b) {
            case 0:
                walletEngine2.lambda$signMessage$14(bArr, v45Var, str, jacVar);
                return;
            default:
                walletEngine2.lambda$prepareTonConnectTransfer$5(bArr, v45Var, str, jacVar);
                return;
        }
    }
}
