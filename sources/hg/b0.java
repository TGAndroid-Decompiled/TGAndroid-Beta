package hg;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class b0 implements Runnable {
    public final int f7399a;
    public final Utilities.Callback f7400b;
    public final HashMap f7401c;

    public b0(Utilities.Callback callback, HashMap hashMap, int i10) {
        this.f7399a = i10;
        this.f7400b = callback;
        this.f7401c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f7399a) {
            case 0:
                this.f7400b.run(this.f7401c);
                return;
            default:
                this.f7400b.run(this.f7401c);
                return;
        }
    }
}
