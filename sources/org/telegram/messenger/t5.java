package org.telegram.messenger;

import java.util.ArrayList;

public final class t5 implements Runnable {

    public final int f21607a;

    public final LocationController f21608b;

    public final ArrayList f21609c;

    public t5(LocationController locationController, ArrayList arrayList, int i10) {
        this.f21607a = i10;
        this.f21608b = locationController;
        this.f21609c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f21607a) {
            case 0:
                this.f21608b.lambda$loadSharingLocations$14(this.f21609c);
                break;
            default:
                this.f21608b.lambda$loadSharingLocations$15(this.f21609c);
                break;
        }
    }
}
