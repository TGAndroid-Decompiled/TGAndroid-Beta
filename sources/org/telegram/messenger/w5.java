package org.telegram.messenger;

import android.location.Location;
public final class w5 implements q0.a {
    public final int f19951a;
    public final LocationController f19952b;

    public w5(LocationController locationController, int i10) {
        this.f19951a = i10;
        this.f19952b = locationController;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f19951a) {
            case 0:
                this.f19952b.lambda$onConnected$4((Integer) obj);
                return;
            default:
                this.f19952b.setLastKnownLocation((Location) obj);
                return;
        }
    }
}
