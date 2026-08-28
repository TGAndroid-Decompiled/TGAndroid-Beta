package c2;

import android.media.MediaRouter;
public final class m0 extends r {
    public final MediaRouter.RouteInfo f2195a;

    public m0(MediaRouter.RouteInfo routeInfo) {
        this.f2195a = routeInfo;
    }

    @Override
    public final void f(int i9) {
        this.f2195a.requestSetVolume(i9);
    }

    @Override
    public final void i(int i9) {
        this.f2195a.requestUpdateVolume(i9);
    }
}
