package org.telegram.messenger;

import java.util.ArrayList;
public final class s5 implements Runnable {
    public final int f17531a;
    public final LocationController f17532b;
    public final ArrayList f17533c;

    public s5(LocationController locationController, ArrayList arrayList, int i10) {
        this.f17531a = i10;
        this.f17532b = locationController;
        this.f17533c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17531a) {
            case 0:
                this.f17532b.lambda$loadSharingLocations$14(this.f17533c);
                return;
            default:
                this.f17532b.lambda$loadSharingLocations$15(this.f17533c);
                return;
        }
    }
}
