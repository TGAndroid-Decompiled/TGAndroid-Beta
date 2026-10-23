package ai;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class t2 implements RequestDelegate {
    public final int f2185a;
    public final l7 f2186b;
    public final TL_stars.TL_starGiftUnique f2187c;
    public final ag.a d;
    public final Runnable e;

    public t2(l7 l7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, ag.a aVar, Runnable runnable, int i10) {
        this.f2185a = i10;
        this.f2186b = l7Var;
        this.f2187c = tL_starGiftUnique;
        this.d = aVar;
        this.e = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f2185a) {
            case 0:
                l7.D0(this.f2186b, this.f2187c, this.d, this.e, tLObject, tL_error);
                return;
            default:
                l7.s0(this.f2186b, this.f2187c, this.d, this.e, tLObject, tL_error);
                return;
        }
    }
}
