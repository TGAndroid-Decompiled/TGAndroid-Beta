package org.telegram.messenger;

import android.view.MotionEvent;
import org.telegram.messenger.GoogleMapsProvider;
import org.telegram.messenger.IMapsProvider;
public final class j4 implements IMapsProvider.ICallableMethod {
    public final int f16700a;
    public final GoogleMapsProvider.GoogleMapView.AnonymousClass1 f16701b;

    public j4(GoogleMapsProvider.GoogleMapView.AnonymousClass1 anonymousClass1, int i10) {
        this.f16700a = i10;
        this.f16701b = anonymousClass1;
    }

    @Override
    public final Object call(Object obj) {
        switch (this.f16700a) {
            case 0:
                return GoogleMapsProvider.GoogleMapView.AnonymousClass1.a(this.f16701b, (MotionEvent) obj);
            default:
                return GoogleMapsProvider.GoogleMapView.AnonymousClass1.b(this.f16701b, (MotionEvent) obj);
        }
    }
}
