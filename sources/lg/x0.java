package lg;

import org.telegram.messenger.k5;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fc;
public final class x0 implements RequestDelegate {
    public final int f18506a;
    public final b1 f18507b;

    public x0(b1 b1Var, int i3) {
        this.f18506a = i3;
        this.f18507b = b1Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f18506a) {
            case 0:
                final b1 b1Var = this.f18507b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i3 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        b1 b1Var2 = b1Var;
                        switch (i3) {
                            case 0:
                                b1Var2.f18239b.b(false);
                                if (tL_error2 != null) {
                                    fc.d0(tL_error2);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                    k5.p(null, 2131743889, fc.a0(b1Var2), null);
                                    return;
                                } else {
                                    b1Var2.finishFragment();
                                    return;
                                }
                            default:
                                if (tL_error2 != null) {
                                    b1Var2.f18239b.b(false);
                                    fc.d0(tL_error2);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                    b1Var2.f18239b.b(false);
                                    k5.p(null, 2131743889, fc.a0(b1Var2), null);
                                    return;
                                } else {
                                    b1Var2.finishFragment();
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                final b1 b1Var2 = this.f18507b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i3 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        b1 b1Var22 = b1Var2;
                        switch (i3) {
                            case 0:
                                b1Var22.f18239b.b(false);
                                if (tL_error2 != null) {
                                    fc.d0(tL_error2);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                    k5.p(null, 2131743889, fc.a0(b1Var22), null);
                                    return;
                                } else {
                                    b1Var22.finishFragment();
                                    return;
                                }
                            default:
                                if (tL_error2 != null) {
                                    b1Var22.f18239b.b(false);
                                    fc.d0(tL_error2);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                    b1Var22.f18239b.b(false);
                                    k5.p(null, 2131743889, fc.a0(b1Var22), null);
                                    return;
                                } else {
                                    b1Var22.finishFragment();
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
