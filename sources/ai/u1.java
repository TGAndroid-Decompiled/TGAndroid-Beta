package ai;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.u10;
import org.telegram.ui.Components.f41;
public final class u1 implements u10 {
    public final int f997a;
    public final b3 f998b;

    public u1(b3 b3Var, int i3) {
        this.f997a = i3;
        this.f998b = b3Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f997a) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                b3 b3Var = this.f998b;
                if (b3Var.f518k2 != intValue) {
                    b3Var.f518k2 = intValue;
                    b3Var.c2.g();
                    b3Var.R1.O(true);
                    return;
                }
                return;
            default:
                List list = (List) obj;
                b3 b3Var2 = this.f998b;
                if (b3Var2.getContext() != null && !b3Var2.J) {
                    ArrayList b10 = xg.s.b(1, list);
                    b3Var2.S1 = b10;
                    List c2 = xg.s.c(b10);
                    b3Var2.S1 = c2;
                    if (!((ArrayList) c2).isEmpty()) {
                        b3Var2.f1();
                        f41 f41Var = b3Var2.R1;
                        if (f41Var != null) {
                            f41Var.O(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
