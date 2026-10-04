package ei;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class t4 implements Utilities.Callback {
    public final int f9353a;
    public final org.telegram.ui.web.q f9354b;
    public final TLRPC.Document f9355c;

    public t4(org.telegram.ui.web.q qVar, TLRPC.Document document, int i10) {
        this.f9353a = i10;
        this.f9354b = qVar;
        this.f9355c = document;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f9353a) {
            case 0:
                TLRPC.Document document = this.f9355c;
                this.f9354b.run((String) obj, document);
                return;
            default:
                TLRPC.Document document2 = this.f9355c;
                this.f9354b.run((String) obj, document2);
                return;
        }
    }
}
