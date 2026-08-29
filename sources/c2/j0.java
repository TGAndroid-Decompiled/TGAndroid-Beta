package c2;

import android.media.MediaRouter;
public final class j0 extends MediaRouter.VolumeCallback {
    public final i0 f2857a;

    public j0(i0 i0Var) {
        this.f2857a = i0Var;
    }

    @Override
    public final void onVolumeSetRequest(MediaRouter.RouteInfo routeInfo, int i10) {
        this.f2857a.a(routeInfo, i10);
    }

    @Override
    public final void onVolumeUpdateRequest(MediaRouter.RouteInfo routeInfo, int i10) {
        this.f2857a.b(routeInfo, i10);
    }
}
