package org.telegram.messenger;

import java.util.ArrayList;
public final class s5 implements Runnable {
    public final int f17516a;
    public final LocationController f17517b;
    public final ArrayList f17518c;

    public s5(LocationController locationController, ArrayList arrayList, int i10) {
        this.f17516a = i10;
        this.f17517b = locationController;
        this.f17518c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17516a) {
            case 0:
                this.f17517b.lambda$loadSharingLocations$14(this.f17518c);
                return;
            default:
                this.f17517b.lambda$loadSharingLocations$15(this.f17518c);
                return;
        }
    }
}
