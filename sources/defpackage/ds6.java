package defpackage;

import android.media.MediaRouter2$RouteCallback;
import java.util.List;
public final class ds6 extends MediaRouter2$RouteCallback {
    public final byte a;
    public final fs6 b;

    public ds6(fs6 fs6Var, byte b) {
        this.a = b;
        this.b = fs6Var;
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
