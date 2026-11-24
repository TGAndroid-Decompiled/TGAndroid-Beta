package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ow7 implements RequestDelegate {
    public final byte a;
    public final vx7 b;

    public ow7(vx7 vx7Var, byte b) {
        this.a = b;
        this.b = vx7Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        vx7 vx7Var = this.b;
        switch (b) {
            case 0:
                vx7Var.getClass();
                gl.d3(new pc7(vx7Var, tL_error, tLObject, (byte) 9));
                return;
            case 1:
                vx7Var.getClass();
                gl.d3(new bj7(vx7Var, tL_error, (byte) 23));
                return;
            case 2:
                vx7Var.getClass();
                gl.d3(new kw7(vx7Var, (byte) 5));
                return;
            default:
                gl.d3(new bj7(vx7Var, tLObject, (byte) 22));
                return;
        }
    }
}
