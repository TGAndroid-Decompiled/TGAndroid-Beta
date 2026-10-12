package org.telegram.messenger;

import java.util.ArrayList;
public final class w5 implements Runnable {
    public final int f19439a;
    public final LocationController f19440b;
    public final ArrayList f19441c;

    public w5(LocationController locationController, ArrayList arrayList, int i10) {
        this.f19439a = i10;
        this.f19440b = locationController;
        this.f19441c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19439a) {
            case 0:
                this.f19440b.lambda$loadSharingLocations$14(this.f19441c);
                return;
            default:
                this.f19440b.lambda$loadSharingLocations$15(this.f19441c);
                return;
        }
    }
}
