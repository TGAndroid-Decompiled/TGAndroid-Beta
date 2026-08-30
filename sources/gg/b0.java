package gg;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class b0 implements Runnable {
    public final int f6560a;
    public final Utilities.Callback f6561b;
    public final HashMap f6562c;

    public b0(Utilities.Callback callback, HashMap hashMap, int i10) {
        this.f6560a = i10;
        this.f6561b = callback;
        this.f6562c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f6560a) {
            case 0:
                this.f6561b.run(this.f6562c);
                return;
            default:
                this.f6561b.run(this.f6562c);
                return;
        }
    }
}
