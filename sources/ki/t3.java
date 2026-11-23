package ki;

import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
public final class t3 implements y10 {
    public final int f18954a;
    public final org.telegram.ui.web.o f18955b;
    public final TLRPC.Document f18956c;

    public t3(org.telegram.ui.web.o oVar, TLRPC.Document document, int i7) {
        this.f18954a = i7;
        this.f18955b = oVar;
        this.f18956c = document;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f18954a) {
            case 0:
                TLRPC.Document document = this.f18956c;
                this.f18955b.a((String) obj, document);
                return;
            default:
                TLRPC.Document document2 = this.f18956c;
                this.f18955b.a((String) obj, document2);
                return;
        }
    }
}
