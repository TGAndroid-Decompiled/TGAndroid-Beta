package org.telegram.messenger;

import java.util.ArrayList;
public final class s5 implements Runnable {
    public final int f17283a;
    public final LocationController f17284b;
    public final ArrayList f17285c;

    public s5(LocationController locationController, ArrayList arrayList, int i10) {
        this.f17283a = i10;
        this.f17284b = locationController;
        this.f17285c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17283a) {
            case 0:
                this.f17284b.lambda$loadSharingLocations$14(this.f17285c);
                return;
            default:
                this.f17284b.lambda$loadSharingLocations$15(this.f17285c);
                return;
        }
    }
}
