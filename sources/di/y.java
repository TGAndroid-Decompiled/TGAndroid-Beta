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
    public final int f10056a;
    public final long f10057b;
    public final Object f10058c;
    public final Object d;
    public final Object f10059e;

    public y(Object obj, Object obj2, long j3, Object obj3, int i7) {
        this.f10056a = i7;
        this.f10058c = obj;
        this.d = obj2;
        this.f10057b = j3;
        this.f10059e = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f10056a) {
            case 0:
                org.telegram.messenger.g0.g3(new bi.o2((e0) this.f10058c, (org.telegram.ui.ActionBar.t1) this.d, tLObject, this.f10057b, (y10) this.f10059e));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new a3((f6) this.f10058c, tLObject, (String) this.d, (TL_stars.InputSavedStarGift) this.f10059e, tL_error, this.f10057b));
                return;
            case 2:
                org.telegram.messenger.g0.g3(new bi.o2((y8) this.f10058c, tLObject, (gj) this.d, this.f10057b, (Runnable) this.f10059e, 3));
                return;
            case 3:
                org.telegram.messenger.g0.g3(new bi.o2((org.telegram.ui.ActionBar.t1) this.d, tLObject, this.f10057b, (org.telegram.messenger.c) this.f10058c, (mr) this.f10059e, 13));
                return;
            default:
                org.telegram.messenger.g0.g3(new a3((org.telegram.ui.ActionBar.g2) this.f10058c, tLObject, (so) this.d, tL_error, (Runnable) this.f10059e, this.f10057b));
                return;
        }
    }

    public y(Object obj, Object obj2, Object obj3, long j3, int i7) {
        this.f10056a = i7;
        this.f10058c = obj;
        this.d = obj2;
        this.f10059e = obj3;
        this.f10057b = j3;
    }

    public y(org.telegram.ui.ActionBar.t1 t1Var, long j3, org.telegram.messenger.c cVar, mr mrVar) {
        this.f10056a = 3;
        this.d = t1Var;
        this.f10057b = j3;
        this.f10058c = cVar;
        this.f10059e = mrVar;
    }
}
