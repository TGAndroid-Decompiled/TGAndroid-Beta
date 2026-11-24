package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zpa implements RequestDelegate {
    public final byte a = 1;
    public final wsa b;
    public final long c;
    public final long d;
    public final long e;
    public final Object f;

    public zpa(wsa wsaVar, long j, long j2, qac qacVar, long j3) {
        this.b = wsaVar;
        this.c = j;
        this.d = j2;
        this.f = qacVar;
        this.e = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.f;
        switch (b) {
            case 0:
                wsa wsaVar = this.b;
                wsaVar.getClass();
                gm.c3(new gqa(wsaVar, (he) obj, tLObject, this.c, this.d, this.e, tL_error));
                return;
            default:
                gm.c3(new gqa(this.b, tLObject, this.c, this.d, (qac) obj, tL_error, this.e));
                return;
        }
    }

    public zpa(wsa wsaVar, he heVar, long j, long j2, long j3) {
        this.b = wsaVar;
        this.f = heVar;
        this.c = j;
        this.d = j2;
        this.e = j3;
    }
}
