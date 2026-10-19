package org.telegram.messenger;

import java.util.ArrayList;
public final class w5 implements Runnable {
    public final int f19953a;
    public final LocationController f19954b;
    public final ArrayList f19955c;

    public w5(LocationController locationController, ArrayList arrayList, int i10) {
        this.f19953a = i10;
        this.f19954b = locationController;
        this.f19955c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19953a) {
            case 0:
                this.f19954b.lambda$loadSharingLocations$14(this.f19955c);
                return;
            default:
                this.f19954b.lambda$loadSharingLocations$15(this.f19955c);
                return;
        }
    }
}
