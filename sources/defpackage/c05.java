package defpackage;

import org.telegram.ui.Wallet.c;
public final class c05 implements Runnable {
    public final byte a;
    public final i8c b;

    public c05(c cVar, i8c i8cVar) {
        this.a = (byte) 0;
        this.b = i8cVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        i8c i8cVar = this.b;
        switch (b) {
            case 0:
                c.m("getSecretPhrase: password request closed without a result");
                i8cVar.a(null, "WALLET_SEND_CANCELLED");
                return;
            case 1:
                i8cVar.a(null, "CANCELLED");
                return;
            case 2:
                i8cVar.a(null, "EMPTY");
                return;
            case 3:
                i8cVar.a(Boolean.FALSE, null);
                return;
            case 4:
                i8cVar.a(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 5:
                i8cVar.a(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            case 6:
                fa4.b("StarsController.buy onCanceled");
                gl.d3(new c05(i8cVar, (byte) 3));
                return;
            case 7:
                i8cVar.a(null, Boolean.FALSE);
                return;
            case 8:
                i8cVar.a(null, "Wallet engine is closed");
                return;
            case 9:
                i8cVar.a(null, "NO_WALLET_ENGINE");
                return;
            case 10:
                i8cVar.a(null, "NO_WALLET_ENGINE");
                return;
            case 11:
                i8cVar.a(null, "Recovery phrase is required");
                return;
            case 12:
                i8cVar.a(null, "Transaction hash is required");
                return;
            case 13:
                i8cVar.a(null, "NO_WALLET_ENGINE");
                return;
            case 14:
                i8cVar.a(null, "NO_WALLET_ENGINE");
                return;
            default:
                i8cVar.a(null, "NO_WALLET_ENGINE");
                return;
        }
    }

    public c05(i8c i8cVar, byte b) {
        this.a = b;
        this.b = i8cVar;
    }
}
