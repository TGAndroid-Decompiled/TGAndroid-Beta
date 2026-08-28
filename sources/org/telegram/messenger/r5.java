package org.telegram.messenger;

import java.util.ArrayList;
public final class r5 implements Runnable {
    public final int f21375a;
    public final LocationController f21376b;
    public final ArrayList f21377c;

    public r5(LocationController locationController, ArrayList arrayList, int i9) {
        this.f21375a = i9;
        this.f21376b = locationController;
        this.f21377c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f21375a) {
            case 0:
                this.f21376b.lambda$loadSharingLocations$14(this.f21377c);
                return;
            default:
                this.f21376b.lambda$loadSharingLocations$15(this.f21377c);
                return;
        }
    }
}
