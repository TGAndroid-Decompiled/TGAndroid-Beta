package hg;

import android.location.Location;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class z0 implements SendMessagesHelper.LocationProvider.LocationProviderDelegate {
    public final k1 f11330a;

    public z0(k1 k1Var) {
        this.f11330a = k1Var;
    }

    @Override
    public final void onLocationAcquired(Location location) {
        k1 k1Var = this.f11330a;
        TLRPC.User user = k1Var.f11156w0;
        if (user != null && user.bot_inline_geo) {
            k1Var.f11161z0 = location;
            k1Var.T(true, user, k1Var.f11149r0, "");
        }
    }

    @Override
    public final void onUnableLocationAcquire() {
        this.f11330a.Q();
    }
}
