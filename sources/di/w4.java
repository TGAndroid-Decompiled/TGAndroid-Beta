package di;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class w4 implements Utilities.Callback {
    public final int f6987a;
    public final org.telegram.ui.web.r f6988b;
    public final TLRPC.Document f6989c;

    public w4(org.telegram.ui.web.r rVar, TLRPC.Document document, int i10) {
        this.f6987a = i10;
        this.f6988b = rVar;
        this.f6989c = document;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f6987a) {
            case 0:
                TLRPC.Document document = this.f6989c;
                this.f6988b.run((String) obj, document);
                return;
            default:
                TLRPC.Document document2 = this.f6989c;
                this.f6988b.run((String) obj, document2);
                return;
        }
    }
}
