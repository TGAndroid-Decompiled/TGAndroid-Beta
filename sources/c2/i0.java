package c2;

import android.media.MediaRouter;
public final class i0 extends MediaRouter.VolumeCallback {
    public final h0 f2181a;

    public i0(h0 h0Var) {
        this.f2181a = h0Var;
    }

    @Override
    public final void onVolumeSetRequest(MediaRouter.RouteInfo routeInfo, int i9) {
        this.f2181a.a(routeInfo, i9);
    }

    @Override
    public final void onVolumeUpdateRequest(MediaRouter.RouteInfo routeInfo, int i9) {
        this.f2181a.b(routeInfo, i9);
    }
}
