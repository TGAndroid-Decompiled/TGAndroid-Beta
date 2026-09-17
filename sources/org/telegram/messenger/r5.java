package org.telegram.messenger;

import java.util.ArrayList;
public final class r5 implements Runnable {
    public final int f18899a;
    public final LocationController f18900b;
    public final ArrayList f18901c;

    public r5(LocationController locationController, ArrayList arrayList, int i10) {
        this.f18899a = i10;
        this.f18900b = locationController;
        this.f18901c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18899a) {
            case 0:
                LocationController.E(this.f18900b, this.f18901c);
                return;
            default:
                LocationController.i(this.f18900b, this.f18901c);
                return;
        }
    }
}
