package hg;

import org.telegram.messenger.SendMessagesHelper;
public final class z0 extends SendMessagesHelper.LocationProvider {
    public final j1 f12114a;

    public z0(j1 j1Var, y0 y0Var) {
        super(y0Var);
        this.f12114a = j1Var;
    }

    @Override
    public final void stop() {
        super.stop();
        this.f12114a.f11953z0 = null;
    }
}
