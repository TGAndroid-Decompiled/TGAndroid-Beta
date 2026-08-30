package lh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class d3 implements Utilities.Callback2 {
    public final int f12293a;
    public final g5 f12294b;
    public final TL_stars.TL_starGiftUnique f12295c;

    public d3(g5 g5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.f12293a = i10;
        this.f12294b = g5Var;
        this.f12295c = tL_starGiftUnique;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f12293a) {
            case 0:
                g5.i0(this.f12294b, this.f12295c, (mf.a) obj, (Runnable) obj2);
                return;
            case 1:
                g5.g0(this.f12294b, this.f12295c, (Utilities.Callback) obj, (Boolean) obj2);
                return;
            default:
                g5.O0(this.f12294b, this.f12295c, (mf.a) obj, (Runnable) obj2);
                return;
        }
    }
}
