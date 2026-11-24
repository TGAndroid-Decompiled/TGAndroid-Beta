package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ae4 implements RequestDelegate {
    public final byte a;
    public final me4 b;

    public ae4(me4 me4Var, byte b) {
        this.a = b;
        this.b = me4Var;
    }

    @Override
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        byte b = this.a;
        final me4 me4Var = this.b;
        switch (b) {
            case 0:
                me4Var.getClass();
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        TLRPC.TL_error tL_error2 = tL_error;
                        me4 me4Var2 = me4Var;
                        switch (b2) {
                            case 0:
                                me4Var2.F = 0;
                                if (tL_error2 == null) {
                                    ts2.u(null, 2131750679, c41.b0(me4Var2), 2131623990, 36);
                                    return;
                                }
                                return;
                            default:
                                me4Var2.g0(tL_error2);
                                return;
                        }
                    }
                });
                return;
            default:
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        TLRPC.TL_error tL_error2 = tL_error;
                        me4 me4Var2 = me4Var;
                        switch (b2) {
                            case 0:
                                me4Var2.F = 0;
                                if (tL_error2 == null) {
                                    ts2.u(null, 2131750679, c41.b0(me4Var2), 2131623990, 36);
                                    return;
                                }
                                return;
                            default:
                                me4Var2.g0(tL_error2);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
