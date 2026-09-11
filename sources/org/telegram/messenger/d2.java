package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class d2 implements Runnable {
    public final int f17437a;
    public final Utilities.Callback f17438b;
    public final ArrayList f17439c;

    public d2(Utilities.Callback callback, ArrayList arrayList, int i10) {
        this.f17437a = i10;
        this.f17438b = callback;
        this.f17439c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17437a) {
            case 0:
                this.f17438b.run(this.f17439c);
                return;
            case 1:
                this.f17438b.run(this.f17439c);
                return;
            case 2:
                MediaDataController.lambda$loadStickers$92(this.f17438b, this.f17439c);
                return;
            default:
                this.f17438b.run(this.f17439c);
                return;
        }
    }
}
