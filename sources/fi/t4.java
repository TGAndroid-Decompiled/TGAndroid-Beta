package fi;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class t4 implements Utilities.Callback {
    public final int f10010a;
    public final org.telegram.ui.web.s f10011b;
    public final TLRPC.Document f10012c;

    public t4(org.telegram.ui.web.s sVar, TLRPC.Document document, int i10) {
        this.f10010a = i10;
        this.f10011b = sVar;
        this.f10012c = document;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f10010a) {
            case 0:
                TLRPC.Document document = this.f10012c;
                this.f10011b.run((String) obj, document);
                return;
            default:
                TLRPC.Document document2 = this.f10012c;
                this.f10011b.run((String) obj, document2);
                return;
        }
    }
}
