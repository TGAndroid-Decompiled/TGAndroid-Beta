package ei;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class s4 implements Utilities.Callback {
    public final int f8598a;
    public final org.telegram.ui.web.q f8599b;
    public final TLRPC.Document f8600c;

    public s4(org.telegram.ui.web.q qVar, TLRPC.Document document, int i10) {
        this.f8598a = i10;
        this.f8599b = qVar;
        this.f8600c = document;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f8598a) {
            case 0:
                TLRPC.Document document = this.f8600c;
                this.f8599b.run((String) obj, document);
                return;
            default:
                TLRPC.Document document2 = this.f8600c;
                this.f8599b.run((String) obj, document2);
                return;
        }
    }
}
