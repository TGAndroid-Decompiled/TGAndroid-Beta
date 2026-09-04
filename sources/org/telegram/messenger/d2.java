package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class d2 implements Runnable {
    public final int f17438a;
    public final Utilities.Callback f17439b;
    public final ArrayList f17440c;

    public d2(Utilities.Callback callback, ArrayList arrayList, int i10) {
        this.f17438a = i10;
        this.f17439b = callback;
        this.f17440c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17438a) {
            case 0:
                this.f17439b.run(this.f17440c);
                return;
            case 1:
                this.f17439b.run(this.f17440c);
                return;
            case 2:
                MediaDataController.lambda$loadStickers$92(this.f17439b, this.f17440c);
                return;
            default:
                this.f17439b.run(this.f17440c);
                return;
        }
    }
}
