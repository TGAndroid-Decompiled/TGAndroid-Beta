package org.telegram.messenger;

import java.util.ArrayList;
public final class u5 implements Runnable {
    public final int f18543a;
    public final LocationController f18544b;
    public final ArrayList f18545c;

    public u5(LocationController locationController, ArrayList arrayList, int i10) {
        this.f18543a = i10;
        this.f18544b = locationController;
        this.f18545c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18543a) {
            case 0:
                this.f18544b.lambda$loadSharingLocations$14(this.f18545c);
                return;
            default:
                this.f18544b.lambda$loadSharingLocations$15(this.f18545c);
                return;
        }
    }
}
