package bi;

import org.telegram.messenger.c20;
import org.telegram.messenger.ij;
import org.telegram.messenger.qr;
import org.telegram.messenger.vo;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class f0 implements RequestDelegate {
    public final int f3841a;
    public final long f3842b;
    public final Object f3843c;
    public final Object d;
    public final Object f3844e;

    public f0(Object obj, Object obj2, long j3, Object obj3, int i7) {
        this.f3841a = i7;
        this.f3843c = obj;
        this.d = obj2;
        this.f3842b = j3;
        this.f3844e = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f3841a) {
            case 0:
                org.telegram.messenger.g0.h3(new i0((n0) this.f3843c, (org.telegram.ui.ActionBar.u1) this.d, tLObject, this.f3842b, (c20) this.f3844e, 0));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new m3((k7) this.f3843c, tLObject, (String) this.d, (TL_stars.InputSavedStarGift) this.f3844e, tL_error, this.f3842b));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new i0((ea) this.f3843c, tLObject, (ij) this.d, this.f3842b, (Runnable) this.f3844e));
                return;
            case 3:
                org.telegram.messenger.g0.h3(new i0((org.telegram.ui.ActionBar.u1) this.d, tLObject, this.f3842b, (org.telegram.messenger.c) this.f3843c, (qr) this.f3844e));
                return;
            default:
                org.telegram.messenger.g0.h3(new m3((org.telegram.ui.ActionBar.f2) this.f3843c, tLObject, (vo) this.d, tL_error, (Runnable) this.f3844e, this.f3842b));
                return;
        }
    }

    public f0(Object obj, Object obj2, Object obj3, long j3, int i7) {
        this.f3841a = i7;
        this.f3843c = obj;
        this.d = obj2;
        this.f3844e = obj3;
        this.f3842b = j3;
    }

    public f0(org.telegram.ui.ActionBar.u1 u1Var, long j3, org.telegram.messenger.c cVar, qr qrVar) {
        this.f3841a = 3;
        this.d = u1Var;
        this.f3842b = j3;
        this.f3843c = cVar;
        this.f3844e = qrVar;
    }
}
