package org.telegram.messenger;

import android.location.Location;
public final class v5 implements q0.a {
    public final int f18634a;
    public final LocationController f18635b;

    public v5(LocationController locationController, int i10) {
        this.f18634a = i10;
        this.f18635b = locationController;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f18634a) {
            case 0:
                this.f18635b.lambda$onConnected$4((Integer) obj);
                return;
            default:
                this.f18635b.setLastKnownLocation((Location) obj);
                return;
        }
    }
}
