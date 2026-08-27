package fh;

import hh.i5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

public final class j implements RequestDelegate {

    public final int f6132a = 0;

    public final boolean f6133b;

    public final boolean f6134c;
    public final Object d;

    public final Object f6135e;

    public final Object f6136f;

    public j(v vVar, boolean z10, i iVar, String str, boolean z11) {
        this.d = vVar;
        this.f6133b = z10;
        this.f6135e = iVar;
        this.f6136f = str;
        this.f6134c = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f6132a) {
            case 0:
                AndroidUtilities.runOnUIThread(new k((v) this.d, this.f6133b, (Runnable) this.f6135e, (String) this.f6136f, tL_error, tLObject, this.f6134c));
                break;
            default:
                AndroidUtilities.runOnUIThread(new k((i5) this.d, tLObject, this.f6133b, (TLRPC.Document) this.f6135e, this.f6134c, tL_error, (TL_stars.saveStarGift) this.f6136f));
                break;
        }
    }

    public j(i5 i5Var, boolean z10, TLRPC.Document document, boolean z11, TL_stars.saveStarGift savestargift) {
        this.d = i5Var;
        this.f6133b = z10;
        this.f6135e = document;
        this.f6134c = z11;
        this.f6136f = savestargift;
    }
}
