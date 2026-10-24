package org.telegram.messenger;

import android.view.MotionEvent;
import org.telegram.messenger.GoogleMapsProvider;
import org.telegram.messenger.IMapsProvider;
public final class p4 implements IMapsProvider.ICallableMethod {
    public final int f19240a;
    public final GoogleMapsProvider.GoogleMapView.AnonymousClass1 f19241b;

    public p4(GoogleMapsProvider.GoogleMapView.AnonymousClass1 anonymousClass1, int i10) {
        this.f19240a = i10;
        this.f19241b = anonymousClass1;
    }

    @Override
    public final Object call(Object obj) {
        switch (this.f19240a) {
            case 0:
                return GoogleMapsProvider.GoogleMapView.AnonymousClass1.a(this.f19241b, (MotionEvent) obj);
            default:
                return GoogleMapsProvider.GoogleMapView.AnonymousClass1.b(this.f19241b, (MotionEvent) obj);
        }
    }
}
