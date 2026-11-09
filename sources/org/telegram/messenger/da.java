package org.telegram.messenger;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
public final class da implements wa {
    public LatLngBounds f22009a;

    public final cb a() {
        LatLngBounds latLngBounds = this.f22009a;
        LatLng latLng = latLngBounds.f7696a;
        double d = latLng.f7694a;
        LatLng latLng2 = latLngBounds.f7697b;
        double d2 = (d + latLng2.f7694a) / 2.0d;
        double d10 = latLng2.f7695b;
        double d11 = latLng.f7695b;
        if (d11 > d10) {
            d10 += 360.0d;
        }
        LatLng latLng3 = new LatLng(d2, (d10 + d11) / 2.0d);
        return new cb(latLng3.f7694a, latLng3.f7695b);
    }
}
