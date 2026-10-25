package bi;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class o4 implements Utilities.Callback2 {
    public final int f5170a;
    public final h7 f5171b;
    public final TL_stars.TL_starGiftUnique f5172c;

    public o4(h7 h7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.f5170a = i10;
        this.f5171b = h7Var;
        this.f5172c = tL_starGiftUnique;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f5170a) {
            case 0:
                h7.H0(this.f5171b, this.f5172c, (bg.a) obj, (Runnable) obj2);
                return;
            case 1:
                h7.s1(this.f5171b, this.f5172c, (Utilities.Callback) obj, (Boolean) obj2);
                return;
            default:
                h7.V0(this.f5171b, this.f5172c, (bg.a) obj, (Runnable) obj2);
                return;
        }
    }
}
