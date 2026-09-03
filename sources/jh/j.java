package jh;

import lh.g5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class j implements RequestDelegate {
    public final int f9424a = 0;
    public final boolean f9425b;
    public final boolean f9426c;
    public final Object d;
    public final Object e;
    public final Object f9427f;

    public j(v vVar, boolean z4, i iVar, String str, boolean z10) {
        this.d = vVar;
        this.f9425b = z4;
        this.e = iVar;
        this.f9427f = str;
        this.f9426c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9424a) {
            case 0:
                AndroidUtilities.runOnUIThread(new k((v) this.d, this.f9425b, (Runnable) this.e, (String) this.f9427f, tL_error, tLObject, this.f9426c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new k((g5) this.d, tLObject, this.f9425b, (TLRPC.Document) this.e, this.f9426c, tL_error, (TL_stars.saveStarGift) this.f9427f));
                return;
        }
    }

    public j(g5 g5Var, boolean z4, TLRPC.Document document, boolean z10, TL_stars.saveStarGift savestargift) {
        this.d = g5Var;
        this.f9425b = z4;
        this.e = document;
        this.f9426c = z10;
        this.f9427f = savestargift;
    }
}
