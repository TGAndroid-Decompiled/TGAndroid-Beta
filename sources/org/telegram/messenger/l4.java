package org.telegram.messenger;

import android.view.MotionEvent;
import org.telegram.messenger.GoogleMapsProvider;
import org.telegram.messenger.IMapsProvider;
public final class l4 implements IMapsProvider.ICallableMethod {
    public final int f17727a;
    public final GoogleMapsProvider.GoogleMapView.AnonymousClass1 f17728b;

    public l4(GoogleMapsProvider.GoogleMapView.AnonymousClass1 anonymousClass1, int i10) {
        this.f17727a = i10;
        this.f17728b = anonymousClass1;
    }

    @Override
    public final Object call(Object obj) {
        switch (this.f17727a) {
            case 0:
                return GoogleMapsProvider.GoogleMapView.AnonymousClass1.a(this.f17728b, (MotionEvent) obj);
            default:
                return GoogleMapsProvider.GoogleMapView.AnonymousClass1.b(this.f17728b, (MotionEvent) obj);
        }
    }
}
