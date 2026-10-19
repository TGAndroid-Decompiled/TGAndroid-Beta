package hg;

import android.location.Location;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class y0 implements SendMessagesHelper.LocationProvider.LocationProviderDelegate {
    public final j1 f12110a;

    public y0(j1 j1Var) {
        this.f12110a = j1Var;
    }

    @Override
    public final void onLocationAcquired(Location location) {
        j1 j1Var = this.f12110a;
        TLRPC.User user = j1Var.f11948w0;
        if (user != null && user.bot_inline_geo) {
            j1Var.f11953z0 = location;
            j1Var.T(true, user, j1Var.f11941r0, "");
        }
    }

    @Override
    public final void onUnableLocationAcquire() {
        this.f12110a.Q();
    }
}
