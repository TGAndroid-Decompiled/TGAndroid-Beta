package lh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class d3 implements Utilities.Callback2 {
    public final int f12277a;
    public final g5 f12278b;
    public final TL_stars.TL_starGiftUnique f12279c;

    public d3(g5 g5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.f12277a = i10;
        this.f12278b = g5Var;
        this.f12279c = tL_starGiftUnique;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f12277a) {
            case 0:
                g5.i0(this.f12278b, this.f12279c, (lf.a) obj, (Runnable) obj2);
                return;
            case 1:
                g5.g0(this.f12278b, this.f12279c, (Utilities.Callback) obj, (Boolean) obj2);
                return;
            default:
                g5.O0(this.f12278b, this.f12279c, (lf.a) obj, (Runnable) obj2);
                return;
        }
    }
}
