package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class h2 implements Runnable {
    public final int f20218a;
    public final Utilities.Callback f20219b;
    public final ArrayList f20220c;

    public h2(Utilities.Callback callback, ArrayList arrayList, int i10) {
        this.f20218a = i10;
        this.f20219b = callback;
        this.f20220c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20218a) {
            case 0:
                this.f20219b.run(this.f20220c);
                return;
            case 1:
                this.f20219b.run(this.f20220c);
                return;
            case 2:
                MediaDataController.lambda$loadStickers$92(this.f20219b, this.f20220c);
                return;
            default:
                this.f20219b.run(this.f20220c);
                return;
        }
    }
}
