package bi;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class t4 implements RequestDelegate {
    public final int f4740a = 0;
    public final boolean f4741b;
    public final boolean f4742c;
    public final Object d;
    public final Object f4743e;
    public final Object f4744f;

    public t4(k7 k7Var, boolean z9, TLRPC.Document document, boolean z10, TL_stars.saveStarGift savestargift) {
        this.d = k7Var;
        this.f4741b = z9;
        this.f4743e = document;
        this.f4742c = z10;
        this.f4744f = savestargift;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f4740a) {
            case 0:
                org.telegram.messenger.g0.h3(new m2((k7) this.d, tLObject, this.f4741b, (TLRPC.Document) this.f4743e, this.f4742c, tL_error, (TL_stars.saveStarGift) this.f4744f));
                return;
            default:
                org.telegram.messenger.g0.h3(new m2((yh.m) this.d, this.f4741b, (Runnable) this.f4743e, (String) this.f4744f, tL_error, tLObject, this.f4742c));
                return;
        }
    }

    public t4(yh.m mVar, boolean z9, yh.e eVar, String str, boolean z10) {
        this.d = mVar;
        this.f4741b = z9;
        this.f4743e = eVar;
        this.f4744f = str;
        this.f4742c = z10;
    }
}
