package org.telegram.messenger;

import java.util.ArrayList;
public final class s5 implements Runnable {
    public final int f17511a;
    public final LocationController f17512b;
    public final ArrayList f17513c;

    public s5(LocationController locationController, ArrayList arrayList, int i10) {
        this.f17511a = i10;
        this.f17512b = locationController;
        this.f17513c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17511a) {
            case 0:
                this.f17512b.lambda$loadSharingLocations$14(this.f17513c);
                return;
            default:
                this.f17512b.lambda$loadSharingLocations$15(this.f17513c);
                return;
        }
    }
}
