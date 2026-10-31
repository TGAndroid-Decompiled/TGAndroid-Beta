package oh;

import org.telegram.messenger.i0;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import rh.e4;
public final class g implements RequestDelegate {
    public final int f14259a = 0;
    public final boolean f14260b;
    public final boolean f14261c;
    public final Object d;
    public final Object e;
    public final Object f14262f;

    public g(q qVar, boolean z10, f fVar, String str, boolean z11) {
        this.d = qVar;
        this.f14260b = z10;
        this.e = fVar;
        this.f14262f = str;
        this.f14261c = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f14259a) {
            case 0:
                i0.g3(new h((q) this.d, this.f14260b, (Runnable) this.e, (String) this.f14262f, tL_error, tLObject, this.f14261c));
                return;
            default:
                i0.g3(new h((e4) this.d, tLObject, this.f14260b, (TLRPC.Document) this.e, this.f14261c, tL_error, (TL_stars.saveStarGift) this.f14262f));
                return;
        }
    }

    public g(e4 e4Var, boolean z10, TLRPC.Document document, boolean z11, TL_stars.saveStarGift savestargift) {
        this.d = e4Var;
        this.f14260b = z10;
        this.e = document;
        this.f14261c = z11;
        this.f14262f = savestargift;
    }
}
