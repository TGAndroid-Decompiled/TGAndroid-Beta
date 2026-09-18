package org.telegram.messenger;

import java.util.ArrayList;
public final class s5 implements Runnable {
    public final int f17295a;
    public final LocationController f17296b;
    public final ArrayList f17297c;

    public s5(LocationController locationController, ArrayList arrayList, int i10) {
        this.f17295a = i10;
        this.f17296b = locationController;
        this.f17297c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17295a) {
            case 0:
                this.f17296b.lambda$loadSharingLocations$14(this.f17297c);
                return;
            default:
                this.f17296b.lambda$loadSharingLocations$15(this.f17297c);
                return;
        }
    }
}
