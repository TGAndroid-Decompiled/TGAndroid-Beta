package ki;

import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
public final class v1 implements y10 {
    public final int f19000a;
    public final s2 f19001b;

    public v1(s2 s2Var, int i7) {
        this.f19000a = i7;
        this.f19001b = s2Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f19000a) {
            case 0:
                Boolean bool = (Boolean) obj;
                k2 k2Var = this.f19001b.E;
                if (k2Var != null) {
                    if (bool.booleanValue()) {
                        k2Var.Q = System.currentTimeMillis();
                        k2Var.y("main_button_pressed", null);
                        return;
                    }
                    k2Var.Q = System.currentTimeMillis();
                    k2Var.y("secondary_button_pressed", null);
                    return;
                }
                return;
            default:
                org.telegram.messenger.g0.g3(new kg.i0(7, this.f19001b, (TLRPC.UserFull) obj));
                return;
        }
    }
}
