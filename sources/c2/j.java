package c2;

import android.media.MediaRouter2;
import java.util.List;
public final class j extends MediaRouter2.RouteCallback {
    public final int f1956a;
    public final l f1957b;

    public j(l lVar, int i10) {
        this.f1956a = i10;
        this.f1957b = lVar;
    }

    @Override
    public void onRoutesAdded(List list) {
        switch (this.f1956a) {
            case 0:
                this.f1957b.q();
                return;
            default:
                super.onRoutesAdded(list);
                return;
        }
    }

    @Override
    public void onRoutesChanged(List list) {
        switch (this.f1956a) {
            case 0:
                this.f1957b.q();
                return;
            default:
                super.onRoutesChanged(list);
                return;
        }
    }

    @Override
    public void onRoutesRemoved(List list) {
        switch (this.f1956a) {
            case 0:
                this.f1957b.q();
                return;
            default:
                super.onRoutesRemoved(list);
                return;
        }
    }

    public void onRoutesUpdated(List list) {
        switch (this.f1956a) {
            case 1:
                this.f1957b.q();
                return;
            default:
                super.onRoutesUpdated(list);
                return;
        }
    }
}
