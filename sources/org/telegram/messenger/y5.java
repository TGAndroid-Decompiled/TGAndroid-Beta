package org.telegram.messenger;

import android.location.Location;
public final class y5 implements q0.a {
    public final int f20135a;
    public final LocationController f20136b;

    public y5(LocationController locationController, int i10) {
        this.f20135a = i10;
        this.f20136b = locationController;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f20135a) {
            case 0:
                this.f20136b.lambda$onConnected$4((Integer) obj);
                return;
            default:
                this.f20136b.setLastKnownLocation((Location) obj);
                return;
        }
    }
}
