package org.telegram.messenger;

import android.location.Location;
public final class x5 implements q0.a {
    public final int f19536a;
    public final LocationController f19537b;

    public x5(LocationController locationController, int i10) {
        this.f19536a = i10;
        this.f19537b = locationController;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f19536a) {
            case 0:
                this.f19537b.lambda$onConnected$4((Integer) obj);
                return;
            default:
                this.f19537b.setLastKnownLocation((Location) obj);
                return;
        }
    }
}
