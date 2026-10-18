package org.telegram.messenger;

import android.location.Location;
public final class x5 implements q0.a {
    public final int f20042a;
    public final LocationController f20043b;

    public x5(LocationController locationController, int i10) {
        this.f20042a = i10;
        this.f20043b = locationController;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f20042a) {
            case 0:
                this.f20043b.lambda$onConnected$4((Integer) obj);
                return;
            default:
                this.f20043b.setLastKnownLocation((Location) obj);
                return;
        }
    }
}
