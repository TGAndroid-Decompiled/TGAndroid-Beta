package ki;

import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
public final class t3 implements x10 {
    public final int f18985a;
    public final org.telegram.ui.web.o f18986b;
    public final TLRPC.Document f18987c;

    public t3(org.telegram.ui.web.o oVar, TLRPC.Document document, int i7) {
        this.f18985a = i7;
        this.f18986b = oVar;
        this.f18987c = document;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f18985a) {
            case 0:
                TLRPC.Document document = this.f18987c;
                this.f18986b.a((String) obj, document);
                return;
            default:
                TLRPC.Document document2 = this.f18987c;
                this.f18986b.a((String) obj, document2);
                return;
        }
    }
}
