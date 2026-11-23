package ki;

import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
public final class u3 implements w10 {
    public final int f19075a;
    public final org.telegram.ui.web.o f19076b;
    public final TLRPC.Document f19077c;

    public u3(org.telegram.ui.web.o oVar, TLRPC.Document document, int i7) {
        this.f19075a = i7;
        this.f19076b = oVar;
        this.f19077c = document;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f19075a) {
            case 0:
                TLRPC.Document document = this.f19077c;
                this.f19076b.a((String) obj, document);
                return;
            default:
                TLRPC.Document document2 = this.f19077c;
                this.f19076b.a((String) obj, document2);
                return;
        }
    }
}
