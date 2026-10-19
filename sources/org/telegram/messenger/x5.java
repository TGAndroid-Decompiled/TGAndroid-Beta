package org.telegram.messenger;

import android.location.Location;
public final class x5 implements q0.a {
    public final int f20045a;
    public final LocationController f20046b;

    public x5(LocationController locationController, int i10) {
        this.f20045a = i10;
        this.f20046b = locationController;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f20045a) {
            case 0:
                this.f20046b.lambda$onConnected$4((Integer) obj);
                return;
            default:
                this.f20046b.setLastKnownLocation((Location) obj);
                return;
        }
    }
}
