package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gc6 implements RequestDelegate {
    public final byte a;
    public final tc6 b;

    public gc6(tc6 tc6Var, byte b) {
        this.a = b;
        this.b = tc6Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        byte b = this.a;
        final tc6 tc6Var = this.b;
        switch (b) {
            case 0:
                tc6Var.getClass();
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        tc6 tc6Var2 = tc6Var;
                        switch (b2) {
                            case 0:
                                tc6Var2.b.b(false);
                                if (tL_error2 != null) {
                                    d31.e0(tL_error2);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                    xnb.x(null, 2131743534, d31.b0(tc6Var2), null);
                                    return;
                                } else {
                                    tc6Var2.finishFragment();
                                    return;
                                }
                            default:
                                if (tL_error2 != null) {
                                    tc6Var2.b.b(false);
                                    d31.e0(tL_error2);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                    tc6Var2.b.b(false);
                                    xnb.x(null, 2131743534, d31.b0(tc6Var2), null);
                                    return;
                                } else {
                                    tc6Var2.finishFragment();
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        tc6 tc6Var2 = tc6Var;
                        switch (b2) {
                            case 0:
                                tc6Var2.b.b(false);
                                if (tL_error2 != null) {
                                    d31.e0(tL_error2);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                    xnb.x(null, 2131743534, d31.b0(tc6Var2), null);
                                    return;
                                } else {
                                    tc6Var2.finishFragment();
                                    return;
                                }
                            default:
                                if (tL_error2 != null) {
                                    tc6Var2.b.b(false);
                                    d31.e0(tL_error2);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                    tc6Var2.b.b(false);
                                    xnb.x(null, 2131743534, d31.b0(tc6Var2), null);
                                    return;
                                } else {
                                    tc6Var2.finishFragment();
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
