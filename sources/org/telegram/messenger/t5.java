package org.telegram.messenger;

import android.location.Location;
public final class t5 implements q0.a {
    public final int f17576a;
    public final LocationController f17577b;

    public t5(LocationController locationController, int i10) {
        this.f17576a = i10;
        this.f17577b = locationController;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f17576a) {
            case 0:
                this.f17577b.lambda$onConnected$4((Integer) obj);
                return;
            default:
                this.f17577b.setLastKnownLocation((Location) obj);
                return;
        }
    }
}
