package ei;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class s4 implements Utilities.Callback {
    public final int f8596a;
    public final org.telegram.ui.web.q f8597b;
    public final TLRPC.Document f8598c;

    public s4(org.telegram.ui.web.q qVar, TLRPC.Document document, int i10) {
        this.f8596a = i10;
        this.f8597b = qVar;
        this.f8598c = document;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f8596a) {
            case 0:
                TLRPC.Document document = this.f8598c;
                this.f8597b.run((String) obj, document);
                return;
            default:
                TLRPC.Document document2 = this.f8598c;
                this.f8597b.run((String) obj, document2);
                return;
        }
    }
}
