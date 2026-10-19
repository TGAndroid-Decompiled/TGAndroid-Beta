package ai;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class t4 implements Utilities.Callback2 {
    public final int f2188a;
    public final l7 f2189b;
    public final TL_stars.TL_starGiftUnique f2190c;

    public t4(l7 l7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.f2188a = i10;
        this.f2189b = l7Var;
        this.f2190c = tL_starGiftUnique;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f2188a) {
            case 0:
                l7.I0(this.f2189b, this.f2190c, (ag.a) obj, (Runnable) obj2);
                return;
            case 1:
                l7.t1(this.f2189b, this.f2190c, (Utilities.Callback) obj, (Boolean) obj2);
                return;
            default:
                l7.W0(this.f2189b, this.f2190c, (ag.a) obj, (Runnable) obj2);
                return;
        }
    }
}
