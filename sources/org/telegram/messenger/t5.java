package org.telegram.messenger;

import android.location.Location;
public final class t5 implements q0.a {
    public final int f17372a;
    public final LocationController f17373b;

    public t5(LocationController locationController, int i10) {
        this.f17372a = i10;
        this.f17373b = locationController;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f17372a) {
            case 0:
                this.f17373b.lambda$onConnected$4((Integer) obj);
                return;
            default:
                this.f17373b.setLastKnownLocation((Location) obj);
                return;
        }
    }
}
