package defpackage;

import android.media.MediaRouter2;
import android.media.MediaRouter2$ControllerCallback;
public final class bu6 extends MediaRouter2$ControllerCallback {
    public final gu6 a;

    public bu6(gu6 gu6Var) {
        this.a = gu6Var;
    }

    public final void onControllerUpdated(MediaRouter2.RoutingController routingController) {
        this.a.r(routingController);
    }
}
