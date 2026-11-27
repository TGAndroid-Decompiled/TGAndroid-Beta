package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hf6 implements RequestDelegate {
    public final byte a;
    public final if6 b;
    public final String c;
    public final String d;

    public hf6(if6 if6Var, String str, String str2, byte b) {
        this.a = b;
        this.b = if6Var;
        this.c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                hl.c3(new ef6(this.b, tL_error, this.c, this.d, tLObject));
                return;
            default:
                hl.c3(new ef6(this.b, tL_error, tLObject, this.c, this.d));
                return;
        }
    }
}
