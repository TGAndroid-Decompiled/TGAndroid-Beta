package org.telegram.messenger;

import android.view.MotionEvent;
import org.telegram.messenger.GoogleMapsProvider;
import org.telegram.messenger.IMapsProvider;
public final class k4 implements IMapsProvider.ICallableMethod {
    public final int f18323a;
    public final GoogleMapsProvider.GoogleMapView.AnonymousClass1 f18324b;

    public k4(GoogleMapsProvider.GoogleMapView.AnonymousClass1 anonymousClass1, int i10) {
        this.f18323a = i10;
        this.f18324b = anonymousClass1;
    }

    @Override
    public final Object call(Object obj) {
        switch (this.f18323a) {
            case 0:
                return GoogleMapsProvider.GoogleMapView.AnonymousClass1.a(this.f18324b, (MotionEvent) obj);
            default:
                return GoogleMapsProvider.GoogleMapView.AnonymousClass1.b(this.f18324b, (MotionEvent) obj);
        }
    }
}
