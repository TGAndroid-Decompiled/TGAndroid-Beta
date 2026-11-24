package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o1b implements RequestDelegate {
    public final long a;
    public final vx5 b;
    public final g2b c;

    public o1b(g2b g2bVar, long j, vx5 vx5Var) {
        this.c = g2bVar;
        this.a = j;
        this.b = vx5Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        gl.c3(new mx8(this, tLObject, this.a, this.b, (byte) 11));
    }
}
