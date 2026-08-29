package jh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class e3 implements Utilities.Callback2 {
    public final int f11996a;
    public final h5 f11997b;
    public final TL_stars.TL_starGiftUnique f11998c;

    public e3(h5 h5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.f11996a = i10;
        this.f11997b = h5Var;
        this.f11998c = tL_starGiftUnique;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f11996a) {
            case 0:
                h5.i0(this.f11997b, this.f11998c, (kf.a) obj, (Runnable) obj2);
                return;
            case 1:
                h5.g0(this.f11997b, this.f11998c, (Utilities.Callback) obj, (Boolean) obj2);
                return;
            default:
                h5.O0(this.f11997b, this.f11998c, (kf.a) obj, (Runnable) obj2);
                return;
        }
    }
}
