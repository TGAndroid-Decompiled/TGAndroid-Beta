package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class x4 implements RequestDelegate {
    public final int f2431a = 0;
    public final boolean f2432b;
    public final boolean f2433c;
    public final Object d;
    public final Object e;
    public final Object f2434f;

    public x4(l7 l7Var, boolean z10, TLRPC.Document document, boolean z11, TL_stars.saveStarGift savestargift) {
        this.d = l7Var;
        this.f2432b = z10;
        this.e = document;
        this.f2433c = z11;
        this.f2434f = savestargift;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f2431a) {
            case 0:
                AndroidUtilities.runOnUIThread(new r2((l7) this.d, tLObject, this.f2432b, (TLRPC.Document) this.e, this.f2433c, tL_error, (TL_stars.saveStarGift) this.f2434f));
                return;
            default:
                AndroidUtilities.runOnUIThread(new r2((xh.k) this.d, this.f2432b, (Runnable) this.e, (String) this.f2434f, tL_error, tLObject, this.f2433c));
                return;
        }
    }

    public x4(xh.k kVar, boolean z10, xh.e eVar, String str, boolean z11) {
        this.d = kVar;
        this.f2432b = z10;
        this.e = eVar;
        this.f2434f = str;
        this.f2433c = z11;
    }
}
