package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class e2 implements Runnable {
    public final int f16243a;
    public final Utilities.Callback f16244b;
    public final ArrayList f16245c;

    public e2(Utilities.Callback callback, ArrayList arrayList, int i10) {
        this.f16243a = i10;
        this.f16244b = callback;
        this.f16245c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16243a) {
            case 0:
                this.f16244b.run(this.f16245c);
                return;
            case 1:
                this.f16244b.run(this.f16245c);
                return;
            case 2:
                MediaDataController.lambda$loadStickers$92(this.f16244b, this.f16245c);
                return;
            default:
                this.f16244b.run(this.f16245c);
                return;
        }
    }
}
