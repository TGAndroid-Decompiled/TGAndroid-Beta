package org.telegram.messenger;

import java.util.ArrayList;
public final class v5 implements Runnable {
    public final int f19715a;
    public final LocationController f19716b;
    public final ArrayList f19717c;

    public v5(LocationController locationController, ArrayList arrayList, int i10) {
        this.f19715a = i10;
        this.f19716b = locationController;
        this.f19717c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19715a) {
            case 0:
                this.f19716b.lambda$loadSharingLocations$14(this.f19717c);
                return;
            default:
                this.f19716b.lambda$loadSharingLocations$15(this.f19717c);
                return;
        }
    }
}
