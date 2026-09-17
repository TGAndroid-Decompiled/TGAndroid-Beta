package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class d2 implements Runnable {
    public final int f15940a;
    public final Utilities.Callback f15941b;
    public final ArrayList f15942c;

    public d2(Utilities.Callback callback, ArrayList arrayList, int i10) {
        this.f15940a = i10;
        this.f15941b = callback;
        this.f15942c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f15940a) {
            case 0:
                this.f15941b.run(this.f15942c);
                return;
            case 1:
                this.f15941b.run(this.f15942c);
                return;
            case 2:
                MediaDataController.lambda$loadStickers$92(this.f15941b, this.f15942c);
                return;
            default:
                this.f15941b.run(this.f15942c);
                return;
        }
    }
}
