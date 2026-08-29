package c2;

import android.media.MediaRouter2;
public final class g extends MediaRouter2.ControllerCallback {
    public final l f2837a;

    public g(l lVar) {
        this.f2837a = lVar;
    }

    @Override
    public final void onControllerUpdated(MediaRouter2.RoutingController routingController) {
        this.f2837a.r(routingController);
    }
}
