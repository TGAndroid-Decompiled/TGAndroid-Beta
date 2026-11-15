package bi;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.z10;
import org.telegram.ui.Components.p41;
public final class n1 implements z10 {
    public final int f3726a;
    public final s2 f3727b;

    public n1(s2 s2Var, int i7) {
        this.f3726a = i7;
        this.f3727b = s2Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f3726a) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                s2 s2Var = this.f3727b;
                if (s2Var.f3857n2 != intValue) {
                    s2Var.f3857n2 = intValue;
                    s2Var.f3849f2.g();
                    s2Var.U1.O(true);
                    return;
                }
                return;
            default:
                List list = (List) obj;
                s2 s2Var2 = this.f3727b;
                if (s2Var2.getContext() != null && !s2Var2.J) {
                    ArrayList b10 = wg.q.b(1, list);
                    s2Var2.V1 = b10;
                    List c10 = wg.q.c(b10);
                    s2Var2.V1 = c10;
                    if (!((ArrayList) c10).isEmpty()) {
                        s2Var2.f1();
                        p41 p41Var = s2Var2.U1;
                        if (p41Var != null) {
                            p41Var.O(true);
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
