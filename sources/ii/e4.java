package ii;

import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
public final class e4 implements u10 {
    public final int f14921a;
    public final org.telegram.ui.web.p f14922b;
    public final TLRPC.Document f14923c;

    public e4(org.telegram.ui.web.p pVar, TLRPC.Document document, int i3) {
        this.f14921a = i3;
        this.f14922b = pVar;
        this.f14923c = document;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f14921a) {
            case 0:
                TLRPC.Document document = this.f14923c;
                this.f14922b.a((String) obj, document);
                return;
            default:
                TLRPC.Document document2 = this.f14923c;
                this.f14922b.a((String) obj, document2);
                return;
        }
    }
}
