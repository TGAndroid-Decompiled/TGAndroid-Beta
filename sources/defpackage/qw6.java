package defpackage;

import android.media.MediaRouter;
public final class qw6 extends MediaRouter.VolumeCallback {
    public final pw6 a;

    public qw6(pw6 pw6Var) {
        this.a = pw6Var;
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
