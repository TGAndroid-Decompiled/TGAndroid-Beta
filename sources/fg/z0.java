package fg;

import android.location.Location;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class z0 implements SendMessagesHelper.LocationProvider.LocationProviderDelegate {
    public final l1 f8276a;

    public z0(l1 l1Var) {
        this.f8276a = l1Var;
    }

    @Override
    public final void onLocationAcquired(Location location) {
        l1 l1Var = this.f8276a;
        TLRPC.User user = l1Var.f8129w0;
        if (user != null && user.bot_inline_geo) {
            l1Var.f8134z0 = location;
            l1Var.T(true, user, l1Var.f8122r0, "");
        }
    }

    @Override
    public final void onUnableLocationAcquire() {
        this.f8276a.Q();
    }
}
