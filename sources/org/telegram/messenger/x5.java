package org.telegram.messenger;

import java.util.ArrayList;
public final class x5 implements Runnable {
    public final int f20048a;
    public final LocationController f20049b;
    public final ArrayList f20050c;

    public x5(LocationController locationController, ArrayList arrayList, int i10) {
        this.f20048a = i10;
        this.f20049b = locationController;
        this.f20050c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20048a) {
            case 0:
                this.f20049b.lambda$loadSharingLocations$14(this.f20050c);
                return;
            default:
                this.f20049b.lambda$loadSharingLocations$15(this.f20050c);
                return;
        }
    }
}
