package org.telegram.messenger;

import android.location.Location;
public final class w5 implements q0.a {
    public final int f19963a;
    public final LocationController f19964b;

    public w5(LocationController locationController, int i10) {
        this.f19963a = i10;
        this.f19964b = locationController;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f19963a) {
            case 0:
                this.f19964b.lambda$onConnected$4((Integer) obj);
                return;
            default:
                this.f19964b.setLastKnownLocation((Location) obj);
                return;
        }
    }
}
