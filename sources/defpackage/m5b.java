package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class m5b implements RequestDelegate {
    public final long a;
    public final pcc b;
    public final c6b c;

    public m5b(c6b c6bVar, long j, pcc pccVar) {
        this.c = c6bVar;
        this.a = j;
        this.b = pccVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        hl.c3(new y09(this, tLObject, this.a, this.b, (byte) 12));
    }
}
