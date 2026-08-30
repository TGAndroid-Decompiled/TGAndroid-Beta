package lh;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class r1 implements RequestDelegate {
    public final int f13001a;
    public final g5 f13002b;
    public final TL_stars.TL_starGiftUnique f13003c;
    public final mf.a d;
    public final Runnable e;

    public r1(g5 g5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, mf.a aVar, Runnable runnable, int i10) {
        this.f13001a = i10;
        this.f13002b = g5Var;
        this.f13003c = tL_starGiftUnique;
        this.d = aVar;
        this.e = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f13001a) {
            case 0:
                g5.M0(this.f13002b, this.f13003c, this.d, this.e, tLObject, tL_error);
                return;
            default:
                g5.s0(this.f13002b, this.f13003c, this.d, this.e, tLObject, tL_error);
                return;
        }
    }
}
