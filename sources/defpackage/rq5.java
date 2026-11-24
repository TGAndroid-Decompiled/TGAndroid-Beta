package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rq5 implements RequestDelegate {
    public final byte a;
    public final tq5 b;

    public rq5(tq5 tq5Var, byte b) {
        this.a = b;
        this.b = tq5Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        tq5 tq5Var = this.b;
        switch (b) {
            case 0:
                gl.d3(new jf4(tq5Var, tL_error, tLObject, (byte) 26));
                return;
            default:
                gl.d3(new hb5(tq5Var, tL_error, (byte) 14));
                return;
        }
    }
}
