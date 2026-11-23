package di;

import org.telegram.messenger.gj;
import org.telegram.messenger.mr;
import org.telegram.messenger.so;
import org.telegram.messenger.y10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class y implements RequestDelegate {
    public final int f10019a;
    public final long f10020b;
    public final Object f10021c;
    public final Object d;
    public final Object f10022e;

    public y(Object obj, Object obj2, long j3, Object obj3, int i7) {
        this.f10019a = i7;
        this.f10021c = obj;
        this.d = obj2;
        this.f10020b = j3;
        this.f10022e = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f10019a) {
            case 0:
                org.telegram.messenger.g0.g3(new bi.q2((e0) this.f10021c, (org.telegram.ui.ActionBar.t1) this.d, tLObject, this.f10020b, (y10) this.f10022e));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new a3((f6) this.f10021c, tLObject, (String) this.d, (TL_stars.InputSavedStarGift) this.f10022e, tL_error, this.f10020b));
                return;
            case 2:
                org.telegram.messenger.g0.g3(new bi.q2((y8) this.f10021c, tLObject, (gj) this.d, this.f10020b, (Runnable) this.f10022e, 3));
                return;
            case 3:
                org.telegram.messenger.g0.g3(new bi.q2((org.telegram.ui.ActionBar.t1) this.d, tLObject, this.f10020b, (org.telegram.messenger.c) this.f10021c, (mr) this.f10022e, 13));
                return;
            default:
                org.telegram.messenger.g0.g3(new a3((org.telegram.ui.ActionBar.g2) this.f10021c, tLObject, (so) this.d, tL_error, (Runnable) this.f10022e, this.f10020b));
                return;
        }
    }

    public y(Object obj, Object obj2, Object obj3, long j3, int i7) {
        this.f10019a = i7;
        this.f10021c = obj;
        this.d = obj2;
        this.f10022e = obj3;
        this.f10020b = j3;
    }

    public y(org.telegram.ui.ActionBar.t1 t1Var, long j3, org.telegram.messenger.c cVar, mr mrVar) {
        this.f10019a = 3;
        this.d = t1Var;
        this.f10020b = j3;
        this.f10021c = cVar;
        this.f10022e = mrVar;
    }
}
