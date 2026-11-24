package defpackage;

import org.telegram.tgnet.TLRPC;
public final class oqa implements Runnable {
    public final byte a;
    public final wsa b;
    public final TLRPC.TL_payments_paymentResult c;

    public oqa(wsa wsaVar, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, byte b) {
        this.a = b;
        this.b = wsaVar;
        this.c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.TL_payments_paymentResult tL_payments_paymentResult = this.c;
        wsa wsaVar = this.b;
        switch (b) {
            case 0:
                oc7.r1(wsaVar.a).T3(tL_payments_paymentResult.updates, false);
                return;
            default:
                oc7.r1(wsaVar.a).T3(tL_payments_paymentResult.updates, false);
                return;
        }
    }
}
