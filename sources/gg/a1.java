package gg;

import org.telegram.messenger.SendMessagesHelper;
public final class a1 extends SendMessagesHelper.LocationProvider {
    public final k1 f10512a;

    public a1(k1 k1Var, z0 z0Var) {
        super(z0Var);
        this.f10512a = k1Var;
    }

    @Override
    public final void stop() {
        super.stop();
        this.f10512a.f10701z0 = null;
    }
}
