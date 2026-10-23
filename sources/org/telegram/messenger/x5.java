package org.telegram.messenger;

import java.util.ArrayList;
public final class x5 implements Runnable {
    public final int f20115a;
    public final LocationController f20116b;
    public final ArrayList f20117c;

    public x5(LocationController locationController, ArrayList arrayList, int i10) {
        this.f20115a = i10;
        this.f20116b = locationController;
        this.f20117c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20115a) {
            case 0:
                this.f20116b.lambda$loadSharingLocations$14(this.f20117c);
                return;
            default:
                this.f20116b.lambda$loadSharingLocations$15(this.f20117c);
                return;
        }
    }
}
