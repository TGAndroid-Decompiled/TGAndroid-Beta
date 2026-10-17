package org.telegram.messenger;

import android.view.MotionEvent;
import org.telegram.messenger.GoogleMapsProvider;
import org.telegram.messenger.IMapsProvider;
public final class m4 implements IMapsProvider.ICallableMethod {
    public final int f18930a;
    public final GoogleMapsProvider.GoogleMapView.AnonymousClass1 f18931b;

    public m4(GoogleMapsProvider.GoogleMapView.AnonymousClass1 anonymousClass1, int i10) {
        this.f18930a = i10;
        this.f18931b = anonymousClass1;
    }

    @Override
    public final Object call(Object obj) {
        switch (this.f18930a) {
            case 0:
                return GoogleMapsProvider.GoogleMapView.AnonymousClass1.a(this.f18931b, (MotionEvent) obj);
            default:
                return GoogleMapsProvider.GoogleMapView.AnonymousClass1.b(this.f18931b, (MotionEvent) obj);
        }
    }
}
