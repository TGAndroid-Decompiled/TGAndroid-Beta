package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class uc4 implements RequestDelegate {
    public final byte a;
    public final pd4 b;

    public uc4(pd4 pd4Var, byte b) {
        this.a = b;
        this.b = pd4Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        pd4 pd4Var = this.b;
        switch (b) {
            case 0:
                gl.d3(new vc4(pd4Var, tLObject, (byte) 1));
                return;
            default:
                pd4Var.getClass();
                gl.d3(new mg3(pd4Var, tL_error, tLObject, (byte) 26));
                return;
        }
    }
}
