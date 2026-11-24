package defpackage;

import android.media.MediaRouter;
public final class lw6 extends MediaRouter.VolumeCallback {
    public final kw6 a;

    public lw6(kw6 kw6Var) {
        this.a = kw6Var;
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
