package org.telegram.messenger;

import java.util.ArrayList;
public final class w5 implements Runnable {
    public final int f19440a;
    public final LocationController f19441b;
    public final ArrayList f19442c;

    public w5(LocationController locationController, ArrayList arrayList, int i10) {
        this.f19440a = i10;
        this.f19441b = locationController;
        this.f19442c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19440a) {
            case 0:
                this.f19441b.lambda$loadSharingLocations$14(this.f19442c);
                return;
            default:
                this.f19441b.lambda$loadSharingLocations$15(this.f19442c);
                return;
        }
    }
}
