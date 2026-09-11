package fi;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class t4 implements Utilities.Callback {
    public final int f9982a;
    public final org.telegram.ui.web.s f9983b;
    public final TLRPC.Document f9984c;

    public t4(org.telegram.ui.web.s sVar, TLRPC.Document document, int i10) {
        this.f9982a = i10;
        this.f9983b = sVar;
        this.f9984c = document;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f9982a) {
            case 0:
                TLRPC.Document document = this.f9984c;
                this.f9983b.run((String) obj, document);
                return;
            default:
                TLRPC.Document document2 = this.f9984c;
                this.f9983b.run((String) obj, document2);
                return;
        }
    }
}
