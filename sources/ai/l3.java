package ai;

import org.telegram.messenger.Utilities;
public final class l3 implements Utilities.Callback {
    public final int f1758a;
    public final k7 f1759b;
    public final Long f1760c;
    public final ug.m1[] d;

    public l3(k7 k7Var, Long l4, ug.m1[] m1VarArr, int i10) {
        this.f1758a = i10;
        this.f1759b = k7Var;
        this.f1760c = l4;
        this.d = m1VarArr;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f1758a) {
            case 0:
                pf.c cVar = (pf.c) obj;
                cVar.d();
                long longValue = this.f1760c.longValue();
                k7 k7Var = this.f1759b;
                k7Var.J1(longValue, new y3(k7Var, cVar, this.d, 0));
                return;
            default:
                k7 k7Var2 = this.f1759b;
                k7Var2.getClass();
                k7Var2.I1(this.f1760c.longValue(), null, (pf.c) obj, this.d[0]);
                return;
        }
    }
}
