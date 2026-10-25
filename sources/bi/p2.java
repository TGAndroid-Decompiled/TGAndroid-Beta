package bi;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class p2 implements Utilities.Callback {
    public final int f5220a;
    public final Utilities.Callback f5221b;

    public p2(int i10, Utilities.Callback callback) {
        this.f5220a = i10;
        this.f5221b = callback;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f5220a) {
            case 0:
                this.f5221b.run((TL_stars.StarGift) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                Utilities.Callback callback = this.f5221b;
                if (callback != null) {
                    callback.run(bool);
                    return;
                }
                return;
        }
    }
}
