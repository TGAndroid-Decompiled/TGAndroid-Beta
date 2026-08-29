package hh;

import jh.h5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class j implements RequestDelegate {
    public final int f8079a = 0;
    public final boolean f8080b;
    public final boolean f8081c;
    public final Object d;
    public final Object f8082e;
    public final Object f8083f;

    public j(v vVar, boolean z10, i iVar, String str, boolean z11) {
        this.d = vVar;
        this.f8080b = z10;
        this.f8082e = iVar;
        this.f8083f = str;
        this.f8081c = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f8079a) {
            case 0:
                AndroidUtilities.runOnUIThread(new k((v) this.d, this.f8080b, (Runnable) this.f8082e, (String) this.f8083f, tL_error, tLObject, this.f8081c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new k((h5) this.d, tLObject, this.f8080b, (TLRPC.Document) this.f8082e, this.f8081c, tL_error, (TL_stars.saveStarGift) this.f8083f));
                return;
        }
    }

    public j(h5 h5Var, boolean z10, TLRPC.Document document, boolean z11, TL_stars.saveStarGift savestargift) {
        this.d = h5Var;
        this.f8080b = z10;
        this.f8082e = document;
        this.f8081c = z11;
        this.f8083f = savestargift;
    }
}
