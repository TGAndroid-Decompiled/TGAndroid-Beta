package org.telegram.messenger;

import java.util.ArrayList;
public final class t5 implements Runnable {
    public final int f19254a;
    public final LocationController f19255b;
    public final ArrayList f19256c;

    public t5(LocationController locationController, ArrayList arrayList, int i10) {
        this.f19254a = i10;
        this.f19255b = locationController;
        this.f19256c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19254a) {
            case 0:
                this.f19255b.lambda$loadSharingLocations$14(this.f19256c);
                return;
            default:
                this.f19255b.lambda$loadSharingLocations$15(this.f19256c);
                return;
        }
    }
}
