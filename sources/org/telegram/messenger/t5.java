package org.telegram.messenger;

import java.util.ArrayList;
public final class t5 implements Runnable {
    public final int f19218a;
    public final LocationController f19219b;
    public final ArrayList f19220c;

    public t5(LocationController locationController, ArrayList arrayList, int i10) {
        this.f19218a = i10;
        this.f19219b = locationController;
        this.f19220c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19218a) {
            case 0:
                this.f19219b.lambda$loadSharingLocations$14(this.f19220c);
                return;
            default:
                this.f19219b.lambda$loadSharingLocations$15(this.f19220c);
                return;
        }
    }
}
