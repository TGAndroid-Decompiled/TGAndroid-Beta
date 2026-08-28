package of;

import android.location.Location;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class v0 implements SendMessagesHelper.LocationProvider.LocationProviderDelegate {
    public final f1 f19523a;

    public v0(f1 f1Var) {
        this.f19523a = f1Var;
    }

    @Override
    public final void onLocationAcquired(Location location) {
        f1 f1Var = this.f19523a;
        TLRPC.User user = f1Var.f19343s0;
        if (user != null && user.bot_inline_geo) {
            f1Var.f19346v0 = location;
            f1Var.T(true, user, f1Var.f19336n0, "");
        }
    }

    @Override
    public final void onUnableLocationAcquire() {
        this.f19523a.Q();
    }
}
