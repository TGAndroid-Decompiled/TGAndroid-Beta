package gi;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class h4 implements Utilities.Callback {
    public final int f11245a;
    public final org.telegram.ui.web.r f11246b;
    public final TLRPC.Document f11247c;

    public h4(org.telegram.ui.web.r rVar, TLRPC.Document document, int i10) {
        this.f11245a = i10;
        this.f11246b = rVar;
        this.f11247c = document;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f11245a) {
            case 0:
                TLRPC.Document document = this.f11247c;
                this.f11246b.run((String) obj, document);
                return;
            default:
                TLRPC.Document document2 = this.f11247c;
                this.f11246b.run((String) obj, document2);
                return;
        }
    }
}
