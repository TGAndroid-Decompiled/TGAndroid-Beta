package ih;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.k51;
public final class e1 implements Utilities.Callback {
    public final int f9116a;
    public final h2 f9117b;

    public e1(h2 h2Var, int i10) {
        this.f9116a = i10;
        this.f9117b = h2Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f9116a) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                h2 h2Var = this.f9117b;
                if (h2Var.f9217o0 != intValue) {
                    h2Var.f9217o0 = intValue;
                    h2Var.f9210g0.g();
                    h2Var.U.N(true);
                    return;
                }
                return;
            default:
                List list = (List) obj;
                h2 h2Var2 = this.f9117b;
                if (h2Var2.getContext() != null && h2Var2.isShown()) {
                    ArrayList b10 = eg.q0.b(1, list);
                    h2Var2.V = b10;
                    List c3 = eg.q0.c(b10);
                    h2Var2.V = c3;
                    if (!((ArrayList) c3).isEmpty()) {
                        h2Var2.W();
                        k51 k51Var = h2Var2.U;
                        if (k51Var != null) {
                            k51Var.N(true);
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
