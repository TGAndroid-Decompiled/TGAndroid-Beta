package kg;

import org.telegram.messenger.f3;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kc;
public final class y0 implements RequestDelegate {
    public final int f18630a;
    public final c1 f18631b;

    public y0(c1 c1Var, int i7) {
        this.f18630a = i7;
        this.f18631b = c1Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f18630a) {
            case 0:
                final c1 c1Var = this.f18631b;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        c1 c1Var2 = c1Var;
                        switch (i7) {
                            case 0:
                                c1Var2.f18367b.b(false);
                                if (tL_error2 != null) {
                                    kc.e0(tL_error2);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                    f3.o(null, 2131743632, kc.b0(c1Var2), null);
                                    return;
                                } else {
                                    c1Var2.finishFragment();
                                    return;
                                }
                            default:
                                if (tL_error2 != null) {
                                    c1Var2.f18367b.b(false);
                                    kc.e0(tL_error2);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                    c1Var2.f18367b.b(false);
                                    f3.o(null, 2131743632, kc.b0(c1Var2), null);
                                    return;
                                } else {
                                    c1Var2.finishFragment();
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                final c1 c1Var2 = this.f18631b;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        c1 c1Var22 = c1Var2;
                        switch (i7) {
                            case 0:
                                c1Var22.f18367b.b(false);
                                if (tL_error2 != null) {
                                    kc.e0(tL_error2);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                    f3.o(null, 2131743632, kc.b0(c1Var22), null);
                                    return;
                                } else {
                                    c1Var22.finishFragment();
                                    return;
                                }
                            default:
                                if (tL_error2 != null) {
                                    c1Var22.f18367b.b(false);
                                    kc.e0(tL_error2);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                    c1Var22.f18367b.b(false);
                                    f3.o(null, 2131743632, kc.b0(c1Var22), null);
                                    return;
                                } else {
                                    c1Var22.finishFragment();
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
