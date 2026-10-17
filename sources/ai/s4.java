package ai;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class s4 implements Utilities.Callback2 {
    public final int f2139a;
    public final k7 f2140b;
    public final TL_stars.TL_starGiftUnique f2141c;

    public s4(k7 k7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.f2139a = i10;
        this.f2140b = k7Var;
        this.f2141c = tL_starGiftUnique;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f2139a) {
            case 0:
                k7.F0(this.f2140b, this.f2141c, (ag.a) obj, (Runnable) obj2);
                return;
            case 1:
                k7.q1(this.f2140b, this.f2141c, (Utilities.Callback) obj, (Boolean) obj2);
                return;
            default:
                k7.T0(this.f2140b, this.f2141c, (ag.a) obj, (Runnable) obj2);
                return;
        }
    }
}
