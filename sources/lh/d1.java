package lh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.x51;
public final class d1 implements Utilities.Callback {
    public final int f12661a;
    public final g2 f12662b;

    public d1(g2 g2Var, int i10) {
        this.f12661a = i10;
        this.f12662b = g2Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f12661a) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                g2 g2Var = this.f12662b;
                if (g2Var.f12773p0 != intValue) {
                    g2Var.f12773p0 = intValue;
                    g2Var.f12766h0.g();
                    g2Var.V.N(true);
                    return;
                }
                return;
            default:
                List list = (List) obj;
                g2 g2Var2 = this.f12662b;
                if (g2Var2.getContext() != null && g2Var2.isShown()) {
                    ArrayList b10 = hg.p0.b(1, list);
                    g2Var2.W = b10;
                    List c3 = hg.p0.c(b10);
                    g2Var2.W = c3;
                    if (!((ArrayList) c3).isEmpty()) {
                        g2Var2.W();
                        x51 x51Var = g2Var2.V;
                        if (x51Var != null) {
                            x51Var.N(true);
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
