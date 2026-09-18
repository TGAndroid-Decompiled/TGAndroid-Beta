package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class d2 implements Runnable {
    public final int f16116a;
    public final Utilities.Callback f16117b;
    public final ArrayList f16118c;

    public d2(Utilities.Callback callback, ArrayList arrayList, int i10) {
        this.f16116a = i10;
        this.f16117b = callback;
        this.f16118c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16116a) {
            case 0:
                this.f16117b.run(this.f16118c);
                return;
            case 1:
                this.f16117b.run(this.f16118c);
                return;
            case 2:
                MediaDataController.lambda$loadStickers$92(this.f16117b, this.f16118c);
                return;
            default:
                this.f16117b.run(this.f16118c);
                return;
        }
    }
}
