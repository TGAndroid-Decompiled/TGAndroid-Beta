package fi;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class s4 implements Utilities.Callback {
    public final int f9540a;
    public final org.telegram.ui.web.q f9541b;
    public final TLRPC.Document f9542c;

    public s4(org.telegram.ui.web.q qVar, TLRPC.Document document, int i10) {
        this.f9540a = i10;
        this.f9541b = qVar;
        this.f9542c = document;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f9540a) {
            case 0:
                TLRPC.Document document = this.f9542c;
                this.f9541b.run((String) obj, document);
                return;
            default:
                TLRPC.Document document2 = this.f9542c;
                this.f9541b.run((String) obj, document2);
                return;
        }
    }
}
