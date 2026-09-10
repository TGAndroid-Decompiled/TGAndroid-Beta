package org.telegram.messenger;

import android.view.MotionEvent;
import org.telegram.messenger.GoogleMapsProvider;
import org.telegram.messenger.IMapsProvider;
public final class o4 implements IMapsProvider.ICallableMethod {
    public final int f15928a;
    public final GoogleMapsProvider.GoogleMapView.AnonymousClass1 f15929b;

    public o4(GoogleMapsProvider.GoogleMapView.AnonymousClass1 anonymousClass1, int i10) {
        this.f15928a = i10;
        this.f15929b = anonymousClass1;
    }

    @Override
    public final Object call(Object obj) {
        switch (this.f15928a) {
            case 0:
                return GoogleMapsProvider.GoogleMapView.AnonymousClass1.a(this.f15929b, (MotionEvent) obj);
            default:
                return GoogleMapsProvider.GoogleMapView.AnonymousClass1.b(this.f15929b, (MotionEvent) obj);
        }
    }
}
