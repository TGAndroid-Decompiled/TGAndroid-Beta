package bg;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class e0 implements Runnable {
    public final int f1739a;
    public final Utilities.Callback f1740b;
    public final HashMap f1741c;

    public e0(Utilities.Callback callback, HashMap hashMap, int i9) {
        this.f1739a = i9;
        this.f1740b = callback;
        this.f1741c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f1739a) {
            case 0:
                this.f1740b.run(this.f1741c);
                return;
            default:
                this.f1740b.run(this.f1741c);
                return;
        }
    }
}
