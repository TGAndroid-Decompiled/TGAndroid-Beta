package hi;

import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;
public final class e4 implements c20 {
    public final int f14635a;
    public final org.telegram.ui.web.n f14636b;
    public final TLRPC.Document f14637c;

    public e4(org.telegram.ui.web.n nVar, TLRPC.Document document, int i7) {
        this.f14635a = i7;
        this.f14636b = nVar;
        this.f14637c = document;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f14635a) {
            case 0:
                TLRPC.Document document = this.f14637c;
                this.f14636b.a((String) obj, document);
                return;
            default:
                TLRPC.Document document2 = this.f14637c;
                this.f14636b.a((String) obj, document2);
                return;
        }
    }
}
