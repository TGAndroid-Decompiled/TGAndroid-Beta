package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xsa implements RequestDelegate {
    public final byte a;
    public final wua b;

    public xsa(wua wuaVar, byte b) {
        this.a = b;
        this.b = wuaVar;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        byte b = this.a;
        final wua wuaVar = this.b;
        switch (b) {
            case 0:
                wuaVar.getClass();
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r4;
                        TLRPC.TL_error tL_error2 = tL_error;
                        TLObject tLObject2 = tLObject;
                        wua wuaVar2 = wuaVar;
                        switch (b2) {
                            case 0:
                                jra jraVar = wuaVar2.s3;
                                wuaVar2.p3 = false;
                                if (tLObject2 instanceof TLRPC.PaymentForm) {
                                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject2;
                                    uc7.s1(wuaVar2.a).j4(paymentForm.users, false);
                                    wuaVar2.q3 = paymentForm;
                                    hl.r(jraVar);
                                    hl.c3(jraVar);
                                    return;
                                }
                                v21 Z = wuaVar2.j().Z(tL_error2);
                                Z.u = true;
                                Z.j();
                                return;
                            default:
                                wuaVar2.p3 = false;
                                if (tLObject2 instanceof TLRPC.PaymentForm) {
                                    TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject2;
                                    uc7.s1(wuaVar2.a).j4(paymentForm2.users, false);
                                    wuaVar2.q3 = paymentForm2;
                                    wuaVar2.f2();
                                    return;
                                }
                                v21 Z2 = wuaVar2.j().Z(tL_error2);
                                Z2.u = true;
                                Z2.j();
                                return;
                        }
                    }
                });
                return;
            default:
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r4;
                        TLRPC.TL_error tL_error2 = tL_error;
                        TLObject tLObject2 = tLObject;
                        wua wuaVar2 = wuaVar;
                        switch (b2) {
                            case 0:
                                jra jraVar = wuaVar2.s3;
                                wuaVar2.p3 = false;
                                if (tLObject2 instanceof TLRPC.PaymentForm) {
                                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject2;
                                    uc7.s1(wuaVar2.a).j4(paymentForm.users, false);
                                    wuaVar2.q3 = paymentForm;
                                    hl.r(jraVar);
                                    hl.c3(jraVar);
                                    return;
                                }
                                v21 Z = wuaVar2.j().Z(tL_error2);
                                Z.u = true;
                                Z.j();
                                return;
                            default:
                                wuaVar2.p3 = false;
                                if (tLObject2 instanceof TLRPC.PaymentForm) {
                                    TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject2;
                                    uc7.s1(wuaVar2.a).j4(paymentForm2.users, false);
                                    wuaVar2.q3 = paymentForm2;
                                    wuaVar2.f2();
                                    return;
                                }
                                v21 Z2 = wuaVar2.j().Z(tL_error2);
                                Z2.u = true;
                                Z2.j();
                                return;
                        }
                    }
                });
                return;
        }
    }
}
