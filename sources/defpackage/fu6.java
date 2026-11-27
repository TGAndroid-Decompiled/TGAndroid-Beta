package defpackage;

import android.media.MediaRouter2;
import android.media.MediaRouter2$ControllerCallback;
public final class fu6 extends MediaRouter2$ControllerCallback {
    public final ku6 a;

    public fu6(ku6 ku6Var) {
        this.a = ku6Var;
    }

    public final void onControllerUpdated(MediaRouter2.RoutingController routingController) {
        this.a.r(routingController);
    }
}
