package fh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.z41;
public final class j1 implements Utilities.Callback {
    public final int f6529a;
    public final p2 f6530b;

    public j1(p2 p2Var, int i9) {
        this.f6529a = i9;
        this.f6530b = p2Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f6529a) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                p2 p2Var = this.f6530b;
                if (p2Var.f6692o0 != intValue) {
                    p2Var.f6692o0 = intValue;
                    p2Var.f6685g0.g();
                    p2Var.U.N(true);
                    return;
                }
                return;
            default:
                List list = (List) obj;
                p2 p2Var2 = this.f6530b;
                if (p2Var2.getContext() != null && p2Var2.isShown()) {
                    ArrayList b10 = bg.u0.b(1, list);
                    p2Var2.V = b10;
                    List c10 = bg.u0.c(b10);
                    p2Var2.V = c10;
                    if (!((ArrayList) c10).isEmpty()) {
                        p2Var2.V();
                        z41 z41Var = p2Var2.U;
                        if (z41Var != null) {
                            z41Var.N(true);
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
