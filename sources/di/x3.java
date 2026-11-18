package di;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class x3 implements RequestDelegate {
    public final int f9994a = 0;
    public final boolean f9995b;
    public final boolean f9996c;
    public final Object d;
    public final Object f9997e;
    public final Object f9998f;

    public x3(f6 f6Var, boolean z10, TLRPC.Document document, boolean z11, TL_stars.saveStarGift savestargift) {
        this.d = f6Var;
        this.f9995b = z10;
        this.f9997e = document;
        this.f9996c = z11;
        this.f9998f = savestargift;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9994a) {
            case 0:
                org.telegram.messenger.g0.g3(new z1((f6) this.d, tLObject, this.f9995b, (TLRPC.Document) this.f9997e, this.f9996c, tL_error, (TL_stars.saveStarGift) this.f9998f));
                return;
            default:
                org.telegram.messenger.g0.g3(new z1((zh.l) this.d, this.f9995b, (Runnable) this.f9997e, (String) this.f9998f, tL_error, tLObject, this.f9996c));
                return;
        }
    }

    public x3(zh.l lVar, boolean z10, zh.e eVar, String str, boolean z11) {
        this.d = lVar;
        this.f9995b = z10;
        this.f9997e = eVar;
        this.f9998f = str;
        this.f9996c = z11;
    }
}
