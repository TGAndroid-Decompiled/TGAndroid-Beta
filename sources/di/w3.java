package di;

import org.telegram.messenger.mp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w3 implements RequestDelegate {
    public final int f9981a;
    public final f6 f9982b;

    public w3(f6 f6Var, int i7) {
        this.f9981a = i7;
        this.f9982b = f6Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f9981a) {
            case 0:
                final f6 f6Var = this.f9982b;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                f6 f6Var2 = f6Var;
                                k1 k1Var = f6Var2.f8829t3;
                                f6Var2.f8823q3 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.PaymentForm) {
                                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject2;
                                    mp.u1(f6Var2.f30170a).f4(paymentForm.users, false);
                                    f6Var2.f8825r3 = paymentForm;
                                    org.telegram.messenger.g0.r(k1Var);
                                    org.telegram.messenger.g0.g3(k1Var);
                                    return;
                                }
                                org.telegram.ui.Components.gc Z = f6Var2.k().Z(tL_error);
                                Z.f35518t = true;
                                Z.j();
                                return;
                            default:
                                f6 f6Var3 = f6Var;
                                f6Var3.f8823q3 = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.PaymentForm) {
                                    TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject3;
                                    mp.u1(f6Var3.f30170a).f4(paymentForm2.users, false);
                                    f6Var3.f8825r3 = paymentForm2;
                                    f6Var3.n2();
                                    return;
                                }
                                org.telegram.ui.Components.gc Z2 = f6Var3.k().Z(tL_error);
                                Z2.f35518t = true;
                                Z2.j();
                                return;
                        }
                    }
                });
                return;
            default:
                final f6 f6Var2 = this.f9982b;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                f6 f6Var22 = f6Var2;
                                k1 k1Var = f6Var22.f8829t3;
                                f6Var22.f8823q3 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.PaymentForm) {
                                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject2;
                                    mp.u1(f6Var22.f30170a).f4(paymentForm.users, false);
                                    f6Var22.f8825r3 = paymentForm;
                                    org.telegram.messenger.g0.r(k1Var);
                                    org.telegram.messenger.g0.g3(k1Var);
                                    return;
                                }
                                org.telegram.ui.Components.gc Z = f6Var22.k().Z(tL_error);
                                Z.f35518t = true;
                                Z.j();
                                return;
                            default:
                                f6 f6Var3 = f6Var2;
                                f6Var3.f8823q3 = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.PaymentForm) {
                                    TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject3;
                                    mp.u1(f6Var3.f30170a).f4(paymentForm2.users, false);
                                    f6Var3.f8825r3 = paymentForm2;
                                    f6Var3.n2();
                                    return;
                                }
                                org.telegram.ui.Components.gc Z2 = f6Var3.k().Z(tL_error);
                                Z2.f35518t = true;
                                Z2.j();
                                return;
                        }
                    }
                });
                return;
        }
    }
}
