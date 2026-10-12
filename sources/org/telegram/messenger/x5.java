package org.telegram.messenger;

import android.location.Location;
public final class x5 implements q0.a {
    public final int f19537a;
    public final LocationController f19538b;

    public x5(LocationController locationController, int i10) {
        this.f19537a = i10;
        this.f19538b = locationController;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f19537a) {
            case 0:
                this.f19538b.lambda$onConnected$4((Integer) obj);
                return;
            default:
                this.f19538b.setLastKnownLocation((Location) obj);
                return;
        }
    }
}
