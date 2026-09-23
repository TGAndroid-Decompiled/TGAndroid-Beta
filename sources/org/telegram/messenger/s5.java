package org.telegram.messenger;

import java.util.ArrayList;
public final class s5 implements Runnable {
    public final int f17264a;
    public final LocationController f17265b;
    public final ArrayList f17266c;

    public s5(LocationController locationController, ArrayList arrayList, int i10) {
        this.f17264a = i10;
        this.f17265b = locationController;
        this.f17266c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17264a) {
            case 0:
                this.f17265b.lambda$loadSharingLocations$14(this.f17266c);
                return;
            default:
                this.f17265b.lambda$loadSharingLocations$15(this.f17266c);
                return;
        }
    }
}
