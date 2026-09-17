package org.telegram.messenger;

import android.view.MotionEvent;
import org.telegram.messenger.GoogleMapsProvider;
import org.telegram.messenger.IMapsProvider;
public final class i4 implements IMapsProvider.ICallableMethod {
    public final int f17976a;
    public final GoogleMapsProvider.GoogleMapView.AnonymousClass1 f17977b;

    public i4(GoogleMapsProvider.GoogleMapView.AnonymousClass1 anonymousClass1, int i10) {
        this.f17976a = i10;
        this.f17977b = anonymousClass1;
    }

    @Override
    public final Object call(Object obj) {
        switch (this.f17976a) {
            case 0:
                return GoogleMapsProvider.GoogleMapView.AnonymousClass1.a(this.f17977b, (MotionEvent) obj);
            default:
                return GoogleMapsProvider.GoogleMapView.AnonymousClass1.b(this.f17977b, (MotionEvent) obj);
        }
    }
}
