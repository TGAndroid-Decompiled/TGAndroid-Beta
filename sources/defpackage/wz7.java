package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wz7 implements RequestDelegate {
    public final byte a;
    public final b18 b;

    public wz7(b18 b18Var, byte b) {
        this.a = b;
        this.b = b18Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        b18 b18Var = this.b;
        switch (b) {
            case 0:
                b18Var.getClass();
                hl.c3(new fd7(b18Var, tL_error, tLObject, (byte) 17));
                return;
            case 1:
                b18Var.getClass();
                hl.c3(new pl7(b18Var, tL_error, (byte) 21));
                return;
            case 2:
                b18Var.getClass();
                hl.c3(new sz7(b18Var, (byte) 5));
                return;
            default:
                hl.c3(new pl7(b18Var, tLObject, (byte) 20));
                return;
        }
    }
}
