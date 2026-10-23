package hg;

import android.location.Location;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class y0 implements SendMessagesHelper.LocationProvider.LocationProviderDelegate {
    public final j1 f12138a;

    public y0(j1 j1Var) {
        this.f12138a = j1Var;
    }

    @Override
    public final void onLocationAcquired(Location location) {
        j1 j1Var = this.f12138a;
        TLRPC.User user = j1Var.f11974w0;
        if (user != null && user.bot_inline_geo) {
            j1Var.f11979z0 = location;
            j1Var.T(true, user, j1Var.f11967r0, "");
        }
    }

    @Override
    public final void onUnableLocationAcquire() {
        this.f12138a.Q();
    }
}
