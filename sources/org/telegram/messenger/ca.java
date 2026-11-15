package org.telegram.messenger;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
public final class ca implements va {
    public LatLngBounds f22811a;

    public final bb a() {
        LatLngBounds latLngBounds = this.f22811a;
        LatLng latLng = latLngBounds.f7085a;
        double d = latLng.f7083a;
        LatLng latLng2 = latLngBounds.f7086b;
        double d2 = (d + latLng2.f7083a) / 2.0d;
        double d10 = latLng2.f7084b;
        double d11 = latLng.f7084b;
        if (d11 > d10) {
            d10 += 360.0d;
        }
        LatLng latLng3 = new LatLng(d2, (d10 + d11) / 2.0d);
        return new bb(latLng3.f7083a, latLng3.f7084b);
    }
}
