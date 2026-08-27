package org.telegram.messenger;

import android.location.Location;

public final class u5 implements q0.a {

    public final int f21691a;

    public final LocationController f21692b;

    public u5(LocationController locationController, int i10) {
        this.f21691a = i10;
        this.f21692b = locationController;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f21691a) {
            case 0:
                this.f21692b.lambda$onConnected$4((Integer) obj);
                break;
            default:
                this.f21692b.setLastKnownLocation((Location) obj);
                break;
        }
    }
}
