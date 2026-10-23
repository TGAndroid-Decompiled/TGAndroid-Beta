package ai;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class t4 implements Utilities.Callback2 {
    public final int f2191a;
    public final l7 f2192b;
    public final TL_stars.TL_starGiftUnique f2193c;

    public t4(l7 l7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.f2191a = i10;
        this.f2192b = l7Var;
        this.f2193c = tL_starGiftUnique;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f2191a) {
            case 0:
                l7.H0(this.f2192b, this.f2193c, (ag.a) obj, (Runnable) obj2);
                return;
            case 1:
                l7.s1(this.f2192b, this.f2193c, (Utilities.Callback) obj, (Boolean) obj2);
                return;
            default:
                l7.V0(this.f2192b, this.f2193c, (ag.a) obj, (Runnable) obj2);
                return;
        }
    }
}
