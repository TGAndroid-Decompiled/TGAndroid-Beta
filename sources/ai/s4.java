package ai;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class s4 implements Utilities.Callback2 {
    public final int f2143a;
    public final k7 f2144b;
    public final TL_stars.TL_starGiftUnique f2145c;

    public s4(k7 k7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.f2143a = i10;
        this.f2144b = k7Var;
        this.f2145c = tL_starGiftUnique;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f2143a) {
            case 0:
                k7.E0(this.f2144b, this.f2145c, (ag.a) obj, (Runnable) obj2);
                return;
            case 1:
                k7.r1(this.f2144b, this.f2145c, (Utilities.Callback) obj, (Boolean) obj2);
                return;
            default:
                k7.U0(this.f2144b, this.f2145c, (ag.a) obj, (Runnable) obj2);
                return;
        }
    }
}
