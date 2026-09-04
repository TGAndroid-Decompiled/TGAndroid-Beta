package org.telegram.messenger;

import java.util.ArrayList;
public final class s5 implements Runnable {
    public final int f18951a;
    public final LocationController f18952b;
    public final ArrayList f18953c;

    public s5(LocationController locationController, ArrayList arrayList, int i10) {
        this.f18951a = i10;
        this.f18952b = locationController;
        this.f18953c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18951a) {
            case 0:
                this.f18952b.lambda$loadSharingLocations$14(this.f18953c);
                return;
            default:
                this.f18952b.lambda$loadSharingLocations$15(this.f18953c);
                return;
        }
    }
}
