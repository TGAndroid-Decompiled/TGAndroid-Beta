package kh;

import mh.g5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class j implements RequestDelegate {
    public final int f11263a = 0;
    public final boolean f11264b;
    public final boolean f11265c;
    public final Object d;
    public final Object f11266e;
    public final Object f11267f;

    public j(v vVar, boolean z4, i iVar, String str, boolean z10) {
        this.d = vVar;
        this.f11264b = z4;
        this.f11266e = iVar;
        this.f11267f = str;
        this.f11265c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f11263a) {
            case 0:
                AndroidUtilities.runOnUIThread(new k((v) this.d, this.f11264b, (Runnable) this.f11266e, (String) this.f11267f, tL_error, tLObject, this.f11265c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new k((g5) this.d, tLObject, this.f11264b, (TLRPC.Document) this.f11266e, this.f11265c, tL_error, (TL_stars.saveStarGift) this.f11267f));
                return;
        }
    }

    public j(g5 g5Var, boolean z4, TLRPC.Document document, boolean z10, TL_stars.saveStarGift savestargift) {
        this.d = g5Var;
        this.f11264b = z4;
        this.f11266e = document;
        this.f11265c = z10;
        this.f11267f = savestargift;
    }
}
