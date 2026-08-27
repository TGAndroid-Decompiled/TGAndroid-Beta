package org.telegram.messenger;

import android.view.MotionEvent;

public final class k4 implements IMapsProvider.ICallableMethod {

    public final int f20735a;

    public final GoogleMapsProvider.GoogleMapView.AnonymousClass1 f20736b;

    public k4(GoogleMapsProvider.GoogleMapView.AnonymousClass1 anonymousClass1, int i10) {
        this.f20735a = i10;
        this.f20736b = anonymousClass1;
    }

    @Override
    public final Object call(Object obj) {
        switch (this.f20735a) {
            case 0:
                return this.f20736b.lambda$dispatchTouchEvent$0((MotionEvent) obj);
            default:
                return this.f20736b.lambda$onInterceptTouchEvent$1((MotionEvent) obj);
        }
    }
}
