package org.telegram.messenger;

import android.view.MotionEvent;
import org.telegram.messenger.GoogleMapsProvider;
import org.telegram.messenger.IMapsProvider;
public final class n4 implements IMapsProvider.ICallableMethod {
    public final int f17919a;
    public final GoogleMapsProvider.GoogleMapView.AnonymousClass1 f17920b;

    public n4(GoogleMapsProvider.GoogleMapView.AnonymousClass1 anonymousClass1, int i10) {
        this.f17919a = i10;
        this.f17920b = anonymousClass1;
    }

    @Override
    public final Object call(Object obj) {
        switch (this.f17919a) {
            case 0:
                return GoogleMapsProvider.GoogleMapView.AnonymousClass1.a(this.f17920b, (MotionEvent) obj);
            default:
                return GoogleMapsProvider.GoogleMapView.AnonymousClass1.b(this.f17920b, (MotionEvent) obj);
        }
    }
}
