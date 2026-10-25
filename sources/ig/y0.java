package ig;

import android.location.Location;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class y0 implements SendMessagesHelper.LocationProvider.LocationProviderDelegate {
    public final j1 f14304a;

    public y0(j1 j1Var) {
        this.f14304a = j1Var;
    }

    @Override
    public final void onLocationAcquired(Location location) {
        j1 j1Var = this.f14304a;
        TLRPC.User user = j1Var.f14137w0;
        if (user != null && user.bot_inline_geo) {
            j1Var.f14142z0 = location;
            j1Var.T(true, user, j1Var.f14130r0, "");
        }
    }

    @Override
    public final void onUnableLocationAcquire() {
        this.f14304a.Q();
    }
}
