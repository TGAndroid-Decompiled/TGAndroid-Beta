package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ip6 implements RequestDelegate {
    public final byte a;
    public final boolean b;
    public final long c;
    public final pg0 d;

    public ip6(pg0 pg0Var, boolean z, long j, byte b) {
        this.a = b;
        this.d = pg0Var;
        this.b = z;
        this.c = j;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        pg0 pg0Var = this.d;
        switch (b) {
            case 0:
                gm.c3(new i71((hs6) pg0Var, tLObject, this.b, this.c, (byte) 4));
                return;
            default:
                gm.c3(new i71((oc7) pg0Var, tLObject, this.b, this.c, (byte) 6));
                return;
        }
    }
}
