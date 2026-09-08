package org.telegram.messenger;

import java.util.ArrayList;
public final class s5 implements Runnable {
    public final int f18978a;
    public final LocationController f18979b;
    public final ArrayList f18980c;

    public s5(LocationController locationController, ArrayList arrayList, int i10) {
        this.f18978a = i10;
        this.f18979b = locationController;
        this.f18980c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18978a) {
            case 0:
                this.f18979b.lambda$loadSharingLocations$14(this.f18980c);
                return;
            default:
                this.f18979b.lambda$loadSharingLocations$15(this.f18980c);
                return;
        }
    }
}
