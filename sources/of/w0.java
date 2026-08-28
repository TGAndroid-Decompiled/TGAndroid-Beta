package of;

import org.telegram.messenger.SendMessagesHelper;
public final class w0 extends SendMessagesHelper.LocationProvider {
    public final f1 f19542a;

    public w0(f1 f1Var, v0 v0Var) {
        super(v0Var);
        this.f19542a = f1Var;
    }

    @Override
    public final void stop() {
        super.stop();
        this.f19542a.f19346v0 = null;
    }
}
