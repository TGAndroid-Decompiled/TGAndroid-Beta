package org.telegram.messenger;

import java.util.ArrayList;
public final class t5 implements Runnable {
    public final int f19212a;
    public final LocationController f19213b;
    public final ArrayList f19214c;

    public t5(LocationController locationController, ArrayList arrayList, int i10) {
        this.f19212a = i10;
        this.f19213b = locationController;
        this.f19214c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19212a) {
            case 0:
                this.f19213b.lambda$loadSharingLocations$14(this.f19214c);
                return;
            default:
                this.f19213b.lambda$loadSharingLocations$15(this.f19214c);
                return;
        }
    }
}
