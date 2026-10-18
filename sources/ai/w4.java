package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class w4 implements RequestDelegate {
    public final int f2361a = 0;
    public final boolean f2362b;
    public final boolean f2363c;
    public final Object d;
    public final Object e;
    public final Object f2364f;

    public w4(k7 k7Var, boolean z10, TLRPC.Document document, boolean z11, TL_stars.saveStarGift savestargift) {
        this.d = k7Var;
        this.f2362b = z10;
        this.e = document;
        this.f2363c = z11;
        this.f2364f = savestargift;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f2361a) {
            case 0:
                AndroidUtilities.runOnUIThread(new m2((k7) this.d, tLObject, this.f2362b, (TLRPC.Document) this.e, this.f2363c, tL_error, (TL_stars.saveStarGift) this.f2364f));
                return;
            default:
                AndroidUtilities.runOnUIThread(new m2((xh.k) this.d, this.f2362b, (Runnable) this.e, (String) this.f2364f, tL_error, tLObject, this.f2363c));
                return;
        }
    }

    public w4(xh.k kVar, boolean z10, xh.e eVar, String str, boolean z11) {
        this.d = kVar;
        this.f2362b = z10;
        this.e = eVar;
        this.f2364f = str;
        this.f2363c = z11;
    }
}
