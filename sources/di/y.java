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
    public final int f9745a;
    public final long f9746b;
    public final Object f9747c;
    public final Object d;
    public final Object f9748e;

    public y(Object obj, Object obj2, long j3, Object obj3, int i7) {
        this.f9745a = i7;
        this.f9747c = obj;
        this.d = obj2;
        this.f9746b = j3;
        this.f9748e = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9745a) {
            case 0:
                org.telegram.messenger.g0.h3(new bi.r1((e0) this.f9747c, (org.telegram.ui.ActionBar.t1) this.d, tLObject, this.f9746b, (z10) this.f9748e));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new ai.e((c6) this.f9747c, tLObject, (String) this.d, (TL_stars.InputSavedStarGift) this.f9748e, tL_error, this.f9746b));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new bi.r1((u8) this.f9747c, tLObject, (gj) this.d, this.f9746b, (Runnable) this.f9748e, 3));
                return;
            case 3:
                org.telegram.messenger.g0.h3(new bi.r1((org.telegram.ui.ActionBar.t1) this.d, tLObject, this.f9746b, (org.telegram.messenger.c) this.f9747c, (nr) this.f9748e, 14));
                return;
            default:
                org.telegram.messenger.g0.h3(new ai.e((org.telegram.ui.ActionBar.e2) this.f9747c, tLObject, (so) this.d, tL_error, (Runnable) this.f9748e, this.f9746b, 8));
                return;
        }
    }

    public y(Object obj, Object obj2, Object obj3, long j3, int i7) {
        this.f9745a = i7;
        this.f9747c = obj;
        this.d = obj2;
        this.f9748e = obj3;
        this.f9746b = j3;
    }

    public y(org.telegram.ui.ActionBar.t1 t1Var, long j3, org.telegram.messenger.c cVar, nr nrVar) {
        this.f9745a = 3;
        this.d = t1Var;
        this.f9746b = j3;
        this.f9747c = cVar;
        this.f9748e = nrVar;
    }
}
