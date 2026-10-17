package gi;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class h4 implements Utilities.Callback {
    public final int f11244a;
    public final org.telegram.ui.web.q f11245b;
    public final TLRPC.Document f11246c;

    public h4(org.telegram.ui.web.q qVar, TLRPC.Document document, int i10) {
        this.f11244a = i10;
        this.f11245b = qVar;
        this.f11246c = document;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f11244a) {
            case 0:
                TLRPC.Document document = this.f11246c;
                this.f11245b.run((String) obj, document);
                return;
            default:
                TLRPC.Document document2 = this.f11246c;
                this.f11245b.run((String) obj, document2);
                return;
        }
    }
}
