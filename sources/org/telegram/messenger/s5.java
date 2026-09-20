package org.telegram.messenger;

import java.util.ArrayList;
public final class s5 implements Runnable {
    public final int f17501a;
    public final LocationController f17502b;
    public final ArrayList f17503c;

    public s5(LocationController locationController, ArrayList arrayList, int i10) {
        this.f17501a = i10;
        this.f17502b = locationController;
        this.f17503c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17501a) {
            case 0:
                this.f17502b.lambda$loadSharingLocations$14(this.f17503c);
                return;
            default:
                this.f17502b.lambda$loadSharingLocations$15(this.f17503c);
                return;
        }
    }
}
