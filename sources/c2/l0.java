package c2;

import android.media.MediaRouter;

public final class l0 extends r {

    public final MediaRouter.RouteInfo f2305a;

    public l0(MediaRouter.RouteInfo routeInfo) {
        this.f2305a = routeInfo;
    }

    @Override
    public final void f(int i10) {
        this.f2305a.requestSetVolume(i10);
    }

    @Override
    public final void i(int i10) {
        this.f2305a.requestUpdateVolume(i10);
    }
}
