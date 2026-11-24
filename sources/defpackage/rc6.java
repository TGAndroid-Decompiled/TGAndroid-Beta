package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rc6 implements RequestDelegate {
    public final byte a;
    public final ad6 b;
    public final String c;

    public rc6(ad6 ad6Var, String str, byte b) {
        this.a = b;
        this.b = ad6Var;
        this.c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        String str = this.c;
        ad6 ad6Var = this.b;
        switch (b) {
            case 0:
                gl.c3(new tc6(ad6Var, tL_error, str, tLObject));
                return;
            default:
                gl.c3(new tc6(ad6Var, tL_error, tLObject, str));
                return;
        }
    }
}
