package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class iw0 implements RequestDelegate {
    public final byte a;
    public final jw0 b;

    public iw0(jw0 jw0Var, byte b) {
        this.a = b;
        this.b = jw0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        jw0 jw0Var = this.b;
        switch (b) {
            case 0:
                ow0 ow0Var = jw0Var.d;
                if (tLObject instanceof TLRPC.TL_updates) {
                    na7.q1(ow0Var.I).Q3((TLRPC.TL_updates) tLObject, false);
                }
                gl.d3(new lv0(ow0Var, (byte) 16));
                return;
            default:
                gl.d3(new fv0(jw0Var, tLObject, tL_error, (byte) 1));
                return;
        }
    }
}
