package ei;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class s4 implements Utilities.Callback {
    public final int f8595a;
    public final org.telegram.ui.web.q f8596b;
    public final TLRPC.Document f8597c;

    public s4(org.telegram.ui.web.q qVar, TLRPC.Document document, int i10) {
        this.f8595a = i10;
        this.f8596b = qVar;
        this.f8597c = document;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f8595a) {
            case 0:
                TLRPC.Document document = this.f8597c;
                this.f8596b.run((String) obj, document);
                return;
            default:
                TLRPC.Document document2 = this.f8597c;
                this.f8596b.run((String) obj, document2);
                return;
        }
    }
}
