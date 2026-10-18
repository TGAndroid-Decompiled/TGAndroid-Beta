package org.telegram.messenger;

import android.view.MotionEvent;
import org.telegram.messenger.GoogleMapsProvider;
import org.telegram.messenger.IMapsProvider;
public final class n4 implements IMapsProvider.ICallableMethod {
    public final int f19012a;
    public final GoogleMapsProvider.GoogleMapView.AnonymousClass1 f19013b;

    public n4(GoogleMapsProvider.GoogleMapView.AnonymousClass1 anonymousClass1, int i10) {
        this.f19012a = i10;
        this.f19013b = anonymousClass1;
    }

    @Override
    public final Object call(Object obj) {
        switch (this.f19012a) {
            case 0:
                return GoogleMapsProvider.GoogleMapView.AnonymousClass1.a(this.f19013b, (MotionEvent) obj);
            default:
                return GoogleMapsProvider.GoogleMapView.AnonymousClass1.b(this.f19013b, (MotionEvent) obj);
        }
    }
}
