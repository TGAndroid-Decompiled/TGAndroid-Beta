package jh;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class r1 implements RequestDelegate {
    public final int f12688a;
    public final h5 f12689b;
    public final TL_stars.TL_starGiftUnique f12690c;
    public final kf.a d;
    public final Runnable f12691e;

    public r1(h5 h5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, kf.a aVar, Runnable runnable, int i10) {
        this.f12688a = i10;
        this.f12689b = h5Var;
        this.f12690c = tL_starGiftUnique;
        this.d = aVar;
        this.f12691e = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f12688a) {
            case 0:
                h5.M0(this.f12689b, this.f12690c, this.d, this.f12691e, tLObject, tL_error);
                return;
            default:
                h5.s0(this.f12689b, this.f12690c, this.d, this.f12691e, tLObject, tL_error);
                return;
        }
    }
}
