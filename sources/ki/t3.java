package ki;

import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
public final class t3 implements y10 {
    public final int f18988a;
    public final org.telegram.ui.web.o f18989b;
    public final TLRPC.Document f18990c;

    public t3(org.telegram.ui.web.o oVar, TLRPC.Document document, int i7) {
        this.f18988a = i7;
        this.f18989b = oVar;
        this.f18990c = document;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f18988a) {
            case 0:
                TLRPC.Document document = this.f18990c;
                this.f18989b.a((String) obj, document);
                return;
            default:
                TLRPC.Document document2 = this.f18990c;
                this.f18989b.a((String) obj, document2);
                return;
        }
    }
}
