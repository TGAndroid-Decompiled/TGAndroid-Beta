package fi;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class s4 implements Utilities.Callback {
    public final int f9537a;
    public final org.telegram.ui.web.q f9538b;
    public final TLRPC.Document f9539c;

    public s4(org.telegram.ui.web.q qVar, TLRPC.Document document, int i10) {
        this.f9537a = i10;
        this.f9538b = qVar;
        this.f9539c = document;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f9537a) {
            case 0:
                TLRPC.Document document = this.f9539c;
                this.f9538b.run((String) obj, document);
                return;
            default:
                TLRPC.Document document2 = this.f9539c;
                this.f9538b.run((String) obj, document2);
                return;
        }
    }
}
