package org.telegram.messenger;

import java.util.ArrayList;
public final class w5 implements Runnable {
    public final int f18600a;
    public final LocationController f18601b;
    public final ArrayList f18602c;

    public w5(LocationController locationController, ArrayList arrayList, int i10) {
        this.f18600a = i10;
        this.f18601b = locationController;
        this.f18602c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18600a) {
            case 0:
                this.f18601b.lambda$loadSharingLocations$14(this.f18602c);
                return;
            default:
                this.f18601b.lambda$loadSharingLocations$15(this.f18602c);
                return;
        }
    }
}
