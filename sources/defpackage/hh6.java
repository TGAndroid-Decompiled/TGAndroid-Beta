package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hh6 implements RequestDelegate {
    public final byte a;
    public final yh6 b;

    public hh6(yh6 yh6Var, byte b) {
        this.a = b;
        this.b = yh6Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        yh6 yh6Var = this.b;
        switch (b) {
            case 0:
                gl.c3(new mh6(yh6Var, tL_error, tLObject, (byte) 0));
                return;
            default:
                gl.c3(new kz5(yh6Var, tL_error, (byte) 29));
                return;
        }
    }
}
