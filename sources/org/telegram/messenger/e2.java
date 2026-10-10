package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class e2 implements Runnable {
    public final int f17697a;
    public final Utilities.Callback f17698b;
    public final ArrayList f17699c;

    public e2(Utilities.Callback callback, ArrayList arrayList, int i10) {
        this.f17697a = i10;
        this.f17698b = callback;
        this.f17699c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17697a) {
            case 0:
                this.f17698b.run(this.f17699c);
                return;
            case 1:
                this.f17698b.run(this.f17699c);
                return;
            case 2:
                MediaDataController.lambda$loadStickers$92(this.f17698b, this.f17699c);
                return;
            default:
                this.f17698b.run(this.f17699c);
                return;
        }
    }
}
