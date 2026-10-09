package org.telegram.messenger;

import android.location.Location;
public final class u5 implements q0.a {
    public final int f19302a;
    public final LocationController f19303b;

    public u5(LocationController locationController, int i10) {
        this.f19302a = i10;
        this.f19303b = locationController;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f19302a) {
            case 0:
                this.f19303b.lambda$onConnected$4((Integer) obj);
                return;
            default:
                this.f19303b.setLastKnownLocation((Location) obj);
                return;
        }
    }
}
