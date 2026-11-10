package hi;

import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;
public final class a2 implements c20 {
    public final int f14507a;
    public final a3 f14508b;

    public a2(a3 a3Var, int i7) {
        this.f14507a = i7;
        this.f14508b = a3Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f14507a) {
            case 0:
                Boolean bool = (Boolean) obj;
                s2 s2Var = this.f14508b.D;
                if (s2Var != null) {
                    if (bool.booleanValue()) {
                        s2Var.P = System.currentTimeMillis();
                        s2Var.y("main_button_pressed", null);
                        return;
                    }
                    s2Var.P = System.currentTimeMillis();
                    s2Var.y("secondary_button_pressed", null);
                    return;
                }
                return;
            default:
                org.telegram.messenger.g0.h3(new ha.b(2, this.f14508b, (TLRPC.UserFull) obj));
                return;
        }
    }
}
