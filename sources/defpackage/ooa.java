package defpackage;

import org.telegram.tgnet.TLRPC;
public final class ooa implements Runnable {
    public final byte a;
    public final vqa b;
    public final TLRPC.TL_payments_paymentResult c;

    public ooa(vqa vqaVar, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, byte b) {
        this.a = b;
        this.b = vqaVar;
        this.c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.TL_payments_paymentResult tL_payments_paymentResult = this.c;
        vqa vqaVar = this.b;
        switch (b) {
            case 0:
                na7.q1(vqaVar.a).Q3(tL_payments_paymentResult.updates, false);
                return;
            default:
                na7.q1(vqaVar.a).Q3(tL_payments_paymentResult.updates, false);
                return;
        }
    }
}
