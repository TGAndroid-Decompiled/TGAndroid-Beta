package fg;

import org.telegram.messenger.SendMessagesHelper;
public final class a1 extends SendMessagesHelper.LocationProvider {
    public final l1 f7951a;

    public a1(l1 l1Var, z0 z0Var) {
        super(z0Var);
        this.f7951a = l1Var;
    }

    @Override
    public final void stop() {
        super.stop();
        this.f7951a.f8134z0 = null;
    }
}
