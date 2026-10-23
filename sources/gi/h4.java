package gi;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class h4 implements Utilities.Callback {
    public final int f11265a;
    public final org.telegram.ui.web.r f11266b;
    public final TLRPC.Document f11267c;

    public h4(org.telegram.ui.web.r rVar, TLRPC.Document document, int i10) {
        this.f11265a = i10;
        this.f11266b = rVar;
        this.f11267c = document;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f11265a) {
            case 0:
                TLRPC.Document document = this.f11267c;
                this.f11266b.run((String) obj, document);
                return;
            default:
                TLRPC.Document document2 = this.f11267c;
                this.f11266b.run((String) obj, document2);
                return;
        }
    }
}
