package defpackage;

import java.util.ArrayList;
import java.util.List;
public final class zu4 implements p8c {
    public final byte a;
    public final tv4 b;

    public zu4(tv4 tv4Var, byte b) {
        this.a = b;
        this.b = tv4Var;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        tv4 tv4Var = this.b;
        switch (b) {
            case 0:
                tv4Var.u2.setTitleMinSideInset(gl.L(6.0f) + ((Integer) obj).intValue());
                return;
            default:
                List list = (List) obj;
                if (tv4Var.getContext() != null && !tv4Var.J) {
                    ArrayList c = on0.c(1, list);
                    tv4Var.U1 = c;
                    List d = on0.d(c);
                    tv4Var.U1 = d;
                    if (!((ArrayList) d).isEmpty()) {
                        tv4Var.b1();
                        l5c l5cVar = tv4Var.T1;
                        if (l5cVar != null) {
                            l5cVar.O(true);
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
