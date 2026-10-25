package ig;

import org.telegram.messenger.SendMessagesHelper;
public final class z0 extends SendMessagesHelper.LocationProvider {
    public final j1 f14308a;

    public z0(j1 j1Var, y0 y0Var) {
        super(y0Var);
        this.f14308a = j1Var;
    }

    @Override
    public final void stop() {
        super.stop();
        this.f14308a.f14142z0 = null;
    }
}
