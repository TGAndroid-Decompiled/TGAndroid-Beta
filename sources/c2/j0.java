package c2;

import android.media.MediaRouter;
public final class j0 extends MediaRouter.VolumeCallback {
    public final i0 f1987a;

    public j0(i0 i0Var) {
        this.f1987a = i0Var;
    }

    @Override
    public final void onVolumeSetRequest(MediaRouter.RouteInfo routeInfo, int i10) {
        this.f1987a.a(routeInfo, i10);
    }

    @Override
    public final void onVolumeUpdateRequest(MediaRouter.RouteInfo routeInfo, int i10) {
        this.f1987a.b(routeInfo, i10);
    }
}
