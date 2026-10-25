package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class s4 implements RequestDelegate {
    public final int f5393a = 0;
    public final boolean f5394b;
    public final boolean f5395c;
    public final Object d;
    public final Object e;
    public final Object f5396f;

    public s4(h7 h7Var, boolean z10, TLRPC.Document document, boolean z11, TL_stars.saveStarGift savestargift) {
        this.d = h7Var;
        this.f5394b = z10;
        this.e = document;
        this.f5395c = z11;
        this.f5396f = savestargift;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f5393a) {
            case 0:
                AndroidUtilities.runOnUIThread(new o2((h7) this.d, tLObject, this.f5394b, (TLRPC.Document) this.e, this.f5395c, tL_error, (TL_stars.saveStarGift) this.f5396f));
                return;
            default:
                AndroidUtilities.runOnUIThread(new o2((yh.k) this.d, this.f5394b, (Runnable) this.e, (String) this.f5396f, tL_error, tLObject, this.f5395c));
                return;
        }
    }

    public s4(yh.k kVar, boolean z10, yh.e eVar, String str, boolean z11) {
        this.d = kVar;
        this.f5394b = z10;
        this.e = eVar;
        this.f5396f = str;
        this.f5395c = z11;
    }
}
