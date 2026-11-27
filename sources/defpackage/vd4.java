package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vd4 implements RequestDelegate {
    public final byte a;
    public final je4 b;

    public vd4(je4 je4Var, byte b) {
        this.a = b;
        this.b = je4Var;
    }

    @Override
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        byte b = this.a;
        final je4 je4Var = this.b;
        switch (b) {
            case 0:
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        TLRPC.TL_error tL_error2 = tL_error;
                        je4 je4Var2 = je4Var;
                        switch (b2) {
                            case 0:
                                je4Var2.F = 0;
                                if (tL_error2 == null) {
                                    bs2.v(null, 2131750707, d31.b0(je4Var2), 2131623990, 36);
                                    return;
                                }
                                return;
                            default:
                                je4Var2.f0(tL_error2);
                                return;
                        }
                    }
                });
                return;
            default:
                je4Var.getClass();
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        TLRPC.TL_error tL_error2 = tL_error;
                        je4 je4Var2 = je4Var;
                        switch (b2) {
                            case 0:
                                je4Var2.F = 0;
                                if (tL_error2 == null) {
                                    bs2.v(null, 2131750707, d31.b0(je4Var2), 2131623990, 36);
                                    return;
                                }
                                return;
                            default:
                                je4Var2.f0(tL_error2);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
