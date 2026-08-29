package c2;

import android.media.MediaRouter;
public final class n0 extends s {
    public final MediaRouter.RouteInfo f2870a;

    public n0(MediaRouter.RouteInfo routeInfo) {
        this.f2870a = routeInfo;
    }

    @Override
    public final void f(int i10) {
        this.f2870a.requestSetVolume(i10);
    }

    @Override
    public final void i(int i10) {
        this.f2870a.requestUpdateVolume(i10);
    }
}
