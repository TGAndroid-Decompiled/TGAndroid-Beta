package ai;

import org.telegram.messenger.Utilities;
public final class h3 implements Utilities.Callback {
    public final int f1415a;
    public final l7 f1416b;
    public final Long f1417c;
    public final ug.m1[] d;

    public h3(l7 l7Var, Long l4, ug.m1[] m1VarArr, int i10) {
        this.f1415a = i10;
        this.f1416b = l7Var;
        this.f1417c = l4;
        this.d = m1VarArr;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f1415a) {
            case 0:
                pf.c cVar = (pf.c) obj;
                cVar.d();
                long longValue = this.f1417c.longValue();
                l7 l7Var = this.f1416b;
                l7Var.Q1(longValue, new a4(l7Var, cVar, this.d, 0));
                return;
            default:
                l7 l7Var2 = this.f1416b;
                l7Var2.getClass();
                l7Var2.P1(this.f1417c.longValue(), null, (pf.c) obj, this.d[0]);
                return;
        }
    }
}
