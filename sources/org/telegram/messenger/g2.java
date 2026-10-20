package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class g2 implements Runnable {
    public final int f18405a;
    public final Utilities.Callback f18406b;
    public final ArrayList f18407c;

    public g2(Utilities.Callback callback, ArrayList arrayList, int i10) {
        this.f18405a = i10;
        this.f18406b = callback;
        this.f18407c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18405a) {
            case 0:
                this.f18406b.run(this.f18407c);
                return;
            case 1:
                this.f18406b.run(this.f18407c);
                return;
            case 2:
                MediaDataController.lambda$loadStickers$92(this.f18406b, this.f18407c);
                return;
            default:
                this.f18406b.run(this.f18407c);
                return;
        }
    }
}
