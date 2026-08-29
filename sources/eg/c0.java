package eg;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class c0 implements Runnable {
    public final int f5932a;
    public final Utilities.Callback f5933b;
    public final HashMap f5934c;

    public c0(Utilities.Callback callback, HashMap hashMap, int i10) {
        this.f5932a = i10;
        this.f5933b = callback;
        this.f5934c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f5932a) {
            case 0:
                this.f5933b.run(this.f5934c);
                return;
            default:
                this.f5933b.run(this.f5934c);
                return;
        }
    }
}
