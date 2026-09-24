package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class e2 implements Runnable {
    public final int f16228a;
    public final Utilities.Callback f16229b;
    public final ArrayList f16230c;

    public e2(Utilities.Callback callback, ArrayList arrayList, int i10) {
        this.f16228a = i10;
        this.f16229b = callback;
        this.f16230c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16228a) {
            case 0:
                this.f16229b.run(this.f16230c);
                return;
            case 1:
                this.f16229b.run(this.f16230c);
                return;
            case 2:
                MediaDataController.lambda$loadStickers$92(this.f16229b, this.f16230c);
                return;
            default:
                this.f16229b.run(this.f16230c);
                return;
        }
    }
}
