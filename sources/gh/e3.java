package gh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class e3 implements Utilities.Callback2 {
    public final int f8007a;
    public final k5 f8008b;
    public final TL_stars.TL_starGiftUnique f8009c;

    public e3(k5 k5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i9) {
        this.f8007a = i9;
        this.f8008b = k5Var;
        this.f8009c = tL_starGiftUnique;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f8007a) {
            case 0:
                k5.h0(this.f8008b, this.f8009c, (gf.a) obj, (Runnable) obj2);
                return;
            case 1:
                k5.f0(this.f8008b, this.f8009c, (Utilities.Callback) obj, (Boolean) obj2);
                return;
            default:
                k5.O0(this.f8008b, this.f8009c, (gf.a) obj, (Runnable) obj2);
                return;
        }
    }
}
