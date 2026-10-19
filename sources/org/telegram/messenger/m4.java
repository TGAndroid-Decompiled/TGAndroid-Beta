package org.telegram.messenger;

import android.view.MotionEvent;
import org.telegram.messenger.GoogleMapsProvider;
import org.telegram.messenger.IMapsProvider;
public final class m4 implements IMapsProvider.ICallableMethod {
    public final int f18933a;
    public final GoogleMapsProvider.GoogleMapView.AnonymousClass1 f18934b;

    public m4(GoogleMapsProvider.GoogleMapView.AnonymousClass1 anonymousClass1, int i10) {
        this.f18933a = i10;
        this.f18934b = anonymousClass1;
    }

    @Override
    public final Object call(Object obj) {
        switch (this.f18933a) {
            case 0:
                return GoogleMapsProvider.GoogleMapView.AnonymousClass1.a(this.f18934b, (MotionEvent) obj);
            default:
                return GoogleMapsProvider.GoogleMapView.AnonymousClass1.b(this.f18934b, (MotionEvent) obj);
        }
    }
}
