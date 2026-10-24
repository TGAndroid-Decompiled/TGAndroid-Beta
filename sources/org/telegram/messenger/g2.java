package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class g2 implements Runnable {
    public final int f18463a;
    public final Utilities.Callback f18464b;
    public final ArrayList f18465c;

    public g2(Utilities.Callback callback, ArrayList arrayList, int i10) {
        this.f18463a = i10;
        this.f18464b = callback;
        this.f18465c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18463a) {
            case 0:
                this.f18464b.run(this.f18465c);
                return;
            case 1:
                this.f18464b.run(this.f18465c);
                return;
            case 2:
                MediaDataController.lambda$loadStickers$92(this.f18464b, this.f18465c);
                return;
            default:
                this.f18464b.run(this.f18465c);
                return;
        }
    }
}
