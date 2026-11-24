package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n67 implements RequestDelegate {
    public final byte a;
    public final t67 b;

    public n67(t67 t67Var, byte b) {
        this.a = b;
        this.b = t67Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        byte b = this.a;
        final t67 t67Var = this.b;
        switch (b) {
            case 0:
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        t67 t67Var2 = t67Var;
                        switch (b2) {
                            case 0:
                                t67Var2.g0(tLObject2, tL_error2);
                                return;
                            case 1:
                                t67Var2.e0(tLObject2, tL_error2);
                                return;
                            default:
                                t67Var2.f0(tLObject2, tL_error2);
                                return;
                        }
                    }
                });
                return;
            case 1:
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        t67 t67Var2 = t67Var;
                        switch (b2) {
                            case 0:
                                t67Var2.g0(tLObject2, tL_error2);
                                return;
                            case 1:
                                t67Var2.e0(tLObject2, tL_error2);
                                return;
                            default:
                                t67Var2.f0(tLObject2, tL_error2);
                                return;
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
                        t67 t67Var2 = t67Var;
                        switch (b2) {
                            case 0:
                                t67Var2.g0(tLObject2, tL_error2);
                                return;
                            case 1:
                                t67Var2.e0(tLObject2, tL_error2);
                                return;
                            default:
                                t67Var2.f0(tLObject2, tL_error2);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
