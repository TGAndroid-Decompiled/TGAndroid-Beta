package ci;

import org.telegram.messenger.ir;
import org.telegram.messenger.mo;
import org.telegram.messenger.u10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a0 implements RequestDelegate {
    public final int f4787a;
    public final long f4788b;
    public final Object f4789c;
    public final Object d;
    public final Object f4790e;

    public a0(Object obj, Object obj2, long j10, Object obj3, int i3) {
        this.f4787a = i3;
        this.f4789c = obj;
        this.d = obj2;
        this.f4788b = j10;
        this.f4790e = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f4787a) {
            case 0:
                org.telegram.messenger.g0.h3(new ai.z1((i0) this.f4789c, (org.telegram.ui.ActionBar.s1) this.d, tLObject, this.f4788b, (u10) this.f4790e));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new z2((l6) this.f4789c, tLObject, (String) this.d, (TL_stars.InputSavedStarGift) this.f4790e, tL_error, this.f4788b));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new ai.z1((e9) this.f4789c, tLObject, (zi) this.d, this.f4788b, (Runnable) this.f4790e, 3));
                return;
            case 3:
                org.telegram.messenger.g0.h3(new ai.z1((org.telegram.ui.ActionBar.s1) this.d, tLObject, this.f4788b, (org.telegram.messenger.c) this.f4789c, (ir) this.f4790e, 14));
                return;
            default:
                org.telegram.messenger.g0.h3(new z2((org.telegram.ui.ActionBar.d2) this.f4789c, tLObject, (mo) this.d, tL_error, (Runnable) this.f4790e, this.f4788b));
                return;
        }
    }

    public a0(Object obj, Object obj2, Object obj3, long j10, int i3) {
        this.f4787a = i3;
        this.f4789c = obj;
        this.d = obj2;
        this.f4790e = obj3;
        this.f4788b = j10;
    }

    public a0(org.telegram.ui.ActionBar.s1 s1Var, long j10, org.telegram.messenger.c cVar, ir irVar) {
        this.f4787a = 3;
        this.d = s1Var;
        this.f4788b = j10;
        this.f4789c = cVar;
        this.f4790e = irVar;
    }
}
