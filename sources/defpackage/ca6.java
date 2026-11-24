package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ca6 implements RequestDelegate {
    public final byte a;
    public final pa6 b;

    public ca6(pa6 pa6Var, byte b) {
        this.a = b;
        this.b = pa6Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        byte b = this.a;
        final pa6 pa6Var = this.b;
        switch (b) {
            case 0:
                pa6Var.getClass();
                gl.d3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        pa6 pa6Var2 = pa6Var;
                        switch (b2) {
                            case 0:
                                pa6Var2.b.b(false);
                                if (tL_error2 != null) {
                                    u21.e0(tL_error2);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                    yjb.x(null, 2131743640, u21.b0(pa6Var2), null);
                                    return;
                                } else {
                                    pa6Var2.finishFragment();
                                    return;
                                }
                            default:
                                if (tL_error2 != null) {
                                    pa6Var2.b.b(false);
                                    u21.e0(tL_error2);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                    pa6Var2.b.b(false);
                                    yjb.x(null, 2131743640, u21.b0(pa6Var2), null);
                                    return;
                                } else {
                                    pa6Var2.finishFragment();
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                gl.d3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        pa6 pa6Var2 = pa6Var;
                        switch (b2) {
                            case 0:
                                pa6Var2.b.b(false);
                                if (tL_error2 != null) {
                                    u21.e0(tL_error2);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                    yjb.x(null, 2131743640, u21.b0(pa6Var2), null);
                                    return;
                                } else {
                                    pa6Var2.finishFragment();
                                    return;
                                }
                            default:
                                if (tL_error2 != null) {
                                    pa6Var2.b.b(false);
                                    u21.e0(tL_error2);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                    pa6Var2.b.b(false);
                                    yjb.x(null, 2131743640, u21.b0(pa6Var2), null);
                                    return;
                                } else {
                                    pa6Var2.finishFragment();
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
