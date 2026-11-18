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
    public final int f10050a;
    public final long f10051b;
    public final Object f10052c;
    public final Object d;
    public final Object f10053e;

    public y(Object obj, Object obj2, long j3, Object obj3, int i7) {
        this.f10050a = i7;
        this.f10052c = obj;
        this.d = obj2;
        this.f10051b = j3;
        this.f10053e = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f10050a) {
            case 0:
                org.telegram.messenger.g0.g3(new bi.k2((e0) this.f10052c, (org.telegram.ui.ActionBar.u1) this.d, tLObject, this.f10051b, (x10) this.f10053e));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new a3((f6) this.f10052c, tLObject, (String) this.d, (TL_stars.InputSavedStarGift) this.f10053e, tL_error, this.f10051b));
                return;
            case 2:
                org.telegram.messenger.g0.g3(new bi.k2((x8) this.f10052c, tLObject, (fj) this.d, this.f10051b, (Runnable) this.f10053e, 3));
                return;
            case 3:
                org.telegram.messenger.g0.g3(new bi.k2((org.telegram.ui.ActionBar.u1) this.d, tLObject, this.f10051b, (org.telegram.messenger.c) this.f10052c, (lr) this.f10053e, 13));
                return;
            default:
                org.telegram.messenger.g0.g3(new a3((org.telegram.ui.ActionBar.h2) this.f10052c, tLObject, (ro) this.d, tL_error, (Runnable) this.f10053e, this.f10051b));
                return;
        }
    }

    public y(Object obj, Object obj2, Object obj3, long j3, int i7) {
        this.f10050a = i7;
        this.f10052c = obj;
        this.d = obj2;
        this.f10053e = obj3;
        this.f10051b = j3;
    }

    public y(org.telegram.ui.ActionBar.u1 u1Var, long j3, org.telegram.messenger.c cVar, lr lrVar) {
        this.f10050a = 3;
        this.d = u1Var;
        this.f10051b = j3;
        this.f10052c = cVar;
        this.f10053e = lrVar;
    }
}
