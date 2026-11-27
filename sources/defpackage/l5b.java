package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class l5b implements RequestDelegate {
    public final long a;
    public final wz5 b;
    public final c6b c;

    public l5b(c6b c6bVar, long j, wz5 wz5Var) {
        this.c = c6bVar;
        this.a = j;
        this.b = wz5Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        hl.c3(new y09(this, tLObject, this.a, this.b, (byte) 11));
    }
}
