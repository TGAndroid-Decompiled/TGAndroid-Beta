package org.telegram.messenger;

import android.view.MotionEvent;
import org.telegram.messenger.GoogleMapsProvider;
import org.telegram.messenger.IMapsProvider;
public final class k4 implements IMapsProvider.ICallableMethod {
    public final int f20729a;
    public final GoogleMapsProvider.GoogleMapView.AnonymousClass1 f20730b;

    public k4(GoogleMapsProvider.GoogleMapView.AnonymousClass1 anonymousClass1, int i10) {
        this.f20729a = i10;
        this.f20730b = anonymousClass1;
    }

    @Override
    public final Object call(Object obj) {
        switch (this.f20729a) {
            case 0:
                return GoogleMapsProvider.GoogleMapView.AnonymousClass1.a(this.f20730b, (MotionEvent) obj);
            default:
                return GoogleMapsProvider.GoogleMapView.AnonymousClass1.b(this.f20730b, (MotionEvent) obj);
        }
    }
}
