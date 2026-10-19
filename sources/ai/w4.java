package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class w4 implements RequestDelegate {
    public final int f2359a = 0;
    public final boolean f2360b;
    public final boolean f2361c;
    public final Object d;
    public final Object e;
    public final Object f2362f;

    public w4(k7 k7Var, boolean z10, TLRPC.Document document, boolean z11, TL_stars.saveStarGift savestargift) {
        this.d = k7Var;
        this.f2360b = z10;
        this.e = document;
        this.f2361c = z11;
        this.f2362f = savestargift;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f2359a) {
            case 0:
                AndroidUtilities.runOnUIThread(new o2((k7) this.d, tLObject, this.f2360b, (TLRPC.Document) this.e, this.f2361c, tL_error, (TL_stars.saveStarGift) this.f2362f));
                return;
            default:
                AndroidUtilities.runOnUIThread(new o2((xh.k) this.d, this.f2360b, (Runnable) this.e, (String) this.f2362f, tL_error, tLObject, this.f2361c));
                return;
        }
    }

    public w4(xh.k kVar, boolean z10, xh.e eVar, String str, boolean z11) {
        this.d = kVar;
        this.f2360b = z10;
        this.e = eVar;
        this.f2362f = str;
        this.f2361c = z11;
    }
}
