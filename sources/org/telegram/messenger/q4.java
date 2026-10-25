package org.telegram.messenger;

import android.view.MotionEvent;
import org.telegram.messenger.GoogleMapsProvider;
import org.telegram.messenger.IMapsProvider;
public final class q4 implements IMapsProvider.ICallableMethod {
    public final int f21004a;
    public final GoogleMapsProvider.GoogleMapView.AnonymousClass1 f21005b;

    public q4(GoogleMapsProvider.GoogleMapView.AnonymousClass1 anonymousClass1, int i10) {
        this.f21004a = i10;
        this.f21005b = anonymousClass1;
    }

    @Override
    public final Object call(Object obj) {
        switch (this.f21004a) {
            case 0:
                return GoogleMapsProvider.GoogleMapView.AnonymousClass1.a(this.f21005b, (MotionEvent) obj);
            default:
                return GoogleMapsProvider.GoogleMapView.AnonymousClass1.b(this.f21005b, (MotionEvent) obj);
        }
    }
}
