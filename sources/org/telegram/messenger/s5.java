package org.telegram.messenger;

import java.util.ArrayList;
public final class s5 implements Runnable {
    public final int f17505a;
    public final LocationController f17506b;
    public final ArrayList f17507c;

    public s5(LocationController locationController, ArrayList arrayList, int i10) {
        this.f17505a = i10;
        this.f17506b = locationController;
        this.f17507c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17505a) {
            case 0:
                this.f17506b.lambda$loadSharingLocations$14(this.f17507c);
                return;
            default:
                this.f17506b.lambda$loadSharingLocations$15(this.f17507c);
                return;
        }
    }
}
