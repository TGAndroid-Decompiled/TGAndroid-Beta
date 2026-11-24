package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class i82 implements RequestDelegate {
    public final byte a;
    public final p82 b;

    public i82(p82 p82Var, byte b) {
        this.a = b;
        this.b = p82Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        p82 p82Var = this.b;
        switch (b) {
            case 0:
                gl.d3(new jn1(p82Var, tL_error, tLObject, (byte) 13));
                return;
            case 1:
                gl.d3(new k82(p82Var, (byte) 1));
                return;
            default:
                p82Var.getClass();
                gl.d3(new k82(p82Var, (byte) 4));
                return;
        }
    }
}
