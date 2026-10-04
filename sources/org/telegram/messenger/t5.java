package org.telegram.messenger;

import android.location.Location;
public final class t5 implements q0.a {
    public final int f19212a;
    public final LocationController f19213b;

    public t5(LocationController locationController, int i10) {
        this.f19212a = i10;
        this.f19213b = locationController;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f19212a) {
            case 0:
                this.f19213b.lambda$onConnected$4((Integer) obj);
                return;
            default:
                this.f19213b.setLastKnownLocation((Location) obj);
                return;
        }
    }
}
