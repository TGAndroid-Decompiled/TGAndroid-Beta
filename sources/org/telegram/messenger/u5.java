package org.telegram.messenger;

import android.location.Location;
public final class u5 implements q0.a {
    public final int f19304a;
    public final LocationController f19305b;

    public u5(LocationController locationController, int i10) {
        this.f19304a = i10;
        this.f19305b = locationController;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f19304a) {
            case 0:
                this.f19305b.lambda$onConnected$4((Integer) obj);
                return;
            default:
                this.f19305b.setLastKnownLocation((Location) obj);
                return;
        }
    }
}
