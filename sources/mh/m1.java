package mh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class m1 implements Utilities.Callback {
    public final int f14442a;
    public final Utilities.Callback f14443b;

    public m1(int i10, Utilities.Callback callback) {
        this.f14442a = i10;
        this.f14443b = callback;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f14442a) {
            case 0:
                this.f14443b.run((TL_stars.StarGift) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                Utilities.Callback callback = this.f14443b;
                if (callback != null) {
                    callback.run(bool);
                    return;
                }
                return;
        }
    }
}
