package org.telegram.messenger;

import java.util.ArrayList;
public final class y5 implements Runnable {
    public final int f17034a;
    public final LocationController f17035b;
    public final ArrayList f17036c;

    public y5(LocationController locationController, ArrayList arrayList, int i10) {
        this.f17034a = i10;
        this.f17035b = locationController;
        this.f17036c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17034a) {
            case 0:
                this.f17035b.lambda$loadSharingLocations$14(this.f17036c);
                return;
            default:
                this.f17035b.lambda$loadSharingLocations$15(this.f17036c);
                return;
        }
    }
}
