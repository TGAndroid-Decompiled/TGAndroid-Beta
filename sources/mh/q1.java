package mh;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class q1 implements RequestDelegate {
    public final int f14619a;
    public final g5 f14620b;
    public final TL_stars.TL_starGiftUnique f14621c;
    public final mf.a d;
    public final Runnable f14622e;

    public q1(g5 g5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, mf.a aVar, Runnable runnable, int i10) {
        this.f14619a = i10;
        this.f14620b = g5Var;
        this.f14621c = tL_starGiftUnique;
        this.d = aVar;
        this.f14622e = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f14619a) {
            case 0:
                g5.M0(this.f14620b, this.f14621c, this.d, this.f14622e, tLObject, tL_error);
                return;
            default:
                g5.s0(this.f14620b, this.f14621c, this.d, this.f14622e, tLObject, tL_error);
                return;
        }
    }
}
