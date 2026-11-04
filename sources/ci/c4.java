package ci;

import org.telegram.messenger.hp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c4 implements RequestDelegate {
    public final int f4911a;
    public final l6 f4912b;

    public c4(l6 l6Var, int i3) {
        this.f4911a = i3;
        this.f4912b = l6Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f4911a) {
            case 0:
                final l6 l6Var = this.f4912b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                l6 l6Var2 = l6Var;
                                s1 s1Var = l6Var2.f5471n3;
                                l6Var2.f5465k3 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.PaymentForm) {
                                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject2;
                                    hp.s1(l6Var2.f28583a).Y3(paymentForm.users, false);
                                    l6Var2.f5467l3 = paymentForm;
                                    org.telegram.messenger.g0.r(s1Var);
                                    org.telegram.messenger.g0.h3(s1Var);
                                    return;
                                }
                                org.telegram.ui.Components.ac Y = l6Var2.k().Y(tL_error);
                                Y.f31802t = true;
                                Y.j();
                                return;
                            default:
                                l6 l6Var3 = l6Var;
                                l6Var3.f5465k3 = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.PaymentForm) {
                                    TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject3;
                                    hp.s1(l6Var3.f28583a).Y3(paymentForm2.users, false);
                                    l6Var3.f5467l3 = paymentForm2;
                                    l6Var3.a2();
                                    return;
                                }
                                org.telegram.ui.Components.ac Y2 = l6Var3.k().Y(tL_error);
                                Y2.f31802t = true;
                                Y2.j();
                                return;
                        }
                    }
                });
                return;
            default:
                final l6 l6Var2 = this.f4912b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                l6 l6Var22 = l6Var2;
                                s1 s1Var = l6Var22.f5471n3;
                                l6Var22.f5465k3 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.PaymentForm) {
                                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject2;
                                    hp.s1(l6Var22.f28583a).Y3(paymentForm.users, false);
                                    l6Var22.f5467l3 = paymentForm;
                                    org.telegram.messenger.g0.r(s1Var);
                                    org.telegram.messenger.g0.h3(s1Var);
                                    return;
                                }
                                org.telegram.ui.Components.ac Y = l6Var22.k().Y(tL_error);
                                Y.f31802t = true;
                                Y.j();
                                return;
                            default:
                                l6 l6Var3 = l6Var2;
                                l6Var3.f5465k3 = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.PaymentForm) {
                                    TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject3;
                                    hp.s1(l6Var3.f28583a).Y3(paymentForm2.users, false);
                                    l6Var3.f5467l3 = paymentForm2;
                                    l6Var3.a2();
                                    return;
                                }
                                org.telegram.ui.Components.ac Y2 = l6Var3.k().Y(tL_error);
                                Y2.f31802t = true;
                                Y2.j();
                                return;
                        }
                    }
                });
                return;
        }
    }
}
