package org.telegram.messenger;

import android.location.Location;
public final class y5 implements q0.a {
    public final int f20134a;
    public final LocationController f20135b;

    public y5(LocationController locationController, int i10) {
        this.f20134a = i10;
        this.f20135b = locationController;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f20134a) {
            case 0:
                this.f20135b.lambda$onConnected$4((Integer) obj);
                return;
            default:
                this.f20135b.setLastKnownLocation((Location) obj);
                return;
        }
    }
}
