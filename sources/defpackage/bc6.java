package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bc6 implements RequestDelegate {
    public final byte a;
    public final oc6 b;

    public bc6(oc6 oc6Var, byte b) {
        this.a = b;
        this.b = oc6Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        byte b = this.a;
        final oc6 oc6Var = this.b;
        switch (b) {
            case 0:
                oc6Var.getClass();
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        oc6 oc6Var2 = oc6Var;
                        switch (b2) {
                            case 0:
                                oc6Var2.b.b(false);
                                if (tL_error2 != null) {
                                    c41.e0(tL_error2);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                    mlb.y(null, 2131743566, c41.b0(oc6Var2), null);
                                    return;
                                } else {
                                    oc6Var2.finishFragment();
                                    return;
                                }
                            default:
                                if (tL_error2 != null) {
                                    oc6Var2.b.b(false);
                                    c41.e0(tL_error2);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                    oc6Var2.b.b(false);
                                    mlb.y(null, 2131743566, c41.b0(oc6Var2), null);
                                    return;
                                } else {
                                    oc6Var2.finishFragment();
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        oc6 oc6Var2 = oc6Var;
                        switch (b2) {
                            case 0:
                                oc6Var2.b.b(false);
                                if (tL_error2 != null) {
                                    c41.e0(tL_error2);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                    mlb.y(null, 2131743566, c41.b0(oc6Var2), null);
                                    return;
                                } else {
                                    oc6Var2.finishFragment();
                                    return;
                                }
                            default:
                                if (tL_error2 != null) {
                                    oc6Var2.b.b(false);
                                    c41.e0(tL_error2);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                    oc6Var2.b.b(false);
                                    mlb.y(null, 2131743566, c41.b0(oc6Var2), null);
                                    return;
                                } else {
                                    oc6Var2.finishFragment();
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
