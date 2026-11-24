package defpackage;

import org.telegram.ui.Wallet.c;
public final class c25 implements Runnable {
    public final byte a;
    public final jac b;

    public c25(c cVar, jac jacVar) {
        this.a = (byte) 0;
        this.b = jacVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        jac jacVar = this.b;
        switch (b) {
            case 0:
                c.m("getSecretPhrase: password request closed without a result");
                jacVar.a(null, "WALLET_SEND_CANCELLED");
                return;
            case 1:
                jacVar.a(null, "CANCELLED");
                return;
            case 2:
                jacVar.a(null, "EMPTY");
                return;
            case 3:
                jacVar.a(Boolean.FALSE, null);
                return;
            case 4:
                jacVar.a(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 5:
                jacVar.a(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            case 6:
                fc4.b("StarsController.buy onCanceled");
                gm.c3(new c25(jacVar, (byte) 3));
                return;
            case 7:
                jacVar.a(null, Boolean.FALSE);
                return;
            case 8:
                jacVar.a(null, "Wallet engine is closed");
                return;
            case 9:
                jacVar.a(null, "NO_WALLET_ENGINE");
                return;
            case 10:
                jacVar.a(null, "NO_WALLET_ENGINE");
                return;
            case 11:
                jacVar.a(null, "Recovery phrase is required");
                return;
            case 12:
                jacVar.a(null, "Transaction hash is required");
                return;
            case 13:
                jacVar.a(null, "NO_WALLET_ENGINE");
                return;
            case 14:
                jacVar.a(null, "NO_WALLET_ENGINE");
                return;
            default:
                jacVar.a(null, "NO_WALLET_ENGINE");
                return;
        }
    }

    public c25(jac jacVar, byte b) {
        this.a = b;
        this.b = jacVar;
    }
}
