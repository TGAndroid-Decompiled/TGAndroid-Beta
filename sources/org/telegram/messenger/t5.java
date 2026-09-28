package org.telegram.messenger;

import android.location.Location;
public final class t5 implements q0.a {
    public final int f17591a;
    public final LocationController f17592b;

    public t5(LocationController locationController, int i10) {
        this.f17591a = i10;
        this.f17592b = locationController;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f17591a) {
            case 0:
                this.f17592b.lambda$onConnected$4((Integer) obj);
                return;
            default:
                this.f17592b.setLastKnownLocation((Location) obj);
                return;
        }
    }
}
