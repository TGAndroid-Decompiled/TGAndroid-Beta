package ei;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class s4 implements Utilities.Callback {
    public final int f8610a;
    public final org.telegram.ui.web.r f8611b;
    public final TLRPC.Document f8612c;

    public s4(org.telegram.ui.web.r rVar, TLRPC.Document document, int i10) {
        this.f8610a = i10;
        this.f8611b = rVar;
        this.f8612c = document;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f8610a) {
            case 0:
                TLRPC.Document document = this.f8612c;
                this.f8611b.run((String) obj, document);
                return;
            default:
                TLRPC.Document document2 = this.f8612c;
                this.f8611b.run((String) obj, document2);
                return;
        }
    }
}
