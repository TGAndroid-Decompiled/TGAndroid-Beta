package org.telegram.messenger;

import android.view.MotionEvent;
import org.telegram.messenger.GoogleMapsProvider;
import org.telegram.messenger.IMapsProvider;
public final class l4 implements IMapsProvider.ICallableMethod {
    public final int f19233a;
    public final GoogleMapsProvider.GoogleMapView.AnonymousClass1 f19234b;

    public l4(GoogleMapsProvider.GoogleMapView.AnonymousClass1 anonymousClass1, int i10) {
        this.f19233a = i10;
        this.f19234b = anonymousClass1;
    }

    @Override
    public final Object call(Object obj) {
        switch (this.f19233a) {
            case 0:
                return GoogleMapsProvider.GoogleMapView.AnonymousClass1.a(this.f19234b, (MotionEvent) obj);
            default:
                return GoogleMapsProvider.GoogleMapView.AnonymousClass1.b(this.f19234b, (MotionEvent) obj);
        }
    }
}
