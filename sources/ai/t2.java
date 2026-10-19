package ai;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class t2 implements Utilities.Callback {
    public final int f2190a;
    public final Utilities.Callback f2191b;

    public t2(int i10, Utilities.Callback callback) {
        this.f2190a = i10;
        this.f2191b = callback;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f2190a) {
            case 0:
                this.f2191b.run((TL_stars.StarGift) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                Utilities.Callback callback = this.f2191b;
                if (callback != null) {
                    callback.run(bool);
                    return;
                }
                return;
        }
    }
}
