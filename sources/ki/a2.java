package ki;

import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
public final class a2 implements z10 {
    public final int f18189a;
    public final x2 f18190b;

    public a2(x2 x2Var, int i7) {
        this.f18189a = i7;
        this.f18190b = x2Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f18189a) {
            case 0:
                Boolean bool = (Boolean) obj;
                p2 p2Var = this.f18190b.E;
                if (p2Var != null) {
                    if (bool.booleanValue()) {
                        p2Var.Q = System.currentTimeMillis();
                        p2Var.y("main_button_pressed", null);
                        return;
                    }
                    p2Var.Q = System.currentTimeMillis();
                    p2Var.y("secondary_button_pressed", null);
                    return;
                }
                return;
            default:
                org.telegram.messenger.g0.h3(new kg.t1(4, this.f18190b, (TLRPC.UserFull) obj));
                return;
        }
    }
}
