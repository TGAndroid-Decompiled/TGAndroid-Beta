package org.telegram.messenger;

import android.view.MotionEvent;
import org.telegram.messenger.GoogleMapsProvider;
import org.telegram.messenger.IMapsProvider;
public final class i4 implements IMapsProvider.ICallableMethod {
    public final int f17949a;
    public final GoogleMapsProvider.GoogleMapView.AnonymousClass1 f17950b;

    public i4(GoogleMapsProvider.GoogleMapView.AnonymousClass1 anonymousClass1, int i10) {
        this.f17949a = i10;
        this.f17950b = anonymousClass1;
    }

    @Override
    public final Object call(Object obj) {
        switch (this.f17949a) {
            case 0:
                return GoogleMapsProvider.GoogleMapView.AnonymousClass1.a(this.f17950b, (MotionEvent) obj);
            default:
                return GoogleMapsProvider.GoogleMapView.AnonymousClass1.b(this.f17950b, (MotionEvent) obj);
        }
    }
}
