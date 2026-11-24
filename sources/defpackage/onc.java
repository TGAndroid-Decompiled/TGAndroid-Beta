package defpackage;

import org.telegram.ui.Wallet.WalletEngine2;
public final class onc implements Runnable {
    public final byte a;
    public final WalletEngine2 b;
    public final byte[] c;
    public final v25 d;
    public final String e;
    public final i8c f;

    public onc(WalletEngine2 walletEngine2, byte[] bArr, v25 v25Var, String str, i8c i8cVar, byte b) {
        this.a = b;
        this.b = walletEngine2;
        this.c = bArr;
        this.d = v25Var;
        this.e = str;
        this.f = i8cVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        i8c i8cVar = this.f;
        String str = this.e;
        v25 v25Var = this.d;
        byte[] bArr = this.c;
        WalletEngine2 walletEngine2 = this.b;
        switch (b) {
            case 0:
                walletEngine2.lambda$signMessage$14(bArr, v25Var, str, i8cVar);
                return;
            default:
                walletEngine2.lambda$prepareTonConnectTransfer$5(bArr, v25Var, str, i8cVar);
                return;
        }
    }
}
