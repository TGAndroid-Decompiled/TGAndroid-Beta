package ei;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class s4 implements Utilities.Callback {
    public final int f8608a;
    public final org.telegram.ui.web.r f8609b;
    public final TLRPC.Document f8610c;

    public s4(org.telegram.ui.web.r rVar, TLRPC.Document document, int i10) {
        this.f8608a = i10;
        this.f8609b = rVar;
        this.f8610c = document;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f8608a) {
            case 0:
                TLRPC.Document document = this.f8610c;
                this.f8609b.run((String) obj, document);
                return;
            default:
                TLRPC.Document document2 = this.f8610c;
                this.f8609b.run((String) obj, document2);
                return;
        }
    }
}
