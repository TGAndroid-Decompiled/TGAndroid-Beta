package org.telegram.messenger;

import java.util.ArrayList;
public final class u5 implements Runnable {
    public final int f20166a;
    public final LocationController f20167b;
    public final ArrayList f20168c;

    public u5(LocationController locationController, ArrayList arrayList, int i10) {
        this.f20166a = i10;
        this.f20167b = locationController;
        this.f20168c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20166a) {
            case 0:
                this.f20167b.lambda$loadSharingLocations$14(this.f20168c);
                return;
            default:
                this.f20167b.lambda$loadSharingLocations$15(this.f20168c);
                return;
        }
    }
}
