package org.telegram.messenger;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
public final class ca implements va {
    public LatLngBounds f23212a;

    public final bb a() {
        LatLngBounds latLngBounds = this.f23212a;
        LatLng latLng = latLngBounds.f7363a;
        double d = latLng.f7361a;
        LatLng latLng2 = latLngBounds.f7364b;
        double d2 = (d + latLng2.f7361a) / 2.0d;
        double d10 = latLng2.f7362b;
        double d11 = latLng.f7362b;
        if (d11 > d10) {
            d10 += 360.0d;
        }
        LatLng latLng3 = new LatLng(d2, (d10 + d11) / 2.0d);
        return new bb(latLng3.f7361a, latLng3.f7362b);
    }
}
