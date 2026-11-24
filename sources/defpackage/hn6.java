package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hn6 implements RequestDelegate {
    public final byte a;
    public final boolean b;
    public final long c;
    public final pf0 d;

    public hn6(pf0 pf0Var, boolean z, long j, byte b) {
        this.a = b;
        this.d = pf0Var;
        this.b = z;
        this.c = j;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        pf0 pf0Var = this.d;
        switch (b) {
            case 0:
                gl.c3(new b61((hq6) pf0Var, tLObject, this.b, this.c, (byte) 4));
                return;
            default:
                gl.c3(new b61((na7) pf0Var, tLObject, this.b, this.c, (byte) 6));
                return;
        }
    }
}
