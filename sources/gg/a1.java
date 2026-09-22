package gg;

import org.telegram.messenger.SendMessagesHelper;
public final class a1 extends SendMessagesHelper.LocationProvider {
    public final k1 f9669a;

    public a1(k1 k1Var, z0 z0Var) {
        super(z0Var);
        this.f9669a = k1Var;
    }

    @Override
    public final void stop() {
        super.stop();
        this.f9669a.f9843z0 = null;
    }
}
