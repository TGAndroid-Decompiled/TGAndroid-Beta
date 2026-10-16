package hg;

import org.telegram.messenger.SendMessagesHelper;
public final class z0 extends SendMessagesHelper.LocationProvider {
    public final j1 f10808a;

    public z0(j1 j1Var, y0 y0Var) {
        super(y0Var);
        this.f10808a = j1Var;
    }

    @Override
    public final void stop() {
        super.stop();
        this.f10808a.f10647z0 = null;
    }
}
