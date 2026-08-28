package eh;

import gh.k5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class k implements RequestDelegate {
    public final int f5203a = 0;
    public final boolean f5204b;
    public final boolean f5205c;
    public final Object d;
    public final Object f5206e;
    public final Object f5207f;

    public k(x xVar, boolean z10, i iVar, String str, boolean z11) {
        this.d = xVar;
        this.f5204b = z10;
        this.f5206e = iVar;
        this.f5207f = str;
        this.f5205c = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f5203a) {
            case 0:
                AndroidUtilities.runOnUIThread(new m((x) this.d, this.f5204b, (Runnable) this.f5206e, (String) this.f5207f, tL_error, tLObject, this.f5205c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new m((k5) this.d, tLObject, this.f5204b, (TLRPC.Document) this.f5206e, this.f5205c, tL_error, (TL_stars.saveStarGift) this.f5207f));
                return;
        }
    }

    public k(k5 k5Var, boolean z10, TLRPC.Document document, boolean z11, TL_stars.saveStarGift savestargift) {
        this.d = k5Var;
        this.f5204b = z10;
        this.f5206e = document;
        this.f5205c = z11;
        this.f5207f = savestargift;
    }
}
