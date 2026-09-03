package c2;

import android.media.MediaRouter;
public final class n0 extends s {
    public final MediaRouter.RouteInfo f2000a;

    public n0(MediaRouter.RouteInfo routeInfo) {
        this.f2000a = routeInfo;
    }

    @Override
    public final void f(int i10) {
        this.f2000a.requestSetVolume(i10);
    }

    @Override
    public final void i(int i10) {
        this.f2000a.requestUpdateVolume(i10);
    }
}
