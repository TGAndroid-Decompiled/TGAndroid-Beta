package cg;

import java.util.HashMap;
import org.telegram.messenger.Utilities;

public final class b0 implements Runnable {

    public final int f2607a;

    public final Utilities.Callback f2608b;

    public final HashMap f2609c;

    public b0(Utilities.Callback callback, HashMap map, int i10) {
        this.f2607a = i10;
        this.f2608b = callback;
        this.f2609c = map;
    }

    @Override
    public final void run() {
        switch (this.f2607a) {
            case 0:
                this.f2608b.run(this.f2609c);
                break;
            default:
                this.f2608b.run(this.f2609c);
                break;
        }
    }
}
