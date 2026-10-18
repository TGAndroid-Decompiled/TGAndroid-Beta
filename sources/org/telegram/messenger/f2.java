package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class f2 implements Runnable {
    public final int f18337a;
    public final Utilities.Callback f18338b;
    public final ArrayList f18339c;

    public f2(Utilities.Callback callback, ArrayList arrayList, int i10) {
        this.f18337a = i10;
        this.f18338b = callback;
        this.f18339c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18337a) {
            case 0:
                this.f18338b.run(this.f18339c);
                return;
            case 1:
                this.f18338b.run(this.f18339c);
                return;
            case 2:
                MediaDataController.lambda$loadStickers$92(this.f18338b, this.f18339c);
                return;
            default:
                this.f18338b.run(this.f18339c);
                return;
        }
    }
}
