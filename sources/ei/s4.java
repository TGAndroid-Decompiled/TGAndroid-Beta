package ei;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class s4 implements Utilities.Callback {
    public final int f8613a;
    public final org.telegram.ui.web.r f8614b;
    public final TLRPC.Document f8615c;

    public s4(org.telegram.ui.web.r rVar, TLRPC.Document document, int i10) {
        this.f8613a = i10;
        this.f8614b = rVar;
        this.f8615c = document;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f8613a) {
            case 0:
                TLRPC.Document document = this.f8615c;
                this.f8614b.run((String) obj, document);
                return;
            default:
                TLRPC.Document document2 = this.f8615c;
                this.f8614b.run((String) obj, document2);
                return;
        }
    }
}
