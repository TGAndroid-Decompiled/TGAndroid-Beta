package hi;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class q4 implements Utilities.Callback {
    public final int f13236a;
    public final org.telegram.ui.web.r f13237b;
    public final TLRPC.Document f13238c;

    public q4(org.telegram.ui.web.r rVar, TLRPC.Document document, int i10) {
        this.f13236a = i10;
        this.f13237b = rVar;
        this.f13238c = document;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f13236a) {
            case 0:
                TLRPC.Document document = this.f13238c;
                this.f13237b.run((String) obj, document);
                return;
            default:
                TLRPC.Document document2 = this.f13238c;
                this.f13237b.run((String) obj, document2);
                return;
        }
    }
}
