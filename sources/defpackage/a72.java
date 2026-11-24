package defpackage;

import org.telegram.tgnet.TLRPC;
public final class a72 implements m52, ee {
    public final byte a;
    public final qac b;

    public a72(qac qacVar, byte b) {
        this.a = b;
        this.b = qacVar;
    }

    @Override
    public final void b(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        this.b.a(new uf8(messageMedia));
    }

    @Override
    public final void r(he heVar, int i) {
        byte b = this.a;
        qac qacVar = this.b;
        switch (b) {
            case 1:
                if (qacVar != null) {
                    qacVar.a(Boolean.FALSE);
                    return;
                }
                return;
            default:
                qacVar.a(heVar.g(i, true, true));
                return;
        }
    }
}
