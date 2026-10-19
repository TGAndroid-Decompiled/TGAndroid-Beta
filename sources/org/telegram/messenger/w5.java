package org.telegram.messenger;

import android.location.Location;
public final class w5 implements q0.a {
    public final int f19957a;
    public final LocationController f19958b;

    public w5(LocationController locationController, int i10) {
        this.f19957a = i10;
        this.f19958b = locationController;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f19957a) {
            case 0:
                this.f19958b.lambda$onConnected$4((Integer) obj);
                return;
            default:
                this.f19958b.setLastKnownLocation((Location) obj);
                return;
        }
    }
}
