package c2;

import android.media.MediaRouter2;
public final class g extends MediaRouter2.ControllerCallback {
    public final l f2109a;

    public g(l lVar) {
        this.f2109a = lVar;
    }

    @Override
    public final void onControllerUpdated(MediaRouter2.RoutingController routingController) {
        this.f2109a.r(routingController);
    }
}
