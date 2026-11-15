package di;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class u3 implements RequestDelegate {
    public final int f9503a = 0;
    public final boolean f9504b;
    public final boolean f9505c;
    public final Object d;
    public final Object f9506e;
    public final Object f9507f;

    public u3(c6 c6Var, boolean z10, TLRPC.Document document, boolean z11, TL_stars.saveStarGift savestargift) {
        this.d = c6Var;
        this.f9504b = z10;
        this.f9506e = document;
        this.f9505c = z11;
        this.f9507f = savestargift;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9503a) {
            case 0:
                org.telegram.messenger.g0.h3(new x1((c6) this.d, tLObject, this.f9504b, (TLRPC.Document) this.f9506e, this.f9505c, tL_error, (TL_stars.saveStarGift) this.f9507f));
                return;
            default:
                org.telegram.messenger.g0.h3(new x1((zh.l) this.d, this.f9504b, (Runnable) this.f9506e, (String) this.f9507f, tL_error, tLObject, this.f9505c));
                return;
        }
    }

    public u3(zh.l lVar, boolean z10, zh.e eVar, String str, boolean z11) {
        this.d = lVar;
        this.f9504b = z10;
        this.f9506e = eVar;
        this.f9507f = str;
        this.f9505c = z11;
    }
}
