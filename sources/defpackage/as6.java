package defpackage;

import android.media.MediaRouter2;
import android.media.MediaRouter2$ControllerCallback;
public final class as6 extends MediaRouter2$ControllerCallback {
    public final fs6 a;

    public as6(fs6 fs6Var) {
        this.a = fs6Var;
    }

    public final void onControllerUpdated(MediaRouter2.RoutingController routingController) {
        this.a.r(routingController);
    }
}
