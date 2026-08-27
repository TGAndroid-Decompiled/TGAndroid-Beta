package c2;

import android.media.MediaRouter2;
import java.util.List;

public final class j extends MediaRouter2.RouteCallback {

    public final int f2295a;

    public final l f2296b;

    public j(l lVar, int i10) {
        this.f2295a = i10;
        this.f2296b = lVar;
    }

    @Override
    public void onRoutesAdded(List list) {
        switch (this.f2295a) {
            case 0:
                this.f2296b.q();
                break;
            default:
                super.onRoutesAdded(list);
                break;
        }
    }

    @Override
    public void onRoutesChanged(List list) {
        switch (this.f2295a) {
            case 0:
                this.f2296b.q();
                break;
            default:
                super.onRoutesChanged(list);
                break;
        }
    }

    @Override
    public void onRoutesRemoved(List list) {
        switch (this.f2295a) {
            case 0:
                this.f2296b.q();
                break;
            default:
                super.onRoutesRemoved(list);
                break;
        }
    }

    @Override
    public void onRoutesUpdated(List list) {
        switch (this.f2295a) {
            case 1:
                this.f2296b.q();
                break;
            default:
                super.onRoutesUpdated(list);
                break;
        }
    }
}
