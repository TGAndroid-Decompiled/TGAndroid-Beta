package ig;

import android.location.Location;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class y0 implements SendMessagesHelper.LocationProvider.LocationProviderDelegate {
    public final j1 f14303a;

    public y0(j1 j1Var) {
        this.f14303a = j1Var;
    }

    @Override
    public final void onLocationAcquired(Location location) {
        j1 j1Var = this.f14303a;
        TLRPC.User user = j1Var.f14136w0;
        if (user != null && user.bot_inline_geo) {
            j1Var.f14141z0 = location;
            j1Var.T(true, user, j1Var.f14129r0, "");
        }
    }

    @Override
    public final void onUnableLocationAcquire() {
        this.f14303a.Q();
    }
}
