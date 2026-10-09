package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class e2 implements Runnable {
    public final int f17693a;
    public final Utilities.Callback f17694b;
    public final ArrayList f17695c;

    public e2(Utilities.Callback callback, ArrayList arrayList, int i10) {
        this.f17693a = i10;
        this.f17694b = callback;
        this.f17695c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17693a) {
            case 0:
                this.f17694b.run(this.f17695c);
                return;
            case 1:
                this.f17694b.run(this.f17695c);
                return;
            case 2:
                MediaDataController.lambda$loadStickers$92(this.f17694b, this.f17695c);
                return;
            default:
                this.f17694b.run(this.f17695c);
                return;
        }
    }
}
