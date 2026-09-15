package org.telegram.messenger;

import java.util.ArrayList;
public final class s5 implements Runnable {
    public final int f17286a;
    public final LocationController f17287b;
    public final ArrayList f17288c;

    public s5(LocationController locationController, ArrayList arrayList, int i10) {
        this.f17286a = i10;
        this.f17287b = locationController;
        this.f17288c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17286a) {
            case 0:
                this.f17287b.lambda$loadSharingLocations$14(this.f17288c);
                return;
            default:
                this.f17287b.lambda$loadSharingLocations$15(this.f17288c);
                return;
        }
    }
}
