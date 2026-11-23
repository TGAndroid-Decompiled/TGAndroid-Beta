package ki;

import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
public final class v1 implements w10 {
    public final int f19097a;
    public final t2 f19098b;

    public v1(t2 t2Var, int i7) {
        this.f19097a = i7;
        this.f19098b = t2Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f19097a) {
            case 0:
                Boolean bool = (Boolean) obj;
                k2 k2Var = this.f19098b.E;
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
                org.telegram.messenger.g0.g3(new ji.f(11, this.f19098b, (TLRPC.UserFull) obj));
                return;
        }
    }
}
