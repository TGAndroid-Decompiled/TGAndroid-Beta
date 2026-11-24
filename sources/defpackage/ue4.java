package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ue4 implements RequestDelegate {
    public final byte a;
    public final qf4 b;

    public ue4(qf4 qf4Var, byte b) {
        this.a = b;
        this.b = qf4Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        qf4 qf4Var = this.b;
        switch (b) {
            case 0:
                gm.c3(new ve4(qf4Var, tLObject, (byte) 2));
                return;
            default:
                qf4Var.getClass();
                gm.c3(new pz2(qf4Var, tL_error, tLObject, (byte) 28));
                return;
        }
    }
}
