package org.telegram.messenger;

import android.view.MotionEvent;
import org.telegram.messenger.GoogleMapsProvider;
import org.telegram.messenger.IMapsProvider;
public final class r4 implements IMapsProvider.ICallableMethod {
    public final int f21085a;
    public final GoogleMapsProvider.GoogleMapView.AnonymousClass1 f21086b;

    public r4(GoogleMapsProvider.GoogleMapView.AnonymousClass1 anonymousClass1, int i10) {
        this.f21085a = i10;
        this.f21086b = anonymousClass1;
    }

    @Override
    public final Object call(Object obj) {
        switch (this.f21085a) {
            case 0:
                return GoogleMapsProvider.GoogleMapView.AnonymousClass1.a(this.f21086b, (MotionEvent) obj);
            default:
                return GoogleMapsProvider.GoogleMapView.AnonymousClass1.b(this.f21086b, (MotionEvent) obj);
        }
    }
}
