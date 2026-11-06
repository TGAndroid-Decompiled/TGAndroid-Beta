package bi;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class t4 implements RequestDelegate {
    public final int f4742a = 0;
    public final boolean f4743b;
    public final boolean f4744c;
    public final Object d;
    public final Object f4745e;
    public final Object f4746f;

    public t4(k7 k7Var, boolean z9, TLRPC.Document document, boolean z10, TL_stars.saveStarGift savestargift) {
        this.d = k7Var;
        this.f4743b = z9;
        this.f4745e = document;
        this.f4744c = z10;
        this.f4746f = savestargift;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f4742a) {
            case 0:
                org.telegram.messenger.g0.h3(new m2((k7) this.d, tLObject, this.f4743b, (TLRPC.Document) this.f4745e, this.f4744c, tL_error, (TL_stars.saveStarGift) this.f4746f));
                return;
            default:
                org.telegram.messenger.g0.h3(new m2((yh.m) this.d, this.f4743b, (Runnable) this.f4745e, (String) this.f4746f, tL_error, tLObject, this.f4744c));
                return;
        }
    }

    public t4(yh.m mVar, boolean z9, yh.e eVar, String str, boolean z10) {
        this.d = mVar;
        this.f4743b = z9;
        this.f4745e = eVar;
        this.f4746f = str;
        this.f4744c = z10;
    }
}
