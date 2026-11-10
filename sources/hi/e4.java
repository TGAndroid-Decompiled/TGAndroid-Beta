package hi;

import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;
public final class e4 implements c20 {
    public final int f14637a;
    public final org.telegram.ui.web.n f14638b;
    public final TLRPC.Document f14639c;

    public e4(org.telegram.ui.web.n nVar, TLRPC.Document document, int i7) {
        this.f14637a = i7;
        this.f14638b = nVar;
        this.f14639c = document;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f14637a) {
            case 0:
                TLRPC.Document document = this.f14639c;
                this.f14638b.a((String) obj, document);
                return;
            default:
                TLRPC.Document document2 = this.f14639c;
                this.f14638b.a((String) obj, document2);
                return;
        }
    }
}
