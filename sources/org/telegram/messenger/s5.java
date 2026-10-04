package org.telegram.messenger;

import java.util.ArrayList;
public final class s5 implements Runnable {
    public final int f19126a;
    public final LocationController f19127b;
    public final ArrayList f19128c;

    public s5(LocationController locationController, ArrayList arrayList, int i10) {
        this.f19126a = i10;
        this.f19127b = locationController;
        this.f19128c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19126a) {
            case 0:
                this.f19127b.lambda$loadSharingLocations$14(this.f19128c);
                return;
            default:
                this.f19127b.lambda$loadSharingLocations$15(this.f19128c);
                return;
        }
    }
}
