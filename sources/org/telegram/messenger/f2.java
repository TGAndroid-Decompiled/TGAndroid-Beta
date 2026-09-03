package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class f2 implements Runnable {
    public final int f18622a;
    public final Utilities.Callback f18623b;
    public final ArrayList f18624c;

    public f2(Utilities.Callback callback, ArrayList arrayList, int i10) {
        this.f18622a = i10;
        this.f18623b = callback;
        this.f18624c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18622a) {
            case 0:
                this.f18623b.run(this.f18624c);
                return;
            case 1:
                this.f18623b.run(this.f18624c);
                return;
            case 2:
                MediaDataController.lambda$loadStickers$92(this.f18623b, this.f18624c);
                return;
            default:
                this.f18623b.run(this.f18624c);
                return;
        }
    }
}
