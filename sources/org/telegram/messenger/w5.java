package org.telegram.messenger;

import java.util.ArrayList;
public final class w5 implements Runnable {
    public final int f18900a;
    public final LocationController f18901b;
    public final ArrayList f18902c;

    public w5(LocationController locationController, ArrayList arrayList, int i10) {
        this.f18900a = i10;
        this.f18901b = locationController;
        this.f18902c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18900a) {
            case 0:
                this.f18901b.lambda$loadSharingLocations$14(this.f18902c);
                return;
            default:
                this.f18901b.lambda$loadSharingLocations$15(this.f18902c);
                return;
        }
    }
}
