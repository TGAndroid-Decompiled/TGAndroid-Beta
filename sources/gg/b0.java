package gg;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class b0 implements Runnable {
    public final int f6547a;
    public final Utilities.Callback f6548b;
    public final HashMap f6549c;

    public b0(Utilities.Callback callback, HashMap hashMap, int i10) {
        this.f6547a = i10;
        this.f6548b = callback;
        this.f6549c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f6547a) {
            case 0:
                this.f6548b.run(this.f6549c);
                return;
            default:
                this.f6548b.run(this.f6549c);
                return;
        }
    }
}
