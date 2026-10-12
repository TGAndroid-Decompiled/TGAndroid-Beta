package ei;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class r4 implements Utilities.Callback {
    public final int f9334a;
    public final org.telegram.ui.web.q f9335b;
    public final TLRPC.Document f9336c;

    public r4(org.telegram.ui.web.q qVar, TLRPC.Document document, int i10) {
        this.f9334a = i10;
        this.f9335b = qVar;
        this.f9336c = document;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f9334a) {
            case 0:
                TLRPC.Document document = this.f9336c;
                this.f9335b.run((String) obj, document);
                return;
            default:
                TLRPC.Document document2 = this.f9336c;
                this.f9335b.run((String) obj, document2);
                return;
        }
    }
}
