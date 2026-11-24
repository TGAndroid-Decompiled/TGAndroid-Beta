package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class p1b implements RequestDelegate {
    public final long a;
    public final p8c b;
    public final g2b c;

    public p1b(g2b g2bVar, long j, p8c p8cVar) {
        this.c = g2bVar;
        this.a = j;
        this.b = p8cVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        gl.d3(new mx8(this, tLObject, this.a, this.b, (byte) 12));
    }
}
