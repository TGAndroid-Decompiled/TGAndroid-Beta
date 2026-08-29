package org.telegram.messenger;

import java.util.ArrayList;
public final class t5 implements Runnable {
    public final int f21617a;
    public final LocationController f21618b;
    public final ArrayList f21619c;

    public t5(LocationController locationController, ArrayList arrayList, int i10) {
        this.f21617a = i10;
        this.f21618b = locationController;
        this.f21619c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f21617a) {
            case 0:
                this.f21618b.lambda$loadSharingLocations$14(this.f21619c);
                return;
            default:
                this.f21618b.lambda$loadSharingLocations$15(this.f21619c);
                return;
        }
    }
}
