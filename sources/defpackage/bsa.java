package defpackage;

import org.telegram.tgnet.TLRPC;
public final class bsa implements Runnable {
    public final byte a;
    public final gta b;
    public final TLRPC.TL_payments_paymentResult c;

    public bsa(gta gtaVar, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, byte b) {
        this.a = b;
        this.b = gtaVar;
        this.c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.TL_payments_paymentResult tL_payments_paymentResult = this.c;
        gta gtaVar = this.b;
        switch (b) {
            case 0:
                na7.q1(gtaVar.a).R3(tL_payments_paymentResult.updates, false);
                return;
            case 1:
                na7.q1(gtaVar.a).R3(tL_payments_paymentResult.updates, false);
                return;
            case 2:
                na7.q1(gtaVar.a).R3(tL_payments_paymentResult.updates, false);
                return;
            case 3:
                na7.q1(gtaVar.a).R3(tL_payments_paymentResult.updates, false);
                return;
            default:
                na7.q1(gtaVar.a).R3(tL_payments_paymentResult.updates, false);
                return;
        }
    }
}
