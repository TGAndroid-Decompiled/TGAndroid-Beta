package org.telegram.messenger;

import android.location.Location;
public final class s5 implements q0.a {
    public final int f18955a;
    public final LocationController f18956b;

    public s5(LocationController locationController, int i10) {
        this.f18955a = i10;
        this.f18956b = locationController;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f18955a) {
            case 0:
                this.f18956b.lambda$onConnected$4((Integer) obj);
                return;
            default:
                this.f18956b.setLastKnownLocation((Location) obj);
                return;
        }
    }
}
