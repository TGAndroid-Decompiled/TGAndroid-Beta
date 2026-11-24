package defpackage;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
public final class q05 implements rj5 {
    public LatLngBounds a;

    public final xj5 a() {
        LatLngBounds latLngBounds = this.a;
        LatLng latLng = latLngBounds.a;
        double d = latLng.a;
        LatLng latLng2 = latLngBounds.b;
        double d2 = (d + latLng2.a) / 2.0d;
        double d3 = latLng2.b;
        double d4 = latLng.b;
        if (d4 > d3) {
            d3 += 360.0d;
        }
        LatLng latLng3 = new LatLng(d2, (d3 + d4) / 2.0d);
        return new xj5(latLng3.a, latLng3.b);
    }
}
