package org.telegram.messenger;

import android.location.Location;
public final class t5 implements q0.a {
    public final int f17590a;
    public final LocationController f17591b;

    public t5(LocationController locationController, int i10) {
        this.f17590a = i10;
        this.f17591b = locationController;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f17590a) {
            case 0:
                this.f17591b.lambda$onConnected$4((Integer) obj);
                return;
            default:
                this.f17591b.setLastKnownLocation((Location) obj);
                return;
        }
    }
}
