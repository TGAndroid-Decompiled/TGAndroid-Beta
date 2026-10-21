package org.telegram.messenger;

import android.location.Location;
public final class y5 implements q0.a {
    public final int f20128a;
    public final LocationController f20129b;

    public y5(LocationController locationController, int i10) {
        this.f20128a = i10;
        this.f20129b = locationController;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f20128a) {
            case 0:
                this.f20129b.lambda$onConnected$4((Integer) obj);
                return;
            default:
                this.f20129b.setLastKnownLocation((Location) obj);
                return;
        }
    }
}
