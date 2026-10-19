package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class f2 implements Runnable {
    public final int f18315a;
    public final Utilities.Callback f18316b;
    public final ArrayList f18317c;

    public f2(Utilities.Callback callback, ArrayList arrayList, int i10) {
        this.f18315a = i10;
        this.f18316b = callback;
        this.f18317c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18315a) {
            case 0:
                this.f18316b.run(this.f18317c);
                return;
            case 1:
                this.f18316b.run(this.f18317c);
                return;
            case 2:
                MediaDataController.lambda$loadStickers$92(this.f18316b, this.f18317c);
                return;
            default:
                this.f18316b.run(this.f18317c);
                return;
        }
    }
}
