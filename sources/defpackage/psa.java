package defpackage;

import org.telegram.tgnet.TLRPC;
public final class psa implements Runnable {
    public final byte a;
    public final wua b;
    public final TLRPC.TL_payments_paymentResult c;

    public psa(wua wuaVar, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, byte b) {
        this.a = b;
        this.b = wuaVar;
        this.c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.TL_payments_paymentResult tL_payments_paymentResult = this.c;
        wua wuaVar = this.b;
        switch (b) {
            case 0:
                uc7.s1(wuaVar.a).Y3(tL_payments_paymentResult.updates, false);
                return;
            default:
                uc7.s1(wuaVar.a).Y3(tL_payments_paymentResult.updates, false);
                return;
        }
    }
}
