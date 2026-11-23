package di;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class x3 implements RequestDelegate {
    public final int f9992a = 0;
    public final boolean f9993b;
    public final boolean f9994c;
    public final Object d;
    public final Object f9995e;
    public final Object f9996f;

    public x3(f6 f6Var, boolean z10, TLRPC.Document document, boolean z11, TL_stars.saveStarGift savestargift) {
        this.d = f6Var;
        this.f9993b = z10;
        this.f9995e = document;
        this.f9994c = z11;
        this.f9996f = savestargift;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9992a) {
            case 0:
                org.telegram.messenger.g0.g3(new z1((f6) this.d, tLObject, this.f9993b, (TLRPC.Document) this.f9995e, this.f9994c, tL_error, (TL_stars.saveStarGift) this.f9996f));
                return;
            default:
                org.telegram.messenger.g0.g3(new z1((zh.l) this.d, this.f9993b, (Runnable) this.f9995e, (String) this.f9996f, tL_error, tLObject, this.f9994c));
                return;
        }
    }

    public x3(zh.l lVar, boolean z10, zh.e eVar, String str, boolean z11) {
        this.d = lVar;
        this.f9993b = z10;
        this.f9995e = eVar;
        this.f9996f = str;
        this.f9994c = z11;
    }
}
