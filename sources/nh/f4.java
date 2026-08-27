package nh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class f4 implements Utilities.Callback {

    public final int f18685a;

    public final org.telegram.ui.web.s f18686b;

    public final TLRPC.Document f18687c;

    public f4(org.telegram.ui.web.s sVar, TLRPC.Document document, int i10) {
        this.f18685a = i10;
        this.f18686b = sVar;
        this.f18687c = document;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18685a) {
            case 0:
                TLRPC.Document document = this.f18687c;
                this.f18686b.run((String) obj, document);
                break;
            default:
                TLRPC.Document document2 = this.f18687c;
                this.f18686b.run((String) obj, document2);
                break;
        }
    }
}
