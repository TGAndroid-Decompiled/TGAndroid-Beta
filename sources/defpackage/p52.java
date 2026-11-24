package defpackage;

import org.telegram.tgnet.TLRPC;
public final class p52 implements b42, ed {
    public final byte a;
    public final p8c b;

    public p52(p8c p8cVar, byte b) {
        this.a = b;
        this.b = p8cVar;
    }

    @Override
    public final void b(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        this.b.a(new sd8(messageMedia));
    }

    @Override
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        p8c p8cVar = this.b;
        switch (b) {
            case 1:
                if (p8cVar != null) {
                    p8cVar.a(Boolean.FALSE);
                    return;
                }
                return;
            default:
                p8cVar.a(hdVar.g(i, true, true));
                return;
        }
    }
}
