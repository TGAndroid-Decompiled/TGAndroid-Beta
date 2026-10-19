package ai;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class s2 implements Utilities.Callback {
    public final int f2141a;
    public final Utilities.Callback f2142b;

    public s2(int i10, Utilities.Callback callback) {
        this.f2141a = i10;
        this.f2142b = callback;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f2141a) {
            case 0:
                this.f2142b.run((TL_stars.StarGift) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                Utilities.Callback callback = this.f2142b;
                if (callback != null) {
                    callback.run(bool);
                    return;
                }
                return;
        }
    }
}
