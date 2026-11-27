package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zra implements RequestDelegate {
    public final byte a = 1;
    public final wua b;
    public final long c;
    public final long d;
    public final long e;
    public final Object f;

    public zra(wua wuaVar, long j, long j2, pcc pccVar, long j3) {
        this.b = wuaVar;
        this.c = j;
        this.d = j2;
        this.f = pccVar;
        this.e = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.f;
        switch (b) {
            case 0:
                wua wuaVar = this.b;
                wuaVar.getClass();
                hl.c3(new gsa(wuaVar, (id) obj, tLObject, this.c, this.d, this.e, tL_error));
                return;
            default:
                hl.c3(new gsa(this.b, tLObject, this.c, this.d, (pcc) obj, tL_error, this.e));
                return;
        }
    }

    public zra(wua wuaVar, id idVar, long j, long j2, long j3) {
        this.b = wuaVar;
        this.f = idVar;
        this.c = j;
        this.d = j2;
        this.e = j3;
    }
}
