package defpackage;

import org.telegram.ui.Wallet.c;
public final class g25 implements Runnable {
    public final byte a;
    public final icc b;

    public g25(c cVar, icc iccVar) {
        this.a = (byte) 0;
        this.b = iccVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        icc iccVar = this.b;
        switch (b) {
            case 0:
                c.m("getSecretPhrase: password request closed without a result");
                iccVar.a(null, "WALLET_SEND_CANCELLED");
                return;
            case 1:
                iccVar.a(null, "CANCELLED");
                return;
            case 2:
                iccVar.a(null, "EMPTY");
                return;
            case 3:
                iccVar.a(Boolean.FALSE, null);
                return;
            case 4:
                iccVar.a(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 5:
                iccVar.a(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            case 6:
                cc4.b("StarsController.buy onCanceled");
                hl.c3(new g25(iccVar, (byte) 3));
                return;
            case 7:
                iccVar.a(null, Boolean.FALSE);
                return;
            case 8:
                iccVar.a(null, "Wallet engine is closed");
                return;
            case 9:
                iccVar.a(null, "NO_WALLET_ENGINE");
                return;
            case 10:
                iccVar.a(null, "NO_WALLET_ENGINE");
                return;
            case 11:
                iccVar.a(null, "Recovery phrase is required");
                return;
            case 12:
                iccVar.a(null, "Transaction hash is required");
                return;
            case 13:
                iccVar.a(null, "NO_WALLET_ENGINE");
                return;
            case 14:
                iccVar.a(null, "NO_WALLET_ENGINE");
                return;
            default:
                iccVar.a(null, "NO_WALLET_ENGINE");
                return;
        }
    }

    public g25(icc iccVar, byte b) {
        this.a = b;
        this.b = iccVar;
    }
}
