package org.telegram.messenger;

import java.util.ArrayList;
public final class u5 implements Runnable {
    public final int f18561a;
    public final LocationController f18562b;
    public final ArrayList f18563c;

    public u5(LocationController locationController, ArrayList arrayList, int i10) {
        this.f18561a = i10;
        this.f18562b = locationController;
        this.f18563c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18561a) {
            case 0:
                this.f18562b.lambda$loadSharingLocations$14(this.f18563c);
                return;
            default:
                this.f18562b.lambda$loadSharingLocations$15(this.f18563c);
                return;
        }
    }
}
