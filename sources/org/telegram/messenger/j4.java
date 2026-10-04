package org.telegram.messenger;

import android.view.MotionEvent;
import org.telegram.messenger.GoogleMapsProvider;
import org.telegram.messenger.IMapsProvider;
public final class j4 implements IMapsProvider.ICallableMethod {
    public final int f18226a;
    public final GoogleMapsProvider.GoogleMapView.AnonymousClass1 f18227b;

    public j4(GoogleMapsProvider.GoogleMapView.AnonymousClass1 anonymousClass1, int i10) {
        this.f18226a = i10;
        this.f18227b = anonymousClass1;
    }

    @Override
    public final Object call(Object obj) {
        switch (this.f18226a) {
            case 0:
                return GoogleMapsProvider.GoogleMapView.AnonymousClass1.a(this.f18227b, (MotionEvent) obj);
            default:
                return GoogleMapsProvider.GoogleMapView.AnonymousClass1.b(this.f18227b, (MotionEvent) obj);
        }
    }
}
