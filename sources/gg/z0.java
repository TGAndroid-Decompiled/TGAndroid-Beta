package gg;

import android.location.Location;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class z0 implements SendMessagesHelper.LocationProvider.LocationProviderDelegate {
    public final k1 f10001a;

    public z0(k1 k1Var) {
        this.f10001a = k1Var;
    }

    @Override
    public final void onLocationAcquired(Location location) {
        k1 k1Var = this.f10001a;
        TLRPC.User user = k1Var.f9842w0;
        if (user != null && user.bot_inline_geo) {
            k1Var.f9847z0 = location;
            k1Var.T(true, user, k1Var.f9835r0, "");
        }
    }

    @Override
    public final void onUnableLocationAcquire() {
        this.f10001a.Q();
    }
}
