package org.telegram.messenger;

import java.util.ArrayList;
public final class s5 implements Runnable {
    public final int f19138a;
    public final LocationController f19139b;
    public final ArrayList f19140c;

    public s5(LocationController locationController, ArrayList arrayList, int i10) {
        this.f19138a = i10;
        this.f19139b = locationController;
        this.f19140c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19138a) {
            case 0:
                this.f19139b.lambda$loadSharingLocations$14(this.f19140c);
                return;
            default:
                this.f19139b.lambda$loadSharingLocations$15(this.f19140c);
                return;
        }
    }
}
