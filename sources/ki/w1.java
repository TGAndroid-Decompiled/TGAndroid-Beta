package ki;

import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
public final class w1 implements x10 {
    public final int f19021a;
    public final t2 f19022b;

    public w1(t2 t2Var, int i7) {
        this.f19021a = i7;
        this.f19022b = t2Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f19021a) {
            case 0:
                Boolean bool = (Boolean) obj;
                l2 l2Var = this.f19022b.E;
                if (l2Var != null) {
                    if (bool.booleanValue()) {
                        l2Var.Q = System.currentTimeMillis();
                        l2Var.y("main_button_pressed", null);
                        return;
                    }
                    l2Var.Q = System.currentTimeMillis();
                    l2Var.y("secondary_button_pressed", null);
                    return;
                }
                return;
            default:
                org.telegram.messenger.g0.g3(new kg.h0(7, this.f19022b, (TLRPC.UserFull) obj));
                return;
        }
    }
}
