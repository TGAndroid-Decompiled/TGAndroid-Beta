package hh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;

public final class e3 implements Utilities.Callback2 {

    public final int f9163a;

    public final i5 f9164b;

    public final TL_stars.TL_starGiftUnique f9165c;

    public e3(i5 i5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.f9163a = i10;
        this.f9164b = i5Var;
        this.f9165c = tL_starGiftUnique;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f9163a) {
            case 0:
                i5.i0(this.f9164b, this.f9165c, (hf.a) obj, (Runnable) obj2);
                break;
            case 1:
                i5.g0(this.f9164b, this.f9165c, (Utilities.Callback) obj, (Boolean) obj2);
                break;
            default:
                i5.O0(this.f9164b, this.f9165c, (hf.a) obj, (Runnable) obj2);
                break;
        }
    }
}
