package ig;

import org.telegram.messenger.SendMessagesHelper;
public final class z0 extends SendMessagesHelper.LocationProvider {
    public final j1 f14307a;

    public z0(j1 j1Var, y0 y0Var) {
        super(y0Var);
        this.f14307a = j1Var;
    }

    @Override
    public final void stop() {
        super.stop();
        this.f14307a.f14141z0 = null;
    }
}
