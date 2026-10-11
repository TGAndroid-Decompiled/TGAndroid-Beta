package org.telegram.messenger;

import android.location.Location;
public final class u5 implements q0.a {
    public final int f19340a;
    public final LocationController f19341b;

    public u5(LocationController locationController, int i10) {
        this.f19340a = i10;
        this.f19341b = locationController;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f19340a) {
            case 0:
                this.f19341b.lambda$onConnected$4((Integer) obj);
                return;
            default:
                this.f19341b.setLastKnownLocation((Location) obj);
                return;
        }
    }
}
