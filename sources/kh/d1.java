package kh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.w51;
public final class d1 implements Utilities.Callback {
    public final int f10525a;
    public final h2 f10526b;

    public d1(h2 h2Var, int i10) {
        this.f10525a = i10;
        this.f10526b = h2Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f10525a) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                h2 h2Var = this.f10526b;
                if (h2Var.f10654p0 != intValue) {
                    h2Var.f10654p0 = intValue;
                    h2Var.f10647h0.g();
                    h2Var.V.N(true);
                    return;
                }
                return;
            default:
                List list = (List) obj;
                h2 h2Var2 = this.f10526b;
                if (h2Var2.getContext() != null && h2Var2.isShown()) {
                    ArrayList b10 = gg.p0.b(1, list);
                    h2Var2.W = b10;
                    List c3 = gg.p0.c(b10);
                    h2Var2.W = c3;
                    if (!((ArrayList) c3).isEmpty()) {
                        h2Var2.W();
                        w51 w51Var = h2Var2.V;
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
