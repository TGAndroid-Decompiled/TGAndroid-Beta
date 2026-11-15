package di;

import org.telegram.messenger.gj;
import org.telegram.messenger.nr;
import org.telegram.messenger.so;
import org.telegram.messenger.z10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class y implements RequestDelegate {
    public final int f9756a;
    public final long f9757b;
    public final Object f9758c;
    public final Object d;
    public final Object f9759e;

    public y(Object obj, Object obj2, long j3, Object obj3, int i7) {
        this.f9756a = i7;
        this.f9758c = obj;
        this.d = obj2;
        this.f9757b = j3;
        this.f9759e = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9756a) {
            case 0:
                org.telegram.messenger.g0.h3(new bi.r1((e0) this.f9758c, (org.telegram.ui.ActionBar.t1) this.d, tLObject, this.f9757b, (z10) this.f9759e));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new ai.e((c6) this.f9758c, tLObject, (String) this.d, (TL_stars.InputSavedStarGift) this.f9759e, tL_error, this.f9757b));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new bi.r1((v8) this.f9758c, tLObject, (gj) this.d, this.f9757b, (Runnable) this.f9759e, 3));
                return;
            case 3:
                org.telegram.messenger.g0.h3(new bi.r1((org.telegram.ui.ActionBar.t1) this.d, tLObject, this.f9757b, (org.telegram.messenger.c) this.f9758c, (nr) this.f9759e, 14));
                return;
            default:
                org.telegram.messenger.g0.h3(new ai.e((org.telegram.ui.ActionBar.e2) this.f9758c, tLObject, (so) this.d, tL_error, (Runnable) this.f9759e, this.f9757b, 8));
                return;
        }
    }

    public y(Object obj, Object obj2, Object obj3, long j3, int i7) {
        this.f9756a = i7;
        this.f9758c = obj;
        this.d = obj2;
        this.f9759e = obj3;
        this.f9757b = j3;
    }

    public y(org.telegram.ui.ActionBar.t1 t1Var, long j3, org.telegram.messenger.c cVar, nr nrVar) {
        this.f9756a = 3;
        this.d = t1Var;
        this.f9757b = j3;
        this.f9758c = cVar;
        this.f9759e = nrVar;
    }
}
