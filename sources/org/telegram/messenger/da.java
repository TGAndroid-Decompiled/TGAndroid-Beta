package org.telegram.messenger;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
public final class da implements wa {
    public LatLngBounds f22013a;

    public final cb a() {
        LatLngBounds latLngBounds = this.f22013a;
        LatLng latLng = latLngBounds.f7701a;
        double d = latLng.f7699a;
        LatLng latLng2 = latLngBounds.f7702b;
        double d2 = (d + latLng2.f7699a) / 2.0d;
        double d10 = latLng2.f7700b;
        double d11 = latLng.f7700b;
        if (d11 > d10) {
            d10 += 360.0d;
        }
        LatLng latLng3 = new LatLng(d2, (d10 + d11) / 2.0d);
        return new cb(latLng3.f7699a, latLng3.f7700b);
    }
}
