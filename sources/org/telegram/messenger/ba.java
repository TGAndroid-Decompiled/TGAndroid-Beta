package org.telegram.messenger;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
public final class ba implements ua {
    public LatLngBounds f23079a;

    public final ab a() {
        LatLngBounds latLngBounds = this.f23079a;
        LatLng latLng = latLngBounds.f7397a;
        double d = latLng.f7395a;
        LatLng latLng2 = latLngBounds.f7398b;
        double d2 = (d + latLng2.f7395a) / 2.0d;
        double d10 = latLng2.f7396b;
        double d11 = latLng.f7396b;
        if (d11 > d10) {
            d10 += 360.0d;
        }
        LatLng latLng3 = new LatLng(d2, (d10 + d11) / 2.0d);
        return new ab(latLng3.f7395a, latLng3.f7396b);
    }
}
