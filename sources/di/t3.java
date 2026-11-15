package di;

import org.telegram.messenger.np;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t3 implements RequestDelegate {
    public final int f9464a;
    public final c6 f9465b;

    public t3(c6 c6Var, int i7) {
        this.f9464a = i7;
        this.f9465b = c6Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f9464a) {
            case 0:
                final c6 c6Var = this.f9465b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                c6 c6Var2 = c6Var;
                                l1 l1Var = c6Var2.f8338q3;
                                c6Var2.f8332n3 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.PaymentForm) {
                                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject2;
                                    np.s1(c6Var2.f29679a).Y3(paymentForm.users, false);
                                    c6Var2.f8334o3 = paymentForm;
                                    org.telegram.messenger.g0.r(l1Var);
                                    org.telegram.messenger.g0.h3(l1Var);
                                    return;
                                }
                                org.telegram.ui.Components.xb Y = c6Var2.k().Y(tL_error);
                                Y.f41653t = true;
                                Y.j();
                                return;
                            default:
                                c6 c6Var3 = c6Var;
                                c6Var3.f8332n3 = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.PaymentForm) {
                                    TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject3;
                                    np.s1(c6Var3.f29679a).Y3(paymentForm2.users, false);
                                    c6Var3.f8334o3 = paymentForm2;
                                    c6Var3.b2();
                                    return;
                                }
                                org.telegram.ui.Components.xb Y2 = c6Var3.k().Y(tL_error);
                                Y2.f41653t = true;
                                Y2.j();
                                return;
                        }
                    }
                });
                return;
            default:
                final c6 c6Var2 = this.f9465b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                c6 c6Var22 = c6Var2;
                                l1 l1Var = c6Var22.f8338q3;
                                c6Var22.f8332n3 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.PaymentForm) {
                                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject2;
                                    np.s1(c6Var22.f29679a).Y3(paymentForm.users, false);
                                    c6Var22.f8334o3 = paymentForm;
                                    org.telegram.messenger.g0.r(l1Var);
                                    org.telegram.messenger.g0.h3(l1Var);
                                    return;
                                }
                                org.telegram.ui.Components.xb Y = c6Var22.k().Y(tL_error);
                                Y.f41653t = true;
                                Y.j();
                                return;
                            default:
                                c6 c6Var3 = c6Var2;
                                c6Var3.f8332n3 = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.PaymentForm) {
                                    TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject3;
                                    np.s1(c6Var3.f29679a).Y3(paymentForm2.users, false);
                                    c6Var3.f8334o3 = paymentForm2;
                                    c6Var3.b2();
                                    return;
                                }
                                org.telegram.ui.Components.xb Y2 = c6Var3.k().Y(tL_error);
                                Y2.f41653t = true;
                                Y2.j();
                                return;
                        }
                    }
                });
                return;
        }
    }
}
