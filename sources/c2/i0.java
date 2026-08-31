package c2;

import android.media.MediaRouter;
public final class i0 extends MediaRouter.VolumeCallback {
    public final h0 f2123a;

    public i0(h0 h0Var) {
        this.f2123a = h0Var;
    }

    @Override
    public final void onVolumeSetRequest(MediaRouter.RouteInfo routeInfo, int i10) {
        this.f2123a.a(routeInfo, i10);
    }

    @Override
    public final void onVolumeUpdateRequest(MediaRouter.RouteInfo routeInfo, int i10) {
        this.f2123a.b(routeInfo, i10);
    }
}
