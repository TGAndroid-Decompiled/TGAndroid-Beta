package ai;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class r2 implements RequestDelegate {
    public final int f2092a;
    public final k7 f2093b;
    public final TL_stars.TL_starGiftUnique f2094c;
    public final ag.a d;
    public final Runnable e;

    public r2(k7 k7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, ag.a aVar, Runnable runnable, int i10) {
        this.f2092a = i10;
        this.f2093b = k7Var;
        this.f2094c = tL_starGiftUnique;
        this.d = aVar;
        this.e = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f2092a) {
            case 0:
                k7.D0(this.f2093b, this.f2094c, this.d, this.e, tLObject, tL_error);
                return;
            default:
                k7.w0(this.f2093b, this.f2094c, this.d, this.e, tLObject, tL_error);
                return;
        }
    }
}
