package bi;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class q2 implements RequestDelegate {
    public final int f5257a;
    public final h7 f5258b;
    public final TL_stars.TL_starGiftUnique f5259c;
    public final bg.a d;
    public final Runnable e;

    public q2(h7 h7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, bg.a aVar, Runnable runnable, int i10) {
        this.f5257a = i10;
        this.f5258b = h7Var;
        this.f5259c = tL_starGiftUnique;
        this.d = aVar;
        this.e = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f5257a) {
            case 0:
                h7.D0(this.f5258b, this.f5259c, this.d, this.e, tLObject, tL_error);
                return;
            default:
                h7.s0(this.f5258b, this.f5259c, this.d, this.e, tLObject, tL_error);
                return;
        }
    }
}
