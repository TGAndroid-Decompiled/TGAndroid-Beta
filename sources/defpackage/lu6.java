package defpackage;

import android.media.MediaRouter;
public final class lu6 extends MediaRouter.VolumeCallback {
    public final ku6 a;

    public lu6(ku6 ku6Var) {
        this.a = ku6Var;
    }

    @Override
    public final void onVolumeSetRequest(MediaRouter.RouteInfo routeInfo, int i) {
        this.a.a(routeInfo, i);
    }

    @Override
    public final void onVolumeUpdateRequest(MediaRouter.RouteInfo routeInfo, int i) {
        this.a.b(routeInfo, i);
    }
}
