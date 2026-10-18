package ai;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class q2 implements RequestDelegate {
    public final int f2050a;
    public final k7 f2051b;
    public final TL_stars.TL_starGiftUnique f2052c;
    public final ag.a d;
    public final Runnable e;

    public q2(k7 k7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, ag.a aVar, Runnable runnable, int i10) {
        this.f2050a = i10;
        this.f2051b = k7Var;
        this.f2052c = tL_starGiftUnique;
        this.d = aVar;
        this.e = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f2050a) {
            case 0:
                k7.C0(this.f2051b, this.f2052c, this.d, this.e, tLObject, tL_error);
                return;
            default:
                k7.u0(this.f2051b, this.f2052c, this.d, this.e, tLObject, tL_error);
                return;
        }
    }
}
