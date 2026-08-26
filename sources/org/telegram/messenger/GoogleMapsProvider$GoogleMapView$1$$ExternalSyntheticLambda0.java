package org.telegram.messenger;

import android.view.MotionEvent;

public final class GoogleMapsProvider$GoogleMapView$1$$ExternalSyntheticLambda0 implements IMapsProvider.ICallableMethod {
    public final int $r8$classId;
    public final GoogleMapsProvider.GoogleMapView.AnonymousClass1 f$0;

    public GoogleMapsProvider$GoogleMapView$1$$ExternalSyntheticLambda0(GoogleMapsProvider.GoogleMapView.AnonymousClass1 anonymousClass1, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass1;
    }

    @Override
    public final Object call(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                return this.f$0.lambda$dispatchTouchEvent$0((MotionEvent) obj);
            default:
                return this.f$0.lambda$onInterceptTouchEvent$1((MotionEvent) obj);
        }
    }
}
