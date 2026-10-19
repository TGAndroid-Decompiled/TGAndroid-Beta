package gi;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class h4 implements Utilities.Callback {
    public final int f11243a;
    public final org.telegram.ui.web.r f11244b;
    public final TLRPC.Document f11245c;

    public h4(org.telegram.ui.web.r rVar, TLRPC.Document document, int i10) {
        this.f11243a = i10;
        this.f11244b = rVar;
        this.f11245c = document;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f11243a) {
            case 0:
                TLRPC.Document document = this.f11245c;
                this.f11244b.run((String) obj, document);
                return;
            default:
                TLRPC.Document document2 = this.f11245c;
                this.f11244b.run((String) obj, document2);
                return;
        }
    }
}
