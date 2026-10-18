package gi;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class h4 implements Utilities.Callback {
    public final int f11246a;
    public final org.telegram.ui.web.r f11247b;
    public final TLRPC.Document f11248c;

    public h4(org.telegram.ui.web.r rVar, TLRPC.Document document, int i10) {
        this.f11246a = i10;
        this.f11247b = rVar;
        this.f11248c = document;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f11246a) {
            case 0:
                TLRPC.Document document = this.f11248c;
                this.f11247b.run((String) obj, document);
                return;
            default:
                TLRPC.Document document2 = this.f11248c;
                this.f11247b.run((String) obj, document2);
                return;
        }
    }
}
