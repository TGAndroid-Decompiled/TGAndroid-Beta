package org.telegram.messenger;

import android.view.MotionEvent;
import org.telegram.messenger.GoogleMapsProvider;
import org.telegram.messenger.IMapsProvider;
public final class n4 implements IMapsProvider.ICallableMethod {
    public final int f19015a;
    public final GoogleMapsProvider.GoogleMapView.AnonymousClass1 f19016b;

    public n4(GoogleMapsProvider.GoogleMapView.AnonymousClass1 anonymousClass1, int i10) {
        this.f19015a = i10;
        this.f19016b = anonymousClass1;
    }

    @Override
    public final Object call(Object obj) {
        switch (this.f19015a) {
            case 0:
                return GoogleMapsProvider.GoogleMapView.AnonymousClass1.a(this.f19016b, (MotionEvent) obj);
            default:
                return GoogleMapsProvider.GoogleMapView.AnonymousClass1.b(this.f19016b, (MotionEvent) obj);
        }
    }
}
