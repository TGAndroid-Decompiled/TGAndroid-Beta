package gh;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class t1 implements RequestDelegate {
    public final int f8905a;
    public final k5 f8906b;
    public final TL_stars.TL_starGiftUnique f8907c;
    public final gf.a d;
    public final Runnable f8908e;

    public t1(k5 k5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, gf.a aVar, Runnable runnable, int i9) {
        this.f8905a = i9;
        this.f8906b = k5Var;
        this.f8907c = tL_starGiftUnique;
        this.d = aVar;
        this.f8908e = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f8905a) {
            case 0:
                k5.M0(this.f8906b, this.f8907c, this.d, this.f8908e, tLObject, tL_error);
                return;
            default:
                k5.r0(this.f8906b, this.f8907c, this.d, this.f8908e, tLObject, tL_error);
                return;
        }
    }
}
