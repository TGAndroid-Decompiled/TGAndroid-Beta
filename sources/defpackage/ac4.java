package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ac4 implements RequestDelegate {
    public final byte a;
    public final mc4 b;

    public ac4(mc4 mc4Var, byte b) {
        this.a = b;
        this.b = mc4Var;
    }

    @Override
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        byte b = this.a;
        final mc4 mc4Var = this.b;
        switch (b) {
            case 0:
                mc4Var.getClass();
                gl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        TLRPC.TL_error tL_error2 = tL_error;
                        mc4 mc4Var2 = mc4Var;
                        switch (b2) {
                            case 0:
                                mc4Var2.F = 0;
                                if (tL_error2 == null) {
                                    ir2.v(null, 2131750730, u21.b0(mc4Var2), 2131623990, 36);
                                    return;
                                }
                                return;
                            default:
                                mc4Var2.f0(tL_error2);
                                return;
                        }
                    }
                });
                return;
            default:
                gl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        TLRPC.TL_error tL_error2 = tL_error;
                        mc4 mc4Var2 = mc4Var;
                        switch (b2) {
                            case 0:
                                mc4Var2.F = 0;
                                if (tL_error2 == null) {
                                    ir2.v(null, 2131750730, u21.b0(mc4Var2), 2131623990, 36);
                                    return;
                                }
                                return;
                            default:
                                mc4Var2.f0(tL_error2);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
