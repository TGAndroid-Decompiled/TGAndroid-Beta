package org.telegram.messenger;

import android.view.MotionEvent;
import org.telegram.messenger.GoogleMapsProvider;
import org.telegram.messenger.IMapsProvider;
public final class j4 implements IMapsProvider.ICallableMethod {
    public final int f16705a;
    public final GoogleMapsProvider.GoogleMapView.AnonymousClass1 f16706b;

    public j4(GoogleMapsProvider.GoogleMapView.AnonymousClass1 anonymousClass1, int i10) {
        this.f16705a = i10;
        this.f16706b = anonymousClass1;
    }

    @Override
    public final Object call(Object obj) {
        switch (this.f16705a) {
            case 0:
                return GoogleMapsProvider.GoogleMapView.AnonymousClass1.a(this.f16706b, (MotionEvent) obj);
            default:
                return GoogleMapsProvider.GoogleMapView.AnonymousClass1.b(this.f16706b, (MotionEvent) obj);
        }
    }
}
