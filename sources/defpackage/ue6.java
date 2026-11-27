package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ue6 implements RequestDelegate {
    public final byte a;
    public final df6 b;
    public final String c;

    public ue6(df6 df6Var, String str, byte b) {
        this.a = b;
        this.b = df6Var;
        this.c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        String str = this.c;
        df6 df6Var = this.b;
        switch (b) {
            case 0:
                hl.c3(new we6(df6Var, tL_error, str, tLObject));
                return;
            default:
                hl.c3(new we6(df6Var, tL_error, tLObject, str));
                return;
        }
    }
}
