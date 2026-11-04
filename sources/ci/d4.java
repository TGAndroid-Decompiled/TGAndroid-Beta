package ci;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class d4 implements RequestDelegate {
    public final int f4960a = 0;
    public final boolean f4961b;
    public final boolean f4962c;
    public final Object d;
    public final Object f4963e;
    public final Object f4964f;

    public d4(l6 l6Var, boolean z10, TLRPC.Document document, boolean z11, TL_stars.saveStarGift savestargift) {
        this.d = l6Var;
        this.f4961b = z10;
        this.f4963e = document;
        this.f4962c = z11;
        this.f4964f = savestargift;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f4960a) {
            case 0:
                org.telegram.messenger.g0.h3(new d2((l6) this.d, tLObject, this.f4961b, (TLRPC.Document) this.f4963e, this.f4962c, tL_error, (TL_stars.saveStarGift) this.f4964f));
                return;
            default:
                org.telegram.messenger.g0.h3(new d2((zh.k) this.d, this.f4961b, (Runnable) this.f4963e, (String) this.f4964f, tL_error, tLObject, this.f4962c));
                return;
        }
    }

    public d4(zh.k kVar, boolean z10, zh.e eVar, String str, boolean z11) {
        this.d = kVar;
        this.f4961b = z10;
        this.f4963e = eVar;
        this.f4964f = str;
        this.f4962c = z11;
    }
}
