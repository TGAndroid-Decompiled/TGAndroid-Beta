package kg;

import org.telegram.messenger.k5;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cc;
public final class w0 implements RequestDelegate {
    public final int f18131a;
    public final a1 f18132b;

    public w0(a1 a1Var, int i7) {
        this.f18131a = i7;
        this.f18132b = a1Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f18131a) {
            case 0:
                final a1 a1Var = this.f18132b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        a1 a1Var2 = a1Var;
                        switch (i7) {
                            case 0:
                                a1Var2.f17861b.b(false);
                                if (tL_error2 != null) {
                                    cc.d0(tL_error2);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                    k5.o(null, 2131743879, cc.a0(a1Var2), null);
                                    return;
                                } else {
                                    a1Var2.finishFragment();
                                    return;
                                }
                            default:
                                if (tL_error2 != null) {
                                    a1Var2.f17861b.b(false);
                                    cc.d0(tL_error2);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                    a1Var2.f17861b.b(false);
                                    k5.o(null, 2131743879, cc.a0(a1Var2), null);
                                    return;
                                } else {
                                    a1Var2.finishFragment();
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                final a1 a1Var2 = this.f18132b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        a1 a1Var22 = a1Var2;
                        switch (i7) {
                            case 0:
                                a1Var22.f17861b.b(false);
                                if (tL_error2 != null) {
                                    cc.d0(tL_error2);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                    k5.o(null, 2131743879, cc.a0(a1Var22), null);
                                    return;
                                } else {
                                    a1Var22.finishFragment();
                                    return;
                                }
                            default:
                                if (tL_error2 != null) {
                                    a1Var22.f17861b.b(false);
                                    cc.d0(tL_error2);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                    a1Var22.f17861b.b(false);
                                    k5.o(null, 2131743879, cc.a0(a1Var22), null);
                                    return;
                                } else {
                                    a1Var22.finishFragment();
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
