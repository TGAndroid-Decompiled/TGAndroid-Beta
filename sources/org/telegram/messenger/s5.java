package org.telegram.messenger;

import java.util.ArrayList;
public final class s5 implements Runnable {
    public final int f17514a;
    public final LocationController f17515b;
    public final ArrayList f17516c;

    public s5(LocationController locationController, ArrayList arrayList, int i10) {
        this.f17514a = i10;
        this.f17515b = locationController;
        this.f17516c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17514a) {
            case 0:
                this.f17515b.lambda$loadSharingLocations$14(this.f17516c);
                return;
            default:
                this.f17515b.lambda$loadSharingLocations$15(this.f17516c);
                return;
        }
    }
}
