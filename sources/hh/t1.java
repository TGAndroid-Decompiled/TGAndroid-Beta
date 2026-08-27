package hh;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

public final class t1 implements RequestDelegate {

    public final int f10047a;

    public final i5 f10048b;

    public final TL_stars.TL_starGiftUnique f10049c;
    public final hf.a d;

    public final Runnable f10050e;

    public t1(i5 i5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, hf.a aVar, Runnable runnable, int i10) {
        this.f10047a = i10;
        this.f10048b = i5Var;
        this.f10049c = tL_starGiftUnique;
        this.d = aVar;
        this.f10050e = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f10047a) {
            case 0:
                i5.M0(this.f10048b, this.f10049c, this.d, this.f10050e, tLObject, tL_error);
                break;
            default:
                i5.s0(this.f10048b, this.f10049c, this.d, this.f10050e, tLObject, tL_error);
                break;
        }
    }
}
