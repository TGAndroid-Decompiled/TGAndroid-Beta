package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class g2 implements Runnable {
    public final int f18407a;
    public final Utilities.Callback f18408b;
    public final ArrayList f18409c;

    public g2(Utilities.Callback callback, ArrayList arrayList, int i10) {
        this.f18407a = i10;
        this.f18408b = callback;
        this.f18409c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18407a) {
            case 0:
                this.f18408b.run(this.f18409c);
                return;
            case 1:
                this.f18408b.run(this.f18409c);
                return;
            case 2:
                MediaDataController.lambda$loadStickers$92(this.f18408b, this.f18409c);
                return;
            default:
                this.f18408b.run(this.f18409c);
                return;
        }
    }
}
