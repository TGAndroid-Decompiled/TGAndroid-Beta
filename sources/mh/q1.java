package mh;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class q1 implements RequestDelegate {
    public final int f14617a;
    public final g5 f14618b;
    public final TL_stars.TL_starGiftUnique f14619c;
    public final mf.a d;
    public final Runnable f14620e;

    public q1(g5 g5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, mf.a aVar, Runnable runnable, int i10) {
        this.f14617a = i10;
        this.f14618b = g5Var;
        this.f14619c = tL_starGiftUnique;
        this.d = aVar;
        this.f14620e = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f14617a) {
            case 0:
                g5.M0(this.f14618b, this.f14619c, this.d, this.f14620e, tLObject, tL_error);
                return;
            default:
                g5.s0(this.f14618b, this.f14619c, this.d, this.f14620e, tLObject, tL_error);
                return;
        }
    }
}
