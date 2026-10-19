package ai;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class u2 implements RequestDelegate {
    public final int f2236a;
    public final k7 f2237b;
    public final TL_stars.TL_starGiftUnique f2238c;
    public final ag.a d;
    public final Runnable e;

    public u2(k7 k7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, ag.a aVar, Runnable runnable, int i10) {
        this.f2236a = i10;
        this.f2237b = k7Var;
        this.f2238c = tL_starGiftUnique;
        this.d = aVar;
        this.e = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f2236a) {
            case 0:
                k7.z0(this.f2237b, this.f2238c, this.d, this.e, tLObject, tL_error);
                return;
            default:
                k7.s0(this.f2237b, this.f2238c, this.d, this.e, tLObject, tL_error);
                return;
        }
    }
}
