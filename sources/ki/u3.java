package ki;

import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
public final class u3 implements x10 {
    public final int f18975a;
    public final org.telegram.ui.web.o f18976b;
    public final TLRPC.Document f18977c;

    public u3(org.telegram.ui.web.o oVar, TLRPC.Document document, int i7) {
        this.f18975a = i7;
        this.f18976b = oVar;
        this.f18977c = document;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f18975a) {
            case 0:
                TLRPC.Document document = this.f18977c;
                this.f18976b.a((String) obj, document);
                return;
            default:
                TLRPC.Document document2 = this.f18977c;
                this.f18976b.a((String) obj, document2);
                return;
        }
    }
}
