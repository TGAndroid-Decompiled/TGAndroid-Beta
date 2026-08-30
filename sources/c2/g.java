package c2;

import android.media.MediaRouter2;
public final class g extends MediaRouter2.ControllerCallback {
    public final l f1941a;

    public g(l lVar) {
        this.f1941a = lVar;
    }

    @Override
    public final void onControllerUpdated(MediaRouter2.RoutingController routingController) {
        this.f1941a.r(routingController);
    }
}
