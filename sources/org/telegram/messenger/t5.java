package org.telegram.messenger;

import java.util.ArrayList;
public final class t5 implements Runnable {
    public final int f19216a;
    public final LocationController f19217b;
    public final ArrayList f19218c;

    public t5(LocationController locationController, ArrayList arrayList, int i10) {
        this.f19216a = i10;
        this.f19217b = locationController;
        this.f19218c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19216a) {
            case 0:
                this.f19217b.lambda$loadSharingLocations$14(this.f19218c);
                return;
            default:
                this.f19217b.lambda$loadSharingLocations$15(this.f19218c);
                return;
        }
    }
}
