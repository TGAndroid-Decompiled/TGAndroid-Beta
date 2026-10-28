package org.telegram.messenger;

import java.util.ArrayList;
public final class a6 implements Runnable {
    public final int f19596a;
    public final LocationController f19597b;
    public final ArrayList f19598c;

    public a6(LocationController locationController, ArrayList arrayList, int i10) {
        this.f19596a = i10;
        this.f19597b = locationController;
        this.f19598c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19596a) {
            case 0:
                LocationController.E(this.f19597b, this.f19598c);
                return;
            default:
                LocationController.i(this.f19597b, this.f19598c);
                return;
        }
    }
}
