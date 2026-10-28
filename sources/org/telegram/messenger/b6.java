package org.telegram.messenger;

import android.location.Location;
public final class b6 implements q0.a {
    public final int f19677a;
    public final LocationController f19678b;

    public b6(LocationController locationController, int i10) {
        this.f19677a = i10;
        this.f19678b = locationController;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f19677a) {
            case 0:
                this.f19678b.lambda$onConnected$4((Integer) obj);
                return;
            default:
                this.f19678b.setLastKnownLocation((Location) obj);
                return;
        }
    }
}
