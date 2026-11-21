package di;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class x3 implements RequestDelegate {
    public final int f10026a = 0;
    public final boolean f10027b;
    public final boolean f10028c;
    public final Object d;
    public final Object f10029e;
    public final Object f10030f;

    public x3(f6 f6Var, boolean z10, TLRPC.Document document, boolean z11, TL_stars.saveStarGift savestargift) {
        this.d = f6Var;
        this.f10027b = z10;
        this.f10029e = document;
        this.f10028c = z11;
        this.f10030f = savestargift;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f10026a) {
            case 0:
                org.telegram.messenger.g0.g3(new z1((f6) this.d, tLObject, this.f10027b, (TLRPC.Document) this.f10029e, this.f10028c, tL_error, (TL_stars.saveStarGift) this.f10030f));
                return;
            default:
                org.telegram.messenger.g0.g3(new z1((zh.l) this.d, this.f10027b, (Runnable) this.f10029e, (String) this.f10030f, tL_error, tLObject, this.f10028c));
                return;
        }
    }

    public x3(zh.l lVar, boolean z10, zh.e eVar, String str, boolean z11) {
        this.d = lVar;
        this.f10027b = z10;
        this.f10029e = eVar;
        this.f10030f = str;
        this.f10028c = z11;
    }
}
