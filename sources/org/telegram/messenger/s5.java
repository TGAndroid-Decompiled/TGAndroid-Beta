package org.telegram.messenger;

import java.util.ArrayList;
public final class s5 implements Runnable {
    public final int f17515a;
    public final LocationController f17516b;
    public final ArrayList f17517c;

    public s5(LocationController locationController, ArrayList arrayList, int i10) {
        this.f17515a = i10;
        this.f17516b = locationController;
        this.f17517c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17515a) {
            case 0:
                this.f17516b.lambda$loadSharingLocations$14(this.f17517c);
                return;
            default:
                this.f17516b.lambda$loadSharingLocations$15(this.f17517c);
                return;
        }
    }
}
