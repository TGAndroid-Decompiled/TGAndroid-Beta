package org.telegram.messenger;

import java.util.ArrayList;
public final class s5 implements Runnable {
    public final int f17467a;
    public final LocationController f17468b;
    public final ArrayList f17469c;

    public s5(LocationController locationController, ArrayList arrayList, int i10) {
        this.f17467a = i10;
        this.f17468b = locationController;
        this.f17469c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17467a) {
            case 0:
                this.f17468b.lambda$loadSharingLocations$14(this.f17469c);
                return;
            default:
                this.f17468b.lambda$loadSharingLocations$15(this.f17469c);
                return;
        }
    }
}
