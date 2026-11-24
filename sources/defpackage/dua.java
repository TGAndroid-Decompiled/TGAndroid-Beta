package defpackage;

import org.telegram.tgnet.TLRPC;
public final class dua implements Runnable {
    public final byte a;
    public final jva b;
    public final TLRPC.TL_payments_paymentResult c;

    public dua(jva jvaVar, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, byte b) {
        this.a = b;
        this.b = jvaVar;
        this.c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.TL_payments_paymentResult tL_payments_paymentResult = this.c;
        jva jvaVar = this.b;
        switch (b) {
            case 0:
                oc7.r1(jvaVar.a).T3(tL_payments_paymentResult.updates, false);
                return;
            case 1:
                oc7.r1(jvaVar.a).T3(tL_payments_paymentResult.updates, false);
                return;
            case 2:
                oc7.r1(jvaVar.a).T3(tL_payments_paymentResult.updates, false);
                return;
            case 3:
                oc7.r1(jvaVar.a).T3(tL_payments_paymentResult.updates, false);
                return;
            default:
                oc7.r1(jvaVar.a).T3(tL_payments_paymentResult.updates, false);
                return;
        }
    }
}
