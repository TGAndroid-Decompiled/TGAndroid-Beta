package ii;

import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
public final class a2 implements u10 {
    public final int f14787a;
    public final a3 f14788b;

    public a2(a3 a3Var, int i3) {
        this.f14787a = i3;
        this.f14788b = a3Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f14787a) {
            case 0:
                Boolean bool = (Boolean) obj;
                s2 s2Var = this.f14788b.E;
                if (s2Var != null) {
                    if (bool.booleanValue()) {
                        s2Var.Q = System.currentTimeMillis();
                        s2Var.y("main_button_pressed", null);
                        return;
                    }
                    s2Var.Q = System.currentTimeMillis();
                    s2Var.y("secondary_button_pressed", null);
                    return;
                }
                return;
            default:
                org.telegram.messenger.g0.h3(new e(1, this.f14788b, (TLRPC.UserFull) obj));
                return;
        }
    }
}
