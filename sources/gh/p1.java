package gh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class p1 implements Utilities.Callback {
    public final int f8702a;
    public final Utilities.Callback f8703b;

    public p1(int i9, Utilities.Callback callback) {
        this.f8702a = i9;
        this.f8703b = callback;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f8702a) {
            case 0:
                this.f8703b.run((TL_stars.StarGift) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                Utilities.Callback callback = this.f8703b;
                if (callback != null) {
                    callback.run(bool);
                    return;
                }
                return;
        }
    }
}
