package ki;

import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
public final class u3 implements x10 {
    public final int f18978a;
    public final org.telegram.ui.web.o f18979b;
    public final TLRPC.Document f18980c;

    public u3(org.telegram.ui.web.o oVar, TLRPC.Document document, int i7) {
        this.f18978a = i7;
        this.f18979b = oVar;
        this.f18980c = document;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f18978a) {
            case 0:
                TLRPC.Document document = this.f18980c;
                this.f18979b.a((String) obj, document);
                return;
            default:
                TLRPC.Document document2 = this.f18980c;
                this.f18979b.a((String) obj, document2);
                return;
        }
    }
}
