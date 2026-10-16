package org.telegram.messenger;

import android.view.MotionEvent;
import org.telegram.messenger.GoogleMapsProvider;
import org.telegram.messenger.IMapsProvider;
public final class n4 implements IMapsProvider.ICallableMethod {
    public final int f17616a;
    public final GoogleMapsProvider.GoogleMapView.AnonymousClass1 f17617b;

    public n4(GoogleMapsProvider.GoogleMapView.AnonymousClass1 anonymousClass1, int i10) {
        this.f17616a = i10;
        this.f17617b = anonymousClass1;
    }

    @Override
    public final Object call(Object obj) {
        switch (this.f17616a) {
            case 0:
                return GoogleMapsProvider.GoogleMapView.AnonymousClass1.a(this.f17617b, (MotionEvent) obj);
            default:
                return GoogleMapsProvider.GoogleMapView.AnonymousClass1.b(this.f17617b, (MotionEvent) obj);
        }
    }
}
