package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yi1 implements RequestDelegate {
    public final byte a;
    public final fj1 b;

    public yi1(fj1 fj1Var, byte b) {
        this.a = b;
        this.b = fj1Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        fj1 fj1Var = this.b;
        switch (b) {
            case 0:
                gm.c3(new y31(fj1Var, tLObject, (byte) 28));
                return;
            case 1:
                gm.c3(new y31(fj1Var, tL_error, (byte) 26));
                return;
            case 2:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    gm.c3(new wi1(fj1Var, (byte) 3));
                    return;
                }
                return;
            default:
                gm.c3(new tv0(fj1Var, tL_error, tLObject, (byte) 20));
                return;
        }
    }
}
