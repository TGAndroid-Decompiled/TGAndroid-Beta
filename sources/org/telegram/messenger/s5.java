package org.telegram.messenger;

import java.util.ArrayList;
public final class s5 implements Runnable {
    public final int f17496a;
    public final LocationController f17497b;
    public final ArrayList f17498c;

    public s5(LocationController locationController, ArrayList arrayList, int i10) {
        this.f17496a = i10;
        this.f17497b = locationController;
        this.f17498c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17496a) {
            case 0:
                this.f17497b.lambda$loadSharingLocations$14(this.f17498c);
                return;
            default:
                this.f17497b.lambda$loadSharingLocations$15(this.f17498c);
                return;
        }
    }
}
