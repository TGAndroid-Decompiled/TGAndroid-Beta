package org.telegram.messenger;

import java.util.ArrayList;
public final class v5 implements Runnable {
    public final int f19716a;
    public final LocationController f19717b;
    public final ArrayList f19718c;

    public v5(LocationController locationController, ArrayList arrayList, int i10) {
        this.f19716a = i10;
        this.f19717b = locationController;
        this.f19718c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19716a) {
            case 0:
                this.f19717b.lambda$loadSharingLocations$14(this.f19718c);
                return;
            default:
                this.f19717b.lambda$loadSharingLocations$15(this.f19718c);
                return;
        }
    }
}
