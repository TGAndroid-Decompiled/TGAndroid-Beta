package defpackage;

import android.media.MediaRouter2$RouteCallback;
import java.util.List;
public final class eu6 extends MediaRouter2$RouteCallback {
    public final byte a;
    public final gu6 b;

    public eu6(gu6 gu6Var, byte b) {
        this.a = b;
        this.b = gu6Var;
    }

    public final void onRoutesAdded(List list) {
        switch (this.a) {
            case 0:
                this.b.q();
                return;
            default:
                super.onRoutesAdded(list);
                return;
        }
    }

    public final void onRoutesChanged(List list) {
        switch (this.a) {
            case 0:
                this.b.q();
                return;
            default:
                super.onRoutesChanged(list);
                return;
        }
    }

    public final void onRoutesRemoved(List list) {
        switch (this.a) {
            case 0:
                this.b.q();
                return;
            default:
                super.onRoutesRemoved(list);
                return;
        }
    }

    public final void onRoutesUpdated(List list) {
        switch (this.a) {
            case 1:
                this.b.q();
                return;
            default:
                super.onRoutesUpdated(list);
                return;
        }
    }
}
