package ki;

import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
public final class z3 implements z10 {
    public final int f18740a;
    public final org.telegram.ui.web.o f18741b;
    public final TLRPC.Document f18742c;

    public z3(org.telegram.ui.web.o oVar, TLRPC.Document document, int i7) {
        this.f18740a = i7;
        this.f18741b = oVar;
        this.f18742c = document;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f18740a) {
            case 0:
                TLRPC.Document document = this.f18742c;
                this.f18741b.a((String) obj, document);
                return;
            default:
                TLRPC.Document document2 = this.f18742c;
                this.f18741b.a((String) obj, document2);
                return;
        }
    }
}
