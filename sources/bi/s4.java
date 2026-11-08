package bi;

import org.telegram.messenger.qp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s4 implements RequestDelegate {
    public final int f4669a;
    public final k7 f4670b;

    public s4(k7 k7Var, int i7) {
        this.f4669a = i7;
        this.f4670b = k7Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f4669a) {
            case 0:
                final k7 k7Var = this.f4670b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                k7 k7Var2 = k7Var;
                                z1 z1Var = k7Var2.f4187m3;
                                k7Var2.j3 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.PaymentForm) {
                                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject2;
                                    qp.s1(k7Var2.f28616a).Y3(paymentForm.users, false);
                                    k7Var2.f4183k3 = paymentForm;
                                    org.telegram.messenger.g0.r(z1Var);
                                    org.telegram.messenger.g0.h3(z1Var);
                                    return;
                                }
                                org.telegram.ui.Components.cc Y = k7Var2.k().Y(tL_error);
                                Y.f32555t = true;
                                Y.j();
                                return;
                            default:
                                k7 k7Var3 = k7Var;
                                k7Var3.j3 = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.PaymentForm) {
                                    TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject3;
                                    qp.s1(k7Var3.f28616a).Y3(paymentForm2.users, false);
                                    k7Var3.f4183k3 = paymentForm2;
                                    k7Var3.a2();
                                    return;
                                }
                                org.telegram.ui.Components.cc Y2 = k7Var3.k().Y(tL_error);
                                Y2.f32555t = true;
                                Y2.j();
                                return;
                        }
                    }
                });
                return;
            default:
                final k7 k7Var2 = this.f4670b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                k7 k7Var22 = k7Var2;
                                z1 z1Var = k7Var22.f4187m3;
                                k7Var22.j3 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.PaymentForm) {
                                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject2;
                                    qp.s1(k7Var22.f28616a).Y3(paymentForm.users, false);
                                    k7Var22.f4183k3 = paymentForm;
                                    org.telegram.messenger.g0.r(z1Var);
                                    org.telegram.messenger.g0.h3(z1Var);
                                    return;
                                }
                                org.telegram.ui.Components.cc Y = k7Var22.k().Y(tL_error);
                                Y.f32555t = true;
                                Y.j();
                                return;
                            default:
                                k7 k7Var3 = k7Var2;
                                k7Var3.j3 = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.PaymentForm) {
                                    TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject3;
                                    qp.s1(k7Var3.f28616a).Y3(paymentForm2.users, false);
                                    k7Var3.f4183k3 = paymentForm2;
                                    k7Var3.a2();
                                    return;
                                }
                                org.telegram.ui.Components.cc Y2 = k7Var3.k().Y(tL_error);
                                Y2.f32555t = true;
                                Y2.j();
                                return;
                        }
                    }
                });
                return;
        }
    }
}
