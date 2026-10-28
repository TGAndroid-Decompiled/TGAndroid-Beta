package hi;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class q4 implements Utilities.Callback {
    public final int f13235a;
    public final org.telegram.ui.web.r f13236b;
    public final TLRPC.Document f13237c;

    public q4(org.telegram.ui.web.r rVar, TLRPC.Document document, int i10) {
        this.f13235a = i10;
        this.f13236b = rVar;
        this.f13237c = document;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f13235a) {
            case 0:
                TLRPC.Document document = this.f13237c;
                this.f13236b.run((String) obj, document);
                return;
            default:
                TLRPC.Document document2 = this.f13237c;
                this.f13236b.run((String) obj, document2);
                return;
        }
    }
}
