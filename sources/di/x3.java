package di;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class x3 implements RequestDelegate {
    public final int f10029a = 0;
    public final boolean f10030b;
    public final boolean f10031c;
    public final Object d;
    public final Object f10032e;
    public final Object f10033f;

    public x3(f6 f6Var, boolean z10, TLRPC.Document document, boolean z11, TL_stars.saveStarGift savestargift) {
        this.d = f6Var;
        this.f10030b = z10;
        this.f10032e = document;
        this.f10031c = z11;
        this.f10033f = savestargift;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f10029a) {
            case 0:
                org.telegram.messenger.g0.g3(new z1((f6) this.d, tLObject, this.f10030b, (TLRPC.Document) this.f10032e, this.f10031c, tL_error, (TL_stars.saveStarGift) this.f10033f));
                return;
            default:
                org.telegram.messenger.g0.g3(new z1((zh.l) this.d, this.f10030b, (Runnable) this.f10032e, (String) this.f10033f, tL_error, tLObject, this.f10031c));
                return;
        }
    }

    public x3(zh.l lVar, boolean z10, zh.e eVar, String str, boolean z11) {
        this.d = lVar;
        this.f10030b = z10;
        this.f10032e = eVar;
        this.f10033f = str;
        this.f10031c = z11;
    }
}
