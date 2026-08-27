package c2;

import android.media.MediaRouter2;

public final class g extends MediaRouter2.ControllerCallback {

    public final l f2281a;

    public g(l lVar) {
        this.f2281a = lVar;
    }

    @Override
    public final void onControllerUpdated(MediaRouter2.RoutingController routingController) {
        this.f2281a.r(routingController);
    }
}
