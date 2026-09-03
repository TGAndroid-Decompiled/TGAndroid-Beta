package mh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class d3 implements Utilities.Callback2 {
    public final int f13887a;
    public final g5 f13888b;
    public final TL_stars.TL_starGiftUnique f13889c;

    public d3(g5 g5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.f13887a = i10;
        this.f13888b = g5Var;
        this.f13889c = tL_starGiftUnique;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f13887a) {
            case 0:
                g5.i0(this.f13888b, this.f13889c, (mf.a) obj, (Runnable) obj2);
                return;
            case 1:
                g5.g0(this.f13888b, this.f13889c, (Utilities.Callback) obj, (Boolean) obj2);
                return;
            default:
                g5.O0(this.f13888b, this.f13889c, (mf.a) obj, (Runnable) obj2);
                return;
        }
    }
}
