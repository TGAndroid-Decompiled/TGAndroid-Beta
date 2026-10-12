package org.telegram.messenger;

import android.location.Location;
public final class x5 implements q0.a {
    public final int f18981a;
    public final LocationController f18982b;

    public x5(LocationController locationController, int i10) {
        this.f18981a = i10;
        this.f18982b = locationController;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f18981a) {
            case 0:
                this.f18982b.lambda$onConnected$4((Integer) obj);
                return;
            default:
                this.f18982b.setLastKnownLocation((Location) obj);
                return;
        }
    }
}
