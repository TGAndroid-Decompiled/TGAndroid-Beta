package org.telegram.messenger;

import java.util.ArrayList;
public final class y5 implements Runnable {
    public final int f20192a;
    public final LocationController f20193b;
    public final ArrayList f20194c;

    public y5(LocationController locationController, ArrayList arrayList, int i10) {
        this.f20192a = i10;
        this.f20193b = locationController;
        this.f20194c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20192a) {
            case 0:
                this.f20193b.lambda$loadSharingLocations$14(this.f20194c);
                return;
            default:
                this.f20193b.lambda$loadSharingLocations$15(this.f20194c);
                return;
        }
    }
}
