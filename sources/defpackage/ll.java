package defpackage;

import org.telegram.tgnet.TLRPC;
public final class ll implements sl {
    public final byte a;
    public final vl b;

    public ll(vl vlVar, byte b) {
        this.a = b;
        this.b = vlVar;
    }

    @Override
    public final void a(TLRPC.Document document) {
        byte b = this.a;
        vl vlVar = this.b;
        switch (b) {
            case 0:
                vlVar.e = document;
                vlVar.i(false);
                return;
            default:
                vlVar.e = document;
                vlVar.i(false);
                return;
        }
    }
}
