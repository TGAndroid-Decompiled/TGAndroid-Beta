package defpackage;

import org.telegram.tgnet.TLRPC;
public final class fwa implements Runnable {
    public final byte a;
    public final jxa b;
    public final TLRPC.TL_payments_paymentResult c;

    public fwa(jxa jxaVar, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, byte b) {
        this.a = b;
        this.b = jxaVar;
        this.c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.TL_payments_paymentResult tL_payments_paymentResult = this.c;
        jxa jxaVar = this.b;
        switch (b) {
            case 0:
                uc7.s1(jxaVar.a).Y3(tL_payments_paymentResult.updates, false);
                return;
            case 1:
                uc7.s1(jxaVar.a).Y3(tL_payments_paymentResult.updates, false);
                return;
            case 2:
                uc7.s1(jxaVar.a).Y3(tL_payments_paymentResult.updates, false);
                return;
            case 3:
                uc7.s1(jxaVar.a).Y3(tL_payments_paymentResult.updates, false);
                return;
            default:
                uc7.s1(jxaVar.a).Y3(tL_payments_paymentResult.updates, false);
                return;
        }
    }
}
