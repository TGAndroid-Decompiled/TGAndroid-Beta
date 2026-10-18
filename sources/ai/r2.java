package ai;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class r2 implements Utilities.Callback {
    public final int f2096a;
    public final Utilities.Callback f2097b;

    public r2(int i10, Utilities.Callback callback) {
        this.f2096a = i10;
        this.f2097b = callback;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f2096a) {
            case 0:
                this.f2097b.run((TL_stars.StarGift) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                Utilities.Callback callback = this.f2097b;
                if (callback != null) {
                    callback.run(bool);
                    return;
                }
                return;
        }
    }
}
