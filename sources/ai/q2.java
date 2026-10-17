package ai;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class q2 implements Utilities.Callback {
    public final int f2046a;
    public final Utilities.Callback f2047b;

    public q2(int i10, Utilities.Callback callback) {
        this.f2046a = i10;
        this.f2047b = callback;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f2046a) {
            case 0:
                this.f2047b.run((TL_stars.StarGift) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                Utilities.Callback callback = this.f2047b;
                if (callback != null) {
                    callback.run(bool);
                    return;
                }
                return;
        }
    }
}
