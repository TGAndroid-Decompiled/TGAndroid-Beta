package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class h2 implements Runnable {
    public final int f17743a;
    public final Utilities.Callback f17744b;
    public final ArrayList f17745c;

    public h2(Utilities.Callback callback, ArrayList arrayList, int i10) {
        this.f17743a = i10;
        this.f17744b = callback;
        this.f17745c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17743a) {
            case 0:
                this.f17744b.run(this.f17745c);
                return;
            case 1:
                this.f17744b.run(this.f17745c);
                return;
            case 2:
                MediaDataController.lambda$loadStickers$92(this.f17744b, this.f17745c);
                return;
            default:
                this.f17744b.run(this.f17745c);
                return;
        }
    }
}
