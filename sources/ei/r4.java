package ei;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class r4 implements Utilities.Callback {
    public final int f9337a;
    public final org.telegram.ui.web.q f9338b;
    public final TLRPC.Document f9339c;

    public r4(org.telegram.ui.web.q qVar, TLRPC.Document document, int i10) {
        this.f9337a = i10;
        this.f9338b = qVar;
        this.f9339c = document;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f9337a) {
            case 0:
                TLRPC.Document document = this.f9339c;
                this.f9338b.run((String) obj, document);
                return;
            default:
                TLRPC.Document document2 = this.f9339c;
                this.f9338b.run((String) obj, document2);
                return;
        }
    }
}
