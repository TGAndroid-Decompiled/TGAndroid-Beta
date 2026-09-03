package c2;

import android.media.MediaRouter2;
public final class g extends MediaRouter2.ControllerCallback {
    public final l f1968a;

    public g(l lVar) {
        this.f1968a = lVar;
    }

    @Override
    public final void onControllerUpdated(MediaRouter2.RoutingController routingController) {
        this.f1968a.r(routingController);
    }
}
