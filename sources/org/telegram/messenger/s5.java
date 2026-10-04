package org.telegram.messenger;

import java.util.ArrayList;
public final class s5 implements Runnable {
    public final int f19127a;
    public final LocationController f19128b;
    public final ArrayList f19129c;

    public s5(LocationController locationController, ArrayList arrayList, int i10) {
        this.f19127a = i10;
        this.f19128b = locationController;
        this.f19129c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19127a) {
            case 0:
                this.f19128b.lambda$loadSharingLocations$14(this.f19129c);
                return;
            default:
                this.f19128b.lambda$loadSharingLocations$15(this.f19129c);
                return;
        }
    }
}
