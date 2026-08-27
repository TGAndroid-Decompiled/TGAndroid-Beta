package hh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;

public final class p1 implements Utilities.Callback {

    public final int f9854a;

    public final Utilities.Callback f9855b;

    public p1(int i10, Utilities.Callback callback) {
        this.f9854a = i10;
        this.f9855b = callback;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f9854a) {
            case 0:
                this.f9855b.run((TL_stars.StarGift) obj);
                break;
            default:
                Boolean bool = (Boolean) obj;
                Utilities.Callback callback = this.f9855b;
                if (callback != null) {
                    callback.run(bool);
                }
                break;
        }
    }
}
