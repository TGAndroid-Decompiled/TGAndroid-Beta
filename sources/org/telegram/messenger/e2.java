package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class e2 implements Runnable {
    public final int f16251a;
    public final Utilities.Callback f16252b;
    public final ArrayList f16253c;

    public e2(Utilities.Callback callback, ArrayList arrayList, int i10) {
        this.f16251a = i10;
        this.f16252b = callback;
        this.f16253c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16251a) {
            case 0:
                this.f16252b.run(this.f16253c);
                return;
            case 1:
                this.f16252b.run(this.f16253c);
                return;
            case 2:
                MediaDataController.lambda$loadStickers$92(this.f16252b, this.f16253c);
                return;
            default:
                this.f16252b.run(this.f16253c);
                return;
        }
    }
}
