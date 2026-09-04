package org.telegram.messenger;

import android.view.MotionEvent;
import org.telegram.messenger.GoogleMapsProvider;
import org.telegram.messenger.IMapsProvider;
public final class j4 implements IMapsProvider.ICallableMethod {
    public final int f18026a;
    public final GoogleMapsProvider.GoogleMapView.AnonymousClass1 f18027b;

    public j4(GoogleMapsProvider.GoogleMapView.AnonymousClass1 anonymousClass1, int i10) {
        this.f18026a = i10;
        this.f18027b = anonymousClass1;
    }

    @Override
    public final Object call(Object obj) {
        switch (this.f18026a) {
            case 0:
                return GoogleMapsProvider.GoogleMapView.AnonymousClass1.a(this.f18027b, (MotionEvent) obj);
            default:
                return GoogleMapsProvider.GoogleMapView.AnonymousClass1.b(this.f18027b, (MotionEvent) obj);
        }
    }
}
