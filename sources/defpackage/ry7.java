package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ry7 implements RequestDelegate {
    public final byte a;
    public final xz7 b;

    public ry7(xz7 xz7Var, byte b) {
        this.a = b;
        this.b = xz7Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        xz7 xz7Var = this.b;
        switch (b) {
            case 0:
                xz7Var.getClass();
                gm.c3(new ud7(xz7Var, tL_error, tLObject, (byte) 12));
                return;
            case 1:
                xz7Var.getClass();
                gm.c3(new bl7(xz7Var, tL_error, (byte) 24));
                return;
            case 2:
                xz7Var.getClass();
                gm.c3(new ny7(xz7Var, (byte) 5));
                return;
            default:
                gm.c3(new bl7(xz7Var, tLObject, (byte) 23));
                return;
        }
    }
}
