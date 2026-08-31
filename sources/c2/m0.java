package c2;

import android.media.MediaRouter;
public final class m0 extends s {
    public final MediaRouter.RouteInfo f2137a;

    public m0(MediaRouter.RouteInfo routeInfo) {
        this.f2137a = routeInfo;
    }

    @Override
    public final void f(int i10) {
        this.f2137a.requestSetVolume(i10);
    }

    @Override
    public final void i(int i10) {
        this.f2137a.requestUpdateVolume(i10);
    }
}
