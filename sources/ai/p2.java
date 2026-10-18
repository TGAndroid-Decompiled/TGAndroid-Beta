package ai;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class p2 implements Utilities.Callback {
    public final int f1999a;
    public final Utilities.Callback f2000b;

    public p2(int i10, Utilities.Callback callback) {
        this.f1999a = i10;
        this.f2000b = callback;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f1999a) {
            case 0:
                this.f2000b.run((TL_stars.StarGift) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                Utilities.Callback callback = this.f2000b;
                if (callback != null) {
                    callback.run(bool);
                    return;
                }
                return;
        }
    }
}
