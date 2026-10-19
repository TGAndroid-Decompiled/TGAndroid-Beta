package ai;

import org.telegram.messenger.Utilities;
public final class f3 implements Utilities.Callback {
    public final int f1273a;
    public final k7 f1274b;
    public final Long f1275c;
    public final ug.m1[] d;

    public f3(k7 k7Var, Long l4, ug.m1[] m1VarArr, int i10) {
        this.f1273a = i10;
        this.f1274b = k7Var;
        this.f1275c = l4;
        this.d = m1VarArr;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f1273a) {
            case 0:
                k7 k7Var = this.f1274b;
                k7Var.getClass();
                k7Var.P1(this.f1275c.longValue(), null, (pf.c) obj, this.d[0]);
                return;
            default:
                pf.c cVar = (pf.c) obj;
                cVar.d();
                long longValue = this.f1275c.longValue();
                k7 k7Var2 = this.f1274b;
                k7Var2.Q1(longValue, new v3(k7Var2, cVar, this.d, 0));
                return;
        }
    }
}
