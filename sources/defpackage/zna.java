package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zna implements RequestDelegate {
    public final byte a = 1;
    public final vqa b;
    public final long c;
    public final long d;
    public final long e;
    public final Object f;

    public zna(vqa vqaVar, long j, long j2, p8c p8cVar, long j3) {
        this.b = vqaVar;
        this.c = j;
        this.d = j2;
        this.f = p8cVar;
        this.e = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.f;
        switch (b) {
            case 0:
                vqa vqaVar = this.b;
                vqaVar.getClass();
                gl.d3(new goa(vqaVar, (hd) obj, tLObject, this.c, this.d, this.e, tL_error));
                return;
            default:
                gl.d3(new goa(this.b, tLObject, this.c, this.d, (p8c) obj, tL_error, this.e));
                return;
        }
    }

    public zna(vqa vqaVar, hd hdVar, long j, long j2, long j3) {
        this.b = vqaVar;
        this.f = hdVar;
        this.c = j;
        this.d = j2;
        this.e = j3;
    }
}
