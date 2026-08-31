package mh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class m1 implements Utilities.Callback {
    public final int f14440a;
    public final Utilities.Callback f14441b;

    public m1(int i10, Utilities.Callback callback) {
        this.f14440a = i10;
        this.f14441b = callback;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f14440a) {
            case 0:
                this.f14441b.run((TL_stars.StarGift) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                Utilities.Callback callback = this.f14441b;
                if (callback != null) {
                    callback.run(bool);
                    return;
                }
                return;
        }
    }
}
