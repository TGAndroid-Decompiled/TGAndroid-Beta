package org.telegram.messenger;

import android.location.Location;
public final class t5 implements q0.a {
    public final int f17545a;
    public final LocationController f17546b;

    public t5(LocationController locationController, int i10) {
        this.f17545a = i10;
        this.f17546b = locationController;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f17545a) {
            case 0:
                this.f17546b.lambda$onConnected$4((Integer) obj);
                return;
            default:
                this.f17546b.setLastKnownLocation((Location) obj);
                return;
        }
    }
}
