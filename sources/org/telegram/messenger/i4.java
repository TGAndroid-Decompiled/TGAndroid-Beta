package org.telegram.messenger;

import android.view.MotionEvent;
import org.telegram.messenger.GoogleMapsProvider;
import org.telegram.messenger.IMapsProvider;
public final class i4 implements IMapsProvider.ICallableMethod {
    public final int f20555a;
    public final GoogleMapsProvider.GoogleMapView.AnonymousClass1 f20556b;

    public i4(GoogleMapsProvider.GoogleMapView.AnonymousClass1 anonymousClass1, int i9) {
        this.f20555a = i9;
        this.f20556b = anonymousClass1;
    }

    @Override
    public final Object call(Object obj) {
        switch (this.f20555a) {
            case 0:
                return GoogleMapsProvider.GoogleMapView.AnonymousClass1.a(this.f20556b, (MotionEvent) obj);
            default:
                return GoogleMapsProvider.GoogleMapView.AnonymousClass1.b(this.f20556b, (MotionEvent) obj);
        }
    }
}
