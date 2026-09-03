package org.telegram.messenger;

import java.util.ArrayList;
public final class u5 implements Runnable {
    public final int f20168a;
    public final LocationController f20169b;
    public final ArrayList f20170c;

    public u5(LocationController locationController, ArrayList arrayList, int i10) {
        this.f20168a = i10;
        this.f20169b = locationController;
        this.f20170c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20168a) {
            case 0:
                this.f20169b.lambda$loadSharingLocations$14(this.f20170c);
                return;
            default:
                this.f20169b.lambda$loadSharingLocations$15(this.f20170c);
                return;
        }
    }
}
