package ai;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class t4 implements Utilities.Callback2 {
    public final int f2197a;
    public final k7 f2198b;
    public final TL_stars.TL_starGiftUnique f2199c;

    public t4(k7 k7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.f2197a = i10;
        this.f2198b = k7Var;
        this.f2199c = tL_starGiftUnique;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f2197a) {
            case 0:
                k7.D0(this.f2198b, this.f2199c, (ag.a) obj, (Runnable) obj2);
                return;
            case 1:
                k7.u1(this.f2198b, this.f2199c, (Utilities.Callback) obj, (Boolean) obj2);
                return;
            default:
                k7.R0(this.f2198b, this.f2199c, (ag.a) obj, (Runnable) obj2);
                return;
        }
    }
}
