package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class h2 implements Runnable {
    public final int f17742a;
    public final Utilities.Callback f17743b;
    public final ArrayList f17744c;

    public h2(Utilities.Callback callback, ArrayList arrayList, int i10) {
        this.f17742a = i10;
        this.f17743b = callback;
        this.f17744c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17742a) {
            case 0:
                this.f17743b.run(this.f17744c);
                return;
            case 1:
                this.f17743b.run(this.f17744c);
                return;
            case 2:
                MediaDataController.lambda$loadStickers$92(this.f17743b, this.f17744c);
                return;
            default:
                this.f17743b.run(this.f17744c);
                return;
        }
    }
}
