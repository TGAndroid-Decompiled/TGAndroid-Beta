package kg;

import org.telegram.messenger.f3;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lc;
public final class z0 implements RequestDelegate {
    public final int f18544a;
    public final d1 f18545b;

    public z0(d1 d1Var, int i7) {
        this.f18544a = i7;
        this.f18545b = d1Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f18544a) {
            case 0:
                final d1 d1Var = this.f18545b;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        d1 d1Var2 = d1Var;
                        switch (i7) {
                            case 0:
                                d1Var2.f18275b.b(false);
                                if (tL_error2 != null) {
                                    lc.e0(tL_error2);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                    f3.o(null, 2131743636, lc.b0(d1Var2), null);
                                    return;
                                } else {
                                    d1Var2.finishFragment();
                                    return;
                                }
                            default:
                                if (tL_error2 != null) {
                                    d1Var2.f18275b.b(false);
                                    lc.e0(tL_error2);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                    d1Var2.f18275b.b(false);
                                    f3.o(null, 2131743636, lc.b0(d1Var2), null);
                                    return;
                                } else {
                                    d1Var2.finishFragment();
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                final d1 d1Var2 = this.f18545b;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        d1 d1Var22 = d1Var2;
                        switch (i7) {
                            case 0:
                                d1Var22.f18275b.b(false);
                                if (tL_error2 != null) {
                                    lc.e0(tL_error2);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                    f3.o(null, 2131743636, lc.b0(d1Var22), null);
                                    return;
                                } else {
                                    d1Var22.finishFragment();
                                    return;
                                }
                            default:
                                if (tL_error2 != null) {
                                    d1Var22.f18275b.b(false);
                                    lc.e0(tL_error2);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                    d1Var22.f18275b.b(false);
                                    f3.o(null, 2131743636, lc.b0(d1Var22), null);
                                    return;
                                } else {
                                    d1Var22.finishFragment();
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
