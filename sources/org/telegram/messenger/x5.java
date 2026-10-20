package org.telegram.messenger;

import java.util.ArrayList;
public final class x5 implements Runnable {
    public final int f20051a;
    public final LocationController f20052b;
    public final ArrayList f20053c;

    public x5(LocationController locationController, ArrayList arrayList, int i10) {
        this.f20051a = i10;
        this.f20052b = locationController;
        this.f20053c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20051a) {
            case 0:
                this.f20052b.lambda$loadSharingLocations$14(this.f20053c);
                return;
            default:
                this.f20052b.lambda$loadSharingLocations$15(this.f20053c);
                return;
        }
    }
}
