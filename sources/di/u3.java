package di;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class u3 implements RequestDelegate {
    public final int f9518a = 0;
    public final boolean f9519b;
    public final boolean f9520c;
    public final Object d;
    public final Object f9521e;
    public final Object f9522f;

    public u3(c6 c6Var, boolean z10, TLRPC.Document document, boolean z11, TL_stars.saveStarGift savestargift) {
        this.d = c6Var;
        this.f9519b = z10;
        this.f9521e = document;
        this.f9520c = z11;
        this.f9522f = savestargift;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9518a) {
            case 0:
                org.telegram.messenger.g0.h3(new x1((c6) this.d, tLObject, this.f9519b, (TLRPC.Document) this.f9521e, this.f9520c, tL_error, (TL_stars.saveStarGift) this.f9522f));
                return;
            default:
                org.telegram.messenger.g0.h3(new x1((zh.l) this.d, this.f9519b, (Runnable) this.f9521e, (String) this.f9522f, tL_error, tLObject, this.f9520c));
                return;
        }
    }

    public u3(zh.l lVar, boolean z10, zh.e eVar, String str, boolean z11) {
        this.d = lVar;
        this.f9519b = z10;
        this.f9521e = eVar;
        this.f9522f = str;
        this.f9520c = z11;
    }
}
