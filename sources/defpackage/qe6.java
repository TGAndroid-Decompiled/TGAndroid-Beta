package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qe6 implements RequestDelegate {
    public final byte a;
    public final ze6 b;
    public final String c;

    public qe6(ze6 ze6Var, String str, byte b) {
        this.a = b;
        this.b = ze6Var;
        this.c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        String str = this.c;
        ze6 ze6Var = this.b;
        switch (b) {
            case 0:
                gm.c3(new se6(ze6Var, tL_error, str, tLObject));
                return;
            default:
                gm.c3(new se6(ze6Var, tL_error, tLObject, str));
                return;
        }
    }
}
