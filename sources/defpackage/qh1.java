package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qh1 implements RequestDelegate {
    public final byte a;
    public final yh1 b;

    public qh1(yh1 yh1Var, byte b) {
        this.a = b;
        this.b = yh1Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        yh1 yh1Var = this.b;
        switch (b) {
            case 0:
                gl.d3(new q21(yh1Var, tLObject, (byte) 27));
                return;
            case 1:
                gl.d3(new q21(yh1Var, tL_error, (byte) 25));
                return;
            case 2:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    gl.d3(new oh1(yh1Var, (byte) 3));
                    return;
                }
                return;
            default:
                gl.d3(new fv0(yh1Var, tL_error, tLObject, (byte) 19));
                return;
        }
    }
}
