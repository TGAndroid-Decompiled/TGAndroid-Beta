package c2;

import android.media.MediaRouter2;
import java.util.List;
public final class j extends MediaRouter2.RouteCallback {
    public final int f2855a;
    public final l f2856b;

    public j(l lVar, int i10) {
        this.f2855a = i10;
        this.f2856b = lVar;
    }

    @Override
    public void onRoutesAdded(List list) {
        switch (this.f2855a) {
            case 0:
                this.f2856b.q();
                return;
            default:
                super.onRoutesAdded(list);
                return;
        }
    }

    @Override
    public void onRoutesChanged(List list) {
        switch (this.f2855a) {
            case 0:
                this.f2856b.q();
                return;
            default:
                super.onRoutesChanged(list);
                return;
        }
    }

    @Override
    public void onRoutesRemoved(List list) {
        switch (this.f2855a) {
            case 0:
                this.f2856b.q();
                return;
            default:
                super.onRoutesRemoved(list);
                return;
        }
    }

    public void onRoutesUpdated(List list) {
        switch (this.f2855a) {
            case 1:
                this.f2856b.q();
                return;
            default:
                super.onRoutesUpdated(list);
                return;
        }
    }
}
