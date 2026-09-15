package org.telegram.messenger;

import android.location.Location;
public final class t5 implements q0.a {
    public final int f17363a;
    public final LocationController f17364b;

    public t5(LocationController locationController, int i10) {
        this.f17363a = i10;
        this.f17364b = locationController;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f17363a) {
            case 0:
                this.f17364b.lambda$onConnected$4((Integer) obj);
                return;
            default:
                this.f17364b.setLastKnownLocation((Location) obj);
                return;
        }
    }
}
