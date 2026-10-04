package org.telegram.messenger;

import java.util.ArrayList;
public final class s5 implements Runnable {
    public final int f19133a;
    public final LocationController f19134b;
    public final ArrayList f19135c;

    public s5(LocationController locationController, ArrayList arrayList, int i10) {
        this.f19133a = i10;
        this.f19134b = locationController;
        this.f19135c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19133a) {
            case 0:
                this.f19134b.lambda$loadSharingLocations$14(this.f19135c);
                return;
            default:
                this.f19134b.lambda$loadSharingLocations$15(this.f19135c);
                return;
        }
    }
}
