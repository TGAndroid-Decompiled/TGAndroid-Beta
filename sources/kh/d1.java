package kh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.w51;
public final class d1 implements Utilities.Callback {
    public final int f10644a;
    public final g2 f10645b;

    public d1(g2 g2Var, int i10) {
        this.f10644a = i10;
        this.f10645b = g2Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f10644a) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                g2 g2Var = this.f10645b;
                if (g2Var.f10747p0 != intValue) {
                    g2Var.f10747p0 = intValue;
                    g2Var.f10740h0.g();
                    g2Var.V.N(true);
                    return;
                }
                return;
            default:
                List list = (List) obj;
                g2 g2Var2 = this.f10645b;
                if (g2Var2.getContext() != null && g2Var2.isShown()) {
                    ArrayList b10 = gg.p0.b(1, list);
                    g2Var2.W = b10;
                    List c3 = gg.p0.c(b10);
                    g2Var2.W = c3;
                    if (!((ArrayList) c3).isEmpty()) {
                        g2Var2.W();
                        w51 w51Var = g2Var2.V;
                        if (w51Var != null) {
                            w51Var.N(true);
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
