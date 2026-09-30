package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class e2 implements Runnable {
    public final int f16267a;
    public final Utilities.Callback f16268b;
    public final ArrayList f16269c;

    public e2(Utilities.Callback callback, ArrayList arrayList, int i10) {
        this.f16267a = i10;
        this.f16268b = callback;
        this.f16269c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16267a) {
            case 0:
                this.f16268b.run(this.f16269c);
                return;
            case 1:
                this.f16268b.run(this.f16269c);
                return;
            case 2:
                MediaDataController.lambda$loadStickers$92(this.f16268b, this.f16269c);
                return;
            default:
                this.f16268b.run(this.f16269c);
                return;
        }
    }
}
