package di;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class x3 implements RequestDelegate {
    public final int f9990a = 0;
    public final boolean f9991b;
    public final boolean f9992c;
    public final Object d;
    public final Object f9993e;
    public final Object f9994f;

    public x3(f6 f6Var, boolean z10, TLRPC.Document document, boolean z11, TL_stars.saveStarGift savestargift) {
        this.d = f6Var;
        this.f9991b = z10;
        this.f9993e = document;
        this.f9992c = z11;
        this.f9994f = savestargift;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9990a) {
            case 0:
                org.telegram.messenger.g0.g3(new z1((f6) this.d, tLObject, this.f9991b, (TLRPC.Document) this.f9993e, this.f9992c, tL_error, (TL_stars.saveStarGift) this.f9994f));
                return;
            default:
                org.telegram.messenger.g0.g3(new z1((zh.l) this.d, this.f9991b, (Runnable) this.f9993e, (String) this.f9994f, tL_error, tLObject, this.f9992c));
                return;
        }
    }

    public x3(zh.l lVar, boolean z10, zh.e eVar, String str, boolean z11) {
        this.d = lVar;
        this.f9991b = z10;
        this.f9993e = eVar;
        this.f9994f = str;
        this.f9992c = z11;
    }
}
