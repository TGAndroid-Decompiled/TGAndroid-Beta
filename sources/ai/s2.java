package ai;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class s2 implements RequestDelegate {
    public final int f2134a;
    public final k7 f2135b;
    public final TL_stars.TL_starGiftUnique f2136c;
    public final ag.a d;
    public final Runnable e;

    public s2(k7 k7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, ag.a aVar, Runnable runnable, int i10) {
        this.f2134a = i10;
        this.f2135b = k7Var;
        this.f2136c = tL_starGiftUnique;
        this.d = aVar;
        this.e = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f2134a) {
            case 0:
                k7.F0(this.f2135b, this.f2136c, this.d, this.e, tLObject, tL_error);
                return;
            default:
                k7.v0(this.f2135b, this.f2136c, this.d, this.e, tLObject, tL_error);
                return;
        }
    }
}
