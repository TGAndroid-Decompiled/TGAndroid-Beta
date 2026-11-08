package org.telegram.messenger;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
public final class da implements wa {
    public LatLngBounds f22009a;

    public final cb a() {
        LatLngBounds latLngBounds = this.f22009a;
        LatLng latLng = latLngBounds.f7698a;
        double d = latLng.f7696a;
        LatLng latLng2 = latLngBounds.f7699b;
        double d2 = (d + latLng2.f7696a) / 2.0d;
        double d10 = latLng2.f7697b;
        double d11 = latLng.f7697b;
        if (d11 > d10) {
            d10 += 360.0d;
        }
        LatLng latLng3 = new LatLng(d2, (d10 + d11) / 2.0d);
        return new cb(latLng3.f7696a, latLng3.f7697b);
    }
}
