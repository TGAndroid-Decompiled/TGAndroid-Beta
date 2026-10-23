package ai;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class s2 implements Utilities.Callback {
    public final int f2144a;
    public final Utilities.Callback f2145b;

    public s2(int i10, Utilities.Callback callback) {
        this.f2144a = i10;
        this.f2145b = callback;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f2144a) {
            case 0:
                this.f2145b.run((TL_stars.StarGift) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                Utilities.Callback callback = this.f2145b;
                if (callback != null) {
                    callback.run(bool);
                    return;
                }
                return;
        }
    }
}
