package org.telegram.messenger;

import java.util.ArrayList;
public final class w5 implements Runnable {
    public final int f19950a;
    public final LocationController f19951b;
    public final ArrayList f19952c;

    public w5(LocationController locationController, ArrayList arrayList, int i10) {
        this.f19950a = i10;
        this.f19951b = locationController;
        this.f19952c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19950a) {
            case 0:
                this.f19951b.lambda$loadSharingLocations$14(this.f19952c);
                return;
            default:
                this.f19951b.lambda$loadSharingLocations$15(this.f19952c);
                return;
        }
    }
}
