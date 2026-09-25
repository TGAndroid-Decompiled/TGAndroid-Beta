package org.telegram.messenger;

import android.location.Location;
public final class t5 implements q0.a {
    public final int f17587a;
    public final LocationController f17588b;

    public t5(LocationController locationController, int i10) {
        this.f17587a = i10;
        this.f17588b = locationController;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f17587a) {
            case 0:
                this.f17588b.lambda$onConnected$4((Integer) obj);
                return;
            default:
                this.f17588b.setLastKnownLocation((Location) obj);
                return;
        }
    }
}
