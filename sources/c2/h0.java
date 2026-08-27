package c2;

import android.media.MediaRouter;

public final class h0 extends MediaRouter.VolumeCallback {

    public final g0 f2292a;

    public h0(g0 g0Var) {
        this.f2292a = g0Var;
    }

    @Override
    public final void onVolumeSetRequest(MediaRouter.RouteInfo routeInfo, int i10) {
        this.f2292a.a(routeInfo, i10);
    }

    @Override
    public final void onVolumeUpdateRequest(MediaRouter.RouteInfo routeInfo, int i10) {
        this.f2292a.b(routeInfo, i10);
    }
}
