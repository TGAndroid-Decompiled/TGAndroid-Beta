package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xqa implements RequestDelegate {
    public final byte a;
    public final wsa b;

    public xqa(wsa wsaVar, byte b) {
        this.a = b;
        this.b = wsaVar;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        byte b = this.a;
        final wsa wsaVar = this.b;
        switch (b) {
            case 0:
                wsaVar.getClass();
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r4;
                        TLRPC.TL_error tL_error2 = tL_error;
                        TLObject tLObject2 = tLObject;
                        wsa wsaVar2 = wsaVar;
                        switch (b2) {
                            case 0:
                                npa npaVar = wsaVar2.s3;
                                wsaVar2.p3 = false;
                                if (tLObject2 instanceof TLRPC.PaymentForm) {
                                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject2;
                                    oc7.r1(wsaVar2.a).d4(paymentForm.users, false);
                                    wsaVar2.q3 = paymentForm;
                                    gm.r(npaVar);
                                    gm.c3(npaVar);
                                    return;
                                }
                                u31 Z = wsaVar2.j().Z(tL_error2);
                                Z.u = true;
                                Z.j();
                                return;
                            default:
                                wsaVar2.p3 = false;
                                if (tLObject2 instanceof TLRPC.PaymentForm) {
                                    TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject2;
                                    oc7.r1(wsaVar2.a).d4(paymentForm2.users, false);
                                    wsaVar2.q3 = paymentForm2;
                                    wsaVar2.e2();
                                    return;
                                }
                                u31 Z2 = wsaVar2.j().Z(tL_error2);
                                Z2.u = true;
                                Z2.j();
                                return;
                        }
                    }
                });
                return;
            default:
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r4;
                        TLRPC.TL_error tL_error2 = tL_error;
                        TLObject tLObject2 = tLObject;
                        wsa wsaVar2 = wsaVar;
                        switch (b2) {
                            case 0:
                                npa npaVar = wsaVar2.s3;
                                wsaVar2.p3 = false;
                                if (tLObject2 instanceof TLRPC.PaymentForm) {
                                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject2;
                                    oc7.r1(wsaVar2.a).d4(paymentForm.users, false);
                                    wsaVar2.q3 = paymentForm;
                                    gm.r(npaVar);
                                    gm.c3(npaVar);
                                    return;
                                }
                                u31 Z = wsaVar2.j().Z(tL_error2);
                                Z.u = true;
                                Z.j();
                                return;
                            default:
                                wsaVar2.p3 = false;
                                if (tLObject2 instanceof TLRPC.PaymentForm) {
                                    TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject2;
                                    oc7.r1(wsaVar2.a).d4(paymentForm2.users, false);
                                    wsaVar2.q3 = paymentForm2;
                                    wsaVar2.e2();
                                    return;
                                }
                                u31 Z2 = wsaVar2.j().Z(tL_error2);
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
