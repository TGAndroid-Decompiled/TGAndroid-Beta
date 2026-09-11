package org.telegram.messenger;

import java.util.ArrayList;
public final class r5 implements Runnable {
    public final int f18872a;
    public final LocationController f18873b;
    public final ArrayList f18874c;

    public r5(LocationController locationController, ArrayList arrayList, int i10) {
        this.f18872a = i10;
        this.f18873b = locationController;
        this.f18874c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18872a) {
            case 0:
                this.f18873b.lambda$loadSharingLocations$14(this.f18874c);
                return;
            default:
                this.f18873b.lambda$loadSharingLocations$15(this.f18874c);
                return;
        }
    }
}
