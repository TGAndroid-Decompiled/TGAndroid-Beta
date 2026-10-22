package org.telegram.messenger;

import java.util.ArrayList;
public final class y5 implements Runnable {
    public final int f20123a;
    public final LocationController f20124b;
    public final ArrayList f20125c;

    public y5(LocationController locationController, ArrayList arrayList, int i10) {
        this.f20123a = i10;
        this.f20124b = locationController;
        this.f20125c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20123a) {
            case 0:
                this.f20124b.lambda$loadSharingLocations$14(this.f20125c);
                return;
            default:
                this.f20124b.lambda$loadSharingLocations$15(this.f20125c);
                return;
        }
    }
}
