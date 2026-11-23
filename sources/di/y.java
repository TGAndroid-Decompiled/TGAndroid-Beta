package di;

import org.telegram.messenger.fj;
import org.telegram.messenger.lr;
import org.telegram.messenger.ro;
import org.telegram.messenger.w10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class y implements RequestDelegate {
    public final int f10017a;
    public final long f10018b;
    public final Object f10019c;
    public final Object d;
    public final Object f10020e;

    public y(Object obj, Object obj2, long j3, Object obj3, int i7) {
        this.f10017a = i7;
        this.f10019c = obj;
        this.d = obj2;
        this.f10018b = j3;
        this.f10020e = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f10017a) {
            case 0:
                org.telegram.messenger.g0.g3(new bi.q2((e0) this.f10019c, (org.telegram.ui.ActionBar.t1) this.d, tLObject, this.f10018b, (w10) this.f10020e));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new a3((f6) this.f10019c, tLObject, (String) this.d, (TL_stars.InputSavedStarGift) this.f10020e, tL_error, this.f10018b));
                return;
            case 2:
                org.telegram.messenger.g0.g3(new bi.q2((y8) this.f10019c, tLObject, (fj) this.d, this.f10018b, (Runnable) this.f10020e, 3));
                return;
            case 3:
                org.telegram.messenger.g0.g3(new bi.q2((org.telegram.ui.ActionBar.t1) this.d, tLObject, this.f10018b, (org.telegram.messenger.c) this.f10019c, (lr) this.f10020e, 13));
                return;
            default:
                org.telegram.messenger.g0.g3(new a3((org.telegram.ui.ActionBar.g2) this.f10019c, tLObject, (ro) this.d, tL_error, (Runnable) this.f10020e, this.f10018b));
                return;
        }
    }

    public y(Object obj, Object obj2, Object obj3, long j3, int i7) {
        this.f10017a = i7;
        this.f10019c = obj;
        this.d = obj2;
        this.f10020e = obj3;
        this.f10018b = j3;
    }

    public y(org.telegram.ui.ActionBar.t1 t1Var, long j3, org.telegram.messenger.c cVar, lr lrVar) {
        this.f10017a = 3;
        this.d = t1Var;
        this.f10018b = j3;
        this.f10019c = cVar;
        this.f10020e = lrVar;
    }
}
