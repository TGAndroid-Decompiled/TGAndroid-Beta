package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class d2 implements Runnable {
    public final int f15928a;
    public final Utilities.Callback f15929b;
    public final ArrayList f15930c;

    public d2(Utilities.Callback callback, ArrayList arrayList, int i10) {
        this.f15928a = i10;
        this.f15929b = callback;
        this.f15930c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f15928a) {
            case 0:
                this.f15929b.run(this.f15930c);
                return;
            case 1:
                this.f15929b.run(this.f15930c);
                return;
            case 2:
                MediaDataController.lambda$loadStickers$92(this.f15929b, this.f15930c);
                return;
            default:
                this.f15929b.run(this.f15930c);
                return;
        }
    }
}
