package ei;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class s4 implements Utilities.Callback {
    public final int f8607a;
    public final org.telegram.ui.web.q f8608b;
    public final TLRPC.Document f8609c;

    public s4(org.telegram.ui.web.q qVar, TLRPC.Document document, int i10) {
        this.f8607a = i10;
        this.f8608b = qVar;
        this.f8609c = document;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f8607a) {
            case 0:
                TLRPC.Document document = this.f8609c;
                this.f8608b.run((String) obj, document);
                return;
            default:
                TLRPC.Document document2 = this.f8609c;
                this.f8608b.run((String) obj, document2);
                return;
        }
    }
}
