package hg;

import org.telegram.messenger.SendMessagesHelper;
public final class a1 extends SendMessagesHelper.LocationProvider {
    public final k1 f10974a;

    public a1(k1 k1Var, z0 z0Var) {
        super(z0Var);
        this.f10974a = k1Var;
    }

    @Override
    public final void stop() {
        super.stop();
        this.f10974a.f11161z0 = null;
    }
}
