package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class q3b implements RequestDelegate {
    public final long a;
    public final uz5 b;
    public final h4b c;

    public q3b(h4b h4bVar, long j, uz5 uz5Var) {
        this.c = h4bVar;
        this.a = j;
        this.b = uz5Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        gm.c3(new nz8(this, tLObject, this.a, this.b, (byte) 11));
    }
}
