package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class r3b implements RequestDelegate {
    public final long a;
    public final qac b;
    public final h4b c;

    public r3b(h4b h4bVar, long j, qac qacVar) {
        this.c = h4bVar;
        this.a = j;
        this.b = qacVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        gm.c3(new nz8(this, tLObject, this.a, this.b, (byte) 12));
    }
}
