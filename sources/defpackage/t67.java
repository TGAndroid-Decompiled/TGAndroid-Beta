package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t67 implements RequestDelegate {
    public final byte a;
    public final z67 b;

    public t67(z67 z67Var, byte b) {
        this.a = b;
        this.b = z67Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        byte b = this.a;
        final z67 z67Var = this.b;
        switch (b) {
            case 0:
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        z67 z67Var2 = z67Var;
                        switch (b2) {
                            case 0:
                                z67Var2.f0(tLObject2, tL_error2);
                                return;
                            case 1:
                                z67Var2.d0(tLObject2, tL_error2);
                                return;
                            default:
                                z67Var2.e0(tLObject2, tL_error2);
                                return;
                        }
                    }
                });
                return;
            case 1:
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        z67 z67Var2 = z67Var;
                        switch (b2) {
                            case 0:
                                z67Var2.f0(tLObject2, tL_error2);
                                return;
                            case 1:
                                z67Var2.d0(tLObject2, tL_error2);
                                return;
                            default:
                                z67Var2.e0(tLObject2, tL_error2);
                                return;
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
                        z67 z67Var2 = z67Var;
                        switch (b2) {
                            case 0:
                                z67Var2.f0(tLObject2, tL_error2);
                                return;
                            case 1:
                                z67Var2.d0(tLObject2, tL_error2);
                                return;
                            default:
                                z67Var2.e0(tLObject2, tL_error2);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
