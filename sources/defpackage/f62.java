package defpackage;

import org.telegram.tgnet.TLRPC;
public final class f62 implements r42, fd {
    public final byte a;
    public final pcc b;

    public f62(pcc pccVar, byte b) {
        this.a = b;
        this.b = pccVar;
    }

    @Override
    public final void b(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        this.b.a(new gh8(messageMedia));
    }

    @Override
    public final void w(id idVar, int i) {
        byte b = this.a;
        pcc pccVar = this.b;
        switch (b) {
            case 1:
                if (pccVar != null) {
                    pccVar.a(Boolean.FALSE);
                    return;
                }
                return;
            default:
                pccVar.a(idVar.g(i, true, true));
                return;
        }
    }
}
