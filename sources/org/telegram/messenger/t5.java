package org.telegram.messenger;

import android.location.Location;
public final class t5 implements q0.a {
    public final int f17572a;
    public final LocationController f17573b;

    public t5(LocationController locationController, int i10) {
        this.f17572a = i10;
        this.f17573b = locationController;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f17572a) {
            case 0:
                this.f17573b.lambda$onConnected$4((Integer) obj);
                return;
            default:
                this.f17573b.setLastKnownLocation((Location) obj);
                return;
        }
    }
}
