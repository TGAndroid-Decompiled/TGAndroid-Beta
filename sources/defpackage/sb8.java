package defpackage;

import android.media.MediaRouter;
public final class sb8 extends vt6 {
    public final MediaRouter.RouteInfo a;

    public sb8(MediaRouter.RouteInfo routeInfo) {
        this.a = routeInfo;
    }

    @Override
    public final void f(int i) {
        this.a.requestSetVolume(i);
    }

    @Override
    public final void i(int i) {
        this.a.requestUpdateVolume(i);
    }
}
