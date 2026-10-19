package org.telegram.messenger;

import java.util.ArrayList;
public final class v5 implements Runnable {
    public final int f19713a;
    public final LocationController f19714b;
    public final ArrayList f19715c;

    public v5(LocationController locationController, ArrayList arrayList, int i10) {
        this.f19713a = i10;
        this.f19714b = locationController;
        this.f19715c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19713a) {
            case 0:
                this.f19714b.lambda$loadSharingLocations$14(this.f19715c);
                return;
            default:
                this.f19714b.lambda$loadSharingLocations$15(this.f19715c);
                return;
        }
    }
}
