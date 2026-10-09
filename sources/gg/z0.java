package gg;

import org.telegram.messenger.SendMessagesHelper;
public final class z0 extends SendMessagesHelper.LocationProvider {
    public final j1 f10878a;

    public z0(j1 j1Var, y0 y0Var) {
        super(y0Var);
        this.f10878a = j1Var;
    }

    @Override
    public final void stop() {
        super.stop();
        this.f10878a.f10699z0 = null;
    }
}
