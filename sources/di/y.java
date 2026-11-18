package di;

import org.telegram.messenger.fj;
import org.telegram.messenger.lr;
import org.telegram.messenger.ro;
import org.telegram.messenger.x10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class y implements RequestDelegate {
    public final int f10053a;
    public final long f10054b;
    public final Object f10055c;
    public final Object d;
    public final Object f10056e;

    public y(Object obj, Object obj2, long j3, Object obj3, int i7) {
        this.f10053a = i7;
        this.f10055c = obj;
        this.d = obj2;
        this.f10054b = j3;
        this.f10056e = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f10053a) {
            case 0:
                org.telegram.messenger.g0.g3(new bi.k2((e0) this.f10055c, (org.telegram.ui.ActionBar.u1) this.d, tLObject, this.f10054b, (x10) this.f10056e));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new a3((f6) this.f10055c, tLObject, (String) this.d, (TL_stars.InputSavedStarGift) this.f10056e, tL_error, this.f10054b));
                return;
            case 2:
                org.telegram.messenger.g0.g3(new bi.k2((x8) this.f10055c, tLObject, (fj) this.d, this.f10054b, (Runnable) this.f10056e, 3));
                return;
            case 3:
                org.telegram.messenger.g0.g3(new bi.k2((org.telegram.ui.ActionBar.u1) this.d, tLObject, this.f10054b, (org.telegram.messenger.c) this.f10055c, (lr) this.f10056e, 13));
                return;
            default:
                org.telegram.messenger.g0.g3(new a3((org.telegram.ui.ActionBar.h2) this.f10055c, tLObject, (ro) this.d, tL_error, (Runnable) this.f10056e, this.f10054b));
                return;
        }
    }

    public y(Object obj, Object obj2, Object obj3, long j3, int i7) {
        this.f10053a = i7;
        this.f10055c = obj;
        this.d = obj2;
        this.f10056e = obj3;
        this.f10054b = j3;
    }

    public y(org.telegram.ui.ActionBar.u1 u1Var, long j3, org.telegram.messenger.c cVar, lr lrVar) {
        this.f10053a = 3;
        this.d = u1Var;
        this.f10054b = j3;
        this.f10055c = cVar;
        this.f10056e = lrVar;
    }
}
