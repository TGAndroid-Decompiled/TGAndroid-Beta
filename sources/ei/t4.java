package ei;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class t4 implements Utilities.Callback {
    public final int f9354a;
    public final org.telegram.ui.web.q f9355b;
    public final TLRPC.Document f9356c;

    public t4(org.telegram.ui.web.q qVar, TLRPC.Document document, int i10) {
        this.f9354a = i10;
        this.f9355b = qVar;
        this.f9356c = document;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f9354a) {
            case 0:
                TLRPC.Document document = this.f9356c;
                this.f9355b.run((String) obj, document);
                return;
            default:
                TLRPC.Document document2 = this.f9356c;
                this.f9355b.run((String) obj, document2);
                return;
        }
    }
}
