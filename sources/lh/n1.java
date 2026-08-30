package lh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class n1 implements Utilities.Callback {
    public final int f12829a;
    public final Utilities.Callback f12830b;

    public n1(int i10, Utilities.Callback callback) {
        this.f12829a = i10;
        this.f12830b = callback;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f12829a) {
            case 0:
                this.f12830b.run((TL_stars.StarGift) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                Utilities.Callback callback = this.f12830b;
                if (callback != null) {
                    callback.run(bool);
                    return;
                }
                return;
        }
    }
}
