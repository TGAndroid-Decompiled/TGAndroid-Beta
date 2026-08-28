package c2;

import android.media.MediaRouter2;
import java.util.List;
public final class j extends MediaRouter2.RouteCallback {
    public final int f2182a;
    public final l f2183b;

    public j(l lVar, int i9) {
        this.f2182a = i9;
        this.f2183b = lVar;
    }

    @Override
    public void onRoutesAdded(List list) {
        switch (this.f2182a) {
            case 0:
                this.f2183b.q();
                return;
            default:
                super.onRoutesAdded(list);
                return;
        }
    }

    @Override
    public void onRoutesChanged(List list) {
        switch (this.f2182a) {
            case 0:
                this.f2183b.q();
                return;
            default:
                super.onRoutesChanged(list);
                return;
        }
    }

    @Override
    public void onRoutesRemoved(List list) {
        switch (this.f2182a) {
            case 0:
                this.f2183b.q();
                return;
            default:
                super.onRoutesRemoved(list);
                return;
        }
    }

    public void onRoutesUpdated(List list) {
        switch (this.f2182a) {
            case 1:
                this.f2183b.q();
                return;
            default:
                super.onRoutesUpdated(list);
                return;
        }
    }
}
