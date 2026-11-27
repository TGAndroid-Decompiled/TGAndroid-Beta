package defpackage;

import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.WalletEngine2;
public final class zrc implements Runnable {
    public final byte a;
    public final WalletEngine2 b;
    public final icc c;
    public final TL_wallet.sendTransfer d;
    public final String e;

    public zrc(WalletEngine2 walletEngine2, icc iccVar, TL_wallet.sendTransfer sendtransfer, String str, byte b) {
        this.a = b;
        this.b = walletEngine2;
        this.c = iccVar;
        this.d = sendtransfer;
        this.e = str;
    }

    @Override
    public final void run() {
        byte b = this.a;
        String str = this.e;
        TL_wallet.sendTransfer sendtransfer = this.d;
        icc iccVar = this.c;
        WalletEngine2 walletEngine2 = this.b;
        switch (b) {
            case 0:
                walletEngine2.lambda$prepareTonConnectTransfer$4(iccVar, sendtransfer, str);
                return;
            case 1:
                walletEngine2.lambda$prepareTonConnectTransferPair$7(iccVar, sendtransfer, str);
                return;
            default:
                walletEngine2.lambda$prepareSendNFT$28(iccVar, sendtransfer, str);
                return;
        }
    }
}
