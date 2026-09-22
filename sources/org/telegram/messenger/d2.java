package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class d2 implements Runnable {
    public final int f16171a;
    public final Utilities.Callback f16172b;
    public final ArrayList f16173c;

    public d2(Utilities.Callback callback, ArrayList arrayList, int i10) {
        this.f16171a = i10;
        this.f16172b = callback;
        this.f16173c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16171a) {
            case 0:
                this.f16172b.run(this.f16173c);
                return;
            case 1:
                this.f16172b.run(this.f16173c);
                return;
            case 2:
                MediaDataController.lambda$loadStickers$92(this.f16172b, this.f16173c);
                return;
            default:
                this.f16172b.run(this.f16173c);
                return;
        }
    }
}
