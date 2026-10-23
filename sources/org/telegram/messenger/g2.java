package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class g2 implements Runnable {
    public final int f18473a;
    public final Utilities.Callback f18474b;
    public final ArrayList f18475c;

    public g2(Utilities.Callback callback, ArrayList arrayList, int i10) {
        this.f18473a = i10;
        this.f18474b = callback;
        this.f18475c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18473a) {
            case 0:
                this.f18474b.run(this.f18475c);
                return;
            case 1:
                this.f18474b.run(this.f18475c);
                return;
            case 2:
                MediaDataController.lambda$loadStickers$92(this.f18474b, this.f18475c);
                return;
            default:
                this.f18474b.run(this.f18475c);
                return;
        }
    }
}
