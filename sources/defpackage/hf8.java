package defpackage;

import android.media.MediaRouter;
public final class hf8 extends aw6 {
    public final MediaRouter.RouteInfo a;

    public hf8(MediaRouter.RouteInfo routeInfo) {
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
