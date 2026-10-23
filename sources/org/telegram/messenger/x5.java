package org.telegram.messenger;

import java.util.ArrayList;
public final class x5 implements Runnable {
    public final int f20050a;
    public final LocationController f20051b;
    public final ArrayList f20052c;

    public x5(LocationController locationController, ArrayList arrayList, int i10) {
        this.f20050a = i10;
        this.f20051b = locationController;
        this.f20052c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20050a) {
            case 0:
                this.f20051b.lambda$loadSharingLocations$14(this.f20052c);
                return;
            default:
                this.f20051b.lambda$loadSharingLocations$15(this.f20052c);
                return;
        }
    }
}
