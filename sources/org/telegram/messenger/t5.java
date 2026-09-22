package org.telegram.messenger;

import android.location.Location;
public final class t5 implements q0.a {
    public final int f17359a;
    public final LocationController f17360b;

    public t5(LocationController locationController, int i10) {
        this.f17359a = i10;
        this.f17360b = locationController;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f17359a) {
            case 0:
                this.f17360b.lambda$onConnected$4((Integer) obj);
                return;
            default:
                this.f17360b.setLastKnownLocation((Location) obj);
                return;
        }
    }
}
