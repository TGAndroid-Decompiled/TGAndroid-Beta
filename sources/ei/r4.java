package ei;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class r4 implements Utilities.Callback {
    public final int f9336a;
    public final org.telegram.ui.web.q f9337b;
    public final TLRPC.Document f9338c;

    public r4(org.telegram.ui.web.q qVar, TLRPC.Document document, int i10) {
        this.f9336a = i10;
        this.f9337b = qVar;
        this.f9338c = document;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f9336a) {
            case 0:
                TLRPC.Document document = this.f9338c;
                this.f9337b.run((String) obj, document);
                return;
            default:
                TLRPC.Document document2 = this.f9338c;
                this.f9337b.run((String) obj, document2);
                return;
        }
    }
}
