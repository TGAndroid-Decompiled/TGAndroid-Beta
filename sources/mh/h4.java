package mh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class h4 implements Utilities.Callback {
    public final int f17886a;
    public final org.telegram.ui.web.r f17887b;
    public final TLRPC.Document f17888c;

    public h4(org.telegram.ui.web.r rVar, TLRPC.Document document, int i9) {
        this.f17886a = i9;
        this.f17887b = rVar;
        this.f17888c = document;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f17886a) {
            case 0:
                TLRPC.Document document = this.f17888c;
                this.f17887b.run((String) obj, document);
                return;
            default:
                TLRPC.Document document2 = this.f17888c;
                this.f17887b.run((String) obj, document2);
                return;
        }
    }
}
