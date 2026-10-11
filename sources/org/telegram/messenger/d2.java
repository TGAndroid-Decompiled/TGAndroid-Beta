package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class d2 implements Runnable {
    public final int f17645a;
    public final Utilities.Callback f17646b;
    public final ArrayList f17647c;

    public d2(Utilities.Callback callback, ArrayList arrayList, int i10) {
        this.f17645a = i10;
        this.f17646b = callback;
        this.f17647c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17645a) {
            case 0:
                this.f17646b.run(this.f17647c);
                return;
            case 1:
                this.f17646b.run(this.f17647c);
                return;
            case 2:
                MediaDataController.lambda$loadStickers$92(this.f17646b, this.f17647c);
                return;
            default:
                this.f17646b.run(this.f17647c);
                return;
        }
    }
}
