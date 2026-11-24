package defpackage;

import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.WalletEngine2;
public final class mnc implements Runnable {
    public final byte a;
    public final WalletEngine2 b;
    public final i8c c;
    public final TL_wallet.sendTransfer d;
    public final String e;

    public mnc(WalletEngine2 walletEngine2, i8c i8cVar, TL_wallet.sendTransfer sendtransfer, String str, byte b) {
        this.a = b;
        this.b = walletEngine2;
        this.c = i8cVar;
        this.d = sendtransfer;
        this.e = str;
    }

    @Override
    public final void run() {
        byte b = this.a;
        String str = this.e;
        TL_wallet.sendTransfer sendtransfer = this.d;
        i8c i8cVar = this.c;
        WalletEngine2 walletEngine2 = this.b;
        switch (b) {
            case 0:
                walletEngine2.lambda$prepareTonConnectTransfer$4(i8cVar, sendtransfer, str);
                return;
            case 1:
                walletEngine2.lambda$prepareTonConnectTransferPair$7(i8cVar, sendtransfer, str);
                return;
            default:
                walletEngine2.lambda$prepareSendNFT$28(i8cVar, sendtransfer, str);
                return;
        }
    }
}
