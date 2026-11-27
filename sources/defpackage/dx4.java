package defpackage;

import java.util.ArrayList;
import java.util.List;
public final class dx4 implements pcc {
    public final byte a;
    public final yx4 b;

    public dx4(yx4 yx4Var, byte b) {
        this.a = b;
        this.b = yx4Var;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        yx4 yx4Var = this.b;
        switch (b) {
            case 0:
                yx4Var.u2.setTitleMinSideInset(hl.L(6.0f) + ((Integer) obj).intValue());
                return;
            default:
                List list = (List) obj;
                if (yx4Var.getContext() != null && !yx4Var.J) {
                    ArrayList c = on0.c(1, list);
                    yx4Var.U1 = c;
                    List d = on0.d(c);
                    yx4Var.U1 = d;
                    if (!((ArrayList) d).isEmpty()) {
                        yx4Var.c1();
                        l9c l9cVar = yx4Var.T1;
                        if (l9cVar != null) {
                            l9cVar.O(true);
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
